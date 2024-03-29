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
import com.alterian.ja.model.SearchPredicates;
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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class APIFilter {
  public static final String SERIALIZED_NAME_PREDICATE = "Predicate";
  @SerializedName(SERIALIZED_NAME_PREDICATE)
  private SearchPredicates predicate;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_DATA_SOURCE_I_D = "DataSourceID";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_I_D)
  private Integer dataSourceID;

  public static final String SERIALIZED_NAME_DATABASE_I_D = "DatabaseID";
  @SerializedName(SERIALIZED_NAME_DATABASE_I_D)
  private Integer databaseID;

  public static final String SERIALIZED_NAME_TABLE_I_D = "TableID";
  @SerializedName(SERIALIZED_NAME_TABLE_I_D)
  private Integer tableID;

  public APIFilter() {
  }

  public APIFilter predicate(SearchPredicates predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Get predicate
   * @return predicate
  **/
  @javax.annotation.Nullable
  public SearchPredicates getPredicate() {
    return predicate;
  }

  public void setPredicate(SearchPredicates predicate) {
    this.predicate = predicate;
  }


  public APIFilter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public APIFilter dataSourceID(Integer dataSourceID) {
    this.dataSourceID = dataSourceID;
    return this;
  }

   /**
   * 
   * @return dataSourceID
  **/
  @javax.annotation.Nullable
  public Integer getDataSourceID() {
    return dataSourceID;
  }

  public void setDataSourceID(Integer dataSourceID) {
    this.dataSourceID = dataSourceID;
  }


  public APIFilter databaseID(Integer databaseID) {
    this.databaseID = databaseID;
    return this;
  }

   /**
   * 
   * @return databaseID
  **/
  @javax.annotation.Nullable
  public Integer getDatabaseID() {
    return databaseID;
  }

  public void setDatabaseID(Integer databaseID) {
    this.databaseID = databaseID;
  }


  public APIFilter tableID(Integer tableID) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIFilter apIFilter = (APIFilter) o;
    return Objects.equals(this.predicate, apIFilter.predicate) &&
        Objects.equals(this.value, apIFilter.value) &&
        Objects.equals(this.dataSourceID, apIFilter.dataSourceID) &&
        Objects.equals(this.databaseID, apIFilter.databaseID) &&
        Objects.equals(this.tableID, apIFilter.tableID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicate, value, dataSourceID, databaseID, tableID);
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
    sb.append("class APIFilter {\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dataSourceID: ").append(toIndentedString(dataSourceID)).append("\n");
    sb.append("    databaseID: ").append(toIndentedString(databaseID)).append("\n");
    sb.append("    tableID: ").append(toIndentedString(tableID)).append("\n");
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
    openapiFields.add("Predicate");
    openapiFields.add("Value");
    openapiFields.add("DataSourceID");
    openapiFields.add("DatabaseID");
    openapiFields.add("TableID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to APIFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!APIFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIFilter is not found in the empty JSON string", APIFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!APIFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Predicate`
      if (jsonObj.get("Predicate") != null && !jsonObj.get("Predicate").isJsonNull()) {
        SearchPredicates.validateJsonElement(jsonObj.get("Predicate"));
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<APIFilter>() {
           @Override
           public void write(JsonWriter out, APIFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIFilter
  * @throws IOException if the JSON string is invalid with respect to APIFilter
  */
  public static APIFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIFilter.class);
  }

 /**
  * Convert an instance of APIFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

