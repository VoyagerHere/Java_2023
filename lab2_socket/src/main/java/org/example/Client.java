package org.example;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static Integer boardSize = 0;
    private static Integer currentTurn = 1;
    private static Integer id = 0;

    private static List<Integer> nums = new ArrayList<>();


    public static void printBoard(List<Integer> board) {
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
                s += board.get(boardSize * i + j) + "  ";
            }
            System.out.println(s);
        }
    }

    public static void printWin() {
        if (currentTurn == -1){
            System.out.println("Error in turn");
            System.out.println("Game is stoped");
        }
        if (currentTurn == -2){
            System.out.println("Win player - " + (-currentTurn));
        }
        if (currentTurn == -1){
            System.out.println("Win player - " + (-currentTurn));
        }
        if (currentTurn == -2){
            System.out.println("Win player - " + (-currentTurn));
        }
    }

    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 4004);
                reader = new BufferedReader(new InputStreamReader(System.in));

                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

                Data data = null;

                boardSize = (Integer) in.readObject();
                System.out.println(boardSize);
                data = (Data) in.readObject();
                id = data.turn;
                System.out.println("Game started");
                System.out.println(data.board);
                printBoard(data.board);
                System.out.println("Done receiving on " + id);
                while (currentTurn != (-1) && currentTurn != (-2)) {
                    if (currentTurn.equals(id)) {
                        System.out.println(currentTurn + " " + id);
                        String[] word = reader.readLine().split(" ");
                        for(String s : word) nums.add(Integer.valueOf(s));
                        System.out.println(nums);
                        out.writeObject(new Point(nums.get(0), nums.get(1)));
                        out.flush();
                        nums.clear();
                    }
                    data = (Data) in.readObject();
                    currentTurn = data.turn;
                    printBoard(data.board);
                    if (currentTurn == 0) {
                        break;
                    }
                    System.out.println("currentTurn changed to " + currentTurn);
                }
                printWin();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}