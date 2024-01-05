// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConnectSix.proto

package grpc.ex1;

/**
 * Protobuf type {@code grpc.ex1.GetFieldResponse}
 */
public  final class GetFieldResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.ex1.GetFieldResponse)
    GetFieldResponseOrBuilder {
  // Use GetFieldResponse.newBuilder() to construct.
  private GetFieldResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFieldResponse() {
    field_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetFieldResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              field_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            field_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              field_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              field_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        field_ = java.util.Collections.unmodifiableList(field_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetFieldResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetFieldResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.ex1.GetFieldResponse.class, grpc.ex1.GetFieldResponse.Builder.class);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> field_;
  /**
   * <code>repeated int32 field = 1 [packed = true];</code>
   */
  public java.util.List<java.lang.Integer>
      getFieldList() {
    return field_;
  }
  /**
   * <code>repeated int32 field = 1 [packed = true];</code>
   */
  public int getFieldCount() {
    return field_.size();
  }
  /**
   * <code>repeated int32 field = 1 [packed = true];</code>
   */
  public int getField(int index) {
    return field_.get(index);
  }
  private int fieldMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getFieldList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(fieldMemoizedSerializedSize);
    }
    for (int i = 0; i < field_.size(); i++) {
      output.writeInt32NoTag(field_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < field_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(field_.get(i));
      }
      size += dataSize;
      if (!getFieldList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fieldMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof grpc.ex1.GetFieldResponse)) {
      return super.equals(obj);
    }
    grpc.ex1.GetFieldResponse other = (grpc.ex1.GetFieldResponse) obj;

    boolean result = true;
    result = result && getFieldList()
        .equals(other.getFieldList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFieldCount() > 0) {
      hash = (37 * hash) + FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getFieldList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.ex1.GetFieldResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ex1.GetFieldResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.ex1.GetFieldResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ex1.GetFieldResponse parseFrom(
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
  public static Builder newBuilder(grpc.ex1.GetFieldResponse prototype) {
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
   * Protobuf type {@code grpc.ex1.GetFieldResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.ex1.GetFieldResponse)
      grpc.ex1.GetFieldResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetFieldResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetFieldResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.ex1.GetFieldResponse.class, grpc.ex1.GetFieldResponse.Builder.class);
    }

    // Construct using grpc.ex1.GetFieldResponse.newBuilder()
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
      field_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.ex1.ConnectSixProto.internal_static_grpc_ex1_GetFieldResponse_descriptor;
    }

    public grpc.ex1.GetFieldResponse getDefaultInstanceForType() {
      return grpc.ex1.GetFieldResponse.getDefaultInstance();
    }

    public grpc.ex1.GetFieldResponse build() {
      grpc.ex1.GetFieldResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public grpc.ex1.GetFieldResponse buildPartial() {
      grpc.ex1.GetFieldResponse result = new grpc.ex1.GetFieldResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        field_ = java.util.Collections.unmodifiableList(field_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.field_ = field_;
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
      if (other instanceof grpc.ex1.GetFieldResponse) {
        return mergeFrom((grpc.ex1.GetFieldResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.ex1.GetFieldResponse other) {
      if (other == grpc.ex1.GetFieldResponse.getDefaultInstance()) return this;
      if (!other.field_.isEmpty()) {
        if (field_.isEmpty()) {
          field_ = other.field_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldIsMutable();
          field_.addAll(other.field_);
        }
        onChanged();
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
      grpc.ex1.GetFieldResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.ex1.GetFieldResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> field_ = java.util.Collections.emptyList();
    private void ensureFieldIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        field_ = new java.util.ArrayList<java.lang.Integer>(field_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getFieldList() {
      return java.util.Collections.unmodifiableList(field_);
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public int getFieldCount() {
      return field_.size();
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public int getField(int index) {
      return field_.get(index);
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public Builder setField(
        int index, int value) {
      ensureFieldIsMutable();
      field_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public Builder addField(int value) {
      ensureFieldIsMutable();
      field_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public Builder addAllField(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFieldIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, field_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 field = 1 [packed = true];</code>
     */
    public Builder clearField() {
      field_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:grpc.ex1.GetFieldResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.ex1.GetFieldResponse)
  private static final grpc.ex1.GetFieldResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.ex1.GetFieldResponse();
  }

  public static grpc.ex1.GetFieldResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFieldResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFieldResponse>() {
    public GetFieldResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetFieldResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetFieldResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFieldResponse> getParserForType() {
    return PARSER;
  }

  public grpc.ex1.GetFieldResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
