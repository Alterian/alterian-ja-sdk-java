

# SetPermissionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isGroup** | **Boolean** | Is the security ID a group or a person? |  [optional] |
|**itemID** | **Integer** | ID of the item on which to set permissions. This is NOT globally unique which is why you need to specify the ItemType. |  [optional] |
|**itemType** | **ResourceType** |  |  [optional] |
|**permissions** | [**List&lt;ALPermission&gt;**](ALPermission.md) | Which permissions are being assigned or removed? And is an assigned permission being Allowed or Denied? |  [optional] |
|**securityID** | **Integer** | User or Group ID of which to set the permissions |  [optional] |



