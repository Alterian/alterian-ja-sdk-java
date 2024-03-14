

# OperationResult



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusCode** | **String** | A string constant representing the success or failure of the method call. See the status codes table below. |  [optional] |
|**debugMessage** | **String** | By default, an empty array []. Internal debug messages can be exposed by changing a configuration setting on the server, but be aware that this can leak internal implementation details such as stack calls or method names to the caller. |  [optional] |
|**detail** | **List&lt;List&lt;String&gt;&gt;** | Optionally return additional information about this API call             This will typically contain the reason WHY a method failed (if it fails), warnings if success, and other bits of data that             are NOT part of the main result. |  [optional] |
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |



