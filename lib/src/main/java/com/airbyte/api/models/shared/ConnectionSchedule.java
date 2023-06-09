/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectionSchedule - schedule for when the the connection should run, per the schedule type
 */

public class ConnectionSchedule {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cronExpression")
    public String cronExpression;

    public ConnectionSchedule withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    
    @JsonProperty("scheduleType")
    public ScheduleTypeEnum scheduleType;

    public ConnectionSchedule withScheduleType(ScheduleTypeEnum scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    
    public ConnectionSchedule(@JsonProperty("scheduleType") ScheduleTypeEnum scheduleType) {
        this.scheduleType = scheduleType;
  }
}
