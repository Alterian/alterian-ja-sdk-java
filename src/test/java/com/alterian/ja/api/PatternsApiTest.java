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
import com.alterian.ja.model.CreatePatternRequest;
import com.alterian.ja.model.CreatePatternTasksDefaultResponse;
import com.alterian.ja.model.CreatePatternTasksRequest;
import com.alterian.ja.model.DeletePatternRequest;
import com.alterian.ja.model.GetEventRecordsDefaultResponse;
import com.alterian.ja.model.GetPatternDefaultResponse;
import com.alterian.ja.model.GetPatternRecordsRequest;
import com.alterian.ja.model.GetPatternRequest;
import com.alterian.ja.model.GetPatternTasksRequest;
import com.alterian.ja.model.GetPatternsDefaultResponse;
import com.alterian.ja.model.GetPatternsRequest;
import com.alterian.ja.model.GetRepeatingPatternItemScoresDefaultResponse;
import com.alterian.ja.model.GetRepeatingPatternItemScoresRequest;
import com.alterian.ja.model.GetRepeatingPatternItemsRequest;
import com.alterian.ja.model.RequestCancelPatternTasksRequest;
import com.alterian.ja.model.UpdatePatternRequest;
import com.alterian.ja.model.UpdateRepeatingPatternItemScoresRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PatternsApi
 */
@Disabled
public class PatternsApiTest {

    private final PatternsApi api = new PatternsApi();

    /**
     * Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it
     *
     * Creates a Pattern definition to capture settings and record where any output is located. The actual detected patterns will not be populated until tasks are run against it
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPatternTest() throws ApiException {
        CreatePatternRequest createPatternRequest = null;
        CreateClientDefaultResponse response = api.createPattern(createPatternRequest);
        // TODO: test validations
    }

    /**
     * Creates a task to perform an action against a pattern definition
     *
     * Creates a task to perform an action against a pattern definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPatternTasksTest() throws ApiException {
        CreatePatternTasksRequest createPatternTasksRequest = null;
        CreatePatternTasksDefaultResponse response = api.createPatternTasks(createPatternTasksRequest);
        // TODO: test validations
    }

    /**
     * Delete one or more pattern definitions
     *
     * Delete one or more pattern definitions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePatternTest() throws ApiException {
        DeletePatternRequest deletePatternRequest = null;
        AUTHChangePasswordDefaultResponse response = api.deletePattern(deletePatternRequest);
        // TODO: test validations
    }

    /**
     * Get a pattern definition
     *
     * Get a pattern definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPatternTest() throws ApiException {
        GetPatternRequest getPatternRequest = null;
        GetPatternDefaultResponse response = api.getPattern(getPatternRequest);
        // TODO: test validations
    }

    /**
     * Get records from a pattern table
     *
     * Get records from a pattern table
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPatternRecordsTest() throws ApiException {
        GetPatternRecordsRequest getPatternRecordsRequest = null;
        GetEventRecordsDefaultResponse response = api.getPatternRecords(getPatternRecordsRequest);
        // TODO: test validations
    }

    /**
     * Check on the status of pattern tasks
     *
     * Check on the status of pattern tasks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPatternTasksTest() throws ApiException {
        GetPatternTasksRequest getPatternTasksRequest = null;
        CreatePatternTasksDefaultResponse response = api.getPatternTasks(getPatternTasksRequest);
        // TODO: test validations
    }

    /**
     * Get one or more pattern definitions
     *
     * Get one or more pattern definitions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPatternsTest() throws ApiException {
        GetPatternsRequest getPatternsRequest = null;
        GetPatternsDefaultResponse response = api.getPatterns(getPatternsRequest);
        // TODO: test validations
    }

    /**
     * Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode &#39;alias&#39; transform that has been published to the pattern             and sits along-side the sequence item data
     *
     * Gets the scores recorded against the underlying sequence items that are composed into patterns             Currently unscored items are returned with a zero score             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified decode &#39;alias&#39; transform that has been published to the pattern             and sits along-side the sequence item data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRepeatingPatternItemScoresTest() throws ApiException {
        GetRepeatingPatternItemScoresRequest getRepeatingPatternItemScoresRequest = null;
        GetRepeatingPatternItemScoresDefaultResponse response = api.getRepeatingPatternItemScores(getRepeatingPatternItemScoresRequest);
        // TODO: test validations
    }

    /**
     * Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern
     *
     * Gets the underlying sequence items that can be composed into patterns along with any scores that have been used to calculate the MSI (direct or via decodes)             Initially, this will be all the distinct sequence items in the table             Once a pattern has been calculated and uploaded this will be filtered down to only those sequence items that appear in a pattern
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRepeatingPatternItemsTest() throws ApiException {
        GetRepeatingPatternItemsRequest getRepeatingPatternItemsRequest = null;
        GetEventRecordsDefaultResponse response = api.getRepeatingPatternItems(getRepeatingPatternItemsRequest);
        // TODO: test validations
    }

    /**
     * Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running
     *
     * Requests cancellation of all tasks for a pattern. This may take some time to be actioned if the tasks are already running
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestCancelPatternTasksTest() throws ApiException {
        RequestCancelPatternTasksRequest requestCancelPatternTasksRequest = null;
        AUTHChangePasswordDefaultResponse response = api.requestCancelPatternTasks(requestCancelPatternTasksRequest);
        // TODO: test validations
    }

    /**
     * Updates a Pattern definition.
     *
     * Updates a Pattern definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePatternTest() throws ApiException {
        UpdatePatternRequest updatePatternRequest = null;
        AUTHChangePasswordDefaultResponse response = api.updatePattern(updatePatternRequest);
        // TODO: test validations
    }

    /**
     * Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified &#39;alias&#39; transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of &#39;unscoring&#39; it at present
     *
     * Update one or more of the scores maintained against the underlying sequence item labels that are composed into patterns             Scores can either be recorded directly onto the Item labels themselves or they can be applied to the target labels (e.g. Journeys) that correspond to a specified &#39;alias&#39; transform that sits along-side the sequence item data             Only one such decode alias can be scored at a time and when scores are applied they are applied from the alias first and then overridden with any score that has been stored againt the items themselves             If the scores are to be applied against a decode then its id and version must be specified             The scores are intended to denote the relative importance of items in a sequence. The label of the item with the highest score will serve as the overall label (MSI) for the sequence             Specifying zero for a score is the only way of &#39;unscoring&#39; it at present
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRepeatingPatternItemScoresTest() throws ApiException {
        UpdateRepeatingPatternItemScoresRequest updateRepeatingPatternItemScoresRequest = null;
        AUTHChangePasswordDefaultResponse response = api.updateRepeatingPatternItemScores(updateRepeatingPatternItemScoresRequest);
        // TODO: test validations
    }

}
