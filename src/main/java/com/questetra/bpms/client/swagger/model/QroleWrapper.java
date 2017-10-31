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
import com.questetra.bpms.client.swagger.model.Qrole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QroleWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-31T08:07:41.678Z")
public class QroleWrapper {
  @SerializedName("qrole")
  private Qrole qrole = null;

  public QroleWrapper qrole(Qrole qrole) {
    this.qrole = qrole;
    return this;
  }

   /**
   * Get qrole
   * @return qrole
  **/
  @ApiModelProperty(value = "")
  public Qrole getQrole() {
    return qrole;
  }

  public void setQrole(Qrole qrole) {
    this.qrole = qrole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QroleWrapper qroleWrapper = (QroleWrapper) o;
    return Objects.equals(this.qrole, qroleWrapper.qrole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QroleWrapper {\n");
    
    sb.append("    qrole: ").append(toIndentedString(qrole)).append("\n");
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

