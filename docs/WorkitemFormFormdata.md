
# WorkitemFormFormdata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Process Data Item Definition ID |  [optional]
**number** | **Integer** | Process Data Item Definition Number |  [optional]
**accessibility** | **Integer** | 0: no, 1: Read only, 3: R/W |  [optional]
**dataType** | **Integer** | Type of Process Data Item:: 0: String, 5: Date, 8: User, 9: Discussion, 10: Datetime, 11: Select, 12: Numeric, 13: Table, 14: File, 15: Guide Panel, 16: Organization |  [optional]
**name** | **String** | Name of Process Data Item |  [optional]
**varName** | **String** | Field Name of Process Data Item |  [optional]
**dataInstanceId** | **Integer** | Process Data Item ID |  [optional]
**processInstanceId** | **Integer** | Process Instance ID |  [optional]
**viewOrder** | **Integer** | Priority order of Process Data Item |  [optional]
**formType** | **Integer** | Type of input form type:: 0: Text field, 1: Text area, 2: Radio button, 3: Check box, 4: Select box, 5:Search select box |  [optional]
**subType** | **Integer** | Input format for Date type:: 0:Y/M/D, 1:Y/M, 2:M/D, 3:Y |  [optional]
**description** | **String** | Messages for Input Form |  [optional]
**columns** | **Integer** | Number of column setting of Process Data Item |  [optional]
**required** | **Boolean** | Required Input Form: true |  [optional]
**buttonDirection** | **Integer** | 1: Horizontal, 2: Vertical, for Checkboxes and Radio buttons |  [optional]
**buttonRows** | **Integer** | Number of buttons for each, for Checkboxes and Radio buttons |  [optional]
**items** | [**WorkitemFormItems**](WorkitemFormItems.md) |  |  [optional]
**value** | **String** | Value of Process Data (Formats are different in each data type. Easy to understand them if you see actual Xml.) |  [optional]



