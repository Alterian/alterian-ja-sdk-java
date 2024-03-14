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
 * MarkDatasourceAsPendingDisableRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MarkDatasourceAsPendingDisableRequest {
  public static final String SERIALIZED_NAME_DATASOURCE_ID = "DatasourceId";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_ID)
  private Integer datasourceId;

  public MarkDatasourceAsPendingDisableRequest() {
  }

  public MarkDatasourceAsPendingDisableRequest datasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * The id of the datasource that you want to mark as pending disable.
   * @return datasourceId
  **/
  @javax.annotation.Nullable
  public Integer getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkDatasourceAsPendingDisableRequest markDatasourceAsPendingDisableRequest = (MarkDatasourceAsPendingDisableRequest) o;
    return Objects.equals(this.datasourceId, markDatasourceAsPendingDisableRequest.datasourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkDatasourceAsPendingDisableRequest {\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
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
    openapiFields.add("DatasourceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarkDatasourceAsPendingDisableRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarkDatasourceAsPendingDisableRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarkDatasourceAsPendingDisableRequest is not found in the empty JSON string", MarkDatasourceAsPendingDisableRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarkDatasourceAsPendingDisableRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarkDatasourceAsPendingDisableRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarkDatasourceAsPendingDisableRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarkDatasourceAsPendingDisableRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarkDatasourceAsPendingDisableRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarkDatasourceAsPendingDisableRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MarkDatasourceAsPendingDisableRequest>() {
           @Override
           public void write(JsonWriter out, MarkDatasourceAsPendingDisableRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarkDatasourceAsPendingDisableRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarkDatasourceAsPendingDisableRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarkDatasourceAsPendingDisableRequest
  * @throws IOException if the JSON string is invalid with respect to MarkDatasourceAsPendingDisableRequest
  */
  public static MarkDatasourceAsPendingDisableRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarkDatasourceAsPendingDisableRequest.class);
  }

 /**
  * Convert an instance of MarkDatasourceAsPendingDisableRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

