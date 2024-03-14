

# RunSequencePredictorRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventStreamId** | **Integer** | Event Stream ID |  [optional] |
|**isPublic** | **Boolean** | Set to true for a public model or prediction that should be shared across users. Set to false for the model and prediction to be associated with the token&#39;s user |  [optional] |
|**isSynchronous** | **Boolean** | Set to false to run asynchronously. In this mode, the ProcessQueueId result property will be populated and can be passed to GetProcessStatus to check for completion |  [optional] |
|**modelId** | **Integer** | Specify this to use an existing model rather than training a new one |  [optional] |
|**predictionOptions** | [**SequencePredictorPredictionOptions**](SequencePredictorPredictionOptions.md) |  |  [optional] |
|**predictionSnapshotOptions** | [**ModelSnapshotOptions**](ModelSnapshotOptions.md) |  |  [optional] |
|**trainingOptions** | [**SequencePredictorTrainingOptions**](SequencePredictorTrainingOptions.md) |  |  [optional] |
|**trainingSnapshotOptions** | [**ModelSnapshotOptions**](ModelSnapshotOptions.md) |  |  [optional] |



