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
 * UpdateStaticTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpdateStaticTokenRequest {
  public static final String SERIALIZED_NAME_TOKEN_TO_UPDATE = "TokenToUpdate";
  @SerializedName(SERIALIZED_NAME_TOKEN_TO_UPDATE)
  private UUID tokenToUpdate;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public UpdateStaticTokenRequest() {
  }

  public UpdateStaticTokenRequest tokenToUpdate(UUID tokenToUpdate) {
    this.tokenToUpdate = tokenToUpdate;
    return this;
  }

   /**
   * @see(CMTokenInformation) to update
   * @return tokenToUpdate
  **/
  @javax.annotation.Nullable
  public UUID getTokenToUpdate() {
    return tokenToUpdate;
  }

  public void setTokenToUpdate(UUID tokenToUpdate) {
    this.tokenToUpdate = tokenToUpdate;
  }


  public UpdateStaticTokenRequest userID(Integer userID) {
    this.userID = userID;
    return this;
  }

   /**
   * UserID to which the static token should be associated
   * @return userID
  **/
  @javax.annotation.Nullable
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStaticTokenRequest updateStaticTokenRequest = (UpdateStaticTokenRequest) o;
    return Objects.equals(this.tokenToUpdate, updateStaticTokenRequest.tokenToUpdate) &&
        Objects.equals(this.userID, updateStaticTokenRequest.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenToUpdate, userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStaticTokenRequest {\n");
    sb.append("    tokenToUpdate: ").append(toIndentedString(tokenToUpdate)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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
    openapiFields.add("TokenToUpdate");
    openapiFields.add("UserID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateStaticTokenRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateStaticTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateStaticTokenRequest is not found in the empty JSON string", UpdateStaticTokenRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateStaticTokenRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateStaticTokenRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TokenToUpdate") != null && !jsonObj.get("TokenToUpdate").isJsonNull()) && !jsonObj.get("TokenToUpdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TokenToUpdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TokenToUpdate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateStaticTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateStaticTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateStaticTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateStaticTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateStaticTokenRequest>() {
           @Override
           public void write(JsonWriter out, UpdateStaticTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateStaticTokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateStaticTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateStaticTokenRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateStaticTokenRequest
  */
  public static UpdateStaticTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateStaticTokenRequest.class);
  }

 /**
  * Convert an instance of UpdateStaticTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

