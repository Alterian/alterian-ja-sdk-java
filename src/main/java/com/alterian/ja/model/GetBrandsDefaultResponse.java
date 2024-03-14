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
import com.alterian.ja.model.ALClient;
import com.alterian.ja.model.APICursor;
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
 * GetBrandsDefaultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetBrandsDefaultResponse {
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
  private List<ALClient> result;

  public GetBrandsDefaultResponse() {
  }

  public GetBrandsDefaultResponse statusCode(String statusCode) {
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


  public GetBrandsDefaultResponse debugMessage(String debugMessage) {
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


  public GetBrandsDefaultResponse detail(List<List<String>> detail) {
    this.detail = detail;
    return this;
  }

  public GetBrandsDefaultResponse addDetailItem(List<String> detailItem) {
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


  public GetBrandsDefaultResponse cursor(APICursor cursor) {
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


  public GetBrandsDefaultResponse result(List<ALClient> result) {
    this.result = result;
    return this;
  }

  public GetBrandsDefaultResponse addResultItem(ALClient resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public List<ALClient> getResult() {
    return result;
  }

  public void setResult(List<ALClient> result) {
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
    GetBrandsDefaultResponse getBrandsDefaultResponse = (GetBrandsDefaultResponse) o;
    return Objects.equals(this.statusCode, getBrandsDefaultResponse.statusCode) &&
        Objects.equals(this.debugMessage, getBrandsDefaultResponse.debugMessage) &&
        Objects.equals(this.detail, getBrandsDefaultResponse.detail) &&
        Objects.equals(this.cursor, getBrandsDefaultResponse.cursor) &&
        Objects.equals(this.result, getBrandsDefaultResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, debugMessage, detail, cursor, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBrandsDefaultResponse {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to GetBrandsDefaultResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBrandsDefaultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBrandsDefaultResponse is not found in the empty JSON string", GetBrandsDefaultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBrandsDefaultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBrandsDefaultResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("Result") != null && !jsonObj.get("Result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("Result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Result` to be an array in the JSON string but got `%s`", jsonObj.get("Result").toString()));
          }

          // validate the optional field `Result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            ALClient.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBrandsDefaultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBrandsDefaultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBrandsDefaultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBrandsDefaultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBrandsDefaultResponse>() {
           @Override
           public void write(JsonWriter out, GetBrandsDefaultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBrandsDefaultResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBrandsDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBrandsDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to GetBrandsDefaultResponse
  */
  public static GetBrandsDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBrandsDefaultResponse.class);
  }

 /**
  * Convert an instance of GetBrandsDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

