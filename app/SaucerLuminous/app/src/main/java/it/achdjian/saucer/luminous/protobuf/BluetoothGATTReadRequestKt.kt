//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializebluetoothGATTReadRequest")
public inline fun bluetoothGATTReadRequest(block: it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest =
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequestKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest.newBuilder()).apply { block() }._build()
public object BluetoothGATTReadRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest = _builder.build()

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
     * <code>uint32 handle = 2;</code>
     */
    public var handle: kotlin.Int
      @JvmName("getHandle")
      get() = _builder.getHandle()
      @JvmName("setHandle")
      set(value) {
        _builder.setHandle(value)
      }
    /**
     * <code>uint32 handle = 2;</code>
     */
    public fun clearHandle() {
      _builder.clearHandle()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest.copy(block: it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequest =
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTReadRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
