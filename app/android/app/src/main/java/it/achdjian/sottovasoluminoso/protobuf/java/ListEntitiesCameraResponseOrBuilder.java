// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

public interface ListEntitiesCameraResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesCameraResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string object_id = 1;</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <code>string object_id = 1;</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <code>fixed32 key = 2;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string unique_id = 4;</code>
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   * <code>string unique_id = 4;</code>
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString
      getUniqueIdBytes();

  /**
   * <code>bool disabled_by_default = 5;</code>
   * @return The disabledByDefault.
   */
  boolean getDisabledByDefault();

  /**
   * <code>string icon = 6;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <code>string icon = 6;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
   * @return The enum numeric value on the wire for entityCategory.
   */
  int getEntityCategoryValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 7;</code>
   * @return The entityCategory.
   */
  it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory getEntityCategory();
}
