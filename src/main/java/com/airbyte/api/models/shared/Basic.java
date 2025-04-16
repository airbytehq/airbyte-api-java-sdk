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

public class Basic {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_endpoint")
    private Optional<? extends SourceJotformSchemasApiEndpoint> apiEndpoint;

    /**
     * You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url_prefix")
    private Optional<? extends BaseURLPrefix> urlPrefix;

    @JsonCreator
    public Basic(
            @JsonProperty("url_prefix") Optional<? extends BaseURLPrefix> urlPrefix) {
        Utils.checkNotNull(urlPrefix, "urlPrefix");
        this.apiEndpoint = Builder._SINGLETON_VALUE_ApiEndpoint.value();
        this.urlPrefix = urlPrefix;
    }
    
    public Basic() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceJotformSchemasApiEndpoint> apiEndpoint() {
        return (Optional<SourceJotformSchemasApiEndpoint>) apiEndpoint;
    }

    /**
     * You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BaseURLPrefix> urlPrefix() {
        return (Optional<BaseURLPrefix>) urlPrefix;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
     */
    public Basic withUrlPrefix(BaseURLPrefix urlPrefix) {
        Utils.checkNotNull(urlPrefix, "urlPrefix");
        this.urlPrefix = Optional.ofNullable(urlPrefix);
        return this;
    }

    /**
     * You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
     */
    public Basic withUrlPrefix(Optional<? extends BaseURLPrefix> urlPrefix) {
        Utils.checkNotNull(urlPrefix, "urlPrefix");
        this.urlPrefix = urlPrefix;
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
        Basic other = (Basic) o;
        return 
            Objects.deepEquals(this.apiEndpoint, other.apiEndpoint) &&
            Objects.deepEquals(this.urlPrefix, other.urlPrefix);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiEndpoint,
            urlPrefix);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Basic.class,
                "apiEndpoint", apiEndpoint,
                "urlPrefix", urlPrefix);
    }
    
    public final static class Builder {
 
        private Optional<? extends BaseURLPrefix> urlPrefix;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
         */
        public Builder urlPrefix(BaseURLPrefix urlPrefix) {
            Utils.checkNotNull(urlPrefix, "urlPrefix");
            this.urlPrefix = Optional.ofNullable(urlPrefix);
            return this;
        }

        /**
         * You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
         */
        public Builder urlPrefix(Optional<? extends BaseURLPrefix> urlPrefix) {
            Utils.checkNotNull(urlPrefix, "urlPrefix");
            this.urlPrefix = urlPrefix;
            return this;
        }
        
        public Basic build() {
            if (urlPrefix == null) {
                urlPrefix = _SINGLETON_VALUE_UrlPrefix.value();
            }
            return new Basic(
                urlPrefix);
        }

        private static final LazySingletonValue<Optional<? extends SourceJotformSchemasApiEndpoint>> _SINGLETON_VALUE_ApiEndpoint =
                new LazySingletonValue<>(
                        "api_endpoint",
                        "\"basic\"",
                        new TypeReference<Optional<? extends SourceJotformSchemasApiEndpoint>>() {});

        private static final LazySingletonValue<Optional<? extends BaseURLPrefix>> _SINGLETON_VALUE_UrlPrefix =
                new LazySingletonValue<>(
                        "url_prefix",
                        "\"Standard\"",
                        new TypeReference<Optional<? extends BaseURLPrefix>>() {});
    }
}
