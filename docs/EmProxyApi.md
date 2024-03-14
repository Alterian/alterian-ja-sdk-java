# EmProxyApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eMAbortDeployment**](EmProxyApi.md#eMAbortDeployment) | **POST** /EM_AbortDeployment | Proxy call to EM UserManager.asmx to abort a deployment |
| [**eMAuthenticate**](EmProxyApi.md#eMAuthenticate) | **POST** /EM_Authenticate | Proxy call to EM Authenticate.asmx             public string AuthenticateEx(string Login, string Password, string NewPassword, bool BumpExisting, DateTime LocalTime, DMPasswordFormat PasswordFormat) |
| [**eMDeleteList**](EmProxyApi.md#eMDeleteList) | **POST** /EM_DeleteList | Deletes a list |
| [**eMGetClientGroupUsers**](EmProxyApi.md#eMGetClientGroupUsers) | **POST** /EM_GetClientGroupUsers | Proxy call to EM UserManager.asmx             public DMUserCollection GetClientGroupUsers(string Token, DMClient Client, int GroupID) |
| [**eMGetClientGroups**](EmProxyApi.md#eMGetClientGroups) | **POST** /EM_GetClientGroups | Proxy call to the EM UserManager.asmx              DMGroupCollection GetClientGroups(string Token, DMClient Client, out DMNestedGroupCollection Nested) |
| [**eMGetClientInfo**](EmProxyApi.md#eMGetClientInfo) | **POST** /EM_GetClientInfo | Proxy call to EM Authenticate.asmx             public void GetClientInfo(string Token, out int ID, out string Name, out string ContentURL, out string Icon) |
| [**eMGetClientSets**](EmProxyApi.md#eMGetClientSets) | **POST** /EM_GetClientSets | Proxy call to EM ClientManager.asmx             public DMClientSetCollection GetClientSets(string Token) |
| [**eMGetCreative**](EmProxyApi.md#eMGetCreative) | **POST** /EM_GetCreative | Proxy call to get EM creative |
| [**eMGetCreativeFields**](EmProxyApi.md#eMGetCreativeFields) | **POST** /EM_GetCreativeFields | Proxy call to get EM creative fields |
| [**eMGetCreatives**](EmProxyApi.md#eMGetCreatives) | **POST** /EM_GetCreatives | Proxy call to get EM creatives |
| [**eMGetEMServiceURL**](EmProxyApi.md#eMGetEMServiceURL) | **POST** /EM_GetEMServiceURL | Returns back the EM Service URL for the siteID requested. |
| [**eMGetEmailValidationExpression**](EmProxyApi.md#eMGetEmailValidationExpression) | **POST** /EM_GetEmailValidationExpression | Return the regular expression string used to validate an email address. This is the same expression used by Email Manager. |
| [**eMGetFoldersLazy**](EmProxyApi.md#eMGetFoldersLazy) | **POST** /EM_GetFoldersLazy | Returns an object containing the list of folders in the specified folder, together with a string representation of the folder hierarchy. |
| [**eMGetInboundAddresses**](EmProxyApi.md#eMGetInboundAddresses) | **POST** /EM_GetInboundAddresses | Proxy call to get inbound addresses |
| [**eMGetTemplateContent**](EmProxyApi.md#eMGetTemplateContent) | **POST** /EM_GetTemplateContent | Proxy call to get EM template content |
| [**eMGetUsers**](EmProxyApi.md#eMGetUsers) | **POST** /EM_GetUsers | Proxy call to EM UserManager.asmx             public List(DMUser) GetUsers(string Token) Can use with existing EMToken or supply mapping Id for auto-login |
| [**eMIsSysAdmin**](EmProxyApi.md#eMIsSysAdmin) | **POST** /EM_IsSysAdmin | Proxy call to EM Authenticate.asmx             public bool IsSysAdmin(string Token) |
| [**eMLogOff**](EmProxyApi.md#eMLogOff) | **POST** /EM_LogOff | Proxy call to EM Authenticate.asmx             public void Logout(string Token)             Logs the user associated with the token provided out of the system. |
| [**eMPauseDeployment**](EmProxyApi.md#eMPauseDeployment) | **POST** /EM_PauseDeployment | Proxy call to EM UserManager.asmx to pause a deployment |
| [**eMPrimaryKeys**](EmProxyApi.md#eMPrimaryKeys) | **POST** /EM_PrimaryKeys | Returns back the primary keys for a specific EM client |
| [**eMSetEMServiceURL**](EmProxyApi.md#eMSetEMServiceURL) | **POST** /EM_SetEMServiceURL | Sets the URL used to connect to the EM instance |
| [**eMTestEMServiceURL**](EmProxyApi.md#eMTestEMServiceURL) | **POST** /EM_TestEMServiceURL | Tests the EM Service URL |


<a id="eMAbortDeployment"></a>
# **eMAbortDeployment**
> AUTHChangePasswordDefaultResponse eMAbortDeployment(emAbortDeploymentRequest)

Proxy call to EM UserManager.asmx to abort a deployment

Proxy call to EM UserManager.asmx to abort a deployment

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMAbortDeploymentRequest emAbortDeploymentRequest = new EMAbortDeploymentRequest(); // EMAbortDeploymentRequest | Proxy call to EM UserManager.asmx to abort a deployment
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMAbortDeployment(emAbortDeploymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMAbortDeployment");
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
| **emAbortDeploymentRequest** | [**EMAbortDeploymentRequest**](EMAbortDeploymentRequest.md)| Proxy call to EM UserManager.asmx to abort a deployment | |

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

<a id="eMAuthenticate"></a>
# **eMAuthenticate**
> GetDataSourceEngineUserNameDefaultResponse eMAuthenticate(emAuthenticateRequest)

Proxy call to EM Authenticate.asmx             public string AuthenticateEx(string Login, string Password, string NewPassword, bool BumpExisting, DateTime LocalTime, DMPasswordFormat PasswordFormat)

Proxy call to EM Authenticate.asmx             public string AuthenticateEx(string Login, string Password, string NewPassword, bool BumpExisting, DateTime LocalTime, DMPasswordFormat PasswordFormat)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMAuthenticateRequest emAuthenticateRequest = new EMAuthenticateRequest(); // EMAuthenticateRequest | Proxy call to EM Authenticate.asmx             public string AuthenticateEx(string Login, string Password, string NewPassword, bool BumpExisting, DateTime LocalTime, DMPasswordFormat PasswordFormat)
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.eMAuthenticate(emAuthenticateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMAuthenticate");
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
| **emAuthenticateRequest** | [**EMAuthenticateRequest**](EMAuthenticateRequest.md)| Proxy call to EM Authenticate.asmx             public string AuthenticateEx(string Login, string Password, string NewPassword, bool BumpExisting, DateTime LocalTime, DMPasswordFormat PasswordFormat) | |

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

<a id="eMDeleteList"></a>
# **eMDeleteList**
> AUTHChangePasswordDefaultResponse eMDeleteList(emDeleteListRequest)

Deletes a list

Deletes a list

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMDeleteListRequest emDeleteListRequest = new EMDeleteListRequest(); // EMDeleteListRequest | Deletes a list
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMDeleteList(emDeleteListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMDeleteList");
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
| **emDeleteListRequest** | [**EMDeleteListRequest**](EMDeleteListRequest.md)| Deletes a list | |

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

<a id="eMGetClientGroupUsers"></a>
# **eMGetClientGroupUsers**
> EMGetClientGroupUsersDefaultResponse eMGetClientGroupUsers(emGetClientGroupUsersRequest)

Proxy call to EM UserManager.asmx             public DMUserCollection GetClientGroupUsers(string Token, DMClient Client, int GroupID)

Proxy call to EM UserManager.asmx             public DMUserCollection GetClientGroupUsers(string Token, DMClient Client, int GroupID)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetClientGroupUsersRequest emGetClientGroupUsersRequest = new EMGetClientGroupUsersRequest(); // EMGetClientGroupUsersRequest | Proxy call to EM UserManager.asmx             public DMUserCollection GetClientGroupUsers(string Token, DMClient Client, int GroupID)
    try {
      EMGetClientGroupUsersDefaultResponse result = apiInstance.eMGetClientGroupUsers(emGetClientGroupUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetClientGroupUsers");
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
| **emGetClientGroupUsersRequest** | [**EMGetClientGroupUsersRequest**](EMGetClientGroupUsersRequest.md)| Proxy call to EM UserManager.asmx             public DMUserCollection GetClientGroupUsers(string Token, DMClient Client, int GroupID) | |

### Return type

[**EMGetClientGroupUsersDefaultResponse**](EMGetClientGroupUsersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetClientGroups"></a>
# **eMGetClientGroups**
> EMGetClientGroupsDefaultResponse eMGetClientGroups(emGetClientGroupsRequest)

Proxy call to the EM UserManager.asmx              DMGroupCollection GetClientGroups(string Token, DMClient Client, out DMNestedGroupCollection Nested)

Proxy call to the EM UserManager.asmx              DMGroupCollection GetClientGroups(string Token, DMClient Client, out DMNestedGroupCollection Nested)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetClientGroupsRequest emGetClientGroupsRequest = new EMGetClientGroupsRequest(); // EMGetClientGroupsRequest | Proxy call to the EM UserManager.asmx              DMGroupCollection GetClientGroups(string Token, DMClient Client, out DMNestedGroupCollection Nested)
    try {
      EMGetClientGroupsDefaultResponse result = apiInstance.eMGetClientGroups(emGetClientGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetClientGroups");
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
| **emGetClientGroupsRequest** | [**EMGetClientGroupsRequest**](EMGetClientGroupsRequest.md)| Proxy call to the EM UserManager.asmx              DMGroupCollection GetClientGroups(string Token, DMClient Client, out DMNestedGroupCollection Nested) | |

### Return type

[**EMGetClientGroupsDefaultResponse**](EMGetClientGroupsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetClientInfo"></a>
# **eMGetClientInfo**
> EMGetClientInfoDefaultResponse eMGetClientInfo(emGetClientInfoRequest)

Proxy call to EM Authenticate.asmx             public void GetClientInfo(string Token, out int ID, out string Name, out string ContentURL, out string Icon)

Proxy call to EM Authenticate.asmx             public void GetClientInfo(string Token, out int ID, out string Name, out string ContentURL, out string Icon)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetClientInfoRequest emGetClientInfoRequest = new EMGetClientInfoRequest(); // EMGetClientInfoRequest | Proxy call to EM Authenticate.asmx             public void GetClientInfo(string Token, out int ID, out string Name, out string ContentURL, out string Icon)
    try {
      EMGetClientInfoDefaultResponse result = apiInstance.eMGetClientInfo(emGetClientInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetClientInfo");
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
| **emGetClientInfoRequest** | [**EMGetClientInfoRequest**](EMGetClientInfoRequest.md)| Proxy call to EM Authenticate.asmx             public void GetClientInfo(string Token, out int ID, out string Name, out string ContentURL, out string Icon) | |

### Return type

[**EMGetClientInfoDefaultResponse**](EMGetClientInfoDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetClientSets"></a>
# **eMGetClientSets**
> EMGetClientSetsDefaultResponse eMGetClientSets(emGetClientSetsRequest)

Proxy call to EM ClientManager.asmx             public DMClientSetCollection GetClientSets(string Token)

Proxy call to EM ClientManager.asmx             public DMClientSetCollection GetClientSets(string Token)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetClientSetsRequest emGetClientSetsRequest = new EMGetClientSetsRequest(); // EMGetClientSetsRequest | Proxy call to EM ClientManager.asmx             public DMClientSetCollection GetClientSets(string Token)
    try {
      EMGetClientSetsDefaultResponse result = apiInstance.eMGetClientSets(emGetClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetClientSets");
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
| **emGetClientSetsRequest** | [**EMGetClientSetsRequest**](EMGetClientSetsRequest.md)| Proxy call to EM ClientManager.asmx             public DMClientSetCollection GetClientSets(string Token) | |

### Return type

[**EMGetClientSetsDefaultResponse**](EMGetClientSetsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetCreative"></a>
# **eMGetCreative**
> EMGetCreativeDefaultResponse eMGetCreative(emGetCreativeRequest)

Proxy call to get EM creative

Proxy call to get EM creative

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetCreativeRequest emGetCreativeRequest = new EMGetCreativeRequest(); // EMGetCreativeRequest | Proxy call to get EM creative
    try {
      EMGetCreativeDefaultResponse result = apiInstance.eMGetCreative(emGetCreativeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetCreative");
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
| **emGetCreativeRequest** | [**EMGetCreativeRequest**](EMGetCreativeRequest.md)| Proxy call to get EM creative | |

### Return type

[**EMGetCreativeDefaultResponse**](EMGetCreativeDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetCreativeFields"></a>
# **eMGetCreativeFields**
> EMGetCreativeFieldsDefaultResponse eMGetCreativeFields(emGetCreativeRequest)

Proxy call to get EM creative fields

Proxy call to get EM creative fields

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetCreativeRequest emGetCreativeRequest = new EMGetCreativeRequest(); // EMGetCreativeRequest | Proxy call to get EM creative fields
    try {
      EMGetCreativeFieldsDefaultResponse result = apiInstance.eMGetCreativeFields(emGetCreativeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetCreativeFields");
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
| **emGetCreativeRequest** | [**EMGetCreativeRequest**](EMGetCreativeRequest.md)| Proxy call to get EM creative fields | |

### Return type

[**EMGetCreativeFieldsDefaultResponse**](EMGetCreativeFieldsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetCreatives"></a>
# **eMGetCreatives**
> EMGetCreativesDefaultResponse eMGetCreatives(emGetCreativesRequest)

Proxy call to get EM creatives

Proxy call to get EM creatives

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetCreativesRequest emGetCreativesRequest = new EMGetCreativesRequest(); // EMGetCreativesRequest | Proxy call to get EM creatives
    try {
      EMGetCreativesDefaultResponse result = apiInstance.eMGetCreatives(emGetCreativesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetCreatives");
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
| **emGetCreativesRequest** | [**EMGetCreativesRequest**](EMGetCreativesRequest.md)| Proxy call to get EM creatives | |

### Return type

[**EMGetCreativesDefaultResponse**](EMGetCreativesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetEMServiceURL"></a>
# **eMGetEMServiceURL**
> GetDataSourceEngineUserNameDefaultResponse eMGetEMServiceURL(emGetEMServiceURLRequest)

Returns back the EM Service URL for the siteID requested.

Returns back the EM Service URL for the siteID requested.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetEMServiceURLRequest emGetEMServiceURLRequest = new EMGetEMServiceURLRequest(); // EMGetEMServiceURLRequest | Returns back the EM Service URL for the siteID requested.
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.eMGetEMServiceURL(emGetEMServiceURLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetEMServiceURL");
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
| **emGetEMServiceURLRequest** | [**EMGetEMServiceURLRequest**](EMGetEMServiceURLRequest.md)| Returns back the EM Service URL for the siteID requested. | |

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

<a id="eMGetEmailValidationExpression"></a>
# **eMGetEmailValidationExpression**
> GetDataSourceEngineUserNameDefaultResponse eMGetEmailValidationExpression()

Return the regular expression string used to validate an email address. This is the same expression used by Email Manager.

Return the regular expression string used to validate an email address. This is the same expression used by Email Manager.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.eMGetEmailValidationExpression();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetEmailValidationExpression");
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

[**GetDataSourceEngineUserNameDefaultResponse**](GetDataSourceEngineUserNameDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetFoldersLazy"></a>
# **eMGetFoldersLazy**
> EMGetFoldersLazyDefaultResponse eMGetFoldersLazy(emGetFoldersLazyRequest)

Returns an object containing the list of folders in the specified folder, together with a string representation of the folder hierarchy.

Returns an object containing the list of folders in the specified folder, together with a string representation of the folder hierarchy.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetFoldersLazyRequest emGetFoldersLazyRequest = new EMGetFoldersLazyRequest(); // EMGetFoldersLazyRequest | Returns an object containing the list of folders in the specified folder, together with a string representation of the folder hierarchy.
    try {
      EMGetFoldersLazyDefaultResponse result = apiInstance.eMGetFoldersLazy(emGetFoldersLazyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetFoldersLazy");
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
| **emGetFoldersLazyRequest** | [**EMGetFoldersLazyRequest**](EMGetFoldersLazyRequest.md)| Returns an object containing the list of folders in the specified folder, together with a string representation of the folder hierarchy. | |

### Return type

[**EMGetFoldersLazyDefaultResponse**](EMGetFoldersLazyDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetInboundAddresses"></a>
# **eMGetInboundAddresses**
> EMGetInboundAddressesDefaultResponse eMGetInboundAddresses(emGetInboundAddressesRequest)

Proxy call to get inbound addresses

Proxy call to get inbound addresses

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetInboundAddressesRequest emGetInboundAddressesRequest = new EMGetInboundAddressesRequest(); // EMGetInboundAddressesRequest | Proxy call to get inbound addresses
    try {
      EMGetInboundAddressesDefaultResponse result = apiInstance.eMGetInboundAddresses(emGetInboundAddressesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetInboundAddresses");
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
| **emGetInboundAddressesRequest** | [**EMGetInboundAddressesRequest**](EMGetInboundAddressesRequest.md)| Proxy call to get inbound addresses | |

### Return type

[**EMGetInboundAddressesDefaultResponse**](EMGetInboundAddressesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMGetTemplateContent"></a>
# **eMGetTemplateContent**
> GetDataSourceEngineUserNameDefaultResponse eMGetTemplateContent(emGetTemplateContentRequest)

Proxy call to get EM template content

Proxy call to get EM template content

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetTemplateContentRequest emGetTemplateContentRequest = new EMGetTemplateContentRequest(); // EMGetTemplateContentRequest | Proxy call to get EM template content
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.eMGetTemplateContent(emGetTemplateContentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetTemplateContent");
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
| **emGetTemplateContentRequest** | [**EMGetTemplateContentRequest**](EMGetTemplateContentRequest.md)| Proxy call to get EM template content | |

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

<a id="eMGetUsers"></a>
# **eMGetUsers**
> EMGetClientGroupUsersDefaultResponse eMGetUsers(emGetUsersRequest)

Proxy call to EM UserManager.asmx             public List(DMUser) GetUsers(string Token) Can use with existing EMToken or supply mapping Id for auto-login

Proxy call to EM UserManager.asmx             public List(DMUser) GetUsers(string Token) Can use with existing EMToken or supply mapping Id for auto-login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetUsersRequest emGetUsersRequest = new EMGetUsersRequest(); // EMGetUsersRequest | Proxy call to EM UserManager.asmx             public List(DMUser) GetUsers(string Token) Can use with existing EMToken or supply mapping Id for auto-login
    try {
      EMGetClientGroupUsersDefaultResponse result = apiInstance.eMGetUsers(emGetUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMGetUsers");
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
| **emGetUsersRequest** | [**EMGetUsersRequest**](EMGetUsersRequest.md)| Proxy call to EM UserManager.asmx             public List(DMUser) GetUsers(string Token) Can use with existing EMToken or supply mapping Id for auto-login | |

### Return type

[**EMGetClientGroupUsersDefaultResponse**](EMGetClientGroupUsersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMIsSysAdmin"></a>
# **eMIsSysAdmin**
> AUTHChangePasswordDefaultResponse eMIsSysAdmin(emGetClientInfoRequest)

Proxy call to EM Authenticate.asmx             public bool IsSysAdmin(string Token)

Proxy call to EM Authenticate.asmx             public bool IsSysAdmin(string Token)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMGetClientInfoRequest emGetClientInfoRequest = new EMGetClientInfoRequest(); // EMGetClientInfoRequest | Proxy call to EM Authenticate.asmx             public bool IsSysAdmin(string Token)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMIsSysAdmin(emGetClientInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMIsSysAdmin");
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
| **emGetClientInfoRequest** | [**EMGetClientInfoRequest**](EMGetClientInfoRequest.md)| Proxy call to EM Authenticate.asmx             public bool IsSysAdmin(string Token) | |

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

<a id="eMLogOff"></a>
# **eMLogOff**
> AUTHChangePasswordDefaultResponse eMLogOff(emLogOffRequest)

Proxy call to EM Authenticate.asmx             public void Logout(string Token)             Logs the user associated with the token provided out of the system.

Proxy call to EM Authenticate.asmx             public void Logout(string Token)             Logs the user associated with the token provided out of the system.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMLogOffRequest emLogOffRequest = new EMLogOffRequest(); // EMLogOffRequest | Proxy call to EM Authenticate.asmx             public void Logout(string Token)             Logs the user associated with the token provided out of the system.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMLogOff(emLogOffRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMLogOff");
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
| **emLogOffRequest** | [**EMLogOffRequest**](EMLogOffRequest.md)| Proxy call to EM Authenticate.asmx             public void Logout(string Token)             Logs the user associated with the token provided out of the system. | |

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

<a id="eMPauseDeployment"></a>
# **eMPauseDeployment**
> AUTHChangePasswordDefaultResponse eMPauseDeployment(emPauseDeploymentRequest)

Proxy call to EM UserManager.asmx to pause a deployment

Proxy call to EM UserManager.asmx to pause a deployment

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMPauseDeploymentRequest emPauseDeploymentRequest = new EMPauseDeploymentRequest(); // EMPauseDeploymentRequest | Proxy call to EM UserManager.asmx to pause a deployment
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMPauseDeployment(emPauseDeploymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMPauseDeployment");
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
| **emPauseDeploymentRequest** | [**EMPauseDeploymentRequest**](EMPauseDeploymentRequest.md)| Proxy call to EM UserManager.asmx to pause a deployment | |

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

<a id="eMPrimaryKeys"></a>
# **eMPrimaryKeys**
> EMPrimaryKeysDefaultResponse eMPrimaryKeys(emPrimaryKeysRequest)

Returns back the primary keys for a specific EM client

Returns back the primary keys for a specific EM client

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMPrimaryKeysRequest emPrimaryKeysRequest = new EMPrimaryKeysRequest(); // EMPrimaryKeysRequest | Returns back the primary keys for a specific EM client
    try {
      EMPrimaryKeysDefaultResponse result = apiInstance.eMPrimaryKeys(emPrimaryKeysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMPrimaryKeys");
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
| **emPrimaryKeysRequest** | [**EMPrimaryKeysRequest**](EMPrimaryKeysRequest.md)| Returns back the primary keys for a specific EM client | |

### Return type

[**EMPrimaryKeysDefaultResponse**](EMPrimaryKeysDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="eMSetEMServiceURL"></a>
# **eMSetEMServiceURL**
> AUTHChangePasswordDefaultResponse eMSetEMServiceURL(emSetEMServiceURLRequest)

Sets the URL used to connect to the EM instance

Sets the URL used to connect to the EM instance

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMSetEMServiceURLRequest emSetEMServiceURLRequest = new EMSetEMServiceURLRequest(); // EMSetEMServiceURLRequest | Sets the URL used to connect to the EM instance
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMSetEMServiceURL(emSetEMServiceURLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMSetEMServiceURL");
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
| **emSetEMServiceURLRequest** | [**EMSetEMServiceURLRequest**](EMSetEMServiceURLRequest.md)| Sets the URL used to connect to the EM instance | |

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

<a id="eMTestEMServiceURL"></a>
# **eMTestEMServiceURL**
> AUTHChangePasswordDefaultResponse eMTestEMServiceURL(emTestEMServiceURLRequest)

Tests the EM Service URL

Tests the EM Service URL

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmProxyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmProxyApi apiInstance = new EmProxyApi(defaultClient);
    EMTestEMServiceURLRequest emTestEMServiceURLRequest = new EMTestEMServiceURLRequest(); // EMTestEMServiceURLRequest | Tests the EM Service URL
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.eMTestEMServiceURL(emTestEMServiceURLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmProxyApi#eMTestEMServiceURL");
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
| **emTestEMServiceURLRequest** | [**EMTestEMServiceURLRequest**](EMTestEMServiceURLRequest.md)| Tests the EM Service URL | |

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

