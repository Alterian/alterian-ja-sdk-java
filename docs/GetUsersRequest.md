

# GetUsersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**folderID** | **Integer** | Optionally get just the users in this folder. Provide NULL to list all users, but see IncludeChildren below |  [optional] |
|**groupID** | **Integer** | Optionally get just the users in this group. Provide NULL to list all users |  [optional] |
|**includeChildren** | **Boolean** | If a folderID is supplied, show users in the supplied folder and all its subfolders. If a folderID is not supplied, show all users in all folders (true), or no folders (false) |  [optional] |
|**includeDisabled** | **Boolean** | Include disabled users in the result |  [optional] |



