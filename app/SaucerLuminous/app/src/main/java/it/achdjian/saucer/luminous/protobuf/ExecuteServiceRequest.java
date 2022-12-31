// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceRequest}
 */
public final class ExecuteServiceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceRequest)
    ExecuteServiceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteServiceRequest.newBuilder() to construct.
  private ExecuteServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteServiceRequest() {
    args_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecuteServiceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ExecuteServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ExecuteServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.class, it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.Builder.class);
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

  public static final int ARGS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument> args_;
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
   */
  @java.lang.Override
  public java.util.List<it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument> getArgsList() {
    return args_;
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder> 
      getArgsOrBuilderList() {
    return args_;
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
   */
  @java.lang.Override
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
   */
  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
   */
  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder getArgsOrBuilder(
      int index) {
    return args_.get(index);
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
    for (int i = 0; i < args_.size(); i++) {
      output.writeMessage(2, args_.get(i));
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
    for (int i = 0; i < args_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, args_.get(i));
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
    if (!(obj instanceof it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest)) {
      return super.equals(obj);
    }
    it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest other = (it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest) obj;

    if (getKey()
        != other.getKey()) return false;
    if (!getArgsList()
        .equals(other.getArgsList())) return false;
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
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest parseFrom(
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
  public static Builder newBuilder(it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest prototype) {
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceRequest)
      it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ExecuteServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ExecuteServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.class, it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.Builder.class);
    }

    // Construct using it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.newBuilder()
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
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
      } else {
        args_ = null;
        argsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ExecuteServiceRequest_descriptor;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest getDefaultInstanceForType() {
      return it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest build() {
      it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest buildPartial() {
      it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest result = new it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest result) {
      if (argsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          args_ = java.util.Collections.unmodifiableList(args_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.args_ = args_;
      } else {
        result.args_ = argsBuilder_.build();
      }
    }

    private void buildPartial0(it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
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
      if (other instanceof it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest) {
        return mergeFrom((it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest other) {
      if (other == it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest.getDefaultInstance()) return this;
      if (other.getKey() != 0) {
        setKey(other.getKey());
      }
      if (argsBuilder_ == null) {
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
      } else {
        if (!other.args_.isEmpty()) {
          if (argsBuilder_.isEmpty()) {
            argsBuilder_.dispose();
            argsBuilder_ = null;
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000002);
            argsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgsFieldBuilder() : null;
          } else {
            argsBuilder_.addAllMessages(other.args_);
          }
        }
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
            case 18: {
              it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument m =
                  input.readMessage(
                      it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.parser(),
                      extensionRegistry);
              if (argsBuilder_ == null) {
                ensureArgsIsMutable();
                args_.add(m);
              } else {
                argsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.util.List<it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument> args_ =
      java.util.Collections.emptyList();
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        args_ = new java.util.ArrayList<it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument>(args_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder> argsBuilder_;

    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public java.util.List<it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument> getArgsList() {
      if (argsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(args_);
      } else {
        return argsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public int getArgsCount() {
      if (argsBuilder_ == null) {
        return args_.size();
      } else {
        return argsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument getArgs(int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);
      } else {
        return argsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder setArgs(
        int index, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
      } else {
        argsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder setArgs(
        int index, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.set(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder addArgs(it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(value);
        onChanged();
      } else {
        argsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder addArgs(
        int index, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(index, value);
        onChanged();
      } else {
        argsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder addArgs(
        it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder addArgs(
        int index, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder addAllArgs(
        java.lang.Iterable<? extends it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument> values) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
      } else {
        argsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder clearArgs() {
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        argsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public Builder removeArgs(int index) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.remove(index);
        onChanged();
      } else {
        argsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder getArgsBuilder(
        int index) {
      return getArgsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder getArgsOrBuilder(
        int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);  } else {
        return argsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public java.util.List<? extends it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder> 
         getArgsOrBuilderList() {
      if (argsBuilder_ != null) {
        return argsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(args_);
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder addArgsBuilder() {
      return getArgsFieldBuilder().addBuilder(
          it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.getDefaultInstance());
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder addArgsBuilder(
        int index) {
      return getArgsFieldBuilder().addBuilder(
          index, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.getDefaultInstance());
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceArgument args = 2;</code>
     */
    public java.util.List<it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder> 
         getArgsBuilderList() {
      return getArgsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder> 
        getArgsFieldBuilder() {
      if (argsBuilder_ == null) {
        argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder, it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentOrBuilder>(
                args_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        args_ = null;
      }
      return argsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.ExecuteServiceRequest)
  private static final it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest();
  }

  public static it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteServiceRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteServiceRequest>() {
    @java.lang.Override
    public ExecuteServiceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExecuteServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.ExecuteServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

