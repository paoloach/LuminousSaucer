//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializesubscribeStatesRequest")
public inline fun subscribeStatesRequest(block: it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest =
  it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequestKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest.newBuilder()).apply { block() }._build()
public object SubscribeStatesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest.copy(block: it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequest =
  it.achdjian.saucer.luminous.protobuf.SubscribeStatesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

