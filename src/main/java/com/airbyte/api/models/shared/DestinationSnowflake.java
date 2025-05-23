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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class DestinationSnowflake {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends AuthorizationMethod> credentials;

    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;database&lt;/a&gt; you want to sync data into
     */
    @JsonProperty("database")
    private String database;

    @JsonProperty("destinationType")
    private DestinationSnowflakeSnowflake destinationType;

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disable_type_dedupe")
    private Optional<Boolean> disableTypeDedupe;

    /**
     * Enter your Snowflake account's &lt;a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier"&gt;locator&lt;/a&gt; (in the format &lt;account_locator&gt;.&lt;region&gt;.&lt;cloud&gt;.snowflakecomputing.com)
     */
    @JsonProperty("host")
    private String host;

    /**
     * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    private Optional<String> jdbcUrlParams;

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw_data_schema")
    private Optional<String> rawDataSchema;

    /**
     * The number of days of Snowflake Time Travel to enable on the tables. See &lt;a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period"&gt;Snowflake's documentation&lt;/a&gt; for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retention_period_days")
    private Optional<Long> retentionPeriodDays;

    /**
     * Enter the &lt;a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles"&gt;role&lt;/a&gt; that you want to use to access Snowflake
     */
    @JsonProperty("role")
    private String role;

    /**
     * Enter the name of the default &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;schema&lt;/a&gt;
     */
    @JsonProperty("schema")
    private String schema;

    /**
     * Use MERGE for de-duplication of final tables. This option no effect if Final tables are disabled or Sync mode is not DEDUPE
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("use_merge_for_upsert")
    private Optional<Boolean> useMergeForUpsert;

    /**
     * Enter the name of the user you want to use to access the database
     */
    @JsonProperty("username")
    private String username;

    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses"&gt;warehouse&lt;/a&gt; that you want to use as a compute cluster
     */
    @JsonProperty("warehouse")
    private String warehouse;

    @JsonCreator
    public DestinationSnowflake(
            @JsonProperty("credentials") Optional<? extends AuthorizationMethod> credentials,
            @JsonProperty("database") String database,
            @JsonProperty("disable_type_dedupe") Optional<Boolean> disableTypeDedupe,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<String> jdbcUrlParams,
            @JsonProperty("raw_data_schema") Optional<String> rawDataSchema,
            @JsonProperty("retention_period_days") Optional<Long> retentionPeriodDays,
            @JsonProperty("role") String role,
            @JsonProperty("schema") String schema,
            @JsonProperty("use_merge_for_upsert") Optional<Boolean> useMergeForUpsert,
            @JsonProperty("username") String username,
            @JsonProperty("warehouse") String warehouse) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        Utils.checkNotNull(retentionPeriodDays, "retentionPeriodDays");
        Utils.checkNotNull(role, "role");
        Utils.checkNotNull(schema, "schema");
        Utils.checkNotNull(useMergeForUpsert, "useMergeForUpsert");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(warehouse, "warehouse");
        this.credentials = credentials;
        this.database = database;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.disableTypeDedupe = disableTypeDedupe;
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.rawDataSchema = rawDataSchema;
        this.retentionPeriodDays = retentionPeriodDays;
        this.role = role;
        this.schema = schema;
        this.useMergeForUpsert = useMergeForUpsert;
        this.username = username;
        this.warehouse = warehouse;
    }
    
    public DestinationSnowflake(
            String database,
            String host,
            String role,
            String schema,
            String username,
            String warehouse) {
        this(Optional.empty(), database, Optional.empty(), host, Optional.empty(), Optional.empty(), Optional.empty(), role, schema, Optional.empty(), username, warehouse);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthorizationMethod> credentials() {
        return (Optional<AuthorizationMethod>) credentials;
    }

    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;database&lt;/a&gt; you want to sync data into
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    @JsonIgnore
    public DestinationSnowflakeSnowflake destinationType() {
        return destinationType;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    @JsonIgnore
    public Optional<Boolean> disableTypeDedupe() {
        return disableTypeDedupe;
    }

    /**
     * Enter your Snowflake account's &lt;a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier"&gt;locator&lt;/a&gt; (in the format &lt;account_locator&gt;.&lt;region&gt;.&lt;cloud&gt;.snowflakecomputing.com)
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
     */
    @JsonIgnore
    public Optional<String> jdbcUrlParams() {
        return jdbcUrlParams;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    @JsonIgnore
    public Optional<String> rawDataSchema() {
        return rawDataSchema;
    }

    /**
     * The number of days of Snowflake Time Travel to enable on the tables. See &lt;a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period"&gt;Snowflake's documentation&lt;/a&gt; for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance.
     */
    @JsonIgnore
    public Optional<Long> retentionPeriodDays() {
        return retentionPeriodDays;
    }

    /**
     * Enter the &lt;a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles"&gt;role&lt;/a&gt; that you want to use to access Snowflake
     */
    @JsonIgnore
    public String role() {
        return role;
    }

    /**
     * Enter the name of the default &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;schema&lt;/a&gt;
     */
    @JsonIgnore
    public String schema() {
        return schema;
    }

    /**
     * Use MERGE for de-duplication of final tables. This option no effect if Final tables are disabled or Sync mode is not DEDUPE
     */
    @JsonIgnore
    public Optional<Boolean> useMergeForUpsert() {
        return useMergeForUpsert;
    }

    /**
     * Enter the name of the user you want to use to access the database
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses"&gt;warehouse&lt;/a&gt; that you want to use as a compute cluster
     */
    @JsonIgnore
    public String warehouse() {
        return warehouse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DestinationSnowflake withCredentials(AuthorizationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public DestinationSnowflake withCredentials(Optional<? extends AuthorizationMethod> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;database&lt;/a&gt; you want to sync data into
     */
    public DestinationSnowflake withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    public DestinationSnowflake withDisableTypeDedupe(boolean disableTypeDedupe) {
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        this.disableTypeDedupe = Optional.ofNullable(disableTypeDedupe);
        return this;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    public DestinationSnowflake withDisableTypeDedupe(Optional<Boolean> disableTypeDedupe) {
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        this.disableTypeDedupe = disableTypeDedupe;
        return this;
    }

    /**
     * Enter your Snowflake account's &lt;a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier"&gt;locator&lt;/a&gt; (in the format &lt;account_locator&gt;.&lt;region&gt;.&lt;cloud&gt;.snowflakecomputing.com)
     */
    public DestinationSnowflake withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
     */
    public DestinationSnowflake withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
     */
    public DestinationSnowflake withJdbcUrlParams(Optional<String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    public DestinationSnowflake withRawDataSchema(String rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = Optional.ofNullable(rawDataSchema);
        return this;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    public DestinationSnowflake withRawDataSchema(Optional<String> rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = rawDataSchema;
        return this;
    }

    /**
     * The number of days of Snowflake Time Travel to enable on the tables. See &lt;a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period"&gt;Snowflake's documentation&lt;/a&gt; for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance.
     */
    public DestinationSnowflake withRetentionPeriodDays(long retentionPeriodDays) {
        Utils.checkNotNull(retentionPeriodDays, "retentionPeriodDays");
        this.retentionPeriodDays = Optional.ofNullable(retentionPeriodDays);
        return this;
    }

    /**
     * The number of days of Snowflake Time Travel to enable on the tables. See &lt;a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period"&gt;Snowflake's documentation&lt;/a&gt; for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance.
     */
    public DestinationSnowflake withRetentionPeriodDays(Optional<Long> retentionPeriodDays) {
        Utils.checkNotNull(retentionPeriodDays, "retentionPeriodDays");
        this.retentionPeriodDays = retentionPeriodDays;
        return this;
    }

    /**
     * Enter the &lt;a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles"&gt;role&lt;/a&gt; that you want to use to access Snowflake
     */
    public DestinationSnowflake withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
        return this;
    }

    /**
     * Enter the name of the default &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;schema&lt;/a&gt;
     */
    public DestinationSnowflake withSchema(String schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
        return this;
    }

    /**
     * Use MERGE for de-duplication of final tables. This option no effect if Final tables are disabled or Sync mode is not DEDUPE
     */
    public DestinationSnowflake withUseMergeForUpsert(boolean useMergeForUpsert) {
        Utils.checkNotNull(useMergeForUpsert, "useMergeForUpsert");
        this.useMergeForUpsert = Optional.ofNullable(useMergeForUpsert);
        return this;
    }

    /**
     * Use MERGE for de-duplication of final tables. This option no effect if Final tables are disabled or Sync mode is not DEDUPE
     */
    public DestinationSnowflake withUseMergeForUpsert(Optional<Boolean> useMergeForUpsert) {
        Utils.checkNotNull(useMergeForUpsert, "useMergeForUpsert");
        this.useMergeForUpsert = useMergeForUpsert;
        return this;
    }

    /**
     * Enter the name of the user you want to use to access the database
     */
    public DestinationSnowflake withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses"&gt;warehouse&lt;/a&gt; that you want to use as a compute cluster
     */
    public DestinationSnowflake withWarehouse(String warehouse) {
        Utils.checkNotNull(warehouse, "warehouse");
        this.warehouse = warehouse;
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
        DestinationSnowflake other = (DestinationSnowflake) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.database, other.database) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.disableTypeDedupe, other.disableTypeDedupe) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            Objects.deepEquals(this.rawDataSchema, other.rawDataSchema) &&
            Objects.deepEquals(this.retentionPeriodDays, other.retentionPeriodDays) &&
            Objects.deepEquals(this.role, other.role) &&
            Objects.deepEquals(this.schema, other.schema) &&
            Objects.deepEquals(this.useMergeForUpsert, other.useMergeForUpsert) &&
            Objects.deepEquals(this.username, other.username) &&
            Objects.deepEquals(this.warehouse, other.warehouse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            database,
            destinationType,
            disableTypeDedupe,
            host,
            jdbcUrlParams,
            rawDataSchema,
            retentionPeriodDays,
            role,
            schema,
            useMergeForUpsert,
            username,
            warehouse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationSnowflake.class,
                "credentials", credentials,
                "database", database,
                "destinationType", destinationType,
                "disableTypeDedupe", disableTypeDedupe,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "rawDataSchema", rawDataSchema,
                "retentionPeriodDays", retentionPeriodDays,
                "role", role,
                "schema", schema,
                "useMergeForUpsert", useMergeForUpsert,
                "username", username,
                "warehouse", warehouse);
    }
    
    public final static class Builder {
 
        private Optional<? extends AuthorizationMethod> credentials = Optional.empty();
 
        private String database;
 
        private Optional<Boolean> disableTypeDedupe;
 
        private String host;
 
        private Optional<String> jdbcUrlParams = Optional.empty();
 
        private Optional<String> rawDataSchema = Optional.empty();
 
        private Optional<Long> retentionPeriodDays;
 
        private String role;
 
        private String schema;
 
        private Optional<Boolean> useMergeForUpsert;
 
        private String username;
 
        private String warehouse;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(AuthorizationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends AuthorizationMethod> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Enter the name of the &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;database&lt;/a&gt; you want to sync data into
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
         */
        public Builder disableTypeDedupe(boolean disableTypeDedupe) {
            Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
            this.disableTypeDedupe = Optional.ofNullable(disableTypeDedupe);
            return this;
        }

        /**
         * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
         */
        public Builder disableTypeDedupe(Optional<Boolean> disableTypeDedupe) {
            Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
            this.disableTypeDedupe = disableTypeDedupe;
            return this;
        }

        /**
         * Enter your Snowflake account's &lt;a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier"&gt;locator&lt;/a&gt; (in the format &lt;account_locator&gt;.&lt;region&gt;.&lt;cloud&gt;.snowflakecomputing.com)
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
         */
        public Builder jdbcUrlParams(String jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
            return this;
        }

        /**
         * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
         */
        public Builder jdbcUrlParams(Optional<String> jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = jdbcUrlParams;
            return this;
        }

        /**
         * The schema to write raw tables into (default: airbyte_internal)
         */
        public Builder rawDataSchema(String rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = Optional.ofNullable(rawDataSchema);
            return this;
        }

        /**
         * The schema to write raw tables into (default: airbyte_internal)
         */
        public Builder rawDataSchema(Optional<String> rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = rawDataSchema;
            return this;
        }

        /**
         * The number of days of Snowflake Time Travel to enable on the tables. See &lt;a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period"&gt;Snowflake's documentation&lt;/a&gt; for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance.
         */
        public Builder retentionPeriodDays(long retentionPeriodDays) {
            Utils.checkNotNull(retentionPeriodDays, "retentionPeriodDays");
            this.retentionPeriodDays = Optional.ofNullable(retentionPeriodDays);
            return this;
        }

        /**
         * The number of days of Snowflake Time Travel to enable on the tables. See &lt;a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period"&gt;Snowflake's documentation&lt;/a&gt; for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance.
         */
        public Builder retentionPeriodDays(Optional<Long> retentionPeriodDays) {
            Utils.checkNotNull(retentionPeriodDays, "retentionPeriodDays");
            this.retentionPeriodDays = retentionPeriodDays;
            return this;
        }

        /**
         * Enter the &lt;a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles"&gt;role&lt;/a&gt; that you want to use to access Snowflake
         */
        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }

        /**
         * Enter the name of the default &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;schema&lt;/a&gt;
         */
        public Builder schema(String schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = schema;
            return this;
        }

        /**
         * Use MERGE for de-duplication of final tables. This option no effect if Final tables are disabled or Sync mode is not DEDUPE
         */
        public Builder useMergeForUpsert(boolean useMergeForUpsert) {
            Utils.checkNotNull(useMergeForUpsert, "useMergeForUpsert");
            this.useMergeForUpsert = Optional.ofNullable(useMergeForUpsert);
            return this;
        }

        /**
         * Use MERGE for de-duplication of final tables. This option no effect if Final tables are disabled or Sync mode is not DEDUPE
         */
        public Builder useMergeForUpsert(Optional<Boolean> useMergeForUpsert) {
            Utils.checkNotNull(useMergeForUpsert, "useMergeForUpsert");
            this.useMergeForUpsert = useMergeForUpsert;
            return this;
        }

        /**
         * Enter the name of the user you want to use to access the database
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        /**
         * Enter the name of the &lt;a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses"&gt;warehouse&lt;/a&gt; that you want to use as a compute cluster
         */
        public Builder warehouse(String warehouse) {
            Utils.checkNotNull(warehouse, "warehouse");
            this.warehouse = warehouse;
            return this;
        }
        
        public DestinationSnowflake build() {
            if (disableTypeDedupe == null) {
                disableTypeDedupe = _SINGLETON_VALUE_DisableTypeDedupe.value();
            }
            if (retentionPeriodDays == null) {
                retentionPeriodDays = _SINGLETON_VALUE_RetentionPeriodDays.value();
            }
            if (useMergeForUpsert == null) {
                useMergeForUpsert = _SINGLETON_VALUE_UseMergeForUpsert.value();
            }
            return new DestinationSnowflake(
                credentials,
                database,
                disableTypeDedupe,
                host,
                jdbcUrlParams,
                rawDataSchema,
                retentionPeriodDays,
                role,
                schema,
                useMergeForUpsert,
                username,
                warehouse);
        }

        private static final LazySingletonValue<DestinationSnowflakeSnowflake> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"snowflake\"",
                        new TypeReference<DestinationSnowflakeSnowflake>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_DisableTypeDedupe =
                new LazySingletonValue<>(
                        "disable_type_dedupe",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_RetentionPeriodDays =
                new LazySingletonValue<>(
                        "retention_period_days",
                        "1",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_UseMergeForUpsert =
                new LazySingletonValue<>(
                        "use_merge_for_upsert",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
