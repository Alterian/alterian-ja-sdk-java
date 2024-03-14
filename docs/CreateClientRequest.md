

# CreateClientRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientName** | **String** | The name of the new client. Method will fail if this client name already exists within the specified @see(ALClientSet) |  [optional] |
|**clientSetID** | **Integer** | The identifier of the @see(ALClientSet) that this client will be created within. Method will fail if this clientset cannot be found |  [optional] |
|**databaseName** | **String** | The name of the SQLServer database that this client will create. Method will fail if this database already exists on the specified database server ID.  May only be 50 characters long and must not start with a number nor have special characters |  [optional] |
|**databaseServerID** | **Integer** | The identifier of the database server that the database will be created within. Method will fail if this database server cannot be found |  [optional] |
|**sourceClientID** | **Integer** |  |  [optional] |



