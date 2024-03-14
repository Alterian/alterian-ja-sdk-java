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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alterian.ja.JSON;

/**
 * CreatePatternRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreatePatternRequest {
  public static final String SERIALIZED_NAME_EVENT_STREAM_ID = "EventStreamId";
  @SerializedName(SERIALIZED_NAME_EVENT_STREAM_ID)
  private Integer eventStreamId;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private String settings;

  public static final String SERIALIZED_NAME_SNAPSHOT_END = "SnapshotEnd";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_END)
  private OffsetDateTime snapshotEnd;

  public static final String SERIALIZED_NAME_SNAPSHOT_START = "SnapshotStart";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_START)
  private OffsetDateTime snapshotStart;

  public CreatePatternRequest() {
  }

  public CreatePatternRequest eventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
    return this;
  }

   /**
   * Event stream to create pattern definition against
   * @return eventStreamId
  **/
  @javax.annotation.Nullable
  public Integer getEventStreamId() {
    return eventStreamId;
  }

  public void setEventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
  }


  public CreatePatternRequest settings(String settings) {
    this.settings = settings;
    return this;
  }

   /**
   * JSON describing the pattern e.g. {\&quot;sequence\&quot;:{\&quot;dedup:null\&quot;}, \&quot;detect\&quot;:{\&quot;minrep\&quot;:100}}
   * @return settings
  **/
  @javax.annotation.Nullable
  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }


  public CreatePatternRequest snapshotEnd(OffsetDateTime snapshotEnd) {
    this.snapshotEnd = snapshotEnd;
    return this;
  }

   /**
   * 
   * @return snapshotEnd
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSnapshotEnd() {
    return snapshotEnd;
  }

  public void setSnapshotEnd(OffsetDateTime snapshotEnd) {
    this.snapshotEnd = snapshotEnd;
  }


  public CreatePatternRequest snapshotStart(OffsetDateTime snapshotStart) {
    this.snapshotStart = snapshotStart;
    return this;
  }

   /**
   * 
   * @return snapshotStart
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSnapshotStart() {
    return snapshotStart;
  }

  public void setSnapshotStart(OffsetDateTime snapshotStart) {
    this.snapshotStart = snapshotStart;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePatternRequest createPatternRequest = (CreatePatternRequest) o;
    return Objects.equals(this.eventStreamId, createPatternRequest.eventStreamId) &&
        Objects.equals(this.settings, createPatternRequest.settings) &&
        Objects.equals(this.snapshotEnd, createPatternRequest.snapshotEnd) &&
        Objects.equals(this.snapshotStart, createPatternRequest.snapshotStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventStreamId, settings, snapshotEnd, snapshotStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePatternRequest {\n");
    sb.append("    eventStreamId: ").append(toIndentedString(eventStreamId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    snapshotEnd: ").append(toIndentedString(snapshotEnd)).append("\n");
    sb.append("    snapshotStart: ").append(toIndentedString(snapshotStart)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("EventStreamId");
    openapiFields.add("Settings");
    openapiFields.add("SnapshotEnd");
    openapiFields.add("SnapshotStart");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreatePatternRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePatternRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePatternRequest is not found in the empty JSON string", CreatePatternRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePatternRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePatternRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Settings") != null && !jsonObj.get("Settings").isJsonNull()) && !jsonObj.get("Settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Settings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePatternRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePatternRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePatternRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePatternRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePatternRequest>() {
           @Override
           public void write(JsonWriter out, CreatePatternRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePatternRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePatternRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePatternRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePatternRequest
  */
  public static CreatePatternRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePatternRequest.class);
  }

 /**
  * Convert an instance of CreatePatternRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
