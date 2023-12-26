package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static List<ObjectOutputStream> outs = new ArrayList<>();
    private static List<Integer> board = new ArrayList<>();
    private static final Integer boardSize = 19;
    private static Integer turn = 1;

    private static int turnNum = 1;

    private static Integer winCount = 6; // Game rules variable

    private static int getIndex(int x, int y) {
        if (x == 0 && y == 0) return -1;
        return (x) * 10 + y;
    }

    public static void checkDiagOne() {
        int rowStart = boardSize - winCount - 1;
        while (rowStart >= 0) {
            int countX = 0, countO = 0;
            int row = rowStart, col = 0;
            while (row < boardSize && col < boardSize) {
                switch (board.get(getIndex(row, col))) {
                    case 1 -> {
                        countX++;
                        if (countX >= winCount) {
                            turn = -1;
                            return;
                        }
                    }
                    default -> countX = 0;
                }
                switch (board.get(getIndex(row, col))) {
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

    public static void checkDiagTwo() {
        int colStart = boardSize - winCount - 1;
        while (colStart >= 1) {
            int countX = 0, countO = 0;
            int row = 0, col = colStart;
            while (row < boardSize && col < boardSize) {
                switch (board.get(getIndex(row, col))) {
                    case 1 -> {
                        countX++;
                        if (countX >= winCount) {
                            turn = -1;
                            return;
                        }
                    }
                    default -> countX = 0;
                }
                switch (board.get(getIndex(row, col))) {
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

    public static void checkGrid() {
        int i = boardSize - 1;
        while (i >= 0) {
            int colX = 0, colO = 0;
            {
                int j = boardSize - 1;
                while (j >= 0) {
                    switch (board.get(getIndex(i, j))) {
                        case 1 -> {
                            colX++;
                            if (colX >= winCount) {
                                turn = -1;
                                return;
                            }
                        }
                        default -> colX = 0;
                    }
                    switch (board.get(getIndex(i, j))) {
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
                switch (board.get(getIndex(j, i))) {
                    case 1 -> {
                        rowX++;
                        if (rowX >= winCount) {
                            turn = -1;
                            return;
                        }
                    }
                    default -> rowX = 0;
                }
                switch (board.get(getIndex(j, i))) {
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
    public static void checkWin() {
        checkDiagOne();
        checkDiagTwo();
        checkGrid();
    }
    public static boolean playerMove(int i, int j) {

        if (turn < 0) {
            return false;
        }
        if ((board.get(getIndex(i, j)) != 1) && (board.get(getIndex(i, j)) != 2)) {
            if (turn == 1) {
                board.set(getIndex(i, j), 1);
            } else {
                board.set(getIndex(i, j), 2);
            }
//            turnNum += 1;
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        turn = 1;

        try {
            try {
                server = new ServerSocket(4004);
                System.out.println("Сервер запущен!");

                while((turn == -1) || (turn == -2)) {
                    clientSocket = server.accept();
                    try {
                        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                        ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

                        if (outs.size() == 2) clientSocket.close();
                        outs.add(out);
                        out.writeObject(outs.size());
                        out.writeObject(boardSize);
                        out.writeObject(board);
                        System.out.println("Done sending");

                        Thread thread = new Thread(() -> {
                            while (true) {
                                try {
                                    boolean move1 = true;
                                    boolean move2 = true;
                                    List<Integer> nums = (List<Integer>) in.readObject();

                                    if (turnNum == 1) { // First turn
                                        if (nums.size() == 4) {turn =0; break;}
                                        move1 = playerMove(nums.get(0), nums.get(1));
                                    }
                                    else{
                                        move1 = playerMove(nums.get(0), nums.get(1));
                                        move2 = playerMove(nums.get(2), nums.get(3));
                                    }
                                    if (turn == 1) {
                                        turn = 2;
                                    } else {
                                        turn = 1;
                                    }
                                    if (!move1 || !move2) {
                                        turn = 0;
                                    }
                                    turnNum++;
                                    checkWin();
                                    for (ObjectOutputStream stream : outs) {
                                        stream.writeObject(turn);
                                        stream.reset();
                                    }
                                    out.flush();
                                    if (turn < 1){break;}
                                } catch (IOException | ClassNotFoundException e) {
                                    e.printStackTrace();
                                    System.out.println("Client disconnected");
                                    outs.remove(out);
                                    break;
                                }
                            }
                        });
                        thread.start();
                    } finally {
                        // clientSocket.close();
                    }
                }
            } finally {
                System.out.println("Сервер завершил работу");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}