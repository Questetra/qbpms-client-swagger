/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 11.6.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.questetra.bpms.client.swagger.api;

import com.questetra.bpms.client.swagger.ApiException;
import com.questetra.bpms.client.swagger.model.Errors;
import com.questetra.bpms.client.swagger.model.QuserList;
import com.questetra.bpms.client.swagger.model.QuserWithPrimaryQgroupWrapper;
import com.questetra.bpms.client.swagger.model.QuserWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuserApi
 */
@Ignore
public class QuserApiTest {

    private final QuserApi api = new QuserApi();

    /**
     * Creating a User Account
     *
     * Creating a User Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTest() throws ApiException {
        String name = null;
        String email = null;
        String password = null;
        QuserWrapper response = api.add(name, email, password);

        // TODO: test validations
    }

    /**
     * Deleting a User Account
     *
     * Deleting a User Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Long id = null;
        Long delegateQuserId = null;
        Long delegateQgroupId = null;
        api.delete(id, delegateQuserId, delegateQgroupId);

        // TODO: test validations
    }

    /**
     * Retrieving a User Account
     *
     * Retrieving a User Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTest() throws ApiException {
        Long id = null;
        String email = null;
        QuserWithPrimaryQgroupWrapper response = api.find(id, email);

        // TODO: test validations
    }

    /**
     * Retrieving a List of Users
     *
     * Retrieving a List of Users
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String query = null;
        Integer limit = null;
        Integer start = null;
        QuserList response = api.list(query, limit, start);

        // TODO: test validations
    }

    /**
     * Retrieving the user’s own User Account
     *
     * Retrieving the user’s own User Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void selfTest() throws ApiException {
        QuserWithPrimaryQgroupWrapper response = api.self();

        // TODO: test validations
    }

    /**
     * Updating a User Account
     *
     * Updating a User Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long id = null;
        String name = null;
        String email = null;
        String password = null;
        Long primaryQgroupId = null;
        QuserWithPrimaryQgroupWrapper response = api
                .update(id, name, email, password, primaryQgroupId);

        // TODO: test validations
    }

}
