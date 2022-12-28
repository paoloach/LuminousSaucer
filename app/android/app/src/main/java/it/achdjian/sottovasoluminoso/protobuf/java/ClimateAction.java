// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.ClimateAction}
 */
public enum ClimateAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLIMATE_ACTION_OFF = 0;</code>
   */
  CLIMATE_ACTION_OFF(0),
  /**
   * <pre>
   * values same as mode for readability
   * </pre>
   *
   * <code>CLIMATE_ACTION_COOLING = 2;</code>
   */
  CLIMATE_ACTION_COOLING(2),
  /**
   * <code>CLIMATE_ACTION_HEATING = 3;</code>
   */
  CLIMATE_ACTION_HEATING(3),
  /**
   * <code>CLIMATE_ACTION_IDLE = 4;</code>
   */
  CLIMATE_ACTION_IDLE(4),
  /**
   * <code>CLIMATE_ACTION_DRYING = 5;</code>
   */
  CLIMATE_ACTION_DRYING(5),
  /**
   * <code>CLIMATE_ACTION_FAN = 6;</code>
   */
  CLIMATE_ACTION_FAN(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLIMATE_ACTION_OFF = 0;</code>
   */
  public static final int CLIMATE_ACTION_OFF_VALUE = 0;
  /**
   * <pre>
   * values same as mode for readability
   * </pre>
   *
   * <code>CLIMATE_ACTION_COOLING = 2;</code>
   */
  public static final int CLIMATE_ACTION_COOLING_VALUE = 2;
  /**
   * <code>CLIMATE_ACTION_HEATING = 3;</code>
   */
  public static final int CLIMATE_ACTION_HEATING_VALUE = 3;
  /**
   * <code>CLIMATE_ACTION_IDLE = 4;</code>
   */
  public static final int CLIMATE_ACTION_IDLE_VALUE = 4;
  /**
   * <code>CLIMATE_ACTION_DRYING = 5;</code>
   */
  public static final int CLIMATE_ACTION_DRYING_VALUE = 5;
  /**
   * <code>CLIMATE_ACTION_FAN = 6;</code>
   */
  public static final int CLIMATE_ACTION_FAN_VALUE = 6;


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
  public static ClimateAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClimateAction forNumber(int value) {
    switch (value) {
      case 0: return CLIMATE_ACTION_OFF;
      case 2: return CLIMATE_ACTION_COOLING;
      case 3: return CLIMATE_ACTION_HEATING;
      case 4: return CLIMATE_ACTION_IDLE;
      case 5: return CLIMATE_ACTION_DRYING;
      case 6: return CLIMATE_ACTION_FAN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClimateAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClimateAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClimateAction>() {
          public ClimateAction findValueByNumber(int number) {
            return ClimateAction.forNumber(number);
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
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.getDescriptor().getEnumTypes().get(14);
  }

  private static final ClimateAction[] VALUES = values();

  public static ClimateAction valueOf(
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

  private ClimateAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.ClimateAction)
}

