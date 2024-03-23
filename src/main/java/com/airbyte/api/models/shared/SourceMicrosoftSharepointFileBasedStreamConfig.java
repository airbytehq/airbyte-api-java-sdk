/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceMicrosoftSharepointFileBasedStreamConfig {

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
    private SourceMicrosoftSharepointFormat format;

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
    private Optional<? extends SourceMicrosoftSharepointValidationPolicy> validationPolicy;

    public SourceMicrosoftSharepointFileBasedStreamConfig(
            @JsonProperty("days_to_sync_if_history_is_full") Optional<? extends Long> daysToSyncIfHistoryIsFull,
            @JsonProperty("format") SourceMicrosoftSharepointFormat format,
            @JsonProperty("globs") Optional<? extends java.util.List<String>> globs,
            @JsonProperty("input_schema") Optional<? extends String> inputSchema,
            @JsonProperty("name") String name,
            @JsonProperty("primary_key") Optional<? extends String> primaryKey,
            @JsonProperty("schemaless") Optional<? extends Boolean> schemaless,
            @JsonProperty("validation_policy") Optional<? extends SourceMicrosoftSharepointValidationPolicy> validationPolicy) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        Utils.checkNotNull(format, "format");
        Utils.checkNotNull(globs, "globs");
        Utils.checkNotNull(inputSchema, "inputSchema");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(primaryKey, "primaryKey");
        Utils.checkNotNull(schemaless, "schemaless");
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        this.format = format;
        this.globs = globs;
        this.inputSchema = inputSchema;
        this.name = name;
        this.primaryKey = primaryKey;
        this.schemaless = schemaless;
        this.validationPolicy = validationPolicy;
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public Optional<? extends Long> daysToSyncIfHistoryIsFull() {
        return daysToSyncIfHistoryIsFull;
    }

    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    public SourceMicrosoftSharepointFormat format() {
        return format;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public Optional<? extends java.util.List<String>> globs() {
        return globs;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public Optional<? extends String> inputSchema() {
        return inputSchema;
    }

    /**
     * The name of the stream.
     */
    public String name() {
        return name;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public Optional<? extends String> primaryKey() {
        return primaryKey;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public Optional<? extends Boolean> schemaless() {
        return schemaless;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public Optional<? extends SourceMicrosoftSharepointValidationPolicy> validationPolicy() {
        return validationPolicy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withDaysToSyncIfHistoryIsFull(long daysToSyncIfHistoryIsFull) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        this.daysToSyncIfHistoryIsFull = Optional.ofNullable(daysToSyncIfHistoryIsFull);
        return this;
    }

    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withDaysToSyncIfHistoryIsFull(Optional<? extends Long> daysToSyncIfHistoryIsFull) {
        Utils.checkNotNull(daysToSyncIfHistoryIsFull, "daysToSyncIfHistoryIsFull");
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        return this;
    }

    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withFormat(SourceMicrosoftSharepointFormat format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
        return this;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withGlobs(java.util.List<String> globs) {
        Utils.checkNotNull(globs, "globs");
        this.globs = Optional.ofNullable(globs);
        return this;
    }

    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withGlobs(Optional<? extends java.util.List<String>> globs) {
        Utils.checkNotNull(globs, "globs");
        this.globs = globs;
        return this;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withInputSchema(String inputSchema) {
        Utils.checkNotNull(inputSchema, "inputSchema");
        this.inputSchema = Optional.ofNullable(inputSchema);
        return this;
    }

    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withInputSchema(Optional<? extends String> inputSchema) {
        Utils.checkNotNull(inputSchema, "inputSchema");
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * The name of the stream.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withPrimaryKey(String primaryKey) {
        Utils.checkNotNull(primaryKey, "primaryKey");
        this.primaryKey = Optional.ofNullable(primaryKey);
        return this;
    }

    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record. If empty, the primary key will default to the parser's default primary key.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withPrimaryKey(Optional<? extends String> primaryKey) {
        Utils.checkNotNull(primaryKey, "primaryKey");
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withSchemaless(boolean schemaless) {
        Utils.checkNotNull(schemaless, "schemaless");
        this.schemaless = Optional.ofNullable(schemaless);
        return this;
    }

    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withSchemaless(Optional<? extends Boolean> schemaless) {
        Utils.checkNotNull(schemaless, "schemaless");
        this.schemaless = schemaless;
        return this;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withValidationPolicy(SourceMicrosoftSharepointValidationPolicy validationPolicy) {
        Utils.checkNotNull(validationPolicy, "validationPolicy");
        this.validationPolicy = Optional.ofNullable(validationPolicy);
        return this;
    }

    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    public SourceMicrosoftSharepointFileBasedStreamConfig withValidationPolicy(Optional<? extends SourceMicrosoftSharepointValidationPolicy> validationPolicy) {
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
        SourceMicrosoftSharepointFileBasedStreamConfig other = (SourceMicrosoftSharepointFileBasedStreamConfig) o;
        return 
            java.util.Objects.deepEquals(this.daysToSyncIfHistoryIsFull, other.daysToSyncIfHistoryIsFull) &&
            java.util.Objects.deepEquals(this.format, other.format) &&
            java.util.Objects.deepEquals(this.globs, other.globs) &&
            java.util.Objects.deepEquals(this.inputSchema, other.inputSchema) &&
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
            name,
            primaryKey,
            schemaless,
            validationPolicy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftSharepointFileBasedStreamConfig.class,
                "daysToSyncIfHistoryIsFull", daysToSyncIfHistoryIsFull,
                "format", format,
                "globs", globs,
                "inputSchema", inputSchema,
                "name", name,
                "primaryKey", primaryKey,
                "schemaless", schemaless,
                "validationPolicy", validationPolicy);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> daysToSyncIfHistoryIsFull;
 
        private SourceMicrosoftSharepointFormat format;
 
        private Optional<? extends java.util.List<String>> globs = Optional.empty();
 
        private Optional<? extends String> inputSchema = Optional.empty();
 
        private String name;
 
        private Optional<? extends String> primaryKey = Optional.empty();
 
        private Optional<? extends Boolean> schemaless;
 
        private Optional<? extends SourceMicrosoftSharepointValidationPolicy> validationPolicy;  
        
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
        public Builder format(SourceMicrosoftSharepointFormat format) {
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
        public Builder validationPolicy(SourceMicrosoftSharepointValidationPolicy validationPolicy) {
            Utils.checkNotNull(validationPolicy, "validationPolicy");
            this.validationPolicy = Optional.ofNullable(validationPolicy);
            return this;
        }

        /**
         * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
         */
        public Builder validationPolicy(Optional<? extends SourceMicrosoftSharepointValidationPolicy> validationPolicy) {
            Utils.checkNotNull(validationPolicy, "validationPolicy");
            this.validationPolicy = validationPolicy;
            return this;
        }
        
        public SourceMicrosoftSharepointFileBasedStreamConfig build() {
            if (daysToSyncIfHistoryIsFull == null) {
                daysToSyncIfHistoryIsFull = _SINGLETON_VALUE_DaysToSyncIfHistoryIsFull.value();
            }
            if (schemaless == null) {
                schemaless = _SINGLETON_VALUE_Schemaless.value();
            }
            if (validationPolicy == null) {
                validationPolicy = _SINGLETON_VALUE_ValidationPolicy.value();
            }
            return new SourceMicrosoftSharepointFileBasedStreamConfig(
                daysToSyncIfHistoryIsFull,
                format,
                globs,
                inputSchema,
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

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftSharepointValidationPolicy>> _SINGLETON_VALUE_ValidationPolicy =
                new LazySingletonValue<>(
                        "validation_policy",
                        "\"Emit Record\"",
                        new TypeReference<Optional<? extends SourceMicrosoftSharepointValidationPolicy>>() {});
    }
}

