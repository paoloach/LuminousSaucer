// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * <pre>
 * ==================== SENSOR ====================
 * </pre>
 *
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.SensorStateClass}
 */
public enum SensorStateClass
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATE_CLASS_NONE = 0;</code>
   */
  STATE_CLASS_NONE(0),
  /**
   * <code>STATE_CLASS_MEASUREMENT = 1;</code>
   */
  STATE_CLASS_MEASUREMENT(1),
  /**
   * <code>STATE_CLASS_TOTAL_INCREASING = 2;</code>
   */
  STATE_CLASS_TOTAL_INCREASING(2),
  /**
   * <code>STATE_CLASS_TOTAL = 3;</code>
   */
  STATE_CLASS_TOTAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATE_CLASS_NONE = 0;</code>
   */
  public static final int STATE_CLASS_NONE_VALUE = 0;
  /**
   * <code>STATE_CLASS_MEASUREMENT = 1;</code>
   */
  public static final int STATE_CLASS_MEASUREMENT_VALUE = 1;
  /**
   * <code>STATE_CLASS_TOTAL_INCREASING = 2;</code>
   */
  public static final int STATE_CLASS_TOTAL_INCREASING_VALUE = 2;
  /**
   * <code>STATE_CLASS_TOTAL = 3;</code>
   */
  public static final int STATE_CLASS_TOTAL_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SensorStateClass valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SensorStateClass forNumber(int value) {
    switch (value) {
      case 0: return STATE_CLASS_NONE;
      case 1: return STATE_CLASS_MEASUREMENT;
      case 2: return STATE_CLASS_TOTAL_INCREASING;
      case 3: return STATE_CLASS_TOTAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SensorStateClass>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SensorStateClass> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SensorStateClass>() {
          public SensorStateClass findValueByNumber(int number) {
            return SensorStateClass.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return it.achdjian.saucer.luminous.protobuf.Api.getDescriptor().getEnumTypes().get(7);
  }

  private static final SensorStateClass[] VALUES = values();

  public static SensorStateClass valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SensorStateClass(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.SensorStateClass)
}

