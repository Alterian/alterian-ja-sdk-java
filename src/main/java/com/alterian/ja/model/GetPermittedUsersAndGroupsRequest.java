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
import com.alterian.ja.model.ResourceType;
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
 * GetPermittedUsersAndGroupsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetPermittedUsersAndGroupsRequest {
  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_INVERSE = "inverse";
  @SerializedName(SERIALIZED_NAME_INVERSE)
  private Boolean inverse;

  public static final String SERIALIZED_NAME_ITEM_FOLDER = "ItemFolder";
  @SerializedName(SERIALIZED_NAME_ITEM_FOLDER)
  private Integer itemFolder;

  public static final String SERIALIZED_NAME_ITEM_I_D = "ItemID";
  @SerializedName(SERIALIZED_NAME_ITEM_I_D)
  private Integer itemID;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "ItemType";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private ResourceType itemType;

  public GetPermittedUsersAndGroupsRequest() {
  }

  public GetPermittedUsersAndGroupsRequest cursor(APICursor cursor) {
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


  public GetPermittedUsersAndGroupsRequest inverse(Boolean inverse) {
    this.inverse = inverse;
    return this;
  }

   /**
   * Return back the users and groups which do NOT have permission to this item
   * @return inverse
  **/
  @javax.annotation.Nullable
  public Boolean getInverse() {
    return inverse;
  }

  public void setInverse(Boolean inverse) {
    this.inverse = inverse;
  }


  public GetPermittedUsersAndGroupsRequest itemFolder(Integer itemFolder) {
    this.itemFolder = itemFolder;
    return this;
  }

   /**
   * Folder ID in which this item is contained
   * @return itemFolder
  **/
  @javax.annotation.Nullable
  public Integer getItemFolder() {
    return itemFolder;
  }

  public void setItemFolder(Integer itemFolder) {
    this.itemFolder = itemFolder;
  }


  public GetPermittedUsersAndGroupsRequest itemID(Integer itemID) {
    this.itemID = itemID;
    return this;
  }

   /**
   * ID of the item on which to get permitted users and groups
   * @return itemID
  **/
  @javax.annotation.Nullable
  public Integer getItemID() {
    return itemID;
  }

  public void setItemID(Integer itemID) {
    this.itemID = itemID;
  }


  public GetPermittedUsersAndGroupsRequest itemType(ResourceType itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  public ResourceType getItemType() {
    return itemType;
  }

  public void setItemType(ResourceType itemType) {
    this.itemType = itemType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPermittedUsersAndGroupsRequest getPermittedUsersAndGroupsRequest = (GetPermittedUsersAndGroupsRequest) o;
    return Objects.equals(this.cursor, getPermittedUsersAndGroupsRequest.cursor) &&
        Objects.equals(this.inverse, getPermittedUsersAndGroupsRequest.inverse) &&
        Objects.equals(this.itemFolder, getPermittedUsersAndGroupsRequest.itemFolder) &&
        Objects.equals(this.itemID, getPermittedUsersAndGroupsRequest.itemID) &&
        Objects.equals(this.itemType, getPermittedUsersAndGroupsRequest.itemType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, inverse, itemFolder, itemID, itemType);
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
    sb.append("class GetPermittedUsersAndGroupsRequest {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    inverse: ").append(toIndentedString(inverse)).append("\n");
    sb.append("    itemFolder: ").append(toIndentedString(itemFolder)).append("\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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
    openapiFields.add("inverse");
    openapiFields.add("ItemFolder");
    openapiFields.add("ItemID");
    openapiFields.add("ItemType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetPermittedUsersAndGroupsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPermittedUsersAndGroupsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPermittedUsersAndGroupsRequest is not found in the empty JSON string", GetPermittedUsersAndGroupsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPermittedUsersAndGroupsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPermittedUsersAndGroupsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
      // validate the optional field `ItemType`
      if (jsonObj.get("ItemType") != null && !jsonObj.get("ItemType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("ItemType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPermittedUsersAndGroupsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPermittedUsersAndGroupsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPermittedUsersAndGroupsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPermittedUsersAndGroupsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPermittedUsersAndGroupsRequest>() {
           @Override
           public void write(JsonWriter out, GetPermittedUsersAndGroupsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPermittedUsersAndGroupsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetPermittedUsersAndGroupsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPermittedUsersAndGroupsRequest
  * @throws IOException if the JSON string is invalid with respect to GetPermittedUsersAndGroupsRequest
  */
  public static GetPermittedUsersAndGroupsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPermittedUsersAndGroupsRequest.class);
  }

 /**
  * Convert an instance of GetPermittedUsersAndGroupsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

