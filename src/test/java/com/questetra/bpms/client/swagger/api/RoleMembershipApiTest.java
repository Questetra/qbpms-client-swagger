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
import com.questetra.bpms.client.swagger.model.RoleMembershipList;
import com.questetra.bpms.client.swagger.model.RoleMembershipWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleMembershipApi
 */
@Ignore
public class RoleMembershipApiTest {

    private final RoleMembershipApi api = new RoleMembershipApi();

    
    /**
     * Adding a Member to a Role
     *
     * Adding a Member to a Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRoleMembershipTest() throws ApiException {
        Long quserId = null;
        Long qroleId = null;
        RoleMembershipWrapper response = api.addRoleMembership(quserId, qroleId);

        // TODO: test validations
    }
    
    /**
     * Deleting a Member from a Role
     *
     * Deleting a Member from a Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleMembershipTest() throws ApiException {
        Long quserId = null;
        Long qroleId = null;
        api.deleteRoleMembership(quserId, qroleId);

        // TODO: test validations
    }
    
    /**
     * Retrieving all Members of a Role
     *
     * Retrieving all Members of a Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoleMembershipsByQroleTest() throws ApiException {
        Long id = null;
        RoleMembershipList response = api.listRoleMembershipsByQrole(id);

        // TODO: test validations
    }
    
    /**
     * Retrieving all Roles for a User
     *
     * Retrieving all Roles for a User
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoleMembershipsByQuserTest() throws ApiException {
        Long id = null;
        RoleMembershipList response = api.listRoleMembershipsByQuser(id);

        // TODO: test validations
    }
    
}
