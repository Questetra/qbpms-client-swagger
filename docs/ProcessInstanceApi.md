# ProcessInstanceApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProcessInstanceStar**](ProcessInstanceApi.md#addProcessInstanceStar) | **POST** /API/OR/ProcessInstance/{processInstanceId}/Star/add | Adding a Star to a Process
[**deleteProcessInstance**](ProcessInstanceApi.md#deleteProcessInstance) | **POST** /API/OR/ProcessInstance/delete | Deleting Process
[**downloadFile**](ProcessInstanceApi.md#downloadFile) | **GET** /API/OR/ProcessInstance/File/download | Downloading File type Process Data
[**getProcessInstance**](ProcessInstanceApi.md#getProcessInstance) | **GET** /API/OR/ProcessInstance/view | Retrieving Process Instance
[**listProcessInstances**](ProcessInstanceApi.md#listProcessInstances) | **GET** /API/OR/ProcessInstance/list | Querying for Process Instance records operated by the User
[**listProcessInstancesCsv**](ProcessInstanceApi.md#listProcessInstancesCsv) | **GET** /API/OR/ProcessInstance/listCsv | Querying for Process Instance records operated by the User
[**listProcessInstancesCsvUtf16**](ProcessInstanceApi.md#listProcessInstancesCsvUtf16) | **GET** /API/OR/ProcessInstance/listCsvUtf16 | Querying for Process Instance records operated by the User
[**removeProcessInstanceStar**](ProcessInstanceApi.md#removeProcessInstanceStar) | **POST** /API/OR/ProcessInstance/{processInstanceId}/Star/remove | Removing a Star from a Process
[**startProcessInstance**](ProcessInstanceApi.md#startProcessInstance) | **POST** /API/PE/ProcessInstance/start | Creating a Process Instance
[**stopProcessInstance**](ProcessInstanceApi.md#stopProcessInstance) | **POST** /API/OR/ProcessInstance/stop | Terminating Process


<a name="addProcessInstanceStar"></a>
# **addProcessInstanceStar**
> addProcessInstanceStar(processInstanceId)

Adding a Star to a Process

Adding a Star to a Process

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
    apiInstance.addProcessInstanceStar(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#addProcessInstanceStar");
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

<a name="deleteProcessInstance"></a>
# **deleteProcessInstance**
> deleteProcessInstance(processInstanceId)

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
    apiInstance.deleteProcessInstance(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#deleteProcessInstance");
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

<a name="getProcessInstance"></a>
# **getProcessInstance**
> ProcessInstanceWrapper getProcessInstance(processInstanceId)

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
    ProcessInstanceWrapper result = apiInstance.getProcessInstance(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#getProcessInstance");
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

<a name="listProcessInstances"></a>
# **listProcessInstances**
> ProcessInstanceList listProcessInstances(criteria, limit, start)

Querying for Process Instance records operated by the User

Querying for Process Instance records operated by the User

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
String criteria = "criteria_example"; // String | Search condition https://questetra.zendesk.com/hc/ja/articles/360002481031-XML-Criteria-for-Process-Instance-Search
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    ProcessInstanceList result = apiInstance.listProcessInstances(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#listProcessInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition https://questetra.zendesk.com/hc/ja/articles/360002481031-XML-Criteria-for-Process-Instance-Search | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

[**ProcessInstanceList**](ProcessInstanceList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProcessInstancesCsv"></a>
# **listProcessInstancesCsv**
> String listProcessInstancesCsv(criteria, limit, start)

Querying for Process Instance records operated by the User

Querying for Process Instance records operated by the User

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
String criteria = "criteria_example"; // String | Search condition https://questetra.zendesk.com/hc/ja/articles/360002481031-XML-Criteria-for-Process-Instance-Search
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listProcessInstancesCsv(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#listProcessInstancesCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition https://questetra.zendesk.com/hc/ja/articles/360002481031-XML-Criteria-for-Process-Instance-Search | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="listProcessInstancesCsvUtf16"></a>
# **listProcessInstancesCsvUtf16**
> String listProcessInstancesCsvUtf16(criteria, limit, start)

Querying for Process Instance records operated by the User

Querying for Process Instance records operated by the User

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
String criteria = "criteria_example"; // String | Search condition https://questetra.zendesk.com/hc/ja/articles/360002481031-XML-Criteria-for-Process-Instance-Search
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listProcessInstancesCsvUtf16(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#listProcessInstancesCsvUtf16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition https://questetra.zendesk.com/hc/ja/articles/360002481031-XML-Criteria-for-Process-Instance-Search | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="removeProcessInstanceStar"></a>
# **removeProcessInstanceStar**
> removeProcessInstanceStar(processInstanceId)

Removing a Star from a Process

Removing a Star from a Process

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
    apiInstance.removeProcessInstanceStar(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#removeProcessInstanceStar");
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

<a name="stopProcessInstance"></a>
# **stopProcessInstance**
> stopProcessInstance(processInstanceId)

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
    apiInstance.stopProcessInstance(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceApi#stopProcessInstance");
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

