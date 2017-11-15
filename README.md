# Questetra BPM Suite API Client Library for Java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.questetra</groupId>
    <artifactId>bpms.client.swagger</artifactId>
    <version>11.5.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.questetra:bpms.client.swagger:11.5.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/bpms.client.swagger-11.5.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.questetra.bpms.client.swagger.*;
import com.questetra.bpms.client.swagger.auth.*;
import com.questetra.bpms.client.swagger.model.*;
import com.questetra.bpms.client.swagger.api.ItemCacheApi;

import java.io.File;
import java.util.*;

public class ItemCacheApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://online-demo-en.questetra.net/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ItemCacheApi* | [**delete**](docs/ItemCacheApi.md#delete) | **POST** /API/Admin/ItemCache/delete | Clearing Cached Choices master
*ItemCacheApi* | [**list**](docs/ItemCacheApi.md#list) | **GET** /API/Admin/ItemCache/list | Retrieving a List of Cached Choices master
*ItemCacheApi* | [**view**](docs/ItemCacheApi.md#view) | **GET** /API/Admin/ItemCache/view | Retrieving a List of Cached Choices
*MembershipApi* | [**add**](docs/MembershipApi.md#add) | **POST** /API/UGA/Membership/add | Adding a Member to an Organization
*MembershipApi* | [**delete**](docs/MembershipApi.md#delete) | **POST** /API/UGA/Membership/delete | Deleting a Member from an Organization
*MembershipApi* | [**listByQgroup**](docs/MembershipApi.md#listByQgroup) | **GET** /API/User/Membership/listByQgroup | Retrieving all Members of an Organization
*MembershipApi* | [**listByQuser**](docs/MembershipApi.md#listByQuser) | **GET** /API/User/Membership/listByQuser | Retrieving all Organizations for a User
*MembershipApi* | [**update**](docs/MembershipApi.md#update) | **POST** /API/UGA/Membership/update | Assigning a Leader to an Organization
*MessageCatchEventApi* | [**receive**](docs/MessageCatchEventApi.md#receive) | **POST** /System/Event/IntermediateMessage/{processModelInfoId}/{nodeNumber}/receive | 
*MessageCatchEventApi* | [**start**](docs/MessageCatchEventApi.md#start) | **POST** /System/Event/MessageStart/{processModelInfoId}/{nodeNumber}/start | 
*ProcessAuthorityApi* | [**addToQgroup**](docs/ProcessAuthorityApi.md#addToQgroup) | **POST** /API/Admin/ProcessAuthority/addToQgroup | Granting a Process Privilege to an Organization
*ProcessAuthorityApi* | [**addToQrole**](docs/ProcessAuthorityApi.md#addToQrole) | **POST** /API/Admin/ProcessAuthority/addToQrole | Granting a Process Privilege to a Role
*ProcessAuthorityApi* | [**addToQuser**](docs/ProcessAuthorityApi.md#addToQuser) | **POST** /API/Admin/ProcessAuthority/addToQuser | Granting a Process Privilege to a User
*ProcessAuthorityApi* | [**delete**](docs/ProcessAuthorityApi.md#delete) | **POST** /API/Admin/ProcessAuthority/delete | Deleting a Process Privilege
*ProcessAuthorityApi* | [**list**](docs/ProcessAuthorityApi.md#list) | **GET** /API/Admin/ProcessAuthority/list | Retrieving a List of Process Privilege
*ProcessInstanceApi* | [**delete**](docs/ProcessInstanceApi.md#delete) | **POST** /API/OR/ProcessInstance/delete | Deleting Process
*ProcessInstanceApi* | [**downloadFile**](docs/ProcessInstanceApi.md#downloadFile) | **GET** /API/OR/ProcessInstance/File/download | Downloading File type Process Data
*ProcessInstanceApi* | [**list**](docs/ProcessInstanceApi.md#list) | **GET** /API/OR/ProcessInstance/list | Querying for Task records operated by the User
*ProcessInstanceApi* | [**listCsv**](docs/ProcessInstanceApi.md#listCsv) | **GET** /API/OR/ProcessInstance/listCsv | Querying for all Process Instances records
*ProcessInstanceApi* | [**listCsvUtf16**](docs/ProcessInstanceApi.md#listCsvUtf16) | **GET** /API/OR/ProcessInstance/listCsvUtf16 | Querying for all Process Instances records
*ProcessInstanceApi* | [**startProcessInstance**](docs/ProcessInstanceApi.md#startProcessInstance) | **POST** /API/PE/ProcessInstance/start | Creating a Process Instance
*ProcessInstanceApi* | [**stop**](docs/ProcessInstanceApi.md#stop) | **POST** /API/OR/ProcessInstance/stop | Terminating Process
*ProcessInstanceApi* | [**view**](docs/ProcessInstanceApi.md#view) | **GET** /API/OR/ProcessInstance/view | Retrieving Process Instance
*ProcessModelApi* | [**listStartableProcessModel**](docs/ProcessModelApi.md#listStartableProcessModel) | **GET** /API/PE/ProcessModel/listStartable | Retrieving a List of startable Workflows
*QgroupApi* | [**add**](docs/QgroupApi.md#add) | **POST** /API/UGA/Qgroup/add | Creating an Organization Unit
*QgroupApi* | [**delete**](docs/QgroupApi.md#delete) | **POST** /API/UGA/Qgroup/delete | Deleting an Organization Unit
*QgroupApi* | [**find**](docs/QgroupApi.md#find) | **GET** /API/User/Qgroup/find | Retrieving an Organization Unit
*QgroupApi* | [**list**](docs/QgroupApi.md#list) | **GET** /API/User/Qgroup/list | Retrieving a List of Organizations
*QgroupApi* | [**update**](docs/QgroupApi.md#update) | **POST** /API/UGA/Qgroup/update | Updating an Organization Unit
*QroleApi* | [**add**](docs/QroleApi.md#add) | **POST** /API/UGA/Qrole/add | Creating a Role Unit
*QroleApi* | [**delete**](docs/QroleApi.md#delete) | **POST** /API/UGA/Qrole/delete | Deleting a Role Unit
*QroleApi* | [**find**](docs/QroleApi.md#find) | **GET** /API/User/Qrole/find | Retrieving a Role Unit
*QroleApi* | [**list**](docs/QroleApi.md#list) | **GET** /API/User/Qrole/list | Retrieving a List of Roles
*QroleApi* | [**update**](docs/QroleApi.md#update) | **POST** /API/UGA/Qrole/update | Updating a Role Unit
*QuserApi* | [**add**](docs/QuserApi.md#add) | **POST** /API/UGA/Quser/add | Creating a User Account
*QuserApi* | [**delete**](docs/QuserApi.md#delete) | **POST** /API/UGA/Quser/delete | Deleting a User Account
*QuserApi* | [**find**](docs/QuserApi.md#find) | **GET** /API/User/Quser/find | Retrieving a User Account
*QuserApi* | [**list**](docs/QuserApi.md#list) | **GET** /API/User/Quser/list | Retrieving a List of Users
*QuserApi* | [**self**](docs/QuserApi.md#self) | **GET** /API/User/Quser/self | Retrieving the user’s own User Account
*QuserApi* | [**update**](docs/QuserApi.md#update) | **POST** /API/UGA/Quser/update | Updating a User Account
*RoleMembershipApi* | [**add**](docs/RoleMembershipApi.md#add) | **POST** /API/UGA/RoleMembership/add | Adding a Member to a Role
*RoleMembershipApi* | [**delete**](docs/RoleMembershipApi.md#delete) | **POST** /API/UGA/RoleMembership/delete | Deleting a Member from a Role
*RoleMembershipApi* | [**listByQrole**](docs/RoleMembershipApi.md#listByQrole) | **GET** /API/User/RoleMembership/listByQrole | Retrieving all Members of a Role
*RoleMembershipApi* | [**listByQuser**](docs/RoleMembershipApi.md#listByQuser) | **GET** /API/User/RoleMembership/listByQuser | Retrieving all Roles for a User
*SystemAuthorityApi* | [**addToQgroup**](docs/SystemAuthorityApi.md#addToQgroup) | **POST** /API/Admin/SystemAuthority/addToQgroup | Granting a System Privilege to an Organization
*SystemAuthorityApi* | [**addToQrole**](docs/SystemAuthorityApi.md#addToQrole) | **POST** /API/Admin/SystemAuthority/addToQrole | Granting a System Privilege to a Role
*SystemAuthorityApi* | [**addToQuser**](docs/SystemAuthorityApi.md#addToQuser) | **POST** /API/Admin/SystemAuthority/addToQuser | Granting a System Privilege to a User
*SystemAuthorityApi* | [**delete**](docs/SystemAuthorityApi.md#delete) | **POST** /API/Admin/SystemAuthority/delete | Deleting a System Privilege
*SystemAuthorityApi* | [**list**](docs/SystemAuthorityApi.md#list) | **GET** /API/Admin/SystemAuthority/list | Retrieving a List of System Privilege
*WorkitemApi* | [**addStar**](docs/WorkitemApi.md#addStar) | **POST** /API/OR/Workitem/Star/add | Adding a Star to a Task
*WorkitemApi* | [**batchAccespWorkitem**](docs/WorkitemApi.md#batchAccespWorkitem) | **POST** /API/PE/Workitem/batchAccept | Accepting a Offered Task
*WorkitemApi* | [**list**](docs/WorkitemApi.md#list) | **GET** /API/OR/Workitem/list | Querying for Task records operated by the User
*WorkitemApi* | [**listAllocatedWorkitem**](docs/WorkitemApi.md#listAllocatedWorkitem) | **GET** /API/PE/Workitem/listAllocated | Retrieving a List of My Tasks
*WorkitemApi* | [**listCsv**](docs/WorkitemApi.md#listCsv) | **GET** /API/OR/Workitem/listCsv | Querying for Task records operated by the User
*WorkitemApi* | [**listCsvUtf16**](docs/WorkitemApi.md#listCsvUtf16) | **GET** /API/OR/Workitem/listCsvUtf16 | Querying for Task records operated by the User
*WorkitemApi* | [**listOfferedWorkitem**](docs/WorkitemApi.md#listOfferedWorkitem) | **GET** /API/PE/Workitem/listOffered | Retrieving a List of Offered Tasks
*WorkitemApi* | [**reallocate**](docs/WorkitemApi.md#reallocate) | **POST** /API/PIM/Workitem/reallocate | Reallocating Task
*WorkitemApi* | [**removeStar**](docs/WorkitemApi.md#removeStar) | **POST** /API/OR/Workitem/Star/remove | Removing a Star from a Task
*WorkitemFormApi* | [**save**](docs/WorkitemFormApi.md#save) | **POST** /API/PE/Workitem/Form/save | Submitting the Task output
*WorkitemFormApi* | [**viewXml**](docs/WorkitemFormApi.md#viewXml) | **GET** /API/PE/Workitem/Form/viewXml | Retrieving a List of forms for Task output


## Documentation for Models

 - [Activity](docs/Activity.md)
 - [ActivityList](docs/ActivityList.md)
 - [Error](docs/Error.md)
 - [Errors](docs/Errors.md)
 - [ItemCache](docs/ItemCache.md)
 - [ItemCacheItems](docs/ItemCacheItems.md)
 - [ItemCacheList](docs/ItemCacheList.md)
 - [Membership](docs/Membership.md)
 - [MembershipList](docs/MembershipList.md)
 - [MembershipWrapper](docs/MembershipWrapper.md)
 - [ProcessAuthority](docs/ProcessAuthority.md)
 - [ProcessAuthorityList](docs/ProcessAuthorityList.md)
 - [ProcessAuthorityWrapper](docs/ProcessAuthorityWrapper.md)
 - [ProcessData](docs/ProcessData.md)
 - [ProcessInstance](docs/ProcessInstance.md)
 - [ProcessInstanceList](docs/ProcessInstanceList.md)
 - [ProcessInstanceWrapper](docs/ProcessInstanceWrapper.md)
 - [ProcessModelInfo](docs/ProcessModelInfo.md)
 - [Qgroup](docs/Qgroup.md)
 - [QgroupList](docs/QgroupList.md)
 - [QgroupWrapper](docs/QgroupWrapper.md)
 - [Qrole](docs/Qrole.md)
 - [QroleList](docs/QroleList.md)
 - [QroleWrapper](docs/QroleWrapper.md)
 - [Quser](docs/Quser.md)
 - [QuserList](docs/QuserList.md)
 - [QuserWithPrimaryQgroup](docs/QuserWithPrimaryQgroup.md)
 - [QuserWrapper](docs/QuserWrapper.md)
 - [RoleMembership](docs/RoleMembership.md)
 - [RoleMembershipList](docs/RoleMembershipList.md)
 - [SystemAuthority](docs/SystemAuthority.md)
 - [SystemAuthorityList](docs/SystemAuthorityList.md)
 - [SystemAuthorityWrapper](docs/SystemAuthorityWrapper.md)
 - [Workitem](docs/Workitem.md)
 - [WorkitemList](docs/WorkitemList.md)
 - [WorkitemOpResult](docs/WorkitemOpResult.md)
 - [WorkitemOpResultList](docs/WorkitemOpResultList.md)
 - [WorkitemOpResultWorkitem](docs/WorkitemOpResultWorkitem.md)
 - [WorkitemWithDataList](docs/WorkitemWithDataList.md)
 - [WorkitemWrapper](docs/WorkitemWrapper.md)
 - [WorkitemWithData](docs/WorkitemWithData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://online-demo-en.questetra.net/oauth2/authorize
- **Scopes**: 
  - any: any access
  - read: read only


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@questetra.com

