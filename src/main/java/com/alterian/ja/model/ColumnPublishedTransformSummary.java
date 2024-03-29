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
import com.alterian.ja.model.TransformType;
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
public class ColumnPublishedTransformSummary {
  public static final String SERIALIZED_NAME_COLUMN_NAME = "ColumnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRANSFORM_NAME = "TransformName";
  @SerializedName(SERIALIZED_NAME_TRANSFORM_NAME)
  private String transformName;

  public static final String SERIALIZED_NAME_TRANSFORM_TYPE = "TransformType";
  @SerializedName(SERIALIZED_NAME_TRANSFORM_TYPE)
  private TransformType transformType;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TRANSFORM_ID = "TransformId";
  @SerializedName(SERIALIZED_NAME_TRANSFORM_ID)
  private Integer transformId;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public ColumnPublishedTransformSummary() {
  }

  public ColumnPublishedTransformSummary columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Column against which the transform was applied
   * @return columnName
  **/
  @javax.annotation.Nullable
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public ColumnPublishedTransformSummary alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias that applies when the transform is applied to a column
   * @return alias
  **/
  @javax.annotation.Nullable
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ColumnPublishedTransformSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ColumnPublishedTransformSummary transformName(String transformName) {
    this.transformName = transformName;
    return this;
  }

   /**
   * 
   * @return transformName
  **/
  @javax.annotation.Nullable
  public String getTransformName() {
    return transformName;
  }

  public void setTransformName(String transformName) {
    this.transformName = transformName;
  }


  public ColumnPublishedTransformSummary transformType(TransformType transformType) {
    this.transformType = transformType;
    return this;
  }

   /**
   * Get transformType
   * @return transformType
  **/
  @javax.annotation.Nullable
  public TransformType getTransformType() {
    return transformType;
  }

  public void setTransformType(TransformType transformType) {
    this.transformType = transformType;
  }


  public ColumnPublishedTransformSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the Transform
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ColumnPublishedTransformSummary transformId(Integer transformId) {
    this.transformId = transformId;
    return this;
  }

   /**
   * 
   * @return transformId
  **/
  @javax.annotation.Nullable
  public Integer getTransformId() {
    return transformId;
  }

  public void setTransformId(Integer transformId) {
    this.transformId = transformId;
  }


  public ColumnPublishedTransformSummary version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the Transform
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnPublishedTransformSummary columnPublishedTransformSummary = (ColumnPublishedTransformSummary) o;
    return Objects.equals(this.columnName, columnPublishedTransformSummary.columnName) &&
        Objects.equals(this.alias, columnPublishedTransformSummary.alias) &&
        Objects.equals(this.name, columnPublishedTransformSummary.name) &&
        Objects.equals(this.transformName, columnPublishedTransformSummary.transformName) &&
        Objects.equals(this.transformType, columnPublishedTransformSummary.transformType) &&
        Objects.equals(this.id, columnPublishedTransformSummary.id) &&
        Objects.equals(this.transformId, columnPublishedTransformSummary.transformId) &&
        Objects.equals(this.version, columnPublishedTransformSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, alias, name, transformName, transformType, id, transformId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnPublishedTransformSummary {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transformName: ").append(toIndentedString(transformName)).append("\n");
    sb.append("    transformType: ").append(toIndentedString(transformType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transformId: ").append(toIndentedString(transformId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("ColumnName");
    openapiFields.add("Alias");
    openapiFields.add("Name");
    openapiFields.add("TransformName");
    openapiFields.add("TransformType");
    openapiFields.add("Id");
    openapiFields.add("TransformId");
    openapiFields.add("Version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ColumnPublishedTransformSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ColumnPublishedTransformSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColumnPublishedTransformSummary is not found in the empty JSON string", ColumnPublishedTransformSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ColumnPublishedTransformSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ColumnPublishedTransformSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ColumnName") != null && !jsonObj.get("ColumnName").isJsonNull()) && !jsonObj.get("ColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ColumnName").toString()));
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("TransformName") != null && !jsonObj.get("TransformName").isJsonNull()) && !jsonObj.get("TransformName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransformName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransformName").toString()));
      }
      // validate the optional field `TransformType`
      if (jsonObj.get("TransformType") != null && !jsonObj.get("TransformType").isJsonNull()) {
        TransformType.validateJsonElement(jsonObj.get("TransformType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColumnPublishedTransformSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColumnPublishedTransformSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColumnPublishedTransformSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColumnPublishedTransformSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ColumnPublishedTransformSummary>() {
           @Override
           public void write(JsonWriter out, ColumnPublishedTransformSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ColumnPublishedTransformSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ColumnPublishedTransformSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ColumnPublishedTransformSummary
  * @throws IOException if the JSON string is invalid with respect to ColumnPublishedTransformSummary
  */
  public static ColumnPublishedTransformSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColumnPublishedTransformSummary.class);
  }

 /**
  * Convert an instance of ColumnPublishedTransformSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

