// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.FanSpeed}
 */
public enum FanSpeed
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FAN_SPEED_LOW = 0;</code>
   */
  FAN_SPEED_LOW(0),
  /**
   * <code>FAN_SPEED_MEDIUM = 1;</code>
   */
  FAN_SPEED_MEDIUM(1),
  /**
   * <code>FAN_SPEED_HIGH = 2;</code>
   */
  FAN_SPEED_HIGH(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FAN_SPEED_LOW = 0;</code>
   */
  public static final int FAN_SPEED_LOW_VALUE = 0;
  /**
   * <code>FAN_SPEED_MEDIUM = 1;</code>
   */
  public static final int FAN_SPEED_MEDIUM_VALUE = 1;
  /**
   * <code>FAN_SPEED_HIGH = 2;</code>
   */
  public static final int FAN_SPEED_HIGH_VALUE = 2;


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
  public static FanSpeed valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FanSpeed forNumber(int value) {
    switch (value) {
      case 0: return FAN_SPEED_LOW;
      case 1: return FAN_SPEED_MEDIUM;
      case 2: return FAN_SPEED_HIGH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FanSpeed>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FanSpeed> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FanSpeed>() {
          public FanSpeed findValueByNumber(int number) {
            return FanSpeed.forNumber(number);
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
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.getDescriptor().getEnumTypes().get(4);
  }

  private static final FanSpeed[] VALUES = values();

  public static FanSpeed valueOf(
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

  private FanSpeed(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.FanSpeed)
}

