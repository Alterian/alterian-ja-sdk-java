# TemplateBuilderApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebSpoon**](TemplateBuilderApi.md#createWebSpoon) | **POST** /CreateWebSpoon | Creates an instance of Template Builder which will be unique to this system, the brand and user which calls the method. |
| [**deleteWebSpoon**](TemplateBuilderApi.md#deleteWebSpoon) | **POST** /DeleteWebSpoon | Removes a Template Builder instance |
| [**getWebSpoonAvailable**](TemplateBuilderApi.md#getWebSpoonAvailable) | **POST** /GetWebSpoonAvailable | Check to make sure Template Builder is available |
| [**getWebSpoonLoginUrl**](TemplateBuilderApi.md#getWebSpoonLoginUrl) | **POST** /GetWebSpoonLoginUrl | Get a URL valid for redirecting to the Template Builder instance; note, this will return nothing if the operational status is not \&quot;UP\&quot; |
| [**listWebSpoon**](TemplateBuilderApi.md#listWebSpoon) | **POST** /ListWebSpoon | Returns back the Template Builder instances which have been created for this system, brand and user (unique to that combination) |


<a id="createWebSpoon"></a>
# **createWebSpoon**
> CreateWebSpoonDefaultResponse createWebSpoon(createWebSpoonRequest)

Creates an instance of Template Builder which will be unique to this system, the brand and user which calls the method.

Creates an instance of Template Builder which will be unique to this system, the brand and user which calls the method.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TemplateBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TemplateBuilderApi apiInstance = new TemplateBuilderApi(defaultClient);
    CreateWebSpoonRequest createWebSpoonRequest = new CreateWebSpoonRequest(); // CreateWebSpoonRequest | Creates an instance of Template Builder which will be unique to this system, the brand and user which calls the method.
    try {
      CreateWebSpoonDefaultResponse result = apiInstance.createWebSpoon(createWebSpoonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateBuilderApi#createWebSpoon");
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
| **createWebSpoonRequest** | [**CreateWebSpoonRequest**](CreateWebSpoonRequest.md)| Creates an instance of Template Builder which will be unique to this system, the brand and user which calls the method. | |

### Return type

[**CreateWebSpoonDefaultResponse**](CreateWebSpoonDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteWebSpoon"></a>
# **deleteWebSpoon**
> AUTHChangePasswordDefaultResponse deleteWebSpoon(deleteWebSpoonRequest)

Removes a Template Builder instance

Removes a Template Builder instance

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TemplateBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TemplateBuilderApi apiInstance = new TemplateBuilderApi(defaultClient);
    DeleteWebSpoonRequest deleteWebSpoonRequest = new DeleteWebSpoonRequest(); // DeleteWebSpoonRequest | Removes a Template Builder instance
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteWebSpoon(deleteWebSpoonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateBuilderApi#deleteWebSpoon");
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
| **deleteWebSpoonRequest** | [**DeleteWebSpoonRequest**](DeleteWebSpoonRequest.md)| Removes a Template Builder instance | |

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

<a id="getWebSpoonAvailable"></a>
# **getWebSpoonAvailable**
> AUTHChangePasswordDefaultResponse getWebSpoonAvailable()

Check to make sure Template Builder is available

Check to make sure Template Builder is available

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TemplateBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TemplateBuilderApi apiInstance = new TemplateBuilderApi(defaultClient);
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.getWebSpoonAvailable();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateBuilderApi#getWebSpoonAvailable");
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

[**AUTHChangePasswordDefaultResponse**](AUTHChangePasswordDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getWebSpoonLoginUrl"></a>
# **getWebSpoonLoginUrl**
> GetDataSourceEngineUserNameDefaultResponse getWebSpoonLoginUrl(getWebSpoonLoginUrlRequest)

Get a URL valid for redirecting to the Template Builder instance; note, this will return nothing if the operational status is not \&quot;UP\&quot;

Get a URL valid for redirecting to the Template Builder instance; note, this will return nothing if the operational status is not \&quot;UP\&quot;

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TemplateBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TemplateBuilderApi apiInstance = new TemplateBuilderApi(defaultClient);
    GetWebSpoonLoginUrlRequest getWebSpoonLoginUrlRequest = new GetWebSpoonLoginUrlRequest(); // GetWebSpoonLoginUrlRequest | Get a URL valid for redirecting to the Template Builder instance; note, this will return nothing if the operational status is not \"UP\"
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.getWebSpoonLoginUrl(getWebSpoonLoginUrlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateBuilderApi#getWebSpoonLoginUrl");
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
| **getWebSpoonLoginUrlRequest** | [**GetWebSpoonLoginUrlRequest**](GetWebSpoonLoginUrlRequest.md)| Get a URL valid for redirecting to the Template Builder instance; note, this will return nothing if the operational status is not \&quot;UP\&quot; | |

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

<a id="listWebSpoon"></a>
# **listWebSpoon**
> ListWebSpoonDefaultResponse listWebSpoon(listWebSpoonRequest)

Returns back the Template Builder instances which have been created for this system, brand and user (unique to that combination)

Returns back the Template Builder instances which have been created for this system, brand and user (unique to that combination)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.TemplateBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    TemplateBuilderApi apiInstance = new TemplateBuilderApi(defaultClient);
    ListWebSpoonRequest listWebSpoonRequest = new ListWebSpoonRequest(); // ListWebSpoonRequest | Returns back the Template Builder instances which have been created for this system, brand and user (unique to that combination)
    try {
      ListWebSpoonDefaultResponse result = apiInstance.listWebSpoon(listWebSpoonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateBuilderApi#listWebSpoon");
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
| **listWebSpoonRequest** | [**ListWebSpoonRequest**](ListWebSpoonRequest.md)| Returns back the Template Builder instances which have been created for this system, brand and user (unique to that combination) | |

### Return type

[**ListWebSpoonDefaultResponse**](ListWebSpoonDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

