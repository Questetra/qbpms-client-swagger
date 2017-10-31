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
     * Build call for add
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/Membership/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addValidateBeforeCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling add(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling add(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adding a Member to an Organization
     * Adding a Member to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @return MembershipWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipWrapper add(Long quserId, Long qgroupId, String role) throws ApiException {
        ApiResponse<MembershipWrapper> resp = addWithHttpInfo(quserId, qgroupId, role);
        return resp.getData();
    }

    /**
     * Adding a Member to an Organization
     * Adding a Member to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @return ApiResponse&lt;MembershipWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipWrapper> addWithHttpInfo(Long quserId, Long qgroupId, String role) throws ApiException {
        com.squareup.okhttp.Call call = addValidateBeforeCall(quserId, qgroupId, role, null, null);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adding a Member to an Organization (asynchronously)
     * Adding a Member to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAsync(Long quserId, Long qgroupId, String role, final ApiCallback<MembershipWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addValidateBeforeCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(Long quserId, Long qgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/Membership/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(Long quserId, Long qgroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling delete(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling delete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCall(quserId, qgroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deleting a Member from an Organization
     * Deleting a Member from an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(Long quserId, Long qgroupId) throws ApiException {
        deleteWithHttpInfo(quserId, qgroupId);
    }

    /**
     * Deleting a Member from an Organization
     * Deleting a Member from an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(Long quserId, Long qgroupId) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(quserId, qgroupId, null, null);
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
    public com.squareup.okhttp.Call deleteAsync(Long quserId, Long qgroupId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(quserId, qgroupId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listByQgroup
     * @param id Organization ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listByQgroupCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/User/Membership/listByQgroup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listByQgroupValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listByQgroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listByQgroupCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving all Members of an Organization
     * Retrieving all Members of an Organization
     * @param id Organization ID (required)
     * @return MembershipList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipList listByQgroup(Long id) throws ApiException {
        ApiResponse<MembershipList> resp = listByQgroupWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieving all Members of an Organization
     * Retrieving all Members of an Organization
     * @param id Organization ID (required)
     * @return ApiResponse&lt;MembershipList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipList> listByQgroupWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = listByQgroupValidateBeforeCall(id, null, null);
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
    public com.squareup.okhttp.Call listByQgroupAsync(Long id, final ApiCallback<MembershipList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listByQgroupValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listByQuser
     * @param id User ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listByQuserCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/User/Membership/listByQuser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listByQuserValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listByQuser(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listByQuserCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving all Organizations for a User
     * Retrieving all Organizations for a User
     * @param id User ID (required)
     * @return MembershipList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipList listByQuser(Long id) throws ApiException {
        ApiResponse<MembershipList> resp = listByQuserWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieving all Organizations for a User
     * Retrieving all Organizations for a User
     * @param id User ID (required)
     * @return ApiResponse&lt;MembershipList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipList> listByQuserWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = listByQuserValidateBeforeCall(id, null, null);
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
    public com.squareup.okhttp.Call listByQuserAsync(Long id, final ApiCallback<MembershipList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listByQuserValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/Membership/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateValidateBeforeCall(Long quserId, Long qgroupId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling update(Async)");
        }
        
        // verify the required parameter 'qgroupId' is set
        if (qgroupId == null) {
            throw new ApiException("Missing the required parameter 'qgroupId' when calling update(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Assigning a Leader to an Organization
     * Assigning a Leader to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @return MembershipWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MembershipWrapper update(Long quserId, Long qgroupId, String role) throws ApiException {
        ApiResponse<MembershipWrapper> resp = updateWithHttpInfo(quserId, qgroupId, role);
        return resp.getData();
    }

    /**
     * Assigning a Leader to an Organization
     * Assigning a Leader to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @return ApiResponse&lt;MembershipWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MembershipWrapper> updateWithHttpInfo(Long quserId, Long qgroupId, String role) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(quserId, qgroupId, role, null, null);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigning a Leader to an Organization (asynchronously)
     * Assigning a Leader to an Organization
     * @param quserId User ID (required)
     * @param qgroupId Organization ID (required)
     * @param role Member’s role (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(Long quserId, Long qgroupId, String role, final ApiCallback<MembershipWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(quserId, qgroupId, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MembershipWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
