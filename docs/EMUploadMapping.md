

# EMUploadMapping

Provides an upload mapping into the EM system to a specific EM client and user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | Unique ID of this mapping |  [optional] |
|**name** | **String** | Name of this mapping |  [optional] |
|**folderID** | **Integer** | Folder in which this mapping is located |  [optional] |
|**emUserID** | **Integer** | EM User ID of this mapping |  [optional] |
|**created** | **OffsetDateTime** | Date that this mapping was created |  [optional] |
|**modified** | **OffsetDateTime** | Date that this mapping was last modified |  [optional] |
|**ownerID** | **Integer** | The owner\\creator of this EMMapping |  [optional] |
|**emUserName** | **String** | A cache of the user name which maps to the EMUserID on the EM side. |  [optional] |
|**canEdit** | **Integer** | Does the Mapping have edit permissions for this user - cannot set this value using this property |  [optional] |
|**emClient** | [**EMClient**](EMClient.md) |  |  [optional] |
|**emClientID** | **Integer** | EM Client ID of this mapping |  [optional] |
|**isEnabled** | **Boolean** | Is mapping enabled |  [optional] |



