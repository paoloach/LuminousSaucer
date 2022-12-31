// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.LegacyCoverCommand}
 */
public enum LegacyCoverCommand
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEGACY_COVER_COMMAND_OPEN = 0;</code>
   */
  LEGACY_COVER_COMMAND_OPEN(0),
  /**
   * <code>LEGACY_COVER_COMMAND_CLOSE = 1;</code>
   */
  LEGACY_COVER_COMMAND_CLOSE(1),
  /**
   * <code>LEGACY_COVER_COMMAND_STOP = 2;</code>
   */
  LEGACY_COVER_COMMAND_STOP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LEGACY_COVER_COMMAND_OPEN = 0;</code>
   */
  public static final int LEGACY_COVER_COMMAND_OPEN_VALUE = 0;
  /**
   * <code>LEGACY_COVER_COMMAND_CLOSE = 1;</code>
   */
  public static final int LEGACY_COVER_COMMAND_CLOSE_VALUE = 1;
  /**
   * <code>LEGACY_COVER_COMMAND_STOP = 2;</code>
   */
  public static final int LEGACY_COVER_COMMAND_STOP_VALUE = 2;


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
  public static LegacyCoverCommand valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LegacyCoverCommand forNumber(int value) {
    switch (value) {
      case 0: return LEGACY_COVER_COMMAND_OPEN;
      case 1: return LEGACY_COVER_COMMAND_CLOSE;
      case 2: return LEGACY_COVER_COMMAND_STOP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LegacyCoverCommand>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LegacyCoverCommand> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LegacyCoverCommand>() {
          public LegacyCoverCommand findValueByNumber(int number) {
            return LegacyCoverCommand.forNumber(number);
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
    return it.achdjian.saucer.luminous.protobuf.Api.getDescriptor().getEnumTypes().get(3);
  }

  private static final LegacyCoverCommand[] VALUES = values();

  public static LegacyCoverCommand valueOf(
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

  private LegacyCoverCommand(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.LegacyCoverCommand)
}

