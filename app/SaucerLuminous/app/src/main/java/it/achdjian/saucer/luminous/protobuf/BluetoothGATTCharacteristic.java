// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTCharacteristic}
 */
public final class BluetoothGATTCharacteristic extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTCharacteristic)
    BluetoothGATTCharacteristicOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BluetoothGATTCharacteristic.newBuilder() to construct.
  private BluetoothGATTCharacteristic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BluetoothGATTCharacteristic() {
    uuid_ = emptyLongList();
    descriptors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BluetoothGATTCharacteristic();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTCharacteristic_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTCharacteristic_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.class, it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.Builder.class);
  }

  public static final int UUID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList uuid_;
  /**
   * <code>repeated uint64 uuid = 1;</code>
   * @return A list containing the uuid.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getUuidList() {
    return uuid_;
  }
  /**
   * <code>repeated uint64 uuid = 1;</code>
   * @return The count of uuid.
   */
  public int getUuidCount() {
    return uuid_.size();
  }
  /**
   * <code>repeated uint64 uuid = 1;</code>
   * @param index The index of the element to return.
   * @return The uuid at the given index.
   */
  public long getUuid(int index) {
    return uuid_.getLong(index);
  }
  private int uuidMemoizedSerializedSize = -1;

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

  public static final int PROPERTIES_FIELD_NUMBER = 3;
  private int properties_ = 0;
  /**
   * <code>uint32 properties = 3;</code>
   * @return The properties.
   */
  @java.lang.Override
  public int getProperties() {
    return properties_;
  }

  public static final int DESCRIPTORS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor> descriptors_;
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
   */
  @java.lang.Override
  public java.util.List<it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor> getDescriptorsList() {
    return descriptors_;
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder> 
      getDescriptorsOrBuilderList() {
    return descriptors_;
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
   */
  @java.lang.Override
  public int getDescriptorsCount() {
    return descriptors_.size();
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
   */
  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor getDescriptors(int index) {
    return descriptors_.get(index);
  }
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
   */
  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder getDescriptorsOrBuilder(
      int index) {
    return descriptors_.get(index);
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
    getSerializedSize();
    if (getUuidList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(uuidMemoizedSerializedSize);
    }
    for (int i = 0; i < uuid_.size(); i++) {
      output.writeUInt64NoTag(uuid_.getLong(i));
    }
    if (handle_ != 0) {
      output.writeUInt32(2, handle_);
    }
    if (properties_ != 0) {
      output.writeUInt32(3, properties_);
    }
    for (int i = 0; i < descriptors_.size(); i++) {
      output.writeMessage(4, descriptors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < uuid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(uuid_.getLong(i));
      }
      size += dataSize;
      if (!getUuidList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      uuidMemoizedSerializedSize = dataSize;
    }
    if (handle_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, handle_);
    }
    if (properties_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, properties_);
    }
    for (int i = 0; i < descriptors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, descriptors_.get(i));
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
    if (!(obj instanceof it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic)) {
      return super.equals(obj);
    }
    it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic other = (it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic) obj;

    if (!getUuidList()
        .equals(other.getUuidList())) return false;
    if (getHandle()
        != other.getHandle()) return false;
    if (getProperties()
        != other.getProperties()) return false;
    if (!getDescriptorsList()
        .equals(other.getDescriptorsList())) return false;
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
    if (getUuidCount() > 0) {
      hash = (37 * hash) + UUID_FIELD_NUMBER;
      hash = (53 * hash) + getUuidList().hashCode();
    }
    hash = (37 * hash) + HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getHandle();
    hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
    hash = (53 * hash) + getProperties();
    if (getDescriptorsCount() > 0) {
      hash = (37 * hash) + DESCRIPTORS_FIELD_NUMBER;
      hash = (53 * hash) + getDescriptorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic parseFrom(
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
  public static Builder newBuilder(it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic prototype) {
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
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTCharacteristic}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTCharacteristic)
      it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristicOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTCharacteristic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTCharacteristic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.class, it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.Builder.class);
    }

    // Construct using it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.newBuilder()
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
      uuid_ = emptyLongList();
      handle_ = 0;
      properties_ = 0;
      if (descriptorsBuilder_ == null) {
        descriptors_ = java.util.Collections.emptyList();
      } else {
        descriptors_ = null;
        descriptorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_BluetoothGATTCharacteristic_descriptor;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic getDefaultInstanceForType() {
      return it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic build() {
      it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic buildPartial() {
      it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic result = new it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        uuid_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.uuid_ = uuid_;
      if (descriptorsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          descriptors_ = java.util.Collections.unmodifiableList(descriptors_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.descriptors_ = descriptors_;
      } else {
        result.descriptors_ = descriptorsBuilder_.build();
      }
    }

    private void buildPartial0(it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.handle_ = handle_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.properties_ = properties_;
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
      if (other instanceof it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic) {
        return mergeFrom((it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic other) {
      if (other == it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic.getDefaultInstance()) return this;
      if (!other.uuid_.isEmpty()) {
        if (uuid_.isEmpty()) {
          uuid_ = other.uuid_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUuidIsMutable();
          uuid_.addAll(other.uuid_);
        }
        onChanged();
      }
      if (other.getHandle() != 0) {
        setHandle(other.getHandle());
      }
      if (other.getProperties() != 0) {
        setProperties(other.getProperties());
      }
      if (descriptorsBuilder_ == null) {
        if (!other.descriptors_.isEmpty()) {
          if (descriptors_.isEmpty()) {
            descriptors_ = other.descriptors_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureDescriptorsIsMutable();
            descriptors_.addAll(other.descriptors_);
          }
          onChanged();
        }
      } else {
        if (!other.descriptors_.isEmpty()) {
          if (descriptorsBuilder_.isEmpty()) {
            descriptorsBuilder_.dispose();
            descriptorsBuilder_ = null;
            descriptors_ = other.descriptors_;
            bitField0_ = (bitField0_ & ~0x00000008);
            descriptorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDescriptorsFieldBuilder() : null;
          } else {
            descriptorsBuilder_.addAllMessages(other.descriptors_);
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
            case 8: {
              long v = input.readUInt64();
              ensureUuidIsMutable();
              uuid_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureUuidIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                uuid_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              handle_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              properties_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor m =
                  input.readMessage(
                      it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.parser(),
                      extensionRegistry);
              if (descriptorsBuilder_ == null) {
                ensureDescriptorsIsMutable();
                descriptors_.add(m);
              } else {
                descriptorsBuilder_.addMessage(m);
              }
              break;
            } // case 34
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

    private com.google.protobuf.Internal.LongList uuid_ = emptyLongList();
    private void ensureUuidIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        uuid_ = mutableCopy(uuid_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @return A list containing the uuid.
     */
    public java.util.List<java.lang.Long>
        getUuidList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(uuid_) : uuid_;
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @return The count of uuid.
     */
    public int getUuidCount() {
      return uuid_.size();
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @param index The index of the element to return.
     * @return The uuid at the given index.
     */
    public long getUuid(int index) {
      return uuid_.getLong(index);
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @param index The index to set the value at.
     * @param value The uuid to set.
     * @return This builder for chaining.
     */
    public Builder setUuid(
        int index, long value) {
      
      ensureUuidIsMutable();
      uuid_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @param value The uuid to add.
     * @return This builder for chaining.
     */
    public Builder addUuid(long value) {
      
      ensureUuidIsMutable();
      uuid_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @param values The uuid to add.
     * @return This builder for chaining.
     */
    public Builder addAllUuid(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureUuidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, uuid_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUuid() {
      uuid_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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

    private int properties_ ;
    /**
     * <code>uint32 properties = 3;</code>
     * @return The properties.
     */
    @java.lang.Override
    public int getProperties() {
      return properties_;
    }
    /**
     * <code>uint32 properties = 3;</code>
     * @param value The properties to set.
     * @return This builder for chaining.
     */
    public Builder setProperties(int value) {
      
      properties_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 properties = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProperties() {
      bitField0_ = (bitField0_ & ~0x00000004);
      properties_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor> descriptors_ =
      java.util.Collections.emptyList();
    private void ensureDescriptorsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        descriptors_ = new java.util.ArrayList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor>(descriptors_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder> descriptorsBuilder_;

    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public java.util.List<it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor> getDescriptorsList() {
      if (descriptorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(descriptors_);
      } else {
        return descriptorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public int getDescriptorsCount() {
      if (descriptorsBuilder_ == null) {
        return descriptors_.size();
      } else {
        return descriptorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor getDescriptors(int index) {
      if (descriptorsBuilder_ == null) {
        return descriptors_.get(index);
      } else {
        return descriptorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder setDescriptors(
        int index, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor value) {
      if (descriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDescriptorsIsMutable();
        descriptors_.set(index, value);
        onChanged();
      } else {
        descriptorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder setDescriptors(
        int index, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder builderForValue) {
      if (descriptorsBuilder_ == null) {
        ensureDescriptorsIsMutable();
        descriptors_.set(index, builderForValue.build());
        onChanged();
      } else {
        descriptorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder addDescriptors(it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor value) {
      if (descriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDescriptorsIsMutable();
        descriptors_.add(value);
        onChanged();
      } else {
        descriptorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder addDescriptors(
        int index, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor value) {
      if (descriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDescriptorsIsMutable();
        descriptors_.add(index, value);
        onChanged();
      } else {
        descriptorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder addDescriptors(
        it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder builderForValue) {
      if (descriptorsBuilder_ == null) {
        ensureDescriptorsIsMutable();
        descriptors_.add(builderForValue.build());
        onChanged();
      } else {
        descriptorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder addDescriptors(
        int index, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder builderForValue) {
      if (descriptorsBuilder_ == null) {
        ensureDescriptorsIsMutable();
        descriptors_.add(index, builderForValue.build());
        onChanged();
      } else {
        descriptorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder addAllDescriptors(
        java.lang.Iterable<? extends it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor> values) {
      if (descriptorsBuilder_ == null) {
        ensureDescriptorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, descriptors_);
        onChanged();
      } else {
        descriptorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder clearDescriptors() {
      if (descriptorsBuilder_ == null) {
        descriptors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        descriptorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public Builder removeDescriptors(int index) {
      if (descriptorsBuilder_ == null) {
        ensureDescriptorsIsMutable();
        descriptors_.remove(index);
        onChanged();
      } else {
        descriptorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder getDescriptorsBuilder(
        int index) {
      return getDescriptorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder getDescriptorsOrBuilder(
        int index) {
      if (descriptorsBuilder_ == null) {
        return descriptors_.get(index);  } else {
        return descriptorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public java.util.List<? extends it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder> 
         getDescriptorsOrBuilderList() {
      if (descriptorsBuilder_ != null) {
        return descriptorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(descriptors_);
      }
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder addDescriptorsBuilder() {
      return getDescriptorsFieldBuilder().addBuilder(
          it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.getDefaultInstance());
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder addDescriptorsBuilder(
        int index) {
      return getDescriptorsFieldBuilder().addBuilder(
          index, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.getDefaultInstance());
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTDescriptor descriptors = 4;</code>
     */
    public java.util.List<it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder> 
         getDescriptorsBuilderList() {
      return getDescriptorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder> 
        getDescriptorsFieldBuilder() {
      if (descriptorsBuilder_ == null) {
        descriptorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder, it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorOrBuilder>(
                descriptors_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        descriptors_ = null;
      }
      return descriptorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTCharacteristic)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTCharacteristic)
  private static final it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic();
  }

  public static it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BluetoothGATTCharacteristic>
      PARSER = new com.google.protobuf.AbstractParser<BluetoothGATTCharacteristic>() {
    @java.lang.Override
    public BluetoothGATTCharacteristic parsePartialFrom(
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

  public static com.google.protobuf.Parser<BluetoothGATTCharacteristic> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BluetoothGATTCharacteristic> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.BluetoothGATTCharacteristic getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

