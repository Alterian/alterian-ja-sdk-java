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
 * AUTHChangePasswordRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AUTHChangePasswordRequest {
  public static final String SERIALIZED_NAME_LOGIN_ID = "LoginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private UUID loginId;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SITE_ID = "SiteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public AUTHChangePasswordRequest() {
  }

  public AUTHChangePasswordRequest loginId(UUID loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * Id of the login
   * @return loginId
  **/
  @javax.annotation.Nullable
  public UUID getLoginId() {
    return loginId;
  }

  public void setLoginId(UUID loginId) {
    this.loginId = loginId;
  }


  public AUTHChangePasswordRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * New password
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public AUTHChangePasswordRequest siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Id of the CM Site (typically 1)
   * @return siteId
  **/
  @javax.annotation.Nullable
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AUTHChangePasswordRequest auTHChangePasswordRequest = (AUTHChangePasswordRequest) o;
    return Objects.equals(this.loginId, auTHChangePasswordRequest.loginId) &&
        Objects.equals(this.password, auTHChangePasswordRequest.password) &&
        Objects.equals(this.siteId, auTHChangePasswordRequest.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, password, siteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AUTHChangePasswordRequest {\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
    openapiFields.add("Password");
    openapiFields.add("SiteId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AUTHChangePasswordRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AUTHChangePasswordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AUTHChangePasswordRequest is not found in the empty JSON string", AUTHChangePasswordRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AUTHChangePasswordRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AUTHChangePasswordRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LoginId") != null && !jsonObj.get("LoginId").isJsonNull()) && !jsonObj.get("LoginId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginId").toString()));
      }
      if ((jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) && !jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AUTHChangePasswordRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AUTHChangePasswordRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AUTHChangePasswordRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AUTHChangePasswordRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AUTHChangePasswordRequest>() {
           @Override
           public void write(JsonWriter out, AUTHChangePasswordRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AUTHChangePasswordRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AUTHChangePasswordRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AUTHChangePasswordRequest
  * @throws IOException if the JSON string is invalid with respect to AUTHChangePasswordRequest
  */
  public static AUTHChangePasswordRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AUTHChangePasswordRequest.class);
  }

 /**
  * Convert an instance of AUTHChangePasswordRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

