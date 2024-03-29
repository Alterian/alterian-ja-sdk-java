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
 * Provides an easy way to represent a link from a persona to another object type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PersonaLink {
  public static final String SERIALIZED_NAME_PERSONA_ID = "PersonaId";
  @SerializedName(SERIALIZED_NAME_PERSONA_ID)
  private Integer personaId;

  public static final String SERIALIZED_NAME_LINK_TYPE = "LinkType";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private String linkType;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public PersonaLink() {
  }

  public PersonaLink personaId(Integer personaId) {
    this.personaId = personaId;
    return this;
  }

   /**
   * The Persona to which this is linked.
   * @return personaId
  **/
  @javax.annotation.Nullable
  public Integer getPersonaId() {
    return personaId;
  }

  public void setPersonaId(Integer personaId) {
    this.personaId = personaId;
  }


  public PersonaLink linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * What type of object is this?
   * @return linkType
  **/
  @javax.annotation.Nullable
  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public PersonaLink id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Id for the link; note, this might be an integer but we store it as a string as we might be storing other link types which are not integers
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaLink personaLink = (PersonaLink) o;
    return Objects.equals(this.personaId, personaLink.personaId) &&
        Objects.equals(this.linkType, personaLink.linkType) &&
        Objects.equals(this.id, personaLink.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaId, linkType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaLink {\n");
    sb.append("    personaId: ").append(toIndentedString(personaId)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("PersonaId");
    openapiFields.add("LinkType");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PersonaLink
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PersonaLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonaLink is not found in the empty JSON string", PersonaLink.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PersonaLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonaLink` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LinkType") != null && !jsonObj.get("LinkType").isJsonNull()) && !jsonObj.get("LinkType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LinkType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LinkType").toString()));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonaLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonaLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonaLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonaLink.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonaLink>() {
           @Override
           public void write(JsonWriter out, PersonaLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonaLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonaLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonaLink
  * @throws IOException if the JSON string is invalid with respect to PersonaLink
  */
  public static PersonaLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonaLink.class);
  }

 /**
  * Convert an instance of PersonaLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

