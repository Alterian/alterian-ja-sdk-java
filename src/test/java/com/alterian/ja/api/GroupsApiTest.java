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
import com.alterian.ja.model.CopyGroupRequest;
import com.alterian.ja.model.CreateClientDefaultResponse;
import com.alterian.ja.model.CreateGroupRequest;
import com.alterian.ja.model.DeleteGroupRequest;
import com.alterian.ja.model.GetGroupDefaultResponse;
import com.alterian.ja.model.GetGroupMembersDefaultResponse;
import com.alterian.ja.model.GetGroupMembersRequest;
import com.alterian.ja.model.GetGroupRequest;
import com.alterian.ja.model.GetGroupsDefaultResponse;
import com.alterian.ja.model.GetGroupsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Disabled
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    /**
     * Copy a group from one folder to another
     *
     * Copy a group from one folder to another
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void copyGroupTest() throws ApiException {
        CopyGroupRequest copyGroupRequest = null;
        CreateClientDefaultResponse response = api.copyGroup(copyGroupRequest);
        // TODO: test validations
    }

    /**
     * Create a group
     *
     * Create a group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        CreateGroupRequest createGroupRequest = null;
        CreateClientDefaultResponse response = api.createGroup(createGroupRequest);
        // TODO: test validations
    }

    /**
     * Delete a group
     *
     * Delete a group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteGroupTest() throws ApiException {
        DeleteGroupRequest deleteGroupRequest = null;
        AUTHChangePasswordDefaultResponse response = api.deleteGroup(deleteGroupRequest);
        // TODO: test validations
    }

    /**
     * Get a group object
     *
     * Get a group object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        GetGroupRequest getGroupRequest = null;
        GetGroupDefaultResponse response = api.getGroup(getGroupRequest);
        // TODO: test validations
    }

    /**
     * Get the members of a particular group
     *
     * Get the members of a particular group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupMembersTest() throws ApiException {
        GetGroupMembersRequest getGroupMembersRequest = null;
        GetGroupMembersDefaultResponse response = api.getGroupMembers(getGroupMembersRequest);
        // TODO: test validations
    }

    /**
     * List groups in the client
     *
     * List groups in the client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupsTest() throws ApiException {
        GetGroupsRequest getGroupsRequest = null;
        GetGroupsDefaultResponse response = api.getGroups(getGroupsRequest);
        // TODO: test validations
    }

    /**
     * Update a group
     *
     * Update a group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGroupTest() throws ApiException {
        CreateGroupRequest createGroupRequest = null;
        AUTHChangePasswordDefaultResponse response = api.updateGroup(createGroupRequest);
        // TODO: test validations
    }

}