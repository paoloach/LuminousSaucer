// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.ClimatePreset}
 */
public enum ClimatePreset
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLIMATE_PRESET_NONE = 0;</code>
   */
  CLIMATE_PRESET_NONE(0),
  /**
   * <code>CLIMATE_PRESET_HOME = 1;</code>
   */
  CLIMATE_PRESET_HOME(1),
  /**
   * <code>CLIMATE_PRESET_AWAY = 2;</code>
   */
  CLIMATE_PRESET_AWAY(2),
  /**
   * <code>CLIMATE_PRESET_BOOST = 3;</code>
   */
  CLIMATE_PRESET_BOOST(3),
  /**
   * <code>CLIMATE_PRESET_COMFORT = 4;</code>
   */
  CLIMATE_PRESET_COMFORT(4),
  /**
   * <code>CLIMATE_PRESET_ECO = 5;</code>
   */
  CLIMATE_PRESET_ECO(5),
  /**
   * <code>CLIMATE_PRESET_SLEEP = 6;</code>
   */
  CLIMATE_PRESET_SLEEP(6),
  /**
   * <code>CLIMATE_PRESET_ACTIVITY = 7;</code>
   */
  CLIMATE_PRESET_ACTIVITY(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLIMATE_PRESET_NONE = 0;</code>
   */
  public static final int CLIMATE_PRESET_NONE_VALUE = 0;
  /**
   * <code>CLIMATE_PRESET_HOME = 1;</code>
   */
  public static final int CLIMATE_PRESET_HOME_VALUE = 1;
  /**
   * <code>CLIMATE_PRESET_AWAY = 2;</code>
   */
  public static final int CLIMATE_PRESET_AWAY_VALUE = 2;
  /**
   * <code>CLIMATE_PRESET_BOOST = 3;</code>
   */
  public static final int CLIMATE_PRESET_BOOST_VALUE = 3;
  /**
   * <code>CLIMATE_PRESET_COMFORT = 4;</code>
   */
  public static final int CLIMATE_PRESET_COMFORT_VALUE = 4;
  /**
   * <code>CLIMATE_PRESET_ECO = 5;</code>
   */
  public static final int CLIMATE_PRESET_ECO_VALUE = 5;
  /**
   * <code>CLIMATE_PRESET_SLEEP = 6;</code>
   */
  public static final int CLIMATE_PRESET_SLEEP_VALUE = 6;
  /**
   * <code>CLIMATE_PRESET_ACTIVITY = 7;</code>
   */
  public static final int CLIMATE_PRESET_ACTIVITY_VALUE = 7;


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
  public static ClimatePreset valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClimatePreset forNumber(int value) {
    switch (value) {
      case 0: return CLIMATE_PRESET_NONE;
      case 1: return CLIMATE_PRESET_HOME;
      case 2: return CLIMATE_PRESET_AWAY;
      case 3: return CLIMATE_PRESET_BOOST;
      case 4: return CLIMATE_PRESET_COMFORT;
      case 5: return CLIMATE_PRESET_ECO;
      case 6: return CLIMATE_PRESET_SLEEP;
      case 7: return CLIMATE_PRESET_ACTIVITY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClimatePreset>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClimatePreset> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClimatePreset>() {
          public ClimatePreset findValueByNumber(int number) {
            return ClimatePreset.forNumber(number);
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
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.getDescriptor().getEnumTypes().get(15);
  }

  private static final ClimatePreset[] VALUES = values();

  public static ClimatePreset valueOf(
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

  private ClimatePreset(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.ClimatePreset)
}

