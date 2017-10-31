# ProcessModelApi

All URIs are relative to *https://192.168.1.38:8443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listStartableProcessModel**](ProcessModelApi.md#listStartableProcessModel) | **GET** /API/PE/ProcessModel/listStartable | Retrieving a List of startable Workflows


<a name="listStartableProcessModel"></a>
# **listStartableProcessModel**
> ActivityList listStartableProcessModel(limit, start, category, query)

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
    ActivityList result = apiInstance.listStartableProcessModel(limit, start, category, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessModelApi#listStartableProcessModel");
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

