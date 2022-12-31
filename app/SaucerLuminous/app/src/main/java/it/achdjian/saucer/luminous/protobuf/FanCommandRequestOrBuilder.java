// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface FanCommandRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.FanCommandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <code>bool has_state = 2;</code>
   * @return The hasState.
   */
  boolean getHasState();

  /**
   * <code>bool state = 3;</code>
   * @return The state.
   */
  boolean getState();

  /**
   * <code>bool has_speed = 4 [deprecated = true];</code>
   * @deprecated it.achdjian.sottovasoluminoso.protobuf.java.FanCommandRequest.has_speed is deprecated.
   *     See api.proto;l=389
   * @return The hasSpeed.
   */
  @java.lang.Deprecated boolean getHasSpeed();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.FanSpeed speed = 5 [deprecated = true];</code>
   * @deprecated it.achdjian.sottovasoluminoso.protobuf.java.FanCommandRequest.speed is deprecated.
   *     See api.proto;l=390
   * @return The enum numeric value on the wire for speed.
   */
  @java.lang.Deprecated int getSpeedValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.FanSpeed speed = 5 [deprecated = true];</code>
   * @deprecated it.achdjian.sottovasoluminoso.protobuf.java.FanCommandRequest.speed is deprecated.
   *     See api.proto;l=390
   * @return The speed.
   */
  @java.lang.Deprecated it.achdjian.saucer.luminous.protobuf.FanSpeed getSpeed();

  /**
   * <code>bool has_oscillating = 6;</code>
   * @return The hasOscillating.
   */
  boolean getHasOscillating();

  /**
   * <code>bool oscillating = 7;</code>
   * @return The oscillating.
   */
  boolean getOscillating();

  /**
   * <code>bool has_direction = 8;</code>
   * @return The hasDirection.
   */
  boolean getHasDirection();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.FanDirection direction = 9;</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.FanDirection direction = 9;</code>
   * @return The direction.
   */
  it.achdjian.saucer.luminous.protobuf.FanDirection getDirection();

  /**
   * <code>bool has_speed_level = 10;</code>
   * @return The hasSpeedLevel.
   */
  boolean getHasSpeedLevel();

  /**
   * <code>int32 speed_level = 11;</code>
   * @return The speedLevel.
   */
  int getSpeedLevel();
}
