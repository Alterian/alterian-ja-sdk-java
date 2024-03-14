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
 * EMAuthenticateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class EMAuthenticateRequest {
  public static final String SERIALIZED_NAME_EM_SITE_ID = "EMSiteId";
  @SerializedName(SERIALIZED_NAME_EM_SITE_ID)
  private Integer emSiteId;

  public static final String SERIALIZED_NAME_LOCAL_TIME = "LocalTime";
  @SerializedName(SERIALIZED_NAME_LOCAL_TIME)
  private OffsetDateTime _localTime;

  public static final String SERIALIZED_NAME_LOGIN = "Login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "NewPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public EMAuthenticateRequest() {
  }

  public EMAuthenticateRequest emSiteId(Integer emSiteId) {
    this.emSiteId = emSiteId;
    return this;
  }

   /**
   * EM Site Id obtained from @see(GetEMMappings) or @see(GetEMMapping)
   * @return emSiteId
  **/
  @javax.annotation.Nullable
  public Integer getEmSiteId() {
    return emSiteId;
  }

  public void setEmSiteId(Integer emSiteId) {
    this.emSiteId = emSiteId;
  }


  public EMAuthenticateRequest _localTime(OffsetDateTime _localTime) {
    this._localTime = _localTime;
    return this;
  }

   /**
   * Current local time
   * @return _localTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLocalTime() {
    return _localTime;
  }

  public void setLocalTime(OffsetDateTime _localTime) {
    this._localTime = _localTime;
  }


  public EMAuthenticateRequest login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Login name
   * @return login
  **/
  @javax.annotation.Nullable
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public EMAuthenticateRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * If you are required to change your password, the new password should be provided
   * @return newPassword
  **/
  @javax.annotation.Nullable
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  public EMAuthenticateRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password in SHA format
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMAuthenticateRequest emAuthenticateRequest = (EMAuthenticateRequest) o;
    return Objects.equals(this.emSiteId, emAuthenticateRequest.emSiteId) &&
        Objects.equals(this._localTime, emAuthenticateRequest._localTime) &&
        Objects.equals(this.login, emAuthenticateRequest.login) &&
        Objects.equals(this.newPassword, emAuthenticateRequest.newPassword) &&
        Objects.equals(this.password, emAuthenticateRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emSiteId, _localTime, login, newPassword, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMAuthenticateRequest {\n");
    sb.append("    emSiteId: ").append(toIndentedString(emSiteId)).append("\n");
    sb.append("    _localTime: ").append(toIndentedString(_localTime)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("EMSiteId");
    openapiFields.add("LocalTime");
    openapiFields.add("Login");
    openapiFields.add("NewPassword");
    openapiFields.add("Password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMAuthenticateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMAuthenticateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMAuthenticateRequest is not found in the empty JSON string", EMAuthenticateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMAuthenticateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMAuthenticateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Login") != null && !jsonObj.get("Login").isJsonNull()) && !jsonObj.get("Login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Login").toString()));
      }
      if ((jsonObj.get("NewPassword") != null && !jsonObj.get("NewPassword").isJsonNull()) && !jsonObj.get("NewPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NewPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NewPassword").toString()));
      }
      if ((jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) && !jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMAuthenticateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMAuthenticateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMAuthenticateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMAuthenticateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EMAuthenticateRequest>() {
           @Override
           public void write(JsonWriter out, EMAuthenticateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMAuthenticateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMAuthenticateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMAuthenticateRequest
  * @throws IOException if the JSON string is invalid with respect to EMAuthenticateRequest
  */
  public static EMAuthenticateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMAuthenticateRequest.class);
  }

 /**
  * Convert an instance of EMAuthenticateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

