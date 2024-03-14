

# GetUsersWithPermissionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**groupID** | **Integer** | Optionally restrict the check to users that are members of the specified group (either directly or by inclusion in a member group - see IsMemberGroupRecursionAllowed) |  [optional] |
|**isMemberGroupRecursionAllowed** | **Boolean** | Where restricting the check to users that are members of the specified group set to false to require direct membership or true to allow inclusion in one of its member groups |  [optional] |
|**permissionID** | **Integer** | ID of the permission to check |  [optional] |



