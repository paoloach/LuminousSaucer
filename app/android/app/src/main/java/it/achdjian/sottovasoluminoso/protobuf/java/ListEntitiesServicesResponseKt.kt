//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

@kotlin.jvm.JvmName("-initializelistEntitiesServicesResponse")
public inline fun listEntitiesServicesResponse(block: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse =
  it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponseKt.Dsl._create(it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse.newBuilder()).apply { block() }._build()
public object ListEntitiesServicesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse = _builder.build()

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
     * <code>fixed32 key = 2;</code>
     */
    public var key: kotlin.Int
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>fixed32 key = 2;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ArgsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     */
     public val args: com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getArgsList()
      )
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     * @param value The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addArgs")
    public fun com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>.add(value: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument) {
      _builder.addArgs(value)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     * @param value The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignArgs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>.plusAssign(value: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument) {
      add(value)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     * @param values The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllArgs")
    public fun com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>.addAll(values: kotlin.collections.Iterable<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument>) {
      _builder.addAllArgs(values)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     * @param values The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllArgs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>.plusAssign(values: kotlin.collections.Iterable<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument>) {
      addAll(values)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     * @param index The index to set the value at.
     * @param value The args to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setArgs")
    public operator fun com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>.set(index: kotlin.Int, value: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument) {
      _builder.setArgs(index, value)
    }
    /**
     * <code>repeated .it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument args = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearArgs")
    public fun com.google.protobuf.kotlin.DslList<it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesArgument, ArgsProxy>.clear() {
      _builder.clearArgs()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse.copy(block: it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponse =
  it.achdjian.sottovasoluminoso.protobuf.java.ListEntitiesServicesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

