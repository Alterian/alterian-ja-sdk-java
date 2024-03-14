# TokenApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createImpersonationToken**](TokenApi.md#createImpersonationToken) | **POST** /CreateImpersonationToken | Using an SA token, create an impersonation token for the specific client and, optionally, user |
| [**createStaticToken**](TokenApi.md#createStaticToken) | **POST** /CreateStaticToken | Create a static token for API usage |
| [**deleteStaticToken**](TokenApi.md#deleteStaticToken) | **POST** /DeleteStaticToken | Remove a static token.  Any automation or other application which is using this token will cease to function. |
| [**getTokens**](TokenApi.md#getTokens) | **POST** /GetTokens | Request a list of tokens. |
| [**updateStaticToken**](TokenApi.md#updateStaticToken) | **POST** /UpdateStaticToken | Change the UserID mapping for a static token |


<a id="createImpersonationToken"></a>
# **createImpersonationToken**
> AUTHCreateLoginDefaultResponse createImpersonationToken(createImpersonationTokenRequest)

Using an SA token, create an impersonation token for the specific client and, optionally, user

Using an SA token, create an impersonation token for the specific client and, optionally, user

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TokenApi apiInstance = new TokenApi(defaultClient);
    CreateImpersonationTokenRequest createImpersonationTokenRequest = new CreateImpersonationTokenRequest(); // CreateImpersonationTokenRequest | Using an SA token, create an impersonation token for the specific client and, optionally, user
    try {
      AUTHCreateLoginDefaultResponse result = apiInstance.createImpersonationToken(createImpersonationTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#createImpersonationToken");
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
| **createImpersonationTokenRequest** | [**CreateImpersonationTokenRequest**](CreateImpersonationTokenRequest.md)| Using an SA token, create an impersonation token for the specific client and, optionally, user | |

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

<a id="createStaticToken"></a>
# **createStaticToken**
> AUTHCreateLoginDefaultResponse createStaticToken(createStaticTokenRequest)

Create a static token for API usage

Create a static token for API usage

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TokenApi apiInstance = new TokenApi(defaultClient);
    CreateStaticTokenRequest createStaticTokenRequest = new CreateStaticTokenRequest(); // CreateStaticTokenRequest | Create a static token for API usage
    try {
      AUTHCreateLoginDefaultResponse result = apiInstance.createStaticToken(createStaticTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#createStaticToken");
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
| **createStaticTokenRequest** | [**CreateStaticTokenRequest**](CreateStaticTokenRequest.md)| Create a static token for API usage | |

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

<a id="deleteStaticToken"></a>
# **deleteStaticToken**
> AUTHChangePasswordDefaultResponse deleteStaticToken(deleteStaticTokenRequest)

Remove a static token.  Any automation or other application which is using this token will cease to function.

Remove a static token.  Any automation or other application which is using this token will cease to function.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TokenApi apiInstance = new TokenApi(defaultClient);
    DeleteStaticTokenRequest deleteStaticTokenRequest = new DeleteStaticTokenRequest(); // DeleteStaticTokenRequest | Remove a static token.  Any automation or other application which is using this token will cease to function.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteStaticToken(deleteStaticTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#deleteStaticToken");
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
| **deleteStaticTokenRequest** | [**DeleteStaticTokenRequest**](DeleteStaticTokenRequest.md)| Remove a static token.  Any automation or other application which is using this token will cease to function. | |

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

<a id="getTokens"></a>
# **getTokens**
> GetTokensDefaultResponse getTokens(getTokensRequest)

Request a list of tokens.

Request a list of tokens.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TokenApi apiInstance = new TokenApi(defaultClient);
    GetTokensRequest getTokensRequest = new GetTokensRequest(); // GetTokensRequest | Request a list of tokens.
    try {
      GetTokensDefaultResponse result = apiInstance.getTokens(getTokensRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#getTokens");
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
| **getTokensRequest** | [**GetTokensRequest**](GetTokensRequest.md)| Request a list of tokens. | |

### Return type

[**GetTokensDefaultResponse**](GetTokensDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateStaticToken"></a>
# **updateStaticToken**
> AUTHChangePasswordDefaultResponse updateStaticToken(updateStaticTokenRequest)

Change the UserID mapping for a static token

Change the UserID mapping for a static token

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TokenApi apiInstance = new TokenApi(defaultClient);
    UpdateStaticTokenRequest updateStaticTokenRequest = new UpdateStaticTokenRequest(); // UpdateStaticTokenRequest | Change the UserID mapping for a static token
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateStaticToken(updateStaticTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#updateStaticToken");
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
| **updateStaticTokenRequest** | [**UpdateStaticTokenRequest**](UpdateStaticTokenRequest.md)| Change the UserID mapping for a static token | |

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

