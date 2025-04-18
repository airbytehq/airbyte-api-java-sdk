/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

public class SourceEasypost {

    @JsonProperty("sourceType")
    private Easypost sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * The API Key from your easypost settings
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceEasypost(
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(username, "username");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.username = username;
    }

    @JsonIgnore
    public Easypost sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * The API Key from your easypost settings
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceEasypost withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The API Key from your easypost settings
     */
    public SourceEasypost withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        SourceEasypost other = (SourceEasypost) o;
        return 
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceType,
            startDate,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceEasypost.class,
                "sourceType", sourceType,
                "startDate", startDate,
                "username", username);
    }
    
    public final static class Builder {
 
        private OffsetDateTime startDate;
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The API Key from your easypost settings
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceEasypost build() {
            return new SourceEasypost(
                startDate,
                username);
        }

        private static final LazySingletonValue<Easypost> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"easypost\"",
                        new TypeReference<Easypost>() {});
    }
}
