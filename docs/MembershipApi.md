# MembershipApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](MembershipApi.md#add) | **POST** /API/UGA/Membership/add | Adding a Member to an Organization
[**delete**](MembershipApi.md#delete) | **POST** /API/UGA/Membership/delete | Deleting a Member from an Organization
[**listByQgroup**](MembershipApi.md#listByQgroup) | **GET** /API/User/Membership/listByQgroup | Retrieving all Members of an Organization
[**listByQuser**](MembershipApi.md#listByQuser) | **GET** /API/User/Membership/listByQuser | Retrieving all Organizations for a User
[**update**](MembershipApi.md#update) | **POST** /API/UGA/Membership/update | Assigning a Leader to an Organization


<a name="add"></a>
# **add**
> MembershipWrapper add(quserId, qgroupId, role)

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
String role = "role_example"; // String | Member’s role
try {
    MembershipWrapper result = apiInstance.add(quserId, qgroupId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qgroupId** | **Long**| Organization ID |
 **role** | **String**| Member’s role | [optional] [enum: _leader]

### Return type

[**MembershipWrapper**](MembershipWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(quserId, qgroupId)

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
    apiInstance.delete(quserId, qgroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#delete");
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

<a name="listByQgroup"></a>
# **listByQgroup**
> MembershipList listByQgroup(id)

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
    MembershipList result = apiInstance.listByQgroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#listByQgroup");
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

<a name="listByQuser"></a>
# **listByQuser**
> MembershipList listByQuser(id)

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
    MembershipList result = apiInstance.listByQuser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#listByQuser");
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

<a name="update"></a>
# **update**
> MembershipWrapper update(quserId, qgroupId, role)

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
String role = "role_example"; // String | Member’s role
try {
    MembershipWrapper result = apiInstance.update(quserId, qgroupId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MembershipApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quserId** | **Long**| User ID |
 **qgroupId** | **Long**| Organization ID |
 **role** | **String**| Member’s role | [optional] [enum: _leader]

### Return type

[**MembershipWrapper**](MembershipWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

