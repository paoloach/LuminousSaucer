// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTReadDescriptorRequest}
 */
public final class BluetoothGATTReadDescriptorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTReadDescriptorRequest)
    BluetoothGATTReadDescriptorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BluetoothGATTReadDescriptorRequest.newBuilder() to construct.
  private BluetoothGATTReadDescriptorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BluetoothGATTReadDescriptorRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BluetoothGATTReadDescriptorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTReadDescriptorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTReadDescriptorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.class, it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private long address_ = 0L;
  /**
   * <code>uint64 address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public long getAddress() {
    return address_;
  }

  public static final int HANDLE_FIELD_NUMBER = 2;
  private int handle_ = 0;
  /**
   * <code>uint32 handle = 2;</code>
   * @return The handle.
   */
  @java.lang.Override
  public int getHandle() {
    return handle_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (address_ != 0L) {
      output.writeUInt64(1, address_);
    }
    if (handle_ != 0) {
      output.writeUInt32(2, handle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (address_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, address_);
    }
    if (handle_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, handle_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest)) {
      return super.equals(obj);
    }
    it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest other = (it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest) obj;

    if (getAddress()
        != other.getAddress()) return false;
    if (getHandle()
        != other.getHandle()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAddress());
    hash = (37 * hash) + HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getHandle();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTReadDescriptorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTReadDescriptorRequest)
      it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTReadDescriptorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTReadDescriptorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.class, it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.Builder.class);
    }

    // Construct using it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      address_ = 0L;
      handle_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTReadDescriptorRequest_descriptor;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest getDefaultInstanceForType() {
      return it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest build() {
      it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest buildPartial() {
      it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest result = new it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.handle_ = handle_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest) {
        return mergeFrom((it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest other) {
      if (other == it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest.getDefaultInstance()) return this;
      if (other.getAddress() != 0L) {
        setAddress(other.getAddress());
      }
      if (other.getHandle() != 0) {
        setHandle(other.getHandle());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              address_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              handle_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long address_ ;
    /**
     * <code>uint64 address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public long getAddress() {
      return address_;
    }
    /**
     * <code>uint64 address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(long value) {
      
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      bitField0_ = (bitField0_ & ~0x00000001);
      address_ = 0L;
      onChanged();
      return this;
    }

    private int handle_ ;
    /**
     * <code>uint32 handle = 2;</code>
     * @return The handle.
     */
    @java.lang.Override
    public int getHandle() {
      return handle_;
    }
    /**
     * <code>uint32 handle = 2;</code>
     * @param value The handle to set.
     * @return This builder for chaining.
     */
    public Builder setHandle(int value) {
      
      handle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 handle = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHandle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      handle_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTReadDescriptorRequest)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTReadDescriptorRequest)
  private static final it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest();
  }

  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BluetoothGATTReadDescriptorRequest>
      PARSER = new com.google.protobuf.AbstractParser<BluetoothGATTReadDescriptorRequest>() {
    @java.lang.Override
    public BluetoothGATTReadDescriptorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BluetoothGATTReadDescriptorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BluetoothGATTReadDescriptorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadDescriptorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

