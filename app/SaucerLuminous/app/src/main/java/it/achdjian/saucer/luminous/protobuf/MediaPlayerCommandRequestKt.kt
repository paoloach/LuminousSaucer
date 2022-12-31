//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializemediaPlayerCommandRequest")
public inline fun mediaPlayerCommandRequest(block: it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest =
  it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequestKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest.newBuilder()).apply { block() }._build()
public object MediaPlayerCommandRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest = _builder.build()

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
     * <code>bool has_command = 2;</code>
     */
    public var hasCommand: kotlin.Boolean
      @JvmName("getHasCommand")
      get() = _builder.getHasCommand()
      @JvmName("setHasCommand")
      set(value) {
        _builder.setHasCommand(value)
      }
    /**
     * <code>bool has_command = 2;</code>
     */
    public fun clearHasCommand() {
      _builder.clearHasCommand()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerCommand command = 3;</code>
     */
    public var command: it.achdjian.saucer.luminous.protobuf.MediaPlayerCommand
      @JvmName("getCommand")
      get() = _builder.getCommand()
      @JvmName("setCommand")
      set(value) {
        _builder.setCommand(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.MediaPlayerCommand command = 3;</code>
     */
    public fun clearCommand() {
      _builder.clearCommand()
    }

    /**
     * <code>bool has_volume = 4;</code>
     */
    public var hasVolume: kotlin.Boolean
      @JvmName("getHasVolume")
      get() = _builder.getHasVolume()
      @JvmName("setHasVolume")
      set(value) {
        _builder.setHasVolume(value)
      }
    /**
     * <code>bool has_volume = 4;</code>
     */
    public fun clearHasVolume() {
      _builder.clearHasVolume()
    }

    /**
     * <code>float volume = 5;</code>
     */
    public var volume: kotlin.Float
      @JvmName("getVolume")
      get() = _builder.getVolume()
      @JvmName("setVolume")
      set(value) {
        _builder.setVolume(value)
      }
    /**
     * <code>float volume = 5;</code>
     */
    public fun clearVolume() {
      _builder.clearVolume()
    }

    /**
     * <code>bool has_media_url = 6;</code>
     */
    public var hasMediaUrl: kotlin.Boolean
      @JvmName("getHasMediaUrl")
      get() = _builder.getHasMediaUrl()
      @JvmName("setHasMediaUrl")
      set(value) {
        _builder.setHasMediaUrl(value)
      }
    /**
     * <code>bool has_media_url = 6;</code>
     */
    public fun clearHasMediaUrl() {
      _builder.clearHasMediaUrl()
    }

    /**
     * <code>string media_url = 7;</code>
     */
    public var mediaUrl: kotlin.String
      @JvmName("getMediaUrl")
      get() = _builder.getMediaUrl()
      @JvmName("setMediaUrl")
      set(value) {
        _builder.setMediaUrl(value)
      }
    /**
     * <code>string media_url = 7;</code>
     */
    public fun clearMediaUrl() {
      _builder.clearMediaUrl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest.copy(block: it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequest =
  it.achdjian.saucer.luminous.protobuf.MediaPlayerCommandRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
