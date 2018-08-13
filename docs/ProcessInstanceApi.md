# ProcessInstanceApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](ProcessInstanceApi.md#delete) | **POST** /API/OR/ProcessInstance/delete | Deleting Process
[**downloadFile**](ProcessInstanceApi.md#downloadFile) | **GET** /API/OR/ProcessInstance/File/download | Downloading File type Process Data
[**list**](ProcessInstanceApi.md#list) | **GET** /API/OR/ProcessInstance/list | Querying for Task records operated by the User
[**listCsv**](ProcessInstanceApi.md#listCsv) | **GET** /API/OR/ProcessInstance/listCsv | Querying for all Process Instances records
[**listCsvUtf16**](ProcessInstanceApi.md#listCsvUtf16) | **GET** /API/OR/ProcessInstance/listCsvUtf16 | Querying for all Process Instances records
[**startProcessInstance**](ProcessInstanceApi.md#startProcessInstance) | **POST** /API/PE/ProcessInstance/start | Creating a Process Instance
[**stop**](ProcessInstanceApi.md#stop) | **POST** /API/OR/ProcessInstance/stop | Terminating Process
[**view**](ProcessInstanceApi.md#view) | **GET** /API/OR/ProcessInstance/view | Retrieving Process Instance


<a name="delete"></a>
# **delete**
> delete(processInstanceId)

Deleting Process

Processes which a user can delete are limited to those the User started, no one else has concerned, or has authorization of Process Administrator.

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
Integer processInstanceId = 56; // Integer | 
try {
    apiInstance.delete(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(id, processDataInstanceId)

Downloading File type Process Data

Downloading File type Process Data

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
Long id = 789L; // Long | 
Long processDataInstanceId = 789L; // Long | 
try {
    File result = apiInstance.downloadFile(id, processDataInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **processDataInstanceId** | **Long**|  |

### Return type

[**File**](File.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="list"></a>
# **list**
> ProcessInstanceList list(criteria, limit, start)

Querying for Task records operated by the User

Querying for Task records operated by the User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
String criteria = "criteria_example"; // String | Search condition
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    ProcessInstanceList result = apiInstance.list(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

[**ProcessInstanceList**](ProcessInstanceList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCsv"></a>
# **listCsv**
> String listCsv(criteria, limit, start)

Querying for all Process Instances records

Querying for all Process Instances records

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
String criteria = "criteria_example"; // String | Search condition
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listCsv(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#listCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="listCsvUtf16"></a>
# **listCsvUtf16**
> String listCsvUtf16(criteria, limit, start)

Querying for all Process Instances records

Querying for all Process Instances records

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
String criteria = "criteria_example"; // String | Search condition
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listCsvUtf16(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#listCsvUtf16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="startProcessInstance"></a>
# **startProcessInstance**
> WorkitemWrapper startProcessInstance(processModelInfoId, nodeNumber)

Creating a Process Instance

Creating a Process Instance

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;
//import com.questetra.bpms.client.swagger.model.WorkitemWrapper;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
Long processModelInfoId = 789L; // Long | 
Long nodeNumber = 789L; // Long | 
try {
    WorkitemWrapper result = apiInstance.startProcessInstance(processModelInfoId, nodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#startProcessInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **nodeNumber** | **Long**|  |

### Return type

[**WorkitemWrapper**](WorkitemWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stop"></a>
# **stop**
> stop(processInstanceId)

Terminating Process

Processes which a user can stop are limited to those the User started, no one else has concerned, or has authorization of Process Administrator.

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
Long processInstanceId = 789L; // Long | 
try {
    apiInstance.stop(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#stop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="view"></a>
# **view**
> ProcessInstanceWrapper view(processInstanceId)

Retrieving Process Instance

Retrieving Process Instance

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessInstanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceApi apiInstance = new ProcessInstanceApi();
Long processInstanceId = 789L; // Long | 
try {
    ProcessInstanceWrapper result = apiInstance.view(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#view");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **Long**|  |

### Return type

[**ProcessInstanceWrapper**](ProcessInstanceWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

