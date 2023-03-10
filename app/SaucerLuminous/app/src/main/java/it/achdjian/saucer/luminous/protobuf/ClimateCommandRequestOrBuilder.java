// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.saucer.luminous.protobuf;

public interface ClimateCommandRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:it.achdjian.sottovasoluminoso.protobuf.java.ClimateCommandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed32 key = 1;</code>
   * @return The key.
   */
  int getKey();

  /**
   * <code>bool has_mode = 2;</code>
   * @return The hasMode.
   */
  boolean getHasMode();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateMode mode = 3;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateMode mode = 3;</code>
   * @return The mode.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateMode getMode();

  /**
   * <code>bool has_target_temperature = 4;</code>
   * @return The hasTargetTemperature.
   */
  boolean getHasTargetTemperature();

  /**
   * <code>float target_temperature = 5;</code>
   * @return The targetTemperature.
   */
  float getTargetTemperature();

  /**
   * <code>bool has_target_temperature_low = 6;</code>
   * @return The hasTargetTemperatureLow.
   */
  boolean getHasTargetTemperatureLow();

  /**
   * <code>float target_temperature_low = 7;</code>
   * @return The targetTemperatureLow.
   */
  float getTargetTemperatureLow();

  /**
   * <code>bool has_target_temperature_high = 8;</code>
   * @return The hasTargetTemperatureHigh.
   */
  boolean getHasTargetTemperatureHigh();

  /**
   * <code>float target_temperature_high = 9;</code>
   * @return The targetTemperatureHigh.
   */
  float getTargetTemperatureHigh();

  /**
   * <pre>
   * legacy, for older peers, newer ones should use CLIMATE_PRESET_AWAY in preset
   * </pre>
   *
   * <code>bool has_legacy_away = 10;</code>
   * @return The hasLegacyAway.
   */
  boolean getHasLegacyAway();

  /**
   * <code>bool legacy_away = 11;</code>
   * @return The legacyAway.
   */
  boolean getLegacyAway();

  /**
   * <code>bool has_fan_mode = 12;</code>
   * @return The hasFanMode.
   */
  boolean getHasFanMode();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateFanMode fan_mode = 13;</code>
   * @return The enum numeric value on the wire for fanMode.
   */
  int getFanModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateFanMode fan_mode = 13;</code>
   * @return The fanMode.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateFanMode getFanMode();

  /**
   * <code>bool has_swing_mode = 14;</code>
   * @return The hasSwingMode.
   */
  boolean getHasSwingMode();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateSwingMode swing_mode = 15;</code>
   * @return The enum numeric value on the wire for swingMode.
   */
  int getSwingModeValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimateSwingMode swing_mode = 15;</code>
   * @return The swingMode.
   */
  it.achdjian.saucer.luminous.protobuf.ClimateSwingMode getSwingMode();

  /**
   * <code>bool has_custom_fan_mode = 16;</code>
   * @return The hasCustomFanMode.
   */
  boolean getHasCustomFanMode();

  /**
   * <code>string custom_fan_mode = 17;</code>
   * @return The customFanMode.
   */
  java.lang.String getCustomFanMode();
  /**
   * <code>string custom_fan_mode = 17;</code>
   * @return The bytes for customFanMode.
   */
  com.google.protobuf.ByteString
      getCustomFanModeBytes();

  /**
   * <code>bool has_preset = 18;</code>
   * @return The hasPreset.
   */
  boolean getHasPreset();

  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimatePreset preset = 19;</code>
   * @return The enum numeric value on the wire for preset.
   */
  int getPresetValue();
  /**
   * <code>.it.achdjian.sottovasoluminoso.protobuf.java.ClimatePreset preset = 19;</code>
   * @return The preset.
   */
  it.achdjian.saucer.luminous.protobuf.ClimatePreset getPreset();

  /**
   * <code>bool has_custom_preset = 20;</code>
   * @return The hasCustomPreset.
   */
  boolean getHasCustomPreset();

  /**
   * <code>string custom_preset = 21;</code>
   * @return The customPreset.
   */
  java.lang.String getCustomPreset();
  /**
   * <code>string custom_preset = 21;</code>
   * @return The bytes for customPreset.
   */
  com.google.protobuf.ByteString
      getCustomPresetBytes();
}
