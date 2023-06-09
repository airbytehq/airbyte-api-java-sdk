/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflake - The values required to configure the destination.
 */

public class DestinationSnowflake {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public DestinationSnowflake withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;database&lt;/a&gt; you want to sync data into
     */
    @JsonProperty("database")
    public String database;

    public DestinationSnowflake withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationSnowflakeSnowflake destinationType;

    public DestinationSnowflake withDestinationType(DestinationSnowflakeSnowflake destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Number of file buffers allocated for writing data. Increasing this number is beneficial for connections using Change Data Capture (CDC) and up to the number of streams within a connection. Increasing the number of file buffers past the maximum number of streams has deteriorating effects
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_buffer_count")
    public Long fileBufferCount;

    public DestinationSnowflake withFileBufferCount(Long fileBufferCount) {
        this.fileBufferCount = fileBufferCount;
        return this;
    }
    
    /**
     * Enter your Snowflake account's &lt;a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier"&gt;locator&lt;/a&gt; (in the format &lt;account_locator&gt;.&lt;region&gt;.&lt;cloud&gt;.snowflakecomputing.com)
     */
    @JsonProperty("host")
    public String host;

    public DestinationSnowflake withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &amp;). Example: key1=value1&amp;key2=value2&amp;key3=value3
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;

    public DestinationSnowflake withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Select a data staging method
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public Object loadingMethod;

    public DestinationSnowflake withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    /**
     * Enter the &lt;a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles"&gt;role&lt;/a&gt; that you want to use to access Snowflake
     */
    @JsonProperty("role")
    public String role;

    public DestinationSnowflake withRole(String role) {
        this.role = role;
        return this;
    }
    
    /**
     * Enter the name of the default &lt;a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl"&gt;schema&lt;/a&gt;
     */
    @JsonProperty("schema")
    public String schema;

    public DestinationSnowflake withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * Enter the name of the user you want to use to access the database
     */
    @JsonProperty("username")
    public String username;

    public DestinationSnowflake withUsername(String username) {
        this.username = username;
        return this;
    }
    
    /**
     * Enter the name of the &lt;a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses"&gt;warehouse&lt;/a&gt; that you want to sync data into
     */
    @JsonProperty("warehouse")
    public String warehouse;

    public DestinationSnowflake withWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    
    public DestinationSnowflake(@JsonProperty("database") String database, @JsonProperty("destinationType") DestinationSnowflakeSnowflake destinationType, @JsonProperty("host") String host, @JsonProperty("role") String role, @JsonProperty("schema") String schema, @JsonProperty("username") String username, @JsonProperty("warehouse") String warehouse) {
        this.database = database;
        this.destinationType = destinationType;
        this.host = host;
        this.role = role;
        this.schema = schema;
        this.username = username;
        this.warehouse = warehouse;
  }
}
