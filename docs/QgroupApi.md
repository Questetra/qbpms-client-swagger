# QgroupApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQgroup**](QgroupApi.md#addQgroup) | **POST** /API/UGA/Qgroup/add | Creating an Organization Unit
[**deleteQgroup**](QgroupApi.md#deleteQgroup) | **POST** /API/UGA/Qgroup/delete | Deleting an Organization Unit
[**findQgroup**](QgroupApi.md#findQgroup) | **GET** /API/User/Qgroup/find | Retrieving an Organization Unit
[**listQgroups**](QgroupApi.md#listQgroups) | **GET** /API/User/Qgroup/list | Retrieving a List of Organizations
[**updateQgroup**](QgroupApi.md#updateQgroup) | **POST** /API/UGA/Qgroup/update | Updating an Organization Unit


<a name="addQgroup"></a>
# **addQgroup**
> QgroupWrapper addQgroup(name, parentQgroupId, email)

Creating an Organization Unit

Creating an Organization Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QgroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QgroupApi apiInstance = new QgroupApi();
String name = "name_example"; // String | Organization name
Long parentQgroupId = 789L; // Long | Parent Organization ID
String email = "email_example"; // String | Organization email address
try {
    QgroupWrapper result = apiInstance.addQgroup(name, parentQgroupId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#addQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Organization name |
 **parentQgroupId** | **Long**| Parent Organization ID |
 **email** | **String**| Organization email address | [optional]

### Return type

[**QgroupWrapper**](QgroupWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteQgroup"></a>
# **deleteQgroup**
> deleteQgroup(id)

Deleting an Organization Unit

Deleting an Organization Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QgroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QgroupApi apiInstance = new QgroupApi();
Long id = 789L; // Long | Organization ID
try {
    apiInstance.deleteQgroup(id);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#deleteQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Organization ID |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="findQgroup"></a>
# **findQgroup**
> QgroupWrapper findQgroup(id, name)

Retrieving an Organization Unit

Retrieving an Organization Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QgroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QgroupApi apiInstance = new QgroupApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
try {
    QgroupWrapper result = apiInstance.findQgroup(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#findQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**QgroupWrapper**](QgroupWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listQgroups"></a>
# **listQgroups**
> QgroupList listQgroups(query, limit, start)

Retrieving a List of Organizations

Retrieving a List of Organizations

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QgroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QgroupApi apiInstance = new QgroupApi();
String query = "query_example"; // String | 
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    QgroupList result = apiInstance.listQgroups(query, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#listQgroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  | [optional]
 **limit** | **Integer**| Max number of records to return | [optional]
 **start** | **Integer**| The offset of the first record to return | [optional]

### Return type

[**QgroupList**](QgroupList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateQgroup"></a>
# **updateQgroup**
> QgroupWrapper updateQgroup(id, name, email, parentQgroupId)

Updating an Organization Unit

Updating an Organization Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QgroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QgroupApi apiInstance = new QgroupApi();
Long id = 789L; // Long | Organization ID
String name = "name_example"; // String | Organization name
String email = "email_example"; // String | Organization email address
Long parentQgroupId = 789L; // Long | Parent Organization ID
try {
    QgroupWrapper result = apiInstance.updateQgroup(id, name, email, parentQgroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#updateQgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Organization ID |
 **name** | **String**| Organization name | [optional]
 **email** | **String**| Organization email address | [optional]
 **parentQgroupId** | **Long**| Parent Organization ID | [optional]

### Return type

[**QgroupWrapper**](QgroupWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

