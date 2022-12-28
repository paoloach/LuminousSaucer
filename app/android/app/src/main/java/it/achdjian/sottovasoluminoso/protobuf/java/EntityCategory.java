// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package it.achdjian.sottovasoluminoso.protobuf.java;

/**
 * Protobuf enum {@code it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory}
 */
public enum EntityCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENTITY_CATEGORY_NONE = 0;</code>
   */
  ENTITY_CATEGORY_NONE(0),
  /**
   * <code>ENTITY_CATEGORY_CONFIG = 1;</code>
   */
  ENTITY_CATEGORY_CONFIG(1),
  /**
   * <code>ENTITY_CATEGORY_DIAGNOSTIC = 2;</code>
   */
  ENTITY_CATEGORY_DIAGNOSTIC(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENTITY_CATEGORY_NONE = 0;</code>
   */
  public static final int ENTITY_CATEGORY_NONE_VALUE = 0;
  /**
   * <code>ENTITY_CATEGORY_CONFIG = 1;</code>
   */
  public static final int ENTITY_CATEGORY_CONFIG_VALUE = 1;
  /**
   * <code>ENTITY_CATEGORY_DIAGNOSTIC = 2;</code>
   */
  public static final int ENTITY_CATEGORY_DIAGNOSTIC_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EntityCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EntityCategory forNumber(int value) {
    switch (value) {
      case 0: return ENTITY_CATEGORY_NONE;
      case 1: return ENTITY_CATEGORY_CONFIG;
      case 2: return ENTITY_CATEGORY_DIAGNOSTIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EntityCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EntityCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EntityCategory>() {
          public EntityCategory findValueByNumber(int number) {
            return EntityCategory.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return it.achdjian.sottovasoluminoso.protobuf.java.Api.getDescriptor().getEnumTypes().get(0);
  }

  private static final EntityCategory[] VALUES = values();

  public static EntityCategory valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EntityCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:it.achdjian.sottovasoluminoso.protobuf.java.EntityCategory)
}

