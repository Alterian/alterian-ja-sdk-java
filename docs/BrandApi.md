# BrandApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLoginImpersonation**](BrandApi.md#addLoginImpersonation) | **POST** /AddLoginImpersonation | Allow a login to use the impersonation feature of GetBrandToken |
| [**addUserToBrands**](BrandApi.md#addUserToBrands) | **POST** /AddUserToBrands | Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access |
| [**getBrandToken**](BrandApi.md#getBrandToken) | **POST** /GetBrandToken | Returns back a token used to access the brand provided. |
| [**getBrands**](BrandApi.md#getBrands) | **POST** /GetBrands | Returns back a list of brands which this login can access |
| [**getLoginBrandDefault**](BrandApi.md#getLoginBrandDefault) | **POST** /GetLoginBrandDefault | Returns back the brand default for the specified login |
| [**getLoginUserMapping**](BrandApi.md#getLoginUserMapping) | **POST** /GetLoginUserMapping | Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token&#39;s login |
| [**getTokenDetails**](BrandApi.md#getTokenDetails) | **POST** /GetTokenDetails | Request details about a token. |
| [**removeLoginBrandDefault**](BrandApi.md#removeLoginBrandDefault) | **POST** /RemoveLoginBrandDefault | Removes a login brand default |
| [**removeLoginImpersonation**](BrandApi.md#removeLoginImpersonation) | **POST** /RemoveLoginImpersonation | Stop allowing a login from using the impersonation feature of GetBrandToken |
| [**removeLoginUserMapping**](BrandApi.md#removeLoginUserMapping) | **POST** /RemoveLoginUserMapping | Remove a login\\user mapping |
| [**setLoginBrandDefault**](BrandApi.md#setLoginBrandDefault) | **POST** /SetLoginBrandDefault | Sets a login&#39;s brand to the default brand specified |
| [**setLoginUserMapping**](BrandApi.md#setLoginUserMapping) | **POST** /SetLoginUserMapping | Sets the login\\user mapping |


<a id="addLoginImpersonation"></a>
# **addLoginImpersonation**
> AUTHChangePasswordDefaultResponse addLoginImpersonation(addLoginImpersonationRequest)

Allow a login to use the impersonation feature of GetBrandToken

Allow a login to use the impersonation feature of GetBrandToken

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    AddLoginImpersonationRequest addLoginImpersonationRequest = new AddLoginImpersonationRequest(); // AddLoginImpersonationRequest | Allow a login to use the impersonation feature of GetBrandToken
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.addLoginImpersonation(addLoginImpersonationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#addLoginImpersonation");
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
| **addLoginImpersonationRequest** | [**AddLoginImpersonationRequest**](AddLoginImpersonationRequest.md)| Allow a login to use the impersonation feature of GetBrandToken | |

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

<a id="addUserToBrands"></a>
# **addUserToBrands**
> AUTHChangePasswordDefaultResponse addUserToBrands(addUserToBrandsRequest)

Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access

Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    AddUserToBrandsRequest addUserToBrandsRequest = new AddUserToBrandsRequest(); // AddUserToBrandsRequest | Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.addUserToBrands(addUserToBrandsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#addUserToBrands");
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
| **addUserToBrandsRequest** | [**AddUserToBrandsRequest**](AddUserToBrandsRequest.md)| Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access | |

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

<a id="getBrandToken"></a>
# **getBrandToken**
> AUTHCreateLoginDefaultResponse getBrandToken(getBrandTokenRequest)

Returns back a token used to access the brand provided.

Returns back a token used to access the brand provided.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    GetBrandTokenRequest getBrandTokenRequest = new GetBrandTokenRequest(); // GetBrandTokenRequest | Returns back a token used to access the brand provided.
    try {
      AUTHCreateLoginDefaultResponse result = apiInstance.getBrandToken(getBrandTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getBrandToken");
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
| **getBrandTokenRequest** | [**GetBrandTokenRequest**](GetBrandTokenRequest.md)| Returns back a token used to access the brand provided. | |

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

<a id="getBrands"></a>
# **getBrands**
> GetBrandsDefaultResponse getBrands(getBrandsRequest)

Returns back a list of brands which this login can access

Returns back a list of brands which this login can access

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    GetBrandsRequest getBrandsRequest = new GetBrandsRequest(); // GetBrandsRequest | Returns back a list of brands which this login can access
    try {
      GetBrandsDefaultResponse result = apiInstance.getBrands(getBrandsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getBrands");
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
| **getBrandsRequest** | [**GetBrandsRequest**](GetBrandsRequest.md)| Returns back a list of brands which this login can access | |

### Return type

[**GetBrandsDefaultResponse**](GetBrandsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getLoginBrandDefault"></a>
# **getLoginBrandDefault**
> GetLoginBrandDefaultDefaultResponse getLoginBrandDefault(getLoginBrandDefaultRequest)

Returns back the brand default for the specified login

Returns back the brand default for the specified login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    GetLoginBrandDefaultRequest getLoginBrandDefaultRequest = new GetLoginBrandDefaultRequest(); // GetLoginBrandDefaultRequest | Returns back the brand default for the specified login
    try {
      GetLoginBrandDefaultDefaultResponse result = apiInstance.getLoginBrandDefault(getLoginBrandDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getLoginBrandDefault");
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
| **getLoginBrandDefaultRequest** | [**GetLoginBrandDefaultRequest**](GetLoginBrandDefaultRequest.md)| Returns back the brand default for the specified login | |

### Return type

[**GetLoginBrandDefaultDefaultResponse**](GetLoginBrandDefaultDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getLoginUserMapping"></a>
# **getLoginUserMapping**
> GetLoginUserMappingDefaultResponse getLoginUserMapping(getLoginUserMappingRequest)

Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token&#39;s login

Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token&#39;s login

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    GetLoginUserMappingRequest getLoginUserMappingRequest = new GetLoginUserMappingRequest(); // GetLoginUserMappingRequest | Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token's login
    try {
      GetLoginUserMappingDefaultResponse result = apiInstance.getLoginUserMapping(getLoginUserMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getLoginUserMapping");
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
| **getLoginUserMappingRequest** | [**GetLoginUserMappingRequest**](GetLoginUserMappingRequest.md)| Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token&#39;s login | |

### Return type

[**GetLoginUserMappingDefaultResponse**](GetLoginUserMappingDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getTokenDetails"></a>
# **getTokenDetails**
> GetTokenDetailsDefaultResponse getTokenDetails()

Request details about a token.

Request details about a token.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    try {
      GetTokenDetailsDefaultResponse result = apiInstance.getTokenDetails();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getTokenDetails");
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

[**GetTokenDetailsDefaultResponse**](GetTokenDetailsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="removeLoginBrandDefault"></a>
# **removeLoginBrandDefault**
> AUTHChangePasswordDefaultResponse removeLoginBrandDefault(removeLoginBrandDefaultRequest)

Removes a login brand default

Removes a login brand default

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    RemoveLoginBrandDefaultRequest removeLoginBrandDefaultRequest = new RemoveLoginBrandDefaultRequest(); // RemoveLoginBrandDefaultRequest | Removes a login brand default
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.removeLoginBrandDefault(removeLoginBrandDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#removeLoginBrandDefault");
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
| **removeLoginBrandDefaultRequest** | [**RemoveLoginBrandDefaultRequest**](RemoveLoginBrandDefaultRequest.md)| Removes a login brand default | |

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

<a id="removeLoginImpersonation"></a>
# **removeLoginImpersonation**
> AUTHChangePasswordDefaultResponse removeLoginImpersonation(removeLoginImpersonationRequest)

Stop allowing a login from using the impersonation feature of GetBrandToken

Stop allowing a login from using the impersonation feature of GetBrandToken

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    RemoveLoginImpersonationRequest removeLoginImpersonationRequest = new RemoveLoginImpersonationRequest(); // RemoveLoginImpersonationRequest | Stop allowing a login from using the impersonation feature of GetBrandToken
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.removeLoginImpersonation(removeLoginImpersonationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#removeLoginImpersonation");
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
| **removeLoginImpersonationRequest** | [**RemoveLoginImpersonationRequest**](RemoveLoginImpersonationRequest.md)| Stop allowing a login from using the impersonation feature of GetBrandToken | |

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

<a id="removeLoginUserMapping"></a>
# **removeLoginUserMapping**
> AUTHChangePasswordDefaultResponse removeLoginUserMapping(removeLoginUserMappingRequest)

Remove a login\\user mapping

Remove a login\\user mapping

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    RemoveLoginUserMappingRequest removeLoginUserMappingRequest = new RemoveLoginUserMappingRequest(); // RemoveLoginUserMappingRequest | Remove a login\\user mapping
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.removeLoginUserMapping(removeLoginUserMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#removeLoginUserMapping");
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
| **removeLoginUserMappingRequest** | [**RemoveLoginUserMappingRequest**](RemoveLoginUserMappingRequest.md)| Remove a login\\user mapping | |

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

<a id="setLoginBrandDefault"></a>
# **setLoginBrandDefault**
> AUTHChangePasswordDefaultResponse setLoginBrandDefault(setLoginBrandDefaultRequest)

Sets a login&#39;s brand to the default brand specified

Sets a login&#39;s brand to the default brand specified

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    SetLoginBrandDefaultRequest setLoginBrandDefaultRequest = new SetLoginBrandDefaultRequest(); // SetLoginBrandDefaultRequest | Sets a login's brand to the default brand specified
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.setLoginBrandDefault(setLoginBrandDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#setLoginBrandDefault");
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
| **setLoginBrandDefaultRequest** | [**SetLoginBrandDefaultRequest**](SetLoginBrandDefaultRequest.md)| Sets a login&#39;s brand to the default brand specified | |

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

<a id="setLoginUserMapping"></a>
# **setLoginUserMapping**
> AUTHChangePasswordDefaultResponse setLoginUserMapping(setLoginUserMappingRequest)

Sets the login\\user mapping

Sets the login\\user mapping

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    BrandApi apiInstance = new BrandApi(defaultClient);
    SetLoginUserMappingRequest setLoginUserMappingRequest = new SetLoginUserMappingRequest(); // SetLoginUserMappingRequest | Sets the login\\user mapping
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.setLoginUserMapping(setLoginUserMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#setLoginUserMapping");
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
| **setLoginUserMappingRequest** | [**SetLoginUserMappingRequest**](SetLoginUserMappingRequest.md)| Sets the login\\user mapping | |

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

