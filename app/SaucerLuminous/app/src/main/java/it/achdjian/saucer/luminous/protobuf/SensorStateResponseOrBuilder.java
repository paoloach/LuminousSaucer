// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface SensorStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.SensorStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <code>float state = 2;</code>
   * @return The state.
   */
  float getState();

  /**
   * <pre>
   * If the sensor does not have a valid state yet.
   * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
   * </pre>
   *
   * <code>bool missing_state = 3;</code>
   * @return The missingState.
   */
  boolean getMissingState();
}
