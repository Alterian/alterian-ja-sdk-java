

# ALUserGroup

A user is a unique profile of permissions and linked to a set of user login credentials. When a user logs in using those credentials, the permissions in the user profile are applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**modified** | **OffsetDateTime** |  |  [optional] |
|**folderID** | **Integer** |  |  [optional] |
|**members** | **List&lt;Object&gt;** | A list that can contain the groups or users that are immediate children of this group. I contain them. |  [optional] |
|**groups** | [**List&lt;ALUserGroup&gt;**](ALUserGroup.md) | The groups that are immediate parents of this group. They contain me. |  [optional] |
|**folderName** | **String** |  |  [optional] |



