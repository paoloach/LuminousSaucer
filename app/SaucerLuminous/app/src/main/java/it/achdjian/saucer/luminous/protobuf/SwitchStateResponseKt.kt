//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializeswitchStateResponse")
public inline fun switchStateResponse(block: it.achdjian.saucer.luminous.protobuf.SwitchStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SwitchStateResponse =
  it.achdjian.saucer.luminous.protobuf.SwitchStateResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.SwitchStateResponse.newBuilder()).apply { block() }._build()
public object SwitchStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.SwitchStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.SwitchStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.SwitchStateResponse = _builder.build()

    /**
     * <code>fixed32 key = 1;</code>
     */
    public var key: kotlin.Int
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>fixed32 key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bool state = 2;</code>
     */
    public var state: kotlin.Boolean
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * <code>bool state = 2;</code>
     */
    public fun clearState() {
      _builder.clearState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.SwitchStateResponse.copy(block: it.achdjian.saucer.luminous.protobuf.SwitchStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SwitchStateResponse =
  it.achdjian.saucer.luminous.protobuf.SwitchStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

