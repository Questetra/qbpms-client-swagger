# MessageCatchEventApi

All URIs are relative to *https://192.168.1.38:8443/userweb/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**receive**](MessageCatchEventApi.md#receive) | **POST** /System/Event/IntermediateMessage/{processModelInfoId}/{nodeNumber}/receive | 
[**start**](MessageCatchEventApi.md#start) | **POST** /System/Event/MessageStart/{processModelInfoId}/{nodeNumber}/start | 


<a name="receive"></a>
# **receive**
> receive(processModelInfoId, nodeNumber, processInstanceId, key)



- https://www.questetra.com/tour/m2/m226/ - R2184 Error Response for HTTP Standby   https://docs.google.com/spreadsheets/u/1/d/1TNLIho-Uj8BGPrNUGRvTGxm4XdUf3mK0xgwHqQ3pjr4/pub?single&#x3D;true&amp;gid&#x3D;0&amp;output&#x3D;html - R2210 Naming Convention for Data Receiving Parameter   https://docs.google.com/spreadsheets/u/1/d/1TNLIho-Uj8BGPrNUGRvTGxm4XdUf3mK0xgwHqQ3pjr4/pub?single&#x3D;true&amp;gid&#x3D;2&amp;output&#x3D;html 

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.api.MessageCatchEventApi;


MessageCatchEventApi apiInstance = new MessageCatchEventApi();
Long processModelInfoId = 789L; // Long | 
Long nodeNumber = 789L; // Long | 
Long processInstanceId = 789L; // Long | Process ID 
String key = "key_example"; // String | Security Key 
try {
    apiInstance.receive(processModelInfoId, nodeNumber, processInstanceId, key);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageCatchEventApi#receive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **nodeNumber** | **Long**|  |
 **processInstanceId** | **Long**| Process ID  |
 **key** | **String**| Security Key  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: text/xml

<a name="start"></a>
# **start**
> start(processModelInfoId, nodeNumber, key)



- https://www.questetra.com/tour/m2/m221/ - R2182 Error Notification of HTTP Start   https://docs.google.com/spreadsheets/u/1/d/17sRiJA5Iq7U2gShK4UJJCPUrGh4ScQOpR2gAnS94s2E/pub?single&#x3D;true&amp;gid&#x3D;9&amp;output&#x3D;html&amp;widget&#x3D;true - R2210 Naming Convention for Data Receiving Parameter   https://docs.google.com/spreadsheets/u/1/d/1TNLIho-Uj8BGPrNUGRvTGxm4XdUf3mK0xgwHqQ3pjr4/pub?single&#x3D;true&amp;gid&#x3D;2&amp;output&#x3D;html 

### Example
```java
// Import classes:
//import com.questetra.bpms.client.swagger.ApiException;
//import com.questetra.bpms.client.swagger.api.MessageCatchEventApi;


MessageCatchEventApi apiInstance = new MessageCatchEventApi();
Long processModelInfoId = 789L; // Long | 
Long nodeNumber = 789L; // Long | 
String key = "key_example"; // String | Security Key 
try {
    apiInstance.start(processModelInfoId, nodeNumber, key);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageCatchEventApi#start");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelInfoId** | **Long**|  |
 **nodeNumber** | **Long**|  |
 **key** | **String**| Security Key  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: text/xml

