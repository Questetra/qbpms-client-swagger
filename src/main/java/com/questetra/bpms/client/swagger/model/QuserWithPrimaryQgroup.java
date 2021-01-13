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
import com.questetra.bpms.client.swagger.model.Qgroup;
import com.questetra.bpms.client.swagger.model.Quser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QuserWithPrimaryQgroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T11:09:14.859+09:00")
public class QuserWithPrimaryQgroup extends Quser {
  @SerializedName("primaryQgroup")
  private Qgroup primaryQgroup = null;

  public QuserWithPrimaryQgroup primaryQgroup(Qgroup primaryQgroup) {
    this.primaryQgroup = primaryQgroup;
    return this;
  }

   /**
   * Get primaryQgroup
   * @return primaryQgroup
  **/
  @ApiModelProperty(value = "")
  public Qgroup getPrimaryQgroup() {
    return primaryQgroup;
  }

  public void setPrimaryQgroup(Qgroup primaryQgroup) {
    this.primaryQgroup = primaryQgroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuserWithPrimaryQgroup quserWithPrimaryQgroup = (QuserWithPrimaryQgroup) o;
    return Objects.equals(this.primaryQgroup, quserWithPrimaryQgroup.primaryQgroup) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryQgroup, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuserWithPrimaryQgroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    primaryQgroup: ").append(toIndentedString(primaryQgroup)).append("\n");
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

