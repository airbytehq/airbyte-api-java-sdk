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

public class SourceBambooHr {

    /**
     * Api key of bamboo hr
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Comma-separated list of fields to include in custom reports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports_fields")
    private Optional<? extends String> customReportsFields;

    /**
     * If true, the custom reports endpoint will include the default fields defined here: https://documentation.bamboohr.com/docs/list-of-field-names.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports_include_default_fields")
    private Optional<? extends Boolean> customReportsIncludeDefaultFields;

    @JsonProperty("sourceType")
    private BambooHr sourceType;

    /**
     * Sub Domain of bamboo hr
     */
    @JsonProperty("subdomain")
    private String subdomain;

    @JsonCreator
    public SourceBambooHr(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("custom_reports_fields") Optional<? extends String> customReportsFields,
            @JsonProperty("custom_reports_include_default_fields") Optional<? extends Boolean> customReportsIncludeDefaultFields,
            @JsonProperty("subdomain") String subdomain) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(customReportsFields, "customReportsFields");
        Utils.checkNotNull(customReportsIncludeDefaultFields, "customReportsIncludeDefaultFields");
        Utils.checkNotNull(subdomain, "subdomain");
        this.apiKey = apiKey;
        this.customReportsFields = customReportsFields;
        this.customReportsIncludeDefaultFields = customReportsIncludeDefaultFields;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.subdomain = subdomain;
    }
    
    public SourceBambooHr(
            String apiKey,
            String subdomain) {
        this(apiKey, Optional.empty(), Optional.empty(), subdomain);
    }

    /**
     * Api key of bamboo hr
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Comma-separated list of fields to include in custom reports.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> customReportsFields() {
        return (Optional<String>) customReportsFields;
    }

    /**
     * If true, the custom reports endpoint will include the default fields defined here: https://documentation.bamboohr.com/docs/list-of-field-names.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> customReportsIncludeDefaultFields() {
        return (Optional<Boolean>) customReportsIncludeDefaultFields;
    }

    @JsonIgnore
    public BambooHr sourceType() {
        return sourceType;
    }

    /**
     * Sub Domain of bamboo hr
     */
    @JsonIgnore
    public String subdomain() {
        return subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Api key of bamboo hr
     */
    public SourceBambooHr withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Comma-separated list of fields to include in custom reports.
     */
    public SourceBambooHr withCustomReportsFields(String customReportsFields) {
        Utils.checkNotNull(customReportsFields, "customReportsFields");
        this.customReportsFields = Optional.ofNullable(customReportsFields);
        return this;
    }

    /**
     * Comma-separated list of fields to include in custom reports.
     */
    public SourceBambooHr withCustomReportsFields(Optional<? extends String> customReportsFields) {
        Utils.checkNotNull(customReportsFields, "customReportsFields");
        this.customReportsFields = customReportsFields;
        return this;
    }

    /**
     * If true, the custom reports endpoint will include the default fields defined here: https://documentation.bamboohr.com/docs/list-of-field-names.
     */
    public SourceBambooHr withCustomReportsIncludeDefaultFields(boolean customReportsIncludeDefaultFields) {
        Utils.checkNotNull(customReportsIncludeDefaultFields, "customReportsIncludeDefaultFields");
        this.customReportsIncludeDefaultFields = Optional.ofNullable(customReportsIncludeDefaultFields);
        return this;
    }

    /**
     * If true, the custom reports endpoint will include the default fields defined here: https://documentation.bamboohr.com/docs/list-of-field-names.
     */
    public SourceBambooHr withCustomReportsIncludeDefaultFields(Optional<? extends Boolean> customReportsIncludeDefaultFields) {
        Utils.checkNotNull(customReportsIncludeDefaultFields, "customReportsIncludeDefaultFields");
        this.customReportsIncludeDefaultFields = customReportsIncludeDefaultFields;
        return this;
    }

    /**
     * Sub Domain of bamboo hr
     */
    public SourceBambooHr withSubdomain(String subdomain) {
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
        SourceBambooHr other = (SourceBambooHr) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.customReportsFields, other.customReportsFields) &&
            java.util.Objects.deepEquals(this.customReportsIncludeDefaultFields, other.customReportsIncludeDefaultFields) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            customReportsFields,
            customReportsIncludeDefaultFields,
            sourceType,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceBambooHr.class,
                "apiKey", apiKey,
                "customReportsFields", customReportsFields,
                "customReportsIncludeDefaultFields", customReportsIncludeDefaultFields,
                "sourceType", sourceType,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends String> customReportsFields = Optional.empty();
 
        private Optional<? extends Boolean> customReportsIncludeDefaultFields;
 
        private String subdomain;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Api key of bamboo hr
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Comma-separated list of fields to include in custom reports.
         */
        public Builder customReportsFields(String customReportsFields) {
            Utils.checkNotNull(customReportsFields, "customReportsFields");
            this.customReportsFields = Optional.ofNullable(customReportsFields);
            return this;
        }

        /**
         * Comma-separated list of fields to include in custom reports.
         */
        public Builder customReportsFields(Optional<? extends String> customReportsFields) {
            Utils.checkNotNull(customReportsFields, "customReportsFields");
            this.customReportsFields = customReportsFields;
            return this;
        }

        /**
         * If true, the custom reports endpoint will include the default fields defined here: https://documentation.bamboohr.com/docs/list-of-field-names.
         */
        public Builder customReportsIncludeDefaultFields(boolean customReportsIncludeDefaultFields) {
            Utils.checkNotNull(customReportsIncludeDefaultFields, "customReportsIncludeDefaultFields");
            this.customReportsIncludeDefaultFields = Optional.ofNullable(customReportsIncludeDefaultFields);
            return this;
        }

        /**
         * If true, the custom reports endpoint will include the default fields defined here: https://documentation.bamboohr.com/docs/list-of-field-names.
         */
        public Builder customReportsIncludeDefaultFields(Optional<? extends Boolean> customReportsIncludeDefaultFields) {
            Utils.checkNotNull(customReportsIncludeDefaultFields, "customReportsIncludeDefaultFields");
            this.customReportsIncludeDefaultFields = customReportsIncludeDefaultFields;
            return this;
        }

        /**
         * Sub Domain of bamboo hr
         */
        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceBambooHr build() {
            if (customReportsIncludeDefaultFields == null) {
                customReportsIncludeDefaultFields = _SINGLETON_VALUE_CustomReportsIncludeDefaultFields.value();
            }
            return new SourceBambooHr(
                apiKey,
                customReportsFields,
                customReportsIncludeDefaultFields,
                subdomain);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_CustomReportsIncludeDefaultFields =
                new LazySingletonValue<>(
                        "custom_reports_include_default_fields",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<BambooHr> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"bamboo-hr\"",
                        new TypeReference<BambooHr>() {});
    }
}

