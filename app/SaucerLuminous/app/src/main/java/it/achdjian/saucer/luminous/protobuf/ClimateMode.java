// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * <pre>
 * ==================== CLIMATE ====================
 * </pre>
 *
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.ClimateMode}
 */
public enum ClimateMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLIMATE_MODE_OFF = 0;</code>
   */
  CLIMATE_MODE_OFF(0),
  /**
   * <code>CLIMATE_MODE_HEAT_COOL = 1;</code>
   */
  CLIMATE_MODE_HEAT_COOL(1),
  /**
   * <code>CLIMATE_MODE_COOL = 2;</code>
   */
  CLIMATE_MODE_COOL(2),
  /**
   * <code>CLIMATE_MODE_HEAT = 3;</code>
   */
  CLIMATE_MODE_HEAT(3),
  /**
   * <code>CLIMATE_MODE_FAN_ONLY = 4;</code>
   */
  CLIMATE_MODE_FAN_ONLY(4),
  /**
   * <code>CLIMATE_MODE_DRY = 5;</code>
   */
  CLIMATE_MODE_DRY(5),
  /**
   * <code>CLIMATE_MODE_AUTO = 6;</code>
   */
  CLIMATE_MODE_AUTO(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLIMATE_MODE_OFF = 0;</code>
   */
  public static final int CLIMATE_MODE_OFF_VALUE = 0;
  /**
   * <code>CLIMATE_MODE_HEAT_COOL = 1;</code>
   */
  public static final int CLIMATE_MODE_HEAT_COOL_VALUE = 1;
  /**
   * <code>CLIMATE_MODE_COOL = 2;</code>
   */
  public static final int CLIMATE_MODE_COOL_VALUE = 2;
  /**
   * <code>CLIMATE_MODE_HEAT = 3;</code>
   */
  public static final int CLIMATE_MODE_HEAT_VALUE = 3;
  /**
   * <code>CLIMATE_MODE_FAN_ONLY = 4;</code>
   */
  public static final int CLIMATE_MODE_FAN_ONLY_VALUE = 4;
  /**
   * <code>CLIMATE_MODE_DRY = 5;</code>
   */
  public static final int CLIMATE_MODE_DRY_VALUE = 5;
  /**
   * <code>CLIMATE_MODE_AUTO = 6;</code>
   */
  public static final int CLIMATE_MODE_AUTO_VALUE = 6;


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
  public static ClimateMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClimateMode forNumber(int value) {
    switch (value) {
      case 0: return CLIMATE_MODE_OFF;
      case 1: return CLIMATE_MODE_HEAT_COOL;
      case 2: return CLIMATE_MODE_COOL;
      case 3: return CLIMATE_MODE_HEAT;
      case 4: return CLIMATE_MODE_FAN_ONLY;
      case 5: return CLIMATE_MODE_DRY;
      case 6: return CLIMATE_MODE_AUTO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClimateMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClimateMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClimateMode>() {
          public ClimateMode findValueByNumber(int number) {
            return ClimateMode.forNumber(number);
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
    return it.achdjian.saucer.luminous.protobuf.Api.getDescriptor().getEnumTypes().get(11);
  }

  private static final ClimateMode[] VALUES = values();

  public static ClimateMode valueOf(
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

  private ClimateMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.ClimateMode)
}

