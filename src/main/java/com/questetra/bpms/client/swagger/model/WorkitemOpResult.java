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
import com.questetra.bpms.client.swagger.model.Error;
import com.questetra.bpms.client.swagger.model.WorkitemOpResultWorkitem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkitemOpResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-31T08:07:41.678Z")
public class WorkitemOpResult {
  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("workitemId")
  private Integer workitemId = null;

  @SerializedName("workitem")
  private WorkitemOpResultWorkitem workitem = null;

  @SerializedName("error")
  private Error error = null;

  public WorkitemOpResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * true if the workitem has been accepted
   * @return success
  **/
  @ApiModelProperty(value = "true if the workitem has been accepted")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public WorkitemOpResult workitemId(Integer workitemId) {
    this.workitemId = workitemId;
    return this;
  }

   /**
   * Task instance ID
   * @return workitemId
  **/
  @ApiModelProperty(example = "58399", value = "Task instance ID")
  public Integer getWorkitemId() {
    return workitemId;
  }

  public void setWorkitemId(Integer workitemId) {
    this.workitemId = workitemId;
  }

  public WorkitemOpResult workitem(WorkitemOpResultWorkitem workitem) {
    this.workitem = workitem;
    return this;
  }

   /**
   * Get workitem
   * @return workitem
  **/
  @ApiModelProperty(value = "")
  public WorkitemOpResultWorkitem getWorkitem() {
    return workitem;
  }

  public void setWorkitem(WorkitemOpResultWorkitem workitem) {
    this.workitem = workitem;
  }

  public WorkitemOpResult error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemOpResult workitemOpResult = (WorkitemOpResult) o;
    return Objects.equals(this.success, workitemOpResult.success) &&
        Objects.equals(this.workitemId, workitemOpResult.workitemId) &&
        Objects.equals(this.workitem, workitemOpResult.workitem) &&
        Objects.equals(this.error, workitemOpResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, workitemId, workitem, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOpResult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

