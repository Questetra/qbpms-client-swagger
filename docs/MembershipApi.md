# MembershipApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMembership**](MembershipApi.md#addMembership) | **POST** /API/UGA/Membership/add | Adding a Member to an Organization
[**deleteMembership**](MembershipApi.md#deleteMembership) | **POST** /API/UGA/Membership/delete | Deleting a Member from an Organization
[**listMembershipsByQgroup**](MembershipApi.md#listMembershipsByQgroup) | **GET** /API/User/Membership/listByQgroup | Retrieving all Members of an Organization
[**listMembershipsByQuser**](MembershipApi.md#listMembershipsByQuser) | **GET** /API/User/Membership/listByQuser | Retrieving all Organizations for a User
[**updateMembership**](MembershipApi.md#updateMembership) | **POST** /API/UGA/Membership/update | Assigning a Leader to an Organization


<a name="addMembership"></a>
# **addMembership**
> MembershipWrapper addMembership(quserId, qgroupId, role)

Adding a Member to an Organization

Adding a Member to an Organization

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.MembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MembershipApi apiInstance = new MembershipApi();
Long quserId = 789L; // Long | User ID
Long qgroupId = 789L; // Long | Organization ID
String role = "role_example"; // String | Member’s role: _leader or blank
try {
    MembershipWrapper result = apiInstance.addMembership(quserId, qgroupId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#addMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qgroupId** | **Long**| Organization ID |
 **role** | **String**| Member’s role: _leader or blank | [optional]

### Return type

[**MembershipWrapper**](MembershipWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteMembership"></a>
# **deleteMembership**
> deleteMembership(quserId, qgroupId)

Deleting a Member from an Organization

Deleting a Member from an Organization

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.MembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MembershipApi apiInstance = new MembershipApi();
Long quserId = 789L; // Long | User ID
Long qgroupId = 789L; // Long | Organization ID
try {
    apiInstance.deleteMembership(quserId, qgroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#deleteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qgroupId** | **Long**| Organization ID |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="listMembershipsByQgroup"></a>
# **listMembershipsByQgroup**
> MembershipList listMembershipsByQgroup(id)

Retrieving all Members of an Organization

Retrieving all Members of an Organization

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.MembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MembershipApi apiInstance = new MembershipApi();
Long id = 789L; // Long | Organization ID
try {
    MembershipList result = apiInstance.listMembershipsByQgroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#listMembershipsByQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Organization ID |

### Return type

[**MembershipList**](MembershipList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMembershipsByQuser"></a>
# **listMembershipsByQuser**
> MembershipList listMembershipsByQuser(id)

Retrieving all Organizations for a User

Retrieving all Organizations for a User

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.MembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MembershipApi apiInstance = new MembershipApi();
Long id = 789L; // Long | User ID
try {
    MembershipList result = apiInstance.listMembershipsByQuser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#listMembershipsByQuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| User ID |

### Return type

[**MembershipList**](MembershipList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMembership"></a>
# **updateMembership**
> MembershipWrapper updateMembership(quserId, qgroupId, role)

Assigning a Leader to an Organization

Assigning a Leader to an Organization

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.MembershipApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MembershipApi apiInstance = new MembershipApi();
Long quserId = 789L; // Long | User ID
Long qgroupId = 789L; // Long | Organization ID
String role = "role_example"; // String | Member’s role: _leader or blank
try {
    MembershipWrapper result = apiInstance.updateMembership(quserId, qgroupId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#updateMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qgroupId** | **Long**| Organization ID |
 **role** | **String**| Member’s role: _leader or blank | [optional]

### Return type

[**MembershipWrapper**](MembershipWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

