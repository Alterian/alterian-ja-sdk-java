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
import com.alterian.ja.model.EventStreamCustomerField;
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
 * UpsertEventStreamCustomerColumnsToGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpsertEventStreamCustomerColumnsToGroupRequest {
  public static final String SERIALIZED_NAME_FIELDS = "Fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<EventStreamCustomerField> fields;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_KEY_COLUMN_NAME = "KeyColumnName";
  @SerializedName(SERIALIZED_NAME_KEY_COLUMN_NAME)
  private String keyColumnName;

  public static final String SERIALIZED_NAME_PERSONA_COLUMN_NAME = "PersonaColumnName";
  @SerializedName(SERIALIZED_NAME_PERSONA_COLUMN_NAME)
  private String personaColumnName;

  public UpsertEventStreamCustomerColumnsToGroupRequest() {
  }

  public UpsertEventStreamCustomerColumnsToGroupRequest fields(List<EventStreamCustomerField> fields) {
    this.fields = fields;
    return this;
  }

  public UpsertEventStreamCustomerColumnsToGroupRequest addFieldsItem(EventStreamCustomerField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of @see(EventStreamCustomerField) instances to upsert
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<EventStreamCustomerField> getFields() {
    return fields;
  }

  public void setFields(List<EventStreamCustomerField> fields) {
    this.fields = fields;
  }


  public UpsertEventStreamCustomerColumnsToGroupRequest groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Id of the group of event streams you want to update, obtained via @see(GetEventStreams)
   * @return groupId
  **/
  @javax.annotation.Nullable
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public UpsertEventStreamCustomerColumnsToGroupRequest keyColumnName(String keyColumnName) {
    this.keyColumnName = keyColumnName;
    return this;
  }

   /**
   * In your list of columns, you must specify which column contains the key field for your customer (for instance, email address).  If you do not, the loader rule created will expect a cxid to be provided
   * @return keyColumnName
  **/
  @javax.annotation.Nullable
  public String getKeyColumnName() {
    return keyColumnName;
  }

  public void setKeyColumnName(String keyColumnName) {
    this.keyColumnName = keyColumnName;
  }


  public UpsertEventStreamCustomerColumnsToGroupRequest personaColumnName(String personaColumnName) {
    this.personaColumnName = personaColumnName;
    return this;
  }

   /**
   * If your data is going to have persona data, specify the column which holds the persona information.  Note that personas must be separated by a pipe character if there are multiples
   * @return personaColumnName
  **/
  @javax.annotation.Nullable
  public String getPersonaColumnName() {
    return personaColumnName;
  }

  public void setPersonaColumnName(String personaColumnName) {
    this.personaColumnName = personaColumnName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertEventStreamCustomerColumnsToGroupRequest upsertEventStreamCustomerColumnsToGroupRequest = (UpsertEventStreamCustomerColumnsToGroupRequest) o;
    return Objects.equals(this.fields, upsertEventStreamCustomerColumnsToGroupRequest.fields) &&
        Objects.equals(this.groupId, upsertEventStreamCustomerColumnsToGroupRequest.groupId) &&
        Objects.equals(this.keyColumnName, upsertEventStreamCustomerColumnsToGroupRequest.keyColumnName) &&
        Objects.equals(this.personaColumnName, upsertEventStreamCustomerColumnsToGroupRequest.personaColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, groupId, keyColumnName, personaColumnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertEventStreamCustomerColumnsToGroupRequest {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    keyColumnName: ").append(toIndentedString(keyColumnName)).append("\n");
    sb.append("    personaColumnName: ").append(toIndentedString(personaColumnName)).append("\n");
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
    openapiFields.add("Fields");
    openapiFields.add("GroupId");
    openapiFields.add("KeyColumnName");
    openapiFields.add("PersonaColumnName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpsertEventStreamCustomerColumnsToGroupRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertEventStreamCustomerColumnsToGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertEventStreamCustomerColumnsToGroupRequest is not found in the empty JSON string", UpsertEventStreamCustomerColumnsToGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertEventStreamCustomerColumnsToGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertEventStreamCustomerColumnsToGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Fields") != null && !jsonObj.get("Fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("Fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Fields` to be an array in the JSON string but got `%s`", jsonObj.get("Fields").toString()));
          }

          // validate the optional field `Fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            EventStreamCustomerField.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
      if ((jsonObj.get("KeyColumnName") != null && !jsonObj.get("KeyColumnName").isJsonNull()) && !jsonObj.get("KeyColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyColumnName").toString()));
      }
      if ((jsonObj.get("PersonaColumnName") != null && !jsonObj.get("PersonaColumnName").isJsonNull()) && !jsonObj.get("PersonaColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PersonaColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PersonaColumnName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertEventStreamCustomerColumnsToGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertEventStreamCustomerColumnsToGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertEventStreamCustomerColumnsToGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertEventStreamCustomerColumnsToGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertEventStreamCustomerColumnsToGroupRequest>() {
           @Override
           public void write(JsonWriter out, UpsertEventStreamCustomerColumnsToGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertEventStreamCustomerColumnsToGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpsertEventStreamCustomerColumnsToGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpsertEventStreamCustomerColumnsToGroupRequest
  * @throws IOException if the JSON string is invalid with respect to UpsertEventStreamCustomerColumnsToGroupRequest
  */
  public static UpsertEventStreamCustomerColumnsToGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertEventStreamCustomerColumnsToGroupRequest.class);
  }

 /**
  * Convert an instance of UpsertEventStreamCustomerColumnsToGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

