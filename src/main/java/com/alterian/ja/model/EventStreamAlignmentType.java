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
 * Streams can be aligned to a particular alignment event type
 */
@JsonAdapter(EventStreamAlignmentType.Adapter.class)
public enum EventStreamAlignmentType {
  
  /**
   * No alignment required
   */
  None(0),
  
  /**
   * All event streams to be left aligned based on the specified alignment event type
   */
  Left(1),
  
  /**
   * All event streams to be right aligned based on the specified alignment event type
   */
  Right(2),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  EventStreamAlignmentType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventStreamAlignmentType fromValue(Integer value) {
    for (EventStreamAlignmentType b : EventStreamAlignmentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<EventStreamAlignmentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventStreamAlignmentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventStreamAlignmentType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return EventStreamAlignmentType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    EventStreamAlignmentType.fromValue(value);
  }
}

