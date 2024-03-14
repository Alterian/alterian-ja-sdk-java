

# ALDataSourceTable

Contains information about a database table.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | Unique ID of the datasource |  [optional] |
|**name** | **String** | Name of the datasource [must be unique] |  [optional] |
|**nameEx** | **String** | Full name of this table, which includes in the datasource and the native name for the table in the pattern (datasource).[database].[table] |  [optional] |
|**enabled** | **Boolean** | Whether or not this datasource is enabled |  [optional] |
|**visible** | **Boolean** | Whether or not this datasource is visible |  [optional] |
|**accessView** | **Boolean** | Can the user view this datasource |  [optional] |
|**accessModify** | **Boolean** | Not currently used |  [optional] |
|**attributes** | [**List&lt;DatasourceAttribute&gt;**](DatasourceAttribute.md) | Attributes for this datasource.  @see(DatasourceAttribute) |  [optional] |
|**databaseID** | **Integer** | The ID of the database that this table belongs to. |  [optional] |
|**nativeName** | **String** | The fully qualified name as used by the underlying datasource type. |  [optional] |
|**columns** | [**List&lt;ALDataSourceColumn&gt;**](ALDataSourceColumn.md) |  |  [optional] |
|**datasourceTypeID** | **Integer** | What kind of datasource is this a table from?  See @see(GetDataSourceTypes) to fetch a list of the available datasource types. |  [optional] |
|**primaryKey** | [**ALDatasourcePrimaryKey**](ALDatasourcePrimaryKey.md) |  |  [optional] |
|**resolverTableID** | **Integer** |  |  [optional] |
|**joins** | [**List&lt;ALDatasourceJoin&gt;**](ALDatasourceJoin.md) | List which columns are part of any defined join between this table and linked tables. |  [optional] |
|**links** | [**List&lt;ALDatasourceLink&gt;**](ALDatasourceLink.md) | What other tables can this table be linked to? |  [optional] |
|**fullNativeName** | **String** | The entire native name of this item -- usually includes database and table |  [optional] |
|**datasourceId** | **Integer** | ID of the Datasource |  [optional] |



