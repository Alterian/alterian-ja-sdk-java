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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ALDatasourceJoinColumn {
  public static final String SERIALIZED_NAME_JOIN_I_D = "JoinID";
  @SerializedName(SERIALIZED_NAME_JOIN_I_D)
  private Integer joinID;

  public static final String SERIALIZED_NAME_COLUMN_I_D = "ColumnID";
  @SerializedName(SERIALIZED_NAME_COLUMN_I_D)
  private Integer columnID;

  public static final String SERIALIZED_NAME_REFERENCED_COLUMN_I_D = "ReferencedColumnID";
  @SerializedName(SERIALIZED_NAME_REFERENCED_COLUMN_I_D)
  private Integer referencedColumnID;

  public ALDatasourceJoinColumn() {
  }

  public ALDatasourceJoinColumn joinID(Integer joinID) {
    this.joinID = joinID;
    return this;
  }

   /**
   * 
   * @return joinID
  **/
  @javax.annotation.Nullable
  public Integer getJoinID() {
    return joinID;
  }

  public void setJoinID(Integer joinID) {
    this.joinID = joinID;
  }


  public ALDatasourceJoinColumn columnID(Integer columnID) {
    this.columnID = columnID;
    return this;
  }

   /**
   * 
   * @return columnID
  **/
  @javax.annotation.Nullable
  public Integer getColumnID() {
    return columnID;
  }

  public void setColumnID(Integer columnID) {
    this.columnID = columnID;
  }


  public ALDatasourceJoinColumn referencedColumnID(Integer referencedColumnID) {
    this.referencedColumnID = referencedColumnID;
    return this;
  }

   /**
   * 
   * @return referencedColumnID
  **/
  @javax.annotation.Nullable
  public Integer getReferencedColumnID() {
    return referencedColumnID;
  }

  public void setReferencedColumnID(Integer referencedColumnID) {
    this.referencedColumnID = referencedColumnID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALDatasourceJoinColumn alDatasourceJoinColumn = (ALDatasourceJoinColumn) o;
    return Objects.equals(this.joinID, alDatasourceJoinColumn.joinID) &&
        Objects.equals(this.columnID, alDatasourceJoinColumn.columnID) &&
        Objects.equals(this.referencedColumnID, alDatasourceJoinColumn.referencedColumnID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinID, columnID, referencedColumnID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALDatasourceJoinColumn {\n");
    sb.append("    joinID: ").append(toIndentedString(joinID)).append("\n");
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    referencedColumnID: ").append(toIndentedString(referencedColumnID)).append("\n");
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
    openapiFields.add("JoinID");
    openapiFields.add("ColumnID");
    openapiFields.add("ReferencedColumnID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ALDatasourceJoinColumn
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ALDatasourceJoinColumn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ALDatasourceJoinColumn is not found in the empty JSON string", ALDatasourceJoinColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ALDatasourceJoinColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ALDatasourceJoinColumn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ALDatasourceJoinColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ALDatasourceJoinColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ALDatasourceJoinColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ALDatasourceJoinColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<ALDatasourceJoinColumn>() {
           @Override
           public void write(JsonWriter out, ALDatasourceJoinColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ALDatasourceJoinColumn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ALDatasourceJoinColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ALDatasourceJoinColumn
  * @throws IOException if the JSON string is invalid with respect to ALDatasourceJoinColumn
  */
  public static ALDatasourceJoinColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ALDatasourceJoinColumn.class);
  }

 /**
  * Convert an instance of ALDatasourceJoinColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

