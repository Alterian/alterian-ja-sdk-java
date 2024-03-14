# ProcessesApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProcessApplications**](ProcessesApi.md#getProcessApplications) | **POST** /GetProcessApplications | List all the applications that operate together to form the complete system. This list cannot be modified |
| [**getProcessEntries**](ProcessesApi.md#getProcessEntries) | **POST** /GetProcessEntries | Get the list of where each @see(ALProcessApplication) is currently located and it&#39;s last activity |
| [**updateProcessEntry**](ProcessesApi.md#updateProcessEntry) | **POST** /UpdateProcessEntry | Modify the location or settings of a particular instance of a @see(ALProcessApplication) |


<a id="getProcessApplications"></a>
# **getProcessApplications**
> GetProcessApplicationsDefaultResponse getProcessApplications(getClientSetsRequest)

List all the applications that operate together to form the complete system. This list cannot be modified

List all the applications that operate together to form the complete system. This list cannot be modified

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ProcessesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ProcessesApi apiInstance = new ProcessesApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | List all the applications that operate together to form the complete system. This list cannot be modified
    try {
      GetProcessApplicationsDefaultResponse result = apiInstance.getProcessApplications(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesApi#getProcessApplications");
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
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| List all the applications that operate together to form the complete system. This list cannot be modified | |

### Return type

[**GetProcessApplicationsDefaultResponse**](GetProcessApplicationsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getProcessEntries"></a>
# **getProcessEntries**
> GetProcessEntriesDefaultResponse getProcessEntries(getProcessEntriesRequest)

Get the list of where each @see(ALProcessApplication) is currently located and it&#39;s last activity

Get the list of where each @see(ALProcessApplication) is currently located and it&#39;s last activity

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ProcessesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ProcessesApi apiInstance = new ProcessesApi(defaultClient);
    GetProcessEntriesRequest getProcessEntriesRequest = new GetProcessEntriesRequest(); // GetProcessEntriesRequest | Get the list of where each @see(ALProcessApplication) is currently located and it's last activity
    try {
      GetProcessEntriesDefaultResponse result = apiInstance.getProcessEntries(getProcessEntriesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesApi#getProcessEntries");
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
| **getProcessEntriesRequest** | [**GetProcessEntriesRequest**](GetProcessEntriesRequest.md)| Get the list of where each @see(ALProcessApplication) is currently located and it&#39;s last activity | |

### Return type

[**GetProcessEntriesDefaultResponse**](GetProcessEntriesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateProcessEntry"></a>
# **updateProcessEntry**
> AUTHChangePasswordDefaultResponse updateProcessEntry(updateProcessEntryRequest)

Modify the location or settings of a particular instance of a @see(ALProcessApplication)

Modify the location or settings of a particular instance of a @see(ALProcessApplication)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ProcessesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ProcessesApi apiInstance = new ProcessesApi(defaultClient);
    UpdateProcessEntryRequest updateProcessEntryRequest = new UpdateProcessEntryRequest(); // UpdateProcessEntryRequest | Modify the location or settings of a particular instance of a @see(ALProcessApplication)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateProcessEntry(updateProcessEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesApi#updateProcessEntry");
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
| **updateProcessEntryRequest** | [**UpdateProcessEntryRequest**](UpdateProcessEntryRequest.md)| Modify the location or settings of a particular instance of a @see(ALProcessApplication) | |

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

