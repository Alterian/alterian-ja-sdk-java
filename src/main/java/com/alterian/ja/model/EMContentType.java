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
@JsonAdapter(EMContentType.Adapter.class)
public enum EMContentType {
  
  /**
   * Documentation file not found
   */
  EMCT_HTML(0),
  
  /**
   * Documentation file not found
   */
  EMCT_Text(1),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  EMContentType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EMContentType fromValue(Integer value) {
    for (EMContentType b : EMContentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<EMContentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EMContentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EMContentType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return EMContentType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    EMContentType.fromValue(value);
  }
}

