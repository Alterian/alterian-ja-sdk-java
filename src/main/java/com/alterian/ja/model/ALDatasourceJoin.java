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
import com.alterian.ja.model.ALDatasourceJoinColumn;
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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ALDatasourceJoin {
  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_TABLE_I_D = "TableID";
  @SerializedName(SERIALIZED_NAME_TABLE_I_D)
  private Integer tableID;

  public static final String SERIALIZED_NAME_REFERENCED_TABLE_I_D = "ReferencedTableID";
  @SerializedName(SERIALIZED_NAME_REFERENCED_TABLE_I_D)
  private Integer referencedTableID;

  public static final String SERIALIZED_NAME_COLUMNS = "Columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ALDatasourceJoinColumn> columns;

  public ALDatasourceJoin() {
  }

  public ALDatasourceJoin ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @javax.annotation.Nullable
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }


  public ALDatasourceJoin tableID(Integer tableID) {
    this.tableID = tableID;
    return this;
  }

   /**
   * 
   * @return tableID
  **/
  @javax.annotation.Nullable
  public Integer getTableID() {
    return tableID;
  }

  public void setTableID(Integer tableID) {
    this.tableID = tableID;
  }


  public ALDatasourceJoin referencedTableID(Integer referencedTableID) {
    this.referencedTableID = referencedTableID;
    return this;
  }

   /**
   * 
   * @return referencedTableID
  **/
  @javax.annotation.Nullable
  public Integer getReferencedTableID() {
    return referencedTableID;
  }

  public void setReferencedTableID(Integer referencedTableID) {
    this.referencedTableID = referencedTableID;
  }


  public ALDatasourceJoin columns(List<ALDatasourceJoinColumn> columns) {
    this.columns = columns;
    return this;
  }

  public ALDatasourceJoin addColumnsItem(ALDatasourceJoinColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * 
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<ALDatasourceJoinColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ALDatasourceJoinColumn> columns) {
    this.columns = columns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALDatasourceJoin alDatasourceJoin = (ALDatasourceJoin) o;
    return Objects.equals(this.ID, alDatasourceJoin.ID) &&
        Objects.equals(this.tableID, alDatasourceJoin.tableID) &&
        Objects.equals(this.referencedTableID, alDatasourceJoin.referencedTableID) &&
        Objects.equals(this.columns, alDatasourceJoin.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, tableID, referencedTableID, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALDatasourceJoin {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    tableID: ").append(toIndentedString(tableID)).append("\n");
    sb.append("    referencedTableID: ").append(toIndentedString(referencedTableID)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
    openapiFields.add("ID");
    openapiFields.add("TableID");
    openapiFields.add("ReferencedTableID");
    openapiFields.add("Columns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ALDatasourceJoin
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ALDatasourceJoin.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ALDatasourceJoin is not found in the empty JSON string", ALDatasourceJoin.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ALDatasourceJoin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ALDatasourceJoin` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Columns") != null && !jsonObj.get("Columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("Columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Columns` to be an array in the JSON string but got `%s`", jsonObj.get("Columns").toString()));
          }

          // validate the optional field `Columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            ALDatasourceJoinColumn.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ALDatasourceJoin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ALDatasourceJoin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ALDatasourceJoin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ALDatasourceJoin.class));

       return (TypeAdapter<T>) new TypeAdapter<ALDatasourceJoin>() {
           @Override
           public void write(JsonWriter out, ALDatasourceJoin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ALDatasourceJoin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ALDatasourceJoin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ALDatasourceJoin
  * @throws IOException if the JSON string is invalid with respect to ALDatasourceJoin
  */
  public static ALDatasourceJoin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ALDatasourceJoin.class);
  }

 /**
  * Convert an instance of ALDatasourceJoin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

