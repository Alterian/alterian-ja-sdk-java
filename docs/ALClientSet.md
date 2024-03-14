

# ALClientSet

A clientset is a logical collection of clients, for ease of management and navigation. All @see(ALClient)s must exist within exactly one clientset.             Clientsets cannot be nested, but clients can be moved between clientsets.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | The ID of the clientset |  [optional] |
|**name** | **String** | The name of the clientset |  [optional] |
|**clients** | [**List&lt;ALClient&gt;**](ALClient.md) |  |  [optional] |



