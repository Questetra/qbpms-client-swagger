
# WorkitemForm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title |  [optional]
**titleAccessibility** | **Integer** | R/W permission, 1:Read only, 3: R/W |  [optional]
**titleDescription** | **String** | Messages for Input Form |  [optional]
**titleColumns** | **Integer** | Title Column |  [optional]
**processModelInfoId** | **Integer** | App ID |  [optional]
**nodeNumber** | **Integer** | Process Model (BPMN) item’s Node number |  [optional]
**processInstanceId** | **Integer** | Process Instance ID |  [optional]
**workitemId** | **Integer** | Task ID |  [optional]
**swimlaneType** | **Integer** | 0: (normal) Swimlane, 1: Team Swimlane |  [optional]
**taskName** | **String** | Task (Workflow step) name |  [optional]
**formData** | [**List&lt;WorkitemFormFormdata&gt;**](WorkitemFormFormdata.md) | Process Data Items |  [optional]
**qgroupId** | **Integer** | Current selected position to do the task |  [optional]
**executingRoles** | [**WorkitemFormExecutingroles**](WorkitemFormExecutingroles.md) |  |  [optional]
**userSelects** | [**WorkitemFormUserselects**](WorkitemFormUserselects.md) |  |  [optional]



