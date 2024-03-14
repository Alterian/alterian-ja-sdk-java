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
import java.time.OffsetDateTime;
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
 * Information that represents the processes (services and executables) that together make up an installed system             This is used to manage the system, to monitor which processes are busy or are responding and to describe items in the alert log
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ALProcess {
  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "ApplicationID";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  private Integer applicationID;

  public static final String SERIALIZED_NAME_HOST_NAME = "HostName";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_LAST_HEARTBEAT = "LastHeartbeat";
  @SerializedName(SERIALIZED_NAME_LAST_HEARTBEAT)
  private OffsetDateTime lastHeartbeat;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_HEARTBEAT_THRESHOLD = "HeartbeatThreshold";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_THRESHOLD)
  private Integer heartbeatThreshold;

  public static final String SERIALIZED_NAME_NETWORK_PATH = "NetworkPath";
  @SerializedName(SERIALIZED_NAME_NETWORK_PATH)
  private String networkPath;

  public ALProcess() {
  }

  public ALProcess ID(Integer ID) {
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


  public ALProcess applicationID(Integer applicationID) {
    this.applicationID = applicationID;
    return this;
  }

   /**
   * 
   * @return applicationID
  **/
  @javax.annotation.Nullable
  public Integer getApplicationID() {
    return applicationID;
  }

  public void setApplicationID(Integer applicationID) {
    this.applicationID = applicationID;
  }


  public ALProcess hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * 
   * @return hostName
  **/
  @javax.annotation.Nullable
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public ALProcess lastHeartbeat(OffsetDateTime lastHeartbeat) {
    this.lastHeartbeat = lastHeartbeat;
    return this;
  }

   /**
   * 
   * @return lastHeartbeat
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastHeartbeat() {
    return lastHeartbeat;
  }

  public void setLastHeartbeat(OffsetDateTime lastHeartbeat) {
    this.lastHeartbeat = lastHeartbeat;
  }


  public ALProcess enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * 
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ALProcess heartbeatThreshold(Integer heartbeatThreshold) {
    this.heartbeatThreshold = heartbeatThreshold;
    return this;
  }

   /**
   * 
   * @return heartbeatThreshold
  **/
  @javax.annotation.Nullable
  public Integer getHeartbeatThreshold() {
    return heartbeatThreshold;
  }

  public void setHeartbeatThreshold(Integer heartbeatThreshold) {
    this.heartbeatThreshold = heartbeatThreshold;
  }


  public ALProcess networkPath(String networkPath) {
    this.networkPath = networkPath;
    return this;
  }

   /**
   * 
   * @return networkPath
  **/
  @javax.annotation.Nullable
  public String getNetworkPath() {
    return networkPath;
  }

  public void setNetworkPath(String networkPath) {
    this.networkPath = networkPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALProcess alProcess = (ALProcess) o;
    return Objects.equals(this.ID, alProcess.ID) &&
        Objects.equals(this.applicationID, alProcess.applicationID) &&
        Objects.equals(this.hostName, alProcess.hostName) &&
        Objects.equals(this.lastHeartbeat, alProcess.lastHeartbeat) &&
        Objects.equals(this.enabled, alProcess.enabled) &&
        Objects.equals(this.heartbeatThreshold, alProcess.heartbeatThreshold) &&
        Objects.equals(this.networkPath, alProcess.networkPath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, applicationID, hostName, lastHeartbeat, enabled, heartbeatThreshold, networkPath);
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
    sb.append("class ALProcess {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    lastHeartbeat: ").append(toIndentedString(lastHeartbeat)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    heartbeatThreshold: ").append(toIndentedString(heartbeatThreshold)).append("\n");
    sb.append("    networkPath: ").append(toIndentedString(networkPath)).append("\n");
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
    openapiFields.add("ApplicationID");
    openapiFields.add("HostName");
    openapiFields.add("LastHeartbeat");
    openapiFields.add("Enabled");
    openapiFields.add("HeartbeatThreshold");
    openapiFields.add("NetworkPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ALProcess
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ALProcess.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ALProcess is not found in the empty JSON string", ALProcess.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ALProcess.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ALProcess` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("HostName") != null && !jsonObj.get("HostName").isJsonNull()) && !jsonObj.get("HostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostName").toString()));
      }
      if ((jsonObj.get("NetworkPath") != null && !jsonObj.get("NetworkPath").isJsonNull()) && !jsonObj.get("NetworkPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ALProcess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ALProcess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ALProcess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ALProcess.class));

       return (TypeAdapter<T>) new TypeAdapter<ALProcess>() {
           @Override
           public void write(JsonWriter out, ALProcess value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ALProcess read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ALProcess given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ALProcess
  * @throws IOException if the JSON string is invalid with respect to ALProcess
  */
  public static ALProcess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ALProcess.class);
  }

 /**
  * Convert an instance of ALProcess to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

