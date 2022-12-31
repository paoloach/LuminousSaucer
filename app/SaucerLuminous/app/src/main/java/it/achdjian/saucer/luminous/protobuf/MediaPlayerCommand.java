// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

/**
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerCommand}
 */
public enum MediaPlayerCommand
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MEDIA_PLAYER_COMMAND_PLAY = 0;</code>
   */
  MEDIA_PLAYER_COMMAND_PLAY(0),
  /**
   * <code>MEDIA_PLAYER_COMMAND_PAUSE = 1;</code>
   */
  MEDIA_PLAYER_COMMAND_PAUSE(1),
  /**
   * <code>MEDIA_PLAYER_COMMAND_STOP = 2;</code>
   */
  MEDIA_PLAYER_COMMAND_STOP(2),
  /**
   * <code>MEDIA_PLAYER_COMMAND_MUTE = 3;</code>
   */
  MEDIA_PLAYER_COMMAND_MUTE(3),
  /**
   * <code>MEDIA_PLAYER_COMMAND_UNMUTE = 4;</code>
   */
  MEDIA_PLAYER_COMMAND_UNMUTE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MEDIA_PLAYER_COMMAND_PLAY = 0;</code>
   */
  public static final int MEDIA_PLAYER_COMMAND_PLAY_VALUE = 0;
  /**
   * <code>MEDIA_PLAYER_COMMAND_PAUSE = 1;</code>
   */
  public static final int MEDIA_PLAYER_COMMAND_PAUSE_VALUE = 1;
  /**
   * <code>MEDIA_PLAYER_COMMAND_STOP = 2;</code>
   */
  public static final int MEDIA_PLAYER_COMMAND_STOP_VALUE = 2;
  /**
   * <code>MEDIA_PLAYER_COMMAND_MUTE = 3;</code>
   */
  public static final int MEDIA_PLAYER_COMMAND_MUTE_VALUE = 3;
  /**
   * <code>MEDIA_PLAYER_COMMAND_UNMUTE = 4;</code>
   */
  public static final int MEDIA_PLAYER_COMMAND_UNMUTE_VALUE = 4;


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
  public static MediaPlayerCommand valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MediaPlayerCommand forNumber(int value) {
    switch (value) {
      case 0: return MEDIA_PLAYER_COMMAND_PLAY;
      case 1: return MEDIA_PLAYER_COMMAND_PAUSE;
      case 2: return MEDIA_PLAYER_COMMAND_STOP;
      case 3: return MEDIA_PLAYER_COMMAND_MUTE;
      case 4: return MEDIA_PLAYER_COMMAND_UNMUTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MediaPlayerCommand>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MediaPlayerCommand> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MediaPlayerCommand>() {
          public MediaPlayerCommand findValueByNumber(int number) {
            return MediaPlayerCommand.forNumber(number);
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
    return it.achdjian.saucer.luminous.protobuf.Api.getDescriptor().getEnumTypes().get(20);
  }

  private static final MediaPlayerCommand[] VALUES = values();

  public static MediaPlayerCommand valueOf(
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

  private MediaPlayerCommand(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerCommand)
}
