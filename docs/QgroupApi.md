# QgroupApi

All URIs are relative to *https://192.168.1.38:8443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](QgroupApi.md#add) | **POST** /API/UGA/Qgroup/add | Creating an Organization Unit
[**delete**](QgroupApi.md#delete) | **POST** /API/UGA/Qgroup/delete | Deleting an Organization Unit
[**find**](QgroupApi.md#find) | **GET** /API/User/Qgroup/find | Retrieving an Organization Unit
[**list**](QgroupApi.md#list) | **GET** /API/User/Qgroup/list | Retrieving a List of Organizations
[**update**](QgroupApi.md#update) | **POST** /API/UGA/Qgroup/update | Updating an Organization Unit


<a name="add"></a>
# **add**
> QgroupWrapper add(name, parentQgroupId, email)

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
    QgroupWrapper result = apiInstance.add(name, parentQgroupId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#add");
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

<a name="delete"></a>
# **delete**
> delete(id)

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
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#delete");
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

<a name="find"></a>
# **find**
> QgroupWrapper find(id, name)

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
    QgroupWrapper result = apiInstance.find(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#find");
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

<a name="list"></a>
# **list**
> QgroupList list(query, limit, start)

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
    QgroupList result = apiInstance.list(query, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#list");
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

<a name="update"></a>
# **update**
> QgroupWrapper update(id, name, email, parentQgroupId)

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
    QgroupWrapper result = apiInstance.update(id, name, email, parentQgroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QgroupApi#update");
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

