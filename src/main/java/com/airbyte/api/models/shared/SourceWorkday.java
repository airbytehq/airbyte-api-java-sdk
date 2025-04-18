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

public class SourceWorkday {

    /**
     * Report Based Streams and REST API Streams use different methods of Authentication. Choose streams type you want to sync and provide needed credentials for them.
     */
    @JsonProperty("credentials")
    private SourceWorkdayAuthentication credentials;

    @JsonProperty("host")
    private String host;

    @JsonProperty("sourceType")
    private Workday sourceType;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonCreator
    public SourceWorkday(
            @JsonProperty("credentials") SourceWorkdayAuthentication credentials,
            @JsonProperty("host") String host,
            @JsonProperty("tenant_id") String tenantId) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(tenantId, "tenantId");
        this.credentials = credentials;
        this.host = host;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.tenantId = tenantId;
    }

    /**
     * Report Based Streams and REST API Streams use different methods of Authentication. Choose streams type you want to sync and provide needed credentials for them.
     */
    @JsonIgnore
    public SourceWorkdayAuthentication credentials() {
        return credentials;
    }

    @JsonIgnore
    public String host() {
        return host;
    }

    @JsonIgnore
    public Workday sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public String tenantId() {
        return tenantId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Report Based Streams and REST API Streams use different methods of Authentication. Choose streams type you want to sync and provide needed credentials for them.
     */
    public SourceWorkday withCredentials(SourceWorkdayAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    public SourceWorkday withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public SourceWorkday withTenantId(String tenantId) {
        Utils.checkNotNull(tenantId, "tenantId");
        this.tenantId = tenantId;
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
        SourceWorkday other = (SourceWorkday) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.tenantId, other.tenantId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            host,
            sourceType,
            tenantId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceWorkday.class,
                "credentials", credentials,
                "host", host,
                "sourceType", sourceType,
                "tenantId", tenantId);
    }
    
    public final static class Builder {
 
        private SourceWorkdayAuthentication credentials;
 
        private String host;
 
        private String tenantId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Report Based Streams and REST API Streams use different methods of Authentication. Choose streams type you want to sync and provide needed credentials for them.
         */
        public Builder credentials(SourceWorkdayAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }
        
        public SourceWorkday build() {
            return new SourceWorkday(
                credentials,
                host,
                tenantId);
        }

        private static final LazySingletonValue<Workday> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"workday\"",
                        new TypeReference<Workday>() {});
    }
}
