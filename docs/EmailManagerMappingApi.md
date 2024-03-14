# EmailManagerMappingApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEMMapping**](EmailManagerMappingApi.md#createEMMapping) | **POST** /CreateEMMapping | Added a new @see(EMUploadMapping) into the system, returning back the ID of the new mapping.  Note that @see(EMMapping)s must be uniquely named. |
| [**createEMSession**](EmailManagerMappingApi.md#createEMSession) | **POST** /CreateEMSession | Connects to a mapping&#39;s EM system and provides back the application details [including token and other settings] |
| [**deleteEMMapping**](EmailManagerMappingApi.md#deleteEMMapping) | **POST** /DeleteEMMapping | Deletes an @see(EMUploadMapping) from the system.  If a mapping which is currently in use is deleted, campaigns which rely upon it will cease to function. |
| [**getEMDownloadMappings**](EmailManagerMappingApi.md#getEMDownloadMappings) | **POST** /GetEMDownloadMappings | Return back a list of the @see(EMDownloadMapping)s which the token can view. |
| [**getEMMapping**](EmailManagerMappingApi.md#getEMMapping) | **POST** /GetEMMapping | Returns back a single @see(EMUploadMapping) by its ID. |
| [**getEMMappings**](EmailManagerMappingApi.md#getEMMappings) | **POST** /GetEMMappings | Return back a list of the @see(EMUploadMapping)s which the token can view. |
| [**moveEMMapping**](EmailManagerMappingApi.md#moveEMMapping) | **POST** /MoveEMMapping | Provides a way to easily move an @see(EMUploadMapping) from one folder to another.  Note that @see(EMMapping)s must be uniquely named within a folder. |
| [**renameEMMapping**](EmailManagerMappingApi.md#renameEMMapping) | **POST** /RenameEMMapping | Provides a way to easily rename an @see(EMUploadMapping).  Note that @see(EMMapping)s must be uniquely named. |
| [**updateEMMapping**](EmailManagerMappingApi.md#updateEMMapping) | **POST** /UpdateEMMapping | Updates an @see(EMUploadMapping) so you can change the name, folder, etc.  Note that @see(EMMapping)s must be uniquely named. |


<a id="createEMMapping"></a>
# **createEMMapping**
> CreateClientDefaultResponse createEMMapping(createEMMappingRequest)

Added a new @see(EMUploadMapping) into the system, returning back the ID of the new mapping.  Note that @see(EMMapping)s must be uniquely named.

Added a new @see(EMUploadMapping) into the system, returning back the ID of the new mapping.  Note that @see(EMMapping)s must be uniquely named.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    CreateEMMappingRequest createEMMappingRequest = new CreateEMMappingRequest(); // CreateEMMappingRequest | Added a new @see(EMUploadMapping) into the system, returning back the ID of the new mapping.  Note that @see(EMMapping)s must be uniquely named.
    try {
      CreateClientDefaultResponse result = apiInstance.createEMMapping(createEMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#createEMMapping");
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
| **createEMMappingRequest** | [**CreateEMMappingRequest**](CreateEMMappingRequest.md)| Added a new @see(EMUploadMapping) into the system, returning back the ID of the new mapping.  Note that @see(EMMapping)s must be uniquely named. | |

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

<a id="createEMSession"></a>
# **createEMSession**
> CreateEMSessionDefaultResponse createEMSession(createEMSessionRequest)

Connects to a mapping&#39;s EM system and provides back the application details [including token and other settings]

Connects to a mapping&#39;s EM system and provides back the application details [including token and other settings]

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    CreateEMSessionRequest createEMSessionRequest = new CreateEMSessionRequest(); // CreateEMSessionRequest | Connects to a mapping's EM system and provides back the application details [including token and other settings]
    try {
      CreateEMSessionDefaultResponse result = apiInstance.createEMSession(createEMSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#createEMSession");
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
| **createEMSessionRequest** | [**CreateEMSessionRequest**](CreateEMSessionRequest.md)| Connects to a mapping&#39;s EM system and provides back the application details [including token and other settings] | |

### Return type

[**CreateEMSessionDefaultResponse**](CreateEMSessionDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deleteEMMapping"></a>
# **deleteEMMapping**
> AUTHChangePasswordDefaultResponse deleteEMMapping(deleteEMMappingRequest)

Deletes an @see(EMUploadMapping) from the system.  If a mapping which is currently in use is deleted, campaigns which rely upon it will cease to function.

Deletes an @see(EMUploadMapping) from the system.  If a mapping which is currently in use is deleted, campaigns which rely upon it will cease to function.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    DeleteEMMappingRequest deleteEMMappingRequest = new DeleteEMMappingRequest(); // DeleteEMMappingRequest | Deletes an @see(EMUploadMapping) from the system.  If a mapping which is currently in use is deleted, campaigns which rely upon it will cease to function.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteEMMapping(deleteEMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#deleteEMMapping");
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
| **deleteEMMappingRequest** | [**DeleteEMMappingRequest**](DeleteEMMappingRequest.md)| Deletes an @see(EMUploadMapping) from the system.  If a mapping which is currently in use is deleted, campaigns which rely upon it will cease to function. | |

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

<a id="getEMDownloadMappings"></a>
# **getEMDownloadMappings**
> GetEMDownloadMappingsDefaultResponse getEMDownloadMappings(getClientSetsRequest)

Return back a list of the @see(EMDownloadMapping)s which the token can view.

Return back a list of the @see(EMDownloadMapping)s which the token can view.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Return back a list of the @see(EMDownloadMapping)s which the token can view.
    try {
      GetEMDownloadMappingsDefaultResponse result = apiInstance.getEMDownloadMappings(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#getEMDownloadMappings");
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
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Return back a list of the @see(EMDownloadMapping)s which the token can view. | |

### Return type

[**GetEMDownloadMappingsDefaultResponse**](GetEMDownloadMappingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEMMapping"></a>
# **getEMMapping**
> GetEMMappingDefaultResponse getEMMapping(getEMMappingRequest)

Returns back a single @see(EMUploadMapping) by its ID.

Returns back a single @see(EMUploadMapping) by its ID.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    GetEMMappingRequest getEMMappingRequest = new GetEMMappingRequest(); // GetEMMappingRequest | Returns back a single @see(EMUploadMapping) by its ID.
    try {
      GetEMMappingDefaultResponse result = apiInstance.getEMMapping(getEMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#getEMMapping");
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
| **getEMMappingRequest** | [**GetEMMappingRequest**](GetEMMappingRequest.md)| Returns back a single @see(EMUploadMapping) by its ID. | |

### Return type

[**GetEMMappingDefaultResponse**](GetEMMappingDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEMMappings"></a>
# **getEMMappings**
> GetEMMappingsDefaultResponse getEMMappings(getEMMappingsRequest)

Return back a list of the @see(EMUploadMapping)s which the token can view.

Return back a list of the @see(EMUploadMapping)s which the token can view.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    GetEMMappingsRequest getEMMappingsRequest = new GetEMMappingsRequest(); // GetEMMappingsRequest | Return back a list of the @see(EMUploadMapping)s which the token can view.
    try {
      GetEMMappingsDefaultResponse result = apiInstance.getEMMappings(getEMMappingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#getEMMappings");
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
| **getEMMappingsRequest** | [**GetEMMappingsRequest**](GetEMMappingsRequest.md)| Return back a list of the @see(EMUploadMapping)s which the token can view. | |

### Return type

[**GetEMMappingsDefaultResponse**](GetEMMappingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="moveEMMapping"></a>
# **moveEMMapping**
> AUTHChangePasswordDefaultResponse moveEMMapping(moveEMMappingRequest)

Provides a way to easily move an @see(EMUploadMapping) from one folder to another.  Note that @see(EMMapping)s must be uniquely named within a folder.

Provides a way to easily move an @see(EMUploadMapping) from one folder to another.  Note that @see(EMMapping)s must be uniquely named within a folder.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    MoveEMMappingRequest moveEMMappingRequest = new MoveEMMappingRequest(); // MoveEMMappingRequest | Provides a way to easily move an @see(EMUploadMapping) from one folder to another.  Note that @see(EMMapping)s must be uniquely named within a folder.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.moveEMMapping(moveEMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#moveEMMapping");
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
| **moveEMMappingRequest** | [**MoveEMMappingRequest**](MoveEMMappingRequest.md)| Provides a way to easily move an @see(EMUploadMapping) from one folder to another.  Note that @see(EMMapping)s must be uniquely named within a folder. | |

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

<a id="renameEMMapping"></a>
# **renameEMMapping**
> AUTHChangePasswordDefaultResponse renameEMMapping(renameEMMappingRequest)

Provides a way to easily rename an @see(EMUploadMapping).  Note that @see(EMMapping)s must be uniquely named.

Provides a way to easily rename an @see(EMUploadMapping).  Note that @see(EMMapping)s must be uniquely named.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    RenameEMMappingRequest renameEMMappingRequest = new RenameEMMappingRequest(); // RenameEMMappingRequest | Provides a way to easily rename an @see(EMUploadMapping).  Note that @see(EMMapping)s must be uniquely named.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.renameEMMapping(renameEMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#renameEMMapping");
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
| **renameEMMappingRequest** | [**RenameEMMappingRequest**](RenameEMMappingRequest.md)| Provides a way to easily rename an @see(EMUploadMapping).  Note that @see(EMMapping)s must be uniquely named. | |

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

<a id="updateEMMapping"></a>
# **updateEMMapping**
> AUTHChangePasswordDefaultResponse updateEMMapping(createEMMappingRequest)

Updates an @see(EMUploadMapping) so you can change the name, folder, etc.  Note that @see(EMMapping)s must be uniquely named.

Updates an @see(EMUploadMapping) so you can change the name, folder, etc.  Note that @see(EMMapping)s must be uniquely named.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EmailManagerMappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EmailManagerMappingApi apiInstance = new EmailManagerMappingApi(defaultClient);
    CreateEMMappingRequest createEMMappingRequest = new CreateEMMappingRequest(); // CreateEMMappingRequest | Updates an @see(EMUploadMapping) so you can change the name, folder, etc.  Note that @see(EMMapping)s must be uniquely named.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateEMMapping(createEMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailManagerMappingApi#updateEMMapping");
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
| **createEMMappingRequest** | [**CreateEMMappingRequest**](CreateEMMappingRequest.md)| Updates an @see(EMUploadMapping) so you can change the name, folder, etc.  Note that @see(EMMapping)s must be uniquely named. | |

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

