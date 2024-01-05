// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConnectSix.proto

package grpc.ex1;

/**
 * Protobuf type {@code grpc.ex1.GetTurnNumResponse}
 */
public  final class GetTurnNumResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.ex1.GetTurnNumResponse)
    GetTurnNumResponseOrBuilder {
  // Use GetTurnNumResponse.newBuilder() to construct.
  private GetTurnNumResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTurnNumResponse() {
    turnNum_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetTurnNumResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            turnNum_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetTurnNumResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetTurnNumResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.ex1.GetTurnNumResponse.class, grpc.ex1.GetTurnNumResponse.Builder.class);
  }

  public static final int TURN_NUM_FIELD_NUMBER = 1;
  private int turnNum_;
  /**
   * <code>int32 turn_num = 1;</code>
   */
  public int getTurnNum() {
    return turnNum_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (turnNum_ != 0) {
      output.writeInt32(1, turnNum_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (turnNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, turnNum_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.ex1.GetTurnNumResponse)) {
      return super.equals(obj);
    }
    grpc.ex1.GetTurnNumResponse other = (grpc.ex1.GetTurnNumResponse) obj;

    boolean result = true;
    result = result && (getTurnNum()
        == other.getTurnNum());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TURN_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getTurnNum();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.ex1.GetTurnNumResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ex1.GetTurnNumResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.ex1.GetTurnNumResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ex1.GetTurnNumResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.ex1.GetTurnNumResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.ex1.GetTurnNumResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.ex1.GetTurnNumResponse)
      grpc.ex1.GetTurnNumResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetTurnNumResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetTurnNumResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.ex1.GetTurnNumResponse.class, grpc.ex1.GetTurnNumResponse.Builder.class);
    }

    // Construct using grpc.ex1.GetTurnNumResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      turnNum_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetTurnNumResponse_descriptor;
    }

    public grpc.ex1.GetTurnNumResponse getDefaultInstanceForType() {
      return grpc.ex1.GetTurnNumResponse.getDefaultInstance();
    }

    public grpc.ex1.GetTurnNumResponse build() {
      grpc.ex1.GetTurnNumResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public grpc.ex1.GetTurnNumResponse buildPartial() {
      grpc.ex1.GetTurnNumResponse result = new grpc.ex1.GetTurnNumResponse(this);
      result.turnNum_ = turnNum_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.ex1.GetTurnNumResponse) {
        return mergeFrom((grpc.ex1.GetTurnNumResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.ex1.GetTurnNumResponse other) {
      if (other == grpc.ex1.GetTurnNumResponse.getDefaultInstance()) return this;
      if (other.getTurnNum() != 0) {
        setTurnNum(other.getTurnNum());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.ex1.GetTurnNumResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.ex1.GetTurnNumResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int turnNum_ ;
    /**
     * <code>int32 turn_num = 1;</code>
     */
    public int getTurnNum() {
      return turnNum_;
    }
    /**
     * <code>int32 turn_num = 1;</code>
     */
    public Builder setTurnNum(int value) {
      
      turnNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 turn_num = 1;</code>
     */
    public Builder clearTurnNum() {
      
      turnNum_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.ex1.GetTurnNumResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.ex1.GetTurnNumResponse)
  private static final grpc.ex1.GetTurnNumResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.ex1.GetTurnNumResponse();
  }

  public static grpc.ex1.GetTurnNumResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTurnNumResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTurnNumResponse>() {
    public GetTurnNumResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetTurnNumResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTurnNumResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTurnNumResponse> getParserForType() {
    return PARSER;
  }

  public grpc.ex1.GetTurnNumResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
