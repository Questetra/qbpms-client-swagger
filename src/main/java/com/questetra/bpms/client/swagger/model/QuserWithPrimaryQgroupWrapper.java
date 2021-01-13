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
import com.questetra.bpms.client.swagger.model.QuserWithPrimaryQgroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QuserWithPrimaryQgroupWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T11:09:14.859+09:00")
public class QuserWithPrimaryQgroupWrapper {
  @SerializedName("quser")
  private QuserWithPrimaryQgroup quser = null;

  public QuserWithPrimaryQgroupWrapper quser(QuserWithPrimaryQgroup quser) {
    this.quser = quser;
    return this;
  }

   /**
   * Get quser
   * @return quser
  **/
  @ApiModelProperty(value = "")
  public QuserWithPrimaryQgroup getQuser() {
    return quser;
  }

  public void setQuser(QuserWithPrimaryQgroup quser) {
    this.quser = quser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuserWithPrimaryQgroupWrapper quserWithPrimaryQgroupWrapper = (QuserWithPrimaryQgroupWrapper) o;
    return Objects.equals(this.quser, quserWithPrimaryQgroupWrapper.quser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuserWithPrimaryQgroupWrapper {\n");
    
    sb.append("    quser: ").append(toIndentedString(quser)).append("\n");
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

