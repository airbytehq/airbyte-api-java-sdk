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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SourceZapsign {

    /**
     * Your static API token for authentication. You can find it in your ZapSign account under the 'Settings' or 'API' section. For more details, refer to the [Getting Started](https://docs.zapsign.com.br/english/getting-started#how-do-i-get-my-api-token) guide.
     */
    @JsonProperty("api_token")
    private String apiToken;

    /**
     * The signer ids for signer stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signer_ids")
    private Optional<? extends List<Object>> signerIds;

    @JsonProperty("sourceType")
    private Zapsign sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceZapsign(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("signer_ids") Optional<? extends List<Object>> signerIds,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(signerIds, "signerIds");
        Utils.checkNotNull(startDate, "startDate");
        this.apiToken = apiToken;
        this.signerIds = signerIds;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceZapsign(
            String apiToken,
            OffsetDateTime startDate) {
        this(apiToken, Optional.empty(), startDate);
    }

    /**
     * Your static API token for authentication. You can find it in your ZapSign account under the 'Settings' or 'API' section. For more details, refer to the [Getting Started](https://docs.zapsign.com.br/english/getting-started#how-do-i-get-my-api-token) guide.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    /**
     * The signer ids for signer stream
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> signerIds() {
        return (Optional<List<Object>>) signerIds;
    }

    @JsonIgnore
    public Zapsign sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your static API token for authentication. You can find it in your ZapSign account under the 'Settings' or 'API' section. For more details, refer to the [Getting Started](https://docs.zapsign.com.br/english/getting-started#how-do-i-get-my-api-token) guide.
     */
    public SourceZapsign withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * The signer ids for signer stream
     */
    public SourceZapsign withSignerIds(List<Object> signerIds) {
        Utils.checkNotNull(signerIds, "signerIds");
        this.signerIds = Optional.ofNullable(signerIds);
        return this;
    }

    /**
     * The signer ids for signer stream
     */
    public SourceZapsign withSignerIds(Optional<? extends List<Object>> signerIds) {
        Utils.checkNotNull(signerIds, "signerIds");
        this.signerIds = signerIds;
        return this;
    }

    public SourceZapsign withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceZapsign other = (SourceZapsign) o;
        return 
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.signerIds, other.signerIds) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiToken,
            signerIds,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZapsign.class,
                "apiToken", apiToken,
                "signerIds", signerIds,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private Optional<? extends List<Object>> signerIds = Optional.empty();
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your static API token for authentication. You can find it in your ZapSign account under the 'Settings' or 'API' section. For more details, refer to the [Getting Started](https://docs.zapsign.com.br/english/getting-started#how-do-i-get-my-api-token) guide.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * The signer ids for signer stream
         */
        public Builder signerIds(List<Object> signerIds) {
            Utils.checkNotNull(signerIds, "signerIds");
            this.signerIds = Optional.ofNullable(signerIds);
            return this;
        }

        /**
         * The signer ids for signer stream
         */
        public Builder signerIds(Optional<? extends List<Object>> signerIds) {
            Utils.checkNotNull(signerIds, "signerIds");
            this.signerIds = signerIds;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceZapsign build() {
            return new SourceZapsign(
                apiToken,
                signerIds,
                startDate);
        }

        private static final LazySingletonValue<Zapsign> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zapsign\"",
                        new TypeReference<Zapsign>() {});
    }
}
