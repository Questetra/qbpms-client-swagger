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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Membership
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-31T08:07:41.678Z")
public class Membership {
  @SerializedName("qgroupEmail")
  private String qgroupEmail = null;

  @SerializedName("qgroupId")
  private Long qgroupId = null;

  @SerializedName("qgroupName")
  private String qgroupName = null;

  @SerializedName("quserEmail")
  private String quserEmail = null;

  @SerializedName("quserId")
  private Long quserId = null;

  @SerializedName("quserName")
  private String quserName = null;

  /**
   * Member’s role: _leader or null
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    LEADER("_leader");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  public Membership qgroupEmail(String qgroupEmail) {
    this.qgroupEmail = qgroupEmail;
    return this;
  }

   /**
   * Organization address
   * @return qgroupEmail
  **/
  @ApiModelProperty(example = "marketing@questetra.com", value = "Organization address")
  public String getQgroupEmail() {
    return qgroupEmail;
  }

  public void setQgroupEmail(String qgroupEmail) {
    this.qgroupEmail = qgroupEmail;
  }

  public Membership qgroupId(Long qgroupId) {
    this.qgroupId = qgroupId;
    return this;
  }

   /**
   * Organization ID
   * @return qgroupId
  **/
  @ApiModelProperty(example = "4", value = "Organization ID")
  public Long getQgroupId() {
    return qgroupId;
  }

  public void setQgroupId(Long qgroupId) {
    this.qgroupId = qgroupId;
  }

  public Membership qgroupName(String qgroupName) {
    this.qgroupName = qgroupName;
    return this;
  }

   /**
   * Organization name
   * @return qgroupName
  **/
  @ApiModelProperty(example = "Marketing", value = "Organization name")
  public String getQgroupName() {
    return qgroupName;
  }

  public void setQgroupName(String qgroupName) {
    this.qgroupName = qgroupName;
  }

  public Membership quserEmail(String quserEmail) {
    this.quserEmail = quserEmail;
    return this;
  }

   /**
   * User email address
   * @return quserEmail
  **/
  @ApiModelProperty(example = "Solomon@questetra.com", value = "User email address")
  public String getQuserEmail() {
    return quserEmail;
  }

  public void setQuserEmail(String quserEmail) {
    this.quserEmail = quserEmail;
  }

  public Membership quserId(Long quserId) {
    this.quserId = quserId;
    return this;
  }

   /**
   * User ID
   * @return quserId
  **/
  @ApiModelProperty(example = "5", value = "User ID")
  public Long getQuserId() {
    return quserId;
  }

  public void setQuserId(Long quserId) {
    this.quserId = quserId;
  }

  public Membership quserName(String quserName) {
    this.quserName = quserName;
    return this;
  }

   /**
   * User name
   * @return quserName
  **/
  @ApiModelProperty(example = "Solomon", value = "User name")
  public String getQuserName() {
    return quserName;
  }

  public void setQuserName(String quserName) {
    this.quserName = quserName;
  }

  public Membership role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Member’s role: _leader or null
   * @return role
  **/
  @ApiModelProperty(value = "Member’s role: _leader or null")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Membership membership = (Membership) o;
    return Objects.equals(this.qgroupEmail, membership.qgroupEmail) &&
        Objects.equals(this.qgroupId, membership.qgroupId) &&
        Objects.equals(this.qgroupName, membership.qgroupName) &&
        Objects.equals(this.quserEmail, membership.quserEmail) &&
        Objects.equals(this.quserId, membership.quserId) &&
        Objects.equals(this.quserName, membership.quserName) &&
        Objects.equals(this.role, membership.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qgroupEmail, qgroupId, qgroupName, quserEmail, quserId, quserName, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Membership {\n");
    
    sb.append("    qgroupEmail: ").append(toIndentedString(qgroupEmail)).append("\n");
    sb.append("    qgroupId: ").append(toIndentedString(qgroupId)).append("\n");
    sb.append("    qgroupName: ").append(toIndentedString(qgroupName)).append("\n");
    sb.append("    quserEmail: ").append(toIndentedString(quserEmail)).append("\n");
    sb.append("    quserId: ").append(toIndentedString(quserId)).append("\n");
    sb.append("    quserName: ").append(toIndentedString(quserName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

