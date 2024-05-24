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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;
/**
 * SourceSftpBulk - Used during spec; allows the developer to configure the cloud provider specific options
 * that are needed when users configure a file-based source.
 */

public class SourceSftpBulk {

    /**
     * Credentials for connecting to the SFTP Server
     */
    @JsonProperty("credentials")
    private SourceSftpBulkAuthentication credentials;

    /**
     * The directory to search files for sync
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_path")
    private Optional<? extends String> folderPath;

    /**
     * The server host address
     */
    @JsonProperty("host")
    private String host;

    /**
     * The server port
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    @JsonProperty("sourceType")
    private SftpBulk sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    /**
     * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    @JsonProperty("streams")
    private java.util.List<SourceSftpBulkFileBasedStreamConfig> streams;

    /**
     * The server user
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceSftpBulk(
            @JsonProperty("credentials") SourceSftpBulkAuthentication credentials,
            @JsonProperty("folder_path") Optional<? extends String> folderPath,
            @JsonProperty("host") String host,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate,
            @JsonProperty("streams") java.util.List<SourceSftpBulkFileBasedStreamConfig> streams,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(folderPath, "folderPath");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(streams, "streams");
        Utils.checkNotNull(username, "username");
        this.credentials = credentials;
        this.folderPath = folderPath;
        this.host = host;
        this.port = port;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.streams = streams;
        this.username = username;
    }
    
    public SourceSftpBulk(
            SourceSftpBulkAuthentication credentials,
            String host,
            java.util.List<SourceSftpBulkFileBasedStreamConfig> streams,
            String username) {
        this(credentials, Optional.empty(), host, Optional.empty(), Optional.empty(), streams, username);
    }

    /**
     * Credentials for connecting to the SFTP Server
     */
    @JsonIgnore
    public SourceSftpBulkAuthentication credentials() {
        return credentials;
    }

    /**
     * The directory to search files for sync
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> folderPath() {
        return (Optional<String>) folderPath;
    }

    /**
     * The server host address
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * The server port
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> port() {
        return (Optional<Long>) port;
    }

    @JsonIgnore
    public SftpBulk sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return (Optional<OffsetDateTime>) startDate;
    }

    /**
     * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    @JsonIgnore
    public java.util.List<SourceSftpBulkFileBasedStreamConfig> streams() {
        return streams;
    }

    /**
     * The server user
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Credentials for connecting to the SFTP Server
     */
    public SourceSftpBulk withCredentials(SourceSftpBulkAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * The directory to search files for sync
     */
    public SourceSftpBulk withFolderPath(String folderPath) {
        Utils.checkNotNull(folderPath, "folderPath");
        this.folderPath = Optional.ofNullable(folderPath);
        return this;
    }

    /**
     * The directory to search files for sync
     */
    public SourceSftpBulk withFolderPath(Optional<? extends String> folderPath) {
        Utils.checkNotNull(folderPath, "folderPath");
        this.folderPath = folderPath;
        return this;
    }

    /**
     * The server host address
     */
    public SourceSftpBulk withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * The server port
     */
    public SourceSftpBulk withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * The server port
     */
    public SourceSftpBulk withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public SourceSftpBulk withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public SourceSftpBulk withStartDate(Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    public SourceSftpBulk withStreams(java.util.List<SourceSftpBulkFileBasedStreamConfig> streams) {
        Utils.checkNotNull(streams, "streams");
        this.streams = streams;
        return this;
    }

    /**
     * The server user
     */
    public SourceSftpBulk withUsername(String username) {
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
        SourceSftpBulk other = (SourceSftpBulk) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.folderPath, other.folderPath) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.streams, other.streams) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            folderPath,
            host,
            port,
            sourceType,
            startDate,
            streams,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulk.class,
                "credentials", credentials,
                "folderPath", folderPath,
                "host", host,
                "port", port,
                "sourceType", sourceType,
                "startDate", startDate,
                "streams", streams,
                "username", username);
    }
    
    public final static class Builder {
 
        private SourceSftpBulkAuthentication credentials;
 
        private Optional<? extends String> folderPath;
 
        private String host;
 
        private Optional<? extends Long> port;
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();
 
        private java.util.List<SourceSftpBulkFileBasedStreamConfig> streams;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Credentials for connecting to the SFTP Server
         */
        public Builder credentials(SourceSftpBulkAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * The directory to search files for sync
         */
        public Builder folderPath(String folderPath) {
            Utils.checkNotNull(folderPath, "folderPath");
            this.folderPath = Optional.ofNullable(folderPath);
            return this;
        }

        /**
         * The directory to search files for sync
         */
        public Builder folderPath(Optional<? extends String> folderPath) {
            Utils.checkNotNull(folderPath, "folderPath");
            this.folderPath = folderPath;
            return this;
        }

        /**
         * The server host address
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * The server port
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * The server port
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
         */
        public Builder streams(java.util.List<SourceSftpBulkFileBasedStreamConfig> streams) {
            Utils.checkNotNull(streams, "streams");
            this.streams = streams;
            return this;
        }

        /**
         * The server user
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceSftpBulk build() {
            if (folderPath == null) {
                folderPath = _SINGLETON_VALUE_FolderPath.value();
            }
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            return new SourceSftpBulk(
                credentials,
                folderPath,
                host,
                port,
                startDate,
                streams,
                username);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_FolderPath =
                new LazySingletonValue<>(
                        "folder_path",
                        "\"/\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "22",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SftpBulk> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"sftp-bulk\"",
                        new TypeReference<SftpBulk>() {});
    }
}

