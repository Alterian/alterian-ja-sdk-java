# GroupsApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyGroup**](GroupsApi.md#copyGroup) | **POST** /CopyGroup | Copy a group from one folder to another |
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /CreateGroup | Create a group |
| [**deleteGroup**](GroupsApi.md#deleteGroup) | **POST** /DeleteGroup | Delete a group |
| [**getGroup**](GroupsApi.md#getGroup) | **POST** /GetGroup | Get a group object |
| [**getGroupMembers**](GroupsApi.md#getGroupMembers) | **POST** /GetGroupMembers | Get the members of a particular group |
| [**getGroups**](GroupsApi.md#getGroups) | **POST** /GetGroups | List groups in the client |
| [**updateGroup**](GroupsApi.md#updateGroup) | **POST** /UpdateGroup | Update a group |


<a id="copyGroup"></a>
# **copyGroup**
> CreateClientDefaultResponse copyGroup(copyGroupRequest)

Copy a group from one folder to another

Copy a group from one folder to another

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    CopyGroupRequest copyGroupRequest = new CopyGroupRequest(); // CopyGroupRequest | Copy a group from one folder to another
    try {
      CreateClientDefaultResponse result = apiInstance.copyGroup(copyGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#copyGroup");
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
| **copyGroupRequest** | [**CopyGroupRequest**](CopyGroupRequest.md)| Copy a group from one folder to another | |

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

<a id="createGroup"></a>
# **createGroup**
> CreateClientDefaultResponse createGroup(createGroupRequest)

Create a group

Create a group

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    CreateGroupRequest createGroupRequest = new CreateGroupRequest(); // CreateGroupRequest | Create a group
    try {
      CreateClientDefaultResponse result = apiInstance.createGroup(createGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
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
| **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)| Create a group | |

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

<a id="deleteGroup"></a>
# **deleteGroup**
> AUTHChangePasswordDefaultResponse deleteGroup(deleteGroupRequest)

Delete a group

Delete a group

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    DeleteGroupRequest deleteGroupRequest = new DeleteGroupRequest(); // DeleteGroupRequest | Delete a group
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteGroup(deleteGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroup");
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
| **deleteGroupRequest** | [**DeleteGroupRequest**](DeleteGroupRequest.md)| Delete a group | |

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

<a id="getGroup"></a>
# **getGroup**
> GetGroupDefaultResponse getGroup(getGroupRequest)

Get a group object

Get a group object

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    GetGroupRequest getGroupRequest = new GetGroupRequest(); // GetGroupRequest | Get a group object
    try {
      GetGroupDefaultResponse result = apiInstance.getGroup(getGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroup");
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
| **getGroupRequest** | [**GetGroupRequest**](GetGroupRequest.md)| Get a group object | |

### Return type

[**GetGroupDefaultResponse**](GetGroupDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getGroupMembers"></a>
# **getGroupMembers**
> GetGroupMembersDefaultResponse getGroupMembers(getGroupMembersRequest)

Get the members of a particular group

Get the members of a particular group

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    GetGroupMembersRequest getGroupMembersRequest = new GetGroupMembersRequest(); // GetGroupMembersRequest | Get the members of a particular group
    try {
      GetGroupMembersDefaultResponse result = apiInstance.getGroupMembers(getGroupMembersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMembers");
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
| **getGroupMembersRequest** | [**GetGroupMembersRequest**](GetGroupMembersRequest.md)| Get the members of a particular group | |

### Return type

[**GetGroupMembersDefaultResponse**](GetGroupMembersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getGroups"></a>
# **getGroups**
> GetGroupsDefaultResponse getGroups(getGroupsRequest)

List groups in the client

List groups in the client

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    GetGroupsRequest getGroupsRequest = new GetGroupsRequest(); // GetGroupsRequest | List groups in the client
    try {
      GetGroupsDefaultResponse result = apiInstance.getGroups(getGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroups");
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
| **getGroupsRequest** | [**GetGroupsRequest**](GetGroupsRequest.md)| List groups in the client | |

### Return type

[**GetGroupsDefaultResponse**](GetGroupsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateGroup"></a>
# **updateGroup**
> AUTHChangePasswordDefaultResponse updateGroup(createGroupRequest)

Update a group

Update a group

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    CreateGroupRequest createGroupRequest = new CreateGroupRequest(); // CreateGroupRequest | Update a group
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateGroup(createGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroup");
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
| **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)| Update a group | |

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

