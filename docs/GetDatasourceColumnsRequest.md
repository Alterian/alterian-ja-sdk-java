

# GetDatasourceColumnsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**includeDisabled** | **Boolean** | Should disabled columns be included in the output?Default false |  [optional] |
|**includeInvisible** | **Boolean** | Should invisible columns be included in the output? Default false |  [optional] |
|**minimalResults** | **Boolean** | Exclude attributes, etc. from the results |  [optional] |
|**nameFilter** | **String** | Optionally filter on the name |  [optional] |
|**tableID** | **Integer** | Supply a table ID to filter the result to just the columns within this table. Ignore this parameter to fetch all columns, which can be very slow. |  [optional] |



