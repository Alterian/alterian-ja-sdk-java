

# CreateEventStreamGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ddEClient** | **String** | Client in DDE in which you would like to create the event stream |  [optional] |
|**ddESiteId** | **Integer** | An integer uniquely identifying the DDE system.  This site id is provided when it has been added via the SysAdminApp&#39;s AddDDESite command. |  [optional] |
|**eventStreamDatabase** | **String** | Name of the engine database into which to place the event stream data |  [optional] |
|**isFifoQueueRequired** | **Boolean** | (default false) |  [optional] |
|**name** | **String** | Name of the event stream you would like to create |  [optional] |
|**project** | **String** | Engine project into which to place the Event tables |  [optional] |
|**queueLockIds** | **List&lt;String&gt;** | If the event stream is to be attached to an existing set of queues then the lock ids must be specified (in any order). This pre-supposes that any existing consumer event streams have been deleted/disconnected |  [optional] |
|**server** | **String** | Engine server on which to install the Event tables |  [optional] |
|**skipDefaultQueueSetup** | **Boolean** | If this is true then the AlterianCX_defaultQueue global parameter will not be set (default false) |  [optional] |



