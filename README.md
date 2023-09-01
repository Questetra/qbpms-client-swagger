***This library has been deprecated, because it has not been maintained for a long time and has not kept up with API changes. (2023-09-01)***

# swagger-java-client

Questetra BPM Suite APIs
- API version: 12.3.1
  - Build date: 2021-01-13T11:19:00.868+09:00

Questetra BPM Suite APIs


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.questetra</groupId>
    <artifactId>bpms.client.swagger</artifactId>
    <version>12.3.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.questetra:bpms.client.swagger:12.3.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/bpms.client.swagger-12.3.1.jar`
* `target/lib/*.jar`

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
        // Set Base URL
        defaultClient.setBasePath("https://XXXXXXXX.questetra.net/");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: oauth2
        // OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        // oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ItemCacheApi apiInstance = new ItemCacheApi();
        String url = "url_example"; // String | 
        try {
            apiInstance.deleteItemCache(url);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemCacheApi#deleteItemCache");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://online-demo-en.questetra.net/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ItemCacheApi* | [**deleteItemCache**](docs/ItemCacheApi.md#deleteItemCache) | **POST** /API/Admin/ItemCache/delete | Clearing Cached Choices master
*ItemCacheApi* | [**getItemCache**](docs/ItemCacheApi.md#getItemCache) | **GET** /API/Admin/ItemCache/view | Retrieving a List of Cached Choices
*ItemCacheApi* | [**listItemCaches**](docs/ItemCacheApi.md#listItemCaches) | **GET** /API/Admin/ItemCache/list | Retrieving a List of Cached Choices master
*MembershipApi* | [**addMembership**](docs/MembershipApi.md#addMembership) | **POST** /API/UGA/Membership/add | Adding a Member to an Organization
*MembershipApi* | [**deleteMembership**](docs/MembershipApi.md#deleteMembership) | **POST** /API/UGA/Membership/delete | Deleting a Member from an Organization
*MembershipApi* | [**listMembershipsByQgroup**](docs/MembershipApi.md#listMembershipsByQgroup) | **GET** /API/User/Membership/listByQgroup | Retrieving all Members of an Organization
*MembershipApi* | [**listMembershipsByQuser**](docs/MembershipApi.md#listMembershipsByQuser) | **GET** /API/User/Membership/listByQuser | Retrieving all Organizations for a User
*MembershipApi* | [**updateMembership**](docs/MembershipApi.md#updateMembership) | **POST** /API/UGA/Membership/update | Assigning a Leader to an Organization
*ProcessAuthorityApi* | [**addProcessAuthorityToQrole**](docs/ProcessAuthorityApi.md#addProcessAuthorityToQrole) | **POST** /API/Admin/ProcessAuthority/addToQrole | Granting a Process Privilege to a Role
*ProcessAuthorityApi* | [**addProcessAuthorityToQuser**](docs/ProcessAuthorityApi.md#addProcessAuthorityToQuser) | **POST** /API/Admin/ProcessAuthority/addToQuser | Granting a Process Privilege to a User
*ProcessAuthorityApi* | [**addToProcessAuthorityQgroup**](docs/ProcessAuthorityApi.md#addToProcessAuthorityQgroup) | **POST** /API/Admin/ProcessAuthority/addToQgroup | Granting a Process Privilege to an Organization
*ProcessAuthorityApi* | [**deleteProcessAuthority**](docs/ProcessAuthorityApi.md#deleteProcessAuthority) | **POST** /API/Admin/ProcessAuthority/delete | Deleting a Process Privilege
*ProcessAuthorityApi* | [**listProcessAuthorities**](docs/ProcessAuthorityApi.md#listProcessAuthorities) | **GET** /API/Admin/ProcessAuthority/list | Retrieving a List of Process Privilege
*ProcessInstanceApi* | [**addProcessInstanceStar**](docs/ProcessInstanceApi.md#addProcessInstanceStar) | **POST** /API/OR/ProcessInstance/{processInstanceId}/Star/add | Adding a Star to a Process
*ProcessInstanceApi* | [**deleteProcessInstance**](docs/ProcessInstanceApi.md#deleteProcessInstance) | **POST** /API/OR/ProcessInstance/delete | Deleting Process
*ProcessInstanceApi* | [**downloadFile**](docs/ProcessInstanceApi.md#downloadFile) | **GET** /API/OR/ProcessInstance/File/download | Downloading File type Process Data
*ProcessInstanceApi* | [**getProcessInstance**](docs/ProcessInstanceApi.md#getProcessInstance) | **GET** /API/OR/ProcessInstance/view | Retrieving Process Instance
*ProcessInstanceApi* | [**listProcessInstances**](docs/ProcessInstanceApi.md#listProcessInstances) | **GET** /API/OR/ProcessInstance/list | Querying for Process Instance records operated by the User
*ProcessInstanceApi* | [**listProcessInstancesCsv**](docs/ProcessInstanceApi.md#listProcessInstancesCsv) | **GET** /API/OR/ProcessInstance/listCsv | Querying for Process Instance records operated by the User
*ProcessInstanceApi* | [**listProcessInstancesCsvUtf16**](docs/ProcessInstanceApi.md#listProcessInstancesCsvUtf16) | **GET** /API/OR/ProcessInstance/listCsvUtf16 | Querying for Process Instance records operated by the User
*ProcessInstanceApi* | [**removeProcessInstanceStar**](docs/ProcessInstanceApi.md#removeProcessInstanceStar) | **POST** /API/OR/ProcessInstance/{processInstanceId}/Star/remove | Removing a Star from a Process
*ProcessInstanceApi* | [**startProcessInstance**](docs/ProcessInstanceApi.md#startProcessInstance) | **POST** /API/PE/ProcessInstance/start | Creating a Process Instance
*ProcessInstanceApi* | [**stopProcessInstance**](docs/ProcessInstanceApi.md#stopProcessInstance) | **POST** /API/OR/ProcessInstance/stop | Terminating Process
*ProcessModelApi* | [**listAllProcessModels**](docs/ProcessModelApi.md#listAllProcessModels) | **GET** /API/Admin/ProcessModel/list | Retrieving a List of Process Models
*ProcessModelApi* | [**listStartableProcessModels**](docs/ProcessModelApi.md#listStartableProcessModels) | **GET** /API/PE/ProcessModel/listStartable | Retrieving a List of startable Workflows
*ProcessModelApi* | [**releaseProcessModel**](docs/ProcessModelApi.md#releaseProcessModel) | **POST** /API/PMM/ProcessModel/{processModelInfoId}/release | Release process model
*QgroupApi* | [**addQgroup**](docs/QgroupApi.md#addQgroup) | **POST** /API/UGA/Qgroup/add | Creating an Organization Unit
*QgroupApi* | [**deleteQgroup**](docs/QgroupApi.md#deleteQgroup) | **POST** /API/UGA/Qgroup/delete | Deleting an Organization Unit
*QgroupApi* | [**findQgroup**](docs/QgroupApi.md#findQgroup) | **GET** /API/User/Qgroup/find | Retrieving an Organization Unit
*QgroupApi* | [**listQgroups**](docs/QgroupApi.md#listQgroups) | **GET** /API/User/Qgroup/list | Retrieving a List of Organizations
*QgroupApi* | [**updateQgroup**](docs/QgroupApi.md#updateQgroup) | **POST** /API/UGA/Qgroup/update | Updating an Organization Unit
*QroleApi* | [**addQrole**](docs/QroleApi.md#addQrole) | **POST** /API/UGA/Qrole/add | Creating a Role Unit
*QroleApi* | [**deleteQrole**](docs/QroleApi.md#deleteQrole) | **POST** /API/UGA/Qrole/delete | Deleting a Role Unit
*QroleApi* | [**findQrole**](docs/QroleApi.md#findQrole) | **GET** /API/User/Qrole/find | Retrieving a Role Unit
*QroleApi* | [**listQroles**](docs/QroleApi.md#listQroles) | **GET** /API/User/Qrole/list | Retrieving a List of Roles
*QroleApi* | [**updateQrole**](docs/QroleApi.md#updateQrole) | **POST** /API/UGA/Qrole/update | Updating a Role Unit
*QuserApi* | [**addQuser**](docs/QuserApi.md#addQuser) | **POST** /API/UGA/Quser/add | Creating a User Account
*QuserApi* | [**deleteQuser**](docs/QuserApi.md#deleteQuser) | **POST** /API/UGA/Quser/delete | Deleting a User Account
*QuserApi* | [**findQuser**](docs/QuserApi.md#findQuser) | **GET** /API/User/Quser/find | Retrieving a User Account
*QuserApi* | [**getMySelf**](docs/QuserApi.md#getMySelf) | **GET** /API/User/Quser/self | Retrieving the user’s own User Account
*QuserApi* | [**listQusers**](docs/QuserApi.md#listQusers) | **GET** /API/User/Quser/list | Retrieving a List of Users
*QuserApi* | [**updateQuser**](docs/QuserApi.md#updateQuser) | **POST** /API/UGA/Quser/update | Updating a User Account
*RoleMembershipApi* | [**addRoleMembership**](docs/RoleMembershipApi.md#addRoleMembership) | **POST** /API/UGA/RoleMembership/add | Adding a Member to a Role
*RoleMembershipApi* | [**deleteRoleMembership**](docs/RoleMembershipApi.md#deleteRoleMembership) | **POST** /API/UGA/RoleMembership/delete | Deleting a Member from a Role
*RoleMembershipApi* | [**listRoleMembershipsByQrole**](docs/RoleMembershipApi.md#listRoleMembershipsByQrole) | **GET** /API/User/RoleMembership/listByQrole | Retrieving all Members of a Role
*RoleMembershipApi* | [**listRoleMembershipsByQuser**](docs/RoleMembershipApi.md#listRoleMembershipsByQuser) | **GET** /API/User/RoleMembership/listByQuser | Retrieving all Roles for a User
*SystemAuthorityApi* | [**addSystemAuthorityToQgroup**](docs/SystemAuthorityApi.md#addSystemAuthorityToQgroup) | **POST** /API/Admin/SystemAuthority/addToQgroup | Granting a System Privilege to an Organization
*SystemAuthorityApi* | [**addSystemAuthorityToQrole**](docs/SystemAuthorityApi.md#addSystemAuthorityToQrole) | **POST** /API/Admin/SystemAuthority/addToQrole | Granting a System Privilege to a Role
*SystemAuthorityApi* | [**addSystemAuthorityToQuser**](docs/SystemAuthorityApi.md#addSystemAuthorityToQuser) | **POST** /API/Admin/SystemAuthority/addToQuser | Granting a System Privilege to a User
*SystemAuthorityApi* | [**deleteSystemAuthority**](docs/SystemAuthorityApi.md#deleteSystemAuthority) | **POST** /API/Admin/SystemAuthority/delete | Deleting a System Privilege
*SystemAuthorityApi* | [**listMySystemAuthorities**](docs/SystemAuthorityApi.md#listMySystemAuthorities) | **GET** /API/User/SystemAuthority/self | Retrieving a List of the user&#39;s own System Privileges
*SystemAuthorityApi* | [**listSystemAuthorities**](docs/SystemAuthorityApi.md#listSystemAuthorities) | **GET** /API/Admin/SystemAuthority/list | Retrieving a List of System Privilege
*WorkitemApi* | [**addWorkitemStar**](docs/WorkitemApi.md#addWorkitemStar) | **POST** /API/OR/Workitem/Star/add | Adding a Star to a Process related to a Task
*WorkitemApi* | [**batchAcceptWorkitems**](docs/WorkitemApi.md#batchAcceptWorkitems) | **POST** /API/PE/Workitem/batchAccept | Accepting a Offered Task
*WorkitemApi* | [**listAllocatedWorkitems**](docs/WorkitemApi.md#listAllocatedWorkitems) | **GET** /API/PE/Workitem/listAllocated | Retrieving a List of My Tasks
*WorkitemApi* | [**listOfferedWorkitems**](docs/WorkitemApi.md#listOfferedWorkitems) | **GET** /API/PE/Workitem/listOffered | Retrieving a List of Offered Tasks
*WorkitemApi* | [**listWorkitems**](docs/WorkitemApi.md#listWorkitems) | **GET** /API/OR/Workitem/list | Querying for Task records operated by the User
*WorkitemApi* | [**listWorkitemsCsv**](docs/WorkitemApi.md#listWorkitemsCsv) | **GET** /API/OR/Workitem/listCsv | Querying for Task records operated by the User
*WorkitemApi* | [**listWorkitemsCsvUtf16**](docs/WorkitemApi.md#listWorkitemsCsvUtf16) | **GET** /API/OR/Workitem/listCsvUtf16 | Querying for Task records operated by the User
*WorkitemApi* | [**reallocateWorkitem**](docs/WorkitemApi.md#reallocateWorkitem) | **POST** /API/PIM/Workitem/reallocate | Reallocating Task
*WorkitemApi* | [**removeWorkitemStar**](docs/WorkitemApi.md#removeWorkitemStar) | **POST** /API/OR/Workitem/Star/remove | Removing a Star from a Process related to a Task
*WorkitemFormApi* | [**getWorkitemForm**](docs/WorkitemFormApi.md#getWorkitemForm) | **GET** /API/PE/Workitem/Form/viewXml | Retrieving a List of forms for Task output
*WorkitemFormApi* | [**saveWorkitemForm**](docs/WorkitemFormApi.md#saveWorkitemForm) | **POST** /API/PE/Workitem/Form/save | Submitting the Task output


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
 - [ProcessModelInfo2](docs/ProcessModelInfo2.md)
 - [ProcessModelInfoList](docs/ProcessModelInfoList.md)
 - [ProcessModelReseaseResult](docs/ProcessModelReseaseResult.md)
 - [Qgroup](docs/Qgroup.md)
 - [QgroupList](docs/QgroupList.md)
 - [QgroupWrapper](docs/QgroupWrapper.md)
 - [Qrole](docs/Qrole.md)
 - [QroleList](docs/QroleList.md)
 - [QroleWrapper](docs/QroleWrapper.md)
 - [Quser](docs/Quser.md)
 - [QuserList](docs/QuserList.md)
 - [QuserSystemAuthorityList](docs/QuserSystemAuthorityList.md)
 - [QuserWithPrimaryQgroup](docs/QuserWithPrimaryQgroup.md)
 - [QuserWithPrimaryQgroupWrapper](docs/QuserWithPrimaryQgroupWrapper.md)
 - [QuserWrapper](docs/QuserWrapper.md)
 - [RoleMembership](docs/RoleMembership.md)
 - [RoleMembershipList](docs/RoleMembershipList.md)
 - [RoleMembershipWrapper](docs/RoleMembershipWrapper.md)
 - [SelectItem](docs/SelectItem.md)
 - [SelectItemList](docs/SelectItemList.md)
 - [SystemAuthority](docs/SystemAuthority.md)
 - [SystemAuthorityList](docs/SystemAuthorityList.md)
 - [SystemAuthorityWrapper](docs/SystemAuthorityWrapper.md)
 - [Workitem](docs/Workitem.md)
 - [WorkitemForm](docs/WorkitemForm.md)
 - [WorkitemFormExecutingroles](docs/WorkitemFormExecutingroles.md)
 - [WorkitemFormExecutingrolesExecutingrole](docs/WorkitemFormExecutingrolesExecutingrole.md)
 - [WorkitemFormFormdata](docs/WorkitemFormFormdata.md)
 - [WorkitemFormItems](docs/WorkitemFormItems.md)
 - [WorkitemFormResult](docs/WorkitemFormResult.md)
 - [WorkitemFormResultProcessdatavalidationerrors](docs/WorkitemFormResultProcessdatavalidationerrors.md)
 - [WorkitemFormResultProcessdatavalidationerrorsError](docs/WorkitemFormResultProcessdatavalidationerrorsError.md)
 - [WorkitemFormUserselects](docs/WorkitemFormUserselects.md)
 - [WorkitemFormUserselectsUserselect](docs/WorkitemFormUserselectsUserselect.md)
 - [WorkitemList](docs/WorkitemList.md)
 - [WorkitemOpResult](docs/WorkitemOpResult.md)
 - [WorkitemOpResultList](docs/WorkitemOpResultList.md)
 - [WorkitemOpResultWorkitem](docs/WorkitemOpResultWorkitem.md)
 - [WorkitemWithData](docs/WorkitemWithData.md)
 - [WorkitemWithDataList](docs/WorkitemWithDataList.md)
 - [WorkitemWrapper](docs/WorkitemWrapper.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://XXXXXXXX.questetra.net/oauth2/authorize
- **Scopes**: 
  - any: any access
  - read: read only


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@questetra.com

