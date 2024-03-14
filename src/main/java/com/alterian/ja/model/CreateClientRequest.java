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
 * CreateClientRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreateClientRequest {
  public static final String SERIALIZED_NAME_CLIENT_NAME = "ClientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CLIENT_SET_I_D = "ClientSetID";
  @SerializedName(SERIALIZED_NAME_CLIENT_SET_I_D)
  private Integer clientSetID;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DATABASE_SERVER_I_D = "DatabaseServerID";
  @SerializedName(SERIALIZED_NAME_DATABASE_SERVER_I_D)
  private Integer databaseServerID;

  public static final String SERIALIZED_NAME_SOURCE_CLIENT_I_D = "SourceClientID";
  @SerializedName(SERIALIZED_NAME_SOURCE_CLIENT_I_D)
  private Integer sourceClientID;

  public CreateClientRequest() {
  }

  public CreateClientRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * The name of the new client. Method will fail if this client name already exists within the specified @see(ALClientSet)
   * @return clientName
  **/
  @javax.annotation.Nullable
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public CreateClientRequest clientSetID(Integer clientSetID) {
    this.clientSetID = clientSetID;
    return this;
  }

   /**
   * The identifier of the @see(ALClientSet) that this client will be created within. Method will fail if this clientset cannot be found
   * @return clientSetID
  **/
  @javax.annotation.Nullable
  public Integer getClientSetID() {
    return clientSetID;
  }

  public void setClientSetID(Integer clientSetID) {
    this.clientSetID = clientSetID;
  }


  public CreateClientRequest databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * The name of the SQLServer database that this client will create. Method will fail if this database already exists on the specified database server ID.  May only be 50 characters long and must not start with a number nor have special characters
   * @return databaseName
  **/
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public CreateClientRequest databaseServerID(Integer databaseServerID) {
    this.databaseServerID = databaseServerID;
    return this;
  }

   /**
   * The identifier of the database server that the database will be created within. Method will fail if this database server cannot be found
   * @return databaseServerID
  **/
  @javax.annotation.Nullable
  public Integer getDatabaseServerID() {
    return databaseServerID;
  }

  public void setDatabaseServerID(Integer databaseServerID) {
    this.databaseServerID = databaseServerID;
  }


  public CreateClientRequest sourceClientID(Integer sourceClientID) {
    this.sourceClientID = sourceClientID;
    return this;
  }

   /**
   * 
   * @return sourceClientID
  **/
  @javax.annotation.Nullable
  public Integer getSourceClientID() {
    return sourceClientID;
  }

  public void setSourceClientID(Integer sourceClientID) {
    this.sourceClientID = sourceClientID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClientRequest createClientRequest = (CreateClientRequest) o;
    return Objects.equals(this.clientName, createClientRequest.clientName) &&
        Objects.equals(this.clientSetID, createClientRequest.clientSetID) &&
        Objects.equals(this.databaseName, createClientRequest.databaseName) &&
        Objects.equals(this.databaseServerID, createClientRequest.databaseServerID) &&
        Objects.equals(this.sourceClientID, createClientRequest.sourceClientID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, clientSetID, databaseName, databaseServerID, sourceClientID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClientRequest {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientSetID: ").append(toIndentedString(clientSetID)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    databaseServerID: ").append(toIndentedString(databaseServerID)).append("\n");
    sb.append("    sourceClientID: ").append(toIndentedString(sourceClientID)).append("\n");
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
    openapiFields.add("ClientName");
    openapiFields.add("ClientSetID");
    openapiFields.add("DatabaseName");
    openapiFields.add("DatabaseServerID");
    openapiFields.add("SourceClientID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateClientRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateClientRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateClientRequest is not found in the empty JSON string", CreateClientRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateClientRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateClientRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ClientName") != null && !jsonObj.get("ClientName").isJsonNull()) && !jsonObj.get("ClientName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientName").toString()));
      }
      if ((jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) && !jsonObj.get("DatabaseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DatabaseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DatabaseName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateClientRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateClientRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateClientRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateClientRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateClientRequest>() {
           @Override
           public void write(JsonWriter out, CreateClientRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateClientRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateClientRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateClientRequest
  * @throws IOException if the JSON string is invalid with respect to CreateClientRequest
  */
  public static CreateClientRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateClientRequest.class);
  }

 /**
  * Convert an instance of CreateClientRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

