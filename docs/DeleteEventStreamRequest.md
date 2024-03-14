

# DeleteEventStreamRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteDDEGlobalParameters** | **Boolean** | Use this to delete any global parameters set up in DDE to reference queues. Only do this if this is the &#39;default queue&#39; |  [optional] |
|**deleteDDEQueue** | **Boolean** | Pass true if you would like to delete the queue in DDE; note, if this queue is in use in a rule, the rule will fail. |  [optional] |
|**id** | **Integer** | Id of the event stream you would like to delete |  [optional] |
|**purgeDDEQueue** | **Boolean** | The deletion of the queue in DDE will fail if the queue is not empty; pass true if you want to purge the queue first |  [optional] |



