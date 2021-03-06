/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 12.3.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.api;

import com.questetra.bpms.client.swagger.ApiException;
import com.questetra.bpms.client.swagger.model.Errors;
import java.io.File;
import com.questetra.bpms.client.swagger.model.ProcessInstanceList;
import com.questetra.bpms.client.swagger.model.ProcessInstanceWrapper;
import com.questetra.bpms.client.swagger.model.WorkitemWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessInstanceApi
 */
@Ignore
public class ProcessInstanceApiTest {

    private final ProcessInstanceApi api = new ProcessInstanceApi();

    
    /**
     * Adding a Star to a Process
     *
     * Adding a Star to a Process
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProcessInstanceStarTest() throws ApiException {
        Long processInstanceId = null;
        api.addProcessInstanceStar(processInstanceId);

        // TODO: test validations
    }
    
    /**
     * Deleting Process
     *
     * Processes which a user can delete are limited to those the User started, no one else has concerned, or has authorization of Process Administrator.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessInstanceTest() throws ApiException {
        Integer processInstanceId = null;
        api.deleteProcessInstance(processInstanceId);

        // TODO: test validations
    }
    
    /**
     * Downloading File type Process Data
     *
     * Downloading File type Process Data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException {
        Long id = null;
        Long processDataInstanceId = null;
        File response = api.downloadFile(id, processDataInstanceId);

        // TODO: test validations
    }
    
    /**
     * Retrieving Process Instance
     *
     * Retrieving Process Instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessInstanceTest() throws ApiException {
        Long processInstanceId = null;
        ProcessInstanceWrapper response = api.getProcessInstance(processInstanceId);

        // TODO: test validations
    }
    
    /**
     * Querying for Process Instance records operated by the User
     *
     * Querying for Process Instance records operated by the User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProcessInstancesTest() throws ApiException {
        String criteria = null;
        Integer limit = null;
        Integer start = null;
        ProcessInstanceList response = api.listProcessInstances(criteria, limit, start);

        // TODO: test validations
    }
    
    /**
     * Querying for Process Instance records operated by the User
     *
     * Querying for Process Instance records operated by the User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProcessInstancesCsvTest() throws ApiException {
        String criteria = null;
        Integer limit = null;
        Integer start = null;
        String response = api.listProcessInstancesCsv(criteria, limit, start);

        // TODO: test validations
    }
    
    /**
     * Querying for Process Instance records operated by the User
     *
     * Querying for Process Instance records operated by the User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProcessInstancesCsvUtf16Test() throws ApiException {
        String criteria = null;
        Integer limit = null;
        Integer start = null;
        String response = api.listProcessInstancesCsvUtf16(criteria, limit, start);

        // TODO: test validations
    }
    
    /**
     * Removing a Star from a Process
     *
     * Removing a Star from a Process
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeProcessInstanceStarTest() throws ApiException {
        Long processInstanceId = null;
        api.removeProcessInstanceStar(processInstanceId);

        // TODO: test validations
    }
    
    /**
     * Creating a Process Instance
     *
     * Creating a Process Instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startProcessInstanceTest() throws ApiException {
        Long processModelInfoId = null;
        Long nodeNumber = null;
        WorkitemWrapper response = api.startProcessInstance(processModelInfoId, nodeNumber);

        // TODO: test validations
    }
    
    /**
     * Terminating Process
     *
     * Processes which a user can stop are limited to those the User started, no one else has concerned, or has authorization of Process Administrator.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopProcessInstanceTest() throws ApiException {
        Long processInstanceId = null;
        api.stopProcessInstance(processInstanceId);

        // TODO: test validations
    }
    
}
