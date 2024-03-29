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
import com.alterian.ja.model.APILastModifiedCursor;
import com.alterian.ja.model.ColumnMatchList;
import com.alterian.ja.model.EventStreamColumnTransform;
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
 * GetEventRecordsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetEventRecordsRequest {
  public static final String SERIALIZED_NAME_COLUMN_TRANSFORMS = "ColumnTransforms";
  @SerializedName(SERIALIZED_NAME_COLUMN_TRANSFORMS)
  private List<EventStreamColumnTransform> columnTransforms;

  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APILastModifiedCursor cursor;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "DataSourceId";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private Integer dataSourceId;

  public static final String SERIALIZED_NAME_EVENT_DATE_TIME_LOWER = "EventDateTimeLower";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE_TIME_LOWER)
  private OffsetDateTime eventDateTimeLower;

  public static final String SERIALIZED_NAME_EVENT_DATE_TIME_UPPER = "EventDateTimeUpper";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE_TIME_UPPER)
  private OffsetDateTime eventDateTimeUpper;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "EventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<ColumnMatchList> filters;

  public static final String SERIALIZED_NAME_INITIATIVES = "Initiatives";
  @SerializedName(SERIALIZED_NAME_INITIATIVES)
  private List<String> initiatives;

  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private Integer key;

  public static final String SERIALIZED_NAME_TABLE_NAME_EX = "TableNameEx";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME_EX)
  private String tableNameEx;

  public GetEventRecordsRequest() {
  }

  public GetEventRecordsRequest columnTransforms(List<EventStreamColumnTransform> columnTransforms) {
    this.columnTransforms = columnTransforms;
    return this;
  }

  public GetEventRecordsRequest addColumnTransformsItem(EventStreamColumnTransform columnTransformsItem) {
    if (this.columnTransforms == null) {
      this.columnTransforms = new ArrayList<>();
    }
    this.columnTransforms.add(columnTransformsItem);
    return this;
  }

   /**
   * Applies the specified transforms to base the result on the transformed discrete values
   * @return columnTransforms
  **/
  @javax.annotation.Nullable
  public List<EventStreamColumnTransform> getColumnTransforms() {
    return columnTransforms;
  }

  public void setColumnTransforms(List<EventStreamColumnTransform> columnTransforms) {
    this.columnTransforms = columnTransforms;
  }


  public GetEventRecordsRequest cursor(APILastModifiedCursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public APILastModifiedCursor getCursor() {
    return cursor;
  }

  public void setCursor(APILastModifiedCursor cursor) {
    this.cursor = cursor;
  }


  public GetEventRecordsRequest dataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * Id of the datasource to which table belongs.
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public Integer getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public GetEventRecordsRequest eventDateTimeLower(OffsetDateTime eventDateTimeLower) {
    this.eventDateTimeLower = eventDateTimeLower;
    return this;
  }

   /**
   * Optionally filter by EventDateTime
   * @return eventDateTimeLower
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventDateTimeLower() {
    return eventDateTimeLower;
  }

  public void setEventDateTimeLower(OffsetDateTime eventDateTimeLower) {
    this.eventDateTimeLower = eventDateTimeLower;
  }


  public GetEventRecordsRequest eventDateTimeUpper(OffsetDateTime eventDateTimeUpper) {
    this.eventDateTimeUpper = eventDateTimeUpper;
    return this;
  }

   /**
   * Optionally filter by EventDateTime
   * @return eventDateTimeUpper
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventDateTimeUpper() {
    return eventDateTimeUpper;
  }

  public void setEventDateTimeUpper(OffsetDateTime eventDateTimeUpper) {
    this.eventDateTimeUpper = eventDateTimeUpper;
  }


  public GetEventRecordsRequest eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public GetEventRecordsRequest addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * List of event types to include (default to all)
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public GetEventRecordsRequest filters(List<ColumnMatchList> filters) {
    this.filters = filters;
    return this;
  }

  public GetEventRecordsRequest addFiltersItem(ColumnMatchList filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Additional columns to filter on
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<ColumnMatchList> getFilters() {
    return filters;
  }

  public void setFilters(List<ColumnMatchList> filters) {
    this.filters = filters;
  }


  public GetEventRecordsRequest initiatives(List<String> initiatives) {
    this.initiatives = initiatives;
    return this;
  }

  public GetEventRecordsRequest addInitiativesItem(String initiativesItem) {
    if (this.initiatives == null) {
      this.initiatives = new ArrayList<>();
    }
    this.initiatives.add(initiativesItem);
    return this;
  }

   /**
   * List of initiatives to include (default to all)
   * @return initiatives
  **/
  @javax.annotation.Nullable
  public List<String> getInitiatives() {
    return initiatives;
  }

  public void setInitiatives(List<String> initiatives) {
    this.initiatives = initiatives;
  }


  public GetEventRecordsRequest key(Integer key) {
    this.key = key;
    return this;
  }

   /**
   * Optional Key value (the integer re-keyed value)
   * @return key
  **/
  @javax.annotation.Nullable
  public Integer getKey() {
    return key;
  }

  public void setKey(Integer key) {
    this.key = key;
  }


  public GetEventRecordsRequest tableNameEx(String tableNameEx) {
    this.tableNameEx = tableNameEx;
    return this;
  }

   /**
   * Event Stream table (standard two part name ex)
   * @return tableNameEx
  **/
  @javax.annotation.Nullable
  public String getTableNameEx() {
    return tableNameEx;
  }

  public void setTableNameEx(String tableNameEx) {
    this.tableNameEx = tableNameEx;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventRecordsRequest getEventRecordsRequest = (GetEventRecordsRequest) o;
    return Objects.equals(this.columnTransforms, getEventRecordsRequest.columnTransforms) &&
        Objects.equals(this.cursor, getEventRecordsRequest.cursor) &&
        Objects.equals(this.dataSourceId, getEventRecordsRequest.dataSourceId) &&
        Objects.equals(this.eventDateTimeLower, getEventRecordsRequest.eventDateTimeLower) &&
        Objects.equals(this.eventDateTimeUpper, getEventRecordsRequest.eventDateTimeUpper) &&
        Objects.equals(this.eventTypes, getEventRecordsRequest.eventTypes) &&
        Objects.equals(this.filters, getEventRecordsRequest.filters) &&
        Objects.equals(this.initiatives, getEventRecordsRequest.initiatives) &&
        Objects.equals(this.key, getEventRecordsRequest.key) &&
        Objects.equals(this.tableNameEx, getEventRecordsRequest.tableNameEx);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnTransforms, cursor, dataSourceId, eventDateTimeLower, eventDateTimeUpper, eventTypes, filters, initiatives, key, tableNameEx);
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
    sb.append("class GetEventRecordsRequest {\n");
    sb.append("    columnTransforms: ").append(toIndentedString(columnTransforms)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    eventDateTimeLower: ").append(toIndentedString(eventDateTimeLower)).append("\n");
    sb.append("    eventDateTimeUpper: ").append(toIndentedString(eventDateTimeUpper)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    initiatives: ").append(toIndentedString(initiatives)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    tableNameEx: ").append(toIndentedString(tableNameEx)).append("\n");
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
    openapiFields.add("ColumnTransforms");
    openapiFields.add("Cursor");
    openapiFields.add("DataSourceId");
    openapiFields.add("EventDateTimeLower");
    openapiFields.add("EventDateTimeUpper");
    openapiFields.add("EventTypes");
    openapiFields.add("Filters");
    openapiFields.add("Initiatives");
    openapiFields.add("Key");
    openapiFields.add("TableNameEx");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetEventRecordsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEventRecordsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEventRecordsRequest is not found in the empty JSON string", GetEventRecordsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEventRecordsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEventRecordsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ColumnTransforms") != null && !jsonObj.get("ColumnTransforms").isJsonNull()) {
        JsonArray jsonArraycolumnTransforms = jsonObj.getAsJsonArray("ColumnTransforms");
        if (jsonArraycolumnTransforms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ColumnTransforms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ColumnTransforms` to be an array in the JSON string but got `%s`", jsonObj.get("ColumnTransforms").toString()));
          }

          // validate the optional field `ColumnTransforms` (array)
          for (int i = 0; i < jsonArraycolumnTransforms.size(); i++) {
            EventStreamColumnTransform.validateJsonElement(jsonArraycolumnTransforms.get(i));
          };
        }
      }
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APILastModifiedCursor.validateJsonElement(jsonObj.get("Cursor"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("EventTypes") != null && !jsonObj.get("EventTypes").isJsonNull() && !jsonObj.get("EventTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventTypes` to be an array in the JSON string but got `%s`", jsonObj.get("EventTypes").toString()));
      }
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("Filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Filters` to be an array in the JSON string but got `%s`", jsonObj.get("Filters").toString()));
          }

          // validate the optional field `Filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            ColumnMatchList.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Initiatives") != null && !jsonObj.get("Initiatives").isJsonNull() && !jsonObj.get("Initiatives").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Initiatives` to be an array in the JSON string but got `%s`", jsonObj.get("Initiatives").toString()));
      }
      if ((jsonObj.get("TableNameEx") != null && !jsonObj.get("TableNameEx").isJsonNull()) && !jsonObj.get("TableNameEx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TableNameEx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TableNameEx").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEventRecordsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEventRecordsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEventRecordsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEventRecordsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEventRecordsRequest>() {
           @Override
           public void write(JsonWriter out, GetEventRecordsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEventRecordsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEventRecordsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEventRecordsRequest
  * @throws IOException if the JSON string is invalid with respect to GetEventRecordsRequest
  */
  public static GetEventRecordsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEventRecordsRequest.class);
  }

 /**
  * Convert an instance of GetEventRecordsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

