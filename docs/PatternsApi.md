# PatternsApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPattern**](PatternsApi.md#createPattern) | **POST** /CreatePattern | Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it |
| [**createPatternTasks**](PatternsApi.md#createPatternTasks) | **POST** /CreatePatternTasks | Creates a task to perform an action against a pattern definition |
| [**deletePattern**](PatternsApi.md#deletePattern) | **POST** /DeletePattern | Delete one or more pattern definitions |
| [**getPattern**](PatternsApi.md#getPattern) | **POST** /GetPattern | Get a pattern definition |
| [**getPatternRecords**](PatternsApi.md#getPatternRecords) | **POST** /GetPatternRecords | Get records from a pattern table |
| [**getPatternTasks**](PatternsApi.md#getPatternTasks) | **POST** /GetPatternTasks | Check on the status of pattern tasks |
| [**getPatterns**](PatternsApi.md#getPatterns) | **POST** /GetPatterns | Get one or more pattern definitions |
| [**getRepeatingPatternItemScores**](PatternsApi.md#getRepeatingPatternItemScores) | **POST** /GetRepeatingPatternItemScores | Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode &#39;alias&#39; transform that has been published to the pattern             and sits along-side the sequence item data |
| [**getRepeatingPatternItems**](PatternsApi.md#getRepeatingPatternItems) | **POST** /GetRepeatingPatternItems | Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern |
| [**requestCancelPatternTasks**](PatternsApi.md#requestCancelPatternTasks) | **POST** /RequestCancelPatternTasks | Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running |
| [**updatePattern**](PatternsApi.md#updatePattern) | **POST** /UpdatePattern | Updates a Pattern definition. |
| [**updateRepeatingPatternItemScores**](PatternsApi.md#updateRepeatingPatternItemScores) | **POST** /UpdateRepeatingPatternItemScores | Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified &#39;alias&#39; transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of &#39;unscoring&#39; it at present |


<a id="createPattern"></a>
# **createPattern**
> CreateClientDefaultResponse createPattern(createPatternRequest)

Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it

Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    CreatePatternRequest createPatternRequest = new CreatePatternRequest(); // CreatePatternRequest | Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it
    try {
      CreateClientDefaultResponse result = apiInstance.createPattern(createPatternRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#createPattern");
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
| **createPatternRequest** | [**CreatePatternRequest**](CreatePatternRequest.md)| Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it | |

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

<a id="createPatternTasks"></a>
# **createPatternTasks**
> CreatePatternTasksDefaultResponse createPatternTasks(createPatternTasksRequest)

Creates a task to perform an action against a pattern definition

Creates a task to perform an action against a pattern definition

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    CreatePatternTasksRequest createPatternTasksRequest = new CreatePatternTasksRequest(); // CreatePatternTasksRequest | Creates a task to perform an action against a pattern definition
    try {
      CreatePatternTasksDefaultResponse result = apiInstance.createPatternTasks(createPatternTasksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#createPatternTasks");
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
| **createPatternTasksRequest** | [**CreatePatternTasksRequest**](CreatePatternTasksRequest.md)| Creates a task to perform an action against a pattern definition | |

### Return type

[**CreatePatternTasksDefaultResponse**](CreatePatternTasksDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="deletePattern"></a>
# **deletePattern**
> AUTHChangePasswordDefaultResponse deletePattern(deletePatternRequest)

Delete one or more pattern definitions

Delete one or more pattern definitions

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    DeletePatternRequest deletePatternRequest = new DeletePatternRequest(); // DeletePatternRequest | Delete one or more pattern definitions
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deletePattern(deletePatternRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#deletePattern");
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
| **deletePatternRequest** | [**DeletePatternRequest**](DeletePatternRequest.md)| Delete one or more pattern definitions | |

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

<a id="getPattern"></a>
# **getPattern**
> GetPatternDefaultResponse getPattern(getPatternRequest)

Get a pattern definition

Get a pattern definition

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    GetPatternRequest getPatternRequest = new GetPatternRequest(); // GetPatternRequest | Get a pattern definition
    try {
      GetPatternDefaultResponse result = apiInstance.getPattern(getPatternRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#getPattern");
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
| **getPatternRequest** | [**GetPatternRequest**](GetPatternRequest.md)| Get a pattern definition | |

### Return type

[**GetPatternDefaultResponse**](GetPatternDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getPatternRecords"></a>
# **getPatternRecords**
> GetEventRecordsDefaultResponse getPatternRecords(getPatternRecordsRequest)

Get records from a pattern table

Get records from a pattern table

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    GetPatternRecordsRequest getPatternRecordsRequest = new GetPatternRecordsRequest(); // GetPatternRecordsRequest | Get records from a pattern table
    try {
      GetEventRecordsDefaultResponse result = apiInstance.getPatternRecords(getPatternRecordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#getPatternRecords");
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
| **getPatternRecordsRequest** | [**GetPatternRecordsRequest**](GetPatternRecordsRequest.md)| Get records from a pattern table | |

### Return type

[**GetEventRecordsDefaultResponse**](GetEventRecordsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getPatternTasks"></a>
# **getPatternTasks**
> CreatePatternTasksDefaultResponse getPatternTasks(getPatternTasksRequest)

Check on the status of pattern tasks

Check on the status of pattern tasks

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    GetPatternTasksRequest getPatternTasksRequest = new GetPatternTasksRequest(); // GetPatternTasksRequest | Check on the status of pattern tasks
    try {
      CreatePatternTasksDefaultResponse result = apiInstance.getPatternTasks(getPatternTasksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#getPatternTasks");
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
| **getPatternTasksRequest** | [**GetPatternTasksRequest**](GetPatternTasksRequest.md)| Check on the status of pattern tasks | |

### Return type

[**CreatePatternTasksDefaultResponse**](CreatePatternTasksDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getPatterns"></a>
# **getPatterns**
> GetPatternsDefaultResponse getPatterns(getPatternsRequest)

Get one or more pattern definitions

Get one or more pattern definitions

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    GetPatternsRequest getPatternsRequest = new GetPatternsRequest(); // GetPatternsRequest | Get one or more pattern definitions
    try {
      GetPatternsDefaultResponse result = apiInstance.getPatterns(getPatternsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#getPatterns");
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
| **getPatternsRequest** | [**GetPatternsRequest**](GetPatternsRequest.md)| Get one or more pattern definitions | |

### Return type

[**GetPatternsDefaultResponse**](GetPatternsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getRepeatingPatternItemScores"></a>
# **getRepeatingPatternItemScores**
> GetRepeatingPatternItemScoresDefaultResponse getRepeatingPatternItemScores(getRepeatingPatternItemScoresRequest)

Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode &#39;alias&#39; transform that has been published to the pattern             and sits along-side the sequence item data

Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode &#39;alias&#39; transform that has been published to the pattern             and sits along-side the sequence item data

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    GetRepeatingPatternItemScoresRequest getRepeatingPatternItemScoresRequest = new GetRepeatingPatternItemScoresRequest(); // GetRepeatingPatternItemScoresRequest | Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode 'alias' transform that has been published to the pattern             and sits along-side the sequence item data
    try {
      GetRepeatingPatternItemScoresDefaultResponse result = apiInstance.getRepeatingPatternItemScores(getRepeatingPatternItemScoresRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#getRepeatingPatternItemScores");
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
| **getRepeatingPatternItemScoresRequest** | [**GetRepeatingPatternItemScoresRequest**](GetRepeatingPatternItemScoresRequest.md)| Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode &#39;alias&#39; transform that has been published to the pattern             and sits along-side the sequence item data | |

### Return type

[**GetRepeatingPatternItemScoresDefaultResponse**](GetRepeatingPatternItemScoresDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getRepeatingPatternItems"></a>
# **getRepeatingPatternItems**
> GetEventRecordsDefaultResponse getRepeatingPatternItems(getRepeatingPatternItemsRequest)

Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern

Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    GetRepeatingPatternItemsRequest getRepeatingPatternItemsRequest = new GetRepeatingPatternItemsRequest(); // GetRepeatingPatternItemsRequest | Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern
    try {
      GetEventRecordsDefaultResponse result = apiInstance.getRepeatingPatternItems(getRepeatingPatternItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#getRepeatingPatternItems");
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
| **getRepeatingPatternItemsRequest** | [**GetRepeatingPatternItemsRequest**](GetRepeatingPatternItemsRequest.md)| Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern | |

### Return type

[**GetEventRecordsDefaultResponse**](GetEventRecordsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="requestCancelPatternTasks"></a>
# **requestCancelPatternTasks**
> AUTHChangePasswordDefaultResponse requestCancelPatternTasks(requestCancelPatternTasksRequest)

Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running

Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    RequestCancelPatternTasksRequest requestCancelPatternTasksRequest = new RequestCancelPatternTasksRequest(); // RequestCancelPatternTasksRequest | Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.requestCancelPatternTasks(requestCancelPatternTasksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#requestCancelPatternTasks");
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
| **requestCancelPatternTasksRequest** | [**RequestCancelPatternTasksRequest**](RequestCancelPatternTasksRequest.md)| Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running | |

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

<a id="updatePattern"></a>
# **updatePattern**
> AUTHChangePasswordDefaultResponse updatePattern(updatePatternRequest)

Updates a Pattern definition.

Updates a Pattern definition.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    UpdatePatternRequest updatePatternRequest = new UpdatePatternRequest(); // UpdatePatternRequest | Updates a Pattern definition.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updatePattern(updatePatternRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#updatePattern");
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
| **updatePatternRequest** | [**UpdatePatternRequest**](UpdatePatternRequest.md)| Updates a Pattern definition. | |

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

<a id="updateRepeatingPatternItemScores"></a>
# **updateRepeatingPatternItemScores**
> AUTHChangePasswordDefaultResponse updateRepeatingPatternItemScores(updateRepeatingPatternItemScoresRequest)

Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified &#39;alias&#39; transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of &#39;unscoring&#39; it at present

Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified &#39;alias&#39; transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of &#39;unscoring&#39; it at present

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.PatternsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    PatternsApi apiInstance = new PatternsApi(defaultClient);
    UpdateRepeatingPatternItemScoresRequest updateRepeatingPatternItemScoresRequest = new UpdateRepeatingPatternItemScoresRequest(); // UpdateRepeatingPatternItemScoresRequest | Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified 'alias' transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of 'unscoring' it at present
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateRepeatingPatternItemScores(updateRepeatingPatternItemScoresRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PatternsApi#updateRepeatingPatternItemScores");
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
| **updateRepeatingPatternItemScoresRequest** | [**UpdateRepeatingPatternItemScoresRequest**](UpdateRepeatingPatternItemScoresRequest.md)| Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified &#39;alias&#39; transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of &#39;unscoring&#39; it at present | |

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

