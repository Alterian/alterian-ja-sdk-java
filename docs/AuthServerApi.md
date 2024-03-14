# AuthServerApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aUTHChangePassword**](AuthServerApi.md#aUTHChangePassword) | **POST** /AUTH_ChangePassword | Set a new password for tthe specified login |
| [**aUTHCreateLogin**](AuthServerApi.md#aUTHCreateLogin) | **POST** /AUTH_CreateLogin | Creates a login and associates it with the client |
| [**aUTHDisableLogin**](AuthServerApi.md#aUTHDisableLogin) | **POST** /AUTH_DisableLogin | Disable the specified login |
| [**aUTHEnableLogin**](AuthServerApi.md#aUTHEnableLogin) | **POST** /AUTH_EnableLogin | Enable the specified login |
| [**aUTHExpirePassword**](AuthServerApi.md#aUTHExpirePassword) | **POST** /AUTH_ExpirePassword | Expire the password for the specified login |
| [**aUTHGetClientLogins**](AuthServerApi.md#aUTHGetClientLogins) | **POST** /AUTH_GetClientLogins | Get a list of logins from the authentication system which are currently assigned to the token&#39;s client |
| [**aUTHGetLoginPasswordRules**](AuthServerApi.md#aUTHGetLoginPasswordRules) | **POST** /AUTH_GetLoginPasswordRules | Request the password policy rules from the authentication system |
| [**aUTHGetLogins**](AuthServerApi.md#aUTHGetLogins) | **POST** /AUTH_GetLogins | Get a list of logins from the authentication system which are currently assigned to the token&#39;s client and have no user associated with them |
| [**aUTHGetLoginsForUser**](AuthServerApi.md#aUTHGetLoginsForUser) | **POST** /AUTH_GetLoginsForUser | Returns back the login(s) associated with a particular userid and siteid |
| [**aUTHRenameLogin**](AuthServerApi.md#aUTHRenameLogin) | **POST** /AUTH_RenameLogin | Rename the specified login |
| [**aUTHSetLoginUserId**](AuthServerApi.md#aUTHSetLoginUserId) | **POST** /AUTH_SetLoginUserId | Associates an auth system login with a CM user ID |
| [**aUTHUpdateLogin**](AuthServerApi.md#aUTHUpdateLogin) | **POST** /AUTH_UpdateLogin | Updates the important components of a login, use expire, etc. to expire or delete a login |


<a id="aUTHChangePassword"></a>
# **aUTHChangePassword**
> AUTHChangePasswordDefaultResponse aUTHChangePassword(auTHChangePasswordRequest)

Set a new password for tthe specified login

Set a new password for tthe specified login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHChangePasswordRequest auTHChangePasswordRequest = new AUTHChangePasswordRequest(); // AUTHChangePasswordRequest | Set a new password for tthe specified login
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHChangePassword(auTHChangePasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHChangePassword");
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
| **auTHChangePasswordRequest** | [**AUTHChangePasswordRequest**](AUTHChangePasswordRequest.md)| Set a new password for tthe specified login | |

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

<a id="aUTHCreateLogin"></a>
# **aUTHCreateLogin**
> AUTHCreateLoginDefaultResponse aUTHCreateLogin(auTHCreateLoginRequest)

Creates a login and associates it with the client

Creates a login and associates it with the client

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHCreateLoginRequest auTHCreateLoginRequest = new AUTHCreateLoginRequest(); // AUTHCreateLoginRequest | Creates a login and associates it with the client
    try {
      AUTHCreateLoginDefaultResponse result = apiInstance.aUTHCreateLogin(auTHCreateLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHCreateLogin");
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
| **auTHCreateLoginRequest** | [**AUTHCreateLoginRequest**](AUTHCreateLoginRequest.md)| Creates a login and associates it with the client | |

### Return type

[**AUTHCreateLoginDefaultResponse**](AUTHCreateLoginDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="aUTHDisableLogin"></a>
# **aUTHDisableLogin**
> AUTHChangePasswordDefaultResponse aUTHDisableLogin(auTHDisableLoginRequest)

Disable the specified login

Disable the specified login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHDisableLoginRequest auTHDisableLoginRequest = new AUTHDisableLoginRequest(); // AUTHDisableLoginRequest | Disable the specified login
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHDisableLogin(auTHDisableLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHDisableLogin");
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
| **auTHDisableLoginRequest** | [**AUTHDisableLoginRequest**](AUTHDisableLoginRequest.md)| Disable the specified login | |

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

<a id="aUTHEnableLogin"></a>
# **aUTHEnableLogin**
> AUTHChangePasswordDefaultResponse aUTHEnableLogin(auTHDisableLoginRequest)

Enable the specified login

Enable the specified login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHDisableLoginRequest auTHDisableLoginRequest = new AUTHDisableLoginRequest(); // AUTHDisableLoginRequest | Enable the specified login
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHEnableLogin(auTHDisableLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHEnableLogin");
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
| **auTHDisableLoginRequest** | [**AUTHDisableLoginRequest**](AUTHDisableLoginRequest.md)| Enable the specified login | |

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

<a id="aUTHExpirePassword"></a>
# **aUTHExpirePassword**
> AUTHChangePasswordDefaultResponse aUTHExpirePassword(auTHDisableLoginRequest)

Expire the password for the specified login

Expire the password for the specified login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHDisableLoginRequest auTHDisableLoginRequest = new AUTHDisableLoginRequest(); // AUTHDisableLoginRequest | Expire the password for the specified login
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHExpirePassword(auTHDisableLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHExpirePassword");
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
| **auTHDisableLoginRequest** | [**AUTHDisableLoginRequest**](AUTHDisableLoginRequest.md)| Expire the password for the specified login | |

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

<a id="aUTHGetClientLogins"></a>
# **aUTHGetClientLogins**
> AUTHGetClientLoginsDefaultResponse aUTHGetClientLogins(auTHGetClientLoginsRequest)

Get a list of logins from the authentication system which are currently assigned to the token&#39;s client

Get a list of logins from the authentication system which are currently assigned to the token&#39;s client

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHGetClientLoginsRequest auTHGetClientLoginsRequest = new AUTHGetClientLoginsRequest(); // AUTHGetClientLoginsRequest | Get a list of logins from the authentication system which are currently assigned to the token's client
    try {
      AUTHGetClientLoginsDefaultResponse result = apiInstance.aUTHGetClientLogins(auTHGetClientLoginsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHGetClientLogins");
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
| **auTHGetClientLoginsRequest** | [**AUTHGetClientLoginsRequest**](AUTHGetClientLoginsRequest.md)| Get a list of logins from the authentication system which are currently assigned to the token&#39;s client | |

### Return type

[**AUTHGetClientLoginsDefaultResponse**](AUTHGetClientLoginsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="aUTHGetLoginPasswordRules"></a>
# **aUTHGetLoginPasswordRules**
> AUTHGetLoginPasswordRulesDefaultResponse aUTHGetLoginPasswordRules(auTHGetLoginPasswordRulesRequest)

Request the password policy rules from the authentication system

Request the password policy rules from the authentication system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHGetLoginPasswordRulesRequest auTHGetLoginPasswordRulesRequest = new AUTHGetLoginPasswordRulesRequest(); // AUTHGetLoginPasswordRulesRequest | Request the password policy rules from the authentication system
    try {
      AUTHGetLoginPasswordRulesDefaultResponse result = apiInstance.aUTHGetLoginPasswordRules(auTHGetLoginPasswordRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHGetLoginPasswordRules");
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
| **auTHGetLoginPasswordRulesRequest** | [**AUTHGetLoginPasswordRulesRequest**](AUTHGetLoginPasswordRulesRequest.md)| Request the password policy rules from the authentication system | |

### Return type

[**AUTHGetLoginPasswordRulesDefaultResponse**](AUTHGetLoginPasswordRulesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="aUTHGetLogins"></a>
# **aUTHGetLogins**
> AUTHGetClientLoginsDefaultResponse aUTHGetLogins(auTHGetLoginsRequest)

Get a list of logins from the authentication system which are currently assigned to the token&#39;s client and have no user associated with them

Get a list of logins from the authentication system which are currently assigned to the token&#39;s client and have no user associated with them

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHGetLoginsRequest auTHGetLoginsRequest = new AUTHGetLoginsRequest(); // AUTHGetLoginsRequest | Get a list of logins from the authentication system which are currently assigned to the token's client and have no user associated with them
    try {
      AUTHGetClientLoginsDefaultResponse result = apiInstance.aUTHGetLogins(auTHGetLoginsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHGetLogins");
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
| **auTHGetLoginsRequest** | [**AUTHGetLoginsRequest**](AUTHGetLoginsRequest.md)| Get a list of logins from the authentication system which are currently assigned to the token&#39;s client and have no user associated with them | |

### Return type

[**AUTHGetClientLoginsDefaultResponse**](AUTHGetClientLoginsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="aUTHGetLoginsForUser"></a>
# **aUTHGetLoginsForUser**
> AUTHGetClientLoginsDefaultResponse aUTHGetLoginsForUser(auTHGetLoginsForUserRequest)

Returns back the login(s) associated with a particular userid and siteid

Returns back the login(s) associated with a particular userid and siteid

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHGetLoginsForUserRequest auTHGetLoginsForUserRequest = new AUTHGetLoginsForUserRequest(); // AUTHGetLoginsForUserRequest | Returns back the login(s) associated with a particular userid and siteid
    try {
      AUTHGetClientLoginsDefaultResponse result = apiInstance.aUTHGetLoginsForUser(auTHGetLoginsForUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHGetLoginsForUser");
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
| **auTHGetLoginsForUserRequest** | [**AUTHGetLoginsForUserRequest**](AUTHGetLoginsForUserRequest.md)| Returns back the login(s) associated with a particular userid and siteid | |

### Return type

[**AUTHGetClientLoginsDefaultResponse**](AUTHGetClientLoginsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="aUTHRenameLogin"></a>
# **aUTHRenameLogin**
> AUTHChangePasswordDefaultResponse aUTHRenameLogin(auTHRenameLoginRequest)

Rename the specified login

Rename the specified login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHRenameLoginRequest auTHRenameLoginRequest = new AUTHRenameLoginRequest(); // AUTHRenameLoginRequest | Rename the specified login
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHRenameLogin(auTHRenameLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHRenameLogin");
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
| **auTHRenameLoginRequest** | [**AUTHRenameLoginRequest**](AUTHRenameLoginRequest.md)| Rename the specified login | |

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

<a id="aUTHSetLoginUserId"></a>
# **aUTHSetLoginUserId**
> AUTHChangePasswordDefaultResponse aUTHSetLoginUserId(auTHSetLoginUserIdRequest)

Associates an auth system login with a CM user ID

Associates an auth system login with a CM user ID

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHSetLoginUserIdRequest auTHSetLoginUserIdRequest = new AUTHSetLoginUserIdRequest(); // AUTHSetLoginUserIdRequest | Associates an auth system login with a CM user ID
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHSetLoginUserId(auTHSetLoginUserIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHSetLoginUserId");
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
| **auTHSetLoginUserIdRequest** | [**AUTHSetLoginUserIdRequest**](AUTHSetLoginUserIdRequest.md)| Associates an auth system login with a CM user ID | |

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

<a id="aUTHUpdateLogin"></a>
# **aUTHUpdateLogin**
> AUTHChangePasswordDefaultResponse aUTHUpdateLogin(auTHUpdateLoginRequest)

Updates the important components of a login, use expire, etc. to expire or delete a login

Updates the important components of a login, use expire, etc. to expire or delete a login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.AuthServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    AuthServerApi apiInstance = new AuthServerApi(defaultClient);
    AUTHUpdateLoginRequest auTHUpdateLoginRequest = new AUTHUpdateLoginRequest(); // AUTHUpdateLoginRequest | Updates the important components of a login, use expire, etc. to expire or delete a login
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.aUTHUpdateLogin(auTHUpdateLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthServerApi#aUTHUpdateLogin");
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
| **auTHUpdateLoginRequest** | [**AUTHUpdateLoginRequest**](AUTHUpdateLoginRequest.md)| Updates the important components of a login, use expire, etc. to expire or delete a login | |

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

