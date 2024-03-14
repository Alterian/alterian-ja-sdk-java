

# GetDataSourcesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**datasourceTypeID** | **Integer** | Include only datasources of this type |  [optional] |
|**fullyPopulate** | **Boolean** | Fully populate the datasource structure -- including databases, tables and columns.  For complicated structures, this might take a while to invoke. |  [optional] |
|**includeDisabled** | **Boolean** | Include disabled datasources in the list [default is to not include] |  [optional] |
|**includeInvisible** | **Boolean** | Include invisible datasources in the list [default is to not include] |  [optional] |
|**minimalResults** | **Boolean** | Exclude attributes, etc. from the results |  [optional] |
|**nameFilter** | **String** | Optionally filter on the name |  [optional] |



