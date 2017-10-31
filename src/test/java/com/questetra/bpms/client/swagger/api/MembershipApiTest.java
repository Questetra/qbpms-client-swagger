/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.api;

import com.questetra.bpms.client.swagger.ApiException;
import com.questetra.bpms.client.swagger.model.Errors;
import com.questetra.bpms.client.swagger.model.MembershipList;
import com.questetra.bpms.client.swagger.model.MembershipWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MembershipApi
 */
@Ignore
public class MembershipApiTest {

    private final MembershipApi api = new MembershipApi();

    
    /**
     * Adding a Member to an Organization
     *
     * Adding a Member to an Organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTest() throws ApiException {
        Long quserId = null;
        Long qgroupId = null;
        String role = null;
        MembershipWrapper response = api.add(quserId, qgroupId, role);

        // TODO: test validations
    }
    
    /**
     * Deleting a Member from an Organization
     *
     * Deleting a Member from an Organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long quserId = null;
        Long qgroupId = null;
        api.delete(quserId, qgroupId);

        // TODO: test validations
    }
    
    /**
     * Retrieving all Members of an Organization
     *
     * Retrieving all Members of an Organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listByQgroupTest() throws ApiException {
        Long id = null;
        MembershipList response = api.listByQgroup(id);

        // TODO: test validations
    }
    
    /**
     * Retrieving all Organizations for a User
     *
     * Retrieving all Organizations for a User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listByQuserTest() throws ApiException {
        Long id = null;
        MembershipList response = api.listByQuser(id);

        // TODO: test validations
    }
    
    /**
     * Assigning a Leader to an Organization
     *
     * Assigning a Leader to an Organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long quserId = null;
        Long qgroupId = null;
        String role = null;
        MembershipWrapper response = api.update(quserId, qgroupId, role);

        // TODO: test validations
    }
    
}
