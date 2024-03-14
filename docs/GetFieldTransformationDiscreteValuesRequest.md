

# GetFieldTransformationDiscreteValuesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnNameEx** | **String** | Source column to which transforms should be applied |  [optional] |
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**dataSourceId** | **Integer** | Id of the datasource to which column belongs. |  [optional] |
|**isDataRefreshRequired** | **Boolean** | Indicate whether the request can be satisfied with an existing cached result or requires recreation with latest data (default false) |  [optional] |
|**jsONTransforms** | **String** | JSON array of transform to be applied e.g. [{{\\\&quot;FrequencyReplace\\\&quot;:{{\\\&quot;@minimum\\\&quot;:8035,\\\&quot;@replacement\\\&quot;:\\\&quot;My Replacement\\\&quot;}}}}]. Note that attributes must be prefixed with @ |  [optional] |
|**sampleSettings** | [**FieldTransformationSampleSettings**](FieldTransformationSampleSettings.md) |  |  [optional] |



