/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class SourceGong {

    /**
     * Gong Access Key
     */
    @JsonProperty("access_key")
    private String accessKey;

    /**
     * Gong Access Key Secret
     */
    @JsonProperty("access_key_secret")
    private String accessKeySecret;

    @JsonProperty("sourceType")
    private Gong sourceType;

    /**
     * The date from which to list calls, in the ISO-8601 format; if not specified, the calls start with the earliest recorded call. For web-conference calls recorded by Gong, the date denotes its scheduled time, otherwise, it denotes its actual start time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    @JsonCreator
    public SourceGong(
            @JsonProperty("access_key") String accessKey,
            @JsonProperty("access_key_secret") String accessKeySecret,
            @JsonProperty("start_date") Optional<String> startDate) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(accessKeySecret, "accessKeySecret");
        Utils.checkNotNull(startDate, "startDate");
        this.accessKey = accessKey;
        this.accessKeySecret = accessKeySecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceGong(
            String accessKey,
            String accessKeySecret) {
        this(accessKey, accessKeySecret, Optional.empty());
    }

    /**
     * Gong Access Key
     */
    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    /**
     * Gong Access Key Secret
     */
    @JsonIgnore
    public String accessKeySecret() {
        return accessKeySecret;
    }

    @JsonIgnore
    public Gong sourceType() {
        return sourceType;
    }

    /**
     * The date from which to list calls, in the ISO-8601 format; if not specified, the calls start with the earliest recorded call. For web-conference calls recorded by Gong, the date denotes its scheduled time, otherwise, it denotes its actual start time.
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Gong Access Key
     */
    public SourceGong withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Gong Access Key Secret
     */
    public SourceGong withAccessKeySecret(String accessKeySecret) {
        Utils.checkNotNull(accessKeySecret, "accessKeySecret");
        this.accessKeySecret = accessKeySecret;
        return this;
    }

    /**
     * The date from which to list calls, in the ISO-8601 format; if not specified, the calls start with the earliest recorded call. For web-conference calls recorded by Gong, the date denotes its scheduled time, otherwise, it denotes its actual start time.
     */
    public SourceGong withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date from which to list calls, in the ISO-8601 format; if not specified, the calls start with the earliest recorded call. For web-conference calls recorded by Gong, the date denotes its scheduled time, otherwise, it denotes its actual start time.
     */
    public SourceGong withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceGong other = (SourceGong) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.accessKeySecret, other.accessKeySecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            accessKeySecret,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGong.class,
                "accessKey", accessKey,
                "accessKeySecret", accessKeySecret,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accessKey;
 
        private String accessKeySecret;
 
        private Optional<String> startDate = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Gong Access Key
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Gong Access Key Secret
         */
        public Builder accessKeySecret(String accessKeySecret) {
            Utils.checkNotNull(accessKeySecret, "accessKeySecret");
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * The date from which to list calls, in the ISO-8601 format; if not specified, the calls start with the earliest recorded call. For web-conference calls recorded by Gong, the date denotes its scheduled time, otherwise, it denotes its actual start time.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date from which to list calls, in the ISO-8601 format; if not specified, the calls start with the earliest recorded call. For web-conference calls recorded by Gong, the date denotes its scheduled time, otherwise, it denotes its actual start time.
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceGong build() {
            return new SourceGong(
                accessKey,
                accessKeySecret,
                startDate);
        }

        private static final LazySingletonValue<Gong> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"gong\"",
                        new TypeReference<Gong>() {});
    }
}
