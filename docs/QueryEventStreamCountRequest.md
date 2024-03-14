

# QueryEventStreamCountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countType** | **EventStreamCountType** |  |  [optional] |
|**dataSourceId** | **Integer** | Datasource ID |  [optional] |
|**eventDateTimeLower** | **OffsetDateTime** | Optionally filter by EventDateTime |  [optional] |
|**eventDateTimeUpper** | **OffsetDateTime** | Optionally filter by EventDateTime |  [optional] |
|**eventStreamId** | **Integer** | Optionally invoke using an Event Stream ID instead of DataSourceId/TableNameEx. In this mode ColumnTransforms will be defaulted to those published against the columns of the Event Stream but can still be overridden if required |  [optional] |
|**filters** | [**List&lt;ColumnMatchList&gt;**](ColumnMatchList.md) | Additional columns to filter on |  [optional] |
|**isDataRefreshRequired** | **Boolean** | Indicate whether the request can be satisfied with an existing cached result or requires recreation with latest data (default false). Has no effect if PatternId is specified |  [optional] |
|**patternId** | **Integer** | Optionally invoke using a Pattern instead of DataSourceId/TableNameEx. Dates will default to those of the pattern snapshot but can be set to any range contained within that snapshot |  [optional] |
|**tableNameEx** | **String** | Event Stream table (standard two part name ex) |  [optional] |



