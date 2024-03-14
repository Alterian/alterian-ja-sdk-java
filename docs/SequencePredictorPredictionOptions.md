

# SequencePredictorPredictionOptions



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**predictionName** | **String** | Name for the generated prediction |  [optional] |
|**predictionSeedOutputOption** | **Integer** | Indicates what proportion of the prediction seed to include in the prediction that is output             0 - None 1- All |  [optional] |
|**predictionSelectionMode** | **Integer** | Whether to always select the most probable next step or to select randomised distribution around the most probable step             0&#x3D;Maximum probability , 1&#x3D;Randomized maximum probability (&#39;Fuzzy&#39; predictions - yields a more realistic looking range of outputs) |  [optional] |
|**numberOfPredictions** | **Integer** | Number of events to predict |  [optional] |
|**isDataDebugRequired** | **Boolean** | Turn this on to leave intermediate tables in place for the purposes of debugging a model                          For &#39;fuzzy mode&#39; predictons this will also cause some extra columns for &#39;Most Likely Event&#39; and &#39;Most Likely Event Probability&#39; to be added to the output for comparison |  [optional] |



