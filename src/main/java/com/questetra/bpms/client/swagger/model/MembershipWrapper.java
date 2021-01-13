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
import com.questetra.bpms.client.swagger.model.Membership;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MembershipWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T11:09:14.859+09:00")
public class MembershipWrapper {
  @SerializedName("membership")
  private Membership membership = null;

  public MembershipWrapper membership(Membership membership) {
    this.membership = membership;
    return this;
  }

   /**
   * Get membership
   * @return membership
  **/
  @ApiModelProperty(value = "")
  public Membership getMembership() {
    return membership;
  }

  public void setMembership(Membership membership) {
    this.membership = membership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipWrapper membershipWrapper = (MembershipWrapper) o;
    return Objects.equals(this.membership, membershipWrapper.membership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membership);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipWrapper {\n");
    
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
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

