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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Activity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T16:44:27.343+09:00")
public class Activity {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("nodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("processModelActivateDatetime")
  private String processModelActivateDatetime = null;

  @SerializedName("processModelId")
  private Integer processModelId = null;

  @SerializedName("processModelInfoCategory")
  private String processModelInfoCategory = null;

  @SerializedName("processModelInfoId")
  private Integer processModelInfoId = null;

  @SerializedName("processModelInfoName")
  private String processModelInfoName = null;

  @SerializedName("processModelInfoShortExplanation")
  private String processModelInfoShortExplanation = null;

  @SerializedName("processModelVersion")
  private Integer processModelVersion = null;

  @SerializedName("processModelViewPriority")
  private Integer processModelViewPriority = null;

  public Activity id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Task ID
   * @return id
  **/
  @ApiModelProperty(example = "2086", value = "Task ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Activity nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Task name
   * @return nodeName
  **/
  @ApiModelProperty(example = "Sample Task", value = "Task name")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public Activity nodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
    return this;
  }

   /**
   * Node number
   * @return nodeNumber
  **/
  @ApiModelProperty(example = "3", value = "Node number")
  public Integer getNodeNumber() {
    return nodeNumber;
  }

  public void setNodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
  }

  public Activity processModelActivateDatetime(String processModelActivateDatetime) {
    this.processModelActivateDatetime = processModelActivateDatetime;
    return this;
  }

   /**
   * Time of Task start
   * @return processModelActivateDatetime
  **/
  @ApiModelProperty(example = "2010-01-07T18:13:40+0900", value = "Time of Task start")
  public String getProcessModelActivateDatetime() {
    return processModelActivateDatetime;
  }

  public void setProcessModelActivateDatetime(String processModelActivateDatetime) {
    this.processModelActivateDatetime = processModelActivateDatetime;
  }

  public Activity processModelId(Integer processModelId) {
    this.processModelId = processModelId;
    return this;
  }

   /**
   * Process Model ID that given to each different version
   * @return processModelId
  **/
  @ApiModelProperty(example = "1", value = "Process Model ID that given to each different version")
  public Integer getProcessModelId() {
    return processModelId;
  }

  public void setProcessModelId(Integer processModelId) {
    this.processModelId = processModelId;
  }

  public Activity processModelInfoCategory(String processModelInfoCategory) {
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

  public Activity processModelInfoId(Integer processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
    return this;
  }

   /**
   * Process Model ID that does not change regardless of Version
   * @return processModelInfoId
  **/
  @ApiModelProperty(example = "9", value = "Process Model ID that does not change regardless of Version")
  public Integer getProcessModelInfoId() {
    return processModelInfoId;
  }

  public void setProcessModelInfoId(Integer processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
  }

  public Activity processModelInfoName(String processModelInfoName) {
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

  public Activity processModelInfoShortExplanation(String processModelInfoShortExplanation) {
    this.processModelInfoShortExplanation = processModelInfoShortExplanation;
    return this;
  }

   /**
   * Summary of Process Model
   * @return processModelInfoShortExplanation
  **/
  @ApiModelProperty(example = "Summary of Process Model", value = "Summary of Process Model")
  public String getProcessModelInfoShortExplanation() {
    return processModelInfoShortExplanation;
  }

  public void setProcessModelInfoShortExplanation(String processModelInfoShortExplanation) {
    this.processModelInfoShortExplanation = processModelInfoShortExplanation;
  }

  public Activity processModelVersion(Integer processModelVersion) {
    this.processModelVersion = processModelVersion;
    return this;
  }

   /**
   * Version of the Process Model
   * @return processModelVersion
  **/
  @ApiModelProperty(example = "4", value = "Version of the Process Model")
  public Integer getProcessModelVersion() {
    return processModelVersion;
  }

  public void setProcessModelVersion(Integer processModelVersion) {
    this.processModelVersion = processModelVersion;
  }

  public Activity processModelViewPriority(Integer processModelViewPriority) {
    this.processModelViewPriority = processModelViewPriority;
    return this;
  }

   /**
   * Priority of Process Model
   * @return processModelViewPriority
  **/
  @ApiModelProperty(example = "5", value = "Priority of Process Model")
  public Integer getProcessModelViewPriority() {
    return processModelViewPriority;
  }

  public void setProcessModelViewPriority(Integer processModelViewPriority) {
    this.processModelViewPriority = processModelViewPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.id, activity.id) &&
        Objects.equals(this.nodeName, activity.nodeName) &&
        Objects.equals(this.nodeNumber, activity.nodeNumber) &&
        Objects.equals(this.processModelActivateDatetime, activity.processModelActivateDatetime) &&
        Objects.equals(this.processModelId, activity.processModelId) &&
        Objects.equals(this.processModelInfoCategory, activity.processModelInfoCategory) &&
        Objects.equals(this.processModelInfoId, activity.processModelInfoId) &&
        Objects.equals(this.processModelInfoName, activity.processModelInfoName) &&
        Objects.equals(this.processModelInfoShortExplanation, activity.processModelInfoShortExplanation) &&
        Objects.equals(this.processModelVersion, activity.processModelVersion) &&
        Objects.equals(this.processModelViewPriority, activity.processModelViewPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeName, nodeNumber, processModelActivateDatetime, processModelId, processModelInfoCategory, processModelInfoId, processModelInfoName, processModelInfoShortExplanation, processModelVersion, processModelViewPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    processModelActivateDatetime: ").append(toIndentedString(processModelActivateDatetime)).append("\n");
    sb.append("    processModelId: ").append(toIndentedString(processModelId)).append("\n");
    sb.append("    processModelInfoCategory: ").append(toIndentedString(processModelInfoCategory)).append("\n");
    sb.append("    processModelInfoId: ").append(toIndentedString(processModelInfoId)).append("\n");
    sb.append("    processModelInfoName: ").append(toIndentedString(processModelInfoName)).append("\n");
    sb.append("    processModelInfoShortExplanation: ").append(toIndentedString(processModelInfoShortExplanation)).append("\n");
    sb.append("    processModelVersion: ").append(toIndentedString(processModelVersion)).append("\n");
    sb.append("    processModelViewPriority: ").append(toIndentedString(processModelViewPriority)).append("\n");
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

