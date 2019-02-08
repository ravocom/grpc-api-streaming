package com.rimaz.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ShopperServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50053)
                .addService(new ShopperServiceImpl())
                .build();
        server.start();
        System.out.println("Server started");

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Shutdown hook called- start");
           server.shutdown();
            System.out.println("Shutdown hook called- end");
        }));

        server.awaitTermination();
        System.out.println("server awaits termination");
    }
}
