// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse}
 */
public final class MediaPlayerStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)
    MediaPlayerStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaPlayerStateResponse.newBuilder() to construct.
  private MediaPlayerStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaPlayerStateResponse() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaPlayerStateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_MediaPlayerStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_MediaPlayerStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.class, it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.Builder.class);
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
  private int state_ = 0;
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
   * @return The state.
   */
  @java.lang.Override public it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState getState() {
    it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState result = it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState.forNumber(state_);
    return result == null ? it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState.UNRECOGNIZED : result;
  }

  public static final int VOLUME_FIELD_NUMBER = 3;
  private float volume_ = 0F;
  /**
   * <code>float volume = 3;</code>
   * @return The volume.
   */
  @java.lang.Override
  public float getVolume() {
    return volume_;
  }

  public static final int MUTED_FIELD_NUMBER = 4;
  private boolean muted_ = false;
  /**
   * <code>bool muted = 4;</code>
   * @return The muted.
   */
  @java.lang.Override
  public boolean getMuted() {
    return muted_;
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
    if (state_ != it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState.MEDIA_PLAYER_STATE_NONE.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (java.lang.Float.floatToRawIntBits(volume_) != 0) {
      output.writeFloat(3, volume_);
    }
    if (muted_ != false) {
      output.writeBool(4, muted_);
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
    if (state_ != it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState.MEDIA_PLAYER_STATE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
    }
    if (java.lang.Float.floatToRawIntBits(volume_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, volume_);
    }
    if (muted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, muted_);
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
    if (!(obj instanceof it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)) {
      return super.equals(obj);
    }
    it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse other = (it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse) obj;

    if (getKey()
        != other.getKey()) return false;
    if (state_ != other.state_) return false;
    if (java.lang.Float.floatToIntBits(getVolume())
        != java.lang.Float.floatToIntBits(
            other.getVolume())) return false;
    if (getMuted()
        != other.getMuted()) return false;
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
    hash = (53 * hash) + state_;
    hash = (37 * hash) + VOLUME_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getVolume());
    hash = (37 * hash) + MUTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMuted());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse parseFrom(
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
  public static Builder newBuilder(it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse prototype) {
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)
      it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_MediaPlayerStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_MediaPlayerStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.class, it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.Builder.class);
    }

    // Construct using it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.newBuilder()
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
      state_ = 0;
      volume_ = 0F;
      muted_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.sottovasoluminoso.protobuf.java.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_MediaPlayerStateResponse_descriptor;
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse getDefaultInstanceForType() {
      return it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse build() {
      it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse buildPartial() {
      it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse result = new it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.volume_ = volume_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.muted_ = muted_;
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
      if (other instanceof it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse) {
        return mergeFrom((it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse other) {
      if (other == it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse.getDefaultInstance()) return this;
      if (other.getKey() != 0) {
        setKey(other.getKey());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getVolume() != 0F) {
        setVolume(other.getVolume());
      }
      if (other.getMuted() != false) {
        setMuted(other.getMuted());
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
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 29: {
              volume_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 32: {
              muted_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private int state_ = 0;
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
     * @return The state.
     */
    @java.lang.Override
    public it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState getState() {
      it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState result = it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState.forNumber(state_);
      return result == null ? it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState.UNRECOGNIZED : result;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      onChanged();
      return this;
    }

    private float volume_ ;
    /**
     * <code>float volume = 3;</code>
     * @return The volume.
     */
    @java.lang.Override
    public float getVolume() {
      return volume_;
    }
    /**
     * <code>float volume = 3;</code>
     * @param value The volume to set.
     * @return This builder for chaining.
     */
    public Builder setVolume(float value) {
      
      volume_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>float volume = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolume() {
      bitField0_ = (bitField0_ & ~0x00000004);
      volume_ = 0F;
      onChanged();
      return this;
    }

    private boolean muted_ ;
    /**
     * <code>bool muted = 4;</code>
     * @return The muted.
     */
    @java.lang.Override
    public boolean getMuted() {
      return muted_;
    }
    /**
     * <code>bool muted = 4;</code>
     * @param value The muted to set.
     * @return This builder for chaining.
     */
    public Builder setMuted(boolean value) {
      
      muted_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool muted = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMuted() {
      bitField0_ = (bitField0_ & ~0x00000008);
      muted_ = false;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)
  private static final it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse();
  }

  public static it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaPlayerStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<MediaPlayerStateResponse>() {
    @java.lang.Override
    public MediaPlayerStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MediaPlayerStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaPlayerStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

