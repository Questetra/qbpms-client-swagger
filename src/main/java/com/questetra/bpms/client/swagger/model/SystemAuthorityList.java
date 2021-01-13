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
import com.questetra.bpms.client.swagger.model.SystemAuthority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SystemAuthorityList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T15:44:52.325+09:00")
public class SystemAuthorityList {
  @SerializedName("systemAuthorities")
  private List<SystemAuthority> systemAuthorities = null;

  public SystemAuthorityList systemAuthorities(List<SystemAuthority> systemAuthorities) {
    this.systemAuthorities = systemAuthorities;
    return this;
  }

  public SystemAuthorityList addSystemAuthoritiesItem(SystemAuthority systemAuthoritiesItem) {
    if (this.systemAuthorities == null) {
      this.systemAuthorities = new ArrayList<SystemAuthority>();
    }
    this.systemAuthorities.add(systemAuthoritiesItem);
    return this;
  }

   /**
   * Get systemAuthorities
   * @return systemAuthorities
  **/
  @ApiModelProperty(value = "")
  public List<SystemAuthority> getSystemAuthorities() {
    return systemAuthorities;
  }

  public void setSystemAuthorities(List<SystemAuthority> systemAuthorities) {
    this.systemAuthorities = systemAuthorities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAuthorityList systemAuthorityList = (SystemAuthorityList) o;
    return Objects.equals(this.systemAuthorities, systemAuthorityList.systemAuthorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemAuthorities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthorityList {\n");
    
    sb.append("    systemAuthorities: ").append(toIndentedString(systemAuthorities)).append("\n");
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

