// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

public interface SubscribeLogsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LogLevel level = 1;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LogLevel level = 1;</code>
   * @return The level.
   */
  it.achdjian.sottovasoluminoso.protobuf.java.LogLevel getLevel();

  /**
   * <code>bool dump_config = 2;</code>
   * @return The dumpConfig.
   */
  boolean getDumpConfig();
}
