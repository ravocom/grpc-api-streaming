package com.rimaz.grpc.client;

import com.rimaz.inventory.InventoryRequest;
import com.rimaz.inventory.InventoryResponse;
import com.rimaz.inventory.InventoryServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
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
        doBidectionalStreaming(channel);
        channel.shutdown();
    }

    private void doUnary(ManagedChannel channel) {

        System.out.println("************ Unary ******************");

        InventoryServiceGrpc.InventoryServiceBlockingStub blockingStub = InventoryServiceGrpc.newBlockingStub(channel);
        int flightId=100;
        System.out.println("Request sent from Client- Unary - FlightId=" + flightId);
        InventoryResponse inventoryResponse = blockingStub.inventoryUnary(InventoryRequest.newBuilder().setFlightId(flightId).build());
        System.out.println("Response from Server- Unary - allocation=" + inventoryResponse.getAllocation() + ", result " + inventoryResponse.getResult());

    }

    private void doClientStreaming(ManagedChannel channel) {

        System.out.println("************ Client Streaming ******************");

        try {
            CountDownLatch latch = new CountDownLatch(1);

            InventoryServiceGrpc.InventoryServiceStub asynStub = InventoryServiceGrpc.newStub(channel);

            StreamObserver<InventoryRequest> requestObserver = asynStub.inventoryClientStream(new StreamObserver<InventoryResponse>() {
                @Override
                public void onNext(InventoryResponse value) {
                    System.out.println("Response from Server- ClientStreaming" + value.getAllocation() + "Result=" + value.getResult());
                }

                @Override
                public void onError(Throwable t) {

                    System.out.println("Response from Server- " + t);
                }

                @Override
                public void onCompleted() {
                    latch.countDown();
                    System.out.println("Response from Server-Completed ");
                }
            });

            System.out.println("Request sent from Client- ClientStreaming - FlightId=" + 100);
            requestObserver.onNext(InventoryRequest.newBuilder().setFlightId(100).build());

            System.out.println("Request sent from Client- ClientStreaming - FlightId=" + 200);
            requestObserver.onNext(InventoryRequest.newBuilder().setFlightId(200).build());

            System.out.println("Request sent from Client- ClientStreaming - FlightId=" + 300);
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

        System.out.println("Request sent from Client- ServerStreaming - FlightId=" + 560);
        stub.inventoryServerStream(InventoryRequest.newBuilder().setFlightId(560).build()).forEachRemaining(inventoryResponse -> {
            System.out.println("Response Received from Server- ServerStreaming: Allocation=" + inventoryResponse.getAllocation() + ", Result=" + inventoryResponse.getResult());
        });

    }


    private void doBidectionalStreaming(ManagedChannel channel) {
        InventoryServiceGrpc.InventoryServiceStub asynStub = InventoryServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        System.out.println("************ Bidrectional Streaming ******************");

        StreamObserver<InventoryRequest> inventoryRequests=   asynStub.inventoryBidirectionalStream(new StreamObserver<InventoryResponse>() {
            @Override
            public void onNext(InventoryResponse value) {
                System.out.println("Response received from the server:  Bidirectional" + value.getResult() + ", Allocation=" + value.getAllocation());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
                System.out.println("Error on receiving the response from the server" + t);
            }

            @Override
            public void onCompleted() {
                latch.countDown();
                System.out.println("Server has concluded sending responses");
            }
        });

        Arrays.asList(120, 213,234,23,23423,234234,23423,234).forEach(flightId -> {
            System.out.println("Request sent from Client- Bidirectional Streaming - FlightId=" + flightId);
            inventoryRequests.onNext(InventoryRequest.newBuilder().setFlightId(flightId).build());
        });

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
