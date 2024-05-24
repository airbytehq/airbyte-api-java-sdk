/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
/**
 * JobResponse - Provides details of a single job.
 */

public class JobResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bytesSynced")
    private Optional<? extends Long> bytesSynced;

    @JsonProperty("connectionId")
    private String connectionId;

    /**
     * Duration of a sync in ISO_8601 format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<? extends String> duration;

    @JsonProperty("jobId")
    private long jobId;

    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    @JsonProperty("jobType")
    private JobTypeEnum jobType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastUpdatedAt")
    private Optional<? extends String> lastUpdatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rowsSynced")
    private Optional<? extends Long> rowsSynced;

    @JsonProperty("startTime")
    private String startTime;

    @JsonProperty("status")
    private JobStatusEnum status;

    @JsonCreator
    public JobResponse(
            @JsonProperty("bytesSynced") Optional<? extends Long> bytesSynced,
            @JsonProperty("connectionId") String connectionId,
            @JsonProperty("duration") Optional<? extends String> duration,
            @JsonProperty("jobId") long jobId,
            @JsonProperty("jobType") JobTypeEnum jobType,
            @JsonProperty("lastUpdatedAt") Optional<? extends String> lastUpdatedAt,
            @JsonProperty("rowsSynced") Optional<? extends Long> rowsSynced,
            @JsonProperty("startTime") String startTime,
            @JsonProperty("status") JobStatusEnum status) {
        Utils.checkNotNull(bytesSynced, "bytesSynced");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(jobType, "jobType");
        Utils.checkNotNull(lastUpdatedAt, "lastUpdatedAt");
        Utils.checkNotNull(rowsSynced, "rowsSynced");
        Utils.checkNotNull(startTime, "startTime");
        Utils.checkNotNull(status, "status");
        this.bytesSynced = bytesSynced;
        this.connectionId = connectionId;
        this.duration = duration;
        this.jobId = jobId;
        this.jobType = jobType;
        this.lastUpdatedAt = lastUpdatedAt;
        this.rowsSynced = rowsSynced;
        this.startTime = startTime;
        this.status = status;
    }
    
    public JobResponse(
            String connectionId,
            long jobId,
            JobTypeEnum jobType,
            String startTime,
            JobStatusEnum status) {
        this(Optional.empty(), connectionId, Optional.empty(), jobId, jobType, Optional.empty(), Optional.empty(), startTime, status);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> bytesSynced() {
        return (Optional<Long>) bytesSynced;
    }

    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Duration of a sync in ISO_8601 format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> duration() {
        return (Optional<String>) duration;
    }

    @JsonIgnore
    public long jobId() {
        return jobId;
    }

    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    @JsonIgnore
    public JobTypeEnum jobType() {
        return jobType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastUpdatedAt() {
        return (Optional<String>) lastUpdatedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> rowsSynced() {
        return (Optional<Long>) rowsSynced;
    }

    @JsonIgnore
    public String startTime() {
        return startTime;
    }

    @JsonIgnore
    public JobStatusEnum status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public JobResponse withBytesSynced(long bytesSynced) {
        Utils.checkNotNull(bytesSynced, "bytesSynced");
        this.bytesSynced = Optional.ofNullable(bytesSynced);
        return this;
    }

    public JobResponse withBytesSynced(Optional<? extends Long> bytesSynced) {
        Utils.checkNotNull(bytesSynced, "bytesSynced");
        this.bytesSynced = bytesSynced;
        return this;
    }

    public JobResponse withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Duration of a sync in ISO_8601 format
     */
    public JobResponse withDuration(String duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    /**
     * Duration of a sync in ISO_8601 format
     */
    public JobResponse withDuration(Optional<? extends String> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public JobResponse withJobId(long jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    public JobResponse withJobType(JobTypeEnum jobType) {
        Utils.checkNotNull(jobType, "jobType");
        this.jobType = jobType;
        return this;
    }

    public JobResponse withLastUpdatedAt(String lastUpdatedAt) {
        Utils.checkNotNull(lastUpdatedAt, "lastUpdatedAt");
        this.lastUpdatedAt = Optional.ofNullable(lastUpdatedAt);
        return this;
    }

    public JobResponse withLastUpdatedAt(Optional<? extends String> lastUpdatedAt) {
        Utils.checkNotNull(lastUpdatedAt, "lastUpdatedAt");
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public JobResponse withRowsSynced(long rowsSynced) {
        Utils.checkNotNull(rowsSynced, "rowsSynced");
        this.rowsSynced = Optional.ofNullable(rowsSynced);
        return this;
    }

    public JobResponse withRowsSynced(Optional<? extends Long> rowsSynced) {
        Utils.checkNotNull(rowsSynced, "rowsSynced");
        this.rowsSynced = rowsSynced;
        return this;
    }

    public JobResponse withStartTime(String startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = startTime;
        return this;
    }

    public JobResponse withStatus(JobStatusEnum status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobResponse other = (JobResponse) o;
        return 
            java.util.Objects.deepEquals(this.bytesSynced, other.bytesSynced) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.duration, other.duration) &&
            java.util.Objects.deepEquals(this.jobId, other.jobId) &&
            java.util.Objects.deepEquals(this.jobType, other.jobType) &&
            java.util.Objects.deepEquals(this.lastUpdatedAt, other.lastUpdatedAt) &&
            java.util.Objects.deepEquals(this.rowsSynced, other.rowsSynced) &&
            java.util.Objects.deepEquals(this.startTime, other.startTime) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bytesSynced,
            connectionId,
            duration,
            jobId,
            jobType,
            lastUpdatedAt,
            rowsSynced,
            startTime,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JobResponse.class,
                "bytesSynced", bytesSynced,
                "connectionId", connectionId,
                "duration", duration,
                "jobId", jobId,
                "jobType", jobType,
                "lastUpdatedAt", lastUpdatedAt,
                "rowsSynced", rowsSynced,
                "startTime", startTime,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> bytesSynced = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends String> duration = Optional.empty();
 
        private Long jobId;
 
        private JobTypeEnum jobType;
 
        private Optional<? extends String> lastUpdatedAt = Optional.empty();
 
        private Optional<? extends Long> rowsSynced = Optional.empty();
 
        private String startTime;
 
        private JobStatusEnum status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bytesSynced(long bytesSynced) {
            Utils.checkNotNull(bytesSynced, "bytesSynced");
            this.bytesSynced = Optional.ofNullable(bytesSynced);
            return this;
        }

        public Builder bytesSynced(Optional<? extends Long> bytesSynced) {
            Utils.checkNotNull(bytesSynced, "bytesSynced");
            this.bytesSynced = bytesSynced;
            return this;
        }

        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Duration of a sync in ISO_8601 format
         */
        public Builder duration(String duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        /**
         * Duration of a sync in ISO_8601 format
         */
        public Builder duration(Optional<? extends String> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder jobId(long jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        /**
         * Enum that describes the different types of jobs that the platform runs.
         */
        public Builder jobType(JobTypeEnum jobType) {
            Utils.checkNotNull(jobType, "jobType");
            this.jobType = jobType;
            return this;
        }

        public Builder lastUpdatedAt(String lastUpdatedAt) {
            Utils.checkNotNull(lastUpdatedAt, "lastUpdatedAt");
            this.lastUpdatedAt = Optional.ofNullable(lastUpdatedAt);
            return this;
        }

        public Builder lastUpdatedAt(Optional<? extends String> lastUpdatedAt) {
            Utils.checkNotNull(lastUpdatedAt, "lastUpdatedAt");
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        public Builder rowsSynced(long rowsSynced) {
            Utils.checkNotNull(rowsSynced, "rowsSynced");
            this.rowsSynced = Optional.ofNullable(rowsSynced);
            return this;
        }

        public Builder rowsSynced(Optional<? extends Long> rowsSynced) {
            Utils.checkNotNull(rowsSynced, "rowsSynced");
            this.rowsSynced = rowsSynced;
            return this;
        }

        public Builder startTime(String startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }

        public Builder status(JobStatusEnum status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public JobResponse build() {
            return new JobResponse(
                bytesSynced,
                connectionId,
                duration,
                jobId,
                jobType,
                lastUpdatedAt,
                rowsSynced,
                startTime,
                status);
        }
    }
}

