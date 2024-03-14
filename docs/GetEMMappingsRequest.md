

# GetEMMappingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**folderID** | **Integer** | @see(Folder) from which to return the list of @see(EMMapping)s.  Pass NULL for the root [not contained within a folder] |  [optional] |
|**includeChildren** | **Boolean** | pass TRUE to find any @see(EMUploadMapping)s which are contained within child folders of the FolderID parameter |  [optional] |



