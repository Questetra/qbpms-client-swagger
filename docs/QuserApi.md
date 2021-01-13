# QuserApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQuser**](QuserApi.md#addQuser) | **POST** /API/UGA/Quser/add | Creating a User Account
[**deleteQuser**](QuserApi.md#deleteQuser) | **POST** /API/UGA/Quser/delete | Deleting a User Account
[**findQuser**](QuserApi.md#findQuser) | **GET** /API/User/Quser/find | Retrieving a User Account
[**getMySelf**](QuserApi.md#getMySelf) | **GET** /API/User/Quser/self | Retrieving the user’s own User Account
[**listQusers**](QuserApi.md#listQusers) | **GET** /API/User/Quser/list | Retrieving a List of Users
[**updateQuser**](QuserApi.md#updateQuser) | **POST** /API/UGA/Quser/update | Updating a User Account


<a name="addQuser"></a>
# **addQuser**
> QuserWrapper addQuser(name, email, password)

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
    QuserWrapper result = apiInstance.addQuser(name, email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#addQuser");
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

<a name="deleteQuser"></a>
# **deleteQuser**
> deleteQuser(id, delegateQuserId, delegateQgroupId)

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
Long delegateQuserId = 789L; // Long | 
Long delegateQgroupId = 789L; // Long | 
try {
    apiInstance.deleteQuser(id, delegateQuserId, delegateQgroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#deleteQuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **delegateQuserId** | **Long**|  | [optional]
 **delegateQgroupId** | **Long**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="findQuser"></a>
# **findQuser**
> QuserWithPrimaryQgroupWrapper findQuser(id, email)

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
    QuserWithPrimaryQgroupWrapper result = apiInstance.findQuser(id, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#findQuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]
 **email** | **String**|  | [optional]

### Return type

[**QuserWithPrimaryQgroupWrapper**](QuserWithPrimaryQgroupWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMySelf"></a>
# **getMySelf**
> QuserWithPrimaryQgroupWrapper getMySelf()

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
    QuserWithPrimaryQgroupWrapper result = apiInstance.getMySelf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#getMySelf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuserWithPrimaryQgroupWrapper**](QuserWithPrimaryQgroupWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listQusers"></a>
# **listQusers**
> QuserList listQusers(query, limit, start)

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
    QuserList result = apiInstance.listQusers(query, limit, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#listQusers");
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

<a name="updateQuser"></a>
# **updateQuser**
> QuserWithPrimaryQgroupWrapper updateQuser(id, name, email, password, primaryQgroupId)

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
    QuserWithPrimaryQgroupWrapper result = apiInstance.updateQuser(id, name, email, password, primaryQgroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuserApi#updateQuser");
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

[**QuserWithPrimaryQgroupWrapper**](QuserWithPrimaryQgroupWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

