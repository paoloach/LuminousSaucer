//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializelistEntitiesSensorResponse")
public inline fun listEntitiesSensorResponse(block: it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse =
  it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse.newBuilder()).apply { block() }._build()
public object ListEntitiesSensorResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse = _builder.build()

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
     * <code>string icon = 5;</code>
     */
    public var icon: kotlin.String
      @JvmName("getIcon")
      get() = _builder.getIcon()
      @JvmName("setIcon")
      set(value) {
        _builder.setIcon(value)
      }
    /**
     * <code>string icon = 5;</code>
     */
    public fun clearIcon() {
      _builder.clearIcon()
    }

    /**
     * <code>string unit_of_measurement = 6;</code>
     */
    public var unitOfMeasurement: kotlin.String
      @JvmName("getUnitOfMeasurement")
      get() = _builder.getUnitOfMeasurement()
      @JvmName("setUnitOfMeasurement")
      set(value) {
        _builder.setUnitOfMeasurement(value)
      }
    /**
     * <code>string unit_of_measurement = 6;</code>
     */
    public fun clearUnitOfMeasurement() {
      _builder.clearUnitOfMeasurement()
    }

    /**
     * <code>int32 accuracy_decimals = 7;</code>
     */
    public var accuracyDecimals: kotlin.Int
      @JvmName("getAccuracyDecimals")
      get() = _builder.getAccuracyDecimals()
      @JvmName("setAccuracyDecimals")
      set(value) {
        _builder.setAccuracyDecimals(value)
      }
    /**
     * <code>int32 accuracy_decimals = 7;</code>
     */
    public fun clearAccuracyDecimals() {
      _builder.clearAccuracyDecimals()
    }

    /**
     * <code>bool force_update = 8;</code>
     */
    public var forceUpdate: kotlin.Boolean
      @JvmName("getForceUpdate")
      get() = _builder.getForceUpdate()
      @JvmName("setForceUpdate")
      set(value) {
        _builder.setForceUpdate(value)
      }
    /**
     * <code>bool force_update = 8;</code>
     */
    public fun clearForceUpdate() {
      _builder.clearForceUpdate()
    }

    /**
     * <code>string device_class = 9;</code>
     */
    public var deviceClass: kotlin.String
      @JvmName("getDeviceClass")
      get() = _builder.getDeviceClass()
      @JvmName("setDeviceClass")
      set(value) {
        _builder.setDeviceClass(value)
      }
    /**
     * <code>string device_class = 9;</code>
     */
    public fun clearDeviceClass() {
      _builder.clearDeviceClass()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.SensorStateClass state_class = 10;</code>
     */
    public var stateClass: it.achdjian.saucer.luminous.protobuf.SensorStateClass
      @JvmName("getStateClass")
      get() = _builder.getStateClass()
      @JvmName("setStateClass")
      set(value) {
        _builder.setStateClass(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.SensorStateClass state_class = 10;</code>
     */
    public fun clearStateClass() {
      _builder.clearStateClass()
    }

    /**
     * <pre>
     * Last reset type removed in 2021.9.0
     * </pre>
     *
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.SensorLastResetType legacy_last_reset_type = 11;</code>
     */
    public var legacyLastResetType: it.achdjian.saucer.luminous.protobuf.SensorLastResetType
      @JvmName("getLegacyLastResetType")
      get() = _builder.getLegacyLastResetType()
      @JvmName("setLegacyLastResetType")
      set(value) {
        _builder.setLegacyLastResetType(value)
      }
    /**
     * <pre>
     * Last reset type removed in 2021.9.0
     * </pre>
     *
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.SensorLastResetType legacy_last_reset_type = 11;</code>
     */
    public fun clearLegacyLastResetType() {
      _builder.clearLegacyLastResetType()
    }

    /**
     * <code>bool disabled_by_default = 12;</code>
     */
    public var disabledByDefault: kotlin.Boolean
      @JvmName("getDisabledByDefault")
      get() = _builder.getDisabledByDefault()
      @JvmName("setDisabledByDefault")
      set(value) {
        _builder.setDisabledByDefault(value)
      }
    /**
     * <code>bool disabled_by_default = 12;</code>
     */
    public fun clearDisabledByDefault() {
      _builder.clearDisabledByDefault()
    }

    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 13;</code>
     */
    public var entityCategory: it.achdjian.saucer.luminous.protobuf.EntityCategory
      @JvmName("getEntityCategory")
      get() = _builder.getEntityCategory()
      @JvmName("setEntityCategory")
      set(value) {
        _builder.setEntityCategory(value)
      }
    /**
     * <code>.it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory entity_category = 13;</code>
     */
    public fun clearEntityCategory() {
      _builder.clearEntityCategory()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse.copy(block: it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponse =
  it.achdjian.saucer.luminous.protobuf.ListEntitiesSensorResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

