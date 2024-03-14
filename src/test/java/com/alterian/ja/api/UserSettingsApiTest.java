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
import com.alterian.ja.model.GetDataSourceEngineUserNameDefaultResponse;
import com.alterian.ja.model.GetUserSettingRequest;
import com.alterian.ja.model.SetUserSettingRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserSettingsApi
 */
@Disabled
public class UserSettingsApiTest {

    private final UserSettingsApi api = new UserSettingsApi();

    /**
     * Returns back a value for a user setting
     *
     * Returns back a value for a user setting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserSettingTest() throws ApiException {
        GetUserSettingRequest getUserSettingRequest = null;
        GetDataSourceEngineUserNameDefaultResponse response = api.getUserSetting(getUserSettingRequest);
        // TODO: test validations
    }

    /**
     * Sets a user setting to the provided value
     *
     * Sets a user setting to the provided value
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setUserSettingTest() throws ApiException {
        SetUserSettingRequest setUserSettingRequest = null;
        AUTHChangePasswordDefaultResponse response = api.setUserSetting(setUserSettingRequest);
        // TODO: test validations
    }

}
