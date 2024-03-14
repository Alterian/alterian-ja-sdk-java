# LogApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadAlerts**](LogApi.md#downloadAlerts) | **GET** /DownloadAlerts | Returns back an excel file containing the alert log entries for a particular client |


<a id="downloadAlerts"></a>
# **downloadAlerts**
> File downloadAlerts(clientId, from, sortDesc, sortProperty, to)

Returns back an excel file containing the alert log entries for a particular client

Returns back an excel file containing the alert log entries for a particular client

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.LogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    LogApi apiInstance = new LogApi(defaultClient);
    Integer clientId = 56; // Integer | 
    Integer from = 56; // Integer | 
    Boolean sortDesc = true; // Boolean | 
    String sortProperty = "sortProperty_example"; // String | 
    Integer to = 56; // Integer | 
    try {
      File result = apiInstance.downloadAlerts(clientId, from, sortDesc, sortProperty, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#downloadAlerts");
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
| **clientId** | **Integer**|  | [optional] |
| **from** | **Integer**|  | [optional] |
| **sortDesc** | **Boolean**|  | [optional] |
| **sortProperty** | **String**|  | [optional] |
| **to** | **Integer**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

