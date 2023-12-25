package grpc;

import com.google.protobuf.Empty;
import grpc.ex1.*;
import io.grpc.*;

import javax.annotation.security.RunAs;
import java.rmi.RemoteException;
import java.util.*;

public class ConnectSixClient implements Runnable {
    static int[] localBoard;

    static int playerNum = 0;
    static int turn = 0;
    static final int boardSize = 19;
    int id;

    static Random rand = new Random();

    ConnectSixServiceGrpc.ConnectSixServiceBlockingStub stub;


    public static void main(String[] args) {
        ConnectSixClient player1 = new ConnectSixClient();
        ConnectSixClient player2 = new ConnectSixClient();
        new Thread(player1).start();
        new Thread(player2).start();
    }

    static void getField(ConnectSixServiceGrpc.ConnectSixServiceBlockingStub client) {
        GetTurnResponse response_turn = client.getTurn(Empty.newBuilder().build());
//        GetFieldResponse response = client.getField(Empty.newBuilder().build());
//        List<Integer> fieldList = response.getFieldList();
//        localBoard = fieldList.stream().mapToInt(i->i).toArray();
        turn = response_turn.getTurn();
        System.out.println("update turn: " + turn);
    }


    public void connect(String host, int port) {
        Channel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        stub = ConnectSixServiceGrpc.newBlockingStub(channel);
        Empty request_empty = Empty.newBuilder().build();
        ConnectClientResponse response_connect = stub.connectClient(request_empty);
        id = response_connect.getId();
        if (id == 0) throw new RuntimeException();
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

    @Override
    public void run() {
        connect("localhost", 8080);
        System.out.println("Id is " + id);
        int num[] = new int[2];

        while (true) {
            if (playerNum == turn) {
                num[0] = rand.nextInt(boardSize+1);
                num[1] = rand.nextInt(boardSize+1);

                if (turn == 1 && playerNum == 1 && num[0] != 9 && num[1] != 9) continue;
                PlayerMoveRequest request = PlayerMoveRequest.newBuilder().setX(num[0]).setY(num[1]).build();
                PlayerMoveResponse response =  stub.playerMove(request);
                if (response.getWin() > 0){
                    return;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
