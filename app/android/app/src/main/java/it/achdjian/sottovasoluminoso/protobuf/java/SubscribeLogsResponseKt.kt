//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

@kotlin.jvm.JvmName("-initializesubscribeLogsResponse")
public inline fun subscribeLogsResponse(block: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse =
  it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponseKt.Dsl._create(it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse.newBuilder()).apply { block() }._build()
public object SubscribeLogsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse = _builder.build()

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.LogLevel level = 1;</code>
     */
    public var level: it.achdjian.sottovasoluminoso.protobuf.java.LogLevel
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
public inline fun it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse.copy(block: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponse =
  it.achdjian.sottovasoluminoso.protobuf.java.SubscribeLogsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

