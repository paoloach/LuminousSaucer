// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.HelloRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Description of client (like User Agent)
   * For example "Home Assistant"
   * Not strictly necessary to send but nice for debugging
   * purposes.
   * </pre>
   *
   * <code>string client_info = 1;</code>
   * @return The clientInfo.
   */
  java.lang.String getClientInfo();
  /**
   * <pre>
   * Description of client (like User Agent)
   * For example "Home Assistant"
   * Not strictly necessary to send but nice for debugging
   * purposes.
   * </pre>
   *
   * <code>string client_info = 1;</code>
   * @return The bytes for clientInfo.
   */
  com.google.protobuf.ByteString
      getClientInfoBytes();

  /**
   * <code>uint32 api_version_major = 2;</code>
   * @return The apiVersionMajor.
   */
  int getApiVersionMajor();

  /**
   * <code>uint32 api_version_minor = 3;</code>
   * @return The apiVersionMinor.
   */
  int getApiVersionMinor();
}
