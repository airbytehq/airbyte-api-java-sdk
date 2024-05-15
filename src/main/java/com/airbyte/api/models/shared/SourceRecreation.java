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


public class SourceRecreation {

    /**
     * API Key
     */
    @JsonProperty("apikey")
    private String apikey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_campsites")
    private Optional<? extends String> queryCampsites;

    @JsonProperty("sourceType")
    private Recreation sourceType;

    @JsonCreator
    public SourceRecreation(
            @JsonProperty("apikey") String apikey,
            @JsonProperty("query_campsites") Optional<? extends String> queryCampsites) {
        Utils.checkNotNull(apikey, "apikey");
        Utils.checkNotNull(queryCampsites, "queryCampsites");
        this.apikey = apikey;
        this.queryCampsites = queryCampsites;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceRecreation(
            String apikey) {
        this(apikey, Optional.empty());
    }

    /**
     * API Key
     */
    @JsonIgnore
    public String apikey() {
        return apikey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> queryCampsites() {
        return (Optional<String>) queryCampsites;
    }

    @JsonIgnore
    public Recreation sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Key
     */
    public SourceRecreation withApikey(String apikey) {
        Utils.checkNotNull(apikey, "apikey");
        this.apikey = apikey;
        return this;
    }

    public SourceRecreation withQueryCampsites(String queryCampsites) {
        Utils.checkNotNull(queryCampsites, "queryCampsites");
        this.queryCampsites = Optional.ofNullable(queryCampsites);
        return this;
    }

    public SourceRecreation withQueryCampsites(Optional<? extends String> queryCampsites) {
        Utils.checkNotNull(queryCampsites, "queryCampsites");
        this.queryCampsites = queryCampsites;
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
        SourceRecreation other = (SourceRecreation) o;
        return 
            java.util.Objects.deepEquals(this.apikey, other.apikey) &&
            java.util.Objects.deepEquals(this.queryCampsites, other.queryCampsites) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apikey,
            queryCampsites,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRecreation.class,
                "apikey", apikey,
                "queryCampsites", queryCampsites,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apikey;
 
        private Optional<? extends String> queryCampsites = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key
         */
        public Builder apikey(String apikey) {
            Utils.checkNotNull(apikey, "apikey");
            this.apikey = apikey;
            return this;
        }

        public Builder queryCampsites(String queryCampsites) {
            Utils.checkNotNull(queryCampsites, "queryCampsites");
            this.queryCampsites = Optional.ofNullable(queryCampsites);
            return this;
        }

        public Builder queryCampsites(Optional<? extends String> queryCampsites) {
            Utils.checkNotNull(queryCampsites, "queryCampsites");
            this.queryCampsites = queryCampsites;
            return this;
        }
        
        public SourceRecreation build() {
            return new SourceRecreation(
                apikey,
                queryCampsites);
        }

        private static final LazySingletonValue<Recreation> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"recreation\"",
                        new TypeReference<Recreation>() {});
    }
}
