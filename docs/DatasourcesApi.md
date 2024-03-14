# DatasourcesApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**areDatasourceCampaignsPaused**](DatasourcesApi.md#areDatasourceCampaignsPaused) | **POST** /AreDatasourceCampaignsPaused | Pausing a datasource can take a while, as the campaigns and metrics in this datasource will need to complete their current action before pausing.              The @see(PauseDatasourceCampaigns) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of campaigns and metrics which are still running, and can be used in @see(GetCampaign) or @see(GetMetric) to get further details about the              campaign(s)/metric(s) that are preventing the datasource from pausing. |
| [**areDatasourceJobsComplete**](DatasourcesApi.md#areDatasourceJobsComplete) | **POST** /AreDatasourceJobsComplete | Finishing off any in-progress jobs on a datasource can take a while, as the SEV loaders and archivers in this datasource will need to complete their current action before exiting.              The @see(MarkDatasourceAsPendingDisable) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of active jobs which are still running |
| [**createDataSourceMapping**](DatasourcesApi.md#createDataSourceMapping) | **POST** /CreateDataSourceMapping | Add in a @see(DatasourceUserMapping). |
| [**createDatasource**](DatasourcesApi.md#createDatasource) | **POST** /CreateDatasource | Creates an engine datasource configured to point at the specified server and project. |
| [**deleteDataSourceMapping**](DatasourcesApi.md#deleteDataSourceMapping) | **POST** /DeleteDataSourceMapping | Remove a @see(DatasourceUserMapping) from the system.  Once this is done, the particular @see(ALUser) will return back to using SYSTEM as the engine User |
| [**deleteDatasource**](DatasourcesApi.md#deleteDatasource) | **POST** /DeleteDatasource | Deletes a datasource.  Please note that any document which accesses this datasource might not be able to opened.  This method will fail if there are any campaigns which are active against this datasource. |
| [**deleteFieldTransformList**](DatasourcesApi.md#deleteFieldTransformList) | **POST** /DeleteFieldTransformList | Delete all versions of the specified transformation list |
| [**deleteTransform**](DatasourcesApi.md#deleteTransform) | **POST** /DeleteTransform | Delete all versions of the specified transform |
| [**disableDatasource**](DatasourcesApi.md#disableDatasource) | **POST** /DisableDatasource | Marks a datasource as disabled and invisible.  Typically used as part of the load process.  Please note that once you mark a datasource as disabled, anything which relies upon it will cease to function so make sure you pause campaigns first using @see(PauseDatasourceCampaigns) and verify all campaign activity has ceased with @see(AreDatasourceCampaignsPaused) |
| [**enableDatasource**](DatasourcesApi.md#enableDatasource) | **POST** /EnableDatasource | Marks a datasource as enabled and visible.  This makes the datasource available for immediate usage.  You can optionally ask the engine listener service to refresh this datasource upon next poll.  Useful for doing a dataload. |
| [**exportFieldTransformList**](DatasourcesApi.md#exportFieldTransformList) | **GET** /ExportFieldTransformList | Export a list of field transforms for use in transforming discrete values |
| [**getDataSourceAttributes**](DatasourcesApi.md#getDataSourceAttributes) | **POST** /GetDataSourceAttributes | Get a list of the attributes which can be applied to the given type of datasource. |
| [**getDataSourceEngineUserName**](DatasourcesApi.md#getDataSourceEngineUserName) | **POST** /GetDataSourceEngineUserName | Given a userID and datasourceID, return back the engine user name which should be used whilst connecting |
| [**getDataSourceItems**](DatasourcesApi.md#getDataSourceItems) | **POST** /GetDataSourceItems | Allows you to search for data source objects, inclusing datasource, database, table and columns. |
| [**getDataSourceMappings**](DatasourcesApi.md#getDataSourceMappings) | **POST** /GetDataSourceMappings | Return back the @see(DatasourceUserMapping)s in the system |
| [**getDataSourceTypes**](DatasourcesApi.md#getDataSourceTypes) | **POST** /GetDataSourceTypes | Return back a list of @see(ALDataSourceType) for use with @see(ALDataSource)s. |
| [**getDataSourceUsers**](DatasourcesApi.md#getDataSourceUsers) | **POST** /GetDataSourceUsers | Requests a list of users from a particular @see(ALDataSource).  This call currently only functions against an Engine @see(ALDataSource). |
| [**getDataSources**](DatasourcesApi.md#getDataSources) | **POST** /GetDataSources | Returns back a list of @see(ALDataSource)s from the system |
| [**getDatasource**](DatasourcesApi.md#getDatasource) | **POST** /GetDatasource | Retrieves the top level data for a datasource.  Does not fully populate the datasource.  This is useful for getting things like the project, server and last refresh date. |
| [**getDatasourceColumn**](DatasourcesApi.md#getDatasourceColumn) | **POST** /GetDatasourceColumn | Fetch the details of one column from the system. |
| [**getDatasourceColumns**](DatasourcesApi.md#getDatasourceColumns) | **POST** /GetDatasourceColumns | Fetch a list of columns from the system. |
| [**getDatasourceDatabases**](DatasourcesApi.md#getDatasourceDatabases) | **POST** /GetDatasourceDatabases | Fetch a list of databases from the system. |
| [**getDatasourceFieldTypes**](DatasourcesApi.md#getDatasourceFieldTypes) | **POST** /GetDatasourceFieldTypes | Fetch a list of the available types of field that are supported |
| [**getDatasourceTables**](DatasourcesApi.md#getDatasourceTables) | **POST** /GetDatasourceTables | Fetch a list of tables from the system. |
| [**getDecodeList**](DatasourcesApi.md#getDecodeList) | **POST** /GetDecodeList | Get a specified decode list |
| [**getFieldTransformList**](DatasourcesApi.md#getFieldTransformList) | **POST** /GetFieldTransformList | Get a list of field transforms for use in transforming discrete values |
| [**getFieldTransformLists**](DatasourcesApi.md#getFieldTransformLists) | **POST** /GetFieldTransformLists | Get the basic details for all available transform lists (Name, Id, (Max) Version- but not Metadata or JSON transforms) |
| [**getProcessStatus**](DatasourcesApi.md#getProcessStatus) | **POST** /GetProcessStatus | Gets the status of a process which was queued.  Note that once the process is finished, you may only get the status once and each call thereafter will return NotFound. |
| [**getTransforms**](DatasourcesApi.md#getTransforms) | **POST** /GetTransforms | Get the basic details for all available transforms (Name, Id, (Max) Version, Type) and which versions have actually been published |
| [**markDatasourceAsPendingDisable**](DatasourcesApi.md#markDatasourceAsPendingDisable) | **POST** /MarkDatasourceAsPendingDisable | Mark a data source as pending disable. This will cause any active SEV threads to exit upon their next iteration, which can take a while.              Clients should then call @see(AreDatasourceJobsComplete) to check that the datasource is idle before continuing to perform the actual disable, and can call @see(DisableDatasource) |
| [**pauseDatasourceCampaigns**](DatasourcesApi.md#pauseDatasourceCampaigns) | **POST** /PauseDatasourceCampaigns | Pause the campaigns in this datasource. This will request all the campaigns that use this datasource to be paused, which can take a while.              Clients should then call @see(AreDatasourceCampaignsPaused) to check that the datasource is idle before continuing, and can call @see(ResumeDatasourceCampaigns) |
| [**refreshDatasource**](DatasourcesApi.md#refreshDatasource) | **POST** /RefreshDatasource | Requests an immediate refresh of an engine datasource.  Call @see(GetProcessStatus) to determine when the refresh has finished or check the LastRefresh date on the datasource. |
| [**resumeDatasourceCampaigns**](DatasourcesApi.md#resumeDatasourceCampaigns) | **POST** /ResumeDatasourceCampaigns | Resume the campaigns in this datasource. This is the opposite of @see(PauseDatasourceCampaigns), and only campaigns that were paused by that method will be resumed. Campaigns that             were paused manually will not be resumed. |
| [**saveDecodeList**](DatasourcesApi.md#saveDecodeList) | **POST** /SaveDecodeList | Save a list of decodes |
| [**saveFieldTransformList**](DatasourcesApi.md#saveFieldTransformList) | **POST** /SaveFieldTransformList | Save a list of field transforms for use in transforming discrete values |
| [**updateDataSourceMapping**](DatasourcesApi.md#updateDataSourceMapping) | **POST** /UpdateDataSourceMapping | Updates a @see(DatasourceUserMapping) to map it to another engine user name. |
| [**updateDatasource**](DatasourcesApi.md#updateDatasource) | **POST** /UpdateDatasource | Updates an @see(ALDataSource) with the data which is provided.  Please note that the only properties which are relevant are IsEnabled, IsVisible, Name, LastRefresh and attributes. |


<a id="areDatasourceCampaignsPaused"></a>
# **areDatasourceCampaignsPaused**
> AreDatasourceCampaignsPausedDefaultResponse areDatasourceCampaignsPaused(areDatasourceCampaignsPausedRequest)

Pausing a datasource can take a while, as the campaigns and metrics in this datasource will need to complete their current action before pausing.              The @see(PauseDatasourceCampaigns) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of campaigns and metrics which are still running, and can be used in @see(GetCampaign) or @see(GetMetric) to get further details about the              campaign(s)/metric(s) that are preventing the datasource from pausing.

Pausing a datasource can take a while, as the campaigns and metrics in this datasource will need to complete their current action before pausing.              The @see(PauseDatasourceCampaigns) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of campaigns and metrics which are still running, and can be used in @see(GetCampaign) or @see(GetMetric) to get further details about the              campaign(s)/metric(s) that are preventing the datasource from pausing.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    AreDatasourceCampaignsPausedRequest areDatasourceCampaignsPausedRequest = new AreDatasourceCampaignsPausedRequest(); // AreDatasourceCampaignsPausedRequest | Pausing a datasource can take a while, as the campaigns and metrics in this datasource will need to complete their current action before pausing.              The @see(PauseDatasourceCampaigns) call will return immediately, but this method should be called repeatedly until the list of ID's returned is empty.             Note that the id's returned are the list of campaigns and metrics which are still running, and can be used in @see(GetCampaign) or @see(GetMetric) to get further details about the              campaign(s)/metric(s) that are preventing the datasource from pausing.
    try {
      AreDatasourceCampaignsPausedDefaultResponse result = apiInstance.areDatasourceCampaignsPaused(areDatasourceCampaignsPausedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#areDatasourceCampaignsPaused");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **areDatasourceCampaignsPausedRequest** | [**AreDatasourceCampaignsPausedRequest**](AreDatasourceCampaignsPausedRequest.md)| Pausing a datasource can take a while, as the campaigns and metrics in this datasource will need to complete their current action before pausing.              The @see(PauseDatasourceCampaigns) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of campaigns and metrics which are still running, and can be used in @see(GetCampaign) or @see(GetMetric) to get further details about the              campaign(s)/metric(s) that are preventing the datasource from pausing. | |

### Return type

[**AreDatasourceCampaignsPausedDefaultResponse**](AreDatasourceCampaignsPausedDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="areDatasourceJobsComplete"></a>
# **areDatasourceJobsComplete**
> AreDatasourceCampaignsPausedDefaultResponse areDatasourceJobsComplete(areDatasourceJobsCompleteRequest)

Finishing off any in-progress jobs on a datasource can take a while, as the SEV loaders and archivers in this datasource will need to complete their current action before exiting.              The @see(MarkDatasourceAsPendingDisable) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of active jobs which are still running

Finishing off any in-progress jobs on a datasource can take a while, as the SEV loaders and archivers in this datasource will need to complete their current action before exiting.              The @see(MarkDatasourceAsPendingDisable) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of active jobs which are still running

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    AreDatasourceJobsCompleteRequest areDatasourceJobsCompleteRequest = new AreDatasourceJobsCompleteRequest(); // AreDatasourceJobsCompleteRequest | Finishing off any in-progress jobs on a datasource can take a while, as the SEV loaders and archivers in this datasource will need to complete their current action before exiting.              The @see(MarkDatasourceAsPendingDisable) call will return immediately, but this method should be called repeatedly until the list of ID's returned is empty.             Note that the id's returned are the list of active jobs which are still running
    try {
      AreDatasourceCampaignsPausedDefaultResponse result = apiInstance.areDatasourceJobsComplete(areDatasourceJobsCompleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#areDatasourceJobsComplete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **areDatasourceJobsCompleteRequest** | [**AreDatasourceJobsCompleteRequest**](AreDatasourceJobsCompleteRequest.md)| Finishing off any in-progress jobs on a datasource can take a while, as the SEV loaders and archivers in this datasource will need to complete their current action before exiting.              The @see(MarkDatasourceAsPendingDisable) call will return immediately, but this method should be called repeatedly until the list of ID&#39;s returned is empty.             Note that the id&#39;s returned are the list of active jobs which are still running | |

### Return type

[**AreDatasourceCampaignsPausedDefaultResponse**](AreDatasourceCampaignsPausedDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="createDataSourceMapping"></a>
# **createDataSourceMapping**
> AUTHChangePasswordDefaultResponse createDataSourceMapping(createDataSourceMappingRequest)

Add in a @see(DatasourceUserMapping).

Add in a @see(DatasourceUserMapping).

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    CreateDataSourceMappingRequest createDataSourceMappingRequest = new CreateDataSourceMappingRequest(); // CreateDataSourceMappingRequest | Add in a @see(DatasourceUserMapping).
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.createDataSourceMapping(createDataSourceMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#createDataSourceMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataSourceMappingRequest** | [**CreateDataSourceMappingRequest**](CreateDataSourceMappingRequest.md)| Add in a @see(DatasourceUserMapping). | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="createDatasource"></a>
# **createDatasource**
> CreateClientDefaultResponse createDatasource(createDatasourceRequest)

Creates an engine datasource configured to point at the specified server and project.

Creates an engine datasource configured to point at the specified server and project.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    CreateDatasourceRequest createDatasourceRequest = new CreateDatasourceRequest(); // CreateDatasourceRequest | Creates an engine datasource configured to point at the specified server and project.
    try {
      CreateClientDefaultResponse result = apiInstance.createDatasource(createDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#createDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDatasourceRequest** | [**CreateDatasourceRequest**](CreateDatasourceRequest.md)| Creates an engine datasource configured to point at the specified server and project. | |

### Return type

[**CreateClientDefaultResponse**](CreateClientDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteDataSourceMapping"></a>
# **deleteDataSourceMapping**
> AUTHChangePasswordDefaultResponse deleteDataSourceMapping(createDataSourceMappingRequest)

Remove a @see(DatasourceUserMapping) from the system.  Once this is done, the particular @see(ALUser) will return back to using SYSTEM as the engine User

Remove a @see(DatasourceUserMapping) from the system.  Once this is done, the particular @see(ALUser) will return back to using SYSTEM as the engine User

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    CreateDataSourceMappingRequest createDataSourceMappingRequest = new CreateDataSourceMappingRequest(); // CreateDataSourceMappingRequest | Remove a @see(DatasourceUserMapping) from the system.  Once this is done, the particular @see(ALUser) will return back to using SYSTEM as the engine User
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteDataSourceMapping(createDataSourceMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#deleteDataSourceMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataSourceMappingRequest** | [**CreateDataSourceMappingRequest**](CreateDataSourceMappingRequest.md)| Remove a @see(DatasourceUserMapping) from the system.  Once this is done, the particular @see(ALUser) will return back to using SYSTEM as the engine User | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteDatasource"></a>
# **deleteDatasource**
> AUTHChangePasswordDefaultResponse deleteDatasource(deleteDatasourceRequest)

Deletes a datasource.  Please note that any document which accesses this datasource might not be able to opened.  This method will fail if there are any campaigns which are active against this datasource.

Deletes a datasource.  Please note that any document which accesses this datasource might not be able to opened.  This method will fail if there are any campaigns which are active against this datasource.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    DeleteDatasourceRequest deleteDatasourceRequest = new DeleteDatasourceRequest(); // DeleteDatasourceRequest | Deletes a datasource.  Please note that any document which accesses this datasource might not be able to opened.  This method will fail if there are any campaigns which are active against this datasource.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteDatasource(deleteDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#deleteDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteDatasourceRequest** | [**DeleteDatasourceRequest**](DeleteDatasourceRequest.md)| Deletes a datasource.  Please note that any document which accesses this datasource might not be able to opened.  This method will fail if there are any campaigns which are active against this datasource. | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteFieldTransformList"></a>
# **deleteFieldTransformList**
> AUTHChangePasswordDefaultResponse deleteFieldTransformList(deleteFieldTransformListRequest)

Delete all versions of the specified transformation list

Delete all versions of the specified transformation list

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    DeleteFieldTransformListRequest deleteFieldTransformListRequest = new DeleteFieldTransformListRequest(); // DeleteFieldTransformListRequest | Delete all versions of the specified transformation list
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteFieldTransformList(deleteFieldTransformListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#deleteFieldTransformList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteFieldTransformListRequest** | [**DeleteFieldTransformListRequest**](DeleteFieldTransformListRequest.md)| Delete all versions of the specified transformation list | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteTransform"></a>
# **deleteTransform**
> AUTHChangePasswordDefaultResponse deleteTransform(deleteTransformRequest)

Delete all versions of the specified transform

Delete all versions of the specified transform

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    DeleteTransformRequest deleteTransformRequest = new DeleteTransformRequest(); // DeleteTransformRequest | Delete all versions of the specified transform
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteTransform(deleteTransformRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#deleteTransform");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteTransformRequest** | [**DeleteTransformRequest**](DeleteTransformRequest.md)| Delete all versions of the specified transform | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="disableDatasource"></a>
# **disableDatasource**
> AUTHChangePasswordDefaultResponse disableDatasource(disableDatasourceRequest)

Marks a datasource as disabled and invisible.  Typically used as part of the load process.  Please note that once you mark a datasource as disabled, anything which relies upon it will cease to function so make sure you pause campaigns first using @see(PauseDatasourceCampaigns) and verify all campaign activity has ceased with @see(AreDatasourceCampaignsPaused)

Marks a datasource as disabled and invisible.  Typically used as part of the load process.  Please note that once you mark a datasource as disabled, anything which relies upon it will cease to function so make sure you pause campaigns first using @see(PauseDatasourceCampaigns) and verify all campaign activity has ceased with @see(AreDatasourceCampaignsPaused)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    DisableDatasourceRequest disableDatasourceRequest = new DisableDatasourceRequest(); // DisableDatasourceRequest | Marks a datasource as disabled and invisible.  Typically used as part of the load process.  Please note that once you mark a datasource as disabled, anything which relies upon it will cease to function so make sure you pause campaigns first using @see(PauseDatasourceCampaigns) and verify all campaign activity has ceased with @see(AreDatasourceCampaignsPaused)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.disableDatasource(disableDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#disableDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **disableDatasourceRequest** | [**DisableDatasourceRequest**](DisableDatasourceRequest.md)| Marks a datasource as disabled and invisible.  Typically used as part of the load process.  Please note that once you mark a datasource as disabled, anything which relies upon it will cease to function so make sure you pause campaigns first using @see(PauseDatasourceCampaigns) and verify all campaign activity has ceased with @see(AreDatasourceCampaignsPaused) | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="enableDatasource"></a>
# **enableDatasource**
> AUTHChangePasswordDefaultResponse enableDatasource(enableDatasourceRequest)

Marks a datasource as enabled and visible.  This makes the datasource available for immediate usage.  You can optionally ask the engine listener service to refresh this datasource upon next poll.  Useful for doing a dataload.

Marks a datasource as enabled and visible.  This makes the datasource available for immediate usage.  You can optionally ask the engine listener service to refresh this datasource upon next poll.  Useful for doing a dataload.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    EnableDatasourceRequest enableDatasourceRequest = new EnableDatasourceRequest(); // EnableDatasourceRequest | Marks a datasource as enabled and visible.  This makes the datasource available for immediate usage.  You can optionally ask the engine listener service to refresh this datasource upon next poll.  Useful for doing a dataload.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.enableDatasource(enableDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#enableDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **enableDatasourceRequest** | [**EnableDatasourceRequest**](EnableDatasourceRequest.md)| Marks a datasource as enabled and visible.  This makes the datasource available for immediate usage.  You can optionally ask the engine listener service to refresh this datasource upon next poll.  Useful for doing a dataload. | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="exportFieldTransformList"></a>
# **exportFieldTransformList**
> File exportFieldTransformList(id, version)

Export a list of field transforms for use in transforming discrete values

Export a list of field transforms for use in transforming discrete values

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer version = 56; // Integer | 
    try {
      File result = apiInstance.exportFieldTransformList(id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#exportFieldTransformList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | [optional] |
| **version** | **Integer**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSourceAttributes"></a>
# **getDataSourceAttributes**
> GetDataSourceAttributesDefaultResponse getDataSourceAttributes(getDataSourceAttributesRequest)

Get a list of the attributes which can be applied to the given type of datasource.

Get a list of the attributes which can be applied to the given type of datasource.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDataSourceAttributesRequest getDataSourceAttributesRequest = new GetDataSourceAttributesRequest(); // GetDataSourceAttributesRequest | Get a list of the attributes which can be applied to the given type of datasource.
    try {
      GetDataSourceAttributesDefaultResponse result = apiInstance.getDataSourceAttributes(getDataSourceAttributesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSourceAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDataSourceAttributesRequest** | [**GetDataSourceAttributesRequest**](GetDataSourceAttributesRequest.md)| Get a list of the attributes which can be applied to the given type of datasource. | |

### Return type

[**GetDataSourceAttributesDefaultResponse**](GetDataSourceAttributesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSourceEngineUserName"></a>
# **getDataSourceEngineUserName**
> GetDataSourceEngineUserNameDefaultResponse getDataSourceEngineUserName(getDataSourceEngineUserNameRequest)

Given a userID and datasourceID, return back the engine user name which should be used whilst connecting

Given a userID and datasourceID, return back the engine user name which should be used whilst connecting

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDataSourceEngineUserNameRequest getDataSourceEngineUserNameRequest = new GetDataSourceEngineUserNameRequest(); // GetDataSourceEngineUserNameRequest | Given a userID and datasourceID, return back the engine user name which should be used whilst connecting
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.getDataSourceEngineUserName(getDataSourceEngineUserNameRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSourceEngineUserName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDataSourceEngineUserNameRequest** | [**GetDataSourceEngineUserNameRequest**](GetDataSourceEngineUserNameRequest.md)| Given a userID and datasourceID, return back the engine user name which should be used whilst connecting | |

### Return type

[**GetDataSourceEngineUserNameDefaultResponse**](GetDataSourceEngineUserNameDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSourceItems"></a>
# **getDataSourceItems**
> GetDataSourceItemsDefaultResponse getDataSourceItems(getDataSourceItemsRequest)

Allows you to search for data source objects, inclusing datasource, database, table and columns.

Allows you to search for data source objects, inclusing datasource, database, table and columns.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDataSourceItemsRequest getDataSourceItemsRequest = new GetDataSourceItemsRequest(); // GetDataSourceItemsRequest | Allows you to search for data source objects, inclusing datasource, database, table and columns.
    try {
      GetDataSourceItemsDefaultResponse result = apiInstance.getDataSourceItems(getDataSourceItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSourceItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDataSourceItemsRequest** | [**GetDataSourceItemsRequest**](GetDataSourceItemsRequest.md)| Allows you to search for data source objects, inclusing datasource, database, table and columns. | |

### Return type

[**GetDataSourceItemsDefaultResponse**](GetDataSourceItemsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSourceMappings"></a>
# **getDataSourceMappings**
> GetDataSourceMappingsDefaultResponse getDataSourceMappings(getDataSourceMappingsRequest)

Return back the @see(DatasourceUserMapping)s in the system

Return back the @see(DatasourceUserMapping)s in the system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDataSourceMappingsRequest getDataSourceMappingsRequest = new GetDataSourceMappingsRequest(); // GetDataSourceMappingsRequest | Return back the @see(DatasourceUserMapping)s in the system
    try {
      GetDataSourceMappingsDefaultResponse result = apiInstance.getDataSourceMappings(getDataSourceMappingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSourceMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDataSourceMappingsRequest** | [**GetDataSourceMappingsRequest**](GetDataSourceMappingsRequest.md)| Return back the @see(DatasourceUserMapping)s in the system | |

### Return type

[**GetDataSourceMappingsDefaultResponse**](GetDataSourceMappingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSourceTypes"></a>
# **getDataSourceTypes**
> GetDataSourceTypesDefaultResponse getDataSourceTypes(getClientSetsRequest)

Return back a list of @see(ALDataSourceType) for use with @see(ALDataSource)s.

Return back a list of @see(ALDataSourceType) for use with @see(ALDataSource)s.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Return back a list of @see(ALDataSourceType) for use with @see(ALDataSource)s.
    try {
      GetDataSourceTypesDefaultResponse result = apiInstance.getDataSourceTypes(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSourceTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Return back a list of @see(ALDataSourceType) for use with @see(ALDataSource)s. | |

### Return type

[**GetDataSourceTypesDefaultResponse**](GetDataSourceTypesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSourceUsers"></a>
# **getDataSourceUsers**
> GetDataSourceUsersDefaultResponse getDataSourceUsers(getDataSourceUsersRequest)

Requests a list of users from a particular @see(ALDataSource).  This call currently only functions against an Engine @see(ALDataSource).

Requests a list of users from a particular @see(ALDataSource).  This call currently only functions against an Engine @see(ALDataSource).

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDataSourceUsersRequest getDataSourceUsersRequest = new GetDataSourceUsersRequest(); // GetDataSourceUsersRequest | Requests a list of users from a particular @see(ALDataSource).  This call currently only functions against an Engine @see(ALDataSource).
    try {
      GetDataSourceUsersDefaultResponse result = apiInstance.getDataSourceUsers(getDataSourceUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSourceUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDataSourceUsersRequest** | [**GetDataSourceUsersRequest**](GetDataSourceUsersRequest.md)| Requests a list of users from a particular @see(ALDataSource).  This call currently only functions against an Engine @see(ALDataSource). | |

### Return type

[**GetDataSourceUsersDefaultResponse**](GetDataSourceUsersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDataSources"></a>
# **getDataSources**
> GetDataSourcesDefaultResponse getDataSources(getDataSourcesRequest)

Returns back a list of @see(ALDataSource)s from the system

Returns back a list of @see(ALDataSource)s from the system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDataSourcesRequest getDataSourcesRequest = new GetDataSourcesRequest(); // GetDataSourcesRequest | Returns back a list of @see(ALDataSource)s from the system
    try {
      GetDataSourcesDefaultResponse result = apiInstance.getDataSources(getDataSourcesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDataSources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDataSourcesRequest** | [**GetDataSourcesRequest**](GetDataSourcesRequest.md)| Returns back a list of @see(ALDataSource)s from the system | |

### Return type

[**GetDataSourcesDefaultResponse**](GetDataSourcesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDatasource"></a>
# **getDatasource**
> GetDatasourceDefaultResponse getDatasource(getDatasourceRequest)

Retrieves the top level data for a datasource.  Does not fully populate the datasource.  This is useful for getting things like the project, server and last refresh date.

Retrieves the top level data for a datasource.  Does not fully populate the datasource.  This is useful for getting things like the project, server and last refresh date.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDatasourceRequest getDatasourceRequest = new GetDatasourceRequest(); // GetDatasourceRequest | Retrieves the top level data for a datasource.  Does not fully populate the datasource.  This is useful for getting things like the project, server and last refresh date.
    try {
      GetDatasourceDefaultResponse result = apiInstance.getDatasource(getDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDatasourceRequest** | [**GetDatasourceRequest**](GetDatasourceRequest.md)| Retrieves the top level data for a datasource.  Does not fully populate the datasource.  This is useful for getting things like the project, server and last refresh date. | |

### Return type

[**GetDatasourceDefaultResponse**](GetDatasourceDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDatasourceColumn"></a>
# **getDatasourceColumn**
> GetDatasourceColumnDefaultResponse getDatasourceColumn(getDatasourceColumnRequest)

Fetch the details of one column from the system.

Fetch the details of one column from the system.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDatasourceColumnRequest getDatasourceColumnRequest = new GetDatasourceColumnRequest(); // GetDatasourceColumnRequest | Fetch the details of one column from the system.
    try {
      GetDatasourceColumnDefaultResponse result = apiInstance.getDatasourceColumn(getDatasourceColumnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDatasourceColumn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDatasourceColumnRequest** | [**GetDatasourceColumnRequest**](GetDatasourceColumnRequest.md)| Fetch the details of one column from the system. | |

### Return type

[**GetDatasourceColumnDefaultResponse**](GetDatasourceColumnDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDatasourceColumns"></a>
# **getDatasourceColumns**
> GetDatasourceColumnsDefaultResponse getDatasourceColumns(getDatasourceColumnsRequest)

Fetch a list of columns from the system.

Fetch a list of columns from the system.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDatasourceColumnsRequest getDatasourceColumnsRequest = new GetDatasourceColumnsRequest(); // GetDatasourceColumnsRequest | Fetch a list of columns from the system.
    try {
      GetDatasourceColumnsDefaultResponse result = apiInstance.getDatasourceColumns(getDatasourceColumnsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDatasourceColumns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDatasourceColumnsRequest** | [**GetDatasourceColumnsRequest**](GetDatasourceColumnsRequest.md)| Fetch a list of columns from the system. | |

### Return type

[**GetDatasourceColumnsDefaultResponse**](GetDatasourceColumnsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDatasourceDatabases"></a>
# **getDatasourceDatabases**
> GetDatasourceDatabasesDefaultResponse getDatasourceDatabases(getDatasourceDatabasesRequest)

Fetch a list of databases from the system.

Fetch a list of databases from the system.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDatasourceDatabasesRequest getDatasourceDatabasesRequest = new GetDatasourceDatabasesRequest(); // GetDatasourceDatabasesRequest | Fetch a list of databases from the system.
    try {
      GetDatasourceDatabasesDefaultResponse result = apiInstance.getDatasourceDatabases(getDatasourceDatabasesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDatasourceDatabases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDatasourceDatabasesRequest** | [**GetDatasourceDatabasesRequest**](GetDatasourceDatabasesRequest.md)| Fetch a list of databases from the system. | |

### Return type

[**GetDatasourceDatabasesDefaultResponse**](GetDatasourceDatabasesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDatasourceFieldTypes"></a>
# **getDatasourceFieldTypes**
> GetDatasourceFieldTypesDefaultResponse getDatasourceFieldTypes(getClientSetsRequest)

Fetch a list of the available types of field that are supported

Fetch a list of the available types of field that are supported

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Fetch a list of the available types of field that are supported
    try {
      GetDatasourceFieldTypesDefaultResponse result = apiInstance.getDatasourceFieldTypes(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDatasourceFieldTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Fetch a list of the available types of field that are supported | |

### Return type

[**GetDatasourceFieldTypesDefaultResponse**](GetDatasourceFieldTypesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDatasourceTables"></a>
# **getDatasourceTables**
> GetDatasourceTablesDefaultResponse getDatasourceTables(getDatasourceTablesRequest)

Fetch a list of tables from the system.

Fetch a list of tables from the system.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDatasourceTablesRequest getDatasourceTablesRequest = new GetDatasourceTablesRequest(); // GetDatasourceTablesRequest | Fetch a list of tables from the system.
    try {
      GetDatasourceTablesDefaultResponse result = apiInstance.getDatasourceTables(getDatasourceTablesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDatasourceTables");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDatasourceTablesRequest** | [**GetDatasourceTablesRequest**](GetDatasourceTablesRequest.md)| Fetch a list of tables from the system. | |

### Return type

[**GetDatasourceTablesDefaultResponse**](GetDatasourceTablesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getDecodeList"></a>
# **getDecodeList**
> GetDecodeListDefaultResponse getDecodeList(getDecodeListRequest)

Get a specified decode list

Get a specified decode list

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetDecodeListRequest getDecodeListRequest = new GetDecodeListRequest(); // GetDecodeListRequest | Get a specified decode list
    try {
      GetDecodeListDefaultResponse result = apiInstance.getDecodeList(getDecodeListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getDecodeList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getDecodeListRequest** | [**GetDecodeListRequest**](GetDecodeListRequest.md)| Get a specified decode list | |

### Return type

[**GetDecodeListDefaultResponse**](GetDecodeListDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getFieldTransformList"></a>
# **getFieldTransformList**
> GetFieldTransformListDefaultResponse getFieldTransformList(getFieldTransformListRequest)

Get a list of field transforms for use in transforming discrete values

Get a list of field transforms for use in transforming discrete values

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetFieldTransformListRequest getFieldTransformListRequest = new GetFieldTransformListRequest(); // GetFieldTransformListRequest | Get a list of field transforms for use in transforming discrete values
    try {
      GetFieldTransformListDefaultResponse result = apiInstance.getFieldTransformList(getFieldTransformListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getFieldTransformList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getFieldTransformListRequest** | [**GetFieldTransformListRequest**](GetFieldTransformListRequest.md)| Get a list of field transforms for use in transforming discrete values | |

### Return type

[**GetFieldTransformListDefaultResponse**](GetFieldTransformListDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getFieldTransformLists"></a>
# **getFieldTransformLists**
> GetFieldTransformListsDefaultResponse getFieldTransformLists(getClientSetsRequest)

Get the basic details for all available transform lists (Name, Id, (Max) Version- but not Metadata or JSON transforms)

Get the basic details for all available transform lists (Name, Id, (Max) Version- but not Metadata or JSON transforms)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Get the basic details for all available transform lists (Name, Id, (Max) Version- but not Metadata or JSON transforms)
    try {
      GetFieldTransformListsDefaultResponse result = apiInstance.getFieldTransformLists(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getFieldTransformLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Get the basic details for all available transform lists (Name, Id, (Max) Version- but not Metadata or JSON transforms) | |

### Return type

[**GetFieldTransformListsDefaultResponse**](GetFieldTransformListsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getProcessStatus"></a>
# **getProcessStatus**
> GetProcessStatusDefaultResponse getProcessStatus(getProcessStatusRequest)

Gets the status of a process which was queued.  Note that once the process is finished, you may only get the status once and each call thereafter will return NotFound.

Gets the status of a process which was queued.  Note that once the process is finished, you may only get the status once and each call thereafter will return NotFound.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetProcessStatusRequest getProcessStatusRequest = new GetProcessStatusRequest(); // GetProcessStatusRequest | Gets the status of a process which was queued.  Note that once the process is finished, you may only get the status once and each call thereafter will return NotFound.
    try {
      GetProcessStatusDefaultResponse result = apiInstance.getProcessStatus(getProcessStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getProcessStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getProcessStatusRequest** | [**GetProcessStatusRequest**](GetProcessStatusRequest.md)| Gets the status of a process which was queued.  Note that once the process is finished, you may only get the status once and each call thereafter will return NotFound. | |

### Return type

[**GetProcessStatusDefaultResponse**](GetProcessStatusDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getTransforms"></a>
# **getTransforms**
> GetFieldTransformListsDefaultResponse getTransforms(getTransformsRequest)

Get the basic details for all available transforms (Name, Id, (Max) Version, Type) and which versions have actually been published

Get the basic details for all available transforms (Name, Id, (Max) Version, Type) and which versions have actually been published

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    GetTransformsRequest getTransformsRequest = new GetTransformsRequest(); // GetTransformsRequest | Get the basic details for all available transforms (Name, Id, (Max) Version, Type) and which versions have actually been published
    try {
      GetFieldTransformListsDefaultResponse result = apiInstance.getTransforms(getTransformsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#getTransforms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getTransformsRequest** | [**GetTransformsRequest**](GetTransformsRequest.md)| Get the basic details for all available transforms (Name, Id, (Max) Version, Type) and which versions have actually been published | |

### Return type

[**GetFieldTransformListsDefaultResponse**](GetFieldTransformListsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="markDatasourceAsPendingDisable"></a>
# **markDatasourceAsPendingDisable**
> AUTHChangePasswordDefaultResponse markDatasourceAsPendingDisable(markDatasourceAsPendingDisableRequest)

Mark a data source as pending disable. This will cause any active SEV threads to exit upon their next iteration, which can take a while.              Clients should then call @see(AreDatasourceJobsComplete) to check that the datasource is idle before continuing to perform the actual disable, and can call @see(DisableDatasource)

Mark a data source as pending disable. This will cause any active SEV threads to exit upon their next iteration, which can take a while.              Clients should then call @see(AreDatasourceJobsComplete) to check that the datasource is idle before continuing to perform the actual disable, and can call @see(DisableDatasource)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    MarkDatasourceAsPendingDisableRequest markDatasourceAsPendingDisableRequest = new MarkDatasourceAsPendingDisableRequest(); // MarkDatasourceAsPendingDisableRequest | Mark a data source as pending disable. This will cause any active SEV threads to exit upon their next iteration, which can take a while.              Clients should then call @see(AreDatasourceJobsComplete) to check that the datasource is idle before continuing to perform the actual disable, and can call @see(DisableDatasource)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.markDatasourceAsPendingDisable(markDatasourceAsPendingDisableRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#markDatasourceAsPendingDisable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **markDatasourceAsPendingDisableRequest** | [**MarkDatasourceAsPendingDisableRequest**](MarkDatasourceAsPendingDisableRequest.md)| Mark a data source as pending disable. This will cause any active SEV threads to exit upon their next iteration, which can take a while.              Clients should then call @see(AreDatasourceJobsComplete) to check that the datasource is idle before continuing to perform the actual disable, and can call @see(DisableDatasource) | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="pauseDatasourceCampaigns"></a>
# **pauseDatasourceCampaigns**
> CreateClientDefaultResponse pauseDatasourceCampaigns(pauseDatasourceCampaignsRequest)

Pause the campaigns in this datasource. This will request all the campaigns that use this datasource to be paused, which can take a while.              Clients should then call @see(AreDatasourceCampaignsPaused) to check that the datasource is idle before continuing, and can call @see(ResumeDatasourceCampaigns)

Pause the campaigns in this datasource. This will request all the campaigns that use this datasource to be paused, which can take a while.              Clients should then call @see(AreDatasourceCampaignsPaused) to check that the datasource is idle before continuing, and can call @see(ResumeDatasourceCampaigns)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    PauseDatasourceCampaignsRequest pauseDatasourceCampaignsRequest = new PauseDatasourceCampaignsRequest(); // PauseDatasourceCampaignsRequest | Pause the campaigns in this datasource. This will request all the campaigns that use this datasource to be paused, which can take a while.              Clients should then call @see(AreDatasourceCampaignsPaused) to check that the datasource is idle before continuing, and can call @see(ResumeDatasourceCampaigns)
    try {
      CreateClientDefaultResponse result = apiInstance.pauseDatasourceCampaigns(pauseDatasourceCampaignsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#pauseDatasourceCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pauseDatasourceCampaignsRequest** | [**PauseDatasourceCampaignsRequest**](PauseDatasourceCampaignsRequest.md)| Pause the campaigns in this datasource. This will request all the campaigns that use this datasource to be paused, which can take a while.              Clients should then call @see(AreDatasourceCampaignsPaused) to check that the datasource is idle before continuing, and can call @see(ResumeDatasourceCampaigns) | |

### Return type

[**CreateClientDefaultResponse**](CreateClientDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="refreshDatasource"></a>
# **refreshDatasource**
> CreateClientDefaultResponse refreshDatasource(refreshDatasourceRequest)

Requests an immediate refresh of an engine datasource.  Call @see(GetProcessStatus) to determine when the refresh has finished or check the LastRefresh date on the datasource.

Requests an immediate refresh of an engine datasource.  Call @see(GetProcessStatus) to determine when the refresh has finished or check the LastRefresh date on the datasource.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    RefreshDatasourceRequest refreshDatasourceRequest = new RefreshDatasourceRequest(); // RefreshDatasourceRequest | Requests an immediate refresh of an engine datasource.  Call @see(GetProcessStatus) to determine when the refresh has finished or check the LastRefresh date on the datasource.
    try {
      CreateClientDefaultResponse result = apiInstance.refreshDatasource(refreshDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#refreshDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **refreshDatasourceRequest** | [**RefreshDatasourceRequest**](RefreshDatasourceRequest.md)| Requests an immediate refresh of an engine datasource.  Call @see(GetProcessStatus) to determine when the refresh has finished or check the LastRefresh date on the datasource. | |

### Return type

[**CreateClientDefaultResponse**](CreateClientDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="resumeDatasourceCampaigns"></a>
# **resumeDatasourceCampaigns**
> AUTHChangePasswordDefaultResponse resumeDatasourceCampaigns(resumeDatasourceCampaignsRequest)

Resume the campaigns in this datasource. This is the opposite of @see(PauseDatasourceCampaigns), and only campaigns that were paused by that method will be resumed. Campaigns that             were paused manually will not be resumed.

Resume the campaigns in this datasource. This is the opposite of @see(PauseDatasourceCampaigns), and only campaigns that were paused by that method will be resumed. Campaigns that             were paused manually will not be resumed.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    ResumeDatasourceCampaignsRequest resumeDatasourceCampaignsRequest = new ResumeDatasourceCampaignsRequest(); // ResumeDatasourceCampaignsRequest | Resume the campaigns in this datasource. This is the opposite of @see(PauseDatasourceCampaigns), and only campaigns that were paused by that method will be resumed. Campaigns that             were paused manually will not be resumed.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.resumeDatasourceCampaigns(resumeDatasourceCampaignsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#resumeDatasourceCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resumeDatasourceCampaignsRequest** | [**ResumeDatasourceCampaignsRequest**](ResumeDatasourceCampaignsRequest.md)| Resume the campaigns in this datasource. This is the opposite of @see(PauseDatasourceCampaigns), and only campaigns that were paused by that method will be resumed. Campaigns that             were paused manually will not be resumed. | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="saveDecodeList"></a>
# **saveDecodeList**
> GetDecodeListDefaultResponse saveDecodeList(saveDecodeListRequest)

Save a list of decodes

Save a list of decodes

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    SaveDecodeListRequest saveDecodeListRequest = new SaveDecodeListRequest(); // SaveDecodeListRequest | Save a list of decodes
    try {
      GetDecodeListDefaultResponse result = apiInstance.saveDecodeList(saveDecodeListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#saveDecodeList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **saveDecodeListRequest** | [**SaveDecodeListRequest**](SaveDecodeListRequest.md)| Save a list of decodes | |

### Return type

[**GetDecodeListDefaultResponse**](GetDecodeListDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="saveFieldTransformList"></a>
# **saveFieldTransformList**
> GetFieldTransformListDefaultResponse saveFieldTransformList(saveFieldTransformListRequest)

Save a list of field transforms for use in transforming discrete values

Save a list of field transforms for use in transforming discrete values

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    SaveFieldTransformListRequest saveFieldTransformListRequest = new SaveFieldTransformListRequest(); // SaveFieldTransformListRequest | Save a list of field transforms for use in transforming discrete values
    try {
      GetFieldTransformListDefaultResponse result = apiInstance.saveFieldTransformList(saveFieldTransformListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#saveFieldTransformList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **saveFieldTransformListRequest** | [**SaveFieldTransformListRequest**](SaveFieldTransformListRequest.md)| Save a list of field transforms for use in transforming discrete values | |

### Return type

[**GetFieldTransformListDefaultResponse**](GetFieldTransformListDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateDataSourceMapping"></a>
# **updateDataSourceMapping**
> AUTHChangePasswordDefaultResponse updateDataSourceMapping(createDataSourceMappingRequest)

Updates a @see(DatasourceUserMapping) to map it to another engine user name.

Updates a @see(DatasourceUserMapping) to map it to another engine user name.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    CreateDataSourceMappingRequest createDataSourceMappingRequest = new CreateDataSourceMappingRequest(); // CreateDataSourceMappingRequest | Updates a @see(DatasourceUserMapping) to map it to another engine user name.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateDataSourceMapping(createDataSourceMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#updateDataSourceMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataSourceMappingRequest** | [**CreateDataSourceMappingRequest**](CreateDataSourceMappingRequest.md)| Updates a @see(DatasourceUserMapping) to map it to another engine user name. | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateDatasource"></a>
# **updateDatasource**
> AUTHChangePasswordDefaultResponse updateDatasource(updateDatasourceRequest)

Updates an @see(ALDataSource) with the data which is provided.  Please note that the only properties which are relevant are IsEnabled, IsVisible, Name, LastRefresh and attributes.

Updates an @see(ALDataSource) with the data which is provided.  Please note that the only properties which are relevant are IsEnabled, IsVisible, Name, LastRefresh and attributes.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.DatasourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    DatasourcesApi apiInstance = new DatasourcesApi(defaultClient);
    UpdateDatasourceRequest updateDatasourceRequest = new UpdateDatasourceRequest(); // UpdateDatasourceRequest | Updates an @see(ALDataSource) with the data which is provided.  Please note that the only properties which are relevant are IsEnabled, IsVisible, Name, LastRefresh and attributes.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateDatasource(updateDatasourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasourcesApi#updateDatasource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateDatasourceRequest** | [**UpdateDatasourceRequest**](UpdateDatasourceRequest.md)| Updates an @see(ALDataSource) with the data which is provided.  Please note that the only properties which are relevant are IsEnabled, IsVisible, Name, LastRefresh and attributes. | |

### Return type

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

