//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

@kotlin.jvm.JvmName("-initializesubscribeHomeAssistantStateResponse")
public inline fun subscribeHomeAssistantStateResponse(block: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse =
  it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponseKt.Dsl._create(it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse.newBuilder()).apply { block() }._build()
public object SubscribeHomeAssistantStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse = _builder.build()

    /**
     * <code>string entity_id = 1;</code>
     */
    public var entityId: kotlin.String
      @JvmName("getEntityId")
      get() = _builder.getEntityId()
      @JvmName("setEntityId")
      set(value) {
        _builder.setEntityId(value)
      }
    /**
     * <code>string entity_id = 1;</code>
     */
    public fun clearEntityId() {
      _builder.clearEntityId()
    }

    /**
     * <code>string attribute = 2;</code>
     */
    public var attribute: kotlin.String
      @JvmName("getAttribute")
      get() = _builder.getAttribute()
      @JvmName("setAttribute")
      set(value) {
        _builder.setAttribute(value)
      }
    /**
     * <code>string attribute = 2;</code>
     */
    public fun clearAttribute() {
      _builder.clearAttribute()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse.copy(block: it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponse =
  it.achdjian.sottovasoluminoso.protobuf.java.SubscribeHomeAssistantStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

