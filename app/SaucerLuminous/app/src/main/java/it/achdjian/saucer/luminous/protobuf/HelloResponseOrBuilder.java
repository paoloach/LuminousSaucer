// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface HelloResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.HelloResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The version of the API to use. The _client_ (for example Home Assistant) needs to check
   * for compatibility and if necessary adopt to an older API.
   * Major is for breaking changes in the base protocol - a mismatch will lead to immediate disconnect_client_
   * Minor is for breaking changes in individual messages - a mismatch will lead to a warning message
   * </pre>
   *
   * <code>uint32 api_version_major = 1;</code>
   * @return The apiVersionMajor.
   */
  int getApiVersionMajor();

  /**
   * <code>uint32 api_version_minor = 2;</code>
   * @return The apiVersionMinor.
   */
  int getApiVersionMinor();

  /**
   * <pre>
   * A string identifying the server (ESP); like client info this may be empty
   * and only exists for debugging/logging purposes.
   * For example "ESPHome v1.10.0 on ESP8266"
   * </pre>
   *
   * <code>string server_info = 3;</code>
   * @return The serverInfo.
   */
  java.lang.String getServerInfo();
  /**
   * <pre>
   * A string identifying the server (ESP); like client info this may be empty
   * and only exists for debugging/logging purposes.
   * For example "ESPHome v1.10.0 on ESP8266"
   * </pre>
   *
   * <code>string server_info = 3;</code>
   * @return The bytes for serverInfo.
   */
  com.google.protobuf.ByteString
      getServerInfoBytes();

  /**
   * <pre>
   * The name of the server (App.get_name())
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the server (App.get_name())
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
