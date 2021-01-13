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
import com.questetra.bpms.client.swagger.model.WorkitemFormResultProcessdatavalidationerrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkitemFormResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T15:44:52.325+09:00")
public class WorkitemFormResult {
  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("process-data-validation-errors")
  private WorkitemFormResultProcessdatavalidationerrors processDataValidationErrors = null;

  public WorkitemFormResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public WorkitemFormResult processDataValidationErrors(WorkitemFormResultProcessdatavalidationerrors processDataValidationErrors) {
    this.processDataValidationErrors = processDataValidationErrors;
    return this;
  }

   /**
   * Get processDataValidationErrors
   * @return processDataValidationErrors
  **/
  @ApiModelProperty(value = "")
  public WorkitemFormResultProcessdatavalidationerrors getProcessDataValidationErrors() {
    return processDataValidationErrors;
  }

  public void setProcessDataValidationErrors(WorkitemFormResultProcessdatavalidationerrors processDataValidationErrors) {
    this.processDataValidationErrors = processDataValidationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemFormResult workitemFormResult = (WorkitemFormResult) o;
    return Objects.equals(this.success, workitemFormResult.success) &&
        Objects.equals(this.processDataValidationErrors, workitemFormResult.processDataValidationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, processDataValidationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemFormResult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    processDataValidationErrors: ").append(toIndentedString(processDataValidationErrors)).append("\n");
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
