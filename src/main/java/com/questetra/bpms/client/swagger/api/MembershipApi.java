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

import com.questetra.bpms.client.swagger.ApiCallback;
import com.questetra.bpms.client.swagger.ApiClient;
import com.questetra.bpms.client.swagger.ApiException;
import com.questetra.bpms.client.swagger.ApiResponse;
import com.questetra.bpms.client.swagger.Configuration;
import com.questetra.bpms.client.swagger.Pair;
import com.questetra.bpms.client.swagger.ProgressRequestBody;
import com.questetra.bpms.client.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.questetra.bpms.client.swagger.model.Errors;
import com.questetra.bpms.client.swagger.model.MembershipList;
import com.questetra.bpms.client.swagger.model.MembershipWrapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MembershipApi {
    private ApiClient apiClient;

    public MembershipApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MembershipApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addMembership
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addMembershipCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/API/UGA/Membership/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (quserId != null)
        localVarFormParams.put("quserId", quserId);
        if (qgroupId != null)
        localVarFormParams.put("qgroupId", qgroupId);
        if (role != null)
        localVarFormParams.put("role", role);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addMembershipValidateBeforeCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling addMembership(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling addMembership(Async)");
        }
        

        com.squareup.okhttp.Call call = addMembershipCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adding a Member to an Organization
     * Adding a Member to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @return MembershipWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipWrapper addMembership(Long quserId, Long qgroupId, String role) throws ApiException {
        ApiResponse<MembershipWrapper> resp = addMembershipWithHttpInfo(quserId, qgroupId, role);
        return resp.getData();
    }

    /**
     * Adding a Member to an Organization
     * Adding a Member to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @return ApiResponse&lt;MembershipWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipWrapper> addMembershipWithHttpInfo(Long quserId, Long qgroupId, String role) throws ApiException {
        com.squareup.okhttp.Call call = addMembershipValidateBeforeCall(quserId, qgroupId, role, null, null);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adding a Member to an Organization (asynchronously)
     * Adding a Member to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMembershipAsync(Long quserId, Long qgroupId, String role, final ApiCallback<MembershipWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addMembershipValidateBeforeCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteMembership
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMembershipCall(Long quserId, Long qgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/API/UGA/Membership/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (quserId != null)
        localVarFormParams.put("quserId", quserId);
        if (qgroupId != null)
        localVarFormParams.put("qgroupId", qgroupId);

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteMembershipValidateBeforeCall(Long quserId, Long qgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling deleteMembership(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling deleteMembership(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteMembershipCall(quserId, qgroupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deleting a Member from an Organization
     * Deleting a Member from an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMembership(Long quserId, Long qgroupId) throws ApiException {
        deleteMembershipWithHttpInfo(quserId, qgroupId);
    }

    /**
     * Deleting a Member from an Organization
     * Deleting a Member from an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMembershipWithHttpInfo(Long quserId, Long qgroupId) throws ApiException {
        com.squareup.okhttp.Call call = deleteMembershipValidateBeforeCall(quserId, qgroupId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deleting a Member from an Organization (asynchronously)
     * Deleting a Member from an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMembershipAsync(Long quserId, Long qgroupId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteMembershipValidateBeforeCall(quserId, qgroupId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listMembershipsByQgroup
     * @param id Organization ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMembershipsByQgroupCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/API/User/Membership/listByQgroup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listMembershipsByQgroupValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listMembershipsByQgroup(Async)");
        }
        

        com.squareup.okhttp.Call call = listMembershipsByQgroupCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieving all Members of an Organization
     * Retrieving all Members of an Organization
     * @param id Organization ID (required)
     * @return MembershipList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipList listMembershipsByQgroup(Long id) throws ApiException {
        ApiResponse<MembershipList> resp = listMembershipsByQgroupWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieving all Members of an Organization
     * Retrieving all Members of an Organization
     * @param id Organization ID (required)
     * @return ApiResponse&lt;MembershipList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipList> listMembershipsByQgroupWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = listMembershipsByQgroupValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<MembershipList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving all Members of an Organization (asynchronously)
     * Retrieving all Members of an Organization
     * @param id Organization ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMembershipsByQgroupAsync(Long id, final ApiCallback<MembershipList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listMembershipsByQgroupValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMembershipsByQuser
     * @param id User ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMembershipsByQuserCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/API/User/Membership/listByQuser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listMembershipsByQuserValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listMembershipsByQuser(Async)");
        }
        

        com.squareup.okhttp.Call call = listMembershipsByQuserCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieving all Organizations for a User
     * Retrieving all Organizations for a User
     * @param id User ID (required)
     * @return MembershipList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipList listMembershipsByQuser(Long id) throws ApiException {
        ApiResponse<MembershipList> resp = listMembershipsByQuserWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieving all Organizations for a User
     * Retrieving all Organizations for a User
     * @param id User ID (required)
     * @return ApiResponse&lt;MembershipList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipList> listMembershipsByQuserWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = listMembershipsByQuserValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<MembershipList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving all Organizations for a User (asynchronously)
     * Retrieving all Organizations for a User
     * @param id User ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMembershipsByQuserAsync(Long id, final ApiCallback<MembershipList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listMembershipsByQuserValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMembership
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMembershipCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/API/UGA/Membership/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (quserId != null)
        localVarFormParams.put("quserId", quserId);
        if (qgroupId != null)
        localVarFormParams.put("qgroupId", qgroupId);
        if (role != null)
        localVarFormParams.put("role", role);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMembershipValidateBeforeCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling updateMembership(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling updateMembership(Async)");
        }
        

        com.squareup.okhttp.Call call = updateMembershipCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Assigning a Leader to an Organization
     * Assigning a Leader to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @return MembershipWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipWrapper updateMembership(Long quserId, Long qgroupId, String role) throws ApiException {
        ApiResponse<MembershipWrapper> resp = updateMembershipWithHttpInfo(quserId, qgroupId, role);
        return resp.getData();
    }

    /**
     * Assigning a Leader to an Organization
     * Assigning a Leader to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @return ApiResponse&lt;MembershipWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipWrapper> updateMembershipWithHttpInfo(Long quserId, Long qgroupId, String role) throws ApiException {
        com.squareup.okhttp.Call call = updateMembershipValidateBeforeCall(quserId, qgroupId, role, null, null);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigning a Leader to an Organization (asynchronously)
     * Assigning a Leader to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role: _leader or blank (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMembershipAsync(Long quserId, Long qgroupId, String role, final ApiCallback<MembershipWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateMembershipValidateBeforeCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
