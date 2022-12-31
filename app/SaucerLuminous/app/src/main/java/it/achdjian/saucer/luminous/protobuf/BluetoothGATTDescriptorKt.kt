//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializebluetoothGATTDescriptor")
public inline fun bluetoothGATTDescriptor(block: it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor =
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.newBuilder()).apply { block() }._build()
public object BluetoothGATTDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UuidProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 uuid = 1;</code>
     */
     public val uuid: com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUuidList()
      )
    /**
     * <code>repeated uint64 uuid = 1;</code>
     * @param value The uuid to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUuid")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>.add(value: kotlin.Long) {
      _builder.addUuid(value)
    }/**
     * <code>repeated uint64 uuid = 1;</code>
     * @param value The uuid to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUuid")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 uuid = 1;</code>
     * @param values The uuid to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUuid")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllUuid(values)
    }/**
     * <code>repeated uint64 uuid = 1;</code>
     * @param values The uuid to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUuid")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 uuid = 1;</code>
     * @param index The index to set the value at.
     * @param value The uuid to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUuid")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setUuid(index, value)
    }/**
     * <code>repeated uint64 uuid = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUuid")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, UuidProxy>.clear() {
      _builder.clearUuid()
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
public inline fun it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor.copy(block: it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptor =
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

