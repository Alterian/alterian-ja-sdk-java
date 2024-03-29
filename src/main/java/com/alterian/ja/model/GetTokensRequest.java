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
 * GetTokensRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetTokensRequest {
  public static final String SERIALIZED_NAME_CLIENT_I_D = "ClientID";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D)
  private Integer clientID;

  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_INCLUDE_NON_USER = "IncludeNonUser";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NON_USER)
  private Boolean includeNonUser;

  public static final String SERIALIZED_NAME_INCLUDE_S_A = "IncludeSA";
  @SerializedName(SERIALIZED_NAME_INCLUDE_S_A)
  private Boolean includeSA;

  public static final String SERIALIZED_NAME_INCLUDE_STANDARD = "IncludeStandard";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STANDARD)
  private Boolean includeStandard;

  public static final String SERIALIZED_NAME_INCLUDE_STATIC = "IncludeStatic";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STATIC)
  private Boolean includeStatic;

  public GetTokensRequest() {
  }

  public GetTokensRequest clientID(Integer clientID) {
    this.clientID = clientID;
    return this;
  }

   /**
   * ClientID for which to list tokens.  If \&quot;Token\&quot; parameter is an SA token, \&quot;ClientID\&quot; is used; if the \&quot;Token\&quot; parameter is a regular token, the clientID of the token is used
   * @return clientID
  **/
  @javax.annotation.Nullable
  public Integer getClientID() {
    return clientID;
  }

  public void setClientID(Integer clientID) {
    this.clientID = clientID;
  }


  public GetTokensRequest cursor(APICursor cursor) {
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


  public GetTokensRequest includeNonUser(Boolean includeNonUser) {
    this.includeNonUser = includeNonUser;
    return this;
  }

   /**
   * Include tokens which have no user set.  These types of tokens can&#39;t be used for the majority of API requests.
   * @return includeNonUser
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeNonUser() {
    return includeNonUser;
  }

  public void setIncludeNonUser(Boolean includeNonUser) {
    this.includeNonUser = includeNonUser;
  }


  public GetTokensRequest includeSA(Boolean includeSA) {
    this.includeSA = includeSA;
    return this;
  }

   /**
   * Include sa tokens in the returned list of tokens
   * @return includeSA
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeSA() {
    return includeSA;
  }

  public void setIncludeSA(Boolean includeSA) {
    this.includeSA = includeSA;
  }


  public GetTokensRequest includeStandard(Boolean includeStandard) {
    this.includeStandard = includeStandard;
    return this;
  }

   /**
   * Include regular tokens in the returned list of tokens -- warning, this can be quite large
   * @return includeStandard
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeStandard() {
    return includeStandard;
  }

  public void setIncludeStandard(Boolean includeStandard) {
    this.includeStandard = includeStandard;
  }


  public GetTokensRequest includeStatic(Boolean includeStatic) {
    this.includeStatic = includeStatic;
    return this;
  }

   /**
   * Include static tokens in the returned list of tokens
   * @return includeStatic
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeStatic() {
    return includeStatic;
  }

  public void setIncludeStatic(Boolean includeStatic) {
    this.includeStatic = includeStatic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokensRequest getTokensRequest = (GetTokensRequest) o;
    return Objects.equals(this.clientID, getTokensRequest.clientID) &&
        Objects.equals(this.cursor, getTokensRequest.cursor) &&
        Objects.equals(this.includeNonUser, getTokensRequest.includeNonUser) &&
        Objects.equals(this.includeSA, getTokensRequest.includeSA) &&
        Objects.equals(this.includeStandard, getTokensRequest.includeStandard) &&
        Objects.equals(this.includeStatic, getTokensRequest.includeStatic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientID, cursor, includeNonUser, includeSA, includeStandard, includeStatic);
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
    sb.append("class GetTokensRequest {\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    includeNonUser: ").append(toIndentedString(includeNonUser)).append("\n");
    sb.append("    includeSA: ").append(toIndentedString(includeSA)).append("\n");
    sb.append("    includeStandard: ").append(toIndentedString(includeStandard)).append("\n");
    sb.append("    includeStatic: ").append(toIndentedString(includeStatic)).append("\n");
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
    openapiFields.add("ClientID");
    openapiFields.add("Cursor");
    openapiFields.add("IncludeNonUser");
    openapiFields.add("IncludeSA");
    openapiFields.add("IncludeStandard");
    openapiFields.add("IncludeStatic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTokensRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTokensRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTokensRequest is not found in the empty JSON string", GetTokensRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTokensRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTokensRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetTokensRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTokensRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTokensRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTokensRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTokensRequest>() {
           @Override
           public void write(JsonWriter out, GetTokensRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTokensRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTokensRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTokensRequest
  * @throws IOException if the JSON string is invalid with respect to GetTokensRequest
  */
  public static GetTokensRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTokensRequest.class);
  }

 /**
  * Convert an instance of GetTokensRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

