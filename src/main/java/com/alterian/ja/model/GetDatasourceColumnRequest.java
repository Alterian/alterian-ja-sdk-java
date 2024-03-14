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
 * GetDatasourceColumnRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetDatasourceColumnRequest {
  public static final String SERIALIZED_NAME_COLUMN_I_D = "ColumnID";
  @SerializedName(SERIALIZED_NAME_COLUMN_I_D)
  private Integer columnID;

  public GetDatasourceColumnRequest() {
  }

  public GetDatasourceColumnRequest columnID(Integer columnID) {
    this.columnID = columnID;
    return this;
  }

   /**
   * Supply the ID of the column that you want to fetch the details of.
   * @return columnID
  **/
  @javax.annotation.Nullable
  public Integer getColumnID() {
    return columnID;
  }

  public void setColumnID(Integer columnID) {
    this.columnID = columnID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDatasourceColumnRequest getDatasourceColumnRequest = (GetDatasourceColumnRequest) o;
    return Objects.equals(this.columnID, getDatasourceColumnRequest.columnID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDatasourceColumnRequest {\n");
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
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
    openapiFields.add("ColumnID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetDatasourceColumnRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDatasourceColumnRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDatasourceColumnRequest is not found in the empty JSON string", GetDatasourceColumnRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDatasourceColumnRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDatasourceColumnRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDatasourceColumnRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDatasourceColumnRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDatasourceColumnRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDatasourceColumnRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDatasourceColumnRequest>() {
           @Override
           public void write(JsonWriter out, GetDatasourceColumnRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDatasourceColumnRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDatasourceColumnRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDatasourceColumnRequest
  * @throws IOException if the JSON string is invalid with respect to GetDatasourceColumnRequest
  */
  public static GetDatasourceColumnRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDatasourceColumnRequest.class);
  }

 /**
  * Convert an instance of GetDatasourceColumnRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
