

# SequencePredictorResult



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**processQueueId** | **Integer** | When run asynchronously this ID can be passed to GetProcessStatus to check for completion |  [optional] |
|**modelId** | **Integer** | ID for generated Model |  [optional] |
|**engineModelName** | **String** | Name for generated Model in engine |  [optional] |
|**modelStatus** | **String** | XML summary of the results of the model build |  [optional] |
|**testAccuracy** | **Double** | Final test accuracy stat |  [optional] |
|**testlLoss** | **Double** | Final test loss stat |  [optional] |
|**predictionId** | **Integer** | ID for generated prediction |  [optional] |
|**dataSourceId** | **Integer** | Data source containing the prediction |  [optional] |
|**databaseName** | **String** | Database containing the prediction |  [optional] |
|**tableName** | **String** | Table containing the prediction |  [optional] |



