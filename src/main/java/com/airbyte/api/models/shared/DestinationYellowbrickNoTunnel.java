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

public class DestinationYellowbrickNoTunnel {

    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")
    private DestinationYellowbrickTunnelMethod tunnelMethod;

    @JsonCreator
    public DestinationYellowbrickNoTunnel() {
        
        this.tunnelMethod = Builder._SINGLETON_VALUE_TunnelMethod.value();
    }

    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonIgnore
    public DestinationYellowbrickTunnelMethod tunnelMethod() {
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
        DestinationYellowbrickNoTunnel other = (DestinationYellowbrickNoTunnel) o;
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
        return Utils.toString(DestinationYellowbrickNoTunnel.class,
                "tunnelMethod", tunnelMethod);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public DestinationYellowbrickNoTunnel build() {
            return new DestinationYellowbrickNoTunnel(
                );
        }

        private static final LazySingletonValue<DestinationYellowbrickTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"NO_TUNNEL\"",
                        new TypeReference<DestinationYellowbrickTunnelMethod>() {});
    }
}
