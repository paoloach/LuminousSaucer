//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

@kotlin.jvm.JvmName("-initializebluetoothDeviceRequest")
public inline fun bluetoothDeviceRequest(block: it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest =
  it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestKt.Dsl._create(it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest.newBuilder()).apply { block() }._build()
public object BluetoothDeviceRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest = _builder.build()

    /**
     * <code>uint64 address = 1;</code>
     */
    public var address: kotlin.Long
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>uint64 address = 1;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestType request_type = 2;</code>
     */
    public var requestType: it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestType
      @JvmName("getRequestType")
      get() = _builder.getRequestType()
      @JvmName("setRequestType")
      set(value) {
        _builder.setRequestType(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestType request_type = 2;</code>
     */
    public fun clearRequestType() {
      _builder.clearRequestType()
    }

    /**
     * <code>bool has_address_type = 3;</code>
     */
    public var hasAddressType: kotlin.Boolean
      @JvmName("getHasAddressType")
      get() = _builder.getHasAddressType()
      @JvmName("setHasAddressType")
      set(value) {
        _builder.setHasAddressType(value)
      }
    /**
     * <code>bool has_address_type = 3;</code>
     */
    public fun clearHasAddressType() {
      _builder.clearHasAddressType()
    }

    /**
     * <code>uint32 address_type = 4;</code>
     */
    public var addressType: kotlin.Int
      @JvmName("getAddressType")
      get() = _builder.getAddressType()
      @JvmName("setAddressType")
      set(value) {
        _builder.setAddressType(value)
      }
    /**
     * <code>uint32 address_type = 4;</code>
     */
    public fun clearAddressType() {
      _builder.clearAddressType()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest.copy(block: it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequest =
  it.achdjian.sottovasoluminoso.protobuf.java.BluetoothDeviceRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

