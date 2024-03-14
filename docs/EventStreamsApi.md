# EventStreamsApi

All URIs are relative to *http://localhost/services/api.svc/jsonsdk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChannel**](EventStreamsApi.md#createChannel) | **POST** /CreateChannel | Create a channel colour mapping |
| [**createEventStream**](EventStreamsApi.md#createEventStream) | **POST** /CreateEventStream | Creates an event stream, including a datasource and a DDE queue |
| [**createEventStreamGroup**](EventStreamsApi.md#createEventStreamGroup) | **POST** /CreateEventStreamGroup | Creates an event stream group, including a datasource and a DDE queue for each target (dev/test/prod) |
| [**createIdealisedJourney**](EventStreamsApi.md#createIdealisedJourney) | **POST** /CreateIdealisedJourney | Create an Idealised Journey |
| [**createSankeyFavourite**](EventStreamsApi.md#createSankeyFavourite) | **POST** /CreateSankeyFavourite | Create a Sankey Favourite |
| [**createVisualisationFavourite**](EventStreamsApi.md#createVisualisationFavourite) | **POST** /CreateVisualisationFavourite | Create a Visualisation Favourite |
| [**deleteChannel**](EventStreamsApi.md#deleteChannel) | **POST** /DeleteChannel | Removed a channel and its associated colour from the channel list. |
| [**deleteEventStream**](EventStreamsApi.md#deleteEventStream) | **POST** /DeleteEventStream | Removes an event stream from the system, optionally purging and deleting the corresponding queue in DDE.  Also can delete the underlying data store if the number of rows in the data store is less than the number provided |
| [**deleteEventStreamCustomerColumns**](EventStreamsApi.md#deleteEventStreamCustomerColumns) | **POST** /DeleteEventStreamCustomerColumns | Mark for deletion the specified customer attribute columns for an @see(EventStream).             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns. |
| [**deleteEventStreamCustomerColumnsFromGroup**](EventStreamsApi.md#deleteEventStreamCustomerColumnsFromGroup) | **POST** /DeleteEventStreamCustomerColumnsFromGroup | Mark for deletion the specified customer attribute columns for all @see(EventStream)s in a group.             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns. |
| [**deleteEventStreamGroup**](EventStreamsApi.md#deleteEventStreamGroup) | **POST** /DeleteEventStreamGroup | Removes a group of event streams from the system, optionally purging and deleting the corresponding queues in DDE. |
| [**deleteIdealisedJourney**](EventStreamsApi.md#deleteIdealisedJourney) | **POST** /DeleteIdealisedJourney | Delete Idealised Journey&#39;s |
| [**deleteSankeyFavourites**](EventStreamsApi.md#deleteSankeyFavourites) | **POST** /DeleteSankeyFavourites | Delete a sankey favourite |
| [**deleteVisualisationFavourites**](EventStreamsApi.md#deleteVisualisationFavourites) | **POST** /DeleteVisualisationFavourites | Delete Visualisation favourite(s) |
| [**exportEventStreamInteraction**](EventStreamsApi.md#exportEventStreamInteraction) | **POST** /ExportEventStreamInteraction | Exports the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False. |
| [**getChannels**](EventStreamsApi.md#getChannels) | **POST** /GetChannels | Return back a list of channels and their associated colours |
| [**getEventRecords**](EventStreamsApi.md#getEventRecords) | **POST** /GetEventRecords | Obtain the event records from an event stream table that match the specified key |
| [**getEventStream**](EventStreamsApi.md#getEventStream) | **POST** /GetEventStream | Return back the full details of an @see(EventStream).  Ids are available from @see(GetEventStreams) |
| [**getEventStreamAggregates**](EventStreamsApi.md#getEventStreamAggregates) | **POST** /GetEventStreamAggregates | Get aggregate stats for an Event Stream.              Currently only supported for JD snapshots (simply because traditional sankey snapshots won&#39;t have the financial columns yet) |
| [**getEventStreamChannels**](EventStreamsApi.md#getEventStreamChannels) | **POST** /GetEventStreamChannels | Requests a list of the channels which the event stream has received.  Use this list to create channel colour mappings @see(CreateChannel).  Use @see(GetEventStreams) for a list of the available @see(EventStream)s |
| [**getEventStreamDecodeMappings**](EventStreamsApi.md#getEventStreamDecodeMappings) | **POST** /GetEventStreamDecodeMappings | Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a cursored list of the labels taking account any decodes that may have been specified             Note that this API does not use any published decode information, if a decode list is to be applied then it should be specified explicitly |
| [**getEventStreamDecodeTargetDiscretes**](EventStreamsApi.md#getEventStreamDecodeTargetDiscretes) | **POST** /GetEventStreamDecodeTargetDiscretes | Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a list of all the currently configured decode targets along with any counts             If a target does not appear in the sampled data it will be returned with a count of zero so it can be optionally filtered out of any picklist |
| [**getEventStreamDiscreteValues**](EventStreamsApi.md#getEventStreamDiscreteValues) | **POST** /GetEventStreamDiscreteValues | Obtain discrete values from an event stream table             Supports use of a snapshot table which should reduce the chances of us blowing the Engine discrete limit.             The first parameters constitute the sankey filters and thereby the starting set for discretes             It will also allow us to filter the values by the specified discrete filters             If the sankey filters return no data then an execption is thrown stating that \&quot;No data is available for the specified filters\&quot; as this is probably not what the user wants             If the discretes filter suppresses out all data in the sankey then no exception is raised but zero totals are returned |
| [**getEventStreamModels**](EventStreamsApi.md#getEventStreamModels) | **POST** /GetEventStreamModels | Retrieve available models |
| [**getEventStreams**](EventStreamsApi.md#getEventStreams) | **POST** /GetEventStreams | Returns back a list of event streams which exist in the system |
| [**getFieldTransformationDiscreteValues**](EventStreamsApi.md#getFieldTransformationDiscreteValues) | **POST** /GetFieldTransformationDiscreteValues | Apply a list of transforms to the discrete values of a column and return the new set of values and their frequencies             If JSONTransforms is not supplied then the results will simply be the discrete values present in the source column after any sample has been applied |
| [**getFieldTransformationMappings**](EventStreamsApi.md#getFieldTransformationMappings) | **POST** /GetFieldTransformationMappings | Apply a list of transforms and return information about the transformed value and frequency for each item in the starting set of values             If JSONCompareTransforms is specified then the starting set of values is the result of first applying these to these to the specified column             If JSONCompareTransforms is not specified then the starting set of values is the actual discrete values present in the column |
| [**getIdealisedJourneys**](EventStreamsApi.md#getIdealisedJourneys) | **POST** /GetIdealisedJourneys | Retrieve a list of Idealised Journeys |
| [**getSankeyFavourites**](EventStreamsApi.md#getSankeyFavourites) | **POST** /GetSankeyFavourites | Retrieve a list of Sankey Favourites |
| [**getVisualisationFavourites**](EventStreamsApi.md#getVisualisationFavourites) | **POST** /GetVisualisationFavourites | Retrieve a list of Visualisation Favourites |
| [**queryEventStream**](EventStreamsApi.md#queryEventStream) | **POST** /QueryEventStream | Queries the domain of selected event records that is represented by the date and event type filters, returning the list of events and graph of transition streams along with frequency counts.             Transitions will specify start and end points using indices into the list of events, along with some special values.             The &#39;Drop off&#39; points where a stream ends will be assigned an index of -1.             Any transition to an event that does not fall into the TopN specification will be assigned to an &#39;other events&#39; category with an index of -2.             Right aligned streams will be left-padded up to the MaxLength specification using a &#39;no event&#39; category with an index of -3.             If timeout events are required then the start of the sequence leading up to a timeout will be flagged with an index of -4 and the end with an index of -5. |
| [**queryEventStreamCount**](EventStreamsApi.md#queryEventStreamCount) | **POST** /QueryEventStreamCount | Take the domain of selected event records that is represented by the date filters, and count streams matching the agreed patterns represented by the CountType parameter |
| [**queryEventStreamInteraction**](EventStreamsApi.md#queryEventStreamInteraction) | **POST** /QueryEventStreamInteraction | Queries the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False. |
| [**queryEventStreamTransition**](EventStreamsApi.md#queryEventStreamTransition) | **POST** /QueryEventStreamTransition | Queries the domain from a particular node to another node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEventsFrom&#39; / IncludeMatchedEventsTo to False. |
| [**runSequencePredictor**](EventStreamsApi.md#runSequencePredictor) | **POST** /RunSequencePredictor | Train and employ sequence prediction models for an event stream |
| [**updateChannel**](EventStreamsApi.md#updateChannel) | **POST** /UpdateChannel | Updates a channel, allowing you to change the name and colour |
| [**updateEventStreamFieldTransformLists**](EventStreamsApi.md#updateEventStreamFieldTransformLists) | **POST** /UpdateEventStreamFieldTransformLists | Publishes the specified transforms to the corresponding event stream columns             Any existing list for a column that matches on Transform Type and Alias will be replaced |
| [**updateIdealisedJourney**](EventStreamsApi.md#updateIdealisedJourney) | **POST** /UpdateIdealisedJourney | Update an Idealised Journey |
| [**updateSankeyFavourite**](EventStreamsApi.md#updateSankeyFavourite) | **POST** /UpdateSankeyFavourite | Update a SankeyFavourite |
| [**updateVisualisationFavourite**](EventStreamsApi.md#updateVisualisationFavourite) | **POST** /UpdateVisualisationFavourite | Update a Visualisation Favourite |
| [**upsertEventStreamCustomerColumns**](EventStreamsApi.md#upsertEventStreamCustomerColumns) | **POST** /UpsertEventStreamCustomerColumns | Add or update customer attribute columns for an @see(EventStream).             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements. |
| [**upsertEventStreamCustomerColumnsToGroup**](EventStreamsApi.md#upsertEventStreamCustomerColumnsToGroup) | **POST** /UpsertEventStreamCustomerColumnsToGroup | Add or update customer attribute columns to the @see(EventStream)s in a group.             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.             There is some latency (up to 5 mins) between a column being created and the queue service starting to read the data unless the queue service is restarted |


<a id="createChannel"></a>
# **createChannel**
> CreateClientDefaultResponse createChannel(createChannelRequest)

Create a channel colour mapping

Create a channel colour mapping

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    CreateChannelRequest createChannelRequest = new CreateChannelRequest(); // CreateChannelRequest | Create a channel colour mapping
    try {
      CreateClientDefaultResponse result = apiInstance.createChannel(createChannelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#createChannel");
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
| **createChannelRequest** | [**CreateChannelRequest**](CreateChannelRequest.md)| Create a channel colour mapping | |

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

<a id="createEventStream"></a>
# **createEventStream**
> CreateClientDefaultResponse createEventStream(createEventStreamRequest)

Creates an event stream, including a datasource and a DDE queue

Creates an event stream, including a datasource and a DDE queue

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    CreateEventStreamRequest createEventStreamRequest = new CreateEventStreamRequest(); // CreateEventStreamRequest | Creates an event stream, including a datasource and a DDE queue
    try {
      CreateClientDefaultResponse result = apiInstance.createEventStream(createEventStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#createEventStream");
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
| **createEventStreamRequest** | [**CreateEventStreamRequest**](CreateEventStreamRequest.md)| Creates an event stream, including a datasource and a DDE queue | |

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

<a id="createEventStreamGroup"></a>
# **createEventStreamGroup**
> CreateClientDefaultResponse createEventStreamGroup(createEventStreamGroupRequest)

Creates an event stream group, including a datasource and a DDE queue for each target (dev/test/prod)

Creates an event stream group, including a datasource and a DDE queue for each target (dev/test/prod)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    CreateEventStreamGroupRequest createEventStreamGroupRequest = new CreateEventStreamGroupRequest(); // CreateEventStreamGroupRequest | Creates an event stream group, including a datasource and a DDE queue for each target (dev/test/prod)
    try {
      CreateClientDefaultResponse result = apiInstance.createEventStreamGroup(createEventStreamGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#createEventStreamGroup");
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
| **createEventStreamGroupRequest** | [**CreateEventStreamGroupRequest**](CreateEventStreamGroupRequest.md)| Creates an event stream group, including a datasource and a DDE queue for each target (dev/test/prod) | |

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

<a id="createIdealisedJourney"></a>
# **createIdealisedJourney**
> CreateClientDefaultResponse createIdealisedJourney(createIdealisedJourneyRequest)

Create an Idealised Journey

Create an Idealised Journey

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    CreateIdealisedJourneyRequest createIdealisedJourneyRequest = new CreateIdealisedJourneyRequest(); // CreateIdealisedJourneyRequest | Create an Idealised Journey
    try {
      CreateClientDefaultResponse result = apiInstance.createIdealisedJourney(createIdealisedJourneyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#createIdealisedJourney");
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
| **createIdealisedJourneyRequest** | [**CreateIdealisedJourneyRequest**](CreateIdealisedJourneyRequest.md)| Create an Idealised Journey | |

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

<a id="createSankeyFavourite"></a>
# **createSankeyFavourite**
> CreateClientDefaultResponse createSankeyFavourite(createSankeyFavouriteRequest)

Create a Sankey Favourite

Create a Sankey Favourite

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    CreateSankeyFavouriteRequest createSankeyFavouriteRequest = new CreateSankeyFavouriteRequest(); // CreateSankeyFavouriteRequest | Create a Sankey Favourite
    try {
      CreateClientDefaultResponse result = apiInstance.createSankeyFavourite(createSankeyFavouriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#createSankeyFavourite");
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
| **createSankeyFavouriteRequest** | [**CreateSankeyFavouriteRequest**](CreateSankeyFavouriteRequest.md)| Create a Sankey Favourite | |

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

<a id="createVisualisationFavourite"></a>
# **createVisualisationFavourite**
> CreateClientDefaultResponse createVisualisationFavourite(createVisualisationFavouriteRequest)

Create a Visualisation Favourite

Create a Visualisation Favourite

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    CreateVisualisationFavouriteRequest createVisualisationFavouriteRequest = new CreateVisualisationFavouriteRequest(); // CreateVisualisationFavouriteRequest | Create a Visualisation Favourite
    try {
      CreateClientDefaultResponse result = apiInstance.createVisualisationFavourite(createVisualisationFavouriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#createVisualisationFavourite");
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
| **createVisualisationFavouriteRequest** | [**CreateVisualisationFavouriteRequest**](CreateVisualisationFavouriteRequest.md)| Create a Visualisation Favourite | |

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

<a id="deleteChannel"></a>
# **deleteChannel**
> AUTHChangePasswordDefaultResponse deleteChannel(deleteChannelRequest)

Removed a channel and its associated colour from the channel list.

Removed a channel and its associated colour from the channel list.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteChannelRequest deleteChannelRequest = new DeleteChannelRequest(); // DeleteChannelRequest | Removed a channel and its associated colour from the channel list.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteChannel(deleteChannelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteChannel");
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
| **deleteChannelRequest** | [**DeleteChannelRequest**](DeleteChannelRequest.md)| Removed a channel and its associated colour from the channel list. | |

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

<a id="deleteEventStream"></a>
# **deleteEventStream**
> AUTHChangePasswordDefaultResponse deleteEventStream(deleteEventStreamRequest)

Removes an event stream from the system, optionally purging and deleting the corresponding queue in DDE.  Also can delete the underlying data store if the number of rows in the data store is less than the number provided

Removes an event stream from the system, optionally purging and deleting the corresponding queue in DDE.  Also can delete the underlying data store if the number of rows in the data store is less than the number provided

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteEventStreamRequest deleteEventStreamRequest = new DeleteEventStreamRequest(); // DeleteEventStreamRequest | Removes an event stream from the system, optionally purging and deleting the corresponding queue in DDE.  Also can delete the underlying data store if the number of rows in the data store is less than the number provided
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteEventStream(deleteEventStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteEventStream");
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
| **deleteEventStreamRequest** | [**DeleteEventStreamRequest**](DeleteEventStreamRequest.md)| Removes an event stream from the system, optionally purging and deleting the corresponding queue in DDE.  Also can delete the underlying data store if the number of rows in the data store is less than the number provided | |

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

<a id="deleteEventStreamCustomerColumns"></a>
# **deleteEventStreamCustomerColumns**
> AUTHChangePasswordDefaultResponse deleteEventStreamCustomerColumns(deleteEventStreamCustomerColumnsRequest)

Mark for deletion the specified customer attribute columns for an @see(EventStream).             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns.

Mark for deletion the specified customer attribute columns for an @see(EventStream).             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteEventStreamCustomerColumnsRequest deleteEventStreamCustomerColumnsRequest = new DeleteEventStreamCustomerColumnsRequest(); // DeleteEventStreamCustomerColumnsRequest | Mark for deletion the specified customer attribute columns for an @see(EventStream).             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteEventStreamCustomerColumns(deleteEventStreamCustomerColumnsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteEventStreamCustomerColumns");
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
| **deleteEventStreamCustomerColumnsRequest** | [**DeleteEventStreamCustomerColumnsRequest**](DeleteEventStreamCustomerColumnsRequest.md)| Mark for deletion the specified customer attribute columns for an @see(EventStream).             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns. | |

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

<a id="deleteEventStreamCustomerColumnsFromGroup"></a>
# **deleteEventStreamCustomerColumnsFromGroup**
> AUTHChangePasswordDefaultResponse deleteEventStreamCustomerColumnsFromGroup(deleteEventStreamCustomerColumnsFromGroupRequest)

Mark for deletion the specified customer attribute columns for all @see(EventStream)s in a group.             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns.

Mark for deletion the specified customer attribute columns for all @see(EventStream)s in a group.             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteEventStreamCustomerColumnsFromGroupRequest deleteEventStreamCustomerColumnsFromGroupRequest = new DeleteEventStreamCustomerColumnsFromGroupRequest(); // DeleteEventStreamCustomerColumnsFromGroupRequest | Mark for deletion the specified customer attribute columns for all @see(EventStream)s in a group.             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteEventStreamCustomerColumnsFromGroup(deleteEventStreamCustomerColumnsFromGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteEventStreamCustomerColumnsFromGroup");
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
| **deleteEventStreamCustomerColumnsFromGroupRequest** | [**DeleteEventStreamCustomerColumnsFromGroupRequest**](DeleteEventStreamCustomerColumnsFromGroupRequest.md)| Mark for deletion the specified customer attribute columns for all @see(EventStream)s in a group.             NOTE THAT THE ASSOCIATED ENGINE COLUMN AND DDE CACHE COLUMN WILL BE DELETED AND ANY DATA LOST PERMANENTLY.             Deletion of the column from Engine and the DDE cache is not synchronous so attempts to recreate the column may fail initially and require a different name to be specified.             Once marked for deletion the columns no longer contribute to the cap imposed by the max number of allowed columns. | |

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

<a id="deleteEventStreamGroup"></a>
# **deleteEventStreamGroup**
> AUTHChangePasswordDefaultResponse deleteEventStreamGroup(deleteEventStreamGroupRequest)

Removes a group of event streams from the system, optionally purging and deleting the corresponding queues in DDE.

Removes a group of event streams from the system, optionally purging and deleting the corresponding queues in DDE.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteEventStreamGroupRequest deleteEventStreamGroupRequest = new DeleteEventStreamGroupRequest(); // DeleteEventStreamGroupRequest | Removes a group of event streams from the system, optionally purging and deleting the corresponding queues in DDE.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteEventStreamGroup(deleteEventStreamGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteEventStreamGroup");
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
| **deleteEventStreamGroupRequest** | [**DeleteEventStreamGroupRequest**](DeleteEventStreamGroupRequest.md)| Removes a group of event streams from the system, optionally purging and deleting the corresponding queues in DDE. | |

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

<a id="deleteIdealisedJourney"></a>
# **deleteIdealisedJourney**
> AUTHChangePasswordDefaultResponse deleteIdealisedJourney(deleteIdealisedJourneyRequest)

Delete Idealised Journey&#39;s

Delete Idealised Journey&#39;s

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteIdealisedJourneyRequest deleteIdealisedJourneyRequest = new DeleteIdealisedJourneyRequest(); // DeleteIdealisedJourneyRequest | Delete Idealised Journey's
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteIdealisedJourney(deleteIdealisedJourneyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteIdealisedJourney");
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
| **deleteIdealisedJourneyRequest** | [**DeleteIdealisedJourneyRequest**](DeleteIdealisedJourneyRequest.md)| Delete Idealised Journey&#39;s | |

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

<a id="deleteSankeyFavourites"></a>
# **deleteSankeyFavourites**
> AUTHChangePasswordDefaultResponse deleteSankeyFavourites(deleteSankeyFavouritesRequest)

Delete a sankey favourite

Delete a sankey favourite

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteSankeyFavouritesRequest deleteSankeyFavouritesRequest = new DeleteSankeyFavouritesRequest(); // DeleteSankeyFavouritesRequest | Delete a sankey favourite
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteSankeyFavourites(deleteSankeyFavouritesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteSankeyFavourites");
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
| **deleteSankeyFavouritesRequest** | [**DeleteSankeyFavouritesRequest**](DeleteSankeyFavouritesRequest.md)| Delete a sankey favourite | |

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

<a id="deleteVisualisationFavourites"></a>
# **deleteVisualisationFavourites**
> AUTHChangePasswordDefaultResponse deleteVisualisationFavourites(deleteVisualisationFavouritesRequest)

Delete Visualisation favourite(s)

Delete Visualisation favourite(s)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    DeleteVisualisationFavouritesRequest deleteVisualisationFavouritesRequest = new DeleteVisualisationFavouritesRequest(); // DeleteVisualisationFavouritesRequest | Delete Visualisation favourite(s)
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.deleteVisualisationFavourites(deleteVisualisationFavouritesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#deleteVisualisationFavourites");
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
| **deleteVisualisationFavouritesRequest** | [**DeleteVisualisationFavouritesRequest**](DeleteVisualisationFavouritesRequest.md)| Delete Visualisation favourite(s) | |

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

<a id="exportEventStreamInteraction"></a>
# **exportEventStreamInteraction**
> File exportEventStreamInteraction(exportEventStreamInteractionRequest)

Exports the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False.

Exports the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    ExportEventStreamInteractionRequest exportEventStreamInteractionRequest = new ExportEventStreamInteractionRequest(); // ExportEventStreamInteractionRequest | Exports the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \"other\" events pass all displayed events and set 'IncludeMatchedEvents' to False.
    try {
      File result = apiInstance.exportEventStreamInteraction(exportEventStreamInteractionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#exportEventStreamInteraction");
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
| **exportEventStreamInteractionRequest** | [**ExportEventStreamInteractionRequest**](ExportEventStreamInteractionRequest.md)| Exports the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False. | |

### Return type

[**File**](File.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getChannels"></a>
# **getChannels**
> GetChannelsDefaultResponse getChannels()

Return back a list of channels and their associated colours

Return back a list of channels and their associated colours

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    try {
      GetChannelsDefaultResponse result = apiInstance.getChannels();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getChannels");
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

[**GetChannelsDefaultResponse**](GetChannelsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventRecords"></a>
# **getEventRecords**
> GetEventRecordsDefaultResponse getEventRecords(getEventRecordsRequest)

Obtain the event records from an event stream table that match the specified key

Obtain the event records from an event stream table that match the specified key

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventRecordsRequest getEventRecordsRequest = new GetEventRecordsRequest(); // GetEventRecordsRequest | Obtain the event records from an event stream table that match the specified key
    try {
      GetEventRecordsDefaultResponse result = apiInstance.getEventRecords(getEventRecordsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventRecords");
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
| **getEventRecordsRequest** | [**GetEventRecordsRequest**](GetEventRecordsRequest.md)| Obtain the event records from an event stream table that match the specified key | |

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

<a id="getEventStream"></a>
# **getEventStream**
> GetEventStreamDefaultResponse getEventStream(getEventStreamRequest)

Return back the full details of an @see(EventStream).  Ids are available from @see(GetEventStreams)

Return back the full details of an @see(EventStream).  Ids are available from @see(GetEventStreams)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamRequest getEventStreamRequest = new GetEventStreamRequest(); // GetEventStreamRequest | Return back the full details of an @see(EventStream).  Ids are available from @see(GetEventStreams)
    try {
      GetEventStreamDefaultResponse result = apiInstance.getEventStream(getEventStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStream");
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
| **getEventStreamRequest** | [**GetEventStreamRequest**](GetEventStreamRequest.md)| Return back the full details of an @see(EventStream).  Ids are available from @see(GetEventStreams) | |

### Return type

[**GetEventStreamDefaultResponse**](GetEventStreamDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreamAggregates"></a>
# **getEventStreamAggregates**
> GetEventRecordsDefaultResponse getEventStreamAggregates(getEventStreamAggregatesRequest)

Get aggregate stats for an Event Stream.              Currently only supported for JD snapshots (simply because traditional sankey snapshots won&#39;t have the financial columns yet)

Get aggregate stats for an Event Stream.              Currently only supported for JD snapshots (simply because traditional sankey snapshots won&#39;t have the financial columns yet)

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamAggregatesRequest getEventStreamAggregatesRequest = new GetEventStreamAggregatesRequest(); // GetEventStreamAggregatesRequest | Get aggregate stats for an Event Stream.              Currently only supported for JD snapshots (simply because traditional sankey snapshots won't have the financial columns yet)
    try {
      GetEventRecordsDefaultResponse result = apiInstance.getEventStreamAggregates(getEventStreamAggregatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreamAggregates");
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
| **getEventStreamAggregatesRequest** | [**GetEventStreamAggregatesRequest**](GetEventStreamAggregatesRequest.md)| Get aggregate stats for an Event Stream.              Currently only supported for JD snapshots (simply because traditional sankey snapshots won&#39;t have the financial columns yet) | |

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

<a id="getEventStreamChannels"></a>
# **getEventStreamChannels**
> GetDataSourceUsersDefaultResponse getEventStreamChannels(getEventStreamChannelsRequest)

Requests a list of the channels which the event stream has received.  Use this list to create channel colour mappings @see(CreateChannel).  Use @see(GetEventStreams) for a list of the available @see(EventStream)s

Requests a list of the channels which the event stream has received.  Use this list to create channel colour mappings @see(CreateChannel).  Use @see(GetEventStreams) for a list of the available @see(EventStream)s

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamChannelsRequest getEventStreamChannelsRequest = new GetEventStreamChannelsRequest(); // GetEventStreamChannelsRequest | Requests a list of the channels which the event stream has received.  Use this list to create channel colour mappings @see(CreateChannel).  Use @see(GetEventStreams) for a list of the available @see(EventStream)s
    try {
      GetDataSourceUsersDefaultResponse result = apiInstance.getEventStreamChannels(getEventStreamChannelsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreamChannels");
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
| **getEventStreamChannelsRequest** | [**GetEventStreamChannelsRequest**](GetEventStreamChannelsRequest.md)| Requests a list of the channels which the event stream has received.  Use this list to create channel colour mappings @see(CreateChannel).  Use @see(GetEventStreams) for a list of the available @see(EventStream)s | |

### Return type

[**GetDataSourceUsersDefaultResponse**](GetDataSourceUsersDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreamDecodeMappings"></a>
# **getEventStreamDecodeMappings**
> GetEventStreamDecodeMappingsDefaultResponse getEventStreamDecodeMappings(getEventStreamDecodeMappingsRequest)

Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a cursored list of the labels taking account any decodes that may have been specified             Note that this API does not use any published decode information, if a decode list is to be applied then it should be specified explicitly

Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a cursored list of the labels taking account any decodes that may have been specified             Note that this API does not use any published decode information, if a decode list is to be applied then it should be specified explicitly

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamDecodeMappingsRequest getEventStreamDecodeMappingsRequest = new GetEventStreamDecodeMappingsRequest(); // GetEventStreamDecodeMappingsRequest | Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a cursored list of the labels taking account any decodes that may have been specified             Note that this API does not use any published decode information, if a decode list is to be applied then it should be specified explicitly
    try {
      GetEventStreamDecodeMappingsDefaultResponse result = apiInstance.getEventStreamDecodeMappings(getEventStreamDecodeMappingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreamDecodeMappings");
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
| **getEventStreamDecodeMappingsRequest** | [**GetEventStreamDecodeMappingsRequest**](GetEventStreamDecodeMappingsRequest.md)| Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a cursored list of the labels taking account any decodes that may have been specified             Note that this API does not use any published decode information, if a decode list is to be applied then it should be specified explicitly | |

### Return type

[**GetEventStreamDecodeMappingsDefaultResponse**](GetEventStreamDecodeMappingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreamDecodeTargetDiscretes"></a>
# **getEventStreamDecodeTargetDiscretes**
> GetEventStreamDecodeTargetDiscretesDefaultResponse getEventStreamDecodeTargetDiscretes(getEventStreamDecodeTargetDiscretesRequest)

Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a list of all the currently configured decode targets along with any counts             If a target does not appear in the sampled data it will be returned with a count of zero so it can be optionally filtered out of any picklist

Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a list of all the currently configured decode targets along with any counts             If a target does not appear in the sampled data it will be returned with a count of zero so it can be optionally filtered out of any picklist

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamDecodeTargetDiscretesRequest getEventStreamDecodeTargetDiscretesRequest = new GetEventStreamDecodeTargetDiscretesRequest(); // GetEventStreamDecodeTargetDiscretesRequest | Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a list of all the currently configured decode targets along with any counts             If a target does not appear in the sampled data it will be returned with a count of zero so it can be optionally filtered out of any picklist
    try {
      GetEventStreamDecodeTargetDiscretesDefaultResponse result = apiInstance.getEventStreamDecodeTargetDiscretes(getEventStreamDecodeTargetDiscretesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreamDecodeTargetDiscretes");
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
| **getEventStreamDecodeTargetDiscretesRequest** | [**GetEventStreamDecodeTargetDiscretesRequest**](GetEventStreamDecodeTargetDiscretesRequest.md)| Given an event stream this API will take an event stream column, sample the data using the specified dates, apply any published transform and then return a list of all the currently configured decode targets along with any counts             If a target does not appear in the sampled data it will be returned with a count of zero so it can be optionally filtered out of any picklist | |

### Return type

[**GetEventStreamDecodeTargetDiscretesDefaultResponse**](GetEventStreamDecodeTargetDiscretesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreamDiscreteValues"></a>
# **getEventStreamDiscreteValues**
> GetEventStreamDiscreteValuesDefaultResponse getEventStreamDiscreteValues(getEventStreamDiscreteValuesRequest)

Obtain discrete values from an event stream table             Supports use of a snapshot table which should reduce the chances of us blowing the Engine discrete limit.             The first parameters constitute the sankey filters and thereby the starting set for discretes             It will also allow us to filter the values by the specified discrete filters             If the sankey filters return no data then an execption is thrown stating that \&quot;No data is available for the specified filters\&quot; as this is probably not what the user wants             If the discretes filter suppresses out all data in the sankey then no exception is raised but zero totals are returned

Obtain discrete values from an event stream table             Supports use of a snapshot table which should reduce the chances of us blowing the Engine discrete limit.             The first parameters constitute the sankey filters and thereby the starting set for discretes             It will also allow us to filter the values by the specified discrete filters             If the sankey filters return no data then an execption is thrown stating that \&quot;No data is available for the specified filters\&quot; as this is probably not what the user wants             If the discretes filter suppresses out all data in the sankey then no exception is raised but zero totals are returned

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamDiscreteValuesRequest getEventStreamDiscreteValuesRequest = new GetEventStreamDiscreteValuesRequest(); // GetEventStreamDiscreteValuesRequest | Obtain discrete values from an event stream table             Supports use of a snapshot table which should reduce the chances of us blowing the Engine discrete limit.             The first parameters constitute the sankey filters and thereby the starting set for discretes             It will also allow us to filter the values by the specified discrete filters             If the sankey filters return no data then an execption is thrown stating that \"No data is available for the specified filters\" as this is probably not what the user wants             If the discretes filter suppresses out all data in the sankey then no exception is raised but zero totals are returned
    try {
      GetEventStreamDiscreteValuesDefaultResponse result = apiInstance.getEventStreamDiscreteValues(getEventStreamDiscreteValuesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreamDiscreteValues");
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
| **getEventStreamDiscreteValuesRequest** | [**GetEventStreamDiscreteValuesRequest**](GetEventStreamDiscreteValuesRequest.md)| Obtain discrete values from an event stream table             Supports use of a snapshot table which should reduce the chances of us blowing the Engine discrete limit.             The first parameters constitute the sankey filters and thereby the starting set for discretes             It will also allow us to filter the values by the specified discrete filters             If the sankey filters return no data then an execption is thrown stating that \&quot;No data is available for the specified filters\&quot; as this is probably not what the user wants             If the discretes filter suppresses out all data in the sankey then no exception is raised but zero totals are returned | |

### Return type

[**GetEventStreamDiscreteValuesDefaultResponse**](GetEventStreamDiscreteValuesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreamModels"></a>
# **getEventStreamModels**
> GetEventStreamModelsDefaultResponse getEventStreamModels(getEventStreamModelsRequest)

Retrieve available models

Retrieve available models

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetEventStreamModelsRequest getEventStreamModelsRequest = new GetEventStreamModelsRequest(); // GetEventStreamModelsRequest | Retrieve available models
    try {
      GetEventStreamModelsDefaultResponse result = apiInstance.getEventStreamModels(getEventStreamModelsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreamModels");
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
| **getEventStreamModelsRequest** | [**GetEventStreamModelsRequest**](GetEventStreamModelsRequest.md)| Retrieve available models | |

### Return type

[**GetEventStreamModelsDefaultResponse**](GetEventStreamModelsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getEventStreams"></a>
# **getEventStreams**
> GetEventStreamsDefaultResponse getEventStreams(getClientSetsRequest)

Returns back a list of event streams which exist in the system

Returns back a list of event streams which exist in the system

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetClientSetsRequest getClientSetsRequest = new GetClientSetsRequest(); // GetClientSetsRequest | Returns back a list of event streams which exist in the system
    try {
      GetEventStreamsDefaultResponse result = apiInstance.getEventStreams(getClientSetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getEventStreams");
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
| **getClientSetsRequest** | [**GetClientSetsRequest**](GetClientSetsRequest.md)| Returns back a list of event streams which exist in the system | |

### Return type

[**GetEventStreamsDefaultResponse**](GetEventStreamsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getFieldTransformationDiscreteValues"></a>
# **getFieldTransformationDiscreteValues**
> GetEventStreamDecodeTargetDiscretesDefaultResponse getFieldTransformationDiscreteValues(getFieldTransformationDiscreteValuesRequest)

Apply a list of transforms to the discrete values of a column and return the new set of values and their frequencies             If JSONTransforms is not supplied then the results will simply be the discrete values present in the source column after any sample has been applied

Apply a list of transforms to the discrete values of a column and return the new set of values and their frequencies             If JSONTransforms is not supplied then the results will simply be the discrete values present in the source column after any sample has been applied

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetFieldTransformationDiscreteValuesRequest getFieldTransformationDiscreteValuesRequest = new GetFieldTransformationDiscreteValuesRequest(); // GetFieldTransformationDiscreteValuesRequest | Apply a list of transforms to the discrete values of a column and return the new set of values and their frequencies             If JSONTransforms is not supplied then the results will simply be the discrete values present in the source column after any sample has been applied
    try {
      GetEventStreamDecodeTargetDiscretesDefaultResponse result = apiInstance.getFieldTransformationDiscreteValues(getFieldTransformationDiscreteValuesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getFieldTransformationDiscreteValues");
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
| **getFieldTransformationDiscreteValuesRequest** | [**GetFieldTransformationDiscreteValuesRequest**](GetFieldTransformationDiscreteValuesRequest.md)| Apply a list of transforms to the discrete values of a column and return the new set of values and their frequencies             If JSONTransforms is not supplied then the results will simply be the discrete values present in the source column after any sample has been applied | |

### Return type

[**GetEventStreamDecodeTargetDiscretesDefaultResponse**](GetEventStreamDecodeTargetDiscretesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getFieldTransformationMappings"></a>
# **getFieldTransformationMappings**
> GetFieldTransformationMappingsDefaultResponse getFieldTransformationMappings(getFieldTransformationMappingsRequest)

Apply a list of transforms and return information about the transformed value and frequency for each item in the starting set of values             If JSONCompareTransforms is specified then the starting set of values is the result of first applying these to these to the specified column             If JSONCompareTransforms is not specified then the starting set of values is the actual discrete values present in the column

Apply a list of transforms and return information about the transformed value and frequency for each item in the starting set of values             If JSONCompareTransforms is specified then the starting set of values is the result of first applying these to these to the specified column             If JSONCompareTransforms is not specified then the starting set of values is the actual discrete values present in the column

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetFieldTransformationMappingsRequest getFieldTransformationMappingsRequest = new GetFieldTransformationMappingsRequest(); // GetFieldTransformationMappingsRequest | Apply a list of transforms and return information about the transformed value and frequency for each item in the starting set of values             If JSONCompareTransforms is specified then the starting set of values is the result of first applying these to these to the specified column             If JSONCompareTransforms is not specified then the starting set of values is the actual discrete values present in the column
    try {
      GetFieldTransformationMappingsDefaultResponse result = apiInstance.getFieldTransformationMappings(getFieldTransformationMappingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getFieldTransformationMappings");
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
| **getFieldTransformationMappingsRequest** | [**GetFieldTransformationMappingsRequest**](GetFieldTransformationMappingsRequest.md)| Apply a list of transforms and return information about the transformed value and frequency for each item in the starting set of values             If JSONCompareTransforms is specified then the starting set of values is the result of first applying these to these to the specified column             If JSONCompareTransforms is not specified then the starting set of values is the actual discrete values present in the column | |

### Return type

[**GetFieldTransformationMappingsDefaultResponse**](GetFieldTransformationMappingsDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getIdealisedJourneys"></a>
# **getIdealisedJourneys**
> GetIdealisedJourneysDefaultResponse getIdealisedJourneys()

Retrieve a list of Idealised Journeys

Retrieve a list of Idealised Journeys

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    try {
      GetIdealisedJourneysDefaultResponse result = apiInstance.getIdealisedJourneys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getIdealisedJourneys");
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

[**GetIdealisedJourneysDefaultResponse**](GetIdealisedJourneysDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getSankeyFavourites"></a>
# **getSankeyFavourites**
> GetSankeyFavouritesDefaultResponse getSankeyFavourites(getSankeyFavouritesRequest)

Retrieve a list of Sankey Favourites

Retrieve a list of Sankey Favourites

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    GetSankeyFavouritesRequest getSankeyFavouritesRequest = new GetSankeyFavouritesRequest(); // GetSankeyFavouritesRequest | Retrieve a list of Sankey Favourites
    try {
      GetSankeyFavouritesDefaultResponse result = apiInstance.getSankeyFavourites(getSankeyFavouritesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getSankeyFavourites");
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
| **getSankeyFavouritesRequest** | [**GetSankeyFavouritesRequest**](GetSankeyFavouritesRequest.md)| Retrieve a list of Sankey Favourites | |

### Return type

[**GetSankeyFavouritesDefaultResponse**](GetSankeyFavouritesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="getVisualisationFavourites"></a>
# **getVisualisationFavourites**
> GetVisualisationFavouritesDefaultResponse getVisualisationFavourites()

Retrieve a list of Visualisation Favourites

Retrieve a list of Visualisation Favourites

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    try {
      GetVisualisationFavouritesDefaultResponse result = apiInstance.getVisualisationFavourites();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#getVisualisationFavourites");
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

[**GetVisualisationFavouritesDefaultResponse**](GetVisualisationFavouritesDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="queryEventStream"></a>
# **queryEventStream**
> QueryEventStreamDefaultResponse queryEventStream(queryEventStreamRequest)

Queries the domain of selected event records that is represented by the date and event type filters, returning the list of events and graph of transition streams along with frequency counts.             Transitions will specify start and end points using indices into the list of events, along with some special values.             The &#39;Drop off&#39; points where a stream ends will be assigned an index of -1.             Any transition to an event that does not fall into the TopN specification will be assigned to an &#39;other events&#39; category with an index of -2.             Right aligned streams will be left-padded up to the MaxLength specification using a &#39;no event&#39; category with an index of -3.             If timeout events are required then the start of the sequence leading up to a timeout will be flagged with an index of -4 and the end with an index of -5.

Queries the domain of selected event records that is represented by the date and event type filters, returning the list of events and graph of transition streams along with frequency counts.             Transitions will specify start and end points using indices into the list of events, along with some special values.             The &#39;Drop off&#39; points where a stream ends will be assigned an index of -1.             Any transition to an event that does not fall into the TopN specification will be assigned to an &#39;other events&#39; category with an index of -2.             Right aligned streams will be left-padded up to the MaxLength specification using a &#39;no event&#39; category with an index of -3.             If timeout events are required then the start of the sequence leading up to a timeout will be flagged with an index of -4 and the end with an index of -5.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    QueryEventStreamRequest queryEventStreamRequest = new QueryEventStreamRequest(); // QueryEventStreamRequest | Queries the domain of selected event records that is represented by the date and event type filters, returning the list of events and graph of transition streams along with frequency counts.             Transitions will specify start and end points using indices into the list of events, along with some special values.             The 'Drop off' points where a stream ends will be assigned an index of -1.             Any transition to an event that does not fall into the TopN specification will be assigned to an 'other events' category with an index of -2.             Right aligned streams will be left-padded up to the MaxLength specification using a 'no event' category with an index of -3.             If timeout events are required then the start of the sequence leading up to a timeout will be flagged with an index of -4 and the end with an index of -5.
    try {
      QueryEventStreamDefaultResponse result = apiInstance.queryEventStream(queryEventStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#queryEventStream");
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
| **queryEventStreamRequest** | [**QueryEventStreamRequest**](QueryEventStreamRequest.md)| Queries the domain of selected event records that is represented by the date and event type filters, returning the list of events and graph of transition streams along with frequency counts.             Transitions will specify start and end points using indices into the list of events, along with some special values.             The &#39;Drop off&#39; points where a stream ends will be assigned an index of -1.             Any transition to an event that does not fall into the TopN specification will be assigned to an &#39;other events&#39; category with an index of -2.             Right aligned streams will be left-padded up to the MaxLength specification using a &#39;no event&#39; category with an index of -3.             If timeout events are required then the start of the sequence leading up to a timeout will be flagged with an index of -4 and the end with an index of -5. | |

### Return type

[**QueryEventStreamDefaultResponse**](QueryEventStreamDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="queryEventStreamCount"></a>
# **queryEventStreamCount**
> QueryEventStreamCountDefaultResponse queryEventStreamCount(queryEventStreamCountRequest)

Take the domain of selected event records that is represented by the date filters, and count streams matching the agreed patterns represented by the CountType parameter

Take the domain of selected event records that is represented by the date filters, and count streams matching the agreed patterns represented by the CountType parameter

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    QueryEventStreamCountRequest queryEventStreamCountRequest = new QueryEventStreamCountRequest(); // QueryEventStreamCountRequest | Take the domain of selected event records that is represented by the date filters, and count streams matching the agreed patterns represented by the CountType parameter
    try {
      QueryEventStreamCountDefaultResponse result = apiInstance.queryEventStreamCount(queryEventStreamCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#queryEventStreamCount");
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
| **queryEventStreamCountRequest** | [**QueryEventStreamCountRequest**](QueryEventStreamCountRequest.md)| Take the domain of selected event records that is represented by the date filters, and count streams matching the agreed patterns represented by the CountType parameter | |

### Return type

[**QueryEventStreamCountDefaultResponse**](QueryEventStreamCountDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="queryEventStreamInteraction"></a>
# **queryEventStreamInteraction**
> GetEventRecordsDefaultResponse queryEventStreamInteraction(exportEventStreamInteractionRequest)

Queries the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False.

Queries the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    ExportEventStreamInteractionRequest exportEventStreamInteractionRequest = new ExportEventStreamInteractionRequest(); // ExportEventStreamInteractionRequest | Queries the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \"other\" events pass all displayed events and set 'IncludeMatchedEvents' to False.
    try {
      GetEventRecordsDefaultResponse result = apiInstance.queryEventStreamInteraction(exportEventStreamInteractionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#queryEventStreamInteraction");
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
| **exportEventStreamInteractionRequest** | [**ExportEventStreamInteractionRequest**](ExportEventStreamInteractionRequest.md)| Queries the domain of a particular node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEvents&#39; to False. | |

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

<a id="queryEventStreamTransition"></a>
# **queryEventStreamTransition**
> GetEventRecordsDefaultResponse queryEventStreamTransition(queryEventStreamTransitionRequest)

Queries the domain from a particular node to another node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEventsFrom&#39; / IncludeMatchedEventsTo to False.

Queries the domain from a particular node to another node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEventsFrom&#39; / IncludeMatchedEventsTo to False.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    QueryEventStreamTransitionRequest queryEventStreamTransitionRequest = new QueryEventStreamTransitionRequest(); // QueryEventStreamTransitionRequest | Queries the domain from a particular node to another node to return a sample of the CXID (VisitorId) values.             To get the results for \"other\" events pass all displayed events and set 'IncludeMatchedEventsFrom' / IncludeMatchedEventsTo to False.
    try {
      GetEventRecordsDefaultResponse result = apiInstance.queryEventStreamTransition(queryEventStreamTransitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#queryEventStreamTransition");
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
| **queryEventStreamTransitionRequest** | [**QueryEventStreamTransitionRequest**](QueryEventStreamTransitionRequest.md)| Queries the domain from a particular node to another node to return a sample of the CXID (VisitorId) values.             To get the results for \&quot;other\&quot; events pass all displayed events and set &#39;IncludeMatchedEventsFrom&#39; / IncludeMatchedEventsTo to False. | |

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

<a id="runSequencePredictor"></a>
# **runSequencePredictor**
> RunSequencePredictorDefaultResponse runSequencePredictor(runSequencePredictorRequest)

Train and employ sequence prediction models for an event stream

Train and employ sequence prediction models for an event stream

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    RunSequencePredictorRequest runSequencePredictorRequest = new RunSequencePredictorRequest(); // RunSequencePredictorRequest | Train and employ sequence prediction models for an event stream
    try {
      RunSequencePredictorDefaultResponse result = apiInstance.runSequencePredictor(runSequencePredictorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#runSequencePredictor");
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
| **runSequencePredictorRequest** | [**RunSequencePredictorRequest**](RunSequencePredictorRequest.md)| Train and employ sequence prediction models for an event stream | |

### Return type

[**RunSequencePredictorDefaultResponse**](RunSequencePredictorDefaultResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Success |  -  |

<a id="updateChannel"></a>
# **updateChannel**
> AUTHChangePasswordDefaultResponse updateChannel(updateChannelRequest)

Updates a channel, allowing you to change the name and colour

Updates a channel, allowing you to change the name and colour

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpdateChannelRequest updateChannelRequest = new UpdateChannelRequest(); // UpdateChannelRequest | Updates a channel, allowing you to change the name and colour
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateChannel(updateChannelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#updateChannel");
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
| **updateChannelRequest** | [**UpdateChannelRequest**](UpdateChannelRequest.md)| Updates a channel, allowing you to change the name and colour | |

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

<a id="updateEventStreamFieldTransformLists"></a>
# **updateEventStreamFieldTransformLists**
> AUTHChangePasswordDefaultResponse updateEventStreamFieldTransformLists(updateEventStreamFieldTransformListsRequest)

Publishes the specified transforms to the corresponding event stream columns             Any existing list for a column that matches on Transform Type and Alias will be replaced

Publishes the specified transforms to the corresponding event stream columns             Any existing list for a column that matches on Transform Type and Alias will be replaced

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpdateEventStreamFieldTransformListsRequest updateEventStreamFieldTransformListsRequest = new UpdateEventStreamFieldTransformListsRequest(); // UpdateEventStreamFieldTransformListsRequest | Publishes the specified transforms to the corresponding event stream columns             Any existing list for a column that matches on Transform Type and Alias will be replaced
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateEventStreamFieldTransformLists(updateEventStreamFieldTransformListsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#updateEventStreamFieldTransformLists");
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
| **updateEventStreamFieldTransformListsRequest** | [**UpdateEventStreamFieldTransformListsRequest**](UpdateEventStreamFieldTransformListsRequest.md)| Publishes the specified transforms to the corresponding event stream columns             Any existing list for a column that matches on Transform Type and Alias will be replaced | |

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

<a id="updateIdealisedJourney"></a>
# **updateIdealisedJourney**
> AUTHChangePasswordDefaultResponse updateIdealisedJourney(updateIdealisedJourneyRequest)

Update an Idealised Journey

Update an Idealised Journey

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpdateIdealisedJourneyRequest updateIdealisedJourneyRequest = new UpdateIdealisedJourneyRequest(); // UpdateIdealisedJourneyRequest | Update an Idealised Journey
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateIdealisedJourney(updateIdealisedJourneyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#updateIdealisedJourney");
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
| **updateIdealisedJourneyRequest** | [**UpdateIdealisedJourneyRequest**](UpdateIdealisedJourneyRequest.md)| Update an Idealised Journey | |

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

<a id="updateSankeyFavourite"></a>
# **updateSankeyFavourite**
> AUTHChangePasswordDefaultResponse updateSankeyFavourite(updateSankeyFavouriteRequest)

Update a SankeyFavourite

Update a SankeyFavourite

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpdateSankeyFavouriteRequest updateSankeyFavouriteRequest = new UpdateSankeyFavouriteRequest(); // UpdateSankeyFavouriteRequest | Update a SankeyFavourite
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateSankeyFavourite(updateSankeyFavouriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#updateSankeyFavourite");
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
| **updateSankeyFavouriteRequest** | [**UpdateSankeyFavouriteRequest**](UpdateSankeyFavouriteRequest.md)| Update a SankeyFavourite | |

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

<a id="updateVisualisationFavourite"></a>
# **updateVisualisationFavourite**
> AUTHChangePasswordDefaultResponse updateVisualisationFavourite(updateVisualisationFavouriteRequest)

Update a Visualisation Favourite

Update a Visualisation Favourite

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpdateVisualisationFavouriteRequest updateVisualisationFavouriteRequest = new UpdateVisualisationFavouriteRequest(); // UpdateVisualisationFavouriteRequest | Update a Visualisation Favourite
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.updateVisualisationFavourite(updateVisualisationFavouriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#updateVisualisationFavourite");
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
| **updateVisualisationFavouriteRequest** | [**UpdateVisualisationFavouriteRequest**](UpdateVisualisationFavouriteRequest.md)| Update a Visualisation Favourite | |

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

<a id="upsertEventStreamCustomerColumns"></a>
# **upsertEventStreamCustomerColumns**
> AUTHChangePasswordDefaultResponse upsertEventStreamCustomerColumns(upsertEventStreamCustomerColumnsRequest)

Add or update customer attribute columns for an @see(EventStream).             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.

Add or update customer attribute columns for an @see(EventStream).             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpsertEventStreamCustomerColumnsRequest upsertEventStreamCustomerColumnsRequest = new UpsertEventStreamCustomerColumnsRequest(); // UpsertEventStreamCustomerColumnsRequest | Add or update customer attribute columns for an @see(EventStream).             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.upsertEventStreamCustomerColumns(upsertEventStreamCustomerColumnsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#upsertEventStreamCustomerColumns");
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
| **upsertEventStreamCustomerColumnsRequest** | [**UpsertEventStreamCustomerColumnsRequest**](UpsertEventStreamCustomerColumnsRequest.md)| Add or update customer attribute columns for an @see(EventStream).             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements. | |

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

<a id="upsertEventStreamCustomerColumnsToGroup"></a>
# **upsertEventStreamCustomerColumnsToGroup**
> AUTHChangePasswordDefaultResponse upsertEventStreamCustomerColumnsToGroup(upsertEventStreamCustomerColumnsToGroupRequest)

Add or update customer attribute columns to the @see(EventStream)s in a group.             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.             There is some latency (up to 5 mins) between a column being created and the queue service starting to read the data unless the queue service is restarted

Add or update customer attribute columns to the @see(EventStream)s in a group.             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.             There is some latency (up to 5 mins) between a column being created and the queue service starting to read the data unless the queue service is restarted

### Example
```java
// Import classes:
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.Configuration;
import com.alterian.ja.auth.*;
import com.alterian.ja.models.*;
import com.alterian.ja.api.EventStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/services/api.svc/jsonsdk");
    
    // Configure API key authorization: TokenAuth
    ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
    TokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TokenAuth.setApiKeyPrefix("Token");

    EventStreamsApi apiInstance = new EventStreamsApi(defaultClient);
    UpsertEventStreamCustomerColumnsToGroupRequest upsertEventStreamCustomerColumnsToGroupRequest = new UpsertEventStreamCustomerColumnsToGroupRequest(); // UpsertEventStreamCustomerColumnsToGroupRequest | Add or update customer attribute columns to the @see(EventStream)s in a group.             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.             There is some latency (up to 5 mins) between a column being created and the queue service starting to read the data unless the queue service is restarted
    try {
      AUTHChangePasswordDefaultResponse result = apiInstance.upsertEventStreamCustomerColumnsToGroup(upsertEventStreamCustomerColumnsToGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventStreamsApi#upsertEventStreamCustomerColumnsToGroup");
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
| **upsertEventStreamCustomerColumnsToGroupRequest** | [**UpsertEventStreamCustomerColumnsToGroupRequest**](UpsertEventStreamCustomerColumnsToGroupRequest.md)| Add or update customer attribute columns to the @see(EventStream)s in a group.             Only updates to column width (that are atomic and have no truncation risk) are currenty supported.              Width only needs to be specified for text or unicode columns.              The number of allowed columns is capped.              Customer attribute columns must maintain discrete cardinality to be used in the Sankey.              Names must meet Engine naming requirements.             There is some latency (up to 5 mins) between a column being created and the queue service starting to read the data unless the queue service is restarted | |

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

