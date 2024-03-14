# SystemApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSystemIdentifier**](SystemApi.md#getSystemIdentifier) | **POST** /GetSystemIdentifier | Returns back the system identifier for this CM system |
| [**getSystemSettings**](SystemApi.md#getSystemSettings) | **POST** /GetSystemSettings | Returns the system settings that are common to all clients |
| [**updateSystemSetting**](SystemApi.md#updateSystemSetting) | **POST** /UpdateSystemSetting | Updates one of the system settings (those that are common to all clients) |


<a id="getSystemIdentifier"></a>
# **getSystemIdentifier**
> GetDataSourceEngineUserNameDefaultResponse getSystemIdentifier()

Returns back the system identifier for this CM system

Returns back the system identifier for this CM system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.getSystemIdentifier();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getSystemIdentifier");
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

<a id="getSystemSettings"></a>
# **getSystemSettings**
> GetClientSettingsDefaultResponse getSystemSettings()

Returns the system settings that are common to all clients

Returns the system settings that are common to all clients

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      GetClientSettingsDefaultResponse result = apiInstance.getSystemSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getSystemSettings");
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

[**GetClientSettingsDefaultResponse**](GetClientSettingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateSystemSetting"></a>
# **updateSystemSetting**
> AUTHChangePasswordDefaultResponse updateSystemSetting(updateSystemSettingRequest)

Updates one of the system settings (those that are common to all clients)

Updates one of the system settings (those that are common to all clients)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    SystemApi apiInstance = new SystemApi(defaultClient);
    UpdateSystemSettingRequest updateSystemSettingRequest = new UpdateSystemSettingRequest(); // UpdateSystemSettingRequest | Updates one of the system settings (those that are common to all clients)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateSystemSetting(updateSystemSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#updateSystemSetting");
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
| **updateSystemSettingRequest** | [**UpdateSystemSettingRequest**](UpdateSystemSettingRequest.md)| Updates one of the system settings (those that are common to all clients) | |

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

