# UsersApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyUser**](UsersApi.md#copyUser) | **POST** /CopyUser | Copy a user |
| [**createUser**](UsersApi.md#createUser) | **POST** /CreateUser | Add a new user to the specified @see(ALClient) |
| [**deleteUser**](UsersApi.md#deleteUser) | **POST** /DeleteUser | Delete a user |
| [**deleteUserReassignAssets**](UsersApi.md#deleteUserReassignAssets) | **POST** /DeleteUserReassignAssets | Deletes a user and reassigns their documents, files and folders to another user |
| [**getCultures**](UsersApi.md#getCultures) | **POST** /GetCultures | Get a list of cultures [for use with the @see(ALUser) ] |
| [**getCurrentUser**](UsersApi.md#getCurrentUser) | **POST** /GetCurrentUser | Return back the current user [based upon their token] |
| [**getTimeZones**](UsersApi.md#getTimeZones) | **POST** /GetTimeZones | Get a list of the timezones [for use with the @see(ALUser) ] |
| [**getUser**](UsersApi.md#getUser) | **POST** /GetUser | Given a UserID, get the rest of the details for that user. |
| [**getUsers**](UsersApi.md#getUsers) | **POST** /GetUsers | List the users within the current @see(ALClient), optionally filtering the set returned. |
| [**getUsersForClient**](UsersApi.md#getUsersForClient) | **POST** /GetUsersForClient | List the users within the specified client, optionally filtering the set returned. |
| [**updateUser**](UsersApi.md#updateUser) | **POST** /UpdateUser | Given an existing @see(ALUser) object save it to the database             Note that the object will normally have been retrieved by @see(GetUser), and that only fields which are set will be updated in the database |


<a id="copyUser"></a>
# **copyUser**
> CreateClientDefaultResponse copyUser(copyUserRequest)

Copy a user

Copy a user

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CopyUserRequest copyUserRequest = new CopyUserRequest(); // CopyUserRequest | Copy a user
    try {
      CreateClientDefaultResponse result = apiInstance.copyUser(copyUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#copyUser");
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
| **copyUserRequest** | [**CopyUserRequest**](CopyUserRequest.md)| Copy a user | |

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

<a id="createUser"></a>
# **createUser**
> CreateClientDefaultResponse createUser(createUserRequest)

Add a new user to the specified @see(ALClient)

Add a new user to the specified @see(ALClient)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | Add a new user to the specified @see(ALClient)
    try {
      CreateClientDefaultResponse result = apiInstance.createUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| Add a new user to the specified @see(ALClient) | |

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

<a id="deleteUser"></a>
# **deleteUser**
> AUTHChangePasswordDefaultResponse deleteUser(deleteUserRequest)

Delete a user

Delete a user

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    DeleteUserRequest deleteUserRequest = new DeleteUserRequest(); // DeleteUserRequest | Delete a user
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteUser(deleteUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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
| **deleteUserRequest** | [**DeleteUserRequest**](DeleteUserRequest.md)| Delete a user | |

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

<a id="deleteUserReassignAssets"></a>
# **deleteUserReassignAssets**
> AUTHChangePasswordDefaultResponse deleteUserReassignAssets(deleteUserReassignAssetsRequest)

Deletes a user and reassigns their documents, files and folders to another user

Deletes a user and reassigns their documents, files and folders to another user

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    DeleteUserReassignAssetsRequest deleteUserReassignAssetsRequest = new DeleteUserReassignAssetsRequest(); // DeleteUserReassignAssetsRequest | Deletes a user and reassigns their documents, files and folders to another user
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteUserReassignAssets(deleteUserReassignAssetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUserReassignAssets");
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
| **deleteUserReassignAssetsRequest** | [**DeleteUserReassignAssetsRequest**](DeleteUserReassignAssetsRequest.md)| Deletes a user and reassigns their documents, files and folders to another user | |

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

<a id="getCultures"></a>
# **getCultures**
> GetCulturesDefaultResponse getCultures(getClientSetsRequest)

Get a list of cultures [for use with the @see(ALUser) ]

Get a list of cultures [for use with the @see(ALUser) ]

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Get a list of cultures [for use with the @see(ALUser) ]
    try {
      GetCulturesDefaultResponse result = apiInstance.getCultures(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCultures");
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
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Get a list of cultures [for use with the @see(ALUser) ] | |

### Return type

[**GetCulturesDefaultResponse**](GetCulturesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getCurrentUser"></a>
# **getCurrentUser**
> GetCurrentUserDefaultResponse getCurrentUser(getCurrentUserRequest)

Return back the current user [based upon their token]

Return back the current user [based upon their token]

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    GetCurrentUserRequest getCurrentUserRequest = new GetCurrentUserRequest(); // GetCurrentUserRequest | Return back the current user [based upon their token]
    try {
      GetCurrentUserDefaultResponse result = apiInstance.getCurrentUser(getCurrentUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUser");
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
| **getCurrentUserRequest** | [**GetCurrentUserRequest**](GetCurrentUserRequest.md)| Return back the current user [based upon their token] | |

### Return type

[**GetCurrentUserDefaultResponse**](GetCurrentUserDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getTimeZones"></a>
# **getTimeZones**
> GetTimeZonesDefaultResponse getTimeZones(getClientSetsRequest)

Get a list of the timezones [for use with the @see(ALUser) ]

Get a list of the timezones [for use with the @see(ALUser) ]

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Get a list of the timezones [for use with the @see(ALUser) ]
    try {
      GetTimeZonesDefaultResponse result = apiInstance.getTimeZones(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getTimeZones");
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
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Get a list of the timezones [for use with the @see(ALUser) ] | |

### Return type

[**GetTimeZonesDefaultResponse**](GetTimeZonesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getUser"></a>
# **getUser**
> GetCurrentUserDefaultResponse getUser(getUserRequest)

Given a UserID, get the rest of the details for that user.

Given a UserID, get the rest of the details for that user.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    GetUserRequest getUserRequest = new GetUserRequest(); // GetUserRequest | Given a UserID, get the rest of the details for that user.
    try {
      GetCurrentUserDefaultResponse result = apiInstance.getUser(getUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
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
| **getUserRequest** | [**GetUserRequest**](GetUserRequest.md)| Given a UserID, get the rest of the details for that user. | |

### Return type

[**GetCurrentUserDefaultResponse**](GetCurrentUserDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getUsers"></a>
# **getUsers**
> GetUsersDefaultResponse getUsers(getUsersRequest)

List the users within the current @see(ALClient), optionally filtering the set returned.

List the users within the current @see(ALClient), optionally filtering the set returned.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    GetUsersRequest getUsersRequest = new GetUsersRequest(); // GetUsersRequest | List the users within the current @see(ALClient), optionally filtering the set returned.
    try {
      GetUsersDefaultResponse result = apiInstance.getUsers(getUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsers");
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
| **getUsersRequest** | [**GetUsersRequest**](GetUsersRequest.md)| List the users within the current @see(ALClient), optionally filtering the set returned. | |

### Return type

[**GetUsersDefaultResponse**](GetUsersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getUsersForClient"></a>
# **getUsersForClient**
> GetUsersDefaultResponse getUsersForClient(getUsersForClientRequest)

List the users within the specified client, optionally filtering the set returned.

List the users within the specified client, optionally filtering the set returned.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    GetUsersForClientRequest getUsersForClientRequest = new GetUsersForClientRequest(); // GetUsersForClientRequest | List the users within the specified client, optionally filtering the set returned.
    try {
      GetUsersDefaultResponse result = apiInstance.getUsersForClient(getUsersForClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsersForClient");
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
| **getUsersForClientRequest** | [**GetUsersForClientRequest**](GetUsersForClientRequest.md)| List the users within the specified client, optionally filtering the set returned. | |

### Return type

[**GetUsersDefaultResponse**](GetUsersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateUser"></a>
# **updateUser**
> AUTHChangePasswordDefaultResponse updateUser(createUserRequest)

Given an existing @see(ALUser) object save it to the database             Note that the object will normally have been retrieved by @see(GetUser), and that only fields which are set will be updated in the database

Given an existing @see(ALUser) object save it to the database             Note that the object will normally have been retrieved by @see(GetUser), and that only fields which are set will be updated in the database

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | Given an existing @see(ALUser) object save it to the database             Note that the object will normally have been retrieved by @see(GetUser), and that only fields which are set will be updated in the database
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| Given an existing @see(ALUser) object save it to the database             Note that the object will normally have been retrieved by @see(GetUser), and that only fields which are set will be updated in the database | |

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

