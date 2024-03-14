

# APILastModifiedCursor



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastModified** | **OffsetDateTime** | Indicates when the data structure last changed |  [optional] |
|**from** | **Integer** | What is the first result that should be returned? Note that this is 0-based (0 is the very first row). If this value is not supplied then 0 is assumed. |  [optional] |
|**to** | **Integer** | What is the last result that should be returned? If this value is not supplied then all results are assumed. It is safe to provide a number that is larger than the total number of results.             available. |  [optional] |
|**total** | **Long** | How many results are available in total? This is not used when passing the cursor to a method; it is populated (read only) when the cursor is returned from any method that uses a cursor. |  [optional] |
|**sortDescending** | **Boolean** | If we want to sort the resulting list, do we want it sorted in descending order?  The default is ascending. |  [optional] |
|**sortProperty** | **String** | Property on the object by which you would like to sort.  If an invalid or null property is provided, default sorting will be applied as defined in each API method. |  [optional] |



