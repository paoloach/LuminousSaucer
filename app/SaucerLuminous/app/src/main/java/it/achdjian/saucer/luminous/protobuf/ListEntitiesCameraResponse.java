// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * <pre>
 * ==================== CAMERA ====================
 * </pre>
 *
 * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse}
 */
public final class ListEntitiesCameraResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse)
    ListEntitiesCameraResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListEntitiesCameraResponse.newBuilder() to construct.
  private ListEntitiesCameraResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListEntitiesCameraResponse() {
    objectId_ = "";
    name_ = "";
    uniqueId_ = "";
    icon_ = "";
    entityCategory_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListEntitiesCameraResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ListEntitiesCameraResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ListEntitiesCameraResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.class, it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.Builder.class);
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <code>string object_id = 1;</code>
   * @return The objectId.
   */
  @java.lang.Override
  public java.lang.String getObjectId() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectId_ = s;
      return s;
    }
  }
  /**
   * <code>string object_id = 1;</code>
   * @return The bytes for objectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectIdBytes() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private int key_ = 0;
  /**
   * <code>fixed32 key = 2;</code>
   * @return The key.
   */
  @java.lang.Override
  public int getKey() {
    return key_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uniqueId_ = "";
  /**
   * <code>string unique_id = 4;</code>
   * @return The uniqueId.
   */
  @java.lang.Override
  public java.lang.String getUniqueId() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uniqueId_ = s;
      return s;
    }
  }
  /**
   * <code>string unique_id = 4;</code>
   * @return The bytes for uniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUniqueIdBytes() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uniqueId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISABLED_BY_DEFAULT_FIELD_NUMBER = 5;
  private boolean disabledByDefault_ = false;
  /**
   * <code>bool disabled_by_default = 5;</code>
   * @return The disabledByDefault.
   */
  @java.lang.Override
  public boolean getDisabledByDefault() {
    return disabledByDefault_;
  }

  public static final int ICON_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object icon_ = "";
  /**
   * <code>string icon = 6;</code>
   * @return The icon.
   */
  @java.lang.Override
  public java.lang.String getIcon() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      icon_ = s;
      return s;
    }
  }
  /**
   * <code>string icon = 6;</code>
   * @return The bytes for icon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconBytes() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      icon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_CATEGORY_FIELD_NUMBER = 7;
  private int entityCategory_ = 0;
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
   * @return The enum numeric value on the wire for entityCategory.
   */
  @java.lang.Override public int getEntityCategoryValue() {
    return entityCategory_;
  }
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
   * @return The entityCategory.
   */
  @java.lang.Override public it.achdjian.saucer.luminous.protobuf.EntityCategory getEntityCategory() {
    it.achdjian.saucer.luminous.protobuf.EntityCategory result = it.achdjian.saucer.luminous.protobuf.EntityCategory.forNumber(entityCategory_);
    return result == null ? it.achdjian.saucer.luminous.protobuf.EntityCategory.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectId_);
    }
    if (key_ != 0) {
      output.writeFixed32(2, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uniqueId_);
    }
    if (disabledByDefault_ != false) {
      output.writeBool(5, disabledByDefault_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, icon_);
    }
    if (entityCategory_ != it.achdjian.saucer.luminous.protobuf.EntityCategory.ENTITY_CATEGORY_NONE.getNumber()) {
      output.writeEnum(7, entityCategory_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectId_);
    }
    if (key_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed32Size(2, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uniqueId_);
    }
    if (disabledByDefault_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, disabledByDefault_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(icon_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, icon_);
    }
    if (entityCategory_ != it.achdjian.saucer.luminous.protobuf.EntityCategory.ENTITY_CATEGORY_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, entityCategory_);
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
    if (!(obj instanceof it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse)) {
      return super.equals(obj);
    }
    it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse other = (it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse) obj;

    if (!getObjectId()
        .equals(other.getObjectId())) return false;
    if (getKey()
        != other.getKey()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getUniqueId()
        .equals(other.getUniqueId())) return false;
    if (getDisabledByDefault()
        != other.getDisabledByDefault()) return false;
    if (!getIcon()
        .equals(other.getIcon())) return false;
    if (entityCategory_ != other.entityCategory_) return false;
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
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectId().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUniqueId().hashCode();
    hash = (37 * hash) + DISABLED_BY_DEFAULT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisabledByDefault());
    hash = (37 * hash) + ICON_FIELD_NUMBER;
    hash = (53 * hash) + getIcon().hashCode();
    hash = (37 * hash) + ENTITY_CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + entityCategory_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse parseFrom(
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
  public static Builder newBuilder(it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse prototype) {
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
   * <pre>
   * ==================== CAMERA ====================
   * </pre>
   *
   * Protobuf type {@code it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse)
      it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ListEntitiesCameraResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ListEntitiesCameraResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.class, it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.Builder.class);
    }

    // Construct using it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.newBuilder()
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
      objectId_ = "";
      key_ = 0;
      name_ = "";
      uniqueId_ = "";
      disabledByDefault_ = false;
      icon_ = "";
      entityCategory_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return it.achdjian.saucer.luminous.protobuf.Api.internal_static_it_achdjian_sottovasoluminoso_protobuf_java_ListEntitiesCameraResponse_descriptor;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse getDefaultInstanceForType() {
      return it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.getDefaultInstance();
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse build() {
      it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse buildPartial() {
      it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse result = new it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectId_ = objectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.uniqueId_ = uniqueId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.disabledByDefault_ = disabledByDefault_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.icon_ = icon_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.entityCategory_ = entityCategory_;
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
      if (other instanceof it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse) {
        return mergeFrom((it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse other) {
      if (other == it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse.getDefaultInstance()) return this;
      if (!other.getObjectId().isEmpty()) {
        objectId_ = other.objectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getKey() != 0) {
        setKey(other.getKey());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getUniqueId().isEmpty()) {
        uniqueId_ = other.uniqueId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getDisabledByDefault() != false) {
        setDisabledByDefault(other.getDisabledByDefault());
      }
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      if (other.entityCategory_ != 0) {
        setEntityCategoryValue(other.getEntityCategoryValue());
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
            case 10: {
              objectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 21: {
              key_ = input.readFixed32();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              uniqueId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              disabledByDefault_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              icon_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 56: {
              entityCategory_ = input.readEnum();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private java.lang.Object objectId_ = "";
    /**
     * <code>string object_id = 1;</code>
     * @return The objectId.
     */
    public java.lang.String getObjectId() {
      java.lang.Object ref = objectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string object_id = 1;</code>
     * @return The bytes for objectId.
     */
    public com.google.protobuf.ByteString
        getObjectIdBytes() {
      java.lang.Object ref = objectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string object_id = 1;</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string object_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      objectId_ = getDefaultInstance().getObjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string object_id = 1;</code>
     * @param value The bytes for objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int key_ ;
    /**
     * <code>fixed32 key = 2;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
    }
    /**
     * <code>fixed32 key = 2;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(int value) {
      
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>fixed32 key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      key_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     * <code>string unique_id = 4;</code>
     * @return The uniqueId.
     */
    public java.lang.String getUniqueId() {
      java.lang.Object ref = uniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string unique_id = 4;</code>
     * @return The bytes for uniqueId.
     */
    public com.google.protobuf.ByteString
        getUniqueIdBytes() {
      java.lang.Object ref = uniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string unique_id = 4;</code>
     * @param value The uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uniqueId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string unique_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUniqueId() {
      uniqueId_ = getDefaultInstance().getUniqueId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string unique_id = 4;</code>
     * @param value The bytes for uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uniqueId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean disabledByDefault_ ;
    /**
     * <code>bool disabled_by_default = 5;</code>
     * @return The disabledByDefault.
     */
    @java.lang.Override
    public boolean getDisabledByDefault() {
      return disabledByDefault_;
    }
    /**
     * <code>bool disabled_by_default = 5;</code>
     * @param value The disabledByDefault to set.
     * @return This builder for chaining.
     */
    public Builder setDisabledByDefault(boolean value) {
      
      disabledByDefault_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool disabled_by_default = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabledByDefault() {
      bitField0_ = (bitField0_ & ~0x00000010);
      disabledByDefault_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object icon_ = "";
    /**
     * <code>string icon = 6;</code>
     * @return The icon.
     */
    public java.lang.String getIcon() {
      java.lang.Object ref = icon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        icon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string icon = 6;</code>
     * @return The bytes for icon.
     */
    public com.google.protobuf.ByteString
        getIconBytes() {
      java.lang.Object ref = icon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        icon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string icon = 6;</code>
     * @param value The icon to set.
     * @return This builder for chaining.
     */
    public Builder setIcon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      icon_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string icon = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcon() {
      icon_ = getDefaultInstance().getIcon();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string icon = 6;</code>
     * @param value The bytes for icon to set.
     * @return This builder for chaining.
     */
    public Builder setIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      icon_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private int entityCategory_ = 0;
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
     * @return The enum numeric value on the wire for entityCategory.
     */
    @java.lang.Override public int getEntityCategoryValue() {
      return entityCategory_;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
     * @param value The enum numeric value on the wire for entityCategory to set.
     * @return This builder for chaining.
     */
    public Builder setEntityCategoryValue(int value) {
      entityCategory_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
     * @return The entityCategory.
     */
    @java.lang.Override
    public it.achdjian.saucer.luminous.protobuf.EntityCategory getEntityCategory() {
      it.achdjian.saucer.luminous.protobuf.EntityCategory result = it.achdjian.saucer.luminous.protobuf.EntityCategory.forNumber(entityCategory_);
      return result == null ? it.achdjian.saucer.luminous.protobuf.EntityCategory.UNRECOGNIZED : result;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
     * @param value The entityCategory to set.
     * @return This builder for chaining.
     */
    public Builder setEntityCategory(it.achdjian.saucer.luminous.protobuf.EntityCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000040;
      entityCategory_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityCategory() {
      bitField0_ = (bitField0_ & ~0x00000040);
      entityCategory_ = 0;
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


    // @@protoc_insertion_point(builder_scope:it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse)
  }

  // @@protoc_insertion_point(class_scope:it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse)
  private static final it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse();
  }

  public static it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntitiesCameraResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListEntitiesCameraResponse>() {
    @java.lang.Override
    public ListEntitiesCameraResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListEntitiesCameraResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntitiesCameraResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public it.achdjian.saucer.luminous.protobuf.ListEntitiesCameraResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

