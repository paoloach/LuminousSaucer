//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializesubscribeLogsResponse")
public inline fun subscribeLogsResponse(block: it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse =
  it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse.newBuilder()).apply { block() }._build()
public object SubscribeLogsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse = _builder.build()

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LogLevel level = 1;</code>
     */
    public var level: it.achdjian.saucer.luminous.protobuf.LogLevel
      @JvmName("getLevel")
      get() = _builder.getLevel()
      @JvmName("setLevel")
      set(value) {
        _builder.setLevel(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LogLevel level = 1;</code>
     */
    public fun clearLevel() {
      _builder.clearLevel()
    }

    /**
     * <code>string message = 3;</code>
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * <code>string message = 3;</code>
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }

    /**
     * <code>bool send_failed = 4;</code>
     */
    public var sendFailed: kotlin.Boolean
      @JvmName("getSendFailed")
      get() = _builder.getSendFailed()
      @JvmName("setSendFailed")
      set(value) {
        _builder.setSendFailed(value)
      }
    /**
     * <code>bool send_failed = 4;</code>
     */
    public fun clearSendFailed() {
      _builder.clearSendFailed()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse.copy(block: it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponse =
  it.achdjian.saucer.luminous.protobuf.SubscribeLogsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

