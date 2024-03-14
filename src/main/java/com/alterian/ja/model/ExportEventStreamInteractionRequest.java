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
import com.alterian.ja.model.EventStreamAlignmentType;
import com.alterian.ja.model.EventStreamColumnTransform;
import com.alterian.ja.model.EventStreamPattern;
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
 * ExportEventStreamInteractionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ExportEventStreamInteractionRequest {
  public static final String SERIALIZED_NAME_ALIGNMENT = "Alignment";
  @SerializedName(SERIALIZED_NAME_ALIGNMENT)
  private EventStreamAlignmentType alignment;

  public static final String SERIALIZED_NAME_ALIGNMENT_EVENT_NAME = "AlignmentEventName";
  @SerializedName(SERIALIZED_NAME_ALIGNMENT_EVENT_NAME)
  private String alignmentEventName;

  public static final String SERIALIZED_NAME_ALIGNMENT_SECONDARY_EVENT_NAME = "AlignmentSecondaryEventName";
  @SerializedName(SERIALIZED_NAME_ALIGNMENT_SECONDARY_EVENT_NAME)
  private String alignmentSecondaryEventName;

  public static final String SERIALIZED_NAME_COLUMN_TRANSFORMS = "ColumnTransforms";
  @SerializedName(SERIALIZED_NAME_COLUMN_TRANSFORMS)
  private List<EventStreamColumnTransform> columnTransforms;

  public static final String SERIALIZED_NAME_CONVERSATION_TIMEOUT_IN_SECONDS = "ConversationTimeoutInSeconds";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_TIMEOUT_IN_SECONDS)
  private Integer conversationTimeoutInSeconds;

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

  public static final String SERIALIZED_NAME_EVENT_STREAM_ID = "EventStreamId";
  @SerializedName(SERIALIZED_NAME_EVENT_STREAM_ID)
  private Integer eventStreamId;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "EventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<ColumnMatchList> filters;

  public static final String SERIALIZED_NAME_INCLUDE_MATCHED_EVENTS = "IncludeMatchedEvents";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MATCHED_EVENTS)
  private Boolean includeMatchedEvents;

  public static final String SERIALIZED_NAME_INITIATIVES = "Initiatives";
  @SerializedName(SERIALIZED_NAME_INITIATIVES)
  private List<String> initiatives;

  public static final String SERIALIZED_NAME_INTERACTION = "Interaction";
  @SerializedName(SERIALIZED_NAME_INTERACTION)
  private Integer interaction;

  public static final String SERIALIZED_NAME_IS_DEDUPLICATION_REQUIRED = "IsDeduplicationRequired";
  @SerializedName(SERIALIZED_NAME_IS_DEDUPLICATION_REQUIRED)
  private Boolean isDeduplicationRequired;

  public static final String SERIALIZED_NAME_IS_TIMEOUT_EVENTS_REQUIRED = "IsTimeoutEventsRequired";
  @SerializedName(SERIALIZED_NAME_IS_TIMEOUT_EVENTS_REQUIRED)
  private Boolean isTimeoutEventsRequired;

  public static final String SERIALIZED_NAME_MATCH_EVENTS = "MatchEvents";
  @SerializedName(SERIALIZED_NAME_MATCH_EVENTS)
  private List<String> matchEvents;

  public static final String SERIALIZED_NAME_PATTERN = "Pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private EventStreamPattern pattern;

  public static final String SERIALIZED_NAME_PRIMARY_EVENT_COLUMN_NAME = "PrimaryEventColumnName";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EVENT_COLUMN_NAME)
  private String primaryEventColumnName;

  public static final String SERIALIZED_NAME_SECONDARY_EVENT_COLUMN_NAME = "SecondaryEventColumnName";
  @SerializedName(SERIALIZED_NAME_SECONDARY_EVENT_COLUMN_NAME)
  private String secondaryEventColumnName;

  public static final String SERIALIZED_NAME_STREAM_KEY = "StreamKey";
  @SerializedName(SERIALIZED_NAME_STREAM_KEY)
  private String streamKey;

  public static final String SERIALIZED_NAME_STREAM_QUERY = "StreamQuery";
  @SerializedName(SERIALIZED_NAME_STREAM_QUERY)
  private String streamQuery;

  public static final String SERIALIZED_NAME_TABLE_NAME_EX = "TableNameEx";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME_EX)
  private String tableNameEx;

  public ExportEventStreamInteractionRequest() {
  }

  public ExportEventStreamInteractionRequest alignment(EventStreamAlignmentType alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Get alignment
   * @return alignment
  **/
  @javax.annotation.Nullable
  public EventStreamAlignmentType getAlignment() {
    return alignment;
  }

  public void setAlignment(EventStreamAlignmentType alignment) {
    this.alignment = alignment;
  }


  public ExportEventStreamInteractionRequest alignmentEventName(String alignmentEventName) {
    this.alignmentEventName = alignmentEventName;
    return this;
  }

   /**
   * Optional event name to align to. Requires Alignment to be set
   * @return alignmentEventName
  **/
  @javax.annotation.Nullable
  public String getAlignmentEventName() {
    return alignmentEventName;
  }

  public void setAlignmentEventName(String alignmentEventName) {
    this.alignmentEventName = alignmentEventName;
  }


  public ExportEventStreamInteractionRequest alignmentSecondaryEventName(String alignmentSecondaryEventName) {
    this.alignmentSecondaryEventName = alignmentSecondaryEventName;
    return this;
  }

   /**
   * If Alignment is set to Left/Right, and a secondary event column is specified then this is the secondary event name that will be aligned to, with an empty string meaning alignment to NULL
   * @return alignmentSecondaryEventName
  **/
  @javax.annotation.Nullable
  public String getAlignmentSecondaryEventName() {
    return alignmentSecondaryEventName;
  }

  public void setAlignmentSecondaryEventName(String alignmentSecondaryEventName) {
    this.alignmentSecondaryEventName = alignmentSecondaryEventName;
  }


  public ExportEventStreamInteractionRequest columnTransforms(List<EventStreamColumnTransform> columnTransforms) {
    this.columnTransforms = columnTransforms;
    return this;
  }

  public ExportEventStreamInteractionRequest addColumnTransformsItem(EventStreamColumnTransform columnTransformsItem) {
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


  public ExportEventStreamInteractionRequest conversationTimeoutInSeconds(Integer conversationTimeoutInSeconds) {
    this.conversationTimeoutInSeconds = conversationTimeoutInSeconds;
    return this;
  }

   /**
   * Configures delay after which a new conversation is considered to have started - defaults to 1800s (30mins) when either StreamKey is set to Interaction or Timeout events are required
   * @return conversationTimeoutInSeconds
  **/
  @javax.annotation.Nullable
  public Integer getConversationTimeoutInSeconds() {
    return conversationTimeoutInSeconds;
  }

  public void setConversationTimeoutInSeconds(Integer conversationTimeoutInSeconds) {
    this.conversationTimeoutInSeconds = conversationTimeoutInSeconds;
  }


  public ExportEventStreamInteractionRequest cursor(APILastModifiedCursor cursor) {
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


  public ExportEventStreamInteractionRequest dataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * Datasource ID
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public Integer getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public ExportEventStreamInteractionRequest eventDateTimeLower(OffsetDateTime eventDateTimeLower) {
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


  public ExportEventStreamInteractionRequest eventDateTimeUpper(OffsetDateTime eventDateTimeUpper) {
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


  public ExportEventStreamInteractionRequest eventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
    return this;
  }

   /**
   * Optionally invoke using an Event Stream ID instead of DataSourceId/TableNameEx. In this mode ColumnTransforms will be defaulted to those published against the columns of the Event Stream but can still be overridden if required
   * @return eventStreamId
  **/
  @javax.annotation.Nullable
  public Integer getEventStreamId() {
    return eventStreamId;
  }

  public void setEventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
  }


  public ExportEventStreamInteractionRequest eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public ExportEventStreamInteractionRequest addEventTypesItem(String eventTypesItem) {
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


  public ExportEventStreamInteractionRequest filters(List<ColumnMatchList> filters) {
    this.filters = filters;
    return this;
  }

  public ExportEventStreamInteractionRequest addFiltersItem(ColumnMatchList filtersItem) {
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


  public ExportEventStreamInteractionRequest includeMatchedEvents(Boolean includeMatchedEvents) {
    this.includeMatchedEvents = includeMatchedEvents;
    return this;
  }

   /**
   * Set to False to exclude all records that fall into specified match events (Defaults to True). Use this to get events in the &#39;other&#39; category by passing all the displayed events and setting match to false
   * @return includeMatchedEvents
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeMatchedEvents() {
    return includeMatchedEvents;
  }

  public void setIncludeMatchedEvents(Boolean includeMatchedEvents) {
    this.includeMatchedEvents = includeMatchedEvents;
  }


  public ExportEventStreamInteractionRequest initiatives(List<String> initiatives) {
    this.initiatives = initiatives;
    return this;
  }

  public ExportEventStreamInteractionRequest addInitiativesItem(String initiativesItem) {
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


  public ExportEventStreamInteractionRequest interaction(Integer interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction start point
   * @return interaction
  **/
  @javax.annotation.Nullable
  public Integer getInteraction() {
    return interaction;
  }

  public void setInteraction(Integer interaction) {
    this.interaction = interaction;
  }


  public ExportEventStreamInteractionRequest isDeduplicationRequired(Boolean isDeduplicationRequired) {
    this.isDeduplicationRequired = isDeduplicationRequired;
    return this;
  }

   /**
   * Indicates whether identical consecutive events in a stream are combined into a single event (default false)
   * @return isDeduplicationRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeduplicationRequired() {
    return isDeduplicationRequired;
  }

  public void setIsDeduplicationRequired(Boolean isDeduplicationRequired) {
    this.isDeduplicationRequired = isDeduplicationRequired;
  }


  public ExportEventStreamInteractionRequest isTimeoutEventsRequired(Boolean isTimeoutEventsRequired) {
    this.isTimeoutEventsRequired = isTimeoutEventsRequired;
    return this;
  }

   /**
   * Optionally show Start/End conversation events
   * @return isTimeoutEventsRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsTimeoutEventsRequired() {
    return isTimeoutEventsRequired;
  }

  public void setIsTimeoutEventsRequired(Boolean isTimeoutEventsRequired) {
    this.isTimeoutEventsRequired = isTimeoutEventsRequired;
  }


  public ExportEventStreamInteractionRequest matchEvents(List<String> matchEvents) {
    this.matchEvents = matchEvents;
    return this;
  }

  public ExportEventStreamInteractionRequest addMatchEventsItem(String matchEventsItem) {
    if (this.matchEvents == null) {
      this.matchEvents = new ArrayList<>();
    }
    this.matchEvents.add(matchEventsItem);
    return this;
  }

   /**
   * Events to match in the specified interaction. Pass -1 to indicate the &#39;drop off&#39; event and -3 to specify the padded (&#39;no event&#39;) placeholder for right aligned streams
   * @return matchEvents
  **/
  @javax.annotation.Nullable
  public List<String> getMatchEvents() {
    return matchEvents;
  }

  public void setMatchEvents(List<String> matchEvents) {
    this.matchEvents = matchEvents;
  }


  public ExportEventStreamInteractionRequest pattern(EventStreamPattern pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @javax.annotation.Nullable
  public EventStreamPattern getPattern() {
    return pattern;
  }

  public void setPattern(EventStreamPattern pattern) {
    this.pattern = pattern;
  }


  public ExportEventStreamInteractionRequest primaryEventColumnName(String primaryEventColumnName) {
    this.primaryEventColumnName = primaryEventColumnName;
    return this;
  }

   /**
   * Optionally set the column name that contains the event names (defaults to Location)
   * @return primaryEventColumnName
  **/
  @javax.annotation.Nullable
  public String getPrimaryEventColumnName() {
    return primaryEventColumnName;
  }

  public void setPrimaryEventColumnName(String primaryEventColumnName) {
    this.primaryEventColumnName = primaryEventColumnName;
  }


  public ExportEventStreamInteractionRequest secondaryEventColumnName(String secondaryEventColumnName) {
    this.secondaryEventColumnName = secondaryEventColumnName;
    return this;
  }

   /**
   * Optionally set a secondary column name that can be used to further partition the events e.g. Channel
   * @return secondaryEventColumnName
  **/
  @javax.annotation.Nullable
  public String getSecondaryEventColumnName() {
    return secondaryEventColumnName;
  }

  public void setSecondaryEventColumnName(String secondaryEventColumnName) {
    this.secondaryEventColumnName = secondaryEventColumnName;
  }


  public ExportEventStreamInteractionRequest streamKey(String streamKey) {
    this.streamKey = streamKey;
    return this;
  }

   /**
   * Optionally specify the key to be used for the Sankey - Visitor, Interaction etc (defaults to using the Visitor ID)
   * @return streamKey
  **/
  @javax.annotation.Nullable
  public String getStreamKey() {
    return streamKey;
  }

  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }


  public ExportEventStreamInteractionRequest streamQuery(String streamQuery) {
    this.streamQuery = streamQuery;
    return this;
  }

   /**
   * Specify rules for stream inclusion using stream query patterns e.g. Offer/_*_/Checkout would require a stream to have an offer event followed by a checkout event
   * @return streamQuery
  **/
  @javax.annotation.Nullable
  public String getStreamQuery() {
    return streamQuery;
  }

  public void setStreamQuery(String streamQuery) {
    this.streamQuery = streamQuery;
  }


  public ExportEventStreamInteractionRequest tableNameEx(String tableNameEx) {
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
    ExportEventStreamInteractionRequest exportEventStreamInteractionRequest = (ExportEventStreamInteractionRequest) o;
    return Objects.equals(this.alignment, exportEventStreamInteractionRequest.alignment) &&
        Objects.equals(this.alignmentEventName, exportEventStreamInteractionRequest.alignmentEventName) &&
        Objects.equals(this.alignmentSecondaryEventName, exportEventStreamInteractionRequest.alignmentSecondaryEventName) &&
        Objects.equals(this.columnTransforms, exportEventStreamInteractionRequest.columnTransforms) &&
        Objects.equals(this.conversationTimeoutInSeconds, exportEventStreamInteractionRequest.conversationTimeoutInSeconds) &&
        Objects.equals(this.cursor, exportEventStreamInteractionRequest.cursor) &&
        Objects.equals(this.dataSourceId, exportEventStreamInteractionRequest.dataSourceId) &&
        Objects.equals(this.eventDateTimeLower, exportEventStreamInteractionRequest.eventDateTimeLower) &&
        Objects.equals(this.eventDateTimeUpper, exportEventStreamInteractionRequest.eventDateTimeUpper) &&
        Objects.equals(this.eventStreamId, exportEventStreamInteractionRequest.eventStreamId) &&
        Objects.equals(this.eventTypes, exportEventStreamInteractionRequest.eventTypes) &&
        Objects.equals(this.filters, exportEventStreamInteractionRequest.filters) &&
        Objects.equals(this.includeMatchedEvents, exportEventStreamInteractionRequest.includeMatchedEvents) &&
        Objects.equals(this.initiatives, exportEventStreamInteractionRequest.initiatives) &&
        Objects.equals(this.interaction, exportEventStreamInteractionRequest.interaction) &&
        Objects.equals(this.isDeduplicationRequired, exportEventStreamInteractionRequest.isDeduplicationRequired) &&
        Objects.equals(this.isTimeoutEventsRequired, exportEventStreamInteractionRequest.isTimeoutEventsRequired) &&
        Objects.equals(this.matchEvents, exportEventStreamInteractionRequest.matchEvents) &&
        Objects.equals(this.pattern, exportEventStreamInteractionRequest.pattern) &&
        Objects.equals(this.primaryEventColumnName, exportEventStreamInteractionRequest.primaryEventColumnName) &&
        Objects.equals(this.secondaryEventColumnName, exportEventStreamInteractionRequest.secondaryEventColumnName) &&
        Objects.equals(this.streamKey, exportEventStreamInteractionRequest.streamKey) &&
        Objects.equals(this.streamQuery, exportEventStreamInteractionRequest.streamQuery) &&
        Objects.equals(this.tableNameEx, exportEventStreamInteractionRequest.tableNameEx);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, alignmentEventName, alignmentSecondaryEventName, columnTransforms, conversationTimeoutInSeconds, cursor, dataSourceId, eventDateTimeLower, eventDateTimeUpper, eventStreamId, eventTypes, filters, includeMatchedEvents, initiatives, interaction, isDeduplicationRequired, isTimeoutEventsRequired, matchEvents, pattern, primaryEventColumnName, secondaryEventColumnName, streamKey, streamQuery, tableNameEx);
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
    sb.append("class ExportEventStreamInteractionRequest {\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    alignmentEventName: ").append(toIndentedString(alignmentEventName)).append("\n");
    sb.append("    alignmentSecondaryEventName: ").append(toIndentedString(alignmentSecondaryEventName)).append("\n");
    sb.append("    columnTransforms: ").append(toIndentedString(columnTransforms)).append("\n");
    sb.append("    conversationTimeoutInSeconds: ").append(toIndentedString(conversationTimeoutInSeconds)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    eventDateTimeLower: ").append(toIndentedString(eventDateTimeLower)).append("\n");
    sb.append("    eventDateTimeUpper: ").append(toIndentedString(eventDateTimeUpper)).append("\n");
    sb.append("    eventStreamId: ").append(toIndentedString(eventStreamId)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    includeMatchedEvents: ").append(toIndentedString(includeMatchedEvents)).append("\n");
    sb.append("    initiatives: ").append(toIndentedString(initiatives)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
    sb.append("    isDeduplicationRequired: ").append(toIndentedString(isDeduplicationRequired)).append("\n");
    sb.append("    isTimeoutEventsRequired: ").append(toIndentedString(isTimeoutEventsRequired)).append("\n");
    sb.append("    matchEvents: ").append(toIndentedString(matchEvents)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    primaryEventColumnName: ").append(toIndentedString(primaryEventColumnName)).append("\n");
    sb.append("    secondaryEventColumnName: ").append(toIndentedString(secondaryEventColumnName)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    streamQuery: ").append(toIndentedString(streamQuery)).append("\n");
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
    openapiFields.add("Alignment");
    openapiFields.add("AlignmentEventName");
    openapiFields.add("AlignmentSecondaryEventName");
    openapiFields.add("ColumnTransforms");
    openapiFields.add("ConversationTimeoutInSeconds");
    openapiFields.add("Cursor");
    openapiFields.add("DataSourceId");
    openapiFields.add("EventDateTimeLower");
    openapiFields.add("EventDateTimeUpper");
    openapiFields.add("EventStreamId");
    openapiFields.add("EventTypes");
    openapiFields.add("Filters");
    openapiFields.add("IncludeMatchedEvents");
    openapiFields.add("Initiatives");
    openapiFields.add("Interaction");
    openapiFields.add("IsDeduplicationRequired");
    openapiFields.add("IsTimeoutEventsRequired");
    openapiFields.add("MatchEvents");
    openapiFields.add("Pattern");
    openapiFields.add("PrimaryEventColumnName");
    openapiFields.add("SecondaryEventColumnName");
    openapiFields.add("StreamKey");
    openapiFields.add("StreamQuery");
    openapiFields.add("TableNameEx");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportEventStreamInteractionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportEventStreamInteractionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportEventStreamInteractionRequest is not found in the empty JSON string", ExportEventStreamInteractionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportEventStreamInteractionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportEventStreamInteractionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Alignment`
      if (jsonObj.get("Alignment") != null && !jsonObj.get("Alignment").isJsonNull()) {
        EventStreamAlignmentType.validateJsonElement(jsonObj.get("Alignment"));
      }
      if ((jsonObj.get("AlignmentEventName") != null && !jsonObj.get("AlignmentEventName").isJsonNull()) && !jsonObj.get("AlignmentEventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AlignmentEventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AlignmentEventName").toString()));
      }
      if ((jsonObj.get("AlignmentSecondaryEventName") != null && !jsonObj.get("AlignmentSecondaryEventName").isJsonNull()) && !jsonObj.get("AlignmentSecondaryEventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AlignmentSecondaryEventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AlignmentSecondaryEventName").toString()));
      }
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("MatchEvents") != null && !jsonObj.get("MatchEvents").isJsonNull() && !jsonObj.get("MatchEvents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MatchEvents` to be an array in the JSON string but got `%s`", jsonObj.get("MatchEvents").toString()));
      }
      // validate the optional field `Pattern`
      if (jsonObj.get("Pattern") != null && !jsonObj.get("Pattern").isJsonNull()) {
        EventStreamPattern.validateJsonElement(jsonObj.get("Pattern"));
      }
      if ((jsonObj.get("PrimaryEventColumnName") != null && !jsonObj.get("PrimaryEventColumnName").isJsonNull()) && !jsonObj.get("PrimaryEventColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrimaryEventColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrimaryEventColumnName").toString()));
      }
      if ((jsonObj.get("SecondaryEventColumnName") != null && !jsonObj.get("SecondaryEventColumnName").isJsonNull()) && !jsonObj.get("SecondaryEventColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondaryEventColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondaryEventColumnName").toString()));
      }
      if ((jsonObj.get("StreamKey") != null && !jsonObj.get("StreamKey").isJsonNull()) && !jsonObj.get("StreamKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreamKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreamKey").toString()));
      }
      if ((jsonObj.get("StreamQuery") != null && !jsonObj.get("StreamQuery").isJsonNull()) && !jsonObj.get("StreamQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreamQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StreamQuery").toString()));
      }
      if ((jsonObj.get("TableNameEx") != null && !jsonObj.get("TableNameEx").isJsonNull()) && !jsonObj.get("TableNameEx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TableNameEx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TableNameEx").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportEventStreamInteractionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportEventStreamInteractionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportEventStreamInteractionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportEventStreamInteractionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportEventStreamInteractionRequest>() {
           @Override
           public void write(JsonWriter out, ExportEventStreamInteractionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportEventStreamInteractionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportEventStreamInteractionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportEventStreamInteractionRequest
  * @throws IOException if the JSON string is invalid with respect to ExportEventStreamInteractionRequest
  */
  public static ExportEventStreamInteractionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportEventStreamInteractionRequest.class);
  }

 /**
  * Convert an instance of ExportEventStreamInteractionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
