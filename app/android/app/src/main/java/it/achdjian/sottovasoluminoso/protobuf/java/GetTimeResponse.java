// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse}
 */
public final class GetTimeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse)
    GetTimeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTimeResponse.newBuilder() to construct.
  private GetTimeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTimeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTimeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_GetTimeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_GetTimeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.class, it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.Builder.class);
  }

  public static final int EPOCH_SECONDS_FIELD_NUMBER = 1;
  private int epochSeconds_ = 0;
  /**
   * <code>fixed32 epoch_seconds = 1;</code>
   * @return The epochSeconds.
   */
  @java.lang.Override
  public int getEpochSeconds() {
    return epochSeconds_;
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
    if (epochSeconds_ != 0) {
      output.writeFixed32(1, epochSeconds_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epochSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed32Size(1, epochSeconds_);
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
    if (!(obj instanceof it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse)) {
      return super.equals(obj);
    }
    it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse other = (it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse) obj;

    if (getEpochSeconds()
        != other.getEpochSeconds()) return false;
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
    hash = (37 * hash) + EPOCH_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getEpochSeconds();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse parseFrom(
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
  public static Builder newBuilder(it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse prototype) {
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse)
      it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_GetTimeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_GetTimeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.class, it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.Builder.class);
    }

    // Construct using it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.newBuilder()
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
      epochSeconds_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_GetTimeResponse_descriptor;
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse getDefaultInstanceForType() {
      return it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse build() {
      it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse buildPartial() {
      it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse result = new it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.epochSeconds_ = epochSeconds_;
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
      if (other instanceof it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse) {
        return mergeFrom((it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse other) {
      if (other == it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse.getDefaultInstance()) return this;
      if (other.getEpochSeconds() != 0) {
        setEpochSeconds(other.getEpochSeconds());
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
            case 13: {
              epochSeconds_ = input.readFixed32();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
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

    private int epochSeconds_ ;
    /**
     * <code>fixed32 epoch_seconds = 1;</code>
     * @return The epochSeconds.
     */
    @java.lang.Override
    public int getEpochSeconds() {
      return epochSeconds_;
    }
    /**
     * <code>fixed32 epoch_seconds = 1;</code>
     * @param value The epochSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setEpochSeconds(int value) {
      
      epochSeconds_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>fixed32 epoch_seconds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpochSeconds() {
      bitField0_ = (bitField0_ & ~0x00000001);
      epochSeconds_ = 0;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse)
  private static final it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse();
  }

  public static it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTimeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTimeResponse>() {
    @java.lang.Override
    public GetTimeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTimeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTimeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.sottovasoluminoso.protobuf.java.GetTimeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

