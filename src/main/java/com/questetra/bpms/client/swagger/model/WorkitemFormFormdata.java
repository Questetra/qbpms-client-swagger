/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 12.3.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.questetra.bpms.client.swagger.model.WorkitemFormItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkitemFormFormdata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T16:44:27.343+09:00")
public class WorkitemFormFormdata {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("accessibility")
  private Integer accessibility = null;

  @SerializedName("data-type")
  private Integer dataType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("var-name")
  private String varName = null;

  @SerializedName("data-instance-id")
  private Integer dataInstanceId = null;

  @SerializedName("process-instance-id")
  private Integer processInstanceId = null;

  @SerializedName("view-order")
  private Integer viewOrder = null;

  @SerializedName("form-type")
  private Integer formType = null;

  @SerializedName("sub-type")
  private Integer subType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("columns")
  private Integer columns = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("button-direction")
  private Integer buttonDirection = null;

  @SerializedName("button-rows")
  private Integer buttonRows = null;

  @SerializedName("items")
  private WorkitemFormItems items = null;

  @SerializedName("value")
  private String value = null;

  public WorkitemFormFormdata id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Process Data Item Definition ID
   * @return id
  **/
  @ApiModelProperty(example = "56213", value = "Process Data Item Definition ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WorkitemFormFormdata number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Process Data Item Definition Number
   * @return number
  **/
  @ApiModelProperty(example = "4", value = "Process Data Item Definition Number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public WorkitemFormFormdata accessibility(Integer accessibility) {
    this.accessibility = accessibility;
    return this;
  }

   /**
   * 0: no, 1: Read only, 3: R/W
   * @return accessibility
  **/
  @ApiModelProperty(example = "3", value = "0: no, 1: Read only, 3: R/W")
  public Integer getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(Integer accessibility) {
    this.accessibility = accessibility;
  }

  public WorkitemFormFormdata dataType(Integer dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Type of Process Data Item:: 0: String, 5: Date, 8: User, 9: Discussion, 10: Datetime, 11: Select, 12: Numeric, 13: Table, 14: File, 15: Guide Panel, 16: Organization
   * @return dataType
  **/
  @ApiModelProperty(example = "12", value = "Type of Process Data Item:: 0: String, 5: Date, 8: User, 9: Discussion, 10: Datetime, 11: Select, 12: Numeric, 13: Table, 14: File, 15: Guide Panel, 16: Organization")
  public Integer getDataType() {
    return dataType;
  }

  public void setDataType(Integer dataType) {
    this.dataType = dataType;
  }

  public WorkitemFormFormdata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Process Data Item
   * @return name
  **/
  @ApiModelProperty(example = "Number", value = "Name of Process Data Item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkitemFormFormdata varName(String varName) {
    this.varName = varName;
    return this;
  }

   /**
   * Field Name of Process Data Item
   * @return varName
  **/
  @ApiModelProperty(example = "q_decimal", value = "Field Name of Process Data Item")
  public String getVarName() {
    return varName;
  }

  public void setVarName(String varName) {
    this.varName = varName;
  }

  public WorkitemFormFormdata dataInstanceId(Integer dataInstanceId) {
    this.dataInstanceId = dataInstanceId;
    return this;
  }

   /**
   * Process Data Item ID
   * @return dataInstanceId
  **/
  @ApiModelProperty(example = "75774", value = "Process Data Item ID")
  public Integer getDataInstanceId() {
    return dataInstanceId;
  }

  public void setDataInstanceId(Integer dataInstanceId) {
    this.dataInstanceId = dataInstanceId;
  }

  public WorkitemFormFormdata processInstanceId(Integer processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Process Instance ID
   * @return processInstanceId
  **/
  @ApiModelProperty(example = "845", value = "Process Instance ID")
  public Integer getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(Integer processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public WorkitemFormFormdata viewOrder(Integer viewOrder) {
    this.viewOrder = viewOrder;
    return this;
  }

   /**
   * Priority order of Process Data Item
   * @return viewOrder
  **/
  @ApiModelProperty(example = "5", value = "Priority order of Process Data Item")
  public Integer getViewOrder() {
    return viewOrder;
  }

  public void setViewOrder(Integer viewOrder) {
    this.viewOrder = viewOrder;
  }

  public WorkitemFormFormdata formType(Integer formType) {
    this.formType = formType;
    return this;
  }

   /**
   * Type of input form type:: 0: Text field, 1: Text area, 2: Radio button, 3: Check box, 4: Select box, 5:Search select box
   * @return formType
  **/
  @ApiModelProperty(value = "Type of input form type:: 0: Text field, 1: Text area, 2: Radio button, 3: Check box, 4: Select box, 5:Search select box")
  public Integer getFormType() {
    return formType;
  }

  public void setFormType(Integer formType) {
    this.formType = formType;
  }

  public WorkitemFormFormdata subType(Integer subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Input format for Date type:: 0:Y/M/D, 1:Y/M, 2:M/D, 3:Y
   * @return subType
  **/
  @ApiModelProperty(value = "Input format for Date type:: 0:Y/M/D, 1:Y/M, 2:M/D, 3:Y")
  public Integer getSubType() {
    return subType;
  }

  public void setSubType(Integer subType) {
    this.subType = subType;
  }

  public WorkitemFormFormdata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Messages for Input Form
   * @return description
  **/
  @ApiModelProperty(example = "Value should be min 100.0000000000 and max 200.0000000000.", value = "Messages for Input Form")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkitemFormFormdata columns(Integer columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Number of column setting of Process Data Item
   * @return columns
  **/
  @ApiModelProperty(example = "1", value = "Number of column setting of Process Data Item")
  public Integer getColumns() {
    return columns;
  }

  public void setColumns(Integer columns) {
    this.columns = columns;
  }

  public WorkitemFormFormdata required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Required Input Form: true
   * @return required
  **/
  @ApiModelProperty(example = "false", value = "Required Input Form: true")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public WorkitemFormFormdata buttonDirection(Integer buttonDirection) {
    this.buttonDirection = buttonDirection;
    return this;
  }

   /**
   * 1: Horizontal, 2: Vertical, for Checkboxes and Radio buttons
   * @return buttonDirection
  **/
  @ApiModelProperty(value = "1: Horizontal, 2: Vertical, for Checkboxes and Radio buttons")
  public Integer getButtonDirection() {
    return buttonDirection;
  }

  public void setButtonDirection(Integer buttonDirection) {
    this.buttonDirection = buttonDirection;
  }

  public WorkitemFormFormdata buttonRows(Integer buttonRows) {
    this.buttonRows = buttonRows;
    return this;
  }

   /**
   * Number of buttons for each, for Checkboxes and Radio buttons
   * @return buttonRows
  **/
  @ApiModelProperty(value = "Number of buttons for each, for Checkboxes and Radio buttons")
  public Integer getButtonRows() {
    return buttonRows;
  }

  public void setButtonRows(Integer buttonRows) {
    this.buttonRows = buttonRows;
  }

  public WorkitemFormFormdata items(WorkitemFormItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public WorkitemFormItems getItems() {
    return items;
  }

  public void setItems(WorkitemFormItems items) {
    this.items = items;
  }

  public WorkitemFormFormdata value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of Process Data (Formats are different in each data type. Easy to understand them if you see actual Xml.)
   * @return value
  **/
  @ApiModelProperty(example = "12345", value = "Value of Process Data (Formats are different in each data type. Easy to understand them if you see actual Xml.)")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemFormFormdata workitemFormFormdata = (WorkitemFormFormdata) o;
    return Objects.equals(this.id, workitemFormFormdata.id) &&
        Objects.equals(this.number, workitemFormFormdata.number) &&
        Objects.equals(this.accessibility, workitemFormFormdata.accessibility) &&
        Objects.equals(this.dataType, workitemFormFormdata.dataType) &&
        Objects.equals(this.name, workitemFormFormdata.name) &&
        Objects.equals(this.varName, workitemFormFormdata.varName) &&
        Objects.equals(this.dataInstanceId, workitemFormFormdata.dataInstanceId) &&
        Objects.equals(this.processInstanceId, workitemFormFormdata.processInstanceId) &&
        Objects.equals(this.viewOrder, workitemFormFormdata.viewOrder) &&
        Objects.equals(this.formType, workitemFormFormdata.formType) &&
        Objects.equals(this.subType, workitemFormFormdata.subType) &&
        Objects.equals(this.description, workitemFormFormdata.description) &&
        Objects.equals(this.columns, workitemFormFormdata.columns) &&
        Objects.equals(this.required, workitemFormFormdata.required) &&
        Objects.equals(this.buttonDirection, workitemFormFormdata.buttonDirection) &&
        Objects.equals(this.buttonRows, workitemFormFormdata.buttonRows) &&
        Objects.equals(this.items, workitemFormFormdata.items) &&
        Objects.equals(this.value, workitemFormFormdata.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, accessibility, dataType, name, varName, dataInstanceId, processInstanceId, viewOrder, formType, subType, description, columns, required, buttonDirection, buttonRows, items, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemFormFormdata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
    sb.append("    dataInstanceId: ").append(toIndentedString(dataInstanceId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    viewOrder: ").append(toIndentedString(viewOrder)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    buttonDirection: ").append(toIndentedString(buttonDirection)).append("\n");
    sb.append("    buttonRows: ").append(toIndentedString(buttonRows)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

