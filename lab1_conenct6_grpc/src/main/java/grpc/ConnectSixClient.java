package grpc;

import com.google.protobuf.Empty;
import grpc.ex1.*;
import io.grpc.*;

import java.rmi.RemoteException;
import java.util.*;

public class ConnectSixClient {
    static int[] localBoard;

    static int playerNum = 0;
    static int turn = 0;
    static final int boardSize = 19;
    static int id;


    static void getField(ConnectSixServiceGrpc.ConnectSixServiceBlockingStub client) {
        GetTurnResponse response_turn = client.getTurn(Empty.newBuilder().build());
        GetFieldResponse response = client.getField(Empty.newBuilder().build());
        List<Integer> fieldList = response.getFieldList();
        localBoard = fieldList.stream().mapToInt(i->i).toArray();
        turn = response_turn.getTurn();
        System.out.println("update turn: " + turn);
        printBoard(localBoard);
    }

    public static void main(String[] args) {
        ConnectSixServiceGrpc.ConnectSixServiceBlockingStub client = createClient("localhost",8080);
        System.out.println("Connected to server");


        Empty request = Empty.newBuilder().build();
        ConnectClientResponse response = client.connectClient(request);
        id = response.getId();
        if (id == 0) throw new RuntimeException();

        try {
            getField(client);
        } catch (RuntimeException e) {
            System.err.println("Failed to get board: " + e.getMessage());
        }
        Thread updateThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    getField(client);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (isWin()) {
                        break;
                    }
                }
            }
        });
        updateThread.start();

        Thread gameThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner myObj = new Scanner(System.in);
                int num[] = new int[2];
                String[] Num;

                while (true) {
                    if (playerNum == turn) {
                        Num = myObj.nextLine().split(" ");

                        for (int i = 0; i < Num.length; i++) {
                            num[i] = Integer.parseInt(Num[i]);
                        }

                        if (turn == 1 && playerNum == 1 && num[0] != 9 && num[1] != 9) continue;
                        PlayerMoveRequest request = PlayerMoveRequest.newBuilder().setX(num[0]).setY(num[1]).build();
                        PlayerMoveResponse response =  client.playerMove(request);
                        if (response.getError() == 1){
                            System.err.println("Incorrect turn");
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });
    }

    private static ConnectSixServiceGrpc.ConnectSixServiceBlockingStub createClient(String host, int port) {
        Channel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        return ConnectSixServiceGrpc.newBlockingStub(channel);
    }
    public static void printBoard(int[] board) {
        String a = "";
        a += "    ";
        for (int i = 0; i < boardSize; i++) {
            if (i > 9) {
                a += i + " ";
            } else {
                a += i + "  ";
            }
        }
        System.out.println(a);
        for (int i = 0; i < boardSize; i++) {
            String s = "  ";
            if (i > 9) {
                s += i + "  ";
            } else {
                s += i + "   ";
            }

            for (int j = 0; j < boardSize; j++) {
                s += board[boardSize * i + j] + "  ";
            }
            System.out.println(s);
        }
    }

    static Boolean isWin() {
        return turn == -1 || turn == -2;
    }
}
