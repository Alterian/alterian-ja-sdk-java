

# GetGroupMembersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**groupID** | **Integer** | ID of the group to get membership |  [optional] |
|**includeGroups** | **Boolean** | Should the results also include the members of the groups? Default false |  [optional] |
|**includeUsers** | **Boolean** | Should the results also include the users within this group? Default false |  [optional] |
|**inverse** | **Boolean** | Include FALSE to return back the users and groups which are in the group ID provided; Sent TRUE to get a list of users and groups which are NOT in the group selected. |  [optional] |



