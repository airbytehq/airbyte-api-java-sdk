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


public class SourceTeamtailor {

    @JsonProperty("api")
    private String api;

    @JsonProperty("sourceType")
    private Teamtailor sourceType;

    /**
     * The version of the API
     */
    @JsonProperty("x_api_version")
    private String xApiVersion;

    @JsonCreator
    public SourceTeamtailor(
            @JsonProperty("api") String api,
            @JsonProperty("x_api_version") String xApiVersion) {
        Utils.checkNotNull(api, "api");
        Utils.checkNotNull(xApiVersion, "xApiVersion");
        this.api = api;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.xApiVersion = xApiVersion;
    }

    @JsonIgnore
    public String api() {
        return api;
    }

    @JsonIgnore
    public Teamtailor sourceType() {
        return sourceType;
    }

    /**
     * The version of the API
     */
    @JsonIgnore
    public String xApiVersion() {
        return xApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceTeamtailor withApi(String api) {
        Utils.checkNotNull(api, "api");
        this.api = api;
        return this;
    }

    /**
     * The version of the API
     */
    public SourceTeamtailor withXApiVersion(String xApiVersion) {
        Utils.checkNotNull(xApiVersion, "xApiVersion");
        this.xApiVersion = xApiVersion;
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
        SourceTeamtailor other = (SourceTeamtailor) o;
        return 
            Objects.deepEquals(this.api, other.api) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.xApiVersion, other.xApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            api,
            sourceType,
            xApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTeamtailor.class,
                "api", api,
                "sourceType", sourceType,
                "xApiVersion", xApiVersion);
    }
    
    public final static class Builder {
 
        private String api;
 
        private String xApiVersion;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder api(String api) {
            Utils.checkNotNull(api, "api");
            this.api = api;
            return this;
        }

        /**
         * The version of the API
         */
        public Builder xApiVersion(String xApiVersion) {
            Utils.checkNotNull(xApiVersion, "xApiVersion");
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        public SourceTeamtailor build() {
            return new SourceTeamtailor(
                api,
                xApiVersion);
        }

        private static final LazySingletonValue<Teamtailor> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"teamtailor\"",
                        new TypeReference<Teamtailor>() {});
    }
}
