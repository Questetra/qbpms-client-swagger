
# Workitem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Task instance ID |  [optional]
**allocateDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of Task allocation |  [optional]
**allocatedQuserId** | **Integer** | User ID |  [optional]
**allocatedQuserName** | **String** | User name |  [optional]
**allocatedQgroupId** | **Integer** | Organization ID |  [optional]
**allocatedQgroupName** | **String** | Organization name |  [optional]
**endDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of Task completion |  [optional]
**nodeName** | **String** | Task name |  [optional]
**nodeNumber** | **Integer** | Task number |  [optional]
**offerDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of offer |  [optional]
**processInstanceEndDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of Process completion |  [optional]
**processInstanceIdForView** | **String** | Process ID as string |  [optional]
**processInstanceId** | **Integer** | Process ID |  [optional]
**processInstanceSequenceNumber** | **Integer** | Sequence Number in Process Model |  [optional]
**processInstanceInitQgroupId** | **Integer** | Organization ID who started the Process |  [optional]
**processInstanceInitQgroupName** | **String** | Orgazation name who started the Process |  [optional]
**processInstanceInitQuserId** | **Integer** | User ID who started the Process |  [optional]
**processInstanceInitQuserName** | **String** | User name who started the Process |  [optional]
**processInstanceStartDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of Process start |  [optional]
**processInstanceState** | **String** | Process Status |  [optional]
**processInstanceDebug** | **Boolean** | Debug mode |  [optional]
**processInstanceTitle** | **String** | Process Title |  [optional]
**processModelInfoId** | **Integer** | Process Model ID |  [optional]
**processModelInfoName** | **String** | Process Model name |  [optional]
**processModelInfoCategory** | **String** | Category of the Process Model |  [optional]
**processModelVersion** | **Integer** | Version of the Process Model |  [optional]
**startDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of Task start |  [optional]
**state** | **String** | Task Status |  [optional]
**failType** | **String** | Task Fail Type |  [optional]
**swimlaneType** | **String** | Swimlane Type |  [optional]
**timeLimitDatetime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of Task Deadline |  [optional]
**starred** | **Boolean** | Starred |  [optional]
**read** | **Boolean** | read |  [optional]
**data** | [**Map&lt;String, ProcessData&gt;**](ProcessData.md) |  |  [optional]



