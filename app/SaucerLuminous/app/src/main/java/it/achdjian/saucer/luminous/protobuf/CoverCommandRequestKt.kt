//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializecoverCommandRequest")
public inline fun coverCommandRequest(block: it.achdjian.saucer.luminous.protobuf.CoverCommandRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.CoverCommandRequest =
  it.achdjian.saucer.luminous.protobuf.CoverCommandRequestKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.CoverCommandRequest.newBuilder()).apply { block() }._build()
public object CoverCommandRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.CoverCommandRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.CoverCommandRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.CoverCommandRequest = _builder.build()

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
     * <pre>
     * legacy: command has been removed in 1.13
     * clients/servers must still send/accept it until the next protocol change
     * </pre>
     *
     * <code>bool has_legacy_command = 2;</code>
     */
    public var hasLegacyCommand: kotlin.Boolean
      @JvmName("getHasLegacyCommand")
      get() = _builder.getHasLegacyCommand()
      @JvmName("setHasLegacyCommand")
      set(value) {
        _builder.setHasLegacyCommand(value)
      }
    /**
     * <pre>
     * legacy: command has been removed in 1.13
     * clients/servers must still send/accept it until the next protocol change
     * </pre>
     *
     * <code>bool has_legacy_command = 2;</code>
     */
    public fun clearHasLegacyCommand() {
      _builder.clearHasLegacyCommand()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LegacyCoverCommand legacy_command = 3;</code>
     */
    public var legacyCommand: it.achdjian.saucer.luminous.protobuf.LegacyCoverCommand
      @JvmName("getLegacyCommand")
      get() = _builder.getLegacyCommand()
      @JvmName("setLegacyCommand")
      set(value) {
        _builder.setLegacyCommand(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LegacyCoverCommand legacy_command = 3;</code>
     */
    public fun clearLegacyCommand() {
      _builder.clearLegacyCommand()
    }

    /**
     * <code>bool has_position = 4;</code>
     */
    public var hasPosition: kotlin.Boolean
      @JvmName("getHasPosition")
      get() = _builder.getHasPosition()
      @JvmName("setHasPosition")
      set(value) {
        _builder.setHasPosition(value)
      }
    /**
     * <code>bool has_position = 4;</code>
     */
    public fun clearHasPosition() {
      _builder.clearHasPosition()
    }

    /**
     * <code>float position = 5;</code>
     */
    public var position: kotlin.Float
      @JvmName("getPosition")
      get() = _builder.getPosition()
      @JvmName("setPosition")
      set(value) {
        _builder.setPosition(value)
      }
    /**
     * <code>float position = 5;</code>
     */
    public fun clearPosition() {
      _builder.clearPosition()
    }

    /**
     * <code>bool has_tilt = 6;</code>
     */
    public var hasTilt: kotlin.Boolean
      @JvmName("getHasTilt")
      get() = _builder.getHasTilt()
      @JvmName("setHasTilt")
      set(value) {
        _builder.setHasTilt(value)
      }
    /**
     * <code>bool has_tilt = 6;</code>
     */
    public fun clearHasTilt() {
      _builder.clearHasTilt()
    }

    /**
     * <code>float tilt = 7;</code>
     */
    public var tilt: kotlin.Float
      @JvmName("getTilt")
      get() = _builder.getTilt()
      @JvmName("setTilt")
      set(value) {
        _builder.setTilt(value)
      }
    /**
     * <code>float tilt = 7;</code>
     */
    public fun clearTilt() {
      _builder.clearTilt()
    }

    /**
     * <code>bool stop = 8;</code>
     */
    public var stop: kotlin.Boolean
      @JvmName("getStop")
      get() = _builder.getStop()
      @JvmName("setStop")
      set(value) {
        _builder.setStop(value)
      }
    /**
     * <code>bool stop = 8;</code>
     */
    public fun clearStop() {
      _builder.clearStop()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.CoverCommandRequest.copy(block: it.achdjian.saucer.luminous.protobuf.CoverCommandRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.CoverCommandRequest =
  it.achdjian.saucer.luminous.protobuf.CoverCommandRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

