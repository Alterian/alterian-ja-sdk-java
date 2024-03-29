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
 * Provides a mechanism to map CM @see(ALUser) ID and CM @see(ALDataSource) ID into an engine @see(ALDataSourceType).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DatasourceUserMapping {
  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public static final String SERIALIZED_NAME_DATA_SOURCE_I_D = "DataSourceID";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_I_D)
  private Integer dataSourceID;

  public static final String SERIALIZED_NAME_ENGINE_USER_NAME = "EngineUserName";
  @SerializedName(SERIALIZED_NAME_ENGINE_USER_NAME)
  private String engineUserName;

  public DatasourceUserMapping() {
  }

  public DatasourceUserMapping userID(Integer userID) {
    this.userID = userID;
    return this;
  }

   /**
   * 
   * @return userID
  **/
  @javax.annotation.Nullable
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }


  public DatasourceUserMapping dataSourceID(Integer dataSourceID) {
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


  public DatasourceUserMapping engineUserName(String engineUserName) {
    this.engineUserName = engineUserName;
    return this;
  }

   /**
   * 
   * @return engineUserName
  **/
  @javax.annotation.Nullable
  public String getEngineUserName() {
    return engineUserName;
  }

  public void setEngineUserName(String engineUserName) {
    this.engineUserName = engineUserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasourceUserMapping datasourceUserMapping = (DatasourceUserMapping) o;
    return Objects.equals(this.userID, datasourceUserMapping.userID) &&
        Objects.equals(this.dataSourceID, datasourceUserMapping.dataSourceID) &&
        Objects.equals(this.engineUserName, datasourceUserMapping.engineUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, dataSourceID, engineUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasourceUserMapping {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    dataSourceID: ").append(toIndentedString(dataSourceID)).append("\n");
    sb.append("    engineUserName: ").append(toIndentedString(engineUserName)).append("\n");
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
    openapiFields.add("UserID");
    openapiFields.add("DataSourceID");
    openapiFields.add("EngineUserName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasourceUserMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasourceUserMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasourceUserMapping is not found in the empty JSON string", DatasourceUserMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasourceUserMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasourceUserMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EngineUserName") != null && !jsonObj.get("EngineUserName").isJsonNull()) && !jsonObj.get("EngineUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EngineUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EngineUserName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasourceUserMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasourceUserMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasourceUserMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasourceUserMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasourceUserMapping>() {
           @Override
           public void write(JsonWriter out, DatasourceUserMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasourceUserMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasourceUserMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasourceUserMapping
  * @throws IOException if the JSON string is invalid with respect to DatasourceUserMapping
  */
  public static DatasourceUserMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasourceUserMapping.class);
  }

 /**
  * Convert an instance of DatasourceUserMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

