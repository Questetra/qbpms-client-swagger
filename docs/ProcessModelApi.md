# ProcessModelApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAllProcessModels**](ProcessModelApi.md#listAllProcessModels) | **GET** /API/Admin/ProcessModel/list | Retrieving a List of Process Models
[**listStartableProcessModels**](ProcessModelApi.md#listStartableProcessModels) | **GET** /API/PE/ProcessModel/listStartable | Retrieving a List of startable Workflows
[**releaseProcessModel**](ProcessModelApi.md#releaseProcessModel) | **POST** /API/PMM/ProcessModel/{processModelInfoId}/release | Release process model


<a name="listAllProcessModels"></a>
# **listAllProcessModels**
> ProcessModelInfoList listAllProcessModels(limit, start, category, query, starredOnly, dbFile)

Retrieving a List of Process Models

Retrieving a List of Process Models

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessModelApi apiInstance = new ProcessModelApi();
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
String category = "category_example"; // String | Category of Process Model
String query = "query_example"; // String | Search String
Boolean starredOnly = true; // Boolean | Search for a starred Process Model
String dbFile = "dbFile_example"; // String | Search for a process model that uses a file with the specified name
try {
    ProcessModelInfoList result = apiInstance.listAllProcessModels(limit, start, category, query, starredOnly, dbFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessModelApi#listAllProcessModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]
 **category** | **String**| Category of Process Model | [optional]
 **query** | **String**| Search String | [optional]
 **starredOnly** | **Boolean**| Search for a starred Process Model | [optional]
 **dbFile** | **String**| Search for a process model that uses a file with the specified name | [optional]

### Return type

[**ProcessModelInfoList**](ProcessModelInfoList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStartableProcessModels"></a>
# **listStartableProcessModels**
> ActivityList listStartableProcessModels(limit, start, category, query)

Retrieving a List of startable Workflows

Retrieving a List of startable Workflows

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessModelApi apiInstance = new ProcessModelApi();
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
String category = "category_example"; // String | Category of Process Model
String query = "query_example"; // String | Search String
try {
    ActivityList result = apiInstance.listStartableProcessModels(limit, start, category, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessModelApi#listStartableProcessModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]
 **category** | **String**| Category of Process Model | [optional]
 **query** | **String**| Search String | [optional]

### Return type

[**ActivityList**](ActivityList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="releaseProcessModel"></a>
# **releaseProcessModel**
> ProcessModelReseaseResult releaseProcessModel(processModelInfoId, note)

Release process model

Release process model

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessModelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessModelApi apiInstance = new ProcessModelApi();
Long processModelInfoId = 789L; // Long | App ID
String note = "note_example"; // String | Version memo
try {
    ProcessModelReseaseResult result = apiInstance.releaseProcessModel(processModelInfoId, note);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessModelApi#releaseProcessModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**| App ID |
 **note** | **String**| Version memo | [optional]

### Return type

[**ProcessModelReseaseResult**](ProcessModelReseaseResult.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

