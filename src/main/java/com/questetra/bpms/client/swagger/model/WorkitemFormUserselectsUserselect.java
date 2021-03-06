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
 * WorkitemFormUserselectsUserselect
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T16:44:27.343+09:00")
public class WorkitemFormUserselectsUserselect {
  @SerializedName("flow-id")
  private Integer flowId = null;

  @SerializedName("name")
  private String name = null;

  public WorkitemFormUserselectsUserselect flowId(Integer flowId) {
    this.flowId = flowId;
    return this;
  }

   /**
   * Submit button ID
   * @return flowId
  **/
  @ApiModelProperty(value = "Submit button ID")
  public Integer getFlowId() {
    return flowId;
  }

  public void setFlowId(Integer flowId) {
    this.flowId = flowId;
  }

  public WorkitemFormUserselectsUserselect name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Submit button name
   * @return name
  **/
  @ApiModelProperty(value = "Submit button name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemFormUserselectsUserselect workitemFormUserselectsUserselect = (WorkitemFormUserselectsUserselect) o;
    return Objects.equals(this.flowId, workitemFormUserselectsUserselect.flowId) &&
        Objects.equals(this.name, workitemFormUserselectsUserselect.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemFormUserselectsUserselect {\n");
    
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

