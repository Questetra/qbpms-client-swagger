/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.questetra.bpms.client.swagger.model.ProcessData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * ProcessInstance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-31T08:07:41.678Z")
public class ProcessInstance {
  @SerializedName("processInstanceEndDatetime")
  private DateTime processInstanceEndDatetime = null;

  @SerializedName("processInstanceIdForView")
  private String processInstanceIdForView = null;

  @SerializedName("processInstanceId")
  private Long processInstanceId = null;

  @SerializedName("processInstanceSequenceNumber")
  private Long processInstanceSequenceNumber = null;

  @SerializedName("processInstanceInitQgroupId")
  private Long processInstanceInitQgroupId = null;

  @SerializedName("processInstanceInitQgroupName")
  private String processInstanceInitQgroupName = null;

  @SerializedName("processInstanceInitQuserId")
  private Long processInstanceInitQuserId = null;

  @SerializedName("processInstanceInitQuserName")
  private String processInstanceInitQuserName = null;

  @SerializedName("processInstanceStartDatetime")
  private DateTime processInstanceStartDatetime = null;

  @SerializedName("processInstanceState")
  private String processInstanceState = null;

  @SerializedName("processInstanceDebug")
  private Boolean processInstanceDebug = null;

  @SerializedName("processInstanceTitle")
  private String processInstanceTitle = null;

  @SerializedName("processModelInfoId")
  private Long processModelInfoId = null;

  @SerializedName("processModelInfoName")
  private String processModelInfoName = null;

  @SerializedName("processModelInfoCategory")
  private String processModelInfoCategory = null;

  @SerializedName("processModelVersion")
  private Long processModelVersion = null;

  @SerializedName("activeTokenNodeName")
  private String activeTokenNodeName = null;

  @SerializedName("data")
  private Map<String, ProcessData> data = null;

  public ProcessInstance processInstanceEndDatetime(DateTime processInstanceEndDatetime) {
    this.processInstanceEndDatetime = processInstanceEndDatetime;
    return this;
  }

   /**
   * Time of Process completion
   * @return processInstanceEndDatetime
  **/
  @ApiModelProperty(value = "Time of Process completion")
  public DateTime getProcessInstanceEndDatetime() {
    return processInstanceEndDatetime;
  }

  public void setProcessInstanceEndDatetime(DateTime processInstanceEndDatetime) {
    this.processInstanceEndDatetime = processInstanceEndDatetime;
  }

  public ProcessInstance processInstanceIdForView(String processInstanceIdForView) {
    this.processInstanceIdForView = processInstanceIdForView;
    return this;
  }

   /**
   * Process ID as string
   * @return processInstanceIdForView
  **/
  @ApiModelProperty(example = "p825", value = "Process ID as string")
  public String getProcessInstanceIdForView() {
    return processInstanceIdForView;
  }

  public void setProcessInstanceIdForView(String processInstanceIdForView) {
    this.processInstanceIdForView = processInstanceIdForView;
  }

  public ProcessInstance processInstanceId(Long processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Process ID
   * @return processInstanceId
  **/
  @ApiModelProperty(example = "825", value = "Process ID")
  public Long getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(Long processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ProcessInstance processInstanceSequenceNumber(Long processInstanceSequenceNumber) {
    this.processInstanceSequenceNumber = processInstanceSequenceNumber;
    return this;
  }

   /**
   * Sequence Number in Process Model
   * @return processInstanceSequenceNumber
  **/
  @ApiModelProperty(example = "12", value = "Sequence Number in Process Model")
  public Long getProcessInstanceSequenceNumber() {
    return processInstanceSequenceNumber;
  }

  public void setProcessInstanceSequenceNumber(Long processInstanceSequenceNumber) {
    this.processInstanceSequenceNumber = processInstanceSequenceNumber;
  }

  public ProcessInstance processInstanceInitQgroupId(Long processInstanceInitQgroupId) {
    this.processInstanceInitQgroupId = processInstanceInitQgroupId;
    return this;
  }

   /**
   * Organization ID who started the Process
   * @return processInstanceInitQgroupId
  **/
  @ApiModelProperty(value = "Organization ID who started the Process")
  public Long getProcessInstanceInitQgroupId() {
    return processInstanceInitQgroupId;
  }

  public void setProcessInstanceInitQgroupId(Long processInstanceInitQgroupId) {
    this.processInstanceInitQgroupId = processInstanceInitQgroupId;
  }

  public ProcessInstance processInstanceInitQgroupName(String processInstanceInitQgroupName) {
    this.processInstanceInitQgroupName = processInstanceInitQgroupName;
    return this;
  }

   /**
   * Orgazation name who started the Process
   * @return processInstanceInitQgroupName
  **/
  @ApiModelProperty(value = "Orgazation name who started the Process")
  public String getProcessInstanceInitQgroupName() {
    return processInstanceInitQgroupName;
  }

  public void setProcessInstanceInitQgroupName(String processInstanceInitQgroupName) {
    this.processInstanceInitQgroupName = processInstanceInitQgroupName;
  }

  public ProcessInstance processInstanceInitQuserId(Long processInstanceInitQuserId) {
    this.processInstanceInitQuserId = processInstanceInitQuserId;
    return this;
  }

   /**
   * User ID who started the Process
   * @return processInstanceInitQuserId
  **/
  @ApiModelProperty(example = "0", value = "User ID who started the Process")
  public Long getProcessInstanceInitQuserId() {
    return processInstanceInitQuserId;
  }

  public void setProcessInstanceInitQuserId(Long processInstanceInitQuserId) {
    this.processInstanceInitQuserId = processInstanceInitQuserId;
  }

  public ProcessInstance processInstanceInitQuserName(String processInstanceInitQuserName) {
    this.processInstanceInitQuserName = processInstanceInitQuserName;
    return this;
  }

   /**
   * User name who started the Process
   * @return processInstanceInitQuserName
  **/
  @ApiModelProperty(example = "SouthPole", value = "User name who started the Process")
  public String getProcessInstanceInitQuserName() {
    return processInstanceInitQuserName;
  }

  public void setProcessInstanceInitQuserName(String processInstanceInitQuserName) {
    this.processInstanceInitQuserName = processInstanceInitQuserName;
  }

  public ProcessInstance processInstanceStartDatetime(DateTime processInstanceStartDatetime) {
    this.processInstanceStartDatetime = processInstanceStartDatetime;
    return this;
  }

   /**
   * Time of Process start
   * @return processInstanceStartDatetime
  **/
  @ApiModelProperty(example = "2010-08-18T14:03:16+0900", value = "Time of Process start")
  public DateTime getProcessInstanceStartDatetime() {
    return processInstanceStartDatetime;
  }

  public void setProcessInstanceStartDatetime(DateTime processInstanceStartDatetime) {
    this.processInstanceStartDatetime = processInstanceStartDatetime;
  }

  public ProcessInstance processInstanceState(String processInstanceState) {
    this.processInstanceState = processInstanceState;
    return this;
  }

   /**
   * Process Status
   * @return processInstanceState
  **/
  @ApiModelProperty(example = "STARTED", value = "Process Status")
  public String getProcessInstanceState() {
    return processInstanceState;
  }

  public void setProcessInstanceState(String processInstanceState) {
    this.processInstanceState = processInstanceState;
  }

  public ProcessInstance processInstanceDebug(Boolean processInstanceDebug) {
    this.processInstanceDebug = processInstanceDebug;
    return this;
  }

   /**
   * Debug mode
   * @return processInstanceDebug
  **/
  @ApiModelProperty(example = "false", value = "Debug mode")
  public Boolean getProcessInstanceDebug() {
    return processInstanceDebug;
  }

  public void setProcessInstanceDebug(Boolean processInstanceDebug) {
    this.processInstanceDebug = processInstanceDebug;
  }

  public ProcessInstance processInstanceTitle(String processInstanceTitle) {
    this.processInstanceTitle = processInstanceTitle;
    return this;
  }

   /**
   * Process Title
   * @return processInstanceTitle
  **/
  @ApiModelProperty(example = "Process 1", value = "Process Title")
  public String getProcessInstanceTitle() {
    return processInstanceTitle;
  }

  public void setProcessInstanceTitle(String processInstanceTitle) {
    this.processInstanceTitle = processInstanceTitle;
  }

  public ProcessInstance processModelInfoId(Long processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
    return this;
  }

   /**
   * Process Model ID
   * @return processModelInfoId
  **/
  @ApiModelProperty(example = "9", value = "Process Model ID")
  public Long getProcessModelInfoId() {
    return processModelInfoId;
  }

  public void setProcessModelInfoId(Long processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
  }

  public ProcessInstance processModelInfoName(String processModelInfoName) {
    this.processModelInfoName = processModelInfoName;
    return this;
  }

   /**
   * Process Model name
   * @return processModelInfoName
  **/
  @ApiModelProperty(example = "Test App", value = "Process Model name")
  public String getProcessModelInfoName() {
    return processModelInfoName;
  }

  public void setProcessModelInfoName(String processModelInfoName) {
    this.processModelInfoName = processModelInfoName;
  }

  public ProcessInstance processModelInfoCategory(String processModelInfoCategory) {
    this.processModelInfoCategory = processModelInfoCategory;
    return this;
  }

   /**
   * Category of the Process Model
   * @return processModelInfoCategory
  **/
  @ApiModelProperty(example = "Category 1", value = "Category of the Process Model")
  public String getProcessModelInfoCategory() {
    return processModelInfoCategory;
  }

  public void setProcessModelInfoCategory(String processModelInfoCategory) {
    this.processModelInfoCategory = processModelInfoCategory;
  }

  public ProcessInstance processModelVersion(Long processModelVersion) {
    this.processModelVersion = processModelVersion;
    return this;
  }

   /**
   * Version of the Process Model
   * @return processModelVersion
  **/
  @ApiModelProperty(example = "4", value = "Version of the Process Model")
  public Long getProcessModelVersion() {
    return processModelVersion;
  }

  public void setProcessModelVersion(Long processModelVersion) {
    this.processModelVersion = processModelVersion;
  }

  public ProcessInstance activeTokenNodeName(String activeTokenNodeName) {
    this.activeTokenNodeName = activeTokenNodeName;
    return this;
  }

   /**
   * Node name where the active token staying
   * @return activeTokenNodeName
  **/
  @ApiModelProperty(example = "Category 1", value = "Node name where the active token staying")
  public String getActiveTokenNodeName() {
    return activeTokenNodeName;
  }

  public void setActiveTokenNodeName(String activeTokenNodeName) {
    this.activeTokenNodeName = activeTokenNodeName;
  }

  public ProcessInstance data(Map<String, ProcessData> data) {
    this.data = data;
    return this;
  }

  public ProcessInstance putDataItem(String key, ProcessData dataItem) {
    if (this.data == null) {
      this.data = new HashMap<String, ProcessData>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "{\"0\":{\"dataType\":\"STRING\",\"id\":138970,\"name\":\"sample name\",\"processDataDefinitionNumber\":0,\"subType\":null,\"value\":\"sample string\",\"viewOrder\":1}}", value = "")
  public Map<String, ProcessData> getData() {
    return data;
  }

  public void setData(Map<String, ProcessData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstance processInstance = (ProcessInstance) o;
    return Objects.equals(this.processInstanceEndDatetime, processInstance.processInstanceEndDatetime) &&
        Objects.equals(this.processInstanceIdForView, processInstance.processInstanceIdForView) &&
        Objects.equals(this.processInstanceId, processInstance.processInstanceId) &&
        Objects.equals(this.processInstanceSequenceNumber, processInstance.processInstanceSequenceNumber) &&
        Objects.equals(this.processInstanceInitQgroupId, processInstance.processInstanceInitQgroupId) &&
        Objects.equals(this.processInstanceInitQgroupName, processInstance.processInstanceInitQgroupName) &&
        Objects.equals(this.processInstanceInitQuserId, processInstance.processInstanceInitQuserId) &&
        Objects.equals(this.processInstanceInitQuserName, processInstance.processInstanceInitQuserName) &&
        Objects.equals(this.processInstanceStartDatetime, processInstance.processInstanceStartDatetime) &&
        Objects.equals(this.processInstanceState, processInstance.processInstanceState) &&
        Objects.equals(this.processInstanceDebug, processInstance.processInstanceDebug) &&
        Objects.equals(this.processInstanceTitle, processInstance.processInstanceTitle) &&
        Objects.equals(this.processModelInfoId, processInstance.processModelInfoId) &&
        Objects.equals(this.processModelInfoName, processInstance.processModelInfoName) &&
        Objects.equals(this.processModelInfoCategory, processInstance.processModelInfoCategory) &&
        Objects.equals(this.processModelVersion, processInstance.processModelVersion) &&
        Objects.equals(this.activeTokenNodeName, processInstance.activeTokenNodeName) &&
        Objects.equals(this.data, processInstance.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceEndDatetime, processInstanceIdForView, processInstanceId, processInstanceSequenceNumber, processInstanceInitQgroupId, processInstanceInitQgroupName, processInstanceInitQuserId, processInstanceInitQuserName, processInstanceStartDatetime, processInstanceState, processInstanceDebug, processInstanceTitle, processModelInfoId, processModelInfoName, processModelInfoCategory, processModelVersion, activeTokenNodeName, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstance {\n");
    
    sb.append("    processInstanceEndDatetime: ").append(toIndentedString(processInstanceEndDatetime)).append("\n");
    sb.append("    processInstanceIdForView: ").append(toIndentedString(processInstanceIdForView)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceSequenceNumber: ").append(toIndentedString(processInstanceSequenceNumber)).append("\n");
    sb.append("    processInstanceInitQgroupId: ").append(toIndentedString(processInstanceInitQgroupId)).append("\n");
    sb.append("    processInstanceInitQgroupName: ").append(toIndentedString(processInstanceInitQgroupName)).append("\n");
    sb.append("    processInstanceInitQuserId: ").append(toIndentedString(processInstanceInitQuserId)).append("\n");
    sb.append("    processInstanceInitQuserName: ").append(toIndentedString(processInstanceInitQuserName)).append("\n");
    sb.append("    processInstanceStartDatetime: ").append(toIndentedString(processInstanceStartDatetime)).append("\n");
    sb.append("    processInstanceState: ").append(toIndentedString(processInstanceState)).append("\n");
    sb.append("    processInstanceDebug: ").append(toIndentedString(processInstanceDebug)).append("\n");
    sb.append("    processInstanceTitle: ").append(toIndentedString(processInstanceTitle)).append("\n");
    sb.append("    processModelInfoId: ").append(toIndentedString(processModelInfoId)).append("\n");
    sb.append("    processModelInfoName: ").append(toIndentedString(processModelInfoName)).append("\n");
    sb.append("    processModelInfoCategory: ").append(toIndentedString(processModelInfoCategory)).append("\n");
    sb.append("    processModelVersion: ").append(toIndentedString(processModelVersion)).append("\n");
    sb.append("    activeTokenNodeName: ").append(toIndentedString(activeTokenNodeName)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

