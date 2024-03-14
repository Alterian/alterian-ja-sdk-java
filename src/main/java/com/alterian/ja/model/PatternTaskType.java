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
 * Tasks that can be performed against a pattern definition to yield a pattern
 */
@JsonAdapter(PatternTaskType.Adapter.class)
public enum PatternTaskType {
  
  /**
   * Extract the data required to build the pattern
   */
  PrepareData(1),
  
  /**
   * Calculate the pattern result
   */
  Calculate(2),
  
  /**
   * Upload the pattern result into Engine
   */
  Upload(3),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  PatternTaskType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PatternTaskType fromValue(Integer value) {
    for (PatternTaskType b : PatternTaskType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<PatternTaskType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PatternTaskType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PatternTaskType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return PatternTaskType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    PatternTaskType.fromValue(value);
  }
}

