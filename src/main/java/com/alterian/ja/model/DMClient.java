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
import com.alterian.ja.model.DMClientSettings;
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
public class DMClient {
  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VIRTUAL_M_T_A = "VirtualMTA";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_M_T_A)
  private String virtualMTA;

  public static final String SERIALIZED_NAME_CONNECTION_STRING = "ConnectionString";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STRING)
  private String connectionString;

  public static final String SERIALIZED_NAME_HASH_TABLE = "HashTable";
  @SerializedName(SERIALIZED_NAME_HASH_TABLE)
  private String hashTable;

  public static final String SERIALIZED_NAME_CONTENT_PATH = "ContentPath";
  @SerializedName(SERIALIZED_NAME_CONTENT_PATH)
  private Object contentPath;

  public static final String SERIALIZED_NAME_CONTENT_U_R_L = "ContentURL";
  @SerializedName(SERIALIZED_NAME_CONTENT_U_R_L)
  private String contentURL;

  public static final String SERIALIZED_NAME_SEATS = "Seats";
  @SerializedName(SERIALIZED_NAME_SEATS)
  private Integer seats;

  public static final String SERIALIZED_NAME_SET_I_D = "SetID";
  @SerializedName(SERIALIZED_NAME_SET_I_D)
  private Integer setID;

  public static final String SERIALIZED_NAME_ICON = "Icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_CONTENT_SERVER_I_D = "ContentServerID";
  @SerializedName(SERIALIZED_NAME_CONTENT_SERVER_I_D)
  private Integer contentServerID;

  public static final String SERIALIZED_NAME_DIRECTORY = "Directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_DB_SERVER_I_D = "DBServerID";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_I_D)
  private Integer dbServerID;

  public static final String SERIALIZED_NAME_DB_NAME = "DBName";
  @SerializedName(SERIALIZED_NAME_DB_NAME)
  private String dbName;

  public static final String SERIALIZED_NAME_MT_A_SERVER_I_D = "MTAServerID";
  @SerializedName(SERIALIZED_NAME_MT_A_SERVER_I_D)
  private Integer mtAServerID;

  public static final String SERIALIZED_NAME_DEFAULT_D_C = "DefaultDC";
  @SerializedName(SERIALIZED_NAME_DEFAULT_D_C)
  private Integer defaultDC;

  public static final String SERIALIZED_NAME_DELIVERY_CONTEXTS = "DeliveryContexts";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONTEXTS)
  private Object deliveryContexts;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private DMClientSettings settings;

  public static final String SERIALIZED_NAME_IMAGE_BASE_PATH = "ImageBasePath";
  @SerializedName(SERIALIZED_NAME_IMAGE_BASE_PATH)
  private String imageBasePath;

  public DMClient() {
  }

  public DMClient ID(Integer ID) {
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


  public DMClient name(String name) {
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


  public DMClient virtualMTA(String virtualMTA) {
    this.virtualMTA = virtualMTA;
    return this;
  }

   /**
   * 
   * @return virtualMTA
  **/
  @javax.annotation.Nullable
  public String getVirtualMTA() {
    return virtualMTA;
  }

  public void setVirtualMTA(String virtualMTA) {
    this.virtualMTA = virtualMTA;
  }


  public DMClient connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * 
   * @return connectionString
  **/
  @javax.annotation.Nullable
  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }


  public DMClient hashTable(String hashTable) {
    this.hashTable = hashTable;
    return this;
  }

   /**
   * 
   * @return hashTable
  **/
  @javax.annotation.Nullable
  public String getHashTable() {
    return hashTable;
  }

  public void setHashTable(String hashTable) {
    this.hashTable = hashTable;
  }


  public DMClient contentPath(Object contentPath) {
    this.contentPath = contentPath;
    return this;
  }

   /**
   * 
   * @return contentPath
  **/
  @javax.annotation.Nullable
  public Object getContentPath() {
    return contentPath;
  }

  public void setContentPath(Object contentPath) {
    this.contentPath = contentPath;
  }


  public DMClient contentURL(String contentURL) {
    this.contentURL = contentURL;
    return this;
  }

   /**
   * 
   * @return contentURL
  **/
  @javax.annotation.Nullable
  public String getContentURL() {
    return contentURL;
  }

  public void setContentURL(String contentURL) {
    this.contentURL = contentURL;
  }


  public DMClient seats(Integer seats) {
    this.seats = seats;
    return this;
  }

   /**
   * 
   * @return seats
  **/
  @javax.annotation.Nullable
  public Integer getSeats() {
    return seats;
  }

  public void setSeats(Integer seats) {
    this.seats = seats;
  }


  public DMClient setID(Integer setID) {
    this.setID = setID;
    return this;
  }

   /**
   * 
   * @return setID
  **/
  @javax.annotation.Nullable
  public Integer getSetID() {
    return setID;
  }

  public void setSetID(Integer setID) {
    this.setID = setID;
  }


  public DMClient icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * 
   * @return icon
  **/
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public DMClient contentServerID(Integer contentServerID) {
    this.contentServerID = contentServerID;
    return this;
  }

   /**
   * 
   * @return contentServerID
  **/
  @javax.annotation.Nullable
  public Integer getContentServerID() {
    return contentServerID;
  }

  public void setContentServerID(Integer contentServerID) {
    this.contentServerID = contentServerID;
  }


  public DMClient directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * 
   * @return directory
  **/
  @javax.annotation.Nullable
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public DMClient dbServerID(Integer dbServerID) {
    this.dbServerID = dbServerID;
    return this;
  }

   /**
   * 
   * @return dbServerID
  **/
  @javax.annotation.Nullable
  public Integer getDbServerID() {
    return dbServerID;
  }

  public void setDbServerID(Integer dbServerID) {
    this.dbServerID = dbServerID;
  }


  public DMClient dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * 
   * @return dbName
  **/
  @javax.annotation.Nullable
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public DMClient mtAServerID(Integer mtAServerID) {
    this.mtAServerID = mtAServerID;
    return this;
  }

   /**
   * 
   * @return mtAServerID
  **/
  @javax.annotation.Nullable
  public Integer getMtAServerID() {
    return mtAServerID;
  }

  public void setMtAServerID(Integer mtAServerID) {
    this.mtAServerID = mtAServerID;
  }


  public DMClient defaultDC(Integer defaultDC) {
    this.defaultDC = defaultDC;
    return this;
  }

   /**
   * 
   * @return defaultDC
  **/
  @javax.annotation.Nullable
  public Integer getDefaultDC() {
    return defaultDC;
  }

  public void setDefaultDC(Integer defaultDC) {
    this.defaultDC = defaultDC;
  }


  public DMClient deliveryContexts(Object deliveryContexts) {
    this.deliveryContexts = deliveryContexts;
    return this;
  }

   /**
   * 
   * @return deliveryContexts
  **/
  @javax.annotation.Nullable
  public Object getDeliveryContexts() {
    return deliveryContexts;
  }

  public void setDeliveryContexts(Object deliveryContexts) {
    this.deliveryContexts = deliveryContexts;
  }


  public DMClient settings(DMClientSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public DMClientSettings getSettings() {
    return settings;
  }

  public void setSettings(DMClientSettings settings) {
    this.settings = settings;
  }


  public DMClient imageBasePath(String imageBasePath) {
    this.imageBasePath = imageBasePath;
    return this;
  }

   /**
   * 
   * @return imageBasePath
  **/
  @javax.annotation.Nullable
  public String getImageBasePath() {
    return imageBasePath;
  }

  public void setImageBasePath(String imageBasePath) {
    this.imageBasePath = imageBasePath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DMClient dmClient = (DMClient) o;
    return Objects.equals(this.ID, dmClient.ID) &&
        Objects.equals(this.name, dmClient.name) &&
        Objects.equals(this.virtualMTA, dmClient.virtualMTA) &&
        Objects.equals(this.connectionString, dmClient.connectionString) &&
        Objects.equals(this.hashTable, dmClient.hashTable) &&
        Objects.equals(this.contentPath, dmClient.contentPath) &&
        Objects.equals(this.contentURL, dmClient.contentURL) &&
        Objects.equals(this.seats, dmClient.seats) &&
        Objects.equals(this.setID, dmClient.setID) &&
        Objects.equals(this.icon, dmClient.icon) &&
        Objects.equals(this.contentServerID, dmClient.contentServerID) &&
        Objects.equals(this.directory, dmClient.directory) &&
        Objects.equals(this.dbServerID, dmClient.dbServerID) &&
        Objects.equals(this.dbName, dmClient.dbName) &&
        Objects.equals(this.mtAServerID, dmClient.mtAServerID) &&
        Objects.equals(this.defaultDC, dmClient.defaultDC) &&
        Objects.equals(this.deliveryContexts, dmClient.deliveryContexts) &&
        Objects.equals(this.settings, dmClient.settings) &&
        Objects.equals(this.imageBasePath, dmClient.imageBasePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, virtualMTA, connectionString, hashTable, contentPath, contentURL, seats, setID, icon, contentServerID, directory, dbServerID, dbName, mtAServerID, defaultDC, deliveryContexts, settings, imageBasePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DMClient {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    virtualMTA: ").append(toIndentedString(virtualMTA)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
    sb.append("    hashTable: ").append(toIndentedString(hashTable)).append("\n");
    sb.append("    contentPath: ").append(toIndentedString(contentPath)).append("\n");
    sb.append("    contentURL: ").append(toIndentedString(contentURL)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    setID: ").append(toIndentedString(setID)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    contentServerID: ").append(toIndentedString(contentServerID)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    dbServerID: ").append(toIndentedString(dbServerID)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    mtAServerID: ").append(toIndentedString(mtAServerID)).append("\n");
    sb.append("    defaultDC: ").append(toIndentedString(defaultDC)).append("\n");
    sb.append("    deliveryContexts: ").append(toIndentedString(deliveryContexts)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    imageBasePath: ").append(toIndentedString(imageBasePath)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("VirtualMTA");
    openapiFields.add("ConnectionString");
    openapiFields.add("HashTable");
    openapiFields.add("ContentPath");
    openapiFields.add("ContentURL");
    openapiFields.add("Seats");
    openapiFields.add("SetID");
    openapiFields.add("Icon");
    openapiFields.add("ContentServerID");
    openapiFields.add("Directory");
    openapiFields.add("DBServerID");
    openapiFields.add("DBName");
    openapiFields.add("MTAServerID");
    openapiFields.add("DefaultDC");
    openapiFields.add("DeliveryContexts");
    openapiFields.add("Settings");
    openapiFields.add("ImageBasePath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DMClient
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DMClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DMClient is not found in the empty JSON string", DMClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DMClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DMClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("VirtualMTA") != null && !jsonObj.get("VirtualMTA").isJsonNull()) && !jsonObj.get("VirtualMTA").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VirtualMTA` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VirtualMTA").toString()));
      }
      if ((jsonObj.get("ConnectionString") != null && !jsonObj.get("ConnectionString").isJsonNull()) && !jsonObj.get("ConnectionString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConnectionString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ConnectionString").toString()));
      }
      if ((jsonObj.get("HashTable") != null && !jsonObj.get("HashTable").isJsonNull()) && !jsonObj.get("HashTable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HashTable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HashTable").toString()));
      }
      if ((jsonObj.get("ContentURL") != null && !jsonObj.get("ContentURL").isJsonNull()) && !jsonObj.get("ContentURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContentURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ContentURL").toString()));
      }
      if ((jsonObj.get("Icon") != null && !jsonObj.get("Icon").isJsonNull()) && !jsonObj.get("Icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Icon").toString()));
      }
      if ((jsonObj.get("Directory") != null && !jsonObj.get("Directory").isJsonNull()) && !jsonObj.get("Directory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Directory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Directory").toString()));
      }
      if ((jsonObj.get("DBName") != null && !jsonObj.get("DBName").isJsonNull()) && !jsonObj.get("DBName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DBName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DBName").toString()));
      }
      // validate the optional field `Settings`
      if (jsonObj.get("Settings") != null && !jsonObj.get("Settings").isJsonNull()) {
        DMClientSettings.validateJsonElement(jsonObj.get("Settings"));
      }
      if ((jsonObj.get("ImageBasePath") != null && !jsonObj.get("ImageBasePath").isJsonNull()) && !jsonObj.get("ImageBasePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageBasePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageBasePath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DMClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DMClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DMClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DMClient.class));

       return (TypeAdapter<T>) new TypeAdapter<DMClient>() {
           @Override
           public void write(JsonWriter out, DMClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DMClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DMClient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DMClient
  * @throws IOException if the JSON string is invalid with respect to DMClient
  */
  public static DMClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DMClient.class);
  }

 /**
  * Convert an instance of DMClient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

