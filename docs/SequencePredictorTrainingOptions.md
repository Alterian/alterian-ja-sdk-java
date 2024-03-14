

# SequencePredictorTrainingOptions



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelName** | **String** | Name for the generated model |  [optional] |
|**trainingRatio** | **Double** | Percentage ratio of training examples to test examples |  [optional] |
|**encodingPadMode** | **Integer** | For shorter sequences, choose whether to pad with nulls on the left or right             1&#x3D;left padding,2&#x3D;right padding |  [optional] |
|**randomSeed** | **Integer** | Specify a random seed to initialise the random number generator with |  [optional] |
|**embeddingLayerSize** | **Integer** | Defines the number of output nodes the embedding layer has - defaults to dictionary size (number of distinct event names + 2) |  [optional] |
|**lstmLayerSize** | **Integer** | Defines the number of units used in the LSTM layer (long short term memory) |  [optional] |
|**numberOfEpochs** | **Integer** | Number of epochs that training will attempt (an epoch is an iteration of all training samples through the training process) |  [optional] |
|**batchSize** | **Integer** | Number of training samples to include in a single model update                          The batch size influences the performance of training at the expense of accuracy. A lower batch size may produce a more accurate model, but will training more slowly, a large batch size has the opposite affect |  [optional] |
|**categoricalFeatures** | **List&lt;String&gt;** | Column names of any additional categorical features on the event stream table that are to be used in training e.g. Initiative (Location is implied) |  [optional] |
|**isDataDebugRequired** | **Boolean** | Turn this on to leave intermediate tables in place for the purposes of debugging a model |  [optional] |
|**isCombineCategoriesRequired** | **Boolean** | Turn this on to combine categorical features into a single composite state and avoid generating mutually exclusive combinations |  [optional] |



