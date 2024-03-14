

# Folder

A folder is a logical container for items which match the foldertype.  All folders have security applied to them, with the exception of @see(ALUser) and @see(ALUserGroup) folders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | ID of the folder; always unique |  [optional] |
|**name** | **String** | Name of the folder; only unique within a ParentID and FolderType |  [optional] |
|**subFolders** | [**List&lt;Folder&gt;**](Folder.md) | GUI helper property; not filled in by the API |  [optional] |
|**items** | **List&lt;Object&gt;** | GUI helper property; not filled in by the API |  [optional] |
|**system** | **Boolean** | Is this a system folder?  You can&#39;t delete system folders |  [optional] |
|**parentID** | **Integer** | Parent of this folder; null means it is a root folder |  [optional] |
|**accessView** | **Boolean** | Can the user view this folder |  [optional] |
|**accessModify** | **Boolean** | Can the user modify this folder in some way [rename, etc.] |  [optional] |
|**ownerID** | **Integer** | The owner of this folder.  This typically starts out as the creator of the folder. |  [optional] |
|**hidden** | **Boolean** | Has this folder been flagged as \&quot;hidden\&quot; |  [optional] |
|**ancestorFolderIDs** | **List&lt;Integer&gt;** | The ids of all the folders under the root that are ancestors of this one, ordered from parent to child             Only populated by the GetFolder API |  [optional] |
|**childCount** | **Integer** | Count of the folders immediate children |  [optional] |



