package com.rimaz.inventory;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: inventory/inventory.proto")
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "inventory.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest,
      com.rimaz.inventory.InventoryResponse> getInventoryUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryUnary",
      requestType = com.rimaz.inventory.InventoryRequest.class,
      responseType = com.rimaz.inventory.InventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest,
      com.rimaz.inventory.InventoryResponse> getInventoryUnaryMethod() {
    io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest, com.rimaz.inventory.InventoryResponse> getInventoryUnaryMethod;
    if ((getInventoryUnaryMethod = InventoryServiceGrpc.getInventoryUnaryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getInventoryUnaryMethod = InventoryServiceGrpc.getInventoryUnaryMethod) == null) {
          InventoryServiceGrpc.getInventoryUnaryMethod = getInventoryUnaryMethod = 
              io.grpc.MethodDescriptor.<com.rimaz.inventory.InventoryRequest, com.rimaz.inventory.InventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.InventoryService", "InventoryUnary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.inventory.InventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.inventory.InventoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("InventoryUnary"))
                  .build();
          }
        }
     }
     return getInventoryUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest,
      com.rimaz.inventory.InventoryResponse> getInventoryClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryClientStream",
      requestType = com.rimaz.inventory.InventoryRequest.class,
      responseType = com.rimaz.inventory.InventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest,
      com.rimaz.inventory.InventoryResponse> getInventoryClientStreamMethod() {
    io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest, com.rimaz.inventory.InventoryResponse> getInventoryClientStreamMethod;
    if ((getInventoryClientStreamMethod = InventoryServiceGrpc.getInventoryClientStreamMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getInventoryClientStreamMethod = InventoryServiceGrpc.getInventoryClientStreamMethod) == null) {
          InventoryServiceGrpc.getInventoryClientStreamMethod = getInventoryClientStreamMethod = 
              io.grpc.MethodDescriptor.<com.rimaz.inventory.InventoryRequest, com.rimaz.inventory.InventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "inventory.InventoryService", "InventoryClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.inventory.InventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.inventory.InventoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("InventoryClientStream"))
                  .build();
          }
        }
     }
     return getInventoryClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest,
      com.rimaz.inventory.InventoryResponse> getInventoryServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryServerStream",
      requestType = com.rimaz.inventory.InventoryRequest.class,
      responseType = com.rimaz.inventory.InventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest,
      com.rimaz.inventory.InventoryResponse> getInventoryServerStreamMethod() {
    io.grpc.MethodDescriptor<com.rimaz.inventory.InventoryRequest, com.rimaz.inventory.InventoryResponse> getInventoryServerStreamMethod;
    if ((getInventoryServerStreamMethod = InventoryServiceGrpc.getInventoryServerStreamMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getInventoryServerStreamMethod = InventoryServiceGrpc.getInventoryServerStreamMethod) == null) {
          InventoryServiceGrpc.getInventoryServerStreamMethod = getInventoryServerStreamMethod = 
              io.grpc.MethodDescriptor.<com.rimaz.inventory.InventoryRequest, com.rimaz.inventory.InventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "inventory.InventoryService", "InventoryServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.inventory.InventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.inventory.InventoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("InventoryServerStream"))
                  .build();
          }
        }
     }
     return getInventoryServerStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    return new InventoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void inventoryUnary(com.rimaz.inventory.InventoryRequest request,
        io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInventoryUnaryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryRequest> inventoryClientStream(
        io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getInventoryClientStreamMethod(), responseObserver);
    }

    /**
     */
    public void inventoryServerStream(com.rimaz.inventory.InventoryRequest request,
        io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInventoryServerStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInventoryUnaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rimaz.inventory.InventoryRequest,
                com.rimaz.inventory.InventoryResponse>(
                  this, METHODID_INVENTORY_UNARY)))
          .addMethod(
            getInventoryClientStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.rimaz.inventory.InventoryRequest,
                com.rimaz.inventory.InventoryResponse>(
                  this, METHODID_INVENTORY_CLIENT_STREAM)))
          .addMethod(
            getInventoryServerStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.rimaz.inventory.InventoryRequest,
                com.rimaz.inventory.InventoryResponse>(
                  this, METHODID_INVENTORY_SERVER_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryServiceStub extends io.grpc.stub.AbstractStub<InventoryServiceStub> {
    private InventoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void inventoryUnary(com.rimaz.inventory.InventoryRequest request,
        io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInventoryUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryRequest> inventoryClientStream(
        io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getInventoryClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void inventoryServerStream(com.rimaz.inventory.InventoryRequest request,
        io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getInventoryServerStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryServiceBlockingStub extends io.grpc.stub.AbstractStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rimaz.inventory.InventoryResponse inventoryUnary(com.rimaz.inventory.InventoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getInventoryUnaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.rimaz.inventory.InventoryResponse> inventoryServerStream(
        com.rimaz.inventory.InventoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getInventoryServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryServiceFutureStub extends io.grpc.stub.AbstractStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rimaz.inventory.InventoryResponse> inventoryUnary(
        com.rimaz.inventory.InventoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInventoryUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INVENTORY_UNARY = 0;
  private static final int METHODID_INVENTORY_SERVER_STREAM = 1;
  private static final int METHODID_INVENTORY_CLIENT_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INVENTORY_UNARY:
          serviceImpl.inventoryUnary((com.rimaz.inventory.InventoryRequest) request,
              (io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse>) responseObserver);
          break;
        case METHODID_INVENTORY_SERVER_STREAM:
          serviceImpl.inventoryServerStream((com.rimaz.inventory.InventoryRequest) request,
              (io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INVENTORY_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.inventoryClientStream(
              (io.grpc.stub.StreamObserver<com.rimaz.inventory.InventoryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rimaz.inventory.Inventory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getInventoryUnaryMethod())
              .addMethod(getInventoryClientStreamMethod())
              .addMethod(getInventoryServerStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
