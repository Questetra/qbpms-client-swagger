# RoleMembershipApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRoleMembership**](RoleMembershipApi.md#addRoleMembership) | **POST** /API/UGA/RoleMembership/add | Adding a Member to a Role
[**deleteRoleMembership**](RoleMembershipApi.md#deleteRoleMembership) | **POST** /API/UGA/RoleMembership/delete | Deleting a Member from a Role
[**listRoleMembershipsByQrole**](RoleMembershipApi.md#listRoleMembershipsByQrole) | **GET** /API/User/RoleMembership/listByQrole | Retrieving all Members of a Role
[**listRoleMembershipsByQuser**](RoleMembershipApi.md#listRoleMembershipsByQuser) | **GET** /API/User/RoleMembership/listByQuser | Retrieving all Roles for a User


<a name="addRoleMembership"></a>
# **addRoleMembership**
> RoleMembershipWrapper addRoleMembership(quserId, qroleId)

Adding a Member to a Role

Adding a Member to a Role

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.RoleMembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RoleMembershipApi apiInstance = new RoleMembershipApi();
Long quserId = 789L; // Long | User ID
Long qroleId = 789L; // Long | Role ID
try {
    RoleMembershipWrapper result = apiInstance.addRoleMembership(quserId, qroleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMembershipApi#addRoleMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qroleId** | **Long**| Role ID |

### Return type

[**RoleMembershipWrapper**](RoleMembershipWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteRoleMembership"></a>
# **deleteRoleMembership**
> deleteRoleMembership(quserId, qroleId)

Deleting a Member from a Role

Deleting a Member from a Role

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.RoleMembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RoleMembershipApi apiInstance = new RoleMembershipApi();
Long quserId = 789L; // Long | User ID
Long qroleId = 789L; // Long | Role ID
try {
    apiInstance.deleteRoleMembership(quserId, qroleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMembershipApi#deleteRoleMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qroleId** | **Long**| Role ID |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="listRoleMembershipsByQrole"></a>
# **listRoleMembershipsByQrole**
> RoleMembershipList listRoleMembershipsByQrole(id)

Retrieving all Members of a Role

Retrieving all Members of a Role

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.RoleMembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RoleMembershipApi apiInstance = new RoleMembershipApi();
Long id = 789L; // Long | Role ID
try {
    RoleMembershipList result = apiInstance.listRoleMembershipsByQrole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMembershipApi#listRoleMembershipsByQrole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Role ID |

### Return type

[**RoleMembershipList**](RoleMembershipList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRoleMembershipsByQuser"></a>
# **listRoleMembershipsByQuser**
> RoleMembershipList listRoleMembershipsByQuser(id)

Retrieving all Roles for a User

Retrieving all Roles for a User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.RoleMembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RoleMembershipApi apiInstance = new RoleMembershipApi();
Long id = 789L; // Long | User ID
try {
    RoleMembershipList result = apiInstance.listRoleMembershipsByQuser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMembershipApi#listRoleMembershipsByQuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| User ID |

### Return type

[**RoleMembershipList**](RoleMembershipList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

