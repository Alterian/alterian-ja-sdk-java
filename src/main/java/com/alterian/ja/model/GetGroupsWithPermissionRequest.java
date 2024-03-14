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
 * GetGroupsWithPermissionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetGroupsWithPermissionRequest {
  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_PERMISSION_I_D = "PermissionID";
  @SerializedName(SERIALIZED_NAME_PERMISSION_I_D)
  private Integer permissionID;

  public GetGroupsWithPermissionRequest() {
  }

  public GetGroupsWithPermissionRequest cursor(APICursor cursor) {
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


  public GetGroupsWithPermissionRequest permissionID(Integer permissionID) {
    this.permissionID = permissionID;
    return this;
  }

   /**
   * ID of the permission to check
   * @return permissionID
  **/
  @javax.annotation.Nullable
  public Integer getPermissionID() {
    return permissionID;
  }

  public void setPermissionID(Integer permissionID) {
    this.permissionID = permissionID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsWithPermissionRequest getGroupsWithPermissionRequest = (GetGroupsWithPermissionRequest) o;
    return Objects.equals(this.cursor, getGroupsWithPermissionRequest.cursor) &&
        Objects.equals(this.permissionID, getGroupsWithPermissionRequest.permissionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, permissionID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsWithPermissionRequest {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    permissionID: ").append(toIndentedString(permissionID)).append("\n");
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
    openapiFields.add("PermissionID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetGroupsWithPermissionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGroupsWithPermissionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGroupsWithPermissionRequest is not found in the empty JSON string", GetGroupsWithPermissionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGroupsWithPermissionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGroupsWithPermissionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGroupsWithPermissionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGroupsWithPermissionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGroupsWithPermissionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGroupsWithPermissionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGroupsWithPermissionRequest>() {
           @Override
           public void write(JsonWriter out, GetGroupsWithPermissionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGroupsWithPermissionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGroupsWithPermissionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGroupsWithPermissionRequest
  * @throws IOException if the JSON string is invalid with respect to GetGroupsWithPermissionRequest
  */
  public static GetGroupsWithPermissionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGroupsWithPermissionRequest.class);
  }

 /**
  * Convert an instance of GetGroupsWithPermissionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
