// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface SubscribeLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse)
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
  it.achdjian.saucer.luminous.protobuf.LogLevel getLevel();

  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>bool send_failed = 4;</code>
   * @return The sendFailed.
   */
  boolean getSendFailed();
}