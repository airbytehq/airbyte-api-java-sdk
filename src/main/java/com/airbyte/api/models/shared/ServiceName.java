/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
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
 * ServiceName - Use service name
 */

public class ServiceName {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_type")
    private Optional<? extends ConnectionType> connectionType;

    @JsonProperty("service_name")
    private String serviceName;

    @JsonCreator
    public ServiceName(
            @JsonProperty("service_name") String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.connectionType = Builder._SINGLETON_VALUE_ConnectionType.value();
        this.serviceName = serviceName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectionType> connectionType() {
        return (Optional<ConnectionType>) connectionType;
    }

    @JsonIgnore
    public String serviceName() {
        return serviceName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ServiceName withServiceName(String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.serviceName = serviceName;
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
        ServiceName other = (ServiceName) o;
        return 
            java.util.Objects.deepEquals(this.connectionType, other.connectionType) &&
            java.util.Objects.deepEquals(this.serviceName, other.serviceName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectionType,
            serviceName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceName.class,
                "connectionType", connectionType,
                "serviceName", serviceName);
    }
    
    public final static class Builder {
 
        private String serviceName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder serviceName(String serviceName) {
            Utils.checkNotNull(serviceName, "serviceName");
            this.serviceName = serviceName;
            return this;
        }
        
        public ServiceName build() {
            return new ServiceName(
                serviceName);
        }

        private static final LazySingletonValue<Optional<? extends ConnectionType>> _SINGLETON_VALUE_ConnectionType =
                new LazySingletonValue<>(
                        "connection_type",
                        "\"service_name\"",
                        new TypeReference<Optional<? extends ConnectionType>>() {});
    }
}

