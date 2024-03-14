

# GetGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**folderID** | **Integer** | List groups in a particular folder, null if you want a list of all groups |  [optional] |
|**includeChildren** | **Boolean** | If a folder ID is provided, find any child folders and list the contents of those as well |  [optional] |
|**includeDisabled** | **Boolean** | Should the results also include groups which have the Enabled flag set to false? False by default. |  [optional] |



