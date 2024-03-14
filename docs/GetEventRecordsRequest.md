

# GetEventRecordsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnTransforms** | [**List&lt;EventStreamColumnTransform&gt;**](EventStreamColumnTransform.md) | Applies the specified transforms to base the result on the transformed discrete values |  [optional] |
|**cursor** | [**APILastModifiedCursor**](APILastModifiedCursor.md) |  |  [optional] |
|**dataSourceId** | **Integer** | Id of the datasource to which table belongs. |  [optional] |
|**eventDateTimeLower** | **OffsetDateTime** | Optionally filter by EventDateTime |  [optional] |
|**eventDateTimeUpper** | **OffsetDateTime** | Optionally filter by EventDateTime |  [optional] |
|**eventTypes** | **List&lt;String&gt;** | List of event types to include (default to all) |  [optional] |
|**filters** | [**List&lt;ColumnMatchList&gt;**](ColumnMatchList.md) | Additional columns to filter on |  [optional] |
|**initiatives** | **List&lt;String&gt;** | List of initiatives to include (default to all) |  [optional] |
|**key** | **Integer** | Optional Key value (the integer re-keyed value) |  [optional] |
|**tableNameEx** | **String** | Event Stream table (standard two part name ex) |  [optional] |



