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
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessModelInfo2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T11:09:14.859+09:00")
public class ProcessModelInfo2 {
  @SerializedName("authorities")
  private List<Object> authorities = null;

  @SerializedName("processModelInfoCategory")
  private String processModelInfoCategory = null;

  @SerializedName("processModelInfoCreateQuserName")
  private String processModelInfoCreateQuserName = null;

  @SerializedName("processModelInfoCssClass")
  private String processModelInfoCssClass = null;

  @SerializedName("processModelInfoHasActiveProcessModel")
  private Boolean processModelInfoHasActiveProcessModel = null;

  @SerializedName("processModelInfoId")
  private Integer processModelInfoId = null;

  @SerializedName("processModelInfoName")
  private String processModelInfoName = null;

  @SerializedName("processModelInfoNote")
  private String processModelInfoNote = null;

  @SerializedName("processModelInfoViewPriority")
  private Integer processModelInfoViewPriority = null;

  @SerializedName("processModelVersion")
  private Integer processModelVersion = null;

  @SerializedName("starred")
  private Boolean starred = null;

  public ProcessModelInfo2 authorities(List<Object> authorities) {
    this.authorities = authorities;
    return this;
  }

  public ProcessModelInfo2 addAuthoritiesItem(Object authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<Object>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Always null
   * @return authorities
  **/
  @ApiModelProperty(value = "Always null")
  public List<Object> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<Object> authorities) {
    this.authorities = authorities;
  }

  public ProcessModelInfo2 processModelInfoCategory(String processModelInfoCategory) {
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

  public ProcessModelInfo2 processModelInfoCreateQuserName(String processModelInfoCreateQuserName) {
    this.processModelInfoCreateQuserName = processModelInfoCreateQuserName;
    return this;
  }

   /**
   * Creator&#39;s Name
   * @return processModelInfoCreateQuserName
  **/
  @ApiModelProperty(example = "SouthPole", value = "Creator's Name")
  public String getProcessModelInfoCreateQuserName() {
    return processModelInfoCreateQuserName;
  }

  public void setProcessModelInfoCreateQuserName(String processModelInfoCreateQuserName) {
    this.processModelInfoCreateQuserName = processModelInfoCreateQuserName;
  }

  public ProcessModelInfo2 processModelInfoCssClass(String processModelInfoCssClass) {
    this.processModelInfoCssClass = processModelInfoCssClass;
    return this;
  }

   /**
   * 
   * @return processModelInfoCssClass
  **/
  @ApiModelProperty(example = "model", value = "")
  public String getProcessModelInfoCssClass() {
    return processModelInfoCssClass;
  }

  public void setProcessModelInfoCssClass(String processModelInfoCssClass) {
    this.processModelInfoCssClass = processModelInfoCssClass;
  }

  public ProcessModelInfo2 processModelInfoHasActiveProcessModel(Boolean processModelInfoHasActiveProcessModel) {
    this.processModelInfoHasActiveProcessModel = processModelInfoHasActiveProcessModel;
    return this;
  }

   /**
   * True if active
   * @return processModelInfoHasActiveProcessModel
  **/
  @ApiModelProperty(example = "true", value = "True if active")
  public Boolean isProcessModelInfoHasActiveProcessModel() {
    return processModelInfoHasActiveProcessModel;
  }

  public void setProcessModelInfoHasActiveProcessModel(Boolean processModelInfoHasActiveProcessModel) {
    this.processModelInfoHasActiveProcessModel = processModelInfoHasActiveProcessModel;
  }

  public ProcessModelInfo2 processModelInfoId(Integer processModelInfoId) {
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

  public ProcessModelInfo2 processModelInfoName(String processModelInfoName) {
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

  public ProcessModelInfo2 processModelInfoNote(String processModelInfoNote) {
    this.processModelInfoNote = processModelInfoNote;
    return this;
  }

   /**
   * Note of Process Model
   * @return processModelInfoNote
  **/
  @ApiModelProperty(example = "Note of Process Model", value = "Note of Process Model")
  public String getProcessModelInfoNote() {
    return processModelInfoNote;
  }

  public void setProcessModelInfoNote(String processModelInfoNote) {
    this.processModelInfoNote = processModelInfoNote;
  }

  public ProcessModelInfo2 processModelInfoViewPriority(Integer processModelInfoViewPriority) {
    this.processModelInfoViewPriority = processModelInfoViewPriority;
    return this;
  }

   /**
   * Priority of Process Model
   * @return processModelInfoViewPriority
  **/
  @ApiModelProperty(example = "5", value = "Priority of Process Model")
  public Integer getProcessModelInfoViewPriority() {
    return processModelInfoViewPriority;
  }

  public void setProcessModelInfoViewPriority(Integer processModelInfoViewPriority) {
    this.processModelInfoViewPriority = processModelInfoViewPriority;
  }

  public ProcessModelInfo2 processModelVersion(Integer processModelVersion) {
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

  public ProcessModelInfo2 starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

   /**
   * Starred
   * @return starred
  **/
  @ApiModelProperty(example = "true", value = "Starred")
  public Boolean isStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessModelInfo2 processModelInfo2 = (ProcessModelInfo2) o;
    return Objects.equals(this.authorities, processModelInfo2.authorities) &&
        Objects.equals(this.processModelInfoCategory, processModelInfo2.processModelInfoCategory) &&
        Objects.equals(this.processModelInfoCreateQuserName, processModelInfo2.processModelInfoCreateQuserName) &&
        Objects.equals(this.processModelInfoCssClass, processModelInfo2.processModelInfoCssClass) &&
        Objects.equals(this.processModelInfoHasActiveProcessModel, processModelInfo2.processModelInfoHasActiveProcessModel) &&
        Objects.equals(this.processModelInfoId, processModelInfo2.processModelInfoId) &&
        Objects.equals(this.processModelInfoName, processModelInfo2.processModelInfoName) &&
        Objects.equals(this.processModelInfoNote, processModelInfo2.processModelInfoNote) &&
        Objects.equals(this.processModelInfoViewPriority, processModelInfo2.processModelInfoViewPriority) &&
        Objects.equals(this.processModelVersion, processModelInfo2.processModelVersion) &&
        Objects.equals(this.starred, processModelInfo2.starred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorities, processModelInfoCategory, processModelInfoCreateQuserName, processModelInfoCssClass, processModelInfoHasActiveProcessModel, processModelInfoId, processModelInfoName, processModelInfoNote, processModelInfoViewPriority, processModelVersion, starred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessModelInfo2 {\n");
    
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    processModelInfoCategory: ").append(toIndentedString(processModelInfoCategory)).append("\n");
    sb.append("    processModelInfoCreateQuserName: ").append(toIndentedString(processModelInfoCreateQuserName)).append("\n");
    sb.append("    processModelInfoCssClass: ").append(toIndentedString(processModelInfoCssClass)).append("\n");
    sb.append("    processModelInfoHasActiveProcessModel: ").append(toIndentedString(processModelInfoHasActiveProcessModel)).append("\n");
    sb.append("    processModelInfoId: ").append(toIndentedString(processModelInfoId)).append("\n");
    sb.append("    processModelInfoName: ").append(toIndentedString(processModelInfoName)).append("\n");
    sb.append("    processModelInfoNote: ").append(toIndentedString(processModelInfoNote)).append("\n");
    sb.append("    processModelInfoViewPriority: ").append(toIndentedString(processModelInfoViewPriority)).append("\n");
    sb.append("    processModelVersion: ").append(toIndentedString(processModelVersion)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
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

