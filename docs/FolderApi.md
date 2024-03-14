# FolderApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFolder**](FolderApi.md#createFolder) | **POST** /CreateFolder | Create a @see(Folder) |
| [**deleteFolder**](FolderApi.md#deleteFolder) | **POST** /DeleteFolder | Delete a @see(Folder) |
| [**getFolder**](FolderApi.md#getFolder) | **POST** /GetFolder | Get a particular @see(Folder) by it&#39;s ID |
| [**getFolders**](FolderApi.md#getFolders) | **POST** /GetFolders | Obtain a list of @see(Folder)s |
| [**moveFolder**](FolderApi.md#moveFolder) | **POST** /MoveFolder | Move a @see(Folder) from one @see(Folder) to another |
| [**renameFolder**](FolderApi.md#renameFolder) | **POST** /RenameFolder | Rename a @see(Folder) |


<a id="createFolder"></a>
# **createFolder**
> CreateClientDefaultResponse createFolder(createFolderRequest)

Create a @see(Folder)

Create a @see(Folder)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.FolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    FolderApi apiInstance = new FolderApi(defaultClient);
    CreateFolderRequest createFolderRequest = new CreateFolderRequest(); // CreateFolderRequest | Create a @see(Folder)
    try {
      CreateClientDefaultResponse result = apiInstance.createFolder(createFolderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderApi#createFolder");
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
| **createFolderRequest** | [**CreateFolderRequest**](CreateFolderRequest.md)| Create a @see(Folder) | |

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

<a id="deleteFolder"></a>
# **deleteFolder**
> AUTHChangePasswordDefaultResponse deleteFolder(deleteFolderRequest)

Delete a @see(Folder)

Delete a @see(Folder)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.FolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    FolderApi apiInstance = new FolderApi(defaultClient);
    DeleteFolderRequest deleteFolderRequest = new DeleteFolderRequest(); // DeleteFolderRequest | Delete a @see(Folder)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteFolder(deleteFolderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderApi#deleteFolder");
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
| **deleteFolderRequest** | [**DeleteFolderRequest**](DeleteFolderRequest.md)| Delete a @see(Folder) | |

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

<a id="getFolder"></a>
# **getFolder**
> GetFolderDefaultResponse getFolder(getFolderRequest)

Get a particular @see(Folder) by it&#39;s ID

Get a particular @see(Folder) by it&#39;s ID

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.FolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    FolderApi apiInstance = new FolderApi(defaultClient);
    GetFolderRequest getFolderRequest = new GetFolderRequest(); // GetFolderRequest | Get a particular @see(Folder) by it's ID
    try {
      GetFolderDefaultResponse result = apiInstance.getFolder(getFolderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderApi#getFolder");
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
| **getFolderRequest** | [**GetFolderRequest**](GetFolderRequest.md)| Get a particular @see(Folder) by it&#39;s ID | |

### Return type

[**GetFolderDefaultResponse**](GetFolderDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getFolders"></a>
# **getFolders**
> GetFoldersDefaultResponse getFolders(getFoldersRequest)

Obtain a list of @see(Folder)s

Obtain a list of @see(Folder)s

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.FolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    FolderApi apiInstance = new FolderApi(defaultClient);
    GetFoldersRequest getFoldersRequest = new GetFoldersRequest(); // GetFoldersRequest | Obtain a list of @see(Folder)s
    try {
      GetFoldersDefaultResponse result = apiInstance.getFolders(getFoldersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderApi#getFolders");
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
| **getFoldersRequest** | [**GetFoldersRequest**](GetFoldersRequest.md)| Obtain a list of @see(Folder)s | |

### Return type

[**GetFoldersDefaultResponse**](GetFoldersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="moveFolder"></a>
# **moveFolder**
> AUTHChangePasswordDefaultResponse moveFolder(moveFolderRequest)

Move a @see(Folder) from one @see(Folder) to another

Move a @see(Folder) from one @see(Folder) to another

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.FolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    FolderApi apiInstance = new FolderApi(defaultClient);
    MoveFolderRequest moveFolderRequest = new MoveFolderRequest(); // MoveFolderRequest | Move a @see(Folder) from one @see(Folder) to another
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.moveFolder(moveFolderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderApi#moveFolder");
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
| **moveFolderRequest** | [**MoveFolderRequest**](MoveFolderRequest.md)| Move a @see(Folder) from one @see(Folder) to another | |

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

<a id="renameFolder"></a>
# **renameFolder**
> AUTHChangePasswordDefaultResponse renameFolder(renameFolderRequest)

Rename a @see(Folder)

Rename a @see(Folder)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.FolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    FolderApi apiInstance = new FolderApi(defaultClient);
    RenameFolderRequest renameFolderRequest = new RenameFolderRequest(); // RenameFolderRequest | Rename a @see(Folder)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.renameFolder(renameFolderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderApi#renameFolder");
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
| **renameFolderRequest** | [**RenameFolderRequest**](RenameFolderRequest.md)| Rename a @see(Folder) | |

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

