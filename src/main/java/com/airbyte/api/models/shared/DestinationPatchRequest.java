/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class DestinationPatchRequest {

    /**
     * The values required to configure the destination.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("configuration")
    private Optional<? extends DestinationConfiguration> configuration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    public DestinationPatchRequest(
            @JsonProperty("configuration") Optional<? extends DestinationConfiguration> configuration,
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(name, "name");
        this.configuration = configuration;
        this.name = name;
    }

    /**
     * The values required to configure the destination.
     */
    public Optional<? extends DestinationConfiguration> configuration() {
        return configuration;
    }

    public Optional<? extends String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The values required to configure the destination.
     */
    public DestinationPatchRequest withConfiguration(DestinationConfiguration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = Optional.ofNullable(configuration);
        return this;
    }

    /**
     * The values required to configure the destination.
     */
    public DestinationPatchRequest withConfiguration(Optional<? extends DestinationConfiguration> configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    public DestinationPatchRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public DestinationPatchRequest withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        DestinationPatchRequest other = (DestinationPatchRequest) o;
        return 
            java.util.Objects.deepEquals(this.configuration, other.configuration) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            configuration,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPatchRequest.class,
                "configuration", configuration,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationConfiguration> configuration = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The values required to configure the destination.
         */
        public Builder configuration(DestinationConfiguration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = Optional.ofNullable(configuration);
            return this;
        }

        /**
         * The values required to configure the destination.
         */
        public Builder configuration(Optional<? extends DestinationConfiguration> configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public DestinationPatchRequest build() {
            return new DestinationPatchRequest(
                configuration,
                name);
        }
    }
}

