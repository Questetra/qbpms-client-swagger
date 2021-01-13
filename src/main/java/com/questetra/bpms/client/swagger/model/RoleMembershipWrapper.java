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
import com.questetra.bpms.client.swagger.model.RoleMembership;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoleMembershipWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T16:44:27.343+09:00")
public class RoleMembershipWrapper {
  @SerializedName("roleMembership")
  private RoleMembership roleMembership = null;

  public RoleMembershipWrapper roleMembership(RoleMembership roleMembership) {
    this.roleMembership = roleMembership;
    return this;
  }

   /**
   * Get roleMembership
   * @return roleMembership
  **/
  @ApiModelProperty(value = "")
  public RoleMembership getRoleMembership() {
    return roleMembership;
  }

  public void setRoleMembership(RoleMembership roleMembership) {
    this.roleMembership = roleMembership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMembershipWrapper roleMembershipWrapper = (RoleMembershipWrapper) o;
    return Objects.equals(this.roleMembership, roleMembershipWrapper.roleMembership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleMembership);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMembershipWrapper {\n");
    
    sb.append("    roleMembership: ").append(toIndentedString(roleMembership)).append("\n");
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

