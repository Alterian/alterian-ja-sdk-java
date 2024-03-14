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
import com.alterian.ja.model.CreateClientDefaultResponse;
import com.alterian.ja.model.CreateFolderRequest;
import com.alterian.ja.model.DeleteFolderRequest;
import com.alterian.ja.model.GetFolderDefaultResponse;
import com.alterian.ja.model.GetFolderRequest;
import com.alterian.ja.model.GetFoldersDefaultResponse;
import com.alterian.ja.model.GetFoldersRequest;
import com.alterian.ja.model.MoveFolderRequest;
import com.alterian.ja.model.RenameFolderRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FolderApi
 */
@Disabled
public class FolderApiTest {

    private final FolderApi api = new FolderApi();

    /**
     * Create a @see(Folder)
     *
     * Create a @see(Folder)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFolderTest() throws ApiException {
        CreateFolderRequest createFolderRequest = null;
        CreateClientDefaultResponse response = api.createFolder(createFolderRequest);
        // TODO: test validations
    }

    /**
     * Delete a @see(Folder)
     *
     * Delete a @see(Folder)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException {
        DeleteFolderRequest deleteFolderRequest = null;
        AUTHChangePasswordDefaultResponse response = api.deleteFolder(deleteFolderRequest);
        // TODO: test validations
    }

    /**
     * Get a particular @see(Folder) by it&#39;s ID
     *
     * Get a particular @see(Folder) by it&#39;s ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFolderTest() throws ApiException {
        GetFolderRequest getFolderRequest = null;
        GetFolderDefaultResponse response = api.getFolder(getFolderRequest);
        // TODO: test validations
    }

    /**
     * Obtain a list of @see(Folder)s
     *
     * Obtain a list of @see(Folder)s
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFoldersTest() throws ApiException {
        GetFoldersRequest getFoldersRequest = null;
        GetFoldersDefaultResponse response = api.getFolders(getFoldersRequest);
        // TODO: test validations
    }

    /**
     * Move a @see(Folder) from one @see(Folder) to another
     *
     * Move a @see(Folder) from one @see(Folder) to another
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveFolderTest() throws ApiException {
        MoveFolderRequest moveFolderRequest = null;
        AUTHChangePasswordDefaultResponse response = api.moveFolder(moveFolderRequest);
        // TODO: test validations
    }

    /**
     * Rename a @see(Folder)
     *
     * Rename a @see(Folder)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void renameFolderTest() throws ApiException {
        RenameFolderRequest renameFolderRequest = null;
        AUTHChangePasswordDefaultResponse response = api.renameFolder(renameFolderRequest);
        // TODO: test validations
    }

}
