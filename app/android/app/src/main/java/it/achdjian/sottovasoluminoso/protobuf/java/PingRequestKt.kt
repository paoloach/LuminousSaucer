//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

@kotlin.jvm.JvmName("-initializepingRequest")
public inline fun pingRequest(block: it.achdjian.sottovasoluminoso.protobuf.java.PingRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.PingRequest =
  it.achdjian.sottovasoluminoso.protobuf.java.PingRequestKt.Dsl._create(it.achdjian.sottovasoluminoso.protobuf.java.PingRequest.newBuilder()).apply { block() }._build()
public object PingRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.sottovasoluminoso.protobuf.java.PingRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.sottovasoluminoso.protobuf.java.PingRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.sottovasoluminoso.protobuf.java.PingRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.sottovasoluminoso.protobuf.java.PingRequest.copy(block: it.achdjian.sottovasoluminoso.protobuf.java.PingRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.PingRequest =
  it.achdjian.sottovasoluminoso.protobuf.java.PingRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

