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
 * ProcessModelReseaseResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T16:44:27.343+09:00")
public class ProcessModelReseaseResult {
  @SerializedName("processModelInfoId")
  private Integer processModelInfoId = null;

  @SerializedName("processModelId")
  private Integer processModelId = null;

  @SerializedName("version")
  private Integer version = null;

  public ProcessModelReseaseResult processModelInfoId(Integer processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
    return this;
  }

   /**
   * Process Model ID that does not change regardless of Version
   * @return processModelInfoId
  **/
  @ApiModelProperty(example = "1", value = "Process Model ID that does not change regardless of Version")
  public Integer getProcessModelInfoId() {
    return processModelInfoId;
  }

  public void setProcessModelInfoId(Integer processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
  }

  public ProcessModelReseaseResult processModelId(Integer processModelId) {
    this.processModelId = processModelId;
    return this;
  }

   /**
   * Process Model ID
   * @return processModelId
  **/
  @ApiModelProperty(example = "9", value = "Process Model ID")
  public Integer getProcessModelId() {
    return processModelId;
  }

  public void setProcessModelId(Integer processModelId) {
    this.processModelId = processModelId;
  }

  public ProcessModelReseaseResult version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Process Model version
   * @return version
  **/
  @ApiModelProperty(example = "2", value = "Process Model version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessModelReseaseResult processModelReseaseResult = (ProcessModelReseaseResult) o;
    return Objects.equals(this.processModelInfoId, processModelReseaseResult.processModelInfoId) &&
        Objects.equals(this.processModelId, processModelReseaseResult.processModelId) &&
        Objects.equals(this.version, processModelReseaseResult.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processModelInfoId, processModelId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessModelReseaseResult {\n");
    
    sb.append("    processModelInfoId: ").append(toIndentedString(processModelInfoId)).append("\n");
    sb.append("    processModelId: ").append(toIndentedString(processModelId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

