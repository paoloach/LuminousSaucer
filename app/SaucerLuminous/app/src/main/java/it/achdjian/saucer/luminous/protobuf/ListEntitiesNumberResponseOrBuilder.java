// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface ListEntitiesNumberResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesNumberResponse)
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
   * <code>string icon = 5;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <code>string icon = 5;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <code>float min_value = 6;</code>
   * @return The minValue.
   */
  float getMinValue();

  /**
   * <code>float max_value = 7;</code>
   * @return The maxValue.
   */
  float getMaxValue();

  /**
   * <code>float step = 8;</code>
   * @return The step.
   */
  float getStep();

  /**
   * <code>bool disabled_by_default = 9;</code>
   * @return The disabledByDefault.
   */
  boolean getDisabledByDefault();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 10;</code>
   * @return The enum numeric value on the wire for entityCategory.
   */
  int getEntityCategoryValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 10;</code>
   * @return The entityCategory.
   */
  it.achdjian.saucer.luminous.protobuf.EntityCategory getEntityCategory();

  /**
   * <code>string unit_of_measurement = 11;</code>
   * @return The unitOfMeasurement.
   */
  java.lang.String getUnitOfMeasurement();
  /**
   * <code>string unit_of_measurement = 11;</code>
   * @return The bytes for unitOfMeasurement.
   */
  com.google.protobuf.ByteString
      getUnitOfMeasurementBytes();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.NumberMode mode = 12;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.NumberMode mode = 12;</code>
   * @return The mode.
   */
  it.achdjian.saucer.luminous.protobuf.NumberMode getMode();

  /**
   * <code>string device_class = 13;</code>
   * @return The deviceClass.
   */
  java.lang.String getDeviceClass();
  /**
   * <code>string device_class = 13;</code>
   * @return The bytes for deviceClass.
   */
  com.google.protobuf.ByteString
      getDeviceClassBytes();
}
