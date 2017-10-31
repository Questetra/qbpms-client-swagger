# QuserApi

All URIs are relative to *https://192.168.1.38:8443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](QuserApi.md#add) | **POST** /API/UGA/Quser/add | Creating a User Account
[**delete**](QuserApi.md#delete) | **POST** /API/UGA/Quser/delete | Deleting a User Account
[**find**](QuserApi.md#find) | **GET** /API/User/Quser/find | Retrieving a User Account
[**list**](QuserApi.md#list) | **GET** /API/User/Quser/list | Retrieving a List of Users
[**self**](QuserApi.md#self) | **GET** /API/User/Quser/self | Retrieving the user’s own User Account
[**update**](QuserApi.md#update) | **POST** /API/UGA/Quser/update | Updating a User Account


<a name="add"></a>
# **add**
> QuserWrapper add(name, email, password)

Creating a User Account

Creating a User Account

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QuserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuserApi apiInstance = new QuserApi();
String name = "name_example"; // String | 
String email = "email_example"; // String | 
String password = "password_example"; // String | 
try {
    QuserWrapper result = apiInstance.add(name, email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **email** | **String**|  |
 **password** | **String**|  |

### Return type

[**QuserWrapper**](QuserWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id, delegateQuserId, delegateQgroupId)

Deleting a User Account

Deleting a User Account

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QuserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuserApi apiInstance = new QuserApi();
Long id = 789L; // Long | 
BigDecimal delegateQuserId = new BigDecimal(); // BigDecimal | 
BigDecimal delegateQgroupId = new BigDecimal(); // BigDecimal | 
try {
    apiInstance.delete(id, delegateQuserId, delegateQgroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **delegateQuserId** | **BigDecimal**|  | [optional]
 **delegateQgroupId** | **BigDecimal**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="find"></a>
# **find**
> QuserWithPrimaryQgroup find(id, email)

Retrieving a User Account

Retrieving a User Account

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QuserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuserApi apiInstance = new QuserApi();
Long id = 789L; // Long | 
String email = "email_example"; // String | 
try {
    QuserWithPrimaryQgroup result = apiInstance.find(id, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]
 **email** | **String**|  | [optional]

### Return type

[**QuserWithPrimaryQgroup**](QuserWithPrimaryQgroup.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> QuserList list(query, limit, start)

Retrieving a List of Users

Retrieving a List of Users

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QuserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuserApi apiInstance = new QuserApi();
String query = "query_example"; // String | 
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    QuserList result = apiInstance.list(query, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#list");
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

[**QuserList**](QuserList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="self"></a>
# **self**
> QuserWithPrimaryQgroup self()

Retrieving the user’s own User Account

Retrieving the user’s own User Account

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QuserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuserApi apiInstance = new QuserApi();
try {
    QuserWithPrimaryQgroup result = apiInstance.self();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#self");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuserWithPrimaryQgroup**](QuserWithPrimaryQgroup.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> QuserWrapper update(id, name, email, password, primaryQgroupId)

Updating a User Account

Updating a User Account

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QuserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuserApi apiInstance = new QuserApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
String email = "email_example"; // String | 
String password = "password_example"; // String | 
Long primaryQgroupId = 789L; // Long | 
try {
    QuserWrapper result = apiInstance.update(id, name, email, password, primaryQgroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  | [optional]
 **email** | **String**|  | [optional]
 **password** | **String**|  | [optional]
 **primaryQgroupId** | **Long**|  | [optional]

### Return type

[**QuserWrapper**](QuserWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

