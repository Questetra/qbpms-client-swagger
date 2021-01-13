# WorkitemFormApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkitemForm**](WorkitemFormApi.md#getWorkitemForm) | **GET** /API/PE/Workitem/Form/viewXml | Retrieving a List of forms for Task output
[**saveWorkitemForm**](WorkitemFormApi.md#saveWorkitemForm) | **POST** /API/PE/Workitem/Form/save | Submitting the Task output


<a name="getWorkitemForm"></a>
# **getWorkitemForm**
> WorkitemForm getWorkitemForm(workitemId)

Retrieving a List of forms for Task output

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemFormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemFormApi apiInstance = new WorkitemFormApi();
Long workitemId = 789L; // Long | Workitem ID
try {
    WorkitemForm result = apiInstance.getWorkitemForm(workitemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemFormApi#getWorkitemForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**| Workitem ID |

### Return type

[**WorkitemForm**](WorkitemForm.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

<a name="saveWorkitemForm"></a>
# **saveWorkitemForm**
> WorkitemFormResult saveWorkitemForm(workitemId, title, qgroupId, flow, saveOnly)

Submitting the Task output

Submitting the Task output

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemFormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemFormApi apiInstance = new WorkitemFormApi();
Long workitemId = 789L; // Long | Workitem ID
String title = "title_example"; // String | 
Long qgroupId = 789L; // Long | (/workitem-form/executing-roles)
Long flow = 789L; // Long | (/workitem-form/user-selects)
Boolean saveOnly = true; // Boolean | Task Completetion = false
try {
    WorkitemFormResult result = apiInstance.saveWorkitemForm(workitemId, title, qgroupId, flow, saveOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemFormApi#saveWorkitemForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**| Workitem ID |
 **title** | **String**|  | [optional]
 **qgroupId** | **Long**| (/workitem-form/executing-roles) | [optional]
 **flow** | **Long**| (/workitem-form/user-selects) | [optional]
 **saveOnly** | **Boolean**| Task Completetion &#x3D; false | [optional]

### Return type

[**WorkitemFormResult**](WorkitemFormResult.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: text/xml

