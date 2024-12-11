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


public class SourceBrex {

    @JsonProperty("sourceType")
    private Brex sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * User token to authenticate API requests. Generate it from your Brex dashboard under Developer &gt; Settings.
     */
    @JsonProperty("user_token")
    private String userToken;

    @JsonCreator
    public SourceBrex(
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("user_token") String userToken) {
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(userToken, "userToken");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.userToken = userToken;
    }

    @JsonIgnore
    public Brex sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * User token to authenticate API requests. Generate it from your Brex dashboard under Developer &gt; Settings.
     */
    @JsonIgnore
    public String userToken() {
        return userToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceBrex withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * User token to authenticate API requests. Generate it from your Brex dashboard under Developer &gt; Settings.
     */
    public SourceBrex withUserToken(String userToken) {
        Utils.checkNotNull(userToken, "userToken");
        this.userToken = userToken;
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
        SourceBrex other = (SourceBrex) o;
        return 
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.userToken, other.userToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceType,
            startDate,
            userToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceBrex.class,
                "sourceType", sourceType,
                "startDate", startDate,
                "userToken", userToken);
    }
    
    public final static class Builder {
 
        private OffsetDateTime startDate;
 
        private String userToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * User token to authenticate API requests. Generate it from your Brex dashboard under Developer &gt; Settings.
         */
        public Builder userToken(String userToken) {
            Utils.checkNotNull(userToken, "userToken");
            this.userToken = userToken;
            return this;
        }
        
        public SourceBrex build() {
            return new SourceBrex(
                startDate,
                userToken);
        }

        private static final LazySingletonValue<Brex> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"brex\"",
                        new TypeReference<Brex>() {});
    }
}

