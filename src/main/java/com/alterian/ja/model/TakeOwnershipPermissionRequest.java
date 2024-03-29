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
import com.alterian.ja.model.ResourceType;
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
 * TakeOwnershipPermissionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TakeOwnershipPermissionRequest {
  public static final String SERIALIZED_NAME_ITEM_I_D = "ItemID";
  @SerializedName(SERIALIZED_NAME_ITEM_I_D)
  private Integer itemID;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "ItemType";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private ResourceType itemType;

  public static final String SERIALIZED_NAME_NEW_OWNER_I_D = "NewOwnerID";
  @SerializedName(SERIALIZED_NAME_NEW_OWNER_I_D)
  private Integer newOwnerID;

  public TakeOwnershipPermissionRequest() {
  }

  public TakeOwnershipPermissionRequest itemID(Integer itemID) {
    this.itemID = itemID;
    return this;
  }

   /**
   * Item to take ownership of
   * @return itemID
  **/
  @javax.annotation.Nullable
  public Integer getItemID() {
    return itemID;
  }

  public void setItemID(Integer itemID) {
    this.itemID = itemID;
  }


  public TakeOwnershipPermissionRequest itemType(ResourceType itemType) {
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


  public TakeOwnershipPermissionRequest newOwnerID(Integer newOwnerID) {
    this.newOwnerID = newOwnerID;
    return this;
  }

   /**
   * ID of the new owner
   * @return newOwnerID
  **/
  @javax.annotation.Nullable
  public Integer getNewOwnerID() {
    return newOwnerID;
  }

  public void setNewOwnerID(Integer newOwnerID) {
    this.newOwnerID = newOwnerID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TakeOwnershipPermissionRequest takeOwnershipPermissionRequest = (TakeOwnershipPermissionRequest) o;
    return Objects.equals(this.itemID, takeOwnershipPermissionRequest.itemID) &&
        Objects.equals(this.itemType, takeOwnershipPermissionRequest.itemType) &&
        Objects.equals(this.newOwnerID, takeOwnershipPermissionRequest.newOwnerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemID, itemType, newOwnerID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TakeOwnershipPermissionRequest {\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    newOwnerID: ").append(toIndentedString(newOwnerID)).append("\n");
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
    openapiFields.add("ItemID");
    openapiFields.add("ItemType");
    openapiFields.add("NewOwnerID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TakeOwnershipPermissionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TakeOwnershipPermissionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TakeOwnershipPermissionRequest is not found in the empty JSON string", TakeOwnershipPermissionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TakeOwnershipPermissionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TakeOwnershipPermissionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ItemType`
      if (jsonObj.get("ItemType") != null && !jsonObj.get("ItemType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("ItemType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TakeOwnershipPermissionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TakeOwnershipPermissionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TakeOwnershipPermissionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TakeOwnershipPermissionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TakeOwnershipPermissionRequest>() {
           @Override
           public void write(JsonWriter out, TakeOwnershipPermissionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TakeOwnershipPermissionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TakeOwnershipPermissionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TakeOwnershipPermissionRequest
  * @throws IOException if the JSON string is invalid with respect to TakeOwnershipPermissionRequest
  */
  public static TakeOwnershipPermissionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TakeOwnershipPermissionRequest.class);
  }

 /**
  * Convert an instance of TakeOwnershipPermissionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

