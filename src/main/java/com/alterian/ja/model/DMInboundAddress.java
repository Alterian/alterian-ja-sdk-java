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
import com.alterian.ja.model.DMInboundEventForward;
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
public class DMInboundAddress {
  public static final String SERIALIZED_NAME_DEPLOY_ACCESS = "DeployAccess";
  @SerializedName(SERIALIZED_NAME_DEPLOY_ACCESS)
  private Boolean deployAccess;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FORWARD_EVENTS = "ForwardEvents";
  @SerializedName(SERIALIZED_NAME_FORWARD_EVENTS)
  private List<DMInboundEventForward> forwardEvents;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_MODIFY_ACCESS = "ModifyAccess";
  @SerializedName(SERIALIZED_NAME_MODIFY_ACCESS)
  private Boolean modifyAccess;

  public DMInboundAddress() {
  }

  public DMInboundAddress deployAccess(Boolean deployAccess) {
    this.deployAccess = deployAccess;
    return this;
  }

   /**
   * 
   * @return deployAccess
  **/
  @javax.annotation.Nullable
  public Boolean getDeployAccess() {
    return deployAccess;
  }

  public void setDeployAccess(Boolean deployAccess) {
    this.deployAccess = deployAccess;
  }


  public DMInboundAddress email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public DMInboundAddress forwardEvents(List<DMInboundEventForward> forwardEvents) {
    this.forwardEvents = forwardEvents;
    return this;
  }

  public DMInboundAddress addForwardEventsItem(DMInboundEventForward forwardEventsItem) {
    if (this.forwardEvents == null) {
      this.forwardEvents = new ArrayList<>();
    }
    this.forwardEvents.add(forwardEventsItem);
    return this;
  }

   /**
   * 
   * @return forwardEvents
  **/
  @javax.annotation.Nullable
  public List<DMInboundEventForward> getForwardEvents() {
    return forwardEvents;
  }

  public void setForwardEvents(List<DMInboundEventForward> forwardEvents) {
    this.forwardEvents = forwardEvents;
  }


  public DMInboundAddress ID(Integer ID) {
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


  public DMInboundAddress modifyAccess(Boolean modifyAccess) {
    this.modifyAccess = modifyAccess;
    return this;
  }

   /**
   * 
   * @return modifyAccess
  **/
  @javax.annotation.Nullable
  public Boolean getModifyAccess() {
    return modifyAccess;
  }

  public void setModifyAccess(Boolean modifyAccess) {
    this.modifyAccess = modifyAccess;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DMInboundAddress dmInboundAddress = (DMInboundAddress) o;
    return Objects.equals(this.deployAccess, dmInboundAddress.deployAccess) &&
        Objects.equals(this.email, dmInboundAddress.email) &&
        Objects.equals(this.forwardEvents, dmInboundAddress.forwardEvents) &&
        Objects.equals(this.ID, dmInboundAddress.ID) &&
        Objects.equals(this.modifyAccess, dmInboundAddress.modifyAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployAccess, email, forwardEvents, ID, modifyAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DMInboundAddress {\n");
    sb.append("    deployAccess: ").append(toIndentedString(deployAccess)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    forwardEvents: ").append(toIndentedString(forwardEvents)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    modifyAccess: ").append(toIndentedString(modifyAccess)).append("\n");
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
    openapiFields.add("DeployAccess");
    openapiFields.add("Email");
    openapiFields.add("ForwardEvents");
    openapiFields.add("ID");
    openapiFields.add("ModifyAccess");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DMInboundAddress
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DMInboundAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DMInboundAddress is not found in the empty JSON string", DMInboundAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DMInboundAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DMInboundAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull()) && !jsonObj.get("Email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Email").toString()));
      }
      if (jsonObj.get("ForwardEvents") != null && !jsonObj.get("ForwardEvents").isJsonNull()) {
        JsonArray jsonArrayforwardEvents = jsonObj.getAsJsonArray("ForwardEvents");
        if (jsonArrayforwardEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ForwardEvents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ForwardEvents` to be an array in the JSON string but got `%s`", jsonObj.get("ForwardEvents").toString()));
          }

          // validate the optional field `ForwardEvents` (array)
          for (int i = 0; i < jsonArrayforwardEvents.size(); i++) {
            DMInboundEventForward.validateJsonElement(jsonArrayforwardEvents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DMInboundAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DMInboundAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DMInboundAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DMInboundAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<DMInboundAddress>() {
           @Override
           public void write(JsonWriter out, DMInboundAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DMInboundAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DMInboundAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DMInboundAddress
  * @throws IOException if the JSON string is invalid with respect to DMInboundAddress
  */
  public static DMInboundAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DMInboundAddress.class);
  }

 /**
  * Convert an instance of DMInboundAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

