//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializelockStateResponse")
public inline fun lockStateResponse(block: it.achdjian.saucer.luminous.protobuf.LockStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.LockStateResponse =
  it.achdjian.saucer.luminous.protobuf.LockStateResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.LockStateResponse.newBuilder()).apply { block() }._build()
public object LockStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.LockStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.LockStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.LockStateResponse = _builder.build()

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
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LockState state = 2;</code>
     */
    public var state: it.achdjian.saucer.luminous.protobuf.LockState
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LockState state = 2;</code>
     */
    public fun clearState() {
      _builder.clearState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.LockStateResponse.copy(block: it.achdjian.saucer.luminous.protobuf.LockStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.LockStateResponse =
  it.achdjian.saucer.luminous.protobuf.LockStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

