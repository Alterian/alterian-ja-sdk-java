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
import java.util.HashMap;
import java.util.Map;
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
public class WebSpoonStatus {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OPERATIONAL_STATUS = "OperationalStatus";
  @SerializedName(SERIALIZED_NAME_OPERATIONAL_STATUS)
  private String operationalStatus;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_U_R_L = "URL";
  @SerializedName(SERIALIZED_NAME_U_R_L)
  private String URL;

  public static final String SERIALIZED_NAME_CREATION_STATUS = "CreationStatus";
  @SerializedName(SERIALIZED_NAME_CREATION_STATUS)
  private String creationStatus;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_STARTED_BY_CODE = "StartedByCode";
  @SerializedName(SERIALIZED_NAME_STARTED_BY_CODE)
  private String startedByCode;

  public WebSpoonStatus() {
  }

  public WebSpoonStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public WebSpoonStatus operationalStatus(String operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

   /**
   * 
   * @return operationalStatus
  **/
  @javax.annotation.Nullable
  public String getOperationalStatus() {
    return operationalStatus;
  }

  public void setOperationalStatus(String operationalStatus) {
    this.operationalStatus = operationalStatus;
  }


  public WebSpoonStatus tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public WebSpoonStatus putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public WebSpoonStatus publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * 
   * @return publicIp
  **/
  @javax.annotation.Nullable
  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public WebSpoonStatus URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * 
   * @return URL
  **/
  @javax.annotation.Nullable
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  public WebSpoonStatus creationStatus(String creationStatus) {
    this.creationStatus = creationStatus;
    return this;
  }

   /**
   * 
   * @return creationStatus
  **/
  @javax.annotation.Nullable
  public String getCreationStatus() {
    return creationStatus;
  }

  public void setCreationStatus(String creationStatus) {
    this.creationStatus = creationStatus;
  }


  public WebSpoonStatus created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public WebSpoonStatus startedByCode(String startedByCode) {
    this.startedByCode = startedByCode;
    return this;
  }

   /**
   * 
   * @return startedByCode
  **/
  @javax.annotation.Nullable
  public String getStartedByCode() {
    return startedByCode;
  }

  public void setStartedByCode(String startedByCode) {
    this.startedByCode = startedByCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebSpoonStatus webSpoonStatus = (WebSpoonStatus) o;
    return Objects.equals(this.id, webSpoonStatus.id) &&
        Objects.equals(this.operationalStatus, webSpoonStatus.operationalStatus) &&
        Objects.equals(this.tags, webSpoonStatus.tags) &&
        Objects.equals(this.publicIp, webSpoonStatus.publicIp) &&
        Objects.equals(this.URL, webSpoonStatus.URL) &&
        Objects.equals(this.creationStatus, webSpoonStatus.creationStatus) &&
        Objects.equals(this.created, webSpoonStatus.created) &&
        Objects.equals(this.startedByCode, webSpoonStatus.startedByCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationalStatus, tags, publicIp, URL, creationStatus, created, startedByCode);
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
    sb.append("class WebSpoonStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    creationStatus: ").append(toIndentedString(creationStatus)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    startedByCode: ").append(toIndentedString(startedByCode)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("OperationalStatus");
    openapiFields.add("Tags");
    openapiFields.add("PublicIp");
    openapiFields.add("URL");
    openapiFields.add("CreationStatus");
    openapiFields.add("Created");
    openapiFields.add("StartedByCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebSpoonStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebSpoonStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebSpoonStatus is not found in the empty JSON string", WebSpoonStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebSpoonStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebSpoonStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("OperationalStatus") != null && !jsonObj.get("OperationalStatus").isJsonNull()) && !jsonObj.get("OperationalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperationalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperationalStatus").toString()));
      }
      if ((jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull()) && !jsonObj.get("PublicIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PublicIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PublicIp").toString()));
      }
      if ((jsonObj.get("URL") != null && !jsonObj.get("URL").isJsonNull()) && !jsonObj.get("URL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `URL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("URL").toString()));
      }
      if ((jsonObj.get("CreationStatus") != null && !jsonObj.get("CreationStatus").isJsonNull()) && !jsonObj.get("CreationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreationStatus").toString()));
      }
      if ((jsonObj.get("StartedByCode") != null && !jsonObj.get("StartedByCode").isJsonNull()) && !jsonObj.get("StartedByCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StartedByCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StartedByCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebSpoonStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebSpoonStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebSpoonStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebSpoonStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<WebSpoonStatus>() {
           @Override
           public void write(JsonWriter out, WebSpoonStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebSpoonStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebSpoonStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebSpoonStatus
  * @throws IOException if the JSON string is invalid with respect to WebSpoonStatus
  */
  public static WebSpoonStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebSpoonStatus.class);
  }

 /**
  * Convert an instance of WebSpoonStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

