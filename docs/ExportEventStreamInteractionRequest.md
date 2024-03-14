

# ExportEventStreamInteractionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alignment** | **EventStreamAlignmentType** |  |  [optional] |
|**alignmentEventName** | **String** | Optional event name to align to. Requires Alignment to be set |  [optional] |
|**alignmentSecondaryEventName** | **String** | If Alignment is set to Left/Right, and a secondary event column is specified then this is the secondary event name that will be aligned to, with an empty string meaning alignment to NULL |  [optional] |
|**columnTransforms** | [**List&lt;EventStreamColumnTransform&gt;**](EventStreamColumnTransform.md) | Applies the specified transforms to base the result on the transformed discrete values |  [optional] |
|**conversationTimeoutInSeconds** | **Integer** | Configures delay after which a new conversation is considered to have started - defaults to 1800s (30mins) when either StreamKey is set to Interaction or Timeout events are required |  [optional] |
|**cursor** | [**APILastModifiedCursor**](APILastModifiedCursor.md) |  |  [optional] |
|**dataSourceId** | **Integer** | Datasource ID |  [optional] |
|**eventDateTimeLower** | **OffsetDateTime** | Optionally filter by EventDateTime |  [optional] |
|**eventDateTimeUpper** | **OffsetDateTime** | Optionally filter by EventDateTime |  [optional] |
|**eventStreamId** | **Integer** | Optionally invoke using an Event Stream ID instead of DataSourceId/TableNameEx. In this mode ColumnTransforms will be defaulted to those published against the columns of the Event Stream but can still be overridden if required |  [optional] |
|**eventTypes** | **List&lt;String&gt;** | List of event types to include (default to all) |  [optional] |
|**filters** | [**List&lt;ColumnMatchList&gt;**](ColumnMatchList.md) | Additional columns to filter on |  [optional] |
|**includeMatchedEvents** | **Boolean** | Set to False to exclude all records that fall into specified match events (Defaults to True). Use this to get events in the &#39;other&#39; category by passing all the displayed events and setting match to false |  [optional] |
|**initiatives** | **List&lt;String&gt;** | List of initiatives to include (default to all) |  [optional] |
|**interaction** | **Integer** | Interaction start point |  [optional] |
|**isDeduplicationRequired** | **Boolean** | Indicates whether identical consecutive events in a stream are combined into a single event (default false) |  [optional] |
|**isTimeoutEventsRequired** | **Boolean** | Optionally show Start/End conversation events |  [optional] |
|**matchEvents** | **List&lt;String&gt;** | Events to match in the specified interaction. Pass -1 to indicate the &#39;drop off&#39; event and -3 to specify the padded (&#39;no event&#39;) placeholder for right aligned streams |  [optional] |
|**pattern** | [**EventStreamPattern**](EventStreamPattern.md) |  |  [optional] |
|**primaryEventColumnName** | **String** | Optionally set the column name that contains the event names (defaults to Location) |  [optional] |
|**secondaryEventColumnName** | **String** | Optionally set a secondary column name that can be used to further partition the events e.g. Channel |  [optional] |
|**streamKey** | **String** | Optionally specify the key to be used for the Sankey - Visitor, Interaction etc (defaults to using the Visitor ID) |  [optional] |
|**streamQuery** | **String** | Specify rules for stream inclusion using stream query patterns e.g. Offer/_*_/Checkout would require a stream to have an offer event followed by a checkout event |  [optional] |
|**tableNameEx** | **String** | Event Stream table (standard two part name ex) |  [optional] |



