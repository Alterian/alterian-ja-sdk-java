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
 * SetLoginBrandDefaultRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SetLoginBrandDefaultRequest {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_LOGIN_ID = "LoginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private UUID loginId;

  public SetLoginBrandDefaultRequest() {
  }

  public SetLoginBrandDefaultRequest brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Brand you would like to default this login to for authentication purposes
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }


  public SetLoginBrandDefaultRequest loginId(UUID loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * The login you would like to set; provide no value and it will use the token to get the login id (current login)
   * @return loginId
  **/
  @javax.annotation.Nullable
  public UUID getLoginId() {
    return loginId;
  }

  public void setLoginId(UUID loginId) {
    this.loginId = loginId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetLoginBrandDefaultRequest setLoginBrandDefaultRequest = (SetLoginBrandDefaultRequest) o;
    return Objects.equals(this.brandId, setLoginBrandDefaultRequest.brandId) &&
        Objects.equals(this.loginId, setLoginBrandDefaultRequest.loginId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, loginId);
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
    sb.append("class SetLoginBrandDefaultRequest {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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
    openapiFields.add("BrandId");
    openapiFields.add("LoginId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SetLoginBrandDefaultRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetLoginBrandDefaultRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetLoginBrandDefaultRequest is not found in the empty JSON string", SetLoginBrandDefaultRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetLoginBrandDefaultRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetLoginBrandDefaultRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!SetLoginBrandDefaultRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetLoginBrandDefaultRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetLoginBrandDefaultRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetLoginBrandDefaultRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetLoginBrandDefaultRequest>() {
           @Override
           public void write(JsonWriter out, SetLoginBrandDefaultRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetLoginBrandDefaultRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetLoginBrandDefaultRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetLoginBrandDefaultRequest
  * @throws IOException if the JSON string is invalid with respect to SetLoginBrandDefaultRequest
  */
  public static SetLoginBrandDefaultRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetLoginBrandDefaultRequest.class);
  }

 /**
  * Convert an instance of SetLoginBrandDefaultRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
