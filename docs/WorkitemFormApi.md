# WorkitemFormApi

All URIs are relative to *https://online-demo-en.questetra.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**save**](WorkitemFormApi.md#save) | **POST** /API/PE/Workitem/Form/save | Submitting the Task output
[**viewXml**](WorkitemFormApi.md#viewXml) | **GET** /API/PE/Workitem/Form/viewXml | Retrieving a List of forms for Task output


<a name="save"></a>
# **save**
> String save(workitemId, title, qgroupId, flow, saveOnly)

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
Long qgroupId = 789L; // Long | 
Long flow = 789L; // Long | 
Boolean saveOnly = true; // Boolean | 
try {
    String result = apiInstance.save(workitemId, title, qgroupId, flow, saveOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemFormApi#save");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**| Workitem ID |
 **title** | **String**|  | [optional]
 **qgroupId** | **Long**|  | [optional]
 **flow** | **Long**|  | [optional]
 **saveOnly** | **Boolean**|  | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: text/xml

<a name="viewXml"></a>
# **viewXml**
> String viewXml(workitemId)

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
    String result = apiInstance.viewXml(workitemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemFormApi#viewXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**| Workitem ID |

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

