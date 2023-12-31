package grpc;

import com.google.protobuf.Empty;
import grpc.ex1.ConnectSixServiceGrpc;
import grpc.ex1.ConnectClientResponse;
import grpc.ex1.ConnectSixProto;
import grpc.ex1.PlayerMoveRequest;
import grpc.ex1.PlayerMoveResponse;
import grpc.ex1.GetFieldResponse;
import grpc.ex1.GetTurnResponse;
import grpc.ex1.GetTurnNumResponse;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.*;

import java.rmi.RemoteException;

public class ConnectSixServer extends ConnectSixServiceGrpc.ConnectSixServiceImplBase {
    int currentPlayer = 0;
    int players = 0;
    int turn = 1;
    int turnNum = 1;
    int boardSize = 19;
    int[] board = new int[boardSize*boardSize];


    @Override
    public void connectClient(com.google.protobuf.Empty request,
                             io.grpc.stub.StreamObserver<grpc.ex1.ConnectClientResponse> responseObserver) {
        int id;
        if (players >= 2) {
            id = 0;
        }
        players++;
        id = players;

        ConnectClientResponse statusResponse = ConnectClientResponse.newBuilder().setId(id).build();
        responseObserver.onNext(statusResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getField(com.google.protobuf.Empty request,
                              io.grpc.stub.StreamObserver<grpc.ex1.GetFieldResponse> responseObserver) {

        GetFieldResponse statusResponse = GetFieldResponse.newBuilder()
                        .addAllField(Arrays.stream(board).boxed().toList())
                        .build();
        responseObserver.onNext(statusResponse);
        responseObserver.onCompleted();
    }


    @Override
    public void playerMove(PlayerMoveRequest request,
                           io.grpc.stub.StreamObserver<grpc.ex1.PlayerMoveResponse> responseObserver) {
        int i = request.getX();
        int j = request.getY();

        if (turn < 0) {
            PlayerMoveResponse response = PlayerMoveResponse.newBuilder().setWin(-turn).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        if (board[boardSize * i + j] != 1 && board[boardSize * i + j] != 2) {
            if (turn == 1) {
                board[boardSize * i + j] = 1;
            } else {
                board[boardSize * i + j] = 2;
            }
            if (this.turn == 1) {
                this.turn = 2;
            } else {
                this.turn = 1;
            }
            this.turnNum += 1;
            checkWin();
            PlayerMoveResponse response = PlayerMoveResponse.newBuilder().setWin(turn).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else{
            PlayerMoveResponse response = PlayerMoveResponse.newBuilder().setWin(0).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getTurn(com.google.protobuf.Empty request,
                        io.grpc.stub.StreamObserver<grpc.ex1.GetTurnResponse> responseObserver) {
        GetTurnResponse statusResponse = GetTurnResponse.newBuilder().setTurn(turn).build();
        responseObserver.onNext(statusResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getTurnNum(com.google.protobuf.Empty request,
                        io.grpc.stub.StreamObserver<grpc.ex1.GetTurnNumResponse> responseObserver) {
        GetTurnNumResponse statusResponse = GetTurnNumResponse.newBuilder().setTurnNum(turnNum).build();
        responseObserver.onNext(statusResponse);
        responseObserver.onCompleted();
    }
    int winCount = 6;

    void checkDiagOne() {
        int rowStart = boardSize - winCount - 1;
        while (rowStart >= 0) {
            int countX = 0, countO = 0;
            int row = rowStart, col = 0;
            while (row < boardSize && col < boardSize) {
                switch (board[row * boardSize + col]) {
                    case 1 -> {
                        countX++;
                        if (countX >= winCount) {
                            turn = -1;
                            return;
                        }
                    }
                    default -> countX = 0;
                }
                switch (board[row * boardSize + col]) {
                    case 2 -> {
                        countO++;
                        if (countO >= winCount) {
                            turn = -2;
                            return;
                        }
                    }
                    default -> countO = 0;
                }
                row++;
                col++;
            }
            rowStart--;
        }
    }

    void checkDiagTwo() {
        int colStart = boardSize - winCount - 1;
        while (colStart >= 1) {
            int countX = 0, countO = 0;
            int row = 0, col = colStart;
            while (row < boardSize && col < boardSize) {
                switch (board[row * boardSize + col]) {
                    case 1 -> {
                        countX++;
                        if (countX >= winCount) {
                            turn = -1;
                            return;
                        }
                    }
                    default -> countX = 0;
                }
                switch (board[row * boardSize + col]) {
                    case 2 -> {
                        countO++;
                        if (countO >= winCount) {
                            turn = -2;
                            return;
                        }
                    }
                    default -> countO = 0;
                }
                row++;
                col++;
            }
            colStart--;
        }
    }

    void checkGrid() {
        int i = boardSize - 1;
        while (i >= 0) {
            int colX = 0, colO = 0;
            {
                int j = boardSize - 1;
                while (j >= 0) {
                    switch (board[i * boardSize + j]) {
                        case 1 -> {
                            colX++;
                            if (colX >= winCount) {
                                turn = -1;
                                return;
                            }
                        }
                        default -> colX = 0;
                    }
                    switch (board[i * boardSize + j]) {
                        case 2 -> {
                            colO++;
                            if (colO >= winCount) {
                                turn = -2;
                                return;
                            }
                        }
                        default -> colO = 0;
                    }
                    j--;
                }
            }

            int rowX = 0, rowO = 0;
            int j = boardSize - 1;
            while (j >= 0) {
                switch (board[j * boardSize + i]) {
                    case 1 -> {
                        rowX++;
                        if (rowX >= winCount) {
                            turn = -1;
                            return;
                        }
                    }
                    default -> rowX = 0;
                }
                switch (board[j * boardSize + i]) {
                    case 2 -> {
                        rowO++;
                        if (rowO >= winCount) {
                            turn = -2;
                            return;
                        }
                    }
                    default -> rowO = 0;
                }
                j--;
            }
            i--;
        }
    }
    void checkWin() {
        checkDiagOne();
        checkDiagTwo();
        checkGrid();
    }
    public static void main(String[] args)  throws IOException, InterruptedException{
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new ConnectSixServer()).build();
        server.start();
        System.out.println("server started");
        server.awaitTermination();
    }
}
