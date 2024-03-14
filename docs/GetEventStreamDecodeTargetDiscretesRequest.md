

# GetEventStreamDecodeTargetDiscretesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseListId** | **Integer** | Optionally base the decodes on a specified decode list subject to any explicitly specified overrides |  [optional] |
|**baseListVersion** | **Integer** | Optional list version (defaults to latest) |  [optional] |
|**columnName** | **String** | Column from the event stream to be decoded (defaults to Location) |  [optional] |
|**defaultLabel** | **String** | In conjunction with IsDefaultLabelConfigured this allows the API to override the default label from any specified base decode list. Pass NULL to remove an underlying list default and an empty string or space to override it to NULL |  [optional] |
|**eventDateTimeLower** | **OffsetDateTime** | Start of the date window for column values to be displayed and decoded |  [optional] |
|**eventDateTimeUpper** | **OffsetDateTime** | End of the date window for column values to be displayed and decoded |  [optional] |
|**eventStreamId** | **Integer** | Event Stream Id |  [optional] |
|**isDataRefreshRequired** | **Boolean** | Force the source labels to be refreshed from the event stream data |  [optional] |
|**isDefaultLabelConfigured** | **Boolean** | Set this to true if DefaultLabel is being used. If set to false then the default label will be determined by any specified base decode list |  [optional] |
|**sourceLabels** | **List&lt;String&gt;** | Specify any source labels that should be overriden on the specified base decode list |  [optional] |
|**targetLabels** | **List&lt;String&gt;** | Specify the target labels that should override the specified base decode list. Pass NULL to remove an underlying list decode or an empty string to override it to NULL. Pass a NULL list to remove mappings for all the specified source labels |  [optional] |



