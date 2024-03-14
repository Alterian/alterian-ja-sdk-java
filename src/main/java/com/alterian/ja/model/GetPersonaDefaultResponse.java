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
import com.alterian.ja.model.Persona;
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
 * GetPersonaDefaultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetPersonaDefaultResponse {
  public static final String SERIALIZED_NAME_STATUS_CODE = "StatusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_DEBUG_MESSAGE = "DebugMessage";
  @SerializedName(SERIALIZED_NAME_DEBUG_MESSAGE)
  private String debugMessage;

  public static final String SERIALIZED_NAME_DETAIL = "Detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private List<List<String>> detail;

  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Persona result;

  public GetPersonaDefaultResponse() {
  }

  public GetPersonaDefaultResponse statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * A string constant representing the success or failure of the method call. See the status codes table below.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public GetPersonaDefaultResponse debugMessage(String debugMessage) {
    this.debugMessage = debugMessage;
    return this;
  }

   /**
   * By default, an empty array []. Internal debug messages can be exposed by changing a configuration setting on the server, but be aware that this can leak internal implementation details such as stack calls or method names to the caller.
   * @return debugMessage
  **/
  @javax.annotation.Nullable
  public String getDebugMessage() {
    return debugMessage;
  }

  public void setDebugMessage(String debugMessage) {
    this.debugMessage = debugMessage;
  }


  public GetPersonaDefaultResponse detail(List<List<String>> detail) {
    this.detail = detail;
    return this;
  }

  public GetPersonaDefaultResponse addDetailItem(List<String> detailItem) {
    if (this.detail == null) {
      this.detail = new ArrayList<>();
    }
    this.detail.add(detailItem);
    return this;
  }

   /**
   * Optionally return additional information about this API call             This will typically contain the reason WHY a method failed (if it fails), warnings if success, and other bits of data that             are NOT part of the main result.
   * @return detail
  **/
  @javax.annotation.Nullable
  public List<List<String>> getDetail() {
    return detail;
  }

  public void setDetail(List<List<String>> detail) {
    this.detail = detail;
  }


  public GetPersonaDefaultResponse cursor(APICursor cursor) {
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


  public GetPersonaDefaultResponse result(Persona result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public Persona getResult() {
    return result;
  }

  public void setResult(Persona result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPersonaDefaultResponse getPersonaDefaultResponse = (GetPersonaDefaultResponse) o;
    return Objects.equals(this.statusCode, getPersonaDefaultResponse.statusCode) &&
        Objects.equals(this.debugMessage, getPersonaDefaultResponse.debugMessage) &&
        Objects.equals(this.detail, getPersonaDefaultResponse.detail) &&
        Objects.equals(this.cursor, getPersonaDefaultResponse.cursor) &&
        Objects.equals(this.result, getPersonaDefaultResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, debugMessage, detail, cursor, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPersonaDefaultResponse {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    debugMessage: ").append(toIndentedString(debugMessage)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("StatusCode");
    openapiFields.add("DebugMessage");
    openapiFields.add("Detail");
    openapiFields.add("Cursor");
    openapiFields.add("Result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetPersonaDefaultResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPersonaDefaultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPersonaDefaultResponse is not found in the empty JSON string", GetPersonaDefaultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPersonaDefaultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPersonaDefaultResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("StatusCode") != null && !jsonObj.get("StatusCode").isJsonNull()) && !jsonObj.get("StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StatusCode").toString()));
      }
      if ((jsonObj.get("DebugMessage") != null && !jsonObj.get("DebugMessage").isJsonNull()) && !jsonObj.get("DebugMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DebugMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DebugMessage").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Detail") != null && !jsonObj.get("Detail").isJsonNull() && !jsonObj.get("Detail").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Detail` to be an array in the JSON string but got `%s`", jsonObj.get("Detail").toString()));
      }
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
      // validate the optional field `Result`
      if (jsonObj.get("Result") != null && !jsonObj.get("Result").isJsonNull()) {
        Persona.validateJsonElement(jsonObj.get("Result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPersonaDefaultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPersonaDefaultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPersonaDefaultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPersonaDefaultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPersonaDefaultResponse>() {
           @Override
           public void write(JsonWriter out, GetPersonaDefaultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPersonaDefaultResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetPersonaDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPersonaDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to GetPersonaDefaultResponse
  */
  public static GetPersonaDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPersonaDefaultResponse.class);
  }

 /**
  * Convert an instance of GetPersonaDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

