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
import com.alterian.ja.model.ClearPermissionsRequest;
import com.alterian.ja.model.GetAvailablePermissionsDefaultResponse;
import com.alterian.ja.model.GetGroupsWithPermissionDefaultResponse;
import com.alterian.ja.model.GetGroupsWithPermissionRequest;
import com.alterian.ja.model.GetPermissionsDefaultResponse;
import com.alterian.ja.model.GetPermissionsRequest;
import com.alterian.ja.model.GetPermittedUsersAndGroupsRequest;
import com.alterian.ja.model.GetResourcesDefaultResponse;
import com.alterian.ja.model.GetUsersWithPermissionRequest;
import com.alterian.ja.model.SetPermissionsRequest;
import com.alterian.ja.model.TakeOwnershipPermissionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionsApi
 */
@Disabled
public class PermissionsApiTest {

    private final PermissionsApi api = new PermissionsApi();

    /**
     * Clear the permissions for the specific security ID
     *
     * Clear the permissions for the specific security ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearPermissionsTest() throws ApiException {
        ClearPermissionsRequest clearPermissionsRequest = null;
        AUTHChangePasswordDefaultResponse response = api.clearPermissions(clearPermissionsRequest);
        // TODO: test validations
    }

    /**
     * Gets a list of the permissions; this is a simple list and does not include permission values, etc.
     *
     * Gets a list of the permissions; this is a simple list and does not include permission values, etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvailablePermissionsTest() throws ApiException {
        GetAvailablePermissionsDefaultResponse response = api.getAvailablePermissions();
        // TODO: test validations
    }

    /**
     * List the groups which have been granted the specified permission
     *
     * List the groups which have been granted the specified permission
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupsWithPermissionTest() throws ApiException {
        GetGroupsWithPermissionRequest getGroupsWithPermissionRequest = null;
        GetGroupsWithPermissionDefaultResponse response = api.getGroupsWithPermission(getGroupsWithPermissionRequest);
        // TODO: test validations
    }

    /**
     * Given a particular item, fetch a list of permissions on that item for a given user or group.
     *
     * Given a particular item, fetch a list of permissions on that item for a given user or group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPermissionsTest() throws ApiException {
        GetPermissionsRequest getPermissionsRequest = null;
        GetPermissionsDefaultResponse response = api.getPermissions(getPermissionsRequest);
        // TODO: test validations
    }

    /**
     * List the users and groups which have direct or indirect access to the specified item
     *
     * List the users and groups which have direct or indirect access to the specified item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPermittedUsersAndGroupsTest() throws ApiException {
        GetPermittedUsersAndGroupsRequest getPermittedUsersAndGroupsRequest = null;
        GetGroupsWithPermissionDefaultResponse response = api.getPermittedUsersAndGroups(getPermittedUsersAndGroupsRequest);
        // TODO: test validations
    }

    /**
     * Gets a list of the resource types for permissions
     *
     * Gets a list of the resource types for permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourcesTest() throws ApiException {
        GetResourcesDefaultResponse response = api.getResources();
        // TODO: test validations
    }

    /**
     * List the users which have been granted the specified permission
     *
     * List the users which have been granted the specified permission
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersWithPermissionTest() throws ApiException {
        GetUsersWithPermissionRequest getUsersWithPermissionRequest = null;
        GetGroupsWithPermissionDefaultResponse response = api.getUsersWithPermission(getUsersWithPermissionRequest);
        // TODO: test validations
    }

    /**
     * Set permissions for a particular item and securityID
     *
     * Set permissions for a particular item and securityID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setPermissionsTest() throws ApiException {
        SetPermissionsRequest setPermissionsRequest = null;
        AUTHChangePasswordDefaultResponse response = api.setPermissions(setPermissionsRequest);
        // TODO: test validations
    }

    /**
     * Change the owner of a particular item from the current owner to somebody else
     *
     * Change the owner of a particular item from the current owner to somebody else
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void takeOwnershipPermissionTest() throws ApiException {
        TakeOwnershipPermissionRequest takeOwnershipPermissionRequest = null;
        AUTHChangePasswordDefaultResponse response = api.takeOwnershipPermission(takeOwnershipPermissionRequest);
        // TODO: test validations
    }

}
