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
import com.alterian.ja.model.APILastModifiedCursor;
import com.alterian.ja.model.ColumnMatchList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * GetPatternRecordsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetPatternRecordsRequest {
  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APILastModifiedCursor cursor;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<ColumnMatchList> filters;

  public static final String SERIALIZED_NAME_PATTERN_ID = "PatternId";
  @SerializedName(SERIALIZED_NAME_PATTERN_ID)
  private Integer patternId;

  public GetPatternRecordsRequest() {
  }

  public GetPatternRecordsRequest cursor(APILastModifiedCursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public APILastModifiedCursor getCursor() {
    return cursor;
  }

  public void setCursor(APILastModifiedCursor cursor) {
    this.cursor = cursor;
  }


  public GetPatternRecordsRequest filters(List<ColumnMatchList> filters) {
    this.filters = filters;
    return this;
  }

  public GetPatternRecordsRequest addFiltersItem(ColumnMatchList filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Additional columns to filter on
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<ColumnMatchList> getFilters() {
    return filters;
  }

  public void setFilters(List<ColumnMatchList> filters) {
    this.filters = filters;
  }


  public GetPatternRecordsRequest patternId(Integer patternId) {
    this.patternId = patternId;
    return this;
  }

   /**
   * The ID of the pattern
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
    GetPatternRecordsRequest getPatternRecordsRequest = (GetPatternRecordsRequest) o;
    return Objects.equals(this.cursor, getPatternRecordsRequest.cursor) &&
        Objects.equals(this.filters, getPatternRecordsRequest.filters) &&
        Objects.equals(this.patternId, getPatternRecordsRequest.patternId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, filters, patternId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPatternRecordsRequest {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("Cursor");
    openapiFields.add("Filters");
    openapiFields.add("PatternId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetPatternRecordsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPatternRecordsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPatternRecordsRequest is not found in the empty JSON string", GetPatternRecordsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPatternRecordsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPatternRecordsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APILastModifiedCursor.validateJsonElement(jsonObj.get("Cursor"));
      }
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("Filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Filters` to be an array in the JSON string but got `%s`", jsonObj.get("Filters").toString()));
          }

          // validate the optional field `Filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            ColumnMatchList.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPatternRecordsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPatternRecordsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPatternRecordsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPatternRecordsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPatternRecordsRequest>() {
           @Override
           public void write(JsonWriter out, GetPatternRecordsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPatternRecordsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetPatternRecordsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPatternRecordsRequest
  * @throws IOException if the JSON string is invalid with respect to GetPatternRecordsRequest
  */
  public static GetPatternRecordsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPatternRecordsRequest.class);
  }

 /**
  * Convert an instance of GetPatternRecordsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

