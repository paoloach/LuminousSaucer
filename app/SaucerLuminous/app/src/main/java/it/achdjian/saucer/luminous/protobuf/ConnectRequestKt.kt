//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializeconnectRequest")
public inline fun connectRequest(block: it.achdjian.saucer.luminous.protobuf.ConnectRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ConnectRequest =
  it.achdjian.saucer.luminous.protobuf.ConnectRequestKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.ConnectRequest.newBuilder()).apply { block() }._build()
public object ConnectRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.ConnectRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.ConnectRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.ConnectRequest = _builder.build()

    /**
     * <pre>
     * The password to log in with
     * </pre>
     *
     * <code>string password = 1;</code>
     */
    public var password: kotlin.String
      @JvmName("getPassword")
      get() = _builder.getPassword()
      @JvmName("setPassword")
      set(value) {
        _builder.setPassword(value)
      }
    /**
     * <pre>
     * The password to log in with
     * </pre>
     *
     * <code>string password = 1;</code>
     */
    public fun clearPassword() {
      _builder.clearPassword()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.ConnectRequest.copy(block: it.achdjian.saucer.luminous.protobuf.ConnectRequestKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ConnectRequest =
  it.achdjian.saucer.luminous.protobuf.ConnectRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

