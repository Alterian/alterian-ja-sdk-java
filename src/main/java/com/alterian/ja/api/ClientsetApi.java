/*
 * Journey Analytics API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.35.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.ja.api;

import com.alterian.ja.ApiCallback;
import com.alterian.ja.ApiClient;
import com.alterian.ja.ApiException;
import com.alterian.ja.ApiResponse;
import com.alterian.ja.Configuration;
import com.alterian.ja.Pair;
import com.alterian.ja.ProgressRequestBody;
import com.alterian.ja.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alterian.ja.model.AUTHChangePasswordDefaultResponse;
import com.alterian.ja.model.AddClientToClientSetRequest;
import com.alterian.ja.model.CreateClientDefaultResponse;
import com.alterian.ja.model.CreateClientSetRequest;
import com.alterian.ja.model.DeleteClientSetRequest;
import com.alterian.ja.model.GetClientSetsDefaultResponse;
import com.alterian.ja.model.GetClientSetsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientsetApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ClientsetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientsetApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for addClientToClientSet
     * @param addClientToClientSetRequest Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addClientToClientSetCall(AddClientToClientSetRequest addClientToClientSetRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addClientToClientSetRequest;

        // create path and map variables
        String localVarPath = "/AddClientToClientSet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addClientToClientSetValidateBeforeCall(AddClientToClientSetRequest addClientToClientSetRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'addClientToClientSetRequest' is set
        if (addClientToClientSetRequest == null) {
            throw new ApiException("Missing the required parameter 'addClientToClientSetRequest' when calling addClientToClientSet(Async)");
        }

        return addClientToClientSetCall(addClientToClientSetRequest, _callback);

    }

    /**
     * Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset
     * Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset
     * @param addClientToClientSetRequest Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset (required)
     * @return AUTHChangePasswordDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public AUTHChangePasswordDefaultResponse addClientToClientSet(AddClientToClientSetRequest addClientToClientSetRequest) throws ApiException {
        ApiResponse<AUTHChangePasswordDefaultResponse> localVarResp = addClientToClientSetWithHttpInfo(addClientToClientSetRequest);
        return localVarResp.getData();
    }

    /**
     * Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset
     * Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset
     * @param addClientToClientSetRequest Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset (required)
     * @return ApiResponse&lt;AUTHChangePasswordDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AUTHChangePasswordDefaultResponse> addClientToClientSetWithHttpInfo(AddClientToClientSetRequest addClientToClientSetRequest) throws ApiException {
        okhttp3.Call localVarCall = addClientToClientSetValidateBeforeCall(addClientToClientSetRequest, null);
        Type localVarReturnType = new TypeToken<AUTHChangePasswordDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset (asynchronously)
     * Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset
     * @param addClientToClientSetRequest Move a @see(ALClient) from it&#39;s current @see(ALClientSet) to another clientset (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addClientToClientSetAsync(AddClientToClientSetRequest addClientToClientSetRequest, final ApiCallback<AUTHChangePasswordDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addClientToClientSetValidateBeforeCall(addClientToClientSetRequest, _callback);
        Type localVarReturnType = new TypeToken<AUTHChangePasswordDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createClientSet
     * @param createClientSetRequest Create a new @see(ALClientSet) within the system. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createClientSetCall(CreateClientSetRequest createClientSetRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createClientSetRequest;

        // create path and map variables
        String localVarPath = "/CreateClientSet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createClientSetValidateBeforeCall(CreateClientSetRequest createClientSetRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createClientSetRequest' is set
        if (createClientSetRequest == null) {
            throw new ApiException("Missing the required parameter 'createClientSetRequest' when calling createClientSet(Async)");
        }

        return createClientSetCall(createClientSetRequest, _callback);

    }

    /**
     * Create a new @see(ALClientSet) within the system.
     * Create a new @see(ALClientSet) within the system.
     * @param createClientSetRequest Create a new @see(ALClientSet) within the system. (required)
     * @return CreateClientDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CreateClientDefaultResponse createClientSet(CreateClientSetRequest createClientSetRequest) throws ApiException {
        ApiResponse<CreateClientDefaultResponse> localVarResp = createClientSetWithHttpInfo(createClientSetRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new @see(ALClientSet) within the system.
     * Create a new @see(ALClientSet) within the system.
     * @param createClientSetRequest Create a new @see(ALClientSet) within the system. (required)
     * @return ApiResponse&lt;CreateClientDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateClientDefaultResponse> createClientSetWithHttpInfo(CreateClientSetRequest createClientSetRequest) throws ApiException {
        okhttp3.Call localVarCall = createClientSetValidateBeforeCall(createClientSetRequest, null);
        Type localVarReturnType = new TypeToken<CreateClientDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new @see(ALClientSet) within the system. (asynchronously)
     * Create a new @see(ALClientSet) within the system.
     * @param createClientSetRequest Create a new @see(ALClientSet) within the system. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createClientSetAsync(CreateClientSetRequest createClientSetRequest, final ApiCallback<CreateClientDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createClientSetValidateBeforeCall(createClientSetRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateClientDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteClientSet
     * @param deleteClientSetRequest Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteClientSetCall(DeleteClientSetRequest deleteClientSetRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteClientSetRequest;

        // create path and map variables
        String localVarPath = "/DeleteClientSet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteClientSetValidateBeforeCall(DeleteClientSetRequest deleteClientSetRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deleteClientSetRequest' is set
        if (deleteClientSetRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteClientSetRequest' when calling deleteClientSet(Async)");
        }

        return deleteClientSetCall(deleteClientSetRequest, _callback);

    }

    /**
     * Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion
     * Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion
     * @param deleteClientSetRequest Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion (required)
     * @return AUTHChangePasswordDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public AUTHChangePasswordDefaultResponse deleteClientSet(DeleteClientSetRequest deleteClientSetRequest) throws ApiException {
        ApiResponse<AUTHChangePasswordDefaultResponse> localVarResp = deleteClientSetWithHttpInfo(deleteClientSetRequest);
        return localVarResp.getData();
    }

    /**
     * Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion
     * Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion
     * @param deleteClientSetRequest Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion (required)
     * @return ApiResponse&lt;AUTHChangePasswordDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AUTHChangePasswordDefaultResponse> deleteClientSetWithHttpInfo(DeleteClientSetRequest deleteClientSetRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteClientSetValidateBeforeCall(deleteClientSetRequest, null);
        Type localVarReturnType = new TypeToken<AUTHChangePasswordDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion (asynchronously)
     * Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion
     * @param deleteClientSetRequest Remove the given @see(ALClientSet) from the system. This method will fail if any @see(ALClient) exists within the clientset - i.e. the clientset must be empty before deletion (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteClientSetAsync(DeleteClientSetRequest deleteClientSetRequest, final ApiCallback<AUTHChangePasswordDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteClientSetValidateBeforeCall(deleteClientSetRequest, _callback);
        Type localVarReturnType = new TypeToken<AUTHChangePasswordDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getClientSets
     * @param getClientSetsRequest List all the clientsets within the system (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getClientSetsCall(GetClientSetsRequest getClientSetsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getClientSetsRequest;

        // create path and map variables
        String localVarPath = "/GetClientSets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getClientSetsValidateBeforeCall(GetClientSetsRequest getClientSetsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getClientSetsRequest' is set
        if (getClientSetsRequest == null) {
            throw new ApiException("Missing the required parameter 'getClientSetsRequest' when calling getClientSets(Async)");
        }

        return getClientSetsCall(getClientSetsRequest, _callback);

    }

    /**
     * List all the clientsets within the system
     * List all the clientsets within the system
     * @param getClientSetsRequest List all the clientsets within the system (required)
     * @return GetClientSetsDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetClientSetsDefaultResponse getClientSets(GetClientSetsRequest getClientSetsRequest) throws ApiException {
        ApiResponse<GetClientSetsDefaultResponse> localVarResp = getClientSetsWithHttpInfo(getClientSetsRequest);
        return localVarResp.getData();
    }

    /**
     * List all the clientsets within the system
     * List all the clientsets within the system
     * @param getClientSetsRequest List all the clientsets within the system (required)
     * @return ApiResponse&lt;GetClientSetsDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetClientSetsDefaultResponse> getClientSetsWithHttpInfo(GetClientSetsRequest getClientSetsRequest) throws ApiException {
        okhttp3.Call localVarCall = getClientSetsValidateBeforeCall(getClientSetsRequest, null);
        Type localVarReturnType = new TypeToken<GetClientSetsDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all the clientsets within the system (asynchronously)
     * List all the clientsets within the system
     * @param getClientSetsRequest List all the clientsets within the system (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getClientSetsAsync(GetClientSetsRequest getClientSetsRequest, final ApiCallback<GetClientSetsDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClientSetsValidateBeforeCall(getClientSetsRequest, _callback);
        Type localVarReturnType = new TypeToken<GetClientSetsDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
