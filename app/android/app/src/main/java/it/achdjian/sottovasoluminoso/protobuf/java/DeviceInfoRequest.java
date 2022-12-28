// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest}
 */
public final class DeviceInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest)
    DeviceInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceInfoRequest.newBuilder() to construct.
  private DeviceInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceInfoRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceInfoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_DeviceInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_DeviceInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.class, it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest)) {
      return super.equals(obj);
    }
    it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest other = (it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest parseFrom(
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
  public static Builder newBuilder(it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest prototype) {
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest)
      it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_DeviceInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_DeviceInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.class, it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.Builder.class);
    }

    // Construct using it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_DeviceInfoRequest_descriptor;
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest getDefaultInstanceForType() {
      return it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest build() {
      it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest buildPartial() {
      it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest result = new it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest(this);
      onBuilt();
      return result;
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
      if (other instanceof it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest) {
        return mergeFrom((it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest other) {
      if (other == it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest)
  private static final it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest();
  }

  public static it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeviceInfoRequest>() {
    @java.lang.Override
    public DeviceInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.sottovasoluminoso.protobuf.java.DeviceInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

