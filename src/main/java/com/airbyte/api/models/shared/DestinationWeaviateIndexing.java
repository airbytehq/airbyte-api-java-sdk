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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationWeaviateIndexing
 * 
 * <p>Indexing configuration
 */
public class DestinationWeaviateIndexing {

    /**
     * Additional HTTP headers to send with every request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_headers")
    private Optional<? extends List<Header>> additionalHeaders;

    /**
     * Authentication method
     */
    @JsonProperty("auth")
    private DestinationWeaviateAuthentication auth;

    /**
     * The number of records to send to Weaviate in each batch
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    private Optional<Long> batchSize;

    /**
     * The vectorizer to use if new classes need to be created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_vectorizer")
    private Optional<? extends DefaultVectorizer> defaultVectorizer;

    /**
     * The public endpoint of the Weaviate cluster.
     */
    @JsonProperty("host")
    private String host;

    /**
     * The tenant ID to use for multi tenancy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tenant_id")
    private Optional<String> tenantId;

    /**
     * The field in the object that contains the embedded text
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_field")
    private Optional<String> textField;

    @JsonCreator
    public DestinationWeaviateIndexing(
            @JsonProperty("additional_headers") Optional<? extends List<Header>> additionalHeaders,
            @JsonProperty("auth") DestinationWeaviateAuthentication auth,
            @JsonProperty("batch_size") Optional<Long> batchSize,
            @JsonProperty("default_vectorizer") Optional<? extends DefaultVectorizer> defaultVectorizer,
            @JsonProperty("host") String host,
            @JsonProperty("tenant_id") Optional<String> tenantId,
            @JsonProperty("text_field") Optional<String> textField) {
        Utils.checkNotNull(additionalHeaders, "additionalHeaders");
        Utils.checkNotNull(auth, "auth");
        Utils.checkNotNull(batchSize, "batchSize");
        Utils.checkNotNull(defaultVectorizer, "defaultVectorizer");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(tenantId, "tenantId");
        Utils.checkNotNull(textField, "textField");
        this.additionalHeaders = additionalHeaders;
        this.auth = auth;
        this.batchSize = batchSize;
        this.defaultVectorizer = defaultVectorizer;
        this.host = host;
        this.tenantId = tenantId;
        this.textField = textField;
    }
    
    public DestinationWeaviateIndexing(
            DestinationWeaviateAuthentication auth,
            String host) {
        this(Optional.empty(), auth, Optional.empty(), Optional.empty(), host, Optional.empty(), Optional.empty());
    }

    /**
     * Additional HTTP headers to send with every request.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Header>> additionalHeaders() {
        return (Optional<List<Header>>) additionalHeaders;
    }

    /**
     * Authentication method
     */
    @JsonIgnore
    public DestinationWeaviateAuthentication auth() {
        return auth;
    }

    /**
     * The number of records to send to Weaviate in each batch
     */
    @JsonIgnore
    public Optional<Long> batchSize() {
        return batchSize;
    }

    /**
     * The vectorizer to use if new classes need to be created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DefaultVectorizer> defaultVectorizer() {
        return (Optional<DefaultVectorizer>) defaultVectorizer;
    }

    /**
     * The public endpoint of the Weaviate cluster.
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * The tenant ID to use for multi tenancy
     */
    @JsonIgnore
    public Optional<String> tenantId() {
        return tenantId;
    }

    /**
     * The field in the object that contains the embedded text
     */
    @JsonIgnore
    public Optional<String> textField() {
        return textField;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Additional HTTP headers to send with every request.
     */
    public DestinationWeaviateIndexing withAdditionalHeaders(List<Header> additionalHeaders) {
        Utils.checkNotNull(additionalHeaders, "additionalHeaders");
        this.additionalHeaders = Optional.ofNullable(additionalHeaders);
        return this;
    }

    /**
     * Additional HTTP headers to send with every request.
     */
    public DestinationWeaviateIndexing withAdditionalHeaders(Optional<? extends List<Header>> additionalHeaders) {
        Utils.checkNotNull(additionalHeaders, "additionalHeaders");
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Authentication method
     */
    public DestinationWeaviateIndexing withAuth(DestinationWeaviateAuthentication auth) {
        Utils.checkNotNull(auth, "auth");
        this.auth = auth;
        return this;
    }

    /**
     * The number of records to send to Weaviate in each batch
     */
    public DestinationWeaviateIndexing withBatchSize(long batchSize) {
        Utils.checkNotNull(batchSize, "batchSize");
        this.batchSize = Optional.ofNullable(batchSize);
        return this;
    }

    /**
     * The number of records to send to Weaviate in each batch
     */
    public DestinationWeaviateIndexing withBatchSize(Optional<Long> batchSize) {
        Utils.checkNotNull(batchSize, "batchSize");
        this.batchSize = batchSize;
        return this;
    }

    /**
     * The vectorizer to use if new classes need to be created
     */
    public DestinationWeaviateIndexing withDefaultVectorizer(DefaultVectorizer defaultVectorizer) {
        Utils.checkNotNull(defaultVectorizer, "defaultVectorizer");
        this.defaultVectorizer = Optional.ofNullable(defaultVectorizer);
        return this;
    }

    /**
     * The vectorizer to use if new classes need to be created
     */
    public DestinationWeaviateIndexing withDefaultVectorizer(Optional<? extends DefaultVectorizer> defaultVectorizer) {
        Utils.checkNotNull(defaultVectorizer, "defaultVectorizer");
        this.defaultVectorizer = defaultVectorizer;
        return this;
    }

    /**
     * The public endpoint of the Weaviate cluster.
     */
    public DestinationWeaviateIndexing withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * The tenant ID to use for multi tenancy
     */
    public DestinationWeaviateIndexing withTenantId(String tenantId) {
        Utils.checkNotNull(tenantId, "tenantId");
        this.tenantId = Optional.ofNullable(tenantId);
        return this;
    }

    /**
     * The tenant ID to use for multi tenancy
     */
    public DestinationWeaviateIndexing withTenantId(Optional<String> tenantId) {
        Utils.checkNotNull(tenantId, "tenantId");
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The field in the object that contains the embedded text
     */
    public DestinationWeaviateIndexing withTextField(String textField) {
        Utils.checkNotNull(textField, "textField");
        this.textField = Optional.ofNullable(textField);
        return this;
    }

    /**
     * The field in the object that contains the embedded text
     */
    public DestinationWeaviateIndexing withTextField(Optional<String> textField) {
        Utils.checkNotNull(textField, "textField");
        this.textField = textField;
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
        DestinationWeaviateIndexing other = (DestinationWeaviateIndexing) o;
        return 
            Objects.deepEquals(this.additionalHeaders, other.additionalHeaders) &&
            Objects.deepEquals(this.auth, other.auth) &&
            Objects.deepEquals(this.batchSize, other.batchSize) &&
            Objects.deepEquals(this.defaultVectorizer, other.defaultVectorizer) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.tenantId, other.tenantId) &&
            Objects.deepEquals(this.textField, other.textField);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalHeaders,
            auth,
            batchSize,
            defaultVectorizer,
            host,
            tenantId,
            textField);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationWeaviateIndexing.class,
                "additionalHeaders", additionalHeaders,
                "auth", auth,
                "batchSize", batchSize,
                "defaultVectorizer", defaultVectorizer,
                "host", host,
                "tenantId", tenantId,
                "textField", textField);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Header>> additionalHeaders = Optional.empty();
 
        private DestinationWeaviateAuthentication auth;
 
        private Optional<Long> batchSize;
 
        private Optional<? extends DefaultVectorizer> defaultVectorizer;
 
        private String host;
 
        private Optional<String> tenantId;
 
        private Optional<String> textField;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Additional HTTP headers to send with every request.
         */
        public Builder additionalHeaders(List<Header> additionalHeaders) {
            Utils.checkNotNull(additionalHeaders, "additionalHeaders");
            this.additionalHeaders = Optional.ofNullable(additionalHeaders);
            return this;
        }

        /**
         * Additional HTTP headers to send with every request.
         */
        public Builder additionalHeaders(Optional<? extends List<Header>> additionalHeaders) {
            Utils.checkNotNull(additionalHeaders, "additionalHeaders");
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        /**
         * Authentication method
         */
        public Builder auth(DestinationWeaviateAuthentication auth) {
            Utils.checkNotNull(auth, "auth");
            this.auth = auth;
            return this;
        }

        /**
         * The number of records to send to Weaviate in each batch
         */
        public Builder batchSize(long batchSize) {
            Utils.checkNotNull(batchSize, "batchSize");
            this.batchSize = Optional.ofNullable(batchSize);
            return this;
        }

        /**
         * The number of records to send to Weaviate in each batch
         */
        public Builder batchSize(Optional<Long> batchSize) {
            Utils.checkNotNull(batchSize, "batchSize");
            this.batchSize = batchSize;
            return this;
        }

        /**
         * The vectorizer to use if new classes need to be created
         */
        public Builder defaultVectorizer(DefaultVectorizer defaultVectorizer) {
            Utils.checkNotNull(defaultVectorizer, "defaultVectorizer");
            this.defaultVectorizer = Optional.ofNullable(defaultVectorizer);
            return this;
        }

        /**
         * The vectorizer to use if new classes need to be created
         */
        public Builder defaultVectorizer(Optional<? extends DefaultVectorizer> defaultVectorizer) {
            Utils.checkNotNull(defaultVectorizer, "defaultVectorizer");
            this.defaultVectorizer = defaultVectorizer;
            return this;
        }

        /**
         * The public endpoint of the Weaviate cluster.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * The tenant ID to use for multi tenancy
         */
        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = Optional.ofNullable(tenantId);
            return this;
        }

        /**
         * The tenant ID to use for multi tenancy
         */
        public Builder tenantId(Optional<String> tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The field in the object that contains the embedded text
         */
        public Builder textField(String textField) {
            Utils.checkNotNull(textField, "textField");
            this.textField = Optional.ofNullable(textField);
            return this;
        }

        /**
         * The field in the object that contains the embedded text
         */
        public Builder textField(Optional<String> textField) {
            Utils.checkNotNull(textField, "textField");
            this.textField = textField;
            return this;
        }
        
        public DestinationWeaviateIndexing build() {
            if (batchSize == null) {
                batchSize = _SINGLETON_VALUE_BatchSize.value();
            }
            if (defaultVectorizer == null) {
                defaultVectorizer = _SINGLETON_VALUE_DefaultVectorizer.value();
            }
            if (tenantId == null) {
                tenantId = _SINGLETON_VALUE_TenantId.value();
            }
            if (textField == null) {
                textField = _SINGLETON_VALUE_TextField.value();
            }
            return new DestinationWeaviateIndexing(
                additionalHeaders,
                auth,
                batchSize,
                defaultVectorizer,
                host,
                tenantId,
                textField);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_BatchSize =
                new LazySingletonValue<>(
                        "batch_size",
                        "128",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<? extends DefaultVectorizer>> _SINGLETON_VALUE_DefaultVectorizer =
                new LazySingletonValue<>(
                        "default_vectorizer",
                        "\"none\"",
                        new TypeReference<Optional<? extends DefaultVectorizer>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_TenantId =
                new LazySingletonValue<>(
                        "tenant_id",
                        "\"\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_TextField =
                new LazySingletonValue<>(
                        "text_field",
                        "\"text\"",
                        new TypeReference<Optional<String>>() {});
    }
}
