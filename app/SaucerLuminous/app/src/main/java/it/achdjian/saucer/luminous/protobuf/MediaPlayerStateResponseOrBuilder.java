// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface MediaPlayerStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerState state = 2;</code>
   * @return The state.
   */
  it.achdjian.saucer.luminous.protobuf.MediaPlayerState getState();

  /**
   * <code>float volume = 3;</code>
   * @return The volume.
   */
  float getVolume();

  /**
   * <code>bool muted = 4;</code>
   * @return The muted.
   */
  boolean getMuted();
}
