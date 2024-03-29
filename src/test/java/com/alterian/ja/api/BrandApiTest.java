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

import com.alterian.ja.ApiException;
import com.alterian.ja.model.AUTHChangePasswordDefaultResponse;
import com.alterian.ja.model.AUTHCreateLoginDefaultResponse;
import com.alterian.ja.model.AddLoginImpersonationRequest;
import com.alterian.ja.model.AddUserToBrandsRequest;
import com.alterian.ja.model.GetBrandTokenRequest;
import com.alterian.ja.model.GetBrandsDefaultResponse;
import com.alterian.ja.model.GetBrandsRequest;
import com.alterian.ja.model.GetLoginBrandDefaultDefaultResponse;
import com.alterian.ja.model.GetLoginBrandDefaultRequest;
import com.alterian.ja.model.GetLoginUserMappingDefaultResponse;
import com.alterian.ja.model.GetLoginUserMappingRequest;
import com.alterian.ja.model.GetTokenDetailsDefaultResponse;
import com.alterian.ja.model.RemoveLoginBrandDefaultRequest;
import com.alterian.ja.model.RemoveLoginImpersonationRequest;
import com.alterian.ja.model.RemoveLoginUserMappingRequest;
import com.alterian.ja.model.SetLoginBrandDefaultRequest;
import com.alterian.ja.model.SetLoginUserMappingRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrandApi
 */
@Disabled
public class BrandApiTest {

    private final BrandApi api = new BrandApi();

    /**
     * Allow a login to use the impersonation feature of GetBrandToken
     *
     * Allow a login to use the impersonation feature of GetBrandToken
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addLoginImpersonationTest() throws ApiException {
        AddLoginImpersonationRequest addLoginImpersonationRequest = null;
        AUTHChangePasswordDefaultResponse response = api.addLoginImpersonation(addLoginImpersonationRequest);
        // TODO: test validations
    }

    /**
     * Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access
     *
     * Replicates a user from the brand associated with the current token to all brands in BrandIds to which the token has access
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToBrandsTest() throws ApiException {
        AddUserToBrandsRequest addUserToBrandsRequest = null;
        AUTHChangePasswordDefaultResponse response = api.addUserToBrands(addUserToBrandsRequest);
        // TODO: test validations
    }

    /**
     * Returns back a token used to access the brand provided.
     *
     * Returns back a token used to access the brand provided.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBrandTokenTest() throws ApiException {
        GetBrandTokenRequest getBrandTokenRequest = null;
        AUTHCreateLoginDefaultResponse response = api.getBrandToken(getBrandTokenRequest);
        // TODO: test validations
    }

    /**
     * Returns back a list of brands which this login can access
     *
     * Returns back a list of brands which this login can access
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBrandsTest() throws ApiException {
        GetBrandsRequest getBrandsRequest = null;
        GetBrandsDefaultResponse response = api.getBrands(getBrandsRequest);
        // TODO: test validations
    }

    /**
     * Returns back the brand default for the specified login
     *
     * Returns back the brand default for the specified login
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoginBrandDefaultTest() throws ApiException {
        GetLoginBrandDefaultRequest getLoginBrandDefaultRequest = null;
        GetLoginBrandDefaultDefaultResponse response = api.getLoginBrandDefault(getLoginBrandDefaultRequest);
        // TODO: test validations
    }

    /**
     * Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token&#39;s login
     *
     * Look in the system for a login\\user mapping which matches the search criteria.  Note, if you do not provide either the login id or user id, it will return back the mapping for the token&#39;s login
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoginUserMappingTest() throws ApiException {
        GetLoginUserMappingRequest getLoginUserMappingRequest = null;
        GetLoginUserMappingDefaultResponse response = api.getLoginUserMapping(getLoginUserMappingRequest);
        // TODO: test validations
    }

    /**
     * Request details about a token.
     *
     * Request details about a token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenDetailsTest() throws ApiException {
        GetTokenDetailsDefaultResponse response = api.getTokenDetails();
        // TODO: test validations
    }

    /**
     * Removes a login brand default
     *
     * Removes a login brand default
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLoginBrandDefaultTest() throws ApiException {
        RemoveLoginBrandDefaultRequest removeLoginBrandDefaultRequest = null;
        AUTHChangePasswordDefaultResponse response = api.removeLoginBrandDefault(removeLoginBrandDefaultRequest);
        // TODO: test validations
    }

    /**
     * Stop allowing a login from using the impersonation feature of GetBrandToken
     *
     * Stop allowing a login from using the impersonation feature of GetBrandToken
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLoginImpersonationTest() throws ApiException {
        RemoveLoginImpersonationRequest removeLoginImpersonationRequest = null;
        AUTHChangePasswordDefaultResponse response = api.removeLoginImpersonation(removeLoginImpersonationRequest);
        // TODO: test validations
    }

    /**
     * Remove a login\\user mapping
     *
     * Remove a login\\user mapping
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLoginUserMappingTest() throws ApiException {
        RemoveLoginUserMappingRequest removeLoginUserMappingRequest = null;
        AUTHChangePasswordDefaultResponse response = api.removeLoginUserMapping(removeLoginUserMappingRequest);
        // TODO: test validations
    }

    /**
     * Sets a login&#39;s brand to the default brand specified
     *
     * Sets a login&#39;s brand to the default brand specified
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setLoginBrandDefaultTest() throws ApiException {
        SetLoginBrandDefaultRequest setLoginBrandDefaultRequest = null;
        AUTHChangePasswordDefaultResponse response = api.setLoginBrandDefault(setLoginBrandDefaultRequest);
        // TODO: test validations
    }

    /**
     * Sets the login\\user mapping
     *
     * Sets the login\\user mapping
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setLoginUserMappingTest() throws ApiException {
        SetLoginUserMappingRequest setLoginUserMappingRequest = null;
        AUTHChangePasswordDefaultResponse response = api.setLoginUserMapping(setLoginUserMappingRequest);
        // TODO: test validations
    }

}
