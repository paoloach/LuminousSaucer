// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

public interface BluetoothGATTWriteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTWriteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 address = 1;</code>
   * @return The address.
   */
  long getAddress();

  /**
   * <code>uint32 handle = 2;</code>
   * @return The handle.
   */
  int getHandle();

  /**
   * <code>bool response = 3;</code>
   * @return The response.
   */
  boolean getResponse();

  /**
   * <code>bytes data = 4;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
