# SystemAuthorityApi

All URIs are relative to *https://192.168.1.38:8443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToQgroup**](SystemAuthorityApi.md#addToQgroup) | **POST** /API/Admin/SystemAuthority/addToQgroup | Granting a System Privilege to an Organization
[**addToQrole**](SystemAuthorityApi.md#addToQrole) | **POST** /API/Admin/SystemAuthority/addToQrole | Granting a System Privilege to a Role
[**addToQuser**](SystemAuthorityApi.md#addToQuser) | **POST** /API/Admin/SystemAuthority/addToQuser | Granting a System Privilege to a User
[**delete**](SystemAuthorityApi.md#delete) | **POST** /API/Admin/SystemAuthority/delete | Deleting a System Privilege
[**list**](SystemAuthorityApi.md#list) | **GET** /API/Admin/SystemAuthority/list | Retrieving a List of System Privilege


<a name="addToQgroup"></a>
# **addToQgroup**
> SystemAuthorityWrapper addToQgroup(type, qgroupId, leader, descendantQgroups)

Granting a System Privilege to an Organization

Granting a System Privilege to an Organization

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.SystemAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemAuthorityApi apiInstance = new SystemAuthorityApi();
Integer type = 56; // Integer | Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization
Long qgroupId = 789L; // Long | Organization ID
Boolean leader = true; // Boolean | 
Boolean descendantQgroups = true; // Boolean | 
try {
    SystemAuthorityWrapper result = apiInstance.addToQgroup(type, qgroupId, leader, descendantQgroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemAuthorityApi#addToQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization |
 **qgroupId** | **Long**| Organization ID |
 **leader** | **Boolean**|  | [optional]
 **descendantQgroups** | **Boolean**|  | [optional]

### Return type

[**SystemAuthorityWrapper**](SystemAuthorityWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="addToQrole"></a>
# **addToQrole**
> SystemAuthorityWrapper addToQrole(type, qroleId)

Granting a System Privilege to a Role

Granting a System Privilege to a Role

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.SystemAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemAuthorityApi apiInstance = new SystemAuthorityApi();
Integer type = 56; // Integer | Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization
Long qroleId = 789L; // Long | Role ID
try {
    SystemAuthorityWrapper result = apiInstance.addToQrole(type, qroleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemAuthorityApi#addToQrole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization |
 **qroleId** | **Long**| Role ID |

### Return type

[**SystemAuthorityWrapper**](SystemAuthorityWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addToQuser"></a>
# **addToQuser**
> SystemAuthorityWrapper addToQuser(type, quserId)

Granting a System Privilege to a User

Granting a System Privilege to a User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.SystemAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemAuthorityApi apiInstance = new SystemAuthorityApi();
Integer type = 56; // Integer | Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization
Long quserId = 789L; // Long | User ID
try {
    SystemAuthorityWrapper result = apiInstance.addToQuser(type, quserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemAuthorityApi#addToQuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization |
 **quserId** | **Long**| User ID |

### Return type

[**SystemAuthorityWrapper**](SystemAuthorityWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id)

Deleting a System Privilege

Deleting a System Privilege

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.SystemAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemAuthorityApi apiInstance = new SystemAuthorityApi();
Long id = 789L; // Long | System Authorization ID
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemAuthorityApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| System Authorization ID |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> SystemAuthorityList list(type)

Retrieving a List of System Privilege

Retrieving a List of System Privilege

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.SystemAuthorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemAuthorityApi apiInstance = new SystemAuthorityApi();
Integer type = 56; // Integer | Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization
try {
    SystemAuthorityList result = apiInstance.list(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemAuthorityApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization |

### Return type

[**SystemAuthorityList**](SystemAuthorityList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

