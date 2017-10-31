# WorkitemApi

All URIs are relative to *https://192.168.1.38:8443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStar**](WorkitemApi.md#addStar) | **POST** /API/OR/Workitem/Star/add | Adding a Star to a Task
[**batchAccespWorkitem**](WorkitemApi.md#batchAccespWorkitem) | **POST** /API/PE/Workitem/batchAccept | Accepting a Offered Task
[**list**](WorkitemApi.md#list) | **GET** /API/OR/Workitem/list | Querying for Task records operated by the User
[**listAllocatedWorkitem**](WorkitemApi.md#listAllocatedWorkitem) | **GET** /API/PE/Workitem/listAllocated | Retrieving a List of My Tasks
[**listCsv**](WorkitemApi.md#listCsv) | **GET** /API/OR/Workitem/listCsv | Querying for Task records operated by the User
[**listCsvUtf16**](WorkitemApi.md#listCsvUtf16) | **GET** /API/OR/Workitem/listCsvUtf16 | Querying for Task records operated by the User
[**listOfferedWorkitem**](WorkitemApi.md#listOfferedWorkitem) | **GET** /API/PE/Workitem/listOffered | Retrieving a List of Offered Tasks
[**reallocate**](WorkitemApi.md#reallocate) | **POST** /API/PIM/Workitem/reallocate | Reallocating Task
[**removeStar**](WorkitemApi.md#removeStar) | **POST** /API/OR/Workitem/Star/remove | Removing a Star from a Task


<a name="addStar"></a>
# **addStar**
> addStar(workitemId)

Adding a Star to a Task

Adding a Star to a Task

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
    apiInstance.addStar(workitemId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#addStar");
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

<a name="batchAccespWorkitem"></a>
# **batchAccespWorkitem**
> WorkitemOpResultList batchAccespWorkitem(workitemIds)

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
    WorkitemOpResultList result = apiInstance.batchAccespWorkitem(workitemIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#batchAccespWorkitem");
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

<a name="list"></a>
# **list**
> WorkitemWithDataList list(criteria, limit, start)

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
String criteria = "criteria_example"; // String | Search condition
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    WorkitemWithDataList result = apiInstance.list(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#list");
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

[**WorkitemWithDataList**](WorkitemWithDataList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllocatedWorkitem"></a>
# **listAllocatedWorkitem**
> WorkitemList listAllocatedWorkitem()

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
    WorkitemList result = apiInstance.listAllocatedWorkitem();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listAllocatedWorkitem");
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

<a name="listCsv"></a>
# **listCsv**
> String listCsv(criteria, limit, start)

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
String criteria = "criteria_example"; // String | Search condition
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listCsv(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listCsv");
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
String criteria = "criteria_example"; // String | Search condition
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    String result = apiInstance.listCsvUtf16(criteria, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listCsvUtf16");
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

<a name="listOfferedWorkitem"></a>
# **listOfferedWorkitem**
> WorkitemList listOfferedWorkitem()

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
    WorkitemList result = apiInstance.listOfferedWorkitem();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#listOfferedWorkitem");
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

<a name="reallocate"></a>
# **reallocate**
> reallocate(workitemId, quserId, qgroupId)

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
    apiInstance.reallocate(workitemId, quserId, qgroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#reallocate");
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

<a name="removeStar"></a>
# **removeStar**
> removeStar(workitemId)

Removing a Star from a Task

Removing a Star from a Task

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
    apiInstance.removeStar(workitemId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkitemApi#removeStar");
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

