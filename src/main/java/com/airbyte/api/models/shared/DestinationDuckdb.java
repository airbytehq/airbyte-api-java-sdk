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
import java.util.Objects;
import java.util.Optional;


public class DestinationDuckdb {

    @JsonProperty("destinationType")
    private Duckdb destinationType;

    /**
     * Path to the .duckdb file, or the text 'md:' to connect to MotherDuck. The file will be placed inside that local mount. For more information check out our &lt;a href="https://docs.airbyte.io/integrations/destinations/duckdb"&gt;docs&lt;/a&gt;
     */
    @JsonProperty("destination_path")
    private String destinationPath;

    /**
     * API key to use for authentication to a MotherDuck database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("motherduck_api_key")
    private Optional<String> motherduckApiKey;

    /**
     * Database schema name, default for duckdb is 'main'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    private Optional<String> schema;

    @JsonCreator
    public DestinationDuckdb(
            @JsonProperty("destination_path") String destinationPath,
            @JsonProperty("motherduck_api_key") Optional<String> motherduckApiKey,
            @JsonProperty("schema") Optional<String> schema) {
        Utils.checkNotNull(destinationPath, "destinationPath");
        Utils.checkNotNull(motherduckApiKey, "motherduckApiKey");
        Utils.checkNotNull(schema, "schema");
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.destinationPath = destinationPath;
        this.motherduckApiKey = motherduckApiKey;
        this.schema = schema;
    }
    
    public DestinationDuckdb(
            String destinationPath) {
        this(destinationPath, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Duckdb destinationType() {
        return destinationType;
    }

    /**
     * Path to the .duckdb file, or the text 'md:' to connect to MotherDuck. The file will be placed inside that local mount. For more information check out our &lt;a href="https://docs.airbyte.io/integrations/destinations/duckdb"&gt;docs&lt;/a&gt;
     */
    @JsonIgnore
    public String destinationPath() {
        return destinationPath;
    }

    /**
     * API key to use for authentication to a MotherDuck database.
     */
    @JsonIgnore
    public Optional<String> motherduckApiKey() {
        return motherduckApiKey;
    }

    /**
     * Database schema name, default for duckdb is 'main'.
     */
    @JsonIgnore
    public Optional<String> schema() {
        return schema;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Path to the .duckdb file, or the text 'md:' to connect to MotherDuck. The file will be placed inside that local mount. For more information check out our &lt;a href="https://docs.airbyte.io/integrations/destinations/duckdb"&gt;docs&lt;/a&gt;
     */
    public DestinationDuckdb withDestinationPath(String destinationPath) {
        Utils.checkNotNull(destinationPath, "destinationPath");
        this.destinationPath = destinationPath;
        return this;
    }

    /**
     * API key to use for authentication to a MotherDuck database.
     */
    public DestinationDuckdb withMotherduckApiKey(String motherduckApiKey) {
        Utils.checkNotNull(motherduckApiKey, "motherduckApiKey");
        this.motherduckApiKey = Optional.ofNullable(motherduckApiKey);
        return this;
    }

    /**
     * API key to use for authentication to a MotherDuck database.
     */
    public DestinationDuckdb withMotherduckApiKey(Optional<String> motherduckApiKey) {
        Utils.checkNotNull(motherduckApiKey, "motherduckApiKey");
        this.motherduckApiKey = motherduckApiKey;
        return this;
    }

    /**
     * Database schema name, default for duckdb is 'main'.
     */
    public DestinationDuckdb withSchema(String schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = Optional.ofNullable(schema);
        return this;
    }

    /**
     * Database schema name, default for duckdb is 'main'.
     */
    public DestinationDuckdb withSchema(Optional<String> schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
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
        DestinationDuckdb other = (DestinationDuckdb) o;
        return 
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.destinationPath, other.destinationPath) &&
            Objects.deepEquals(this.motherduckApiKey, other.motherduckApiKey) &&
            Objects.deepEquals(this.schema, other.schema);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            destinationType,
            destinationPath,
            motherduckApiKey,
            schema);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationDuckdb.class,
                "destinationType", destinationType,
                "destinationPath", destinationPath,
                "motherduckApiKey", motherduckApiKey,
                "schema", schema);
    }
    
    public final static class Builder {
 
        private String destinationPath;
 
        private Optional<String> motherduckApiKey = Optional.empty();
 
        private Optional<String> schema = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Path to the .duckdb file, or the text 'md:' to connect to MotherDuck. The file will be placed inside that local mount. For more information check out our &lt;a href="https://docs.airbyte.io/integrations/destinations/duckdb"&gt;docs&lt;/a&gt;
         */
        public Builder destinationPath(String destinationPath) {
            Utils.checkNotNull(destinationPath, "destinationPath");
            this.destinationPath = destinationPath;
            return this;
        }

        /**
         * API key to use for authentication to a MotherDuck database.
         */
        public Builder motherduckApiKey(String motherduckApiKey) {
            Utils.checkNotNull(motherduckApiKey, "motherduckApiKey");
            this.motherduckApiKey = Optional.ofNullable(motherduckApiKey);
            return this;
        }

        /**
         * API key to use for authentication to a MotherDuck database.
         */
        public Builder motherduckApiKey(Optional<String> motherduckApiKey) {
            Utils.checkNotNull(motherduckApiKey, "motherduckApiKey");
            this.motherduckApiKey = motherduckApiKey;
            return this;
        }

        /**
         * Database schema name, default for duckdb is 'main'.
         */
        public Builder schema(String schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = Optional.ofNullable(schema);
            return this;
        }

        /**
         * Database schema name, default for duckdb is 'main'.
         */
        public Builder schema(Optional<String> schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = schema;
            return this;
        }
        
        public DestinationDuckdb build() {
            return new DestinationDuckdb(
                destinationPath,
                motherduckApiKey,
                schema);
        }

        private static final LazySingletonValue<Duckdb> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"duckdb\"",
                        new TypeReference<Duckdb>() {});
    }
}

