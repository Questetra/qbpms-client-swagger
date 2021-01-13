# QroleApi

All URIs are relative to *https://192.168.1.12:18443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQrole**](QroleApi.md#addQrole) | **POST** /API/UGA/Qrole/add | Creating a Role Unit
[**deleteQrole**](QroleApi.md#deleteQrole) | **POST** /API/UGA/Qrole/delete | Deleting a Role Unit
[**findQrole**](QroleApi.md#findQrole) | **GET** /API/User/Qrole/find | Retrieving a Role Unit
[**listQroles**](QroleApi.md#listQroles) | **GET** /API/User/Qrole/list | Retrieving a List of Roles
[**updateQrole**](QroleApi.md#updateQrole) | **POST** /API/UGA/Qrole/update | Updating a Role Unit


<a name="addQrole"></a>
# **addQrole**
> QroleWrapper addQrole(name)

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
    QroleWrapper result = apiInstance.addQrole(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#addQrole");
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

<a name="deleteQrole"></a>
# **deleteQrole**
> deleteQrole(id)

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
    apiInstance.deleteQrole(id);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#deleteQrole");
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

<a name="findQrole"></a>
# **findQrole**
> QroleWrapper findQrole(id, name)

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
    QroleWrapper result = apiInstance.findQrole(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#findQrole");
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

<a name="listQroles"></a>
# **listQroles**
> QroleList listQroles(query, limit, start)

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
    QroleList result = apiInstance.listQroles(query, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#listQroles");
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

<a name="updateQrole"></a>
# **updateQrole**
> QroleWrapper updateQrole(id, name)

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
    QroleWrapper result = apiInstance.updateQrole(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QroleApi#updateQrole");
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

