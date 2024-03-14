

# EventStream



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**groupId** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**dataSourceId** | **Integer** |  |  [optional] |
|**table** | **String** | Returns back the full name of the table which stored the event stream information (includes the database name) |  [optional] |
|**numRows** | **Long** |  |  [optional] |
|**isFIFO** | **Boolean** |  |  [optional] |
|**keys** | [**List&lt;EventStreamKey&gt;**](EventStreamKey.md) |  |  [optional] |
|**models** | [**List&lt;EventStreamModel&gt;**](EventStreamModel.md) |  |  [optional] |
|**ddEQueueName** | **String** |  |  [optional] |
|**ddESiteId** | **Integer** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**queueLockId** | **UUID** |  |  [optional] |
|**databaseName** | **String** |  |  [optional] |
|**ddEClient** | **String** |  |  [optional] |
|**ddETarget** | **String** |  |  [optional] |
|**fields** | [**List&lt;EventStreamField&gt;**](EventStreamField.md) |  |  [optional] |
|**patterns** | [**List&lt;Pattern&gt;**](Pattern.md) |  |  [optional] |
|**status** | **Integer** | Quick status on the stream.  Currently 0 &#x3D; created, -1 means there is a problem and 1 means the stream is pulling data |  [optional] |
|**queueURL** | **String** | URL for the queue, based upon your DDE instance details |  [optional] |



