/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class DestinationMssqlNoTunnel {

    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")
    private DestinationMssqlTunnelMethod tunnelMethod;

    public DestinationMssqlNoTunnel() {
        
        this.tunnelMethod = Builder._SINGLETON_VALUE_TunnelMethod.value();
    }

    /**
     * No ssh tunnel needed to connect to database
     */
    public DestinationMssqlTunnelMethod tunnelMethod() {
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
        DestinationMssqlNoTunnel other = (DestinationMssqlNoTunnel) o;
        return 
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            tunnelMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMssqlNoTunnel.class,
                "tunnelMethod", tunnelMethod);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public DestinationMssqlNoTunnel build() {
            return new DestinationMssqlNoTunnel(
                );
        }

        private static final LazySingletonValue<DestinationMssqlTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"NO_TUNNEL\"",
                        new TypeReference<DestinationMssqlTunnelMethod>() {});
    }
}

