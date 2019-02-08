package com.rimaz.grpc.server;

import com.rimaz.inventory.Inventory;
import com.rimaz.inventory.InventoryRequest;
import com.rimaz.inventory.InventoryResponse;
import com.rimaz.inventory.InventoryServiceGrpc;
import io.grpc.stub.StreamObserver;

public class ShopperServiceImpl extends InventoryServiceGrpc.InventoryServiceImplBase {


    @Override
    public void inventoryUnary(InventoryRequest request, StreamObserver<InventoryResponse> responseObserver) {
        int flightId = request.getFlightId();
        responseObserver.onNext(InventoryResponse.newBuilder().setAllocation(201).build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<InventoryRequest> inventoryClientStream(StreamObserver<InventoryResponse> responseObserver) {

        StreamObserver<InventoryRequest> requestStreamObserver = new StreamObserver<InventoryRequest>() {

            String result ="";
            @Override
            public void onNext(InventoryRequest value) {
                System.out.println("Client sends a message");
                result += value.getFlightId() + " Receieved, ";
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Client sends an error" + t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Client sends done");
                InventoryResponse inventoryResponse = InventoryResponse.newBuilder()
                        .setAllocation(1000)
                        .setResult(result)
                        .build();
                responseObserver.onNext(inventoryResponse);

                responseObserver.onCompleted();
            }
        };

        return requestStreamObserver;
    }

    @Override
    public void inventoryServerStream(InventoryRequest request, StreamObserver<InventoryResponse> responseObserver) {
       int flightId = request.getFlightId();

       responseObserver.onNext(InventoryResponse.newBuilder().setAllocation(490).setResult("Server Stream").build());
       responseObserver.onCompleted();
    }
}
