package grpc.ex1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: ConnectSix.proto")
public final class ConnectSixServiceGrpc {

  private ConnectSixServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.ex1.ConnectSixService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.ex1.ConnectClientResponse> METHOD_CONNECT_CLIENT =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, grpc.ex1.ConnectClientResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.ex1.ConnectSixService", "connect_client"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.ex1.ConnectClientResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.ex1.GetFieldResponse> METHOD_GET_FIELD =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, grpc.ex1.GetFieldResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.ex1.ConnectSixService", "get_field"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.ex1.GetFieldResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.ex1.PlayerMoveRequest,
      grpc.ex1.PlayerMoveResponse> METHOD_PLAYER_MOVE =
      io.grpc.MethodDescriptor.<grpc.ex1.PlayerMoveRequest, grpc.ex1.PlayerMoveResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.ex1.ConnectSixService", "player_move"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.ex1.PlayerMoveRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.ex1.PlayerMoveResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.ex1.GetTurnResponse> METHOD_GET_TURN =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, grpc.ex1.GetTurnResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.ex1.ConnectSixService", "get_turn"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.ex1.GetTurnResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectSixServiceStub newStub(io.grpc.Channel channel) {
    return new ConnectSixServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectSixServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConnectSixServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectSixServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConnectSixServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ConnectSixServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void connectClient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.ex1.ConnectClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONNECT_CLIENT, responseObserver);
    }

    /**
     */
    public void getField(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.ex1.GetFieldResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FIELD, responseObserver);
    }

    /**
     */
    public void playerMove(grpc.ex1.PlayerMoveRequest request,
        io.grpc.stub.StreamObserver<grpc.ex1.PlayerMoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PLAYER_MOVE, responseObserver);
    }

    /**
     */
    public void getTurn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.ex1.GetTurnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TURN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CONNECT_CLIENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                grpc.ex1.ConnectClientResponse>(
                  this, METHODID_CONNECT_CLIENT)))
          .addMethod(
            METHOD_GET_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                grpc.ex1.GetFieldResponse>(
                  this, METHODID_GET_FIELD)))
          .addMethod(
            METHOD_PLAYER_MOVE,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ex1.PlayerMoveRequest,
                grpc.ex1.PlayerMoveResponse>(
                  this, METHODID_PLAYER_MOVE)))
          .addMethod(
            METHOD_GET_TURN,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                grpc.ex1.GetTurnResponse>(
                  this, METHODID_GET_TURN)))
          .build();
    }
  }

  /**
   */
  public static final class ConnectSixServiceStub extends io.grpc.stub.AbstractStub<ConnectSixServiceStub> {
    private ConnectSixServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnectSixServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectSixServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnectSixServiceStub(channel, callOptions);
    }

    /**
     */
    public void connectClient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.ex1.ConnectClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONNECT_CLIENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getField(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.ex1.GetFieldResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playerMove(grpc.ex1.PlayerMoveRequest request,
        io.grpc.stub.StreamObserver<grpc.ex1.PlayerMoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PLAYER_MOVE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTurn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.ex1.GetTurnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TURN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConnectSixServiceBlockingStub extends io.grpc.stub.AbstractStub<ConnectSixServiceBlockingStub> {
    private ConnectSixServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnectSixServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectSixServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnectSixServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.ex1.ConnectClientResponse connectClient(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONNECT_CLIENT, getCallOptions(), request);
    }

    /**
     */
    public grpc.ex1.GetFieldResponse getField(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FIELD, getCallOptions(), request);
    }

    /**
     */
    public grpc.ex1.PlayerMoveResponse playerMove(grpc.ex1.PlayerMoveRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PLAYER_MOVE, getCallOptions(), request);
    }

    /**
     */
    public grpc.ex1.GetTurnResponse getTurn(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TURN, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConnectSixServiceFutureStub extends io.grpc.stub.AbstractStub<ConnectSixServiceFutureStub> {
    private ConnectSixServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnectSixServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectSixServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnectSixServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ex1.ConnectClientResponse> connectClient(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONNECT_CLIENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ex1.GetFieldResponse> getField(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FIELD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ex1.PlayerMoveResponse> playerMove(
        grpc.ex1.PlayerMoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PLAYER_MOVE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ex1.GetTurnResponse> getTurn(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TURN, getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECT_CLIENT = 0;
  private static final int METHODID_GET_FIELD = 1;
  private static final int METHODID_PLAYER_MOVE = 2;
  private static final int METHODID_GET_TURN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectSixServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectSixServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT_CLIENT:
          serviceImpl.connectClient((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.ex1.ConnectClientResponse>) responseObserver);
          break;
        case METHODID_GET_FIELD:
          serviceImpl.getField((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.ex1.GetFieldResponse>) responseObserver);
          break;
        case METHODID_PLAYER_MOVE:
          serviceImpl.playerMove((grpc.ex1.PlayerMoveRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ex1.PlayerMoveResponse>) responseObserver);
          break;
        case METHODID_GET_TURN:
          serviceImpl.getTurn((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.ex1.GetTurnResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ConnectSixServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ex1.ConnectSixProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConnectSixServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectSixServiceDescriptorSupplier())
              .addMethod(METHOD_CONNECT_CLIENT)
              .addMethod(METHOD_GET_FIELD)
              .addMethod(METHOD_PLAYER_MOVE)
              .addMethod(METHOD_GET_TURN)
              .build();
        }
      }
    }
    return result;
  }
}
