

# SaveFieldTransformListRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Optional ID for use when creating a new version of an existing transform list |  [optional] |
|**jsONTransforms** | **String** | Assumed to be a JSON array of single level objects e.g. [{{\\\&quot;FrequencyReplace\\\&quot;:{{\\\&quot;@minimum\\\&quot;:8035,\\\&quot;@replacement\\\&quot;:\\\&quot;My Replacement\\\&quot;}}}}]. Note that attributes must be prefixed with @ |  [optional] |
|**metadata** | **String** | JSON Blob used by the UI to store sampling settings / screen layout when editing the transform |  [optional] |
|**name** | **String** | Name of the list (required for new lists) |  [optional] |



