package com.rimaz.grpc.client;

import com.rimaz.inventory.InventoryRequest;
import com.rimaz.inventory.InventoryResponse;
import com.rimaz.inventory.InventoryServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 1. Unary
 * 2. Client Stream
 * 3. Server Stream
 */
public class ClientShopper {

    public static void main(String[] args) {
        ClientShopper clientShopper = new ClientShopper();
        clientShopper.run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        doUnary(channel);
        doClientStreaming(channel);
        doServerStreaming(channel);
        channel.shutdown();
    }


    private void doUnary(ManagedChannel channel) {

        System.out.println("************ Unary ******************");

        InventoryServiceGrpc.InventoryServiceBlockingStub blockingStub = InventoryServiceGrpc.newBlockingStub(channel);
        System.out.println("Doing unary call");
        InventoryResponse inventoryResponse = blockingStub.inventoryUnary(InventoryRequest.newBuilder().setFlightId(100).build());
        System.out.println("Response from Unary allocation=" + inventoryResponse.getAllocation() + ", result " + inventoryResponse.getResult());

    }

    private void doClientStreaming(ManagedChannel channel) {

        System.out.println("************ Client Streaming ******************");

        try {
            CountDownLatch latch = new CountDownLatch(1);

            InventoryServiceGrpc.InventoryServiceStub asynStub = InventoryServiceGrpc.newStub(channel);

            StreamObserver<InventoryRequest> requestObserver = asynStub.inventoryClientStream(new StreamObserver<InventoryResponse>() {
                @Override
                public void onNext(InventoryResponse value) {
                    System.out.println("Client Received a response" + value.getAllocation() + "Result=" + value.getResult());
                }

                @Override
                public void onError(Throwable t) {

                    System.out.println("Client Received an error" + t);
                }

                @Override
                public void onCompleted() {
                    latch.countDown();
                    System.out.println("Client Received a DONE");
                }
            });

            System.out.println("Sending message 1");
            requestObserver.onNext(InventoryRequest.newBuilder().setFlightId(100).build());

            System.out.println("Sending message 2");
            requestObserver.onNext(InventoryRequest.newBuilder().setFlightId(200).build());

            System.out.println("Sending message 3");
            requestObserver.onNext(InventoryRequest.newBuilder().setFlightId(300).build());

            requestObserver.onCompleted();


            latch.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void doServerStreaming(ManagedChannel channel) {
        System.out.println("************ Server Streaming ******************");
        InventoryServiceGrpc.InventoryServiceBlockingStub stub = InventoryServiceGrpc.newBlockingStub(channel);
        stub.inventoryServerStream(InventoryRequest.newBuilder().setFlightId(560).build()).forEachRemaining(inventoryResponse -> {
            System.out.println("Response Received at client: Allocation=" + inventoryResponse.getAllocation() + ", Result=" + inventoryResponse.getResult());
        });

    }
}
