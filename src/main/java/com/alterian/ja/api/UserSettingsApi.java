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
import com.alterian.ja.model.GetDataSourceEngineUserNameDefaultResponse;
import com.alterian.ja.model.GetUserSettingRequest;
import com.alterian.ja.model.SetUserSettingRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserSettingsApi(ApiClient apiClient) {
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
     * Build call for getUserSetting
     * @param getUserSettingRequest Returns back a value for a user setting (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserSettingCall(GetUserSettingRequest getUserSettingRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getUserSettingRequest;

        // create path and map variables
        String localVarPath = "/GetUserSetting";

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
    private okhttp3.Call getUserSettingValidateBeforeCall(GetUserSettingRequest getUserSettingRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getUserSettingRequest' is set
        if (getUserSettingRequest == null) {
            throw new ApiException("Missing the required parameter 'getUserSettingRequest' when calling getUserSetting(Async)");
        }

        return getUserSettingCall(getUserSettingRequest, _callback);

    }

    /**
     * Returns back a value for a user setting
     * Returns back a value for a user setting
     * @param getUserSettingRequest Returns back a value for a user setting (required)
     * @return GetDataSourceEngineUserNameDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetDataSourceEngineUserNameDefaultResponse getUserSetting(GetUserSettingRequest getUserSettingRequest) throws ApiException {
        ApiResponse<GetDataSourceEngineUserNameDefaultResponse> localVarResp = getUserSettingWithHttpInfo(getUserSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Returns back a value for a user setting
     * Returns back a value for a user setting
     * @param getUserSettingRequest Returns back a value for a user setting (required)
     * @return ApiResponse&lt;GetDataSourceEngineUserNameDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetDataSourceEngineUserNameDefaultResponse> getUserSettingWithHttpInfo(GetUserSettingRequest getUserSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = getUserSettingValidateBeforeCall(getUserSettingRequest, null);
        Type localVarReturnType = new TypeToken<GetDataSourceEngineUserNameDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns back a value for a user setting (asynchronously)
     * Returns back a value for a user setting
     * @param getUserSettingRequest Returns back a value for a user setting (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserSettingAsync(GetUserSettingRequest getUserSettingRequest, final ApiCallback<GetDataSourceEngineUserNameDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserSettingValidateBeforeCall(getUserSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<GetDataSourceEngineUserNameDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setUserSetting
     * @param setUserSettingRequest Sets a user setting to the provided value (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setUserSettingCall(SetUserSettingRequest setUserSettingRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setUserSettingRequest;

        // create path and map variables
        String localVarPath = "/SetUserSetting";

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
    private okhttp3.Call setUserSettingValidateBeforeCall(SetUserSettingRequest setUserSettingRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'setUserSettingRequest' is set
        if (setUserSettingRequest == null) {
            throw new ApiException("Missing the required parameter 'setUserSettingRequest' when calling setUserSetting(Async)");
        }

        return setUserSettingCall(setUserSettingRequest, _callback);

    }

    /**
     * Sets a user setting to the provided value
     * Sets a user setting to the provided value
     * @param setUserSettingRequest Sets a user setting to the provided value (required)
     * @return AUTHChangePasswordDefaultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public AUTHChangePasswordDefaultResponse setUserSetting(SetUserSettingRequest setUserSettingRequest) throws ApiException {
        ApiResponse<AUTHChangePasswordDefaultResponse> localVarResp = setUserSettingWithHttpInfo(setUserSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Sets a user setting to the provided value
     * Sets a user setting to the provided value
     * @param setUserSettingRequest Sets a user setting to the provided value (required)
     * @return ApiResponse&lt;AUTHChangePasswordDefaultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AUTHChangePasswordDefaultResponse> setUserSettingWithHttpInfo(SetUserSettingRequest setUserSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = setUserSettingValidateBeforeCall(setUserSettingRequest, null);
        Type localVarReturnType = new TypeToken<AUTHChangePasswordDefaultResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sets a user setting to the provided value (asynchronously)
     * Sets a user setting to the provided value
     * @param setUserSettingRequest Sets a user setting to the provided value (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setUserSettingAsync(SetUserSettingRequest setUserSettingRequest, final ApiCallback<AUTHChangePasswordDefaultResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setUserSettingValidateBeforeCall(setUserSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<AUTHChangePasswordDefaultResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}