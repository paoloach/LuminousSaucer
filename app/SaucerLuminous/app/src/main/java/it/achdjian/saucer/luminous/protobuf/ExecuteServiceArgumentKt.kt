//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializeexecuteServiceArgument")
public inline fun executeServiceArgument(block: it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument =
  it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.newBuilder()).apply { block() }._build()
public object ExecuteServiceArgumentKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument = _builder.build()

    /**
     * <code>bool bool_ = 1;</code>
     */
    public var bool: kotlin.Boolean
      @JvmName("getBool")
      get() = _builder.getBool()
      @JvmName("setBool")
      set(value) {
        _builder.setBool(value)
      }
    /**
     * <code>bool bool_ = 1;</code>
     */
    public fun clearBool() {
      _builder.clearBool()
    }

    /**
     * <code>int32 legacy_int = 2;</code>
     */
    public var legacyInt: kotlin.Int
      @JvmName("getLegacyInt")
      get() = _builder.getLegacyInt()
      @JvmName("setLegacyInt")
      set(value) {
        _builder.setLegacyInt(value)
      }
    /**
     * <code>int32 legacy_int = 2;</code>
     */
    public fun clearLegacyInt() {
      _builder.clearLegacyInt()
    }

    /**
     * <code>float float_ = 3;</code>
     */
    public var float: kotlin.Float
      @JvmName("getFloat")
      get() = _builder.getFloat()
      @JvmName("setFloat")
      set(value) {
        _builder.setFloat(value)
      }
    /**
     * <code>float float_ = 3;</code>
     */
    public fun clearFloat() {
      _builder.clearFloat()
    }

    /**
     * <code>string string_ = 4;</code>
     */
    public var string: kotlin.String
      @JvmName("getString")
      get() = _builder.getString()
      @JvmName("setString")
      set(value) {
        _builder.setString(value)
      }
    /**
     * <code>string string_ = 4;</code>
     */
    public fun clearString() {
      _builder.clearString()
    }

    /**
     * <pre>
     * ESPHome 1.14 (api v1.3) make int a signed value
     * </pre>
     *
     * <code>sint32 int_ = 5;</code>
     */
    public var int: kotlin.Int
      @JvmName("getInt")
      get() = _builder.getInt()
      @JvmName("setInt")
      set(value) {
        _builder.setInt(value)
      }
    /**
     * <pre>
     * ESPHome 1.14 (api v1.3) make int a signed value
     * </pre>
     *
     * <code>sint32 int_ = 5;</code>
     */
    public fun clearInt() {
      _builder.clearInt()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class BoolArrayProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     */
     public val boolArray: com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getBoolArrayList()
      )
    /**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     * @param value The boolArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addBoolArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>.add(value: kotlin.Boolean) {
      _builder.addBoolArray(value)
    }/**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     * @param value The boolArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignBoolArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>.plusAssign(value: kotlin.Boolean) {
      add(value)
    }/**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     * @param values The boolArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllBoolArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Boolean>) {
      _builder.addAllBoolArray(values)
    }/**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     * @param values The boolArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllBoolArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Boolean>) {
      addAll(values)
    }/**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     * @param index The index to set the value at.
     * @param value The boolArray to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setBoolArray")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>.set(index: kotlin.Int, value: kotlin.Boolean) {
      _builder.setBoolArray(index, value)
    }/**
     * <code>repeated bool bool_array = 6 [packed = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearBoolArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Boolean, BoolArrayProxy>.clear() {
      _builder.clearBoolArray()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IntArrayProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     */
     public val intArray: com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIntArrayList()
      )
    /**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     * @param value The intArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIntArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>.add(value: kotlin.Int) {
      _builder.addIntArray(value)
    }/**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     * @param value The intArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIntArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>.plusAssign(value: kotlin.Int) {
      add(value)
    }/**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     * @param values The intArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIntArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Int>) {
      _builder.addAllIntArray(values)
    }/**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     * @param values The intArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIntArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Int>) {
      addAll(values)
    }/**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     * @param index The index to set the value at.
     * @param value The intArray to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIntArray")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>.set(index: kotlin.Int, value: kotlin.Int) {
      _builder.setIntArray(index, value)
    }/**
     * <code>repeated sint32 int_array = 7 [packed = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIntArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, IntArrayProxy>.clear() {
      _builder.clearIntArray()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FloatArrayProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated float float_array = 8 [packed = false];</code>
     */
     public val floatArray: com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFloatArrayList()
      )
    /**
     * <code>repeated float float_array = 8 [packed = false];</code>
     * @param value The floatArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFloatArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>.add(value: kotlin.Float) {
      _builder.addFloatArray(value)
    }/**
     * <code>repeated float float_array = 8 [packed = false];</code>
     * @param value The floatArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFloatArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>.plusAssign(value: kotlin.Float) {
      add(value)
    }/**
     * <code>repeated float float_array = 8 [packed = false];</code>
     * @param values The floatArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFloatArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Float>) {
      _builder.addAllFloatArray(values)
    }/**
     * <code>repeated float float_array = 8 [packed = false];</code>
     * @param values The floatArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFloatArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Float>) {
      addAll(values)
    }/**
     * <code>repeated float float_array = 8 [packed = false];</code>
     * @param index The index to set the value at.
     * @param value The floatArray to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFloatArray")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>.set(index: kotlin.Int, value: kotlin.Float) {
      _builder.setFloatArray(index, value)
    }/**
     * <code>repeated float float_array = 8 [packed = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFloatArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, FloatArrayProxy>.clear() {
      _builder.clearFloatArray()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class StringArrayProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string string_array = 9;</code>
     * @return A list containing the stringArray.
     */
    public val stringArray: com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getStringArrayList()
      )
    /**
     * <code>repeated string string_array = 9;</code>
     * @param value The stringArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addStringArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>.add(value: kotlin.String) {
      _builder.addStringArray(value)
    }
    /**
     * <code>repeated string string_array = 9;</code>
     * @param value The stringArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignStringArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string string_array = 9;</code>
     * @param values The stringArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllStringArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllStringArray(values)
    }
    /**
     * <code>repeated string string_array = 9;</code>
     * @param values The stringArray to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllStringArray")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string string_array = 9;</code>
     * @param index The index to set the value at.
     * @param value The stringArray to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setStringArray")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setStringArray(index, value)
    }/**
     * <code>repeated string string_array = 9;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearStringArray")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, StringArrayProxy>.clear() {
      _builder.clearStringArray()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument.copy(block: it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgument =
  it.achdjian.saucer.luminous.protobuf.ExecuteServiceArgumentKt.Dsl._create(this.toBuilder()).apply { block() }._build()
