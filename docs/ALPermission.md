

# ALPermission

This represents a particular permission which is applied [either via inheritance or diretly] to a user.  A user may inherit permissions from folders or group membership.  Anything which has not been granted in some manner will be denied by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | The ID of the permission. (What right is being allowed or denied?) |  [optional] |
|**value** | **ALPermissionFlag** |  |  [optional] |
|**name** | **String** | The name of the permission |  [optional] |
|**source** | **PermissionSource** |  |  [optional] |



