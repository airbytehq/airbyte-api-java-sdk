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
import java.util.Objects;

public class SourceZonkaFeedback {

    /**
     * Auth token to use. Generate it by navigating to Company Settings &gt; Developers &gt; API in your Zonka Feedback account.
     */
    @JsonProperty("auth_token")
    private String authToken;

    /**
     * The identifier for the data center, such as 'us1' or 'e' for EU.
     */
    @JsonProperty("datacenter")
    private DataCenterID datacenter;

    @JsonProperty("sourceType")
    private ZonkaFeedback sourceType;

    @JsonCreator
    public SourceZonkaFeedback(
            @JsonProperty("auth_token") String authToken,
            @JsonProperty("datacenter") DataCenterID datacenter) {
        Utils.checkNotNull(authToken, "authToken");
        Utils.checkNotNull(datacenter, "datacenter");
        this.authToken = authToken;
        this.datacenter = datacenter;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Auth token to use. Generate it by navigating to Company Settings &gt; Developers &gt; API in your Zonka Feedback account.
     */
    @JsonIgnore
    public String authToken() {
        return authToken;
    }

    /**
     * The identifier for the data center, such as 'us1' or 'e' for EU.
     */
    @JsonIgnore
    public DataCenterID datacenter() {
        return datacenter;
    }

    @JsonIgnore
    public ZonkaFeedback sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Auth token to use. Generate it by navigating to Company Settings &gt; Developers &gt; API in your Zonka Feedback account.
     */
    public SourceZonkaFeedback withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
        return this;
    }

    /**
     * The identifier for the data center, such as 'us1' or 'e' for EU.
     */
    public SourceZonkaFeedback withDatacenter(DataCenterID datacenter) {
        Utils.checkNotNull(datacenter, "datacenter");
        this.datacenter = datacenter;
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
        SourceZonkaFeedback other = (SourceZonkaFeedback) o;
        return 
            Objects.deepEquals(this.authToken, other.authToken) &&
            Objects.deepEquals(this.datacenter, other.datacenter) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authToken,
            datacenter,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZonkaFeedback.class,
                "authToken", authToken,
                "datacenter", datacenter,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String authToken;
 
        private DataCenterID datacenter;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Auth token to use. Generate it by navigating to Company Settings &gt; Developers &gt; API in your Zonka Feedback account.
         */
        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }

        /**
         * The identifier for the data center, such as 'us1' or 'e' for EU.
         */
        public Builder datacenter(DataCenterID datacenter) {
            Utils.checkNotNull(datacenter, "datacenter");
            this.datacenter = datacenter;
            return this;
        }
        
        public SourceZonkaFeedback build() {
            return new SourceZonkaFeedback(
                authToken,
                datacenter);
        }

        private static final LazySingletonValue<ZonkaFeedback> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zonka-feedback\"",
                        new TypeReference<ZonkaFeedback>() {});
    }
}
