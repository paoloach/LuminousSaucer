// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface ClimateStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.ClimateStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateMode mode = 2;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateMode mode = 2;</code>
   * @return The mode.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateMode getMode();

  /**
   * <code>float current_temperature = 3;</code>
   * @return The currentTemperature.
   */
  float getCurrentTemperature();

  /**
   * <code>float target_temperature = 4;</code>
   * @return The targetTemperature.
   */
  float getTargetTemperature();

  /**
   * <code>float target_temperature_low = 5;</code>
   * @return The targetTemperatureLow.
   */
  float getTargetTemperatureLow();

  /**
   * <code>float target_temperature_high = 6;</code>
   * @return The targetTemperatureHigh.
   */
  float getTargetTemperatureHigh();

  /**
   * <pre>
   * For older peers, equal to preset == CLIMATE_PRESET_AWAY
   * </pre>
   *
   * <code>bool legacy_away = 7;</code>
   * @return The legacyAway.
   */
  boolean getLegacyAway();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateAction action = 8;</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateAction action = 8;</code>
   * @return The action.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateAction getAction();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateFanMode fan_mode = 9;</code>
   * @return The enum numeric value on the wire for fanMode.
   */
  int getFanModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateFanMode fan_mode = 9;</code>
   * @return The fanMode.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateFanMode getFanMode();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateSwingMode swing_mode = 10;</code>
   * @return The enum numeric value on the wire for swingMode.
   */
  int getSwingModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateSwingMode swing_mode = 10;</code>
   * @return The swingMode.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateSwingMode getSwingMode();

  /**
   * <code>string custom_fan_mode = 11;</code>
   * @return The customFanMode.
   */
  java.lang.String getCustomFanMode();
  /**
   * <code>string custom_fan_mode = 11;</code>
   * @return The bytes for customFanMode.
   */
  com.google.protobuf.ByteString
      getCustomFanModeBytes();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimatePreset preset = 12;</code>
   * @return The enum numeric value on the wire for preset.
   */
  int getPresetValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimatePreset preset = 12;</code>
   * @return The preset.
   */
  it.achdjian.saucer.luminous.protobuf.ClimatePreset getPreset();

  /**
   * <code>string custom_preset = 13;</code>
   * @return The customPreset.
   */
  java.lang.String getCustomPreset();
  /**
   * <code>string custom_preset = 13;</code>
   * @return The bytes for customPreset.
   */
  com.google.protobuf.ByteString
      getCustomPresetBytes();
}
