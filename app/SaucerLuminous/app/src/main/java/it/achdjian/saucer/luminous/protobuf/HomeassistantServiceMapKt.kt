//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializehomeassistantServiceMap")
public inline fun homeassistantServiceMap(block: it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMapKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap =
  it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMapKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap.newBuilder()).apply { block() }._build()
public object HomeassistantServiceMapKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap = _builder.build()

    /**
     * <code>string key = 1;</code>
     */
    public var key: kotlin.String
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>string key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>string value = 2;</code>
     */
    public var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>string value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap.copy(block: it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMapKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMap =
  it.achdjian.saucer.luminous.protobuf.HomeassistantServiceMapKt.Dsl._create(this.toBuilder()).apply { block() }._build()
