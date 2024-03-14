

# EMDownloadMapping

Provides a download mapping into the EM system to a specific EM client and user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | Unique ID of this mapping |  [optional] |
|**name** | **String** | Name of this mapping |  [optional] |
|**keyColumnId** | **Integer** | Key column Id associated with this client |  [optional] |
|**keyColumnNameEx** | **String** | Key column NameEx - readonly |  [optional] |
|**responseTable** | **String** | Name of the response table |  [optional] |
|**contactTable** | **String** | Name of the contact table |  [optional] |
|**emPrimarykeyId** | **Integer** | Primary key for EM to which this EM Client is mapped |  [optional] |
|**emUNCOutputLocation** | **String** | UNC path for hosted EM\\CM systems |  [optional] |
|**emPrimaryKeyType** | **Integer** | EM&#39;s primary key type |  [optional] |
|**datasourceId** | **Integer** | Datasource Id associated with this client |  [optional] |
|**emClient** | [**EMClient**](EMClient.md) |  |  [optional] |
|**emClientID** | **Integer** | EM Client ID of this mapping |  [optional] |
|**datasourceName** | **String** | Datasource Name - readonly |  [optional] |
|**ownerID** | **Integer** | The owner\\creator of this EMMapping |  [optional] |
|**canEdit** | **Integer** | Does the Mapping have edit permissions for this user - cannot set this value using this property |  [optional] |
|**isEnabled** | **Boolean** | Is mapping enabled |  [optional] |
|**emPrimaryKeyName** | **String** | EM Primary Key Name |  [optional] |
|**gdCTable** | **String** | Name of the table which will store data collection information for this primary key |  [optional] |
|**preferencesTable** | **String** | Name of the table which will store Preference OptIn\\OptOut data |  [optional] |



