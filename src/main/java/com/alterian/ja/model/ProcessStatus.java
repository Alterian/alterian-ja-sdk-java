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
@JsonAdapter(ProcessStatus.Adapter.class)
public enum ProcessStatus {
  
  /**
   * 
   */
  Queued(0),
  
  /**
   * 
   */
  PickedUp(1),
  
  /**
   * 
   */
  Started(2),
  
  /**
   * 
   */
  Completed(3),
  
  /**
   * 
   */
  Error(4),
  
  /**
   * 
   */
  UserDefined(5),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  ProcessStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProcessStatus fromValue(Integer value) {
    for (ProcessStatus b : ProcessStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<ProcessStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProcessStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProcessStatus read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ProcessStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    ProcessStatus.fromValue(value);
  }
}

