// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.NumberStateResponse}
 */
public final class NumberStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.NumberStateResponse)
    NumberStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NumberStateResponse.newBuilder() to construct.
  private NumberStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NumberStateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NumberStateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_NumberStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_NumberStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.saucer.luminous.protobuf.NumberStateResponse.class, it.achdjian.saucer.luminous.protobuf.NumberStateResponse.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private int key_ = 0;
  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public int getKey() {
    return key_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private float state_ = 0F;
  /**
   * <code>float state = 2;</code>
   * @return The state.
   */
  @java.lang.Override
  public float getState() {
    return state_;
  }

  public static final int MISSING_STATE_FIELD_NUMBER = 3;
  private boolean missingState_ = false;
  /**
   * <pre>
   * If the number does not have a valid state yet.
   * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
   * </pre>
   *
   * <code>bool missing_state = 3;</code>
   * @return The missingState.
   */
  @java.lang.Override
  public boolean getMissingState() {
    return missingState_;
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
    if (key_ != 0) {
      output.writeFixed32(1, key_);
    }
    if (java.lang.Float.floatToRawIntBits(state_) != 0) {
      output.writeFloat(2, state_);
    }
    if (missingState_ != false) {
      output.writeBool(3, missingState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed32Size(1, key_);
    }
    if (java.lang.Float.floatToRawIntBits(state_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, state_);
    }
    if (missingState_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, missingState_);
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
    if (!(obj instanceof it.achdjian.saucer.luminous.protobuf.NumberStateResponse)) {
      return super.equals(obj);
    }
    it.achdjian.saucer.luminous.protobuf.NumberStateResponse other = (it.achdjian.saucer.luminous.protobuf.NumberStateResponse) obj;

    if (getKey()
        != other.getKey()) return false;
    if (java.lang.Float.floatToIntBits(getState())
        != java.lang.Float.floatToIntBits(
            other.getState())) return false;
    if (getMissingState()
        != other.getMissingState()) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getState());
    hash = (37 * hash) + MISSING_STATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMissingState());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse parseFrom(
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
  public static Builder newBuilder(it.achdjian.saucer.luminous.protobuf.NumberStateResponse prototype) {
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.NumberStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.NumberStateResponse)
      it.achdjian.saucer.luminous.protobuf.NumberStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_NumberStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_NumberStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.saucer.luminous.protobuf.NumberStateResponse.class, it.achdjian.saucer.luminous.protobuf.NumberStateResponse.Builder.class);
    }

    // Construct using it.achdjian.saucer.luminous.protobuf.NumberStateResponse.newBuilder()
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
      key_ = 0;
      state_ = 0F;
      missingState_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_NumberStateResponse_descriptor;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.NumberStateResponse getDefaultInstanceForType() {
      return it.achdjian.saucer.luminous.protobuf.NumberStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.NumberStateResponse build() {
      it.achdjian.saucer.luminous.protobuf.NumberStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.NumberStateResponse buildPartial() {
      it.achdjian.saucer.luminous.protobuf.NumberStateResponse result = new it.achdjian.saucer.luminous.protobuf.NumberStateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(it.achdjian.saucer.luminous.protobuf.NumberStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.missingState_ = missingState_;
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
      if (other instanceof it.achdjian.saucer.luminous.protobuf.NumberStateResponse) {
        return mergeFrom((it.achdjian.saucer.luminous.protobuf.NumberStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.saucer.luminous.protobuf.NumberStateResponse other) {
      if (other == it.achdjian.saucer.luminous.protobuf.NumberStateResponse.getDefaultInstance()) return this;
      if (other.getKey() != 0) {
        setKey(other.getKey());
      }
      if (other.getState() != 0F) {
        setState(other.getState());
      }
      if (other.getMissingState() != false) {
        setMissingState(other.getMissingState());
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
              key_ = input.readFixed32();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
            case 21: {
              state_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 24: {
              missingState_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int key_ ;
    /**
     * <code>fixed32 key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
    }
    /**
     * <code>fixed32 key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(int value) {
      
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>fixed32 key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = 0;
      onChanged();
      return this;
    }

    private float state_ ;
    /**
     * <code>float state = 2;</code>
     * @return The state.
     */
    @java.lang.Override
    public float getState() {
      return state_;
    }
    /**
     * <code>float state = 2;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(float value) {
      
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>float state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0F;
      onChanged();
      return this;
    }

    private boolean missingState_ ;
    /**
     * <pre>
     * If the number does not have a valid state yet.
     * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
     * </pre>
     *
     * <code>bool missing_state = 3;</code>
     * @return The missingState.
     */
    @java.lang.Override
    public boolean getMissingState() {
      return missingState_;
    }
    /**
     * <pre>
     * If the number does not have a valid state yet.
     * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
     * </pre>
     *
     * <code>bool missing_state = 3;</code>
     * @param value The missingState to set.
     * @return This builder for chaining.
     */
    public Builder setMissingState(boolean value) {
      
      missingState_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the number does not have a valid state yet.
     * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
     * </pre>
     *
     * <code>bool missing_state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMissingState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      missingState_ = false;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.NumberStateResponse)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.NumberStateResponse)
  private static final it.achdjian.saucer.luminous.protobuf.NumberStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.saucer.luminous.protobuf.NumberStateResponse();
  }

  public static it.achdjian.saucer.luminous.protobuf.NumberStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NumberStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<NumberStateResponse>() {
    @java.lang.Override
    public NumberStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<NumberStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumberStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.NumberStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

