# WorkitemApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWorkitemStar**](WorkitemApi.md#addWorkitemStar) | **POST** /API/OR/Workitem/Star/add | Adding a Star to a Process related to a Task
[**batchAcceptWorkitems**](WorkitemApi.md#batchAcceptWorkitems) | **POST** /API/PE/Workitem/batchAccept | Accepting a Offered Task
[**listAllocatedWorkitems**](WorkitemApi.md#listAllocatedWorkitems) | **GET** /API/PE/Workitem/listAllocated | Retrieving a List of My Tasks
[**listOfferedWorkitems**](WorkitemApi.md#listOfferedWorkitems) | **GET** /API/PE/Workitem/listOffered | Retrieving a List of Offered Tasks
[**listWorkitems**](WorkitemApi.md#listWorkitems) | **GET** /API/OR/Workitem/list | Querying for Task records operated by the User
[**listWorkitemsCsv**](WorkitemApi.md#listWorkitemsCsv) | **GET** /API/OR/Workitem/listCsv | Querying for Task records operated by the User
[**listWorkitemsCsvUtf16**](WorkitemApi.md#listWorkitemsCsvUtf16) | **GET** /API/OR/Workitem/listCsvUtf16 | Querying for Task records operated by the User
[**reallocateWorkitem**](WorkitemApi.md#reallocateWorkitem) | **POST** /API/PIM/Workitem/reallocate | Reallocating Task
[**removeWorkitemStar**](WorkitemApi.md#removeWorkitemStar) | **POST** /API/OR/Workitem/Star/remove | Removing a Star from a Process related to a Task


<a name="addWorkitemStar"></a>
# **addWorkitemStar**
> addWorkitemStar(workitemId)

Adding a Star to a Process related to a Task

Adding a Star to a Process related to a Task

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
Long workitemId = 789L; // Long | 
try {
    apiInstance.addWorkitemStar(workitemId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#addWorkitemStar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="batchAcceptWorkitems"></a>
# **batchAcceptWorkitems**
> WorkitemOpResultList batchAcceptWorkitems(workitemIds)

Accepting a Offered Task

Accepting a Offered Task

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
List<Long> workitemIds = Arrays.asList(56L); // List<Long> | Multiple IDs are OK
try {
    WorkitemOpResultList result = apiInstance.batchAcceptWorkitems(workitemIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#batchAcceptWorkitems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemIds** | [**List&lt;Long&gt;**](Long.md)| Multiple IDs are OK |

### Return type

[**WorkitemOpResultList**](WorkitemOpResultList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllocatedWorkitems"></a>
# **listAllocatedWorkitems**
> WorkitemList listAllocatedWorkitems()

Retrieving a List of My Tasks

Retrieving a List of My Tasks

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
try {
    WorkitemList result = apiInstance.listAllocatedWorkitems();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listAllocatedWorkitems");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkitemList**](WorkitemList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOfferedWorkitems"></a>
# **listOfferedWorkitems**
> WorkitemList listOfferedWorkitems()

Retrieving a List of Offered Tasks

Retrieving a List of Offered Tasks

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
try {
    WorkitemList result = apiInstance.listOfferedWorkitems();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listOfferedWorkitems");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkitemList**](WorkitemList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkitems"></a>
# **listWorkitems**
> WorkitemWithDataList listWorkitems(criteria, limit, start)

Querying for Task records operated by the User

Querying for Task records operated by the User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
String criteria = "criteria_example"; // String | Search condition https://questetra.zendesk.com/hc/ja/articles/360002463432-XML-Criteria-for-Workitem-Search
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    WorkitemWithDataList result = apiInstance.listWorkitems(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listWorkitems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition https://questetra.zendesk.com/hc/ja/articles/360002463432-XML-Criteria-for-Workitem-Search | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

[**WorkitemWithDataList**](WorkitemWithDataList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkitemsCsv"></a>
# **listWorkitemsCsv**
> String listWorkitemsCsv(criteria, limit, start)

Querying for Task records operated by the User

Querying for Task records operated by the User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
String criteria = "criteria_example"; // String | Search condition https://questetra.zendesk.com/hc/ja/articles/360002463432-XML-Criteria-for-Workitem-Search
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listWorkitemsCsv(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listWorkitemsCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition https://questetra.zendesk.com/hc/ja/articles/360002463432-XML-Criteria-for-Workitem-Search | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="listWorkitemsCsvUtf16"></a>
# **listWorkitemsCsvUtf16**
> String listWorkitemsCsvUtf16(criteria, limit, start)

Querying for Task records operated by the User

Querying for Task records operated by the User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
String criteria = "criteria_example"; // String | Search condition https://questetra.zendesk.com/hc/ja/articles/360002463432-XML-Criteria-for-Workitem-Search
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listWorkitemsCsvUtf16(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listWorkitemsCsvUtf16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | **String**| Search condition https://questetra.zendesk.com/hc/ja/articles/360002463432-XML-Criteria-for-Workitem-Search | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

<a name="reallocateWorkitem"></a>
# **reallocateWorkitem**
> reallocateWorkitem(workitemId, quserId, qgroupId)

Reallocating Task

The specified Task is placed on the Swimlane which is set [allocated to the person who processed the first task], and if multiple Tasks in processing exist, all of the Tasks will be allocated.

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
Long workitemId = 789L; // Long | 
Long quserId = 789L; // Long | 
Long qgroupId = 789L; // Long | 
try {
    apiInstance.reallocateWorkitem(workitemId, quserId, qgroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#reallocateWorkitem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**|  |
 **quserId** | **Long**|  |
 **qgroupId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeWorkitemStar"></a>
# **removeWorkitemStar**
> removeWorkitemStar(workitemId)

Removing a Star from a Process related to a Task

Removing a Star from a Process related to a Task

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.WorkitemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WorkitemApi apiInstance = new WorkitemApi();
Long workitemId = 789L; // Long | 
try {
    apiInstance.removeWorkitemStar(workitemId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#removeWorkitemStar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workitemId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

