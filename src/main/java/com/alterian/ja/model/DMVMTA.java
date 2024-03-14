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
public class DMVMTA {
  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_I_P = "IP";
  @SerializedName(SERIALIZED_NAME_I_P)
  private String IP;

  public static final String SERIALIZED_NAME_MT_A_SERVER_I_D = "MTAServerID";
  @SerializedName(SERIALIZED_NAME_MT_A_SERVER_I_D)
  private Integer mtAServerID;

  public DMVMTA() {
  }

  public DMVMTA ID(Integer ID) {
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


  public DMVMTA name(String name) {
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


  public DMVMTA IP(String IP) {
    this.IP = IP;
    return this;
  }

   /**
   * 
   * @return IP
  **/
  @javax.annotation.Nullable
  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }


  public DMVMTA mtAServerID(Integer mtAServerID) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DMVMTA DMVMTA = (DMVMTA) o;
    return Objects.equals(this.ID, DMVMTA.ID) &&
        Objects.equals(this.name, DMVMTA.name) &&
        Objects.equals(this.IP, DMVMTA.IP) &&
        Objects.equals(this.mtAServerID, DMVMTA.mtAServerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, IP, mtAServerID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DMVMTA {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    mtAServerID: ").append(toIndentedString(mtAServerID)).append("\n");
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
    openapiFields.add("IP");
    openapiFields.add("MTAServerID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DMVMTA
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DMVMTA.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DMVMTA is not found in the empty JSON string", DMVMTA.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DMVMTA.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DMVMTA` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("IP") != null && !jsonObj.get("IP").isJsonNull()) && !jsonObj.get("IP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DMVMTA.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DMVMTA' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DMVMTA> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DMVMTA.class));

       return (TypeAdapter<T>) new TypeAdapter<DMVMTA>() {
           @Override
           public void write(JsonWriter out, DMVMTA value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DMVMTA read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DMVMTA given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DMVMTA
  * @throws IOException if the JSON string is invalid with respect to DMVMTA
  */
  public static DMVMTA fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DMVMTA.class);
  }

 /**
  * Convert an instance of DMVMTA to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
