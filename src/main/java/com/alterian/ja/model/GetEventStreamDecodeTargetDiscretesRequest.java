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
 * GetEventStreamDecodeTargetDiscretesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetEventStreamDecodeTargetDiscretesRequest {
  public static final String SERIALIZED_NAME_BASE_LIST_ID = "BaseListId";
  @SerializedName(SERIALIZED_NAME_BASE_LIST_ID)
  private Integer baseListId;

  public static final String SERIALIZED_NAME_BASE_LIST_VERSION = "BaseListVersion";
  @SerializedName(SERIALIZED_NAME_BASE_LIST_VERSION)
  private Integer baseListVersion;

  public static final String SERIALIZED_NAME_COLUMN_NAME = "ColumnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_DEFAULT_LABEL = "DefaultLabel";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LABEL)
  private String defaultLabel;

  public static final String SERIALIZED_NAME_EVENT_DATE_TIME_LOWER = "EventDateTimeLower";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE_TIME_LOWER)
  private OffsetDateTime eventDateTimeLower;

  public static final String SERIALIZED_NAME_EVENT_DATE_TIME_UPPER = "EventDateTimeUpper";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE_TIME_UPPER)
  private OffsetDateTime eventDateTimeUpper;

  public static final String SERIALIZED_NAME_EVENT_STREAM_ID = "EventStreamId";
  @SerializedName(SERIALIZED_NAME_EVENT_STREAM_ID)
  private Integer eventStreamId;

  public static final String SERIALIZED_NAME_IS_DATA_REFRESH_REQUIRED = "IsDataRefreshRequired";
  @SerializedName(SERIALIZED_NAME_IS_DATA_REFRESH_REQUIRED)
  private Boolean isDataRefreshRequired;

  public static final String SERIALIZED_NAME_IS_DEFAULT_LABEL_CONFIGURED = "IsDefaultLabelConfigured";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_LABEL_CONFIGURED)
  private Boolean isDefaultLabelConfigured;

  public static final String SERIALIZED_NAME_SOURCE_LABELS = "SourceLabels";
  @SerializedName(SERIALIZED_NAME_SOURCE_LABELS)
  private List<String> sourceLabels;

  public static final String SERIALIZED_NAME_TARGET_LABELS = "TargetLabels";
  @SerializedName(SERIALIZED_NAME_TARGET_LABELS)
  private List<String> targetLabels;

  public GetEventStreamDecodeTargetDiscretesRequest() {
  }

  public GetEventStreamDecodeTargetDiscretesRequest baseListId(Integer baseListId) {
    this.baseListId = baseListId;
    return this;
  }

   /**
   * Optionally base the decodes on a specified decode list subject to any explicitly specified overrides
   * @return baseListId
  **/
  @javax.annotation.Nullable
  public Integer getBaseListId() {
    return baseListId;
  }

  public void setBaseListId(Integer baseListId) {
    this.baseListId = baseListId;
  }


  public GetEventStreamDecodeTargetDiscretesRequest baseListVersion(Integer baseListVersion) {
    this.baseListVersion = baseListVersion;
    return this;
  }

   /**
   * Optional list version (defaults to latest)
   * @return baseListVersion
  **/
  @javax.annotation.Nullable
  public Integer getBaseListVersion() {
    return baseListVersion;
  }

  public void setBaseListVersion(Integer baseListVersion) {
    this.baseListVersion = baseListVersion;
  }


  public GetEventStreamDecodeTargetDiscretesRequest columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Column from the event stream to be decoded (defaults to Location)
   * @return columnName
  **/
  @javax.annotation.Nullable
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public GetEventStreamDecodeTargetDiscretesRequest defaultLabel(String defaultLabel) {
    this.defaultLabel = defaultLabel;
    return this;
  }

   /**
   * In conjunction with IsDefaultLabelConfigured this allows the API to override the default label from any specified base decode list. Pass NULL to remove an underlying list default and an empty string or space to override it to NULL
   * @return defaultLabel
  **/
  @javax.annotation.Nullable
  public String getDefaultLabel() {
    return defaultLabel;
  }

  public void setDefaultLabel(String defaultLabel) {
    this.defaultLabel = defaultLabel;
  }


  public GetEventStreamDecodeTargetDiscretesRequest eventDateTimeLower(OffsetDateTime eventDateTimeLower) {
    this.eventDateTimeLower = eventDateTimeLower;
    return this;
  }

   /**
   * Start of the date window for column values to be displayed and decoded
   * @return eventDateTimeLower
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventDateTimeLower() {
    return eventDateTimeLower;
  }

  public void setEventDateTimeLower(OffsetDateTime eventDateTimeLower) {
    this.eventDateTimeLower = eventDateTimeLower;
  }


  public GetEventStreamDecodeTargetDiscretesRequest eventDateTimeUpper(OffsetDateTime eventDateTimeUpper) {
    this.eventDateTimeUpper = eventDateTimeUpper;
    return this;
  }

   /**
   * End of the date window for column values to be displayed and decoded
   * @return eventDateTimeUpper
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventDateTimeUpper() {
    return eventDateTimeUpper;
  }

  public void setEventDateTimeUpper(OffsetDateTime eventDateTimeUpper) {
    this.eventDateTimeUpper = eventDateTimeUpper;
  }


  public GetEventStreamDecodeTargetDiscretesRequest eventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
    return this;
  }

   /**
   * Event Stream Id
   * @return eventStreamId
  **/
  @javax.annotation.Nullable
  public Integer getEventStreamId() {
    return eventStreamId;
  }

  public void setEventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
  }


  public GetEventStreamDecodeTargetDiscretesRequest isDataRefreshRequired(Boolean isDataRefreshRequired) {
    this.isDataRefreshRequired = isDataRefreshRequired;
    return this;
  }

   /**
   * Force the source labels to be refreshed from the event stream data
   * @return isDataRefreshRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsDataRefreshRequired() {
    return isDataRefreshRequired;
  }

  public void setIsDataRefreshRequired(Boolean isDataRefreshRequired) {
    this.isDataRefreshRequired = isDataRefreshRequired;
  }


  public GetEventStreamDecodeTargetDiscretesRequest isDefaultLabelConfigured(Boolean isDefaultLabelConfigured) {
    this.isDefaultLabelConfigured = isDefaultLabelConfigured;
    return this;
  }

   /**
   * Set this to true if DefaultLabel is being used. If set to false then the default label will be determined by any specified base decode list
   * @return isDefaultLabelConfigured
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefaultLabelConfigured() {
    return isDefaultLabelConfigured;
  }

  public void setIsDefaultLabelConfigured(Boolean isDefaultLabelConfigured) {
    this.isDefaultLabelConfigured = isDefaultLabelConfigured;
  }


  public GetEventStreamDecodeTargetDiscretesRequest sourceLabels(List<String> sourceLabels) {
    this.sourceLabels = sourceLabels;
    return this;
  }

  public GetEventStreamDecodeTargetDiscretesRequest addSourceLabelsItem(String sourceLabelsItem) {
    if (this.sourceLabels == null) {
      this.sourceLabels = new ArrayList<>();
    }
    this.sourceLabels.add(sourceLabelsItem);
    return this;
  }

   /**
   * Specify any source labels that should be overriden on the specified base decode list
   * @return sourceLabels
  **/
  @javax.annotation.Nullable
  public List<String> getSourceLabels() {
    return sourceLabels;
  }

  public void setSourceLabels(List<String> sourceLabels) {
    this.sourceLabels = sourceLabels;
  }


  public GetEventStreamDecodeTargetDiscretesRequest targetLabels(List<String> targetLabels) {
    this.targetLabels = targetLabels;
    return this;
  }

  public GetEventStreamDecodeTargetDiscretesRequest addTargetLabelsItem(String targetLabelsItem) {
    if (this.targetLabels == null) {
      this.targetLabels = new ArrayList<>();
    }
    this.targetLabels.add(targetLabelsItem);
    return this;
  }

   /**
   * Specify the target labels that should override the specified base decode list. Pass NULL to remove an underlying list decode or an empty string to override it to NULL. Pass a NULL list to remove mappings for all the specified source labels
   * @return targetLabels
  **/
  @javax.annotation.Nullable
  public List<String> getTargetLabels() {
    return targetLabels;
  }

  public void setTargetLabels(List<String> targetLabels) {
    this.targetLabels = targetLabels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventStreamDecodeTargetDiscretesRequest getEventStreamDecodeTargetDiscretesRequest = (GetEventStreamDecodeTargetDiscretesRequest) o;
    return Objects.equals(this.baseListId, getEventStreamDecodeTargetDiscretesRequest.baseListId) &&
        Objects.equals(this.baseListVersion, getEventStreamDecodeTargetDiscretesRequest.baseListVersion) &&
        Objects.equals(this.columnName, getEventStreamDecodeTargetDiscretesRequest.columnName) &&
        Objects.equals(this.defaultLabel, getEventStreamDecodeTargetDiscretesRequest.defaultLabel) &&
        Objects.equals(this.eventDateTimeLower, getEventStreamDecodeTargetDiscretesRequest.eventDateTimeLower) &&
        Objects.equals(this.eventDateTimeUpper, getEventStreamDecodeTargetDiscretesRequest.eventDateTimeUpper) &&
        Objects.equals(this.eventStreamId, getEventStreamDecodeTargetDiscretesRequest.eventStreamId) &&
        Objects.equals(this.isDataRefreshRequired, getEventStreamDecodeTargetDiscretesRequest.isDataRefreshRequired) &&
        Objects.equals(this.isDefaultLabelConfigured, getEventStreamDecodeTargetDiscretesRequest.isDefaultLabelConfigured) &&
        Objects.equals(this.sourceLabels, getEventStreamDecodeTargetDiscretesRequest.sourceLabels) &&
        Objects.equals(this.targetLabels, getEventStreamDecodeTargetDiscretesRequest.targetLabels);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseListId, baseListVersion, columnName, defaultLabel, eventDateTimeLower, eventDateTimeUpper, eventStreamId, isDataRefreshRequired, isDefaultLabelConfigured, sourceLabels, targetLabels);
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
    sb.append("class GetEventStreamDecodeTargetDiscretesRequest {\n");
    sb.append("    baseListId: ").append(toIndentedString(baseListId)).append("\n");
    sb.append("    baseListVersion: ").append(toIndentedString(baseListVersion)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    defaultLabel: ").append(toIndentedString(defaultLabel)).append("\n");
    sb.append("    eventDateTimeLower: ").append(toIndentedString(eventDateTimeLower)).append("\n");
    sb.append("    eventDateTimeUpper: ").append(toIndentedString(eventDateTimeUpper)).append("\n");
    sb.append("    eventStreamId: ").append(toIndentedString(eventStreamId)).append("\n");
    sb.append("    isDataRefreshRequired: ").append(toIndentedString(isDataRefreshRequired)).append("\n");
    sb.append("    isDefaultLabelConfigured: ").append(toIndentedString(isDefaultLabelConfigured)).append("\n");
    sb.append("    sourceLabels: ").append(toIndentedString(sourceLabels)).append("\n");
    sb.append("    targetLabels: ").append(toIndentedString(targetLabels)).append("\n");
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
    openapiFields.add("BaseListId");
    openapiFields.add("BaseListVersion");
    openapiFields.add("ColumnName");
    openapiFields.add("DefaultLabel");
    openapiFields.add("EventDateTimeLower");
    openapiFields.add("EventDateTimeUpper");
    openapiFields.add("EventStreamId");
    openapiFields.add("IsDataRefreshRequired");
    openapiFields.add("IsDefaultLabelConfigured");
    openapiFields.add("SourceLabels");
    openapiFields.add("TargetLabels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetEventStreamDecodeTargetDiscretesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEventStreamDecodeTargetDiscretesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEventStreamDecodeTargetDiscretesRequest is not found in the empty JSON string", GetEventStreamDecodeTargetDiscretesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEventStreamDecodeTargetDiscretesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEventStreamDecodeTargetDiscretesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ColumnName") != null && !jsonObj.get("ColumnName").isJsonNull()) && !jsonObj.get("ColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ColumnName").toString()));
      }
      if ((jsonObj.get("DefaultLabel") != null && !jsonObj.get("DefaultLabel").isJsonNull()) && !jsonObj.get("DefaultLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DefaultLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DefaultLabel").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SourceLabels") != null && !jsonObj.get("SourceLabels").isJsonNull() && !jsonObj.get("SourceLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SourceLabels` to be an array in the JSON string but got `%s`", jsonObj.get("SourceLabels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("TargetLabels") != null && !jsonObj.get("TargetLabels").isJsonNull() && !jsonObj.get("TargetLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TargetLabels` to be an array in the JSON string but got `%s`", jsonObj.get("TargetLabels").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEventStreamDecodeTargetDiscretesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEventStreamDecodeTargetDiscretesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEventStreamDecodeTargetDiscretesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEventStreamDecodeTargetDiscretesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEventStreamDecodeTargetDiscretesRequest>() {
           @Override
           public void write(JsonWriter out, GetEventStreamDecodeTargetDiscretesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEventStreamDecodeTargetDiscretesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEventStreamDecodeTargetDiscretesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEventStreamDecodeTargetDiscretesRequest
  * @throws IOException if the JSON string is invalid with respect to GetEventStreamDecodeTargetDiscretesRequest
  */
  public static GetEventStreamDecodeTargetDiscretesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEventStreamDecodeTargetDiscretesRequest.class);
  }

 /**
  * Convert an instance of GetEventStreamDecodeTargetDiscretesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

