# OpportunityMatricesApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBusinessGoal**](OpportunityMatricesApi.md#createBusinessGoal) | **POST** /CreateBusinessGoal | Create a Business Goal |
| [**createInitiative**](OpportunityMatricesApi.md#createInitiative) | **POST** /CreateInitiative | Create a Business Initiative |
| [**createOpportunity**](OpportunityMatricesApi.md#createOpportunity) | **POST** /CreateOpportunity | Create an opportunity |
| [**deleteBusinessGoal**](OpportunityMatricesApi.md#deleteBusinessGoal) | **POST** /DeleteBusinessGoal | Delete a Business Goal |
| [**deleteInitiative**](OpportunityMatricesApi.md#deleteInitiative) | **POST** /DeleteInitiative | Delete a Business Initiative |
| [**deleteOpportunity**](OpportunityMatricesApi.md#deleteOpportunity) | **POST** /DeleteOpportunity | Delete an opportunity |
| [**getBusinessGoals**](OpportunityMatricesApi.md#getBusinessGoals) | **POST** /GetBusinessGoals | Get the list of Business Goal |
| [**getEventStreamInitiatives**](OpportunityMatricesApi.md#getEventStreamInitiatives) | **POST** /GetEventStreamInitiatives | Get initiatives for an event stream |
| [**getInitiatives**](OpportunityMatricesApi.md#getInitiatives) | **POST** /GetInitiatives | Get all current initiatives |
| [**getOpportunities**](OpportunityMatricesApi.md#getOpportunities) | **POST** /GetOpportunities | Get the list of opportunities |
| [**getOpportunityMatrix**](OpportunityMatricesApi.md#getOpportunityMatrix) | **POST** /GetOpportunityMatrix | Gets abbreviated details of all campaigns that are currently plotted on the opportunity matrix |
| [**updateBusinessGoal**](OpportunityMatricesApi.md#updateBusinessGoal) | **POST** /UpdateBusinessGoal | Update a Business Goal |
| [**updateInitiative**](OpportunityMatricesApi.md#updateInitiative) | **POST** /UpdateInitiative | Update a Business Initiative |
| [**updateOpportunity**](OpportunityMatricesApi.md#updateOpportunity) | **POST** /UpdateOpportunity | Update an Opportunity |
| [**updateOpportunityMatrix**](OpportunityMatricesApi.md#updateOpportunityMatrix) | **POST** /UpdateOpportunityMatrix | Store all the details for every campaign that&#39;s now plotted on the opportunity matrix. |


<a id="createBusinessGoal"></a>
# **createBusinessGoal**
> CreateClientDefaultResponse createBusinessGoal(createBusinessGoalRequest)

Create a Business Goal

Create a Business Goal

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    CreateBusinessGoalRequest createBusinessGoalRequest = new CreateBusinessGoalRequest(); // CreateBusinessGoalRequest | Create a Business Goal
    try {
      CreateClientDefaultResponse result = apiInstance.createBusinessGoal(createBusinessGoalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#createBusinessGoal");
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
| **createBusinessGoalRequest** | [**CreateBusinessGoalRequest**](CreateBusinessGoalRequest.md)| Create a Business Goal | |

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

<a id="createInitiative"></a>
# **createInitiative**
> CreateClientDefaultResponse createInitiative(createInitiativeRequest)

Create a Business Initiative

Create a Business Initiative

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    CreateInitiativeRequest createInitiativeRequest = new CreateInitiativeRequest(); // CreateInitiativeRequest | Create a Business Initiative
    try {
      CreateClientDefaultResponse result = apiInstance.createInitiative(createInitiativeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#createInitiative");
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
| **createInitiativeRequest** | [**CreateInitiativeRequest**](CreateInitiativeRequest.md)| Create a Business Initiative | |

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

<a id="createOpportunity"></a>
# **createOpportunity**
> CreateClientDefaultResponse createOpportunity(createOpportunityRequest)

Create an opportunity

Create an opportunity

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    CreateOpportunityRequest createOpportunityRequest = new CreateOpportunityRequest(); // CreateOpportunityRequest | Create an opportunity
    try {
      CreateClientDefaultResponse result = apiInstance.createOpportunity(createOpportunityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#createOpportunity");
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
| **createOpportunityRequest** | [**CreateOpportunityRequest**](CreateOpportunityRequest.md)| Create an opportunity | |

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

<a id="deleteBusinessGoal"></a>
# **deleteBusinessGoal**
> AUTHChangePasswordDefaultResponse deleteBusinessGoal(deleteBusinessGoalRequest)

Delete a Business Goal

Delete a Business Goal

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    DeleteBusinessGoalRequest deleteBusinessGoalRequest = new DeleteBusinessGoalRequest(); // DeleteBusinessGoalRequest | Delete a Business Goal
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteBusinessGoal(deleteBusinessGoalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#deleteBusinessGoal");
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
| **deleteBusinessGoalRequest** | [**DeleteBusinessGoalRequest**](DeleteBusinessGoalRequest.md)| Delete a Business Goal | |

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

<a id="deleteInitiative"></a>
# **deleteInitiative**
> AUTHChangePasswordDefaultResponse deleteInitiative(deleteInitiativeRequest)

Delete a Business Initiative

Delete a Business Initiative

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    DeleteInitiativeRequest deleteInitiativeRequest = new DeleteInitiativeRequest(); // DeleteInitiativeRequest | Delete a Business Initiative
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteInitiative(deleteInitiativeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#deleteInitiative");
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
| **deleteInitiativeRequest** | [**DeleteInitiativeRequest**](DeleteInitiativeRequest.md)| Delete a Business Initiative | |

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

<a id="deleteOpportunity"></a>
# **deleteOpportunity**
> AUTHChangePasswordDefaultResponse deleteOpportunity(deleteOpportunityRequest)

Delete an opportunity

Delete an opportunity

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    DeleteOpportunityRequest deleteOpportunityRequest = new DeleteOpportunityRequest(); // DeleteOpportunityRequest | Delete an opportunity
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteOpportunity(deleteOpportunityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#deleteOpportunity");
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
| **deleteOpportunityRequest** | [**DeleteOpportunityRequest**](DeleteOpportunityRequest.md)| Delete an opportunity | |

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

<a id="getBusinessGoals"></a>
# **getBusinessGoals**
> GetBusinessGoalsDefaultResponse getBusinessGoals()

Get the list of Business Goal

Get the list of Business Goal

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    try {
      GetBusinessGoalsDefaultResponse result = apiInstance.getBusinessGoals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#getBusinessGoals");
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

[**GetBusinessGoalsDefaultResponse**](GetBusinessGoalsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreamInitiatives"></a>
# **getEventStreamInitiatives**
> GetEventStreamInitiativesDefaultResponse getEventStreamInitiatives(getEventStreamInitiativesRequest)

Get initiatives for an event stream

Get initiatives for an event stream

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    GetEventStreamInitiativesRequest getEventStreamInitiativesRequest = new GetEventStreamInitiativesRequest(); // GetEventStreamInitiativesRequest | Get initiatives for an event stream
    try {
      GetEventStreamInitiativesDefaultResponse result = apiInstance.getEventStreamInitiatives(getEventStreamInitiativesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#getEventStreamInitiatives");
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
| **getEventStreamInitiativesRequest** | [**GetEventStreamInitiativesRequest**](GetEventStreamInitiativesRequest.md)| Get initiatives for an event stream | |

### Return type

[**GetEventStreamInitiativesDefaultResponse**](GetEventStreamInitiativesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getInitiatives"></a>
# **getInitiatives**
> GetEventStreamInitiativesDefaultResponse getInitiatives()

Get all current initiatives

Get all current initiatives

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    try {
      GetEventStreamInitiativesDefaultResponse result = apiInstance.getInitiatives();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#getInitiatives");
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

[**GetEventStreamInitiativesDefaultResponse**](GetEventStreamInitiativesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getOpportunities"></a>
# **getOpportunities**
> GetOpportunitiesDefaultResponse getOpportunities()

Get the list of opportunities

Get the list of opportunities

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    try {
      GetOpportunitiesDefaultResponse result = apiInstance.getOpportunities();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#getOpportunities");
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

[**GetOpportunitiesDefaultResponse**](GetOpportunitiesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getOpportunityMatrix"></a>
# **getOpportunityMatrix**
> GetOpportunityMatrixDefaultResponse getOpportunityMatrix()

Gets abbreviated details of all campaigns that are currently plotted on the opportunity matrix

Gets abbreviated details of all campaigns that are currently plotted on the opportunity matrix

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    try {
      GetOpportunityMatrixDefaultResponse result = apiInstance.getOpportunityMatrix();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#getOpportunityMatrix");
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

[**GetOpportunityMatrixDefaultResponse**](GetOpportunityMatrixDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateBusinessGoal"></a>
# **updateBusinessGoal**
> AUTHChangePasswordDefaultResponse updateBusinessGoal(createBusinessGoalRequest)

Update a Business Goal

Update a Business Goal

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    CreateBusinessGoalRequest createBusinessGoalRequest = new CreateBusinessGoalRequest(); // CreateBusinessGoalRequest | Update a Business Goal
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateBusinessGoal(createBusinessGoalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#updateBusinessGoal");
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
| **createBusinessGoalRequest** | [**CreateBusinessGoalRequest**](CreateBusinessGoalRequest.md)| Update a Business Goal | |

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

<a id="updateInitiative"></a>
# **updateInitiative**
> AUTHChangePasswordDefaultResponse updateInitiative(createInitiativeRequest)

Update a Business Initiative

Update a Business Initiative

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    CreateInitiativeRequest createInitiativeRequest = new CreateInitiativeRequest(); // CreateInitiativeRequest | Update a Business Initiative
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateInitiative(createInitiativeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#updateInitiative");
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
| **createInitiativeRequest** | [**CreateInitiativeRequest**](CreateInitiativeRequest.md)| Update a Business Initiative | |

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

<a id="updateOpportunity"></a>
# **updateOpportunity**
> AUTHChangePasswordDefaultResponse updateOpportunity(createOpportunityRequest)

Update an Opportunity

Update an Opportunity

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    CreateOpportunityRequest createOpportunityRequest = new CreateOpportunityRequest(); // CreateOpportunityRequest | Update an Opportunity
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateOpportunity(createOpportunityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#updateOpportunity");
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
| **createOpportunityRequest** | [**CreateOpportunityRequest**](CreateOpportunityRequest.md)| Update an Opportunity | |

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

<a id="updateOpportunityMatrix"></a>
# **updateOpportunityMatrix**
> AUTHChangePasswordDefaultResponse updateOpportunityMatrix(updateOpportunityMatrixRequest)

Store all the details for every campaign that&#39;s now plotted on the opportunity matrix.

Store all the details for every campaign that&#39;s now plotted on the opportunity matrix.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.OpportunityMatricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    OpportunityMatricesApi apiInstance = new OpportunityMatricesApi(defaultClient);
    UpdateOpportunityMatrixRequest updateOpportunityMatrixRequest = new UpdateOpportunityMatrixRequest(); // UpdateOpportunityMatrixRequest | Store all the details for every campaign that's now plotted on the opportunity matrix.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateOpportunityMatrix(updateOpportunityMatrixRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunityMatricesApi#updateOpportunityMatrix");
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
| **updateOpportunityMatrixRequest** | [**UpdateOpportunityMatrixRequest**](UpdateOpportunityMatrixRequest.md)| Store all the details for every campaign that&#39;s now plotted on the opportunity matrix. | |

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

