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


public class SourceS3FileBasedStreamConfig {

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days_to_sync_if_history_is_full")
    private Optional<? extends Long> daysToSyncIfHistoryIsFull;

    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    @JsonProperty("format")
    private SourceS3Format format;

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("globs")
    private Optional<? extends java.util.List<String>> globs;

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("input_schema")
    private Optional<? extends String> inputSchema;

    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legacy_prefix")
    private Optional<? extends String> legacyPrefix;

    /**
     * The name of the stream.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary_key")
    private Optional<? extends String> primaryKey;

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemaless")
    private Optional<? extends Boolean> schemaless;

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation_policy")
    private Optional<? extends SourceS3ValidationPolicy> validationPolicy;

    @JsonCreator
    public SourceS3FileBasedStreamConfig(
            @JsonProperty("days_to_sync_if_history_is_full") Optional<? extends Long> daysToSyncIfHistoryIsFull,
            @JsonProperty("format") SourceS3Format format,
            @JsonProperty("globs") Optional<? extends java.util.List<String>> globs,
            @JsonProperty("input_schema") Optional<? extends String> inputSchema,
            @JsonProperty("legacy_prefix") Optional<? extends String> legacyPrefix,
            @JsonProperty("name") String name,
            @JsonProperty("primary_key") Optional<? extends String> primaryKey,
            @JsonProperty("schemaless") Optional<? extends Boolean> schemaless,
            @JsonProperty("validation_policy") Optional<? extends SourceS3ValidationPolicy> validationPolicy) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        Utils.checkNotNull(format, "format");
        Utils.checkNotNull(globs, "globs");
        Utils.checkNotNull(inputSchema, "inputSchema");
        Utils.checkNotNull(legacyPrefix, "legacyPrefix");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(primaryKey, "primaryKey");
        Utils.checkNotNull(schemaless, "schemaless");
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        this.format = format;
        this.globs = globs;
        this.inputSchema = inputSchema;
        this.legacyPrefix = legacyPrefix;
        this.name = name;
        this.primaryKey = primaryKey;
        this.schemaless = schemaless;
        this.validationPolicy = validationPolicy;
    }
    
    public SourceS3FileBasedStreamConfig(
            SourceS3Format format,
            String name) {
        this(Optional.empty(), format, Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> daysToSyncIfHistoryIsFull() {
        return (Optional<Long>) daysToSyncIfHistoryIsFull;
    }

    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    @JsonIgnore
    public SourceS3Format format() {
        return format;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> globs() {
        return (Optional<java.util.List<String>>) globs;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> inputSchema() {
        return (Optional<String>) inputSchema;
    }

    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> legacyPrefix() {
        return (Optional<String>) legacyPrefix;
    }

    /**
     * The name of the stream.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> primaryKey() {
        return (Optional<String>) primaryKey;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> schemaless() {
        return (Optional<Boolean>) schemaless;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceS3ValidationPolicy> validationPolicy() {
        return (Optional<SourceS3ValidationPolicy>) validationPolicy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public SourceS3FileBasedStreamConfig withDaysToSyncIfHistoryIsFull(long daysToSyncIfHistoryIsFull) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        this.daysToSyncIfHistoryIsFull = Optional.ofNullable(daysToSyncIfHistoryIsFull);
        return this;
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public SourceS3FileBasedStreamConfig withDaysToSyncIfHistoryIsFull(Optional<? extends Long> daysToSyncIfHistoryIsFull) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        return this;
    }

    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    public SourceS3FileBasedStreamConfig withFormat(SourceS3Format format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
        return this;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public SourceS3FileBasedStreamConfig withGlobs(java.util.List<String> globs) {
        Utils.checkNotNull(globs, "globs");
        this.globs = Optional.ofNullable(globs);
        return this;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public SourceS3FileBasedStreamConfig withGlobs(Optional<? extends java.util.List<String>> globs) {
        Utils.checkNotNull(globs, "globs");
        this.globs = globs;
        return this;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public SourceS3FileBasedStreamConfig withInputSchema(String inputSchema) {
        Utils.checkNotNull(inputSchema, "inputSchema");
        this.inputSchema = Optional.ofNullable(inputSchema);
        return this;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public SourceS3FileBasedStreamConfig withInputSchema(Optional<? extends String> inputSchema) {
        Utils.checkNotNull(inputSchema, "inputSchema");
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    public SourceS3FileBasedStreamConfig withLegacyPrefix(String legacyPrefix) {
        Utils.checkNotNull(legacyPrefix, "legacyPrefix");
        this.legacyPrefix = Optional.ofNullable(legacyPrefix);
        return this;
    }

    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    public SourceS3FileBasedStreamConfig withLegacyPrefix(Optional<? extends String> legacyPrefix) {
        Utils.checkNotNull(legacyPrefix, "legacyPrefix");
        this.legacyPrefix = legacyPrefix;
        return this;
    }

    /**
     * The name of the stream.
     */
    public SourceS3FileBasedStreamConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public SourceS3FileBasedStreamConfig withPrimaryKey(String primaryKey) {
        Utils.checkNotNull(primaryKey, "primaryKey");
        this.primaryKey = Optional.ofNullable(primaryKey);
        return this;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public SourceS3FileBasedStreamConfig withPrimaryKey(Optional<? extends String> primaryKey) {
        Utils.checkNotNull(primaryKey, "primaryKey");
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public SourceS3FileBasedStreamConfig withSchemaless(boolean schemaless) {
        Utils.checkNotNull(schemaless, "schemaless");
        this.schemaless = Optional.ofNullable(schemaless);
        return this;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public SourceS3FileBasedStreamConfig withSchemaless(Optional<? extends Boolean> schemaless) {
        Utils.checkNotNull(schemaless, "schemaless");
        this.schemaless = schemaless;
        return this;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public SourceS3FileBasedStreamConfig withValidationPolicy(SourceS3ValidationPolicy validationPolicy) {
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.validationPolicy = Optional.ofNullable(validationPolicy);
        return this;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public SourceS3FileBasedStreamConfig withValidationPolicy(Optional<? extends SourceS3ValidationPolicy> validationPolicy) {
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.validationPolicy = validationPolicy;
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
        SourceS3FileBasedStreamConfig other = (SourceS3FileBasedStreamConfig) o;
        return 
            java.util.Objects.deepEquals(this.daysToSyncIfHistoryIsFull, other.daysToSyncIfHistoryIsFull) &&
            java.util.Objects.deepEquals(this.format, other.format) &&
            java.util.Objects.deepEquals(this.globs, other.globs) &&
            java.util.Objects.deepEquals(this.inputSchema, other.inputSchema) &&
            java.util.Objects.deepEquals(this.legacyPrefix, other.legacyPrefix) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.primaryKey, other.primaryKey) &&
            java.util.Objects.deepEquals(this.schemaless, other.schemaless) &&
            java.util.Objects.deepEquals(this.validationPolicy, other.validationPolicy);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            daysToSyncIfHistoryIsFull,
            format,
            globs,
            inputSchema,
            legacyPrefix,
            name,
            primaryKey,
            schemaless,
            validationPolicy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceS3FileBasedStreamConfig.class,
                "daysToSyncIfHistoryIsFull", daysToSyncIfHistoryIsFull,
                "format", format,
                "globs", globs,
                "inputSchema", inputSchema,
                "legacyPrefix", legacyPrefix,
                "name", name,
                "primaryKey", primaryKey,
                "schemaless", schemaless,
                "validationPolicy", validationPolicy);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> daysToSyncIfHistoryIsFull;
 
        private SourceS3Format format;
 
        private Optional<? extends java.util.List<String>> globs = Optional.empty();
 
        private Optional<? extends String> inputSchema = Optional.empty();
 
        private Optional<? extends String> legacyPrefix = Optional.empty();
 
        private String name;
 
        private Optional<? extends String> primaryKey = Optional.empty();
 
        private Optional<? extends Boolean> schemaless;
 
        private Optional<? extends SourceS3ValidationPolicy> validationPolicy;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
         */
        public Builder daysToSyncIfHistoryIsFull(long daysToSyncIfHistoryIsFull) {
            Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
            this.daysToSyncIfHistoryIsFull = Optional.ofNullable(daysToSyncIfHistoryIsFull);
            return this;
        }

        /**
         * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
         */
        public Builder daysToSyncIfHistoryIsFull(Optional<? extends Long> daysToSyncIfHistoryIsFull) {
            Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
            this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
            return this;
        }

        /**
         * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
         */
        public Builder format(SourceS3Format format) {
            Utils.checkNotNull(format, "format");
            this.format = format;
            return this;
        }

        /**
         * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
         */
        public Builder globs(java.util.List<String> globs) {
            Utils.checkNotNull(globs, "globs");
            this.globs = Optional.ofNullable(globs);
            return this;
        }

        /**
         * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
         */
        public Builder globs(Optional<? extends java.util.List<String>> globs) {
            Utils.checkNotNull(globs, "globs");
            this.globs = globs;
            return this;
        }

        /**
         * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
         */
        public Builder inputSchema(String inputSchema) {
            Utils.checkNotNull(inputSchema, "inputSchema");
            this.inputSchema = Optional.ofNullable(inputSchema);
            return this;
        }

        /**
         * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
         */
        public Builder inputSchema(Optional<? extends String> inputSchema) {
            Utils.checkNotNull(inputSchema, "inputSchema");
            this.inputSchema = inputSchema;
            return this;
        }

        /**
         * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
         */
        public Builder legacyPrefix(String legacyPrefix) {
            Utils.checkNotNull(legacyPrefix, "legacyPrefix");
            this.legacyPrefix = Optional.ofNullable(legacyPrefix);
            return this;
        }

        /**
         * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
         */
        public Builder legacyPrefix(Optional<? extends String> legacyPrefix) {
            Utils.checkNotNull(legacyPrefix, "legacyPrefix");
            this.legacyPrefix = legacyPrefix;
            return this;
        }

        /**
         * The name of the stream.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
         */
        public Builder primaryKey(String primaryKey) {
            Utils.checkNotNull(primaryKey, "primaryKey");
            this.primaryKey = Optional.ofNullable(primaryKey);
            return this;
        }

        /**
         * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
         */
        public Builder primaryKey(Optional<? extends String> primaryKey) {
            Utils.checkNotNull(primaryKey, "primaryKey");
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * When enabled, syncs will not validate or structure records against the stream's schema.
         */
        public Builder schemaless(boolean schemaless) {
            Utils.checkNotNull(schemaless, "schemaless");
            this.schemaless = Optional.ofNullable(schemaless);
            return this;
        }

        /**
         * When enabled, syncs will not validate or structure records against the stream's schema.
         */
        public Builder schemaless(Optional<? extends Boolean> schemaless) {
            Utils.checkNotNull(schemaless, "schemaless");
            this.schemaless = schemaless;
            return this;
        }

        /**
         * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
         */
        public Builder validationPolicy(SourceS3ValidationPolicy validationPolicy) {
            Utils.checkNotNull(validationPolicy, "validationPolicy");
            this.validationPolicy = Optional.ofNullable(validationPolicy);
            return this;
        }

        /**
         * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
         */
        public Builder validationPolicy(Optional<? extends SourceS3ValidationPolicy> validationPolicy) {
            Utils.checkNotNull(validationPolicy, "validationPolicy");
            this.validationPolicy = validationPolicy;
            return this;
        }
        
        public SourceS3FileBasedStreamConfig build() {
            if (daysToSyncIfHistoryIsFull == null) {
                daysToSyncIfHistoryIsFull = _SINGLETON_VALUE_DaysToSyncIfHistoryIsFull.value();
            }
            if (schemaless == null) {
                schemaless = _SINGLETON_VALUE_Schemaless.value();
            }
            if (validationPolicy == null) {
                validationPolicy = _SINGLETON_VALUE_ValidationPolicy.value();
            }
            return new SourceS3FileBasedStreamConfig(
                daysToSyncIfHistoryIsFull,
                format,
                globs,
                inputSchema,
                legacyPrefix,
                name,
                primaryKey,
                schemaless,
                validationPolicy);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_DaysToSyncIfHistoryIsFull =
                new LazySingletonValue<>(
                        "days_to_sync_if_history_is_full",
                        "3",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Schemaless =
                new LazySingletonValue<>(
                        "schemaless",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends SourceS3ValidationPolicy>> _SINGLETON_VALUE_ValidationPolicy =
                new LazySingletonValue<>(
                        "validation_policy",
                        "\"Emit Record\"",
                        new TypeReference<Optional<? extends SourceS3ValidationPolicy>>() {});
    }
}

