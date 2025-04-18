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

public class DestinationOracleNoTunnel {

    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")
    private DestinationOracleTunnelMethod tunnelMethod;

    @JsonCreator
    public DestinationOracleNoTunnel() {
        
        this.tunnelMethod = Builder._SINGLETON_VALUE_TunnelMethod.value();
    }

    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonIgnore
    public DestinationOracleTunnelMethod tunnelMethod() {
        return tunnelMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationOracleNoTunnel other = (DestinationOracleNoTunnel) o;
        return 
            Objects.deepEquals(this.tunnelMethod, other.tunnelMethod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            tunnelMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationOracleNoTunnel.class,
                "tunnelMethod", tunnelMethod);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public DestinationOracleNoTunnel build() {
            return new DestinationOracleNoTunnel(
                );
        }

        private static final LazySingletonValue<DestinationOracleTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"NO_TUNNEL\"",
                        new TypeReference<DestinationOracleTunnelMethod>() {});
    }
}
