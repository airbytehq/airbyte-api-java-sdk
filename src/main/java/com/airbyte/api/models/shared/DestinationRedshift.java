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

public class DestinationRedshift {

    /**
     * Name of the database.
     */
    @JsonProperty("database")
    private String database;

    @JsonProperty("destinationType")
    private Redshift destinationType;

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disable_type_dedupe")
    private Optional<? extends Boolean> disableTypeDedupe;

    /**
     * Drop tables with CASCADE. WARNING! This will delete all data in all dependent objects (views, etc.). Use with caution. This option is intended for usecases which can easily rebuild the dependent objects.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("drop_cascade")
    private Optional<? extends Boolean> dropCascade;

    /**
     * Host Endpoint of the Redshift Cluster (must include the cluster-id, region and end with .redshift.amazonaws.com)
     */
    @JsonProperty("host")
    private String host;

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    private Optional<? extends String> jdbcUrlParams;

    /**
     * Password associated with the username.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Port of the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * The schema to write raw tables into (default: airbyte_internal).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw_data_schema")
    private Optional<? extends String> rawDataSchema;

    /**
     * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    private Optional<? extends String> schema;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends DestinationRedshiftSSHTunnelMethod> tunnelMethod;

    /**
     * The way data will be uploaded to Redshift.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploading_method")
    private Optional<? extends UploadingMethod> uploadingMethod;

    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public DestinationRedshift(
            @JsonProperty("database") String database,
            @JsonProperty("disable_type_dedupe") Optional<? extends Boolean> disableTypeDedupe,
            @JsonProperty("drop_cascade") Optional<? extends Boolean> dropCascade,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") String password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("raw_data_schema") Optional<? extends String> rawDataSchema,
            @JsonProperty("schema") Optional<? extends String> schema,
            @JsonProperty("tunnel_method") Optional<? extends DestinationRedshiftSSHTunnelMethod> tunnelMethod,
            @JsonProperty("uploading_method") Optional<? extends UploadingMethod> uploadingMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        Utils.checkNotNull(dropCascade, "dropCascade");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        Utils.checkNotNull(schema, "schema");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(uploadingMethod, "uploadingMethod");
        Utils.checkNotNull(username, "username");
        this.database = database;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.disableTypeDedupe = disableTypeDedupe;
        this.dropCascade = dropCascade;
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.rawDataSchema = rawDataSchema;
        this.schema = schema;
        this.tunnelMethod = tunnelMethod;
        this.uploadingMethod = uploadingMethod;
        this.username = username;
    }
    
    public DestinationRedshift(
            String database,
            String host,
            String password,
            String username) {
        this(database, Optional.empty(), Optional.empty(), host, Optional.empty(), password, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), username);
    }

    /**
     * Name of the database.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    @JsonIgnore
    public Redshift destinationType() {
        return destinationType;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> disableTypeDedupe() {
        return (Optional<Boolean>) disableTypeDedupe;
    }

    /**
     * Drop tables with CASCADE. WARNING! This will delete all data in all dependent objects (views, etc.). Use with caution. This option is intended for usecases which can easily rebuild the dependent objects.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> dropCascade() {
        return (Optional<Boolean>) dropCascade;
    }

    /**
     * Host Endpoint of the Redshift Cluster (must include the cluster-id, region and end with .redshift.amazonaws.com)
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> jdbcUrlParams() {
        return (Optional<String>) jdbcUrlParams;
    }

    /**
     * Password associated with the username.
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    /**
     * Port of the database.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> port() {
        return (Optional<Long>) port;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> rawDataSchema() {
        return (Optional<String>) rawDataSchema;
    }

    /**
     * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> schema() {
        return (Optional<String>) schema;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationRedshiftSSHTunnelMethod> tunnelMethod() {
        return (Optional<DestinationRedshiftSSHTunnelMethod>) tunnelMethod;
    }

    /**
     * The way data will be uploaded to Redshift.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UploadingMethod> uploadingMethod() {
        return (Optional<UploadingMethod>) uploadingMethod;
    }

    /**
     * Username to use to access the database.
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the database.
     */
    public DestinationRedshift withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    public DestinationRedshift withDisableTypeDedupe(boolean disableTypeDedupe) {
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        this.disableTypeDedupe = Optional.ofNullable(disableTypeDedupe);
        return this;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    public DestinationRedshift withDisableTypeDedupe(Optional<? extends Boolean> disableTypeDedupe) {
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        this.disableTypeDedupe = disableTypeDedupe;
        return this;
    }

    /**
     * Drop tables with CASCADE. WARNING! This will delete all data in all dependent objects (views, etc.). Use with caution. This option is intended for usecases which can easily rebuild the dependent objects.
     */
    public DestinationRedshift withDropCascade(boolean dropCascade) {
        Utils.checkNotNull(dropCascade, "dropCascade");
        this.dropCascade = Optional.ofNullable(dropCascade);
        return this;
    }

    /**
     * Drop tables with CASCADE. WARNING! This will delete all data in all dependent objects (views, etc.). Use with caution. This option is intended for usecases which can easily rebuild the dependent objects.
     */
    public DestinationRedshift withDropCascade(Optional<? extends Boolean> dropCascade) {
        Utils.checkNotNull(dropCascade, "dropCascade");
        this.dropCascade = dropCascade;
        return this;
    }

    /**
     * Host Endpoint of the Redshift Cluster (must include the cluster-id, region and end with .redshift.amazonaws.com)
     */
    public DestinationRedshift withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationRedshift withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationRedshift withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationRedshift withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Port of the database.
     */
    public DestinationRedshift withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of the database.
     */
    public DestinationRedshift withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal).
     */
    public DestinationRedshift withRawDataSchema(String rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = Optional.ofNullable(rawDataSchema);
        return this;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal).
     */
    public DestinationRedshift withRawDataSchema(Optional<? extends String> rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = rawDataSchema;
        return this;
    }

    /**
     * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
     */
    public DestinationRedshift withSchema(String schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = Optional.ofNullable(schema);
        return this;
    }

    /**
     * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
     */
    public DestinationRedshift withSchema(Optional<? extends String> schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationRedshift withTunnelMethod(DestinationRedshiftSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationRedshift withTunnelMethod(Optional<? extends DestinationRedshiftSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * The way data will be uploaded to Redshift.
     */
    public DestinationRedshift withUploadingMethod(UploadingMethod uploadingMethod) {
        Utils.checkNotNull(uploadingMethod, "uploadingMethod");
        this.uploadingMethod = Optional.ofNullable(uploadingMethod);
        return this;
    }

    /**
     * The way data will be uploaded to Redshift.
     */
    public DestinationRedshift withUploadingMethod(Optional<? extends UploadingMethod> uploadingMethod) {
        Utils.checkNotNull(uploadingMethod, "uploadingMethod");
        this.uploadingMethod = uploadingMethod;
        return this;
    }

    /**
     * Username to use to access the database.
     */
    public DestinationRedshift withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        DestinationRedshift other = (DestinationRedshift) o;
        return 
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.disableTypeDedupe, other.disableTypeDedupe) &&
            java.util.Objects.deepEquals(this.dropCascade, other.dropCascade) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.rawDataSchema, other.rawDataSchema) &&
            java.util.Objects.deepEquals(this.schema, other.schema) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.uploadingMethod, other.uploadingMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            database,
            destinationType,
            disableTypeDedupe,
            dropCascade,
            host,
            jdbcUrlParams,
            password,
            port,
            rawDataSchema,
            schema,
            tunnelMethod,
            uploadingMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationRedshift.class,
                "database", database,
                "destinationType", destinationType,
                "disableTypeDedupe", disableTypeDedupe,
                "dropCascade", dropCascade,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "rawDataSchema", rawDataSchema,
                "schema", schema,
                "tunnelMethod", tunnelMethod,
                "uploadingMethod", uploadingMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private String database;
 
        private Optional<? extends Boolean> disableTypeDedupe;
 
        private Optional<? extends Boolean> dropCascade;
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private String password;
 
        private Optional<? extends Long> port;
 
        private Optional<? extends String> rawDataSchema = Optional.empty();
 
        private Optional<? extends String> schema;
 
        private Optional<? extends DestinationRedshiftSSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private Optional<? extends UploadingMethod> uploadingMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the database.
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
        public Builder disableTypeDedupe(Optional<? extends Boolean> disableTypeDedupe) {
            Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
            this.disableTypeDedupe = disableTypeDedupe;
            return this;
        }

        /**
         * Drop tables with CASCADE. WARNING! This will delete all data in all dependent objects (views, etc.). Use with caution. This option is intended for usecases which can easily rebuild the dependent objects.
         */
        public Builder dropCascade(boolean dropCascade) {
            Utils.checkNotNull(dropCascade, "dropCascade");
            this.dropCascade = Optional.ofNullable(dropCascade);
            return this;
        }

        /**
         * Drop tables with CASCADE. WARNING! This will delete all data in all dependent objects (views, etc.). Use with caution. This option is intended for usecases which can easily rebuild the dependent objects.
         */
        public Builder dropCascade(Optional<? extends Boolean> dropCascade) {
            Utils.checkNotNull(dropCascade, "dropCascade");
            this.dropCascade = dropCascade;
            return this;
        }

        /**
         * Host Endpoint of the Redshift Cluster (must include the cluster-id, region and end with .redshift.amazonaws.com)
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
         */
        public Builder jdbcUrlParams(String jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
         */
        public Builder jdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = jdbcUrlParams;
            return this;
        }

        /**
         * Password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Port of the database.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of the database.
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * The schema to write raw tables into (default: airbyte_internal).
         */
        public Builder rawDataSchema(String rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = Optional.ofNullable(rawDataSchema);
            return this;
        }

        /**
         * The schema to write raw tables into (default: airbyte_internal).
         */
        public Builder rawDataSchema(Optional<? extends String> rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = rawDataSchema;
            return this;
        }

        /**
         * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
         */
        public Builder schema(String schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = Optional.ofNullable(schema);
            return this;
        }

        /**
         * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
         */
        public Builder schema(Optional<? extends String> schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = schema;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(DestinationRedshiftSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends DestinationRedshiftSSHTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
            return this;
        }

        /**
         * The way data will be uploaded to Redshift.
         */
        public Builder uploadingMethod(UploadingMethod uploadingMethod) {
            Utils.checkNotNull(uploadingMethod, "uploadingMethod");
            this.uploadingMethod = Optional.ofNullable(uploadingMethod);
            return this;
        }

        /**
         * The way data will be uploaded to Redshift.
         */
        public Builder uploadingMethod(Optional<? extends UploadingMethod> uploadingMethod) {
            Utils.checkNotNull(uploadingMethod, "uploadingMethod");
            this.uploadingMethod = uploadingMethod;
            return this;
        }

        /**
         * Username to use to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public DestinationRedshift build() {
            if (disableTypeDedupe == null) {
                disableTypeDedupe = _SINGLETON_VALUE_DisableTypeDedupe.value();
            }
            if (dropCascade == null) {
                dropCascade = _SINGLETON_VALUE_DropCascade.value();
            }
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            if (schema == null) {
                schema = _SINGLETON_VALUE_Schema.value();
            }
            return new DestinationRedshift(
                database,
                disableTypeDedupe,
                dropCascade,
                host,
                jdbcUrlParams,
                password,
                port,
                rawDataSchema,
                schema,
                tunnelMethod,
                uploadingMethod,
                username);
        }

        private static final LazySingletonValue<Redshift> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"redshift\"",
                        new TypeReference<Redshift>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DisableTypeDedupe =
                new LazySingletonValue<>(
                        "disable_type_dedupe",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DropCascade =
                new LazySingletonValue<>(
                        "drop_cascade",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "5439",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Schema =
                new LazySingletonValue<>(
                        "schema",
                        "\"public\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

