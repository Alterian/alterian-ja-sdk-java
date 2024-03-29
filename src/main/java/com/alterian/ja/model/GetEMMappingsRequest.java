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
 * GetEMMappingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetEMMappingsRequest {
  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_FOLDER_I_D = "FolderID";
  @SerializedName(SERIALIZED_NAME_FOLDER_I_D)
  private Integer folderID;

  public static final String SERIALIZED_NAME_INCLUDE_CHILDREN = "IncludeChildren";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHILDREN)
  private Boolean includeChildren;

  public GetEMMappingsRequest() {
  }

  public GetEMMappingsRequest cursor(APICursor cursor) {
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


  public GetEMMappingsRequest folderID(Integer folderID) {
    this.folderID = folderID;
    return this;
  }

   /**
   * @see(Folder) from which to return the list of @see(EMMapping)s.  Pass NULL for the root [not contained within a folder]
   * @return folderID
  **/
  @javax.annotation.Nullable
  public Integer getFolderID() {
    return folderID;
  }

  public void setFolderID(Integer folderID) {
    this.folderID = folderID;
  }


  public GetEMMappingsRequest includeChildren(Boolean includeChildren) {
    this.includeChildren = includeChildren;
    return this;
  }

   /**
   * pass TRUE to find any @see(EMUploadMapping)s which are contained within child folders of the FolderID parameter
   * @return includeChildren
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeChildren() {
    return includeChildren;
  }

  public void setIncludeChildren(Boolean includeChildren) {
    this.includeChildren = includeChildren;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEMMappingsRequest getEMMappingsRequest = (GetEMMappingsRequest) o;
    return Objects.equals(this.cursor, getEMMappingsRequest.cursor) &&
        Objects.equals(this.folderID, getEMMappingsRequest.folderID) &&
        Objects.equals(this.includeChildren, getEMMappingsRequest.includeChildren);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, folderID, includeChildren);
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
    sb.append("class GetEMMappingsRequest {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    folderID: ").append(toIndentedString(folderID)).append("\n");
    sb.append("    includeChildren: ").append(toIndentedString(includeChildren)).append("\n");
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
    openapiFields.add("Cursor");
    openapiFields.add("FolderID");
    openapiFields.add("IncludeChildren");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetEMMappingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEMMappingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEMMappingsRequest is not found in the empty JSON string", GetEMMappingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEMMappingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEMMappingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetEMMappingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEMMappingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEMMappingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEMMappingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEMMappingsRequest>() {
           @Override
           public void write(JsonWriter out, GetEMMappingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEMMappingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEMMappingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEMMappingsRequest
  * @throws IOException if the JSON string is invalid with respect to GetEMMappingsRequest
  */
  public static GetEMMappingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEMMappingsRequest.class);
  }

 /**
  * Convert an instance of GetEMMappingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

