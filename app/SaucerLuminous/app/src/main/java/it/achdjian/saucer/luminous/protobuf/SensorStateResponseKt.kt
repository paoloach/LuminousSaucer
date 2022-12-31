//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

@kotlin.jvm.JvmName("-initializesensorStateResponse")
public inline fun sensorStateResponse(block: it.achdjian.saucer.luminous.protobuf.SensorStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SensorStateResponse =
  it.achdjian.saucer.luminous.protobuf.SensorStateResponseKt.Dsl._create(it.achdjian.saucer.luminous.protobuf.SensorStateResponse.newBuilder()).apply { block() }._build()
public object SensorStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: it.achdjian.saucer.luminous.protobuf.SensorStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: it.achdjian.saucer.luminous.protobuf.SensorStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): it.achdjian.saucer.luminous.protobuf.SensorStateResponse = _builder.build()

    /**
     * <code>fixed32 key = 1;</code>
     */
    public var key: kotlin.Int
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>fixed32 key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>float state = 2;</code>
     */
    public var state: kotlin.Float
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * <code>float state = 2;</code>
     */
    public fun clearState() {
      _builder.clearState()
    }

    /**
     * <pre>
     * If the sensor does not have a valid state yet.
     * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
     * </pre>
     *
     * <code>bool missing_state = 3;</code>
     */
    public var missingState: kotlin.Boolean
      @JvmName("getMissingState")
      get() = _builder.getMissingState()
      @JvmName("setMissingState")
      set(value) {
        _builder.setMissingState(value)
      }
    /**
     * <pre>
     * If the sensor does not have a valid state yet.
     * Equivalent to `!obj-&gt;has_state()` - inverse logic to make state packets smaller
     * </pre>
     *
     * <code>bool missing_state = 3;</code>
     */
    public fun clearMissingState() {
      _builder.clearMissingState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun it.achdjian.saucer.luminous.protobuf.SensorStateResponse.copy(block: it.achdjian.saucer.luminous.protobuf.SensorStateResponseKt.Dsl.() -> kotlin.Unit): it.achdjian.saucer.luminous.protobuf.SensorStateResponse =
  it.achdjian.saucer.luminous.protobuf.SensorStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

