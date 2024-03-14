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
import com.alterian.ja.model.APICursor;
import com.alterian.ja.model.AppliesToType;
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
 * GetDataSourceAttributesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetDataSourceAttributesRequest {
  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_TYPE_I_D = "TypeID";
  @SerializedName(SERIALIZED_NAME_TYPE_I_D)
  private AppliesToType typeID;

  public GetDataSourceAttributesRequest() {
  }

  public GetDataSourceAttributesRequest cursor(APICursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public APICursor getCursor() {
    return cursor;
  }

  public void setCursor(APICursor cursor) {
    this.cursor = cursor;
  }


  public GetDataSourceAttributesRequest typeID(AppliesToType typeID) {
    this.typeID = typeID;
    return this;
  }

   /**
   * Get typeID
   * @return typeID
  **/
  @javax.annotation.Nullable
  public AppliesToType getTypeID() {
    return typeID;
  }

  public void setTypeID(AppliesToType typeID) {
    this.typeID = typeID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDataSourceAttributesRequest getDataSourceAttributesRequest = (GetDataSourceAttributesRequest) o;
    return Objects.equals(this.cursor, getDataSourceAttributesRequest.cursor) &&
        Objects.equals(this.typeID, getDataSourceAttributesRequest.typeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, typeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataSourceAttributesRequest {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
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
    openapiFields.add("TypeID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetDataSourceAttributesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDataSourceAttributesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDataSourceAttributesRequest is not found in the empty JSON string", GetDataSourceAttributesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDataSourceAttributesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDataSourceAttributesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
      // validate the optional field `TypeID`
      if (jsonObj.get("TypeID") != null && !jsonObj.get("TypeID").isJsonNull()) {
        AppliesToType.validateJsonElement(jsonObj.get("TypeID"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDataSourceAttributesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDataSourceAttributesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDataSourceAttributesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDataSourceAttributesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDataSourceAttributesRequest>() {
           @Override
           public void write(JsonWriter out, GetDataSourceAttributesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDataSourceAttributesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDataSourceAttributesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDataSourceAttributesRequest
  * @throws IOException if the JSON string is invalid with respect to GetDataSourceAttributesRequest
  */
  public static GetDataSourceAttributesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDataSourceAttributesRequest.class);
  }

 /**
  * Convert an instance of GetDataSourceAttributesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

