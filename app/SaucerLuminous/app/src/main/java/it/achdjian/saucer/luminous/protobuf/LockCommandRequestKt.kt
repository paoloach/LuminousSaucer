//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializelockCommandRequest")
public inline fun lockCommandRequest(block: it.achdjian.saucer.luminous.protobuf.LockCommandRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.LockCommandRequest =
  it.achdjian.saucer.luminous.protobuf.LockCommandRequestKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.LockCommandRequest.newBuilder()).apply { block() }._build()
public object LockCommandRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.LockCommandRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.LockCommandRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.LockCommandRequest = _builder.build()

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
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LockCommand command = 2;</code>
     */
    public var command: it.achdjian.saucer.luminous.protobuf.LockCommand
      @JvmName("getCommand")
      get() = _builder.getCommand()
      @JvmName("setCommand")
      set(value) {
        _builder.setCommand(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LockCommand command = 2;</code>
     */
    public fun clearCommand() {
      _builder.clearCommand()
    }

    /**
     * <pre>
     * Not yet implemented:
     * </pre>
     *
     * <code>bool has_code = 3;</code>
     */
    public var hasCode: kotlin.Boolean
      @JvmName("getHasCode")
      get() = _builder.getHasCode()
      @JvmName("setHasCode")
      set(value) {
        _builder.setHasCode(value)
      }
    /**
     * <pre>
     * Not yet implemented:
     * </pre>
     *
     * <code>bool has_code = 3;</code>
     */
    public fun clearHasCode() {
      _builder.clearHasCode()
    }

    /**
     * <code>string code = 4;</code>
     */
    public var code: kotlin.String
      @JvmName("getCode")
      get() = _builder.getCode()
      @JvmName("setCode")
      set(value) {
        _builder.setCode(value)
      }
    /**
     * <code>string code = 4;</code>
     */
    public fun clearCode() {
      _builder.clearCode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.LockCommandRequest.copy(block: it.achdjian.saucer.luminous.protobuf.LockCommandRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.LockCommandRequest =
  it.achdjian.saucer.luminous.protobuf.LockCommandRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

