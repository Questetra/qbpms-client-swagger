# ItemCacheApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](ItemCacheApi.md#delete) | **POST** /API/Admin/ItemCache/delete | Clearing Cached Choices master
[**list**](ItemCacheApi.md#list) | **GET** /API/Admin/ItemCache/list | Retrieving a List of Cached Choices master
[**view**](ItemCacheApi.md#view) | **GET** /API/Admin/ItemCache/view | Retrieving a List of Cached Choices


<a name="delete"></a>
# **delete**
> delete(url)

Clearing Cached Choices master

Clearing Cached Choices master

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ItemCacheApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemCacheApi apiInstance = new ItemCacheApi();
String url = "url_example"; // String | 
try {
    apiInstance.delete(url);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCacheApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="list"></a>
# **list**
> ItemCacheList list()

Retrieving a List of Cached Choices master

Retrieving a List of Cached Choices master

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ItemCacheApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemCacheApi apiInstance = new ItemCacheApi();
try {
    ItemCacheList result = apiInstance.list();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCacheApi#list");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ItemCacheList**](ItemCacheList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="view"></a>
# **view**
> ItemCache view(url)

Retrieving a List of Cached Choices

Retrieving a List of Cached Choices

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiClient;
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.Configuration;
//import com.questetra.bpms.client.swagger.auth.*;
//import com.questetra.bpms.client.swagger.api.ItemCacheApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemCacheApi apiInstance = new ItemCacheApi();
String url = "url_example"; // String | 
try {
    ItemCache result = apiInstance.view(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCacheApi#view");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

[**ItemCache**](ItemCache.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

