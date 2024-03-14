# UserSettingsApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserSetting**](UserSettingsApi.md#getUserSetting) | **POST** /GetUserSetting | Returns back a value for a user setting |
| [**setUserSetting**](UserSettingsApi.md#setUserSetting) | **POST** /SetUserSetting | Sets a user setting to the provided value |


<a id="getUserSetting"></a>
# **getUserSetting**
> GetDataSourceEngineUserNameDefaultResponse getUserSetting(getUserSettingRequest)

Returns back a value for a user setting

Returns back a value for a user setting

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UserSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
    GetUserSettingRequest getUserSettingRequest = new GetUserSettingRequest(); // GetUserSettingRequest | Returns back a value for a user setting
    try {
      GetDataSourceEngineUserNameDefaultResponse result = apiInstance.getUserSetting(getUserSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSettingsApi#getUserSetting");
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
| **getUserSettingRequest** | [**GetUserSettingRequest**](GetUserSettingRequest.md)| Returns back a value for a user setting | |

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

<a id="setUserSetting"></a>
# **setUserSetting**
> AUTHChangePasswordDefaultResponse setUserSetting(setUserSettingRequest)

Sets a user setting to the provided value

Sets a user setting to the provided value

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.UserSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    UserSettingsApi apiInstance = new UserSettingsApi(defaultClient);
    SetUserSettingRequest setUserSettingRequest = new SetUserSettingRequest(); // SetUserSettingRequest | Sets a user setting to the provided value
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.setUserSetting(setUserSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSettingsApi#setUserSetting");
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
| **setUserSettingRequest** | [**SetUserSettingRequest**](SetUserSettingRequest.md)| Sets a user setting to the provided value | |

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

