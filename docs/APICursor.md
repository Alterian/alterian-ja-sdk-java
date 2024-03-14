

# APICursor

A cursor is an optional set of data that controls how to get a subset of a list of data from the API.             This parameter can optionally be sent as a parameter to filter the result set returned.             If a cursor is passed to an API method then a cursor will also be returned from the API with additional information populated so that it's easy to calculate the number of pages and find the correct page number             NOTE that a cursor will NOT be returned if it was NOT passed in the initial method call, as all matching results will already have been returned at that point.             This is typically used when paging large sets of data in a UI.             If a cursor is not passed then all matching results are returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **Integer** | What is the first result that should be returned? Note that this is 0-based (0 is the very first row). If this value is not supplied then 0 is assumed. |  [optional] |
|**to** | **Integer** | What is the last result that should be returned? If this value is not supplied then all results are assumed. It is safe to provide a number that is larger than the total number of results.             available. |  [optional] |
|**total** | **Long** | How many results are available in total? This is not used when passing the cursor to a method; it is populated (read only) when the cursor is returned from any method that uses a cursor. |  [optional] |
|**sortDescending** | **Boolean** | If we want to sort the resulting list, do we want it sorted in descending order?  The default is ascending. |  [optional] |
|**sortProperty** | **String** | Property on the object by which you would like to sort.  If an invalid or null property is provided, default sorting will be applied as defined in each API method. |  [optional] |



