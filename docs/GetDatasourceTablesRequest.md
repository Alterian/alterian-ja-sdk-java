

# GetDatasourceTablesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**databaseID** | **Integer** | Supply a database ID to filter the result to just the tables within this database. Ignore this parameter to fetch all tables, which can be slow. |  [optional] |
|**includeDisabled** | **Boolean** | Should disabled tables be included in the output?Default false |  [optional] |
|**includeInvisible** | **Boolean** | Should invisible tables be included in the output? Default false |  [optional] |
|**includeJoins** | **Boolean** | Should joined table information be included in the output? Default false, as this can be large |  [optional] |
|**includeLinks** | **Boolean** | Should linked table information be included in the output? Default false, as this can be large |  [optional] |
|**minimalResults** | **Boolean** | Exclude attributes, etc. from the results |  [optional] |
|**nameFilter** | **String** | Optionally filter on the name |  [optional] |
|**resolutionTableID** | **Integer** | Optionally filter to include only those results that can be directly resolved to the specified table (i.e those that are 1:1 or *:1 joined such that there is a maximum of one linked candidate row per resolution row |  [optional] |



