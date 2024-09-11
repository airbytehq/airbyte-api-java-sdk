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

public class SourceSftpBulkFileBasedStreamConfig {

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
    private SourceSftpBulkFormat format;

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
     * The number of resent files which will be used to discover the schema for this stream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recent_n_files_to_read_for_schema_discovery")
    private Optional<? extends Long> recentNFilesToReadForSchemaDiscovery;

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
    private Optional<? extends SourceSftpBulkValidationPolicy> validationPolicy;

    @JsonCreator
    public SourceSftpBulkFileBasedStreamConfig(
            @JsonProperty("days_to_sync_if_history_is_full") Optional<? extends Long> daysToSyncIfHistoryIsFull,
            @JsonProperty("format") SourceSftpBulkFormat format,
            @JsonProperty("globs") Optional<? extends java.util.List<String>> globs,
            @JsonProperty("input_schema") Optional<? extends String> inputSchema,
            @JsonProperty("legacy_prefix") Optional<? extends String> legacyPrefix,
            @JsonProperty("name") String name,
            @JsonProperty("primary_key") Optional<? extends String> primaryKey,
            @JsonProperty("recent_n_files_to_read_for_schema_discovery") Optional<? extends Long> recentNFilesToReadForSchemaDiscovery,
            @JsonProperty("schemaless") Optional<? extends Boolean> schemaless,
            @JsonProperty("validation_policy") Optional<? extends SourceSftpBulkValidationPolicy> validationPolicy) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        Utils.checkNotNull(format, "format");
        Utils.checkNotNull(globs, "globs");
        Utils.checkNotNull(inputSchema, "inputSchema");
        Utils.checkNotNull(legacyPrefix, "legacyPrefix");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(primaryKey, "primaryKey");
        Utils.checkNotNull(recentNFilesToReadForSchemaDiscovery, "recentNFilesToReadForSchemaDiscovery");
        Utils.checkNotNull(schemaless, "schemaless");
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        this.format = format;
        this.globs = globs;
        this.inputSchema = inputSchema;
        this.legacyPrefix = legacyPrefix;
        this.name = name;
        this.primaryKey = primaryKey;
        this.recentNFilesToReadForSchemaDiscovery = recentNFilesToReadForSchemaDiscovery;
        this.schemaless = schemaless;
        this.validationPolicy = validationPolicy;
    }
    
    public SourceSftpBulkFileBasedStreamConfig(
            SourceSftpBulkFormat format,
            String name) {
        this(Optional.empty(), format, Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public SourceSftpBulkFormat format() {
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
     * The number of resent files which will be used to discover the schema for this stream.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> recentNFilesToReadForSchemaDiscovery() {
        return (Optional<Long>) recentNFilesToReadForSchemaDiscovery;
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
    public Optional<SourceSftpBulkValidationPolicy> validationPolicy() {
        return (Optional<SourceSftpBulkValidationPolicy>) validationPolicy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public SourceSftpBulkFileBasedStreamConfig withDaysToSyncIfHistoryIsFull(long daysToSyncIfHistoryIsFull) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        this.daysToSyncIfHistoryIsFull = Optional.ofNullable(daysToSyncIfHistoryIsFull);
        return this;
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public SourceSftpBulkFileBasedStreamConfig withDaysToSyncIfHistoryIsFull(Optional<? extends Long> daysToSyncIfHistoryIsFull) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        return this;
    }

    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    public SourceSftpBulkFileBasedStreamConfig withFormat(SourceSftpBulkFormat format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
        return this;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public SourceSftpBulkFileBasedStreamConfig withGlobs(java.util.List<String> globs) {
        Utils.checkNotNull(globs, "globs");
        this.globs = Optional.ofNullable(globs);
        return this;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public SourceSftpBulkFileBasedStreamConfig withGlobs(Optional<? extends java.util.List<String>> globs) {
        Utils.checkNotNull(globs, "globs");
        this.globs = globs;
        return this;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public SourceSftpBulkFileBasedStreamConfig withInputSchema(String inputSchema) {
        Utils.checkNotNull(inputSchema, "inputSchema");
        this.inputSchema = Optional.ofNullable(inputSchema);
        return this;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public SourceSftpBulkFileBasedStreamConfig withInputSchema(Optional<? extends String> inputSchema) {
        Utils.checkNotNull(inputSchema, "inputSchema");
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    public SourceSftpBulkFileBasedStreamConfig withLegacyPrefix(String legacyPrefix) {
        Utils.checkNotNull(legacyPrefix, "legacyPrefix");
        this.legacyPrefix = Optional.ofNullable(legacyPrefix);
        return this;
    }

    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    public SourceSftpBulkFileBasedStreamConfig withLegacyPrefix(Optional<? extends String> legacyPrefix) {
        Utils.checkNotNull(legacyPrefix, "legacyPrefix");
        this.legacyPrefix = legacyPrefix;
        return this;
    }

    /**
     * The name of the stream.
     */
    public SourceSftpBulkFileBasedStreamConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public SourceSftpBulkFileBasedStreamConfig withPrimaryKey(String primaryKey) {
        Utils.checkNotNull(primaryKey, "primaryKey");
        this.primaryKey = Optional.ofNullable(primaryKey);
        return this;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public SourceSftpBulkFileBasedStreamConfig withPrimaryKey(Optional<? extends String> primaryKey) {
        Utils.checkNotNull(primaryKey, "primaryKey");
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * The number of resent files which will be used to discover the schema for this stream.
     */
    public SourceSftpBulkFileBasedStreamConfig withRecentNFilesToReadForSchemaDiscovery(long recentNFilesToReadForSchemaDiscovery) {
        Utils.checkNotNull(recentNFilesToReadForSchemaDiscovery, "recentNFilesToReadForSchemaDiscovery");
        this.recentNFilesToReadForSchemaDiscovery = Optional.ofNullable(recentNFilesToReadForSchemaDiscovery);
        return this;
    }

    /**
     * The number of resent files which will be used to discover the schema for this stream.
     */
    public SourceSftpBulkFileBasedStreamConfig withRecentNFilesToReadForSchemaDiscovery(Optional<? extends Long> recentNFilesToReadForSchemaDiscovery) {
        Utils.checkNotNull(recentNFilesToReadForSchemaDiscovery, "recentNFilesToReadForSchemaDiscovery");
        this.recentNFilesToReadForSchemaDiscovery = recentNFilesToReadForSchemaDiscovery;
        return this;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public SourceSftpBulkFileBasedStreamConfig withSchemaless(boolean schemaless) {
        Utils.checkNotNull(schemaless, "schemaless");
        this.schemaless = Optional.ofNullable(schemaless);
        return this;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public SourceSftpBulkFileBasedStreamConfig withSchemaless(Optional<? extends Boolean> schemaless) {
        Utils.checkNotNull(schemaless, "schemaless");
        this.schemaless = schemaless;
        return this;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public SourceSftpBulkFileBasedStreamConfig withValidationPolicy(SourceSftpBulkValidationPolicy validationPolicy) {
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.validationPolicy = Optional.ofNullable(validationPolicy);
        return this;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public SourceSftpBulkFileBasedStreamConfig withValidationPolicy(Optional<? extends SourceSftpBulkValidationPolicy> validationPolicy) {
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
        SourceSftpBulkFileBasedStreamConfig other = (SourceSftpBulkFileBasedStreamConfig) o;
        return 
            java.util.Objects.deepEquals(this.daysToSyncIfHistoryIsFull, other.daysToSyncIfHistoryIsFull) &&
            java.util.Objects.deepEquals(this.format, other.format) &&
            java.util.Objects.deepEquals(this.globs, other.globs) &&
            java.util.Objects.deepEquals(this.inputSchema, other.inputSchema) &&
            java.util.Objects.deepEquals(this.legacyPrefix, other.legacyPrefix) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.primaryKey, other.primaryKey) &&
            java.util.Objects.deepEquals(this.recentNFilesToReadForSchemaDiscovery, other.recentNFilesToReadForSchemaDiscovery) &&
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
            recentNFilesToReadForSchemaDiscovery,
            schemaless,
            validationPolicy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulkFileBasedStreamConfig.class,
                "daysToSyncIfHistoryIsFull", daysToSyncIfHistoryIsFull,
                "format", format,
                "globs", globs,
                "inputSchema", inputSchema,
                "legacyPrefix", legacyPrefix,
                "name", name,
                "primaryKey", primaryKey,
                "recentNFilesToReadForSchemaDiscovery", recentNFilesToReadForSchemaDiscovery,
                "schemaless", schemaless,
                "validationPolicy", validationPolicy);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> daysToSyncIfHistoryIsFull;
 
        private SourceSftpBulkFormat format;
 
        private Optional<? extends java.util.List<String>> globs = Optional.empty();
 
        private Optional<? extends String> inputSchema = Optional.empty();
 
        private Optional<? extends String> legacyPrefix = Optional.empty();
 
        private String name;
 
        private Optional<? extends String> primaryKey = Optional.empty();
 
        private Optional<? extends Long> recentNFilesToReadForSchemaDiscovery = Optional.empty();
 
        private Optional<? extends Boolean> schemaless;
 
        private Optional<? extends SourceSftpBulkValidationPolicy> validationPolicy;  
        
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
        public Builder format(SourceSftpBulkFormat format) {
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
         * The number of resent files which will be used to discover the schema for this stream.
         */
        public Builder recentNFilesToReadForSchemaDiscovery(long recentNFilesToReadForSchemaDiscovery) {
            Utils.checkNotNull(recentNFilesToReadForSchemaDiscovery, "recentNFilesToReadForSchemaDiscovery");
            this.recentNFilesToReadForSchemaDiscovery = Optional.ofNullable(recentNFilesToReadForSchemaDiscovery);
            return this;
        }

        /**
         * The number of resent files which will be used to discover the schema for this stream.
         */
        public Builder recentNFilesToReadForSchemaDiscovery(Optional<? extends Long> recentNFilesToReadForSchemaDiscovery) {
            Utils.checkNotNull(recentNFilesToReadForSchemaDiscovery, "recentNFilesToReadForSchemaDiscovery");
            this.recentNFilesToReadForSchemaDiscovery = recentNFilesToReadForSchemaDiscovery;
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
        public Builder validationPolicy(SourceSftpBulkValidationPolicy validationPolicy) {
            Utils.checkNotNull(validationPolicy, "validationPolicy");
            this.validationPolicy = Optional.ofNullable(validationPolicy);
            return this;
        }

        /**
         * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
         */
        public Builder validationPolicy(Optional<? extends SourceSftpBulkValidationPolicy> validationPolicy) {
            Utils.checkNotNull(validationPolicy, "validationPolicy");
            this.validationPolicy = validationPolicy;
            return this;
        }
        
        public SourceSftpBulkFileBasedStreamConfig build() {
            if (daysToSyncIfHistoryIsFull == null) {
                daysToSyncIfHistoryIsFull = _SINGLETON_VALUE_DaysToSyncIfHistoryIsFull.value();
            }
            if (schemaless == null) {
                schemaless = _SINGLETON_VALUE_Schemaless.value();
            }
            if (validationPolicy == null) {
                validationPolicy = _SINGLETON_VALUE_ValidationPolicy.value();
            }
            return new SourceSftpBulkFileBasedStreamConfig(
                daysToSyncIfHistoryIsFull,
                format,
                globs,
                inputSchema,
                legacyPrefix,
                name,
                primaryKey,
                recentNFilesToReadForSchemaDiscovery,
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

        private static final LazySingletonValue<Optional<? extends SourceSftpBulkValidationPolicy>> _SINGLETON_VALUE_ValidationPolicy =
                new LazySingletonValue<>(
                        "validation_policy",
                        "\"Emit Record\"",
                        new TypeReference<Optional<? extends SourceSftpBulkValidationPolicy>>() {});
    }
}

