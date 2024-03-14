# PermissionsApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearPermissions**](PermissionsApi.md#clearPermissions) | **POST** /ClearPermissions | Clear the permissions for the specific security ID |
| [**getAvailablePermissions**](PermissionsApi.md#getAvailablePermissions) | **POST** /GetAvailablePermissions | Gets a list of the permissions; this is a simple list and does not include permission values, etc. |
| [**getGroupsWithPermission**](PermissionsApi.md#getGroupsWithPermission) | **POST** /GetGroupsWithPermission | List the groups which have been granted the specified permission |
| [**getPermissions**](PermissionsApi.md#getPermissions) | **POST** /GetPermissions | Given a particular item, fetch a list of permissions on that item for a given user or group. |
| [**getPermittedUsersAndGroups**](PermissionsApi.md#getPermittedUsersAndGroups) | **POST** /GetPermittedUsersAndGroups | List the users and groups which have direct or indirect access to the specified item |
| [**getResources**](PermissionsApi.md#getResources) | **POST** /GetResources | Gets a list of the resource types for permissions |
| [**getUsersWithPermission**](PermissionsApi.md#getUsersWithPermission) | **POST** /GetUsersWithPermission | List the users which have been granted the specified permission |
| [**setPermissions**](PermissionsApi.md#setPermissions) | **POST** /SetPermissions | Set permissions for a particular item and securityID |
| [**takeOwnershipPermission**](PermissionsApi.md#takeOwnershipPermission) | **POST** /TakeOwnershipPermission | Change the owner of a particular item from the current owner to somebody else |


<a id="clearPermissions"></a>
# **clearPermissions**
> AUTHChangePasswordDefaultResponse clearPermissions(clearPermissionsRequest)

Clear the permissions for the specific security ID

Clear the permissions for the specific security ID

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    ClearPermissionsRequest clearPermissionsRequest = new ClearPermissionsRequest(); // ClearPermissionsRequest | Clear the permissions for the specific security ID
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.clearPermissions(clearPermissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#clearPermissions");
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
| **clearPermissionsRequest** | [**ClearPermissionsRequest**](ClearPermissionsRequest.md)| Clear the permissions for the specific security ID | |

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

<a id="getAvailablePermissions"></a>
# **getAvailablePermissions**
> GetAvailablePermissionsDefaultResponse getAvailablePermissions()

Gets a list of the permissions; this is a simple list and does not include permission values, etc.

Gets a list of the permissions; this is a simple list and does not include permission values, etc.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    try {
      GetAvailablePermissionsDefaultResponse result = apiInstance.getAvailablePermissions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getAvailablePermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAvailablePermissionsDefaultResponse**](GetAvailablePermissionsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getGroupsWithPermission"></a>
# **getGroupsWithPermission**
> GetGroupsWithPermissionDefaultResponse getGroupsWithPermission(getGroupsWithPermissionRequest)

List the groups which have been granted the specified permission

List the groups which have been granted the specified permission

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    GetGroupsWithPermissionRequest getGroupsWithPermissionRequest = new GetGroupsWithPermissionRequest(); // GetGroupsWithPermissionRequest | List the groups which have been granted the specified permission
    try {
      GetGroupsWithPermissionDefaultResponse result = apiInstance.getGroupsWithPermission(getGroupsWithPermissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getGroupsWithPermission");
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
| **getGroupsWithPermissionRequest** | [**GetGroupsWithPermissionRequest**](GetGroupsWithPermissionRequest.md)| List the groups which have been granted the specified permission | |

### Return type

[**GetGroupsWithPermissionDefaultResponse**](GetGroupsWithPermissionDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getPermissions"></a>
# **getPermissions**
> GetPermissionsDefaultResponse getPermissions(getPermissionsRequest)

Given a particular item, fetch a list of permissions on that item for a given user or group.

Given a particular item, fetch a list of permissions on that item for a given user or group.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    GetPermissionsRequest getPermissionsRequest = new GetPermissionsRequest(); // GetPermissionsRequest | Given a particular item, fetch a list of permissions on that item for a given user or group.
    try {
      GetPermissionsDefaultResponse result = apiInstance.getPermissions(getPermissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermissions");
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
| **getPermissionsRequest** | [**GetPermissionsRequest**](GetPermissionsRequest.md)| Given a particular item, fetch a list of permissions on that item for a given user or group. | |

### Return type

[**GetPermissionsDefaultResponse**](GetPermissionsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getPermittedUsersAndGroups"></a>
# **getPermittedUsersAndGroups**
> GetGroupsWithPermissionDefaultResponse getPermittedUsersAndGroups(getPermittedUsersAndGroupsRequest)

List the users and groups which have direct or indirect access to the specified item

List the users and groups which have direct or indirect access to the specified item

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    GetPermittedUsersAndGroupsRequest getPermittedUsersAndGroupsRequest = new GetPermittedUsersAndGroupsRequest(); // GetPermittedUsersAndGroupsRequest | List the users and groups which have direct or indirect access to the specified item
    try {
      GetGroupsWithPermissionDefaultResponse result = apiInstance.getPermittedUsersAndGroups(getPermittedUsersAndGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getPermittedUsersAndGroups");
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
| **getPermittedUsersAndGroupsRequest** | [**GetPermittedUsersAndGroupsRequest**](GetPermittedUsersAndGroupsRequest.md)| List the users and groups which have direct or indirect access to the specified item | |

### Return type

[**GetGroupsWithPermissionDefaultResponse**](GetGroupsWithPermissionDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getResources"></a>
# **getResources**
> GetResourcesDefaultResponse getResources()

Gets a list of the resource types for permissions

Gets a list of the resource types for permissions

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    try {
      GetResourcesDefaultResponse result = apiInstance.getResources();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetResourcesDefaultResponse**](GetResourcesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getUsersWithPermission"></a>
# **getUsersWithPermission**
> GetGroupsWithPermissionDefaultResponse getUsersWithPermission(getUsersWithPermissionRequest)

List the users which have been granted the specified permission

List the users which have been granted the specified permission

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    GetUsersWithPermissionRequest getUsersWithPermissionRequest = new GetUsersWithPermissionRequest(); // GetUsersWithPermissionRequest | List the users which have been granted the specified permission
    try {
      GetGroupsWithPermissionDefaultResponse result = apiInstance.getUsersWithPermission(getUsersWithPermissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#getUsersWithPermission");
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
| **getUsersWithPermissionRequest** | [**GetUsersWithPermissionRequest**](GetUsersWithPermissionRequest.md)| List the users which have been granted the specified permission | |

### Return type

[**GetGroupsWithPermissionDefaultResponse**](GetGroupsWithPermissionDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="setPermissions"></a>
# **setPermissions**
> AUTHChangePasswordDefaultResponse setPermissions(setPermissionsRequest)

Set permissions for a particular item and securityID

Set permissions for a particular item and securityID

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    SetPermissionsRequest setPermissionsRequest = new SetPermissionsRequest(); // SetPermissionsRequest | Set permissions for a particular item and securityID
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.setPermissions(setPermissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#setPermissions");
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
| **setPermissionsRequest** | [**SetPermissionsRequest**](SetPermissionsRequest.md)| Set permissions for a particular item and securityID | |

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

<a id="takeOwnershipPermission"></a>
# **takeOwnershipPermission**
> AUTHChangePasswordDefaultResponse takeOwnershipPermission(takeOwnershipPermissionRequest)

Change the owner of a particular item from the current owner to somebody else

Change the owner of a particular item from the current owner to somebody else

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PermissionsApi apiInstance = new PermissionsApi(defaultClient);
    TakeOwnershipPermissionRequest takeOwnershipPermissionRequest = new TakeOwnershipPermissionRequest(); // TakeOwnershipPermissionRequest | Change the owner of a particular item from the current owner to somebody else
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.takeOwnershipPermission(takeOwnershipPermissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionsApi#takeOwnershipPermission");
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
| **takeOwnershipPermissionRequest** | [**TakeOwnershipPermissionRequest**](TakeOwnershipPermissionRequest.md)| Change the owner of a particular item from the current owner to somebody else | |

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

