# ProcessAuthorityApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProcessAuthorityToQrole**](ProcessAuthorityApi.md#addProcessAuthorityToQrole) | **POST** /API/Admin/ProcessAuthority/addToQrole | Granting a Process Privilege to a Role
[**addProcessAuthorityToQuser**](ProcessAuthorityApi.md#addProcessAuthorityToQuser) | **POST** /API/Admin/ProcessAuthority/addToQuser | Granting a Process Privilege to a User
[**addToProcessAuthorityQgroup**](ProcessAuthorityApi.md#addToProcessAuthorityQgroup) | **POST** /API/Admin/ProcessAuthority/addToQgroup | Granting a Process Privilege to an Organization
[**deleteProcessAuthority**](ProcessAuthorityApi.md#deleteProcessAuthority) | **POST** /API/Admin/ProcessAuthority/delete | Deleting a Process Privilege
[**listProcessAuthorities**](ProcessAuthorityApi.md#listProcessAuthorities) | **GET** /API/Admin/ProcessAuthority/list | Retrieving a List of Process Privilege


<a name="addProcessAuthorityToQrole"></a>
# **addProcessAuthorityToQrole**
> ProcessAuthorityWrapper addProcessAuthorityToQrole(processModelInfoId, type, qroleId)

Granting a Process Privilege to a Role

Granting a Process Privilege to a Role

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessAuthorityApi apiInstance = new ProcessAuthorityApi();
Long processModelInfoId = 789L; // Long | 
Integer type = 56; // Integer | Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information)
Long qroleId = 789L; // Long | Role ID
try {
    ProcessAuthorityWrapper result = apiInstance.addProcessAuthorityToQrole(processModelInfoId, type, qroleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAuthorityApi#addProcessAuthorityToQrole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **type** | **Integer**| Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) |
 **qroleId** | **Long**| Role ID |

### Return type

[**ProcessAuthorityWrapper**](ProcessAuthorityWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addProcessAuthorityToQuser"></a>
# **addProcessAuthorityToQuser**
> ProcessAuthorityWrapper addProcessAuthorityToQuser(processModelInfoId, type, quserId)

Granting a Process Privilege to a User

Granting a Process Privilege to a User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessAuthorityApi apiInstance = new ProcessAuthorityApi();
Long processModelInfoId = 789L; // Long | 
Integer type = 56; // Integer | Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information)
Long quserId = 789L; // Long | User ID
try {
    ProcessAuthorityWrapper result = apiInstance.addProcessAuthorityToQuser(processModelInfoId, type, quserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAuthorityApi#addProcessAuthorityToQuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **type** | **Integer**| Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) |
 **quserId** | **Long**| User ID |

### Return type

[**ProcessAuthorityWrapper**](ProcessAuthorityWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addToProcessAuthorityQgroup"></a>
# **addToProcessAuthorityQgroup**
> ProcessAuthorityWrapper addToProcessAuthorityQgroup(processModelInfoId, type, qgroupId, leader, descendantQgroups)

Granting a Process Privilege to an Organization

Granting a Process Privilege to an Organization

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessAuthorityApi apiInstance = new ProcessAuthorityApi();
Long processModelInfoId = 789L; // Long | 
Integer type = 56; // Integer | Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information)
Long qgroupId = 789L; // Long | Organization ID
Boolean leader = true; // Boolean | 
Boolean descendantQgroups = true; // Boolean | 
try {
    ProcessAuthorityWrapper result = apiInstance.addToProcessAuthorityQgroup(processModelInfoId, type, qgroupId, leader, descendantQgroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAuthorityApi#addToProcessAuthorityQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **type** | **Integer**| Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) |
 **qgroupId** | **Long**| Organization ID |
 **leader** | **Boolean**|  | [optional]
 **descendantQgroups** | **Boolean**|  | [optional]

### Return type

[**ProcessAuthorityWrapper**](ProcessAuthorityWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteProcessAuthority"></a>
# **deleteProcessAuthority**
> deleteProcessAuthority(id)

Deleting a Process Privilege

Deleting a Process Privilege

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessAuthorityApi apiInstance = new ProcessAuthorityApi();
Long id = 789L; // Long | Process Authorization ID
try {
    apiInstance.deleteProcessAuthority(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAuthorityApi#deleteProcessAuthority");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Process Authorization ID |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="listProcessAuthorities"></a>
# **listProcessAuthorities**
> ProcessAuthorityList listProcessAuthorities(processModelInfoId, type)

Retrieving a List of Process Privilege

Retrieving a List of Process Privilege

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ProcessAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessAuthorityApi apiInstance = new ProcessAuthorityApi();
Long processModelInfoId = 789L; // Long | 
Integer type = 56; // Integer | Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information)
try {
    ProcessAuthorityList result = apiInstance.listProcessAuthorities(processModelInfoId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAuthorityApi#listProcessAuthorities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **type** | **Integer**| Type of Process Authorization 0:App Administrator Authorization 1:Process Manager Authorization 2:Data Viewer Authorization 3:Data Viewer Authorization(only Progress Information) |

### Return type

[**ProcessAuthorityList**](ProcessAuthorityList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

