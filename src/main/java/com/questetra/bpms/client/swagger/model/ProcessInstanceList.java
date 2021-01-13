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
import com.questetra.bpms.client.swagger.model.ProcessInstance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessInstanceList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T11:09:14.859+09:00")
public class ProcessInstanceList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("processInstances")
  private List<ProcessInstance> processInstances = null;

  public ProcessInstanceList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "30", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ProcessInstanceList processInstances(List<ProcessInstance> processInstances) {
    this.processInstances = processInstances;
    return this;
  }

  public ProcessInstanceList addProcessInstancesItem(ProcessInstance processInstancesItem) {
    if (this.processInstances == null) {
      this.processInstances = new ArrayList<ProcessInstance>();
    }
    this.processInstances.add(processInstancesItem);
    return this;
  }

   /**
   * Get processInstances
   * @return processInstances
  **/
  @ApiModelProperty(value = "")
  public List<ProcessInstance> getProcessInstances() {
    return processInstances;
  }

  public void setProcessInstances(List<ProcessInstance> processInstances) {
    this.processInstances = processInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceList processInstanceList = (ProcessInstanceList) o;
    return Objects.equals(this.count, processInstanceList.count) &&
        Objects.equals(this.processInstances, processInstanceList.processInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, processInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    processInstances: ").append(toIndentedString(processInstances)).append("\n");
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

