/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 11.8.0
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
import com.questetra.bpms.client.swagger.model.RoleMembershipList;
import com.questetra.bpms.client.swagger.model.RoleMembershipWrapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleMembershipApi {
    private ApiClient apiClient;

    public RoleMembershipApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoleMembershipApi(ApiClient apiClient) {
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
     * @param qroleId Role ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCall(Long quserId, Long qroleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/RoleMembership/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (quserId != null)
        localVarFormParams.put("quserId", quserId);
        if (qroleId != null)
        localVarFormParams.put("qroleId", qroleId);

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
    private com.squareup.okhttp.Call addValidateBeforeCall(Long quserId, Long qroleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling add(Async)");
        }
        
        // verify the required parameter 'qroleId' is set
        if (qroleId == null) {
            throw new ApiException("Missing the required parameter 'qroleId' when calling add(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addCall(quserId, qroleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adding a Member to a Role
     * Adding a Member to a Role
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @return RoleMembershipWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RoleMembershipWrapper add(Long quserId, Long qroleId) throws ApiException {
        ApiResponse<RoleMembershipWrapper> resp = addWithHttpInfo(quserId, qroleId);
        return resp.getData();
    }

    /**
     * Adding a Member to a Role
     * Adding a Member to a Role
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @return ApiResponse&lt;RoleMembershipWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RoleMembershipWrapper> addWithHttpInfo(Long quserId, Long qroleId) throws ApiException {
        com.squareup.okhttp.Call call = addValidateBeforeCall(quserId, qroleId, null, null);
        Type localVarReturnType = new TypeToken<RoleMembershipWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adding a Member to a Role (asynchronously)
     * Adding a Member to a Role
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAsync(Long quserId, Long qroleId, final ApiCallback<RoleMembershipWrapper> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addValidateBeforeCall(quserId, qroleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RoleMembershipWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(Long quserId, Long qroleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/UGA/RoleMembership/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (quserId != null)
        localVarFormParams.put("quserId", quserId);
        if (qroleId != null)
        localVarFormParams.put("qroleId", qroleId);

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
    private com.squareup.okhttp.Call deleteValidateBeforeCall(Long quserId, Long qroleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quserId' is set
        if (quserId == null) {
            throw new ApiException("Missing the required parameter 'quserId' when calling delete(Async)");
        }
        
        // verify the required parameter 'qroleId' is set
        if (qroleId == null) {
            throw new ApiException("Missing the required parameter 'qroleId' when calling delete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCall(quserId, qroleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deleting a Member from a Role
     * Deleting a Member from a Role
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(Long quserId, Long qroleId) throws ApiException {
        deleteWithHttpInfo(quserId, qroleId);
    }

    /**
     * Deleting a Member from a Role
     * Deleting a Member from a Role
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(Long quserId, Long qroleId) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(quserId, qroleId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deleting a Member from a Role (asynchronously)
     * Deleting a Member from a Role
     * @param quserId User ID (required)
     * @param qroleId Role ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(Long quserId, Long qroleId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(quserId, qroleId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listByQrole
     * @param id Role ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listByQroleCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/API/User/RoleMembership/listByQrole";

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
    private com.squareup.okhttp.Call listByQroleValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listByQrole(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listByQroleCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieving all Members of a Role
     * Retrieving all Members of a Role
     * @param id Role ID (required)
     * @return RoleMembershipList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RoleMembershipList listByQrole(Long id) throws ApiException {
        ApiResponse<RoleMembershipList> resp = listByQroleWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieving all Members of a Role
     * Retrieving all Members of a Role
     * @param id Role ID (required)
     * @return ApiResponse&lt;RoleMembershipList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RoleMembershipList> listByQroleWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = listByQroleValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RoleMembershipList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving all Members of a Role (asynchronously)
     * Retrieving all Members of a Role
     * @param id Role ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listByQroleAsync(Long id, final ApiCallback<RoleMembershipList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listByQroleValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RoleMembershipList>(){}.getType();
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
        String localVarPath = "/API/User/RoleMembership/listByQuser";

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
     * Retrieving all Roles for a User
     * Retrieving all Roles for a User
     * @param id User ID (required)
     * @return RoleMembershipList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RoleMembershipList listByQuser(Long id) throws ApiException {
        ApiResponse<RoleMembershipList> resp = listByQuserWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieving all Roles for a User
     * Retrieving all Roles for a User
     * @param id User ID (required)
     * @return ApiResponse&lt;RoleMembershipList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RoleMembershipList> listByQuserWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = listByQuserValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RoleMembershipList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving all Roles for a User (asynchronously)
     * Retrieving all Roles for a User
     * @param id User ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listByQuserAsync(Long id, final ApiCallback<RoleMembershipList> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<RoleMembershipList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
