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
 * EMGetFoldersLazyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class EMGetFoldersLazyRequest {
  public static final String SERIALIZED_NAME_EM_MAPPING_ID = "EMMappingId";
  @SerializedName(SERIALIZED_NAME_EM_MAPPING_ID)
  private Integer emMappingId;

  public static final String SERIALIZED_NAME_FOLDER_ID = "FolderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private Integer folderId;

  public static final String SERIALIZED_NAME_INCLUDE_FOLDER_HIERARCHY = "IncludeFolderHierarchy";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FOLDER_HIERARCHY)
  private Boolean includeFolderHierarchy;

  public EMGetFoldersLazyRequest() {
  }

  public EMGetFoldersLazyRequest emMappingId(Integer emMappingId) {
    this.emMappingId = emMappingId;
    return this;
  }

   /**
   * 
   * @return emMappingId
  **/
  @javax.annotation.Nullable
  public Integer getEmMappingId() {
    return emMappingId;
  }

  public void setEmMappingId(Integer emMappingId) {
    this.emMappingId = emMappingId;
  }


  public EMGetFoldersLazyRequest folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * 
   * @return folderId
  **/
  @javax.annotation.Nullable
  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }


  public EMGetFoldersLazyRequest includeFolderHierarchy(Boolean includeFolderHierarchy) {
    this.includeFolderHierarchy = includeFolderHierarchy;
    return this;
  }

   /**
   * 
   * @return includeFolderHierarchy
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeFolderHierarchy() {
    return includeFolderHierarchy;
  }

  public void setIncludeFolderHierarchy(Boolean includeFolderHierarchy) {
    this.includeFolderHierarchy = includeFolderHierarchy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMGetFoldersLazyRequest emGetFoldersLazyRequest = (EMGetFoldersLazyRequest) o;
    return Objects.equals(this.emMappingId, emGetFoldersLazyRequest.emMappingId) &&
        Objects.equals(this.folderId, emGetFoldersLazyRequest.folderId) &&
        Objects.equals(this.includeFolderHierarchy, emGetFoldersLazyRequest.includeFolderHierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emMappingId, folderId, includeFolderHierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMGetFoldersLazyRequest {\n");
    sb.append("    emMappingId: ").append(toIndentedString(emMappingId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    includeFolderHierarchy: ").append(toIndentedString(includeFolderHierarchy)).append("\n");
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
    openapiFields.add("EMMappingId");
    openapiFields.add("FolderId");
    openapiFields.add("IncludeFolderHierarchy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EMGetFoldersLazyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EMGetFoldersLazyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EMGetFoldersLazyRequest is not found in the empty JSON string", EMGetFoldersLazyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EMGetFoldersLazyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EMGetFoldersLazyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EMGetFoldersLazyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EMGetFoldersLazyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EMGetFoldersLazyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EMGetFoldersLazyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EMGetFoldersLazyRequest>() {
           @Override
           public void write(JsonWriter out, EMGetFoldersLazyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EMGetFoldersLazyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EMGetFoldersLazyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EMGetFoldersLazyRequest
  * @throws IOException if the JSON string is invalid with respect to EMGetFoldersLazyRequest
  */
  public static EMGetFoldersLazyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EMGetFoldersLazyRequest.class);
  }

 /**
  * Convert an instance of EMGetFoldersLazyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
