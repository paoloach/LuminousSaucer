// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

public interface BluetoothDeviceConnectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceConnectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 address = 1;</code>
   * @return The address.
   */
  long getAddress();

  /**
   * <code>bool connected = 2;</code>
   * @return The connected.
   */
  boolean getConnected();

  /**
   * <code>uint32 mtu = 3;</code>
   * @return The mtu.
   */
  int getMtu();

  /**
   * <code>int32 error = 4;</code>
   * @return The error.
   */
  int getError();
}
