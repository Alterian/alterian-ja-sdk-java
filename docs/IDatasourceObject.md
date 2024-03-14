

# IDatasourceObject



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | Unique ID of the datasource |  [optional] |
|**name** | **String** | Name of the datasource [must be unique] |  [optional] |
|**nameEx** | **String** | NameEX |  [optional] |
|**enabled** | **Boolean** | Whether or not this datasource is enabled |  [optional] |
|**visible** | **Boolean** | Whether or not this datasource is visible |  [optional] |
|**accessView** | **Boolean** | Can the user view this datasource |  [optional] |
|**accessModify** | **Boolean** | Not currently used |  [optional] |
|**attributes** | [**List&lt;DatasourceAttribute&gt;**](DatasourceAttribute.md) | Attributes for this datasource.  @see(DatasourceAttribute) |  [optional] |
|**fullNativeName** | **String** | The entire native name of this item -- usually includes database and table |  [optional] |



