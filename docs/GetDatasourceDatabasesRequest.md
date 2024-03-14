

# GetDatasourceDatabasesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**datasourceID** | **Integer** | Supply a datasource ID to filter the result to just the databases within this datasource. Ignore this parameter to fetch all databases. |  [optional] |
|**includeDisabled** | **Boolean** | Should disabled databases be included in the output?Default false |  [optional] |
|**includeInvisible** | **Boolean** | Should invisible databases be included in the output? Default false |  [optional] |
|**minimalResults** | **Boolean** | Exclude attributes, etc. from the results |  [optional] |
|**nameFilter** | **String** | Optionally filter on the name |  [optional] |



