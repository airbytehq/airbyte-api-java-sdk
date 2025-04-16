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
import java.time.OffsetDateTime;
import java.util.Objects;

public class SourceUservoice {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Uservoice sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonProperty("subdomain")
    private String subdomain;

    @JsonCreator
    public SourceUservoice(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("subdomain") String subdomain) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(subdomain, "subdomain");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.subdomain = subdomain;
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Uservoice sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    @JsonIgnore
    public String subdomain() {
        return subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceUservoice withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceUservoice withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourceUservoice withSubdomain(String subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = subdomain;
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
        SourceUservoice other = (SourceUservoice) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            startDate,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceUservoice.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "startDate", startDate,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private OffsetDateTime startDate;
 
        private String subdomain;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceUservoice build() {
            return new SourceUservoice(
                apiKey,
                startDate,
                subdomain);
        }

        private static final LazySingletonValue<Uservoice> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"uservoice\"",
                        new TypeReference<Uservoice>() {});
    }
}
