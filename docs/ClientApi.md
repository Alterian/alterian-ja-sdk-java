# ClientApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClient**](ClientApi.md#createClient) | **POST** /CreateClient | Create a new @see(ALClient), with it&#39;s own unique database and set of users. |
| [**createClientEx**](ClientApi.md#createClientEx) | **POST** /CreateClientEx | Create a new @see(ALClient), with it&#39;s own unique database and set of users.             Additionally creates an example user / group with relevant permissions to design campaign factory campaigns. |
| [**deleteClient**](ClientApi.md#deleteClient) | **POST** /DeleteClient | Deletes a @see(ALClient).  Removes the client&#39;s database.  Note that the client must be disabled with @see(DisableClient) before calling this. |
| [**disableClient**](ClientApi.md#disableClient) | **POST** /DisableClient | Mark an individual @see(ALClient) as disabled. Disabled clients will not allow users to log on, documents will not be processed etc. |
| [**enableClient**](ClientApi.md#enableClient) | **POST** /EnableClient | Mark an individual @see(ALClient) as enabled. Enabled clients allow users to log on, documents will be processed etc. |
| [**getClientSettings**](ClientApi.md#getClientSettings) | **POST** /GetClientSettings | Returns the settings for the specified Client |
| [**getClients**](ClientApi.md#getClients) | **POST** /GetClients | Return a list of clients that match the supplied (optional) filters. |
| [**getCurrentClient**](ClientApi.md#getCurrentClient) | **POST** /GetCurrentClient | Returns back the client for the current token |
| [**updateClientSettings**](ClientApi.md#updateClientSettings) | **POST** /UpdateClientSettings | Updates the settings for the specified client. Warning: This API deletes any settings not included in the update request |


<a id="createClient"></a>
# **createClient**
> CreateClientDefaultResponse createClient(createClientRequest)

Create a new @see(ALClient), with it&#39;s own unique database and set of users.

Create a new @see(ALClient), with it&#39;s own unique database and set of users.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    CreateClientRequest createClientRequest = new CreateClientRequest(); // CreateClientRequest | Create a new @see(ALClient), with it's own unique database and set of users.
    try {
      CreateClientDefaultResponse result = apiInstance.createClient(createClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#createClient");
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
| **createClientRequest** | [**CreateClientRequest**](CreateClientRequest.md)| Create a new @see(ALClient), with it&#39;s own unique database and set of users. | |

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

<a id="createClientEx"></a>
# **createClientEx**
> CreateClientDefaultResponse createClientEx(createClientRequest)

Create a new @see(ALClient), with it&#39;s own unique database and set of users.             Additionally creates an example user / group with relevant permissions to design campaign factory campaigns.

Create a new @see(ALClient), with it&#39;s own unique database and set of users.             Additionally creates an example user / group with relevant permissions to design campaign factory campaigns.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    CreateClientRequest createClientRequest = new CreateClientRequest(); // CreateClientRequest | Create a new @see(ALClient), with it's own unique database and set of users.             Additionally creates an example user / group with relevant permissions to design campaign factory campaigns.
    try {
      CreateClientDefaultResponse result = apiInstance.createClientEx(createClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#createClientEx");
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
| **createClientRequest** | [**CreateClientRequest**](CreateClientRequest.md)| Create a new @see(ALClient), with it&#39;s own unique database and set of users.             Additionally creates an example user / group with relevant permissions to design campaign factory campaigns. | |

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

<a id="deleteClient"></a>
# **deleteClient**
> AUTHChangePasswordDefaultResponse deleteClient(deleteClientRequest)

Deletes a @see(ALClient).  Removes the client&#39;s database.  Note that the client must be disabled with @see(DisableClient) before calling this.

Deletes a @see(ALClient).  Removes the client&#39;s database.  Note that the client must be disabled with @see(DisableClient) before calling this.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    DeleteClientRequest deleteClientRequest = new DeleteClientRequest(); // DeleteClientRequest | Deletes a @see(ALClient).  Removes the client's database.  Note that the client must be disabled with @see(DisableClient) before calling this.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteClient(deleteClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#deleteClient");
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
| **deleteClientRequest** | [**DeleteClientRequest**](DeleteClientRequest.md)| Deletes a @see(ALClient).  Removes the client&#39;s database.  Note that the client must be disabled with @see(DisableClient) before calling this. | |

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

<a id="disableClient"></a>
# **disableClient**
> AUTHChangePasswordDefaultResponse disableClient(disableClientRequest)

Mark an individual @see(ALClient) as disabled. Disabled clients will not allow users to log on, documents will not be processed etc.

Mark an individual @see(ALClient) as disabled. Disabled clients will not allow users to log on, documents will not be processed etc.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    DisableClientRequest disableClientRequest = new DisableClientRequest(); // DisableClientRequest | Mark an individual @see(ALClient) as disabled. Disabled clients will not allow users to log on, documents will not be processed etc.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.disableClient(disableClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#disableClient");
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
| **disableClientRequest** | [**DisableClientRequest**](DisableClientRequest.md)| Mark an individual @see(ALClient) as disabled. Disabled clients will not allow users to log on, documents will not be processed etc. | |

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

<a id="enableClient"></a>
# **enableClient**
> AUTHChangePasswordDefaultResponse enableClient(disableClientRequest)

Mark an individual @see(ALClient) as enabled. Enabled clients allow users to log on, documents will be processed etc.

Mark an individual @see(ALClient) as enabled. Enabled clients allow users to log on, documents will be processed etc.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    DisableClientRequest disableClientRequest = new DisableClientRequest(); // DisableClientRequest | Mark an individual @see(ALClient) as enabled. Enabled clients allow users to log on, documents will be processed etc.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.enableClient(disableClientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#enableClient");
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
| **disableClientRequest** | [**DisableClientRequest**](DisableClientRequest.md)| Mark an individual @see(ALClient) as enabled. Enabled clients allow users to log on, documents will be processed etc. | |

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

<a id="getClientSettings"></a>
# **getClientSettings**
> GetClientSettingsDefaultResponse getClientSettings(getClientSettingsRequest)

Returns the settings for the specified Client

Returns the settings for the specified Client

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    GetClientSettingsRequest getClientSettingsRequest = new GetClientSettingsRequest(); // GetClientSettingsRequest | Returns the settings for the specified Client
    try {
      GetClientSettingsDefaultResponse result = apiInstance.getClientSettings(getClientSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getClientSettings");
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
| **getClientSettingsRequest** | [**GetClientSettingsRequest**](GetClientSettingsRequest.md)| Returns the settings for the specified Client | |

### Return type

[**GetClientSettingsDefaultResponse**](GetClientSettingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getClients"></a>
# **getClients**
> GetBrandsDefaultResponse getClients(getClientsRequest)

Return a list of clients that match the supplied (optional) filters.

Return a list of clients that match the supplied (optional) filters.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    GetClientsRequest getClientsRequest = new GetClientsRequest(); // GetClientsRequest | Return a list of clients that match the supplied (optional) filters.
    try {
      GetBrandsDefaultResponse result = apiInstance.getClients(getClientsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getClients");
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
| **getClientsRequest** | [**GetClientsRequest**](GetClientsRequest.md)| Return a list of clients that match the supplied (optional) filters. | |

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

<a id="getCurrentClient"></a>
# **getCurrentClient**
> GetCurrentClientDefaultResponse getCurrentClient()

Returns back the client for the current token

Returns back the client for the current token

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    try {
      GetCurrentClientDefaultResponse result = apiInstance.getCurrentClient();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getCurrentClient");
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

[**GetCurrentClientDefaultResponse**](GetCurrentClientDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateClientSettings"></a>
# **updateClientSettings**
> AUTHChangePasswordDefaultResponse updateClientSettings(updateClientSettingsRequest)

Updates the settings for the specified client. Warning: This API deletes any settings not included in the update request

Updates the settings for the specified client. Warning: This API deletes any settings not included in the update request

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    UpdateClientSettingsRequest updateClientSettingsRequest = new UpdateClientSettingsRequest(); // UpdateClientSettingsRequest | Updates the settings for the specified client. Warning: This API deletes any settings not included in the update request
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateClientSettings(updateClientSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#updateClientSettings");
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
| **updateClientSettingsRequest** | [**UpdateClientSettingsRequest**](UpdateClientSettingsRequest.md)| Updates the settings for the specified client. Warning: This API deletes any settings not included in the update request | |

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

