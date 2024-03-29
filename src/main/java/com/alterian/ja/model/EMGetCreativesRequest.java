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
import java.time.OffsetDateTime;
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
 * EMGetCreativesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class EMGetCreativesRequest {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "CreatedByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private Integer createdByUserId;

  public static final String SERIALIZED_NAME_CREATIVE_NAME = "CreativeName";
  @SerializedName(SERIALIZED_NAME_CREATIVE_NAME)
  private String creativeName;

  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_EM_MAPPING_ID = "EMMappingId";
  @SerializedName(SERIALIZED_NAME_EM_MAPPING_ID)
  private Integer emMappingId;

  public static final String SERIALIZED_NAME_MODIFIED_UTC_END_DATE = "ModifiedUtcEndDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_UTC_END_DATE)
  private OffsetDateTime modifiedUtcEndDate;

  public static final String SERIALIZED_NAME_MODIFIED_UTC_START_DATE = "ModifiedUtcStartDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_UTC_START_DATE)
  private OffsetDateTime modifiedUtcStartDate;

  public EMGetCreativesRequest() {
  }

  public EMGetCreativesRequest categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * EM &#39;folder&#39; to restrict results to selected category
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public EMGetCreativesRequest createdByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Created by user id, used for filtering
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }


  public EMGetCreativesRequest creativeName(String creativeName) {
    this.creativeName = creativeName;
    return this;
  }

   /**
   * All or partial value for creative name, used for filtering
   * @return creativeName
  **/
  @javax.annotation.Nullable
  public String getCreativeName() {
    return creativeName;
  }

  public void setCreativeName(String creativeName) {
    this.creativeName = creativeName;
  }


  public EMGetCreativesRequest cursor(APICursor cursor) {
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


  public EMGetCreativesRequest emMappingId(Integer emMappingId) {
    this.emMappingId = emMappingId;
    return this;
  }

   /**
   * Mapping Id to use for EM connection
   * @return emMappingId
  **/
  @javax.annotation.Nullable
  public Integer getEmMappingId() {
    return emMappingId;
  }

  public void setEmMappingId(Integer emMappingId) {
    this.emMappingId = emMappingId;
  }


  public EMGetCreativesRequest modifiedUtcEndDate(OffsetDateTime modifiedUtcEndDate) {
    this.modifiedUtcEndDate = modifiedUtcEndDate;
    return this;
  }

   /**
   * Upper range for modified start date filter
   * @return modifiedUtcEndDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedUtcEndDate() {
    return modifiedUtcEndDate;
  }

  public void setModifiedUtcEndDate(OffsetDateTime modifiedUtcEndDate) {
    this.modifiedUtcEndDate = modifiedUtcEndDate;
  }


  public EMGetCreativesRequest modifiedUtcStartDate(OffsetDateTime modifiedUtcStartDate) {
    this.modifiedUtcStartDate = modifiedUtcStartDate;
    return this;
  }

   /**
   * Lower range for modified start date filter
   * @return modifiedUtcStartDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedUtcStartDate() {
    return modifiedUtcStartDate;
  }

  public void setModifiedUtcStartDate(OffsetDateTime modifiedUtcStartDate) {
    this.modifiedUtcStartDate = modifiedUtcStartDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMGetCreativesRequest emGetCreativesRequest = (EMGetCreativesRequest) o;
    return Objects.equals(this.categoryId, emGetCreativesRequest.categoryId) &&
        Objects.equals(this.createdByUserId, emGetCreativesRequest.createdByUserId) &&
        Objects.equals(this.creativeName, emGetCreativesRequest.creativeName) &&
        Objects.equals(this.cursor, emGetCreativesRequest.cursor) &&
        Objects.equals(this.emMappingId, emGetCreativesRequest.emMappingId) &&
        Objects.equals(this.modifiedUtcEndDate, emGetCreativesRequest.modifiedUtcEndDate) &&
        Objects.equals(this.modifiedUtcStartDate, emGetCreativesRequest.modifiedUtcStartDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, createdByUserId, creativeName, cursor, emMappingId, modifiedUtcEndDate, modifiedUtcStartDate);
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
    sb.append("class EMGetCreativesRequest {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    creativeName: ").append(toIndentedString(creativeName)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    emMappingId: ").append(toIndentedString(emMappingId)).append("\n");
    sb.append("    modifiedUtcEndDate: ").append(toIndentedString(modifiedUtcEndDate)).append("\n");
    sb.append("    modifiedUtcStartDate: ").append(toIndentedString(modifiedUtcStartDate)).append("\n");
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
    openapiFields.add("CategoryId");
    openapiFields.add("CreatedByUserId");
    openapiFields.add("CreativeName");
    openapiFields.add("Cursor");
    openapiFields.add("EMMappingId");
    openapiFields.add("ModifiedUtcEndDate");
    openapiFields.add("ModifiedUtcStartDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMGetCreativesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMGetCreativesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMGetCreativesRequest is not found in the empty JSON string", EMGetCreativesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMGetCreativesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMGetCreativesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CreativeName") != null && !jsonObj.get("CreativeName").isJsonNull()) && !jsonObj.get("CreativeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreativeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreativeName").toString()));
      }
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMGetCreativesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMGetCreativesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMGetCreativesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMGetCreativesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EMGetCreativesRequest>() {
           @Override
           public void write(JsonWriter out, EMGetCreativesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMGetCreativesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMGetCreativesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMGetCreativesRequest
  * @throws IOException if the JSON string is invalid with respect to EMGetCreativesRequest
  */
  public static EMGetCreativesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMGetCreativesRequest.class);
  }

 /**
  * Convert an instance of EMGetCreativesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

