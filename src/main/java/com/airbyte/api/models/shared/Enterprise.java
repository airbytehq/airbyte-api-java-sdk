/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class Enterprise {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_endpoint")
    private Optional<? extends SourceJotformApiEndpoint> apiEndpoint;

    /**
     * Upgrade to Enterprise to make your API url your-domain.com/API or subdomain.jotform.com/API instead of api.jotform.com
     */
    @JsonProperty("enterprise_url")
    private String enterpriseUrl;

    @JsonCreator
    public Enterprise(
            @JsonProperty("enterprise_url") String enterpriseUrl) {
        Utils.checkNotNull(enterpriseUrl, "enterpriseUrl");
        this.apiEndpoint = Builder._SINGLETON_VALUE_ApiEndpoint.value();
        this.enterpriseUrl = enterpriseUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceJotformApiEndpoint> apiEndpoint() {
        return (Optional<SourceJotformApiEndpoint>) apiEndpoint;
    }

    /**
     * Upgrade to Enterprise to make your API url your-domain.com/API or subdomain.jotform.com/API instead of api.jotform.com
     */
    @JsonIgnore
    public String enterpriseUrl() {
        return enterpriseUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Upgrade to Enterprise to make your API url your-domain.com/API or subdomain.jotform.com/API instead of api.jotform.com
     */
    public Enterprise withEnterpriseUrl(String enterpriseUrl) {
        Utils.checkNotNull(enterpriseUrl, "enterpriseUrl");
        this.enterpriseUrl = enterpriseUrl;
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
        Enterprise other = (Enterprise) o;
        return 
            Objects.deepEquals(this.apiEndpoint, other.apiEndpoint) &&
            Objects.deepEquals(this.enterpriseUrl, other.enterpriseUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiEndpoint,
            enterpriseUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Enterprise.class,
                "apiEndpoint", apiEndpoint,
                "enterpriseUrl", enterpriseUrl);
    }
    
    public final static class Builder {
 
        private String enterpriseUrl;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Upgrade to Enterprise to make your API url your-domain.com/API or subdomain.jotform.com/API instead of api.jotform.com
         */
        public Builder enterpriseUrl(String enterpriseUrl) {
            Utils.checkNotNull(enterpriseUrl, "enterpriseUrl");
            this.enterpriseUrl = enterpriseUrl;
            return this;
        }
        
        public Enterprise build() {
            return new Enterprise(
                enterpriseUrl);
        }

        private static final LazySingletonValue<Optional<? extends SourceJotformApiEndpoint>> _SINGLETON_VALUE_ApiEndpoint =
                new LazySingletonValue<>(
                        "api_endpoint",
                        "\"enterprise\"",
                        new TypeReference<Optional<? extends SourceJotformApiEndpoint>>() {});
    }
}
