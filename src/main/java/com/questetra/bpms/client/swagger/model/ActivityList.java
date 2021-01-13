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
import com.questetra.bpms.client.swagger.model.Activity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-13T15:44:52.325+09:00")
public class ActivityList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("startableActivities")
  private List<Activity> startableActivities = null;

  public ActivityList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "30", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ActivityList startableActivities(List<Activity> startableActivities) {
    this.startableActivities = startableActivities;
    return this;
  }

  public ActivityList addStartableActivitiesItem(Activity startableActivitiesItem) {
    if (this.startableActivities == null) {
      this.startableActivities = new ArrayList<Activity>();
    }
    this.startableActivities.add(startableActivitiesItem);
    return this;
  }

   /**
   * Get startableActivities
   * @return startableActivities
  **/
  @ApiModelProperty(value = "")
  public List<Activity> getStartableActivities() {
    return startableActivities;
  }

  public void setStartableActivities(List<Activity> startableActivities) {
    this.startableActivities = startableActivities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityList activityList = (ActivityList) o;
    return Objects.equals(this.count, activityList.count) &&
        Objects.equals(this.startableActivities, activityList.startableActivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, startableActivities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    startableActivities: ").append(toIndentedString(startableActivities)).append("\n");
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

