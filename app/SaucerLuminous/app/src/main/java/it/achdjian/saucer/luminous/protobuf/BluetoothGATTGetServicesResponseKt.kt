//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializebluetoothGATTGetServicesResponse")
public inline fun bluetoothGATTGetServicesResponse(block: it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse =
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse.newBuilder()).apply { block() }._build()
public object BluetoothGATTGetServicesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse = _builder.build()

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
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ServicesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     */
     public val services: com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getServicesList()
      )
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     * @param value The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addServices")
    public fun com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>.add(value: it.achdjian.saucer.luminous.protobuf.BluetoothGATTService) {
      _builder.addServices(value)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     * @param value The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignServices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>.plusAssign(value: it.achdjian.saucer.luminous.protobuf.BluetoothGATTService) {
      add(value)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     * @param values The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllServices")
    public fun com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>.addAll(values: kotlin.collections.Iterable<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService>) {
      _builder.addAllServices(values)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     * @param values The services to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllServices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>.plusAssign(values: kotlin.collections.Iterable<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService>) {
      addAll(values)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     * @param index The index to set the value at.
     * @param value The services to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setServices")
    public operator fun com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>.set(index: kotlin.Int, value: it.achdjian.saucer.luminous.protobuf.BluetoothGATTService) {
      _builder.setServices(index, value)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.BluetoothGATTService services = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearServices")
    public fun com.google.protobuf.kotlin.DslList<it.achdjian.saucer.luminous.protobuf.BluetoothGATTService, ServicesProxy>.clear() {
      _builder.clearServices()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse.copy(block: it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponse =
  it.achdjian.saucer.luminous.protobuf.BluetoothGATTGetServicesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

