# ItemCacheApi

All URIs are relative to *https://online-demo-en.questetra.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteItemCache**](ItemCacheApi.md#deleteItemCache) | **POST** /API/Admin/ItemCache/delete | Clearing Cached Choices master
[**getItemCache**](ItemCacheApi.md#getItemCache) | **GET** /API/Admin/ItemCache/view | Retrieving a List of Cached Choices
[**listItemCaches**](ItemCacheApi.md#listItemCaches) | **GET** /API/Admin/ItemCache/list | Retrieving a List of Cached Choices master


<a name="deleteItemCache"></a>
# **deleteItemCache**
> deleteItemCache(url)

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
    apiInstance.deleteItemCache(url);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCacheApi#deleteItemCache");
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

<a name="getItemCache"></a>
# **getItemCache**
> ItemCache getItemCache(url)

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
    ItemCache result = apiInstance.getItemCache(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCacheApi#getItemCache");
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

<a name="listItemCaches"></a>
# **listItemCaches**
> ItemCacheList listItemCaches()

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
    ItemCacheList result = apiInstance.listItemCaches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCacheApi#listItemCaches");
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

