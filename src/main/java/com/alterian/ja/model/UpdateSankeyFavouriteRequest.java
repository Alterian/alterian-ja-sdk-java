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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * UpdateSankeyFavouriteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpdateSankeyFavouriteRequest {
  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "EventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes;

  public static final String SERIALIZED_NAME_INITIATIVES = "Initiatives";
  @SerializedName(SERIALIZED_NAME_INITIATIVES)
  private List<String> initiatives;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERIOD_IN_DAYS = "PeriodInDays";
  @SerializedName(SERIALIZED_NAME_PERIOD_IN_DAYS)
  private Integer periodInDays;

  public static final String SERIALIZED_NAME_QUEUE_ID = "QueueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private Integer queueId;

  public static final String SERIALIZED_NAME_SANKEY_FAVOURITE_ID = "SankeyFavouriteId";
  @SerializedName(SERIALIZED_NAME_SANKEY_FAVOURITE_ID)
  private Integer sankeyFavouriteId;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public UpdateSankeyFavouriteRequest() {
  }

  public UpdateSankeyFavouriteRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Specify a date range or the number of days in period (PeriodInDays)
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public UpdateSankeyFavouriteRequest eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public UpdateSankeyFavouriteRequest addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Please be aware that any existing events will be replaced.
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public UpdateSankeyFavouriteRequest initiatives(List<String> initiatives) {
    this.initiatives = initiatives;
    return this;
  }

  public UpdateSankeyFavouriteRequest addInitiativesItem(String initiativesItem) {
    if (this.initiatives == null) {
      this.initiatives = new ArrayList<>();
    }
    this.initiatives.add(initiativesItem);
    return this;
  }

   /**
   * Please be aware that any existing initiatives will be replaced.
   * @return initiatives
  **/
  @javax.annotation.Nullable
  public List<String> getInitiatives() {
    return initiatives;
  }

  public void setInitiatives(List<String> initiatives) {
    this.initiatives = initiatives;
  }


  public UpdateSankeyFavouriteRequest name(String name) {
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


  public UpdateSankeyFavouriteRequest periodInDays(Integer periodInDays) {
    this.periodInDays = periodInDays;
    return this;
  }

   /**
   * Filter by the last X number of days (Do not enter a start / end date)
   * @return periodInDays
  **/
  @javax.annotation.Nullable
  public Integer getPeriodInDays() {
    return periodInDays;
  }

  public void setPeriodInDays(Integer periodInDays) {
    this.periodInDays = periodInDays;
  }


  public UpdateSankeyFavouriteRequest queueId(Integer queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * 
   * @return queueId
  **/
  @javax.annotation.Nullable
  public Integer getQueueId() {
    return queueId;
  }

  public void setQueueId(Integer queueId) {
    this.queueId = queueId;
  }


  public UpdateSankeyFavouriteRequest sankeyFavouriteId(Integer sankeyFavouriteId) {
    this.sankeyFavouriteId = sankeyFavouriteId;
    return this;
  }

   /**
   * A valid Sankey ID
   * @return sankeyFavouriteId
  **/
  @javax.annotation.Nullable
  public Integer getSankeyFavouriteId() {
    return sankeyFavouriteId;
  }

  public void setSankeyFavouriteId(Integer sankeyFavouriteId) {
    this.sankeyFavouriteId = sankeyFavouriteId;
  }


  public UpdateSankeyFavouriteRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Specify a date range or the number of days in period (PeriodInDays)
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public UpdateSankeyFavouriteRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSankeyFavouriteRequest updateSankeyFavouriteRequest = (UpdateSankeyFavouriteRequest) o;
    return Objects.equals(this.endDate, updateSankeyFavouriteRequest.endDate) &&
        Objects.equals(this.eventTypes, updateSankeyFavouriteRequest.eventTypes) &&
        Objects.equals(this.initiatives, updateSankeyFavouriteRequest.initiatives) &&
        Objects.equals(this.name, updateSankeyFavouriteRequest.name) &&
        Objects.equals(this.periodInDays, updateSankeyFavouriteRequest.periodInDays) &&
        Objects.equals(this.queueId, updateSankeyFavouriteRequest.queueId) &&
        Objects.equals(this.sankeyFavouriteId, updateSankeyFavouriteRequest.sankeyFavouriteId) &&
        Objects.equals(this.startDate, updateSankeyFavouriteRequest.startDate) &&
        Objects.equals(this.userId, updateSankeyFavouriteRequest.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, eventTypes, initiatives, name, periodInDays, queueId, sankeyFavouriteId, startDate, userId);
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
    sb.append("class UpdateSankeyFavouriteRequest {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    initiatives: ").append(toIndentedString(initiatives)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    periodInDays: ").append(toIndentedString(periodInDays)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    sankeyFavouriteId: ").append(toIndentedString(sankeyFavouriteId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("EndDate");
    openapiFields.add("EventTypes");
    openapiFields.add("Initiatives");
    openapiFields.add("Name");
    openapiFields.add("PeriodInDays");
    openapiFields.add("QueueId");
    openapiFields.add("SankeyFavouriteId");
    openapiFields.add("StartDate");
    openapiFields.add("UserId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateSankeyFavouriteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateSankeyFavouriteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSankeyFavouriteRequest is not found in the empty JSON string", UpdateSankeyFavouriteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateSankeyFavouriteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSankeyFavouriteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("EventTypes") != null && !jsonObj.get("EventTypes").isJsonNull() && !jsonObj.get("EventTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventTypes` to be an array in the JSON string but got `%s`", jsonObj.get("EventTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Initiatives") != null && !jsonObj.get("Initiatives").isJsonNull() && !jsonObj.get("Initiatives").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Initiatives` to be an array in the JSON string but got `%s`", jsonObj.get("Initiatives").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSankeyFavouriteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSankeyFavouriteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSankeyFavouriteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSankeyFavouriteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSankeyFavouriteRequest>() {
           @Override
           public void write(JsonWriter out, UpdateSankeyFavouriteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSankeyFavouriteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSankeyFavouriteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSankeyFavouriteRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateSankeyFavouriteRequest
  */
  public static UpdateSankeyFavouriteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSankeyFavouriteRequest.class);
  }

 /**
  * Convert an instance of UpdateSankeyFavouriteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

