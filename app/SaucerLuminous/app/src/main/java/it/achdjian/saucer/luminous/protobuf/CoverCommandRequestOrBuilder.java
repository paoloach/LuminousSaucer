// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface CoverCommandRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.CoverCommandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <pre>
   * legacy: command has been removed in 1.13
   * clients/servers must still send/accept it until the next protocol change
   * </pre>
   *
   * <code>bool has_legacy_command = 2;</code>
   * @return The hasLegacyCommand.
   */
  boolean getHasLegacyCommand();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LegacyCoverCommand legacy_command = 3;</code>
   * @return The enum numeric value on the wire for legacyCommand.
   */
  int getLegacyCommandValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LegacyCoverCommand legacy_command = 3;</code>
   * @return The legacyCommand.
   */
  it.achdjian.saucer.luminous.protobuf.LegacyCoverCommand getLegacyCommand();

  /**
   * <code>bool has_position = 4;</code>
   * @return The hasPosition.
   */
  boolean getHasPosition();

  /**
   * <code>float position = 5;</code>
   * @return The position.
   */
  float getPosition();

  /**
   * <code>bool has_tilt = 6;</code>
   * @return The hasTilt.
   */
  boolean getHasTilt();

  /**
   * <code>float tilt = 7;</code>
   * @return The tilt.
   */
  float getTilt();

  /**
   * <code>bool stop = 8;</code>
   * @return The stop.
   */
  boolean getStop();
}
