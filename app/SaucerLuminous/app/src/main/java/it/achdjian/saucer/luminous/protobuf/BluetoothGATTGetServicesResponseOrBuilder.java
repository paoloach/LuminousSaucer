// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface BluetoothGATTGetServicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTGetServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 address = 1;</code>
   * @return The address.
   */
  long getAddress();

  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
   */
  java.util.List<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService> 
      getServicesList();
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
   */
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTService getServices(int index);
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
   */
  int getServicesCount();
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
   */
  java.util.List<? extends it.achdjian.saucer.luminous.protobuf.BluetoothGATTServiceOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
   */
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTServiceOrBuilder getServicesOrBuilder(
      int index);
}
