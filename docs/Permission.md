

# Permission



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Id of the permission |  [optional] |
|**name** | **String** | Name of the permission |  [optional] |
|**resource** | **ResourceType** |  |  [optional] |
|**itemPermission** | **Integer** | If this permission is applied to a folder, this is the permission id for the underlying item.  For instance, if the resource type is Folder and the permission is \&quot;View Document\&quot; [44], the ItemPermission will be 1 because that is the matching permission for the underlying resource for the folder. |  [optional] |
|**isModify** | **Boolean** | Is the permission a \&quot;modify\&quot; type permission |  [optional] |
|**isView** | **Boolean** | Is the permission a \&quot;view\&quot; type permission |  [optional] |



