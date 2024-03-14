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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DeletePatternRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DeletePatternRequest {
  public static final String SERIALIZED_NAME_EVENT_STREAM_ID = "EventStreamId";
  @SerializedName(SERIALIZED_NAME_EVENT_STREAM_ID)
  private Integer eventStreamId;

  public static final String SERIALIZED_NAME_PATTERN_ID = "PatternId";
  @SerializedName(SERIALIZED_NAME_PATTERN_ID)
  private Integer patternId;

  public DeletePatternRequest() {
  }

  public DeletePatternRequest eventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
    return this;
  }

   /**
   * Optional Event Stream Id
   * @return eventStreamId
  **/
  @javax.annotation.Nullable
  public Integer getEventStreamId() {
    return eventStreamId;
  }

  public void setEventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
  }


  public DeletePatternRequest patternId(Integer patternId) {
    this.patternId = patternId;
    return this;
  }

   /**
   * Optional Pattern Id
   * @return patternId
  **/
  @javax.annotation.Nullable
  public Integer getPatternId() {
    return patternId;
  }

  public void setPatternId(Integer patternId) {
    this.patternId = patternId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePatternRequest deletePatternRequest = (DeletePatternRequest) o;
    return Objects.equals(this.eventStreamId, deletePatternRequest.eventStreamId) &&
        Objects.equals(this.patternId, deletePatternRequest.patternId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventStreamId, patternId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePatternRequest {\n");
    sb.append("    eventStreamId: ").append(toIndentedString(eventStreamId)).append("\n");
    sb.append("    patternId: ").append(toIndentedString(patternId)).append("\n");
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
    openapiFields.add("PatternId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeletePatternRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeletePatternRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeletePatternRequest is not found in the empty JSON string", DeletePatternRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeletePatternRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeletePatternRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeletePatternRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeletePatternRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeletePatternRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeletePatternRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeletePatternRequest>() {
           @Override
           public void write(JsonWriter out, DeletePatternRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeletePatternRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeletePatternRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeletePatternRequest
  * @throws IOException if the JSON string is invalid with respect to DeletePatternRequest
  */
  public static DeletePatternRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeletePatternRequest.class);
  }

 /**
  * Convert an instance of DeletePatternRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
