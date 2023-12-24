package grpc;

import grpc.ex1.*;
import io.grpc.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ConnectSixClient {
    public static void main(String[] args) {
        ConnectSixServiceGrpc.ConnectSixServiceBlockingStub client = createClient("localhost",8080);
        System.out.println("Connected to server");
    }
    private static ConnectSixServiceGrpc.ConnectSixServiceBlockingStub createClient(String host, int port){
        Channel channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext()
                .build();
        return ConnectSixServiceGrpc.newBlockingStub(channel);
    }
}
