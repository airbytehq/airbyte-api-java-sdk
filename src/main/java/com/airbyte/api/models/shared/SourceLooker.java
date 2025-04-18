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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SourceLooker {

    /**
     * The Client ID is first part of an API3 key that is specific to each Looker user. See the &lt;a href="https://docs.airbyte.com/integrations/sources/looker"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret is second part of an API3 key.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Domain for your Looker account, e.g. airbyte.cloud.looker.com,looker.[clientname].com,IP address
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * The IDs of any Looks to run
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("run_look_ids")
    private Optional<? extends List<String>> runLookIds;

    @JsonProperty("sourceType")
    private Looker sourceType;

    @JsonCreator
    public SourceLooker(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("domain") String domain,
            @JsonProperty("run_look_ids") Optional<? extends List<String>> runLookIds) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(runLookIds, "runLookIds");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.domain = domain;
        this.runLookIds = runLookIds;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceLooker(
            String clientId,
            String clientSecret,
            String domain) {
        this(clientId, clientSecret, domain, Optional.empty());
    }

    /**
     * The Client ID is first part of an API3 key that is specific to each Looker user. See the &lt;a href="https://docs.airbyte.com/integrations/sources/looker"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret is second part of an API3 key.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Domain for your Looker account, e.g. airbyte.cloud.looker.com,looker.[clientname].com,IP address
     */
    @JsonIgnore
    public String domain() {
        return domain;
    }

    /**
     * The IDs of any Looks to run
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> runLookIds() {
        return (Optional<List<String>>) runLookIds;
    }

    @JsonIgnore
    public Looker sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The Client ID is first part of an API3 key that is specific to each Looker user. See the &lt;a href="https://docs.airbyte.com/integrations/sources/looker"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    public SourceLooker withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret is second part of an API3 key.
     */
    public SourceLooker withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Domain for your Looker account, e.g. airbyte.cloud.looker.com,looker.[clientname].com,IP address
     */
    public SourceLooker withDomain(String domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    /**
     * The IDs of any Looks to run
     */
    public SourceLooker withRunLookIds(List<String> runLookIds) {
        Utils.checkNotNull(runLookIds, "runLookIds");
        this.runLookIds = Optional.ofNullable(runLookIds);
        return this;
    }

    /**
     * The IDs of any Looks to run
     */
    public SourceLooker withRunLookIds(Optional<? extends List<String>> runLookIds) {
        Utils.checkNotNull(runLookIds, "runLookIds");
        this.runLookIds = runLookIds;
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
        SourceLooker other = (SourceLooker) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.domain, other.domain) &&
            Objects.deepEquals(this.runLookIds, other.runLookIds) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret,
            domain,
            runLookIds,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLooker.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "domain", domain,
                "runLookIds", runLookIds,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private String domain;
 
        private Optional<? extends List<String>> runLookIds = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID is first part of an API3 key that is specific to each Looker user. See the &lt;a href="https://docs.airbyte.com/integrations/sources/looker"&gt;docs&lt;/a&gt; for more information on how to generate this key.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret is second part of an API3 key.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Domain for your Looker account, e.g. airbyte.cloud.looker.com,looker.[clientname].com,IP address
         */
        public Builder domain(String domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        /**
         * The IDs of any Looks to run
         */
        public Builder runLookIds(List<String> runLookIds) {
            Utils.checkNotNull(runLookIds, "runLookIds");
            this.runLookIds = Optional.ofNullable(runLookIds);
            return this;
        }

        /**
         * The IDs of any Looks to run
         */
        public Builder runLookIds(Optional<? extends List<String>> runLookIds) {
            Utils.checkNotNull(runLookIds, "runLookIds");
            this.runLookIds = runLookIds;
            return this;
        }
        
        public SourceLooker build() {
            return new SourceLooker(
                clientId,
                clientSecret,
                domain,
                runLookIds);
        }

        private static final LazySingletonValue<Looker> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"looker\"",
                        new TypeReference<Looker>() {});
    }
}
