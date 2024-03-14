# PersonaApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPersona**](PersonaApi.md#createPersona) | **POST** /CreatePersona | Creates a @see(Persona) |
| [**deletePersona**](PersonaApi.md#deletePersona) | **POST** /DeletePersona | Deletes a persona from the system |
| [**getPersona**](PersonaApi.md#getPersona) | **POST** /GetPersona | Returns back a single @see(Persona) |
| [**getPersonas**](PersonaApi.md#getPersonas) | **POST** /GetPersonas | Returns back a list of @see(Persona) |
| [**updatePersona**](PersonaApi.md#updatePersona) | **POST** /UpdatePersona | Updates an @see(Persona) |


<a id="createPersona"></a>
# **createPersona**
> CreateClientDefaultResponse createPersona(createPersonaRequest)

Creates a @see(Persona)

Creates a @see(Persona)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PersonaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PersonaApi apiInstance = new PersonaApi(defaultClient);
    CreatePersonaRequest createPersonaRequest = new CreatePersonaRequest(); // CreatePersonaRequest | Creates a @see(Persona)
    try {
      CreateClientDefaultResponse result = apiInstance.createPersona(createPersonaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonaApi#createPersona");
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
| **createPersonaRequest** | [**CreatePersonaRequest**](CreatePersonaRequest.md)| Creates a @see(Persona) | |

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

<a id="deletePersona"></a>
# **deletePersona**
> AUTHChangePasswordDefaultResponse deletePersona(deletePersonaRequest)

Deletes a persona from the system

Deletes a persona from the system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PersonaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PersonaApi apiInstance = new PersonaApi(defaultClient);
    DeletePersonaRequest deletePersonaRequest = new DeletePersonaRequest(); // DeletePersonaRequest | Deletes a persona from the system
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deletePersona(deletePersonaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonaApi#deletePersona");
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
| **deletePersonaRequest** | [**DeletePersonaRequest**](DeletePersonaRequest.md)| Deletes a persona from the system | |

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

<a id="getPersona"></a>
# **getPersona**
> GetPersonaDefaultResponse getPersona(getPersonaRequest)

Returns back a single @see(Persona)

Returns back a single @see(Persona)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PersonaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PersonaApi apiInstance = new PersonaApi(defaultClient);
    GetPersonaRequest getPersonaRequest = new GetPersonaRequest(); // GetPersonaRequest | Returns back a single @see(Persona)
    try {
      GetPersonaDefaultResponse result = apiInstance.getPersona(getPersonaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonaApi#getPersona");
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
| **getPersonaRequest** | [**GetPersonaRequest**](GetPersonaRequest.md)| Returns back a single @see(Persona) | |

### Return type

[**GetPersonaDefaultResponse**](GetPersonaDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getPersonas"></a>
# **getPersonas**
> GetPersonasDefaultResponse getPersonas(getPersonasRequest)

Returns back a list of @see(Persona)

Returns back a list of @see(Persona)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PersonaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PersonaApi apiInstance = new PersonaApi(defaultClient);
    GetPersonasRequest getPersonasRequest = new GetPersonasRequest(); // GetPersonasRequest | Returns back a list of @see(Persona)
    try {
      GetPersonasDefaultResponse result = apiInstance.getPersonas(getPersonasRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonaApi#getPersonas");
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
| **getPersonasRequest** | [**GetPersonasRequest**](GetPersonasRequest.md)| Returns back a list of @see(Persona) | |

### Return type

[**GetPersonasDefaultResponse**](GetPersonasDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updatePersona"></a>
# **updatePersona**
> AUTHChangePasswordDefaultResponse updatePersona(createPersonaRequest)

Updates an @see(Persona)

Updates an @see(Persona)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PersonaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PersonaApi apiInstance = new PersonaApi(defaultClient);
    CreatePersonaRequest createPersonaRequest = new CreatePersonaRequest(); // CreatePersonaRequest | Updates an @see(Persona)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updatePersona(createPersonaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonaApi#updatePersona");
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
| **createPersonaRequest** | [**CreatePersonaRequest**](CreatePersonaRequest.md)| Updates an @see(Persona) | |

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

