//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializelistEntitiesBinarySensorResponse")
public inline fun listEntitiesBinarySensorResponse(block: it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse =
  it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse.newBuilder()).apply { block() }._build()
public object ListEntitiesBinarySensorResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse = _builder.build()

    /**
     * <code>string object_id = 1;</code>
     */
    public var objectId: kotlin.String
      @JvmName("getObjectId")
      get() = _builder.getObjectId()
      @JvmName("setObjectId")
      set(value) {
        _builder.setObjectId(value)
      }
    /**
     * <code>string object_id = 1;</code>
     */
    public fun clearObjectId() {
      _builder.clearObjectId()
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
     * <code>string name = 3;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 3;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>string unique_id = 4;</code>
     */
    public var uniqueId: kotlin.String
      @JvmName("getUniqueId")
      get() = _builder.getUniqueId()
      @JvmName("setUniqueId")
      set(value) {
        _builder.setUniqueId(value)
      }
    /**
     * <code>string unique_id = 4;</code>
     */
    public fun clearUniqueId() {
      _builder.clearUniqueId()
    }

    /**
     * <code>string device_class = 5;</code>
     */
    public var deviceClass: kotlin.String
      @JvmName("getDeviceClass")
      get() = _builder.getDeviceClass()
      @JvmName("setDeviceClass")
      set(value) {
        _builder.setDeviceClass(value)
      }
    /**
     * <code>string device_class = 5;</code>
     */
    public fun clearDeviceClass() {
      _builder.clearDeviceClass()
    }

    /**
     * <code>bool is_status_binary_sensor = 6;</code>
     */
    public var isStatusBinarySensor: kotlin.Boolean
      @JvmName("getIsStatusBinarySensor")
      get() = _builder.getIsStatusBinarySensor()
      @JvmName("setIsStatusBinarySensor")
      set(value) {
        _builder.setIsStatusBinarySensor(value)
      }
    /**
     * <code>bool is_status_binary_sensor = 6;</code>
     */
    public fun clearIsStatusBinarySensor() {
      _builder.clearIsStatusBinarySensor()
    }

    /**
     * <code>bool disabled_by_default = 7;</code>
     */
    public var disabledByDefault: kotlin.Boolean
      @JvmName("getDisabledByDefault")
      get() = _builder.getDisabledByDefault()
      @JvmName("setDisabledByDefault")
      set(value) {
        _builder.setDisabledByDefault(value)
      }
    /**
     * <code>bool disabled_by_default = 7;</code>
     */
    public fun clearDisabledByDefault() {
      _builder.clearDisabledByDefault()
    }

    /**
     * <code>string icon = 8;</code>
     */
    public var icon: kotlin.String
      @JvmName("getIcon")
      get() = _builder.getIcon()
      @JvmName("setIcon")
      set(value) {
        _builder.setIcon(value)
      }
    /**
     * <code>string icon = 8;</code>
     */
    public fun clearIcon() {
      _builder.clearIcon()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 9;</code>
     */
    public var entityCategory: it.achdjian.saucer.luminous.protobuf.EntityCategory
      @JvmName("getEntityCategory")
      get() = _builder.getEntityCategory()
      @JvmName("setEntityCategory")
      set(value) {
        _builder.setEntityCategory(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 9;</code>
     */
    public fun clearEntityCategory() {
      _builder.clearEntityCategory()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse.copy(block: it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponse =
  it.achdjian.saucer.luminous.protobuf.ListEntitiesBinarySensorResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

