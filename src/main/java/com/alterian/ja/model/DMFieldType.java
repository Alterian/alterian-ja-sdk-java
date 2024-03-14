/*
 * Journey Analytics API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.35.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.ja.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(DMFieldType.Adapter.class)
public enum DMFieldType {
  
  /**
   * Documentation file not found
   */
  DMFT_EMAIL(1),
  
  /**
   * Documentation file not found
   */
  DMFT_STRING(2),
  
  /**
   * Documentation file not found
   */
  DMFT_TEXT(3),
  
  /**
   * Documentation file not found
   */
  DMFT_NUMERIC(4),
  
  /**
   * Documentation file not found
   */
  DMFT_DATE(5),
  
  /**
   * Documentation file not found
   */
  DMFT_BOOLEAN(6),
  
  /**
   * Documentation file not found
   */
  DMFT_DECIMAL(7),
  
  /**
   * Documentation file not found
   */
  DMFT_UNICODE(8),
  
  /**
   * Documentation file not found
   */
  DMFT_PREFERENCE(9),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  DMFieldType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DMFieldType fromValue(Integer value) {
    for (DMFieldType b : DMFieldType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<DMFieldType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DMFieldType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DMFieldType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return DMFieldType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    DMFieldType.fromValue(value);
  }
}
