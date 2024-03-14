

# CreateDatasourceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;DatasourceAttribute&gt;**](DatasourceAttribute.md) | Optional additional attributes.  If not supplied, most datasource attributes will be populated with sensible defaults. |  [optional] |
|**name** | **String** | Name of the datasource |  [optional] |
|**project** | **String** | Name of the engine project |  [optional] |
|**server** | **String** | Server on which the engine project is located |  [optional] |
|**systemDataLocation** | **String** | If this parameter is specified, all IMS system data (e.g. metrics, campaign data, etc.) will be stored in this location.  Please note that if the project already has system generated data, it will not move that data to the new location. |  [optional] |



