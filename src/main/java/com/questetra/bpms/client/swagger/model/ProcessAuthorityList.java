/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 11.6.0
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
import com.questetra.bpms.client.swagger.model.ProcessAuthority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessAuthorityList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T13:37:26.457+09:00")
public class ProcessAuthorityList {
  @SerializedName("processAuthorities")
  private List<ProcessAuthority> processAuthorities = null;

  public ProcessAuthorityList processAuthorities(List<ProcessAuthority> processAuthorities) {
    this.processAuthorities = processAuthorities;
    return this;
  }

  public ProcessAuthorityList addProcessAuthoritiesItem(ProcessAuthority processAuthoritiesItem) {
    if (this.processAuthorities == null) {
      this.processAuthorities = new ArrayList<ProcessAuthority>();
    }
    this.processAuthorities.add(processAuthoritiesItem);
    return this;
  }

   /**
   * Get processAuthorities
   * @return processAuthorities
  **/
  @ApiModelProperty(value = "")
  public List<ProcessAuthority> getProcessAuthorities() {
    return processAuthorities;
  }

  public void setProcessAuthorities(List<ProcessAuthority> processAuthorities) {
    this.processAuthorities = processAuthorities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessAuthorityList processAuthorityList = (ProcessAuthorityList) o;
    return Objects.equals(this.processAuthorities, processAuthorityList.processAuthorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processAuthorities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessAuthorityList {\n");
    
    sb.append("    processAuthorities: ").append(toIndentedString(processAuthorities)).append("\n");
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

