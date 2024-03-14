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
import java.util.UUID;
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
 * GetLoginUserMappingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetLoginUserMappingRequest {
  public static final String SERIALIZED_NAME_LOGIN_ID = "LoginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private UUID loginId;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public GetLoginUserMappingRequest() {
  }

  public GetLoginUserMappingRequest loginId(UUID loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * Search for the user id for this specific login id
   * @return loginId
  **/
  @javax.annotation.Nullable
  public UUID getLoginId() {
    return loginId;
  }

  public void setLoginId(UUID loginId) {
    this.loginId = loginId;
  }


  public GetLoginUserMappingRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Search for the login id for this specific user
   * @return userId
  **/
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoginUserMappingRequest getLoginUserMappingRequest = (GetLoginUserMappingRequest) o;
    return Objects.equals(this.loginId, getLoginUserMappingRequest.loginId) &&
        Objects.equals(this.userId, getLoginUserMappingRequest.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, userId);
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
    sb.append("class GetLoginUserMappingRequest {\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("LoginId");
    openapiFields.add("UserId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetLoginUserMappingRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLoginUserMappingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLoginUserMappingRequest is not found in the empty JSON string", GetLoginUserMappingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLoginUserMappingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLoginUserMappingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LoginId") != null && !jsonObj.get("LoginId").isJsonNull()) && !jsonObj.get("LoginId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLoginUserMappingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLoginUserMappingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLoginUserMappingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLoginUserMappingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLoginUserMappingRequest>() {
           @Override
           public void write(JsonWriter out, GetLoginUserMappingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLoginUserMappingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetLoginUserMappingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLoginUserMappingRequest
  * @throws IOException if the JSON string is invalid with respect to GetLoginUserMappingRequest
  */
  public static GetLoginUserMappingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLoginUserMappingRequest.class);
  }

 /**
  * Convert an instance of GetLoginUserMappingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

