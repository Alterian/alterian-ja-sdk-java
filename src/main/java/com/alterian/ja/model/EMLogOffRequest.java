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
 * EMLogOffRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class EMLogOffRequest {
  public static final String SERIALIZED_NAME_EM_SITE_ID = "EMSiteId";
  @SerializedName(SERIALIZED_NAME_EM_SITE_ID)
  private Integer emSiteId;

  public static final String SERIALIZED_NAME_EM_TOKEN = "EMToken";
  @SerializedName(SERIALIZED_NAME_EM_TOKEN)
  private String emToken;

  public EMLogOffRequest() {
  }

  public EMLogOffRequest emSiteId(Integer emSiteId) {
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


  public EMLogOffRequest emToken(String emToken) {
    this.emToken = emToken;
    return this;
  }

   /**
   * A valid EM token obtained via @see(EM_Authenticate).
   * @return emToken
  **/
  @javax.annotation.Nullable
  public String getEmToken() {
    return emToken;
  }

  public void setEmToken(String emToken) {
    this.emToken = emToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMLogOffRequest emLogOffRequest = (EMLogOffRequest) o;
    return Objects.equals(this.emSiteId, emLogOffRequest.emSiteId) &&
        Objects.equals(this.emToken, emLogOffRequest.emToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emSiteId, emToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMLogOffRequest {\n");
    sb.append("    emSiteId: ").append(toIndentedString(emSiteId)).append("\n");
    sb.append("    emToken: ").append(toIndentedString(emToken)).append("\n");
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
    openapiFields.add("EMToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMLogOffRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMLogOffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMLogOffRequest is not found in the empty JSON string", EMLogOffRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMLogOffRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMLogOffRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EMToken") != null && !jsonObj.get("EMToken").isJsonNull()) && !jsonObj.get("EMToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EMToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EMToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMLogOffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMLogOffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMLogOffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMLogOffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EMLogOffRequest>() {
           @Override
           public void write(JsonWriter out, EMLogOffRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMLogOffRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMLogOffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMLogOffRequest
  * @throws IOException if the JSON string is invalid with respect to EMLogOffRequest
  */
  public static EMLogOffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMLogOffRequest.class);
  }

 /**
  * Convert an instance of EMLogOffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
