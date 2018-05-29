# QroleApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](QroleApi.md#add) | **POST** /API/UGA/Qrole/add | Creating a Role Unit
[**delete**](QroleApi.md#delete) | **POST** /API/UGA/Qrole/delete | Deleting a Role Unit
[**find**](QroleApi.md#find) | **GET** /API/User/Qrole/find | Retrieving a Role Unit
[**list**](QroleApi.md#list) | **GET** /API/User/Qrole/list | Retrieving a List of Roles
[**update**](QroleApi.md#update) | **POST** /API/UGA/Qrole/update | Updating a Role Unit


<a name="add"></a>
# **add**
> QroleWrapper add(name)

Creating a Role Unit

Creating a Role Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QroleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QroleApi apiInstance = new QroleApi();
String name = "name_example"; // String | Role name
try {
    QroleWrapper result = apiInstance.add(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Role name |

### Return type

[**QroleWrapper**](QroleWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id)

Deleting a Role Unit

Deleting a Role Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QroleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QroleApi apiInstance = new QroleApi();
Long id = 789L; // Long | Role ID
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Role ID |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="find"></a>
# **find**
> QroleWrapper find(id, name)

Retrieving a Role Unit

Retrieving a Role Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QroleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QroleApi apiInstance = new QroleApi();
Integer id = 56; // Integer | 
String name = "name_example"; // String | 
try {
    QroleWrapper result = apiInstance.find(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**QroleWrapper**](QroleWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> QroleList list(query, limit, start)

Retrieving a List of Roles

Retrieving a List of Roles

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QroleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QroleApi apiInstance = new QroleApi();
String query = "query_example"; // String | 
Integer limit = 56; // Integer | Max number of records to return
Integer start = 56; // Integer | The offset of the first record to return
try {
    QroleList result = apiInstance.list(query, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#list");
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

[**QroleList**](QroleList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> QroleWrapper update(id, name)

Updating a Role Unit

Updating a Role Unit

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.QroleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QroleApi apiInstance = new QroleApi();
Long id = 789L; // Long | Role ID
String name = "name_example"; // String | Role name
try {
    QroleWrapper result = apiInstance.update(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Role ID |
 **name** | **String**| Role name | [optional]

### Return type

[**QroleWrapper**](QroleWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

