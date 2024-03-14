# ClientsetApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addClientToClientSet**](ClientsetApi.md#addClientToClientSet) | **POST** /AddClientToClientSet | Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset |
| [**createClientSet**](ClientsetApi.md#createClientSet) | **POST** /CreateClientSet | Create a new @see(ALClientSet) within the system. |
| [**deleteClientSet**](ClientsetApi.md#deleteClientSet) | **POST** /DeleteClientSet | Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion |
| [**getClientSets**](ClientsetApi.md#getClientSets) | **POST** /GetClientSets | List all the clientsets within the system |


<a id="addClientToClientSet"></a>
# **addClientToClientSet**
> AUTHChangePasswordDefaultResponse addClientToClientSet(addClientToClientSetRequest)

Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset

Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientsetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientsetApi apiInstance = new ClientsetApi(defaultClient);
    AddClientToClientSetRequest addClientToClientSetRequest = new AddClientToClientSetRequest(); // AddClientToClientSetRequest | Move a @see(ALClient) from it's current @see(ALClientSet) to another clientset
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.addClientToClientSet(addClientToClientSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsetApi#addClientToClientSet");
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
| **addClientToClientSetRequest** | [**AddClientToClientSetRequest**](AddClientToClientSetRequest.md)| Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset | |

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

<a id="createClientSet"></a>
# **createClientSet**
> CreateClientDefaultResponse createClientSet(createClientSetRequest)

Create a new @see(ALClientSet) within the system.

Create a new @see(ALClientSet) within the system.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientsetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientsetApi apiInstance = new ClientsetApi(defaultClient);
    CreateClientSetRequest createClientSetRequest = new CreateClientSetRequest(); // CreateClientSetRequest | Create a new @see(ALClientSet) within the system.
    try {
      CreateClientDefaultResponse result = apiInstance.createClientSet(createClientSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsetApi#createClientSet");
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
| **createClientSetRequest** | [**CreateClientSetRequest**](CreateClientSetRequest.md)| Create a new @see(ALClientSet) within the system. | |

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

<a id="deleteClientSet"></a>
# **deleteClientSet**
> AUTHChangePasswordDefaultResponse deleteClientSet(deleteClientSetRequest)

Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion

Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientsetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientsetApi apiInstance = new ClientsetApi(defaultClient);
    DeleteClientSetRequest deleteClientSetRequest = new DeleteClientSetRequest(); // DeleteClientSetRequest | Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteClientSet(deleteClientSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsetApi#deleteClientSet");
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
| **deleteClientSetRequest** | [**DeleteClientSetRequest**](DeleteClientSetRequest.md)| Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion | |

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

<a id="getClientSets"></a>
# **getClientSets**
> GetClientSetsDefaultResponse getClientSets(getClientSetsRequest)

List all the clientsets within the system

List all the clientsets within the system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientsetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientsetApi apiInstance = new ClientsetApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | List all the clientsets within the system
    try {
      GetClientSetsDefaultResponse result = apiInstance.getClientSets(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsetApi#getClientSets");
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
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| List all the clientsets within the system | |

### Return type

[**GetClientSetsDefaultResponse**](GetClientSetsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

