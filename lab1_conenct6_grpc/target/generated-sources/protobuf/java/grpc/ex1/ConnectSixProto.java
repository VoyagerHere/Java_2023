// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConnectSix.proto

package grpc.ex1;

public final class ConnectSixProto {
  private ConnectSixProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_ConnectClientResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_ConnectClientResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_GetFieldResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_GetFieldResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_PlayerMoveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_PlayerMoveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_PlayerMoveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_PlayerMoveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_ex1_GetTurnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_ex1_GetTurnRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ConnectSix.proto\022\010grpc.ex1\032\033google/pro" +
      "tobuf/empty.proto\"#\n\025ConnectClientRespon" +
      "se\022\n\n\002id\030\001 \001(\005\"!\n\020GetFieldResponse\022\r\n\005fi" +
      "eld\030\001 \001(\005\")\n\021PlayerMoveRequest\022\t\n\001x\030\001 \001(" +
      "\005\022\t\n\001y\030\002 \001(\005\"#\n\022PlayerMoveResponse\022\r\n\005er" +
      "ror\030\001 \001(\005\"\036\n\016GetTurnRequest\022\014\n\004turn\030\001 \001(" +
      "\0052\247\002\n\021ConnectSixService\022I\n\016connect_clien" +
      "t\022\026.google.protobuf.Empty\032\037.grpc.ex1.Con" +
      "nectClientResponse\022?\n\tget_field\022\026.google" +
      ".protobuf.Empty\032\032.grpc.ex1.GetFieldRespo",
      "nse\022H\n\013player_move\022\033.grpc.ex1.PlayerMove" +
      "Request\032\034.grpc.ex1.PlayerMoveResponse\022<\n" +
      "\010get_turn\022\026.google.protobuf.Empty\032\030.grpc" +
      ".ex1.GetTurnRequestB\035\n\010grpc.ex1B\017Connect" +
      "SixProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_grpc_ex1_ConnectClientResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_ex1_ConnectClientResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_ConnectClientResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_grpc_ex1_GetFieldResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_ex1_GetFieldResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_GetFieldResponse_descriptor,
        new java.lang.String[] { "Field", });
    internal_static_grpc_ex1_PlayerMoveRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_ex1_PlayerMoveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_PlayerMoveRequest_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_grpc_ex1_PlayerMoveResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_ex1_PlayerMoveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_PlayerMoveResponse_descriptor,
        new java.lang.String[] { "Error", });
    internal_static_grpc_ex1_GetTurnRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_ex1_GetTurnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_ex1_GetTurnRequest_descriptor,
        new java.lang.String[] { "Turn", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
