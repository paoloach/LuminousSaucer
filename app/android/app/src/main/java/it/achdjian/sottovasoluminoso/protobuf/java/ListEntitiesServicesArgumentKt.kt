//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

@kotlin.jvm.JvmName("-initializelistEntitiesServicesArgument")
public inline fun listEntitiesServicesArgument(block: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgumentKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument =
  it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgumentKt.Dsl._create(it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument.newBuilder()).apply { block() }._build()
public object ListEntitiesServicesArgumentKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ServiceArgType type = 2;</code>
     */
    public var type: it.achdjian.sottovasoluminoso.protobuf.java.ServiceArgType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ServiceArgType type = 2;</code>
     */
    public fun clearType() {
      _builder.clearType()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument.copy(block: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgumentKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument =
  it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgumentKt.Dsl._create(this.toBuilder()).apply { block() }._build()

