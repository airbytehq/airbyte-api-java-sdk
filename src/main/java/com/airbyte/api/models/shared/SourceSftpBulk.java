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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class SourceSftpBulk {

    /**
     * Sync only the most recent file for the configured folder path and file pattern
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_most_recent")
    private Optional<? extends Boolean> fileMostRecent;

    /**
     * The regular expression to specify files for sync in a chosen Folder Path
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_pattern")
    private Optional<? extends String> filePattern;

    /**
     * The file type you want to sync. Currently only 'csv' and 'json' files are supported.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_type")
    private Optional<? extends FileType> fileType;

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
     * OS-level password for logging into the jump server host
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * The server port
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * The private key
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("private_key")
    private Optional<? extends String> privateKey;

    /**
     * The separator used in the CSV files. Define None if you want to use the Sniffer functionality
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("separator")
    private Optional<? extends String> separator;

    @JsonProperty("sourceType")
    private SftpBulk sourceType;

    /**
     * The date from which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * The name of the stream or table you want to create
     */
    @JsonProperty("stream_name")
    private String streamName;

    /**
     * The server user
     */
    @JsonProperty("username")
    private String username;

    public SourceSftpBulk(
            @JsonProperty("file_most_recent") Optional<? extends Boolean> fileMostRecent,
            @JsonProperty("file_pattern") Optional<? extends String> filePattern,
            @JsonProperty("file_type") Optional<? extends FileType> fileType,
            @JsonProperty("folder_path") Optional<? extends String> folderPath,
            @JsonProperty("host") String host,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("private_key") Optional<? extends String> privateKey,
            @JsonProperty("separator") Optional<? extends String> separator,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("stream_name") String streamName,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(fileMostRecent, "fileMostRecent");
        Utils.checkNotNull(filePattern, "filePattern");
        Utils.checkNotNull(fileType, "fileType");
        Utils.checkNotNull(folderPath, "folderPath");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(privateKey, "privateKey");
        Utils.checkNotNull(separator, "separator");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(streamName, "streamName");
        Utils.checkNotNull(username, "username");
        this.fileMostRecent = fileMostRecent;
        this.filePattern = filePattern;
        this.fileType = fileType;
        this.folderPath = folderPath;
        this.host = host;
        this.password = password;
        this.port = port;
        this.privateKey = privateKey;
        this.separator = separator;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.streamName = streamName;
        this.username = username;
    }

    /**
     * Sync only the most recent file for the configured folder path and file pattern
     */
    public Optional<? extends Boolean> fileMostRecent() {
        return fileMostRecent;
    }

    /**
     * The regular expression to specify files for sync in a chosen Folder Path
     */
    public Optional<? extends String> filePattern() {
        return filePattern;
    }

    /**
     * The file type you want to sync. Currently only 'csv' and 'json' files are supported.
     */
    public Optional<? extends FileType> fileType() {
        return fileType;
    }

    /**
     * The directory to search files for sync
     */
    public Optional<? extends String> folderPath() {
        return folderPath;
    }

    /**
     * The server host address
     */
    public String host() {
        return host;
    }

    /**
     * OS-level password for logging into the jump server host
     */
    public Optional<? extends String> password() {
        return password;
    }

    /**
     * The server port
     */
    public Optional<? extends Long> port() {
        return port;
    }

    /**
     * The private key
     */
    public Optional<? extends String> privateKey() {
        return privateKey;
    }

    /**
     * The separator used in the CSV files. Define None if you want to use the Sniffer functionality
     */
    public Optional<? extends String> separator() {
        return separator;
    }

    public SftpBulk sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * The name of the stream or table you want to create
     */
    public String streamName() {
        return streamName;
    }

    /**
     * The server user
     */
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Sync only the most recent file for the configured folder path and file pattern
     */
    public SourceSftpBulk withFileMostRecent(boolean fileMostRecent) {
        Utils.checkNotNull(fileMostRecent, "fileMostRecent");
        this.fileMostRecent = Optional.ofNullable(fileMostRecent);
        return this;
    }

    /**
     * Sync only the most recent file for the configured folder path and file pattern
     */
    public SourceSftpBulk withFileMostRecent(Optional<? extends Boolean> fileMostRecent) {
        Utils.checkNotNull(fileMostRecent, "fileMostRecent");
        this.fileMostRecent = fileMostRecent;
        return this;
    }

    /**
     * The regular expression to specify files for sync in a chosen Folder Path
     */
    public SourceSftpBulk withFilePattern(String filePattern) {
        Utils.checkNotNull(filePattern, "filePattern");
        this.filePattern = Optional.ofNullable(filePattern);
        return this;
    }

    /**
     * The regular expression to specify files for sync in a chosen Folder Path
     */
    public SourceSftpBulk withFilePattern(Optional<? extends String> filePattern) {
        Utils.checkNotNull(filePattern, "filePattern");
        this.filePattern = filePattern;
        return this;
    }

    /**
     * The file type you want to sync. Currently only 'csv' and 'json' files are supported.
     */
    public SourceSftpBulk withFileType(FileType fileType) {
        Utils.checkNotNull(fileType, "fileType");
        this.fileType = Optional.ofNullable(fileType);
        return this;
    }

    /**
     * The file type you want to sync. Currently only 'csv' and 'json' files are supported.
     */
    public SourceSftpBulk withFileType(Optional<? extends FileType> fileType) {
        Utils.checkNotNull(fileType, "fileType");
        this.fileType = fileType;
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
     * OS-level password for logging into the jump server host
     */
    public SourceSftpBulk withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * OS-level password for logging into the jump server host
     */
    public SourceSftpBulk withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
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
     * The private key
     */
    public SourceSftpBulk withPrivateKey(String privateKey) {
        Utils.checkNotNull(privateKey, "privateKey");
        this.privateKey = Optional.ofNullable(privateKey);
        return this;
    }

    /**
     * The private key
     */
    public SourceSftpBulk withPrivateKey(Optional<? extends String> privateKey) {
        Utils.checkNotNull(privateKey, "privateKey");
        this.privateKey = privateKey;
        return this;
    }

    /**
     * The separator used in the CSV files. Define None if you want to use the Sniffer functionality
     */
    public SourceSftpBulk withSeparator(String separator) {
        Utils.checkNotNull(separator, "separator");
        this.separator = Optional.ofNullable(separator);
        return this;
    }

    /**
     * The separator used in the CSV files. Define None if you want to use the Sniffer functionality
     */
    public SourceSftpBulk withSeparator(Optional<? extends String> separator) {
        Utils.checkNotNull(separator, "separator");
        this.separator = separator;
        return this;
    }

    /**
     * The date from which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    public SourceSftpBulk withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The name of the stream or table you want to create
     */
    public SourceSftpBulk withStreamName(String streamName) {
        Utils.checkNotNull(streamName, "streamName");
        this.streamName = streamName;
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
            java.util.Objects.deepEquals(this.fileMostRecent, other.fileMostRecent) &&
            java.util.Objects.deepEquals(this.filePattern, other.filePattern) &&
            java.util.Objects.deepEquals(this.fileType, other.fileType) &&
            java.util.Objects.deepEquals(this.folderPath, other.folderPath) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.privateKey, other.privateKey) &&
            java.util.Objects.deepEquals(this.separator, other.separator) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.streamName, other.streamName) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            fileMostRecent,
            filePattern,
            fileType,
            folderPath,
            host,
            password,
            port,
            privateKey,
            separator,
            sourceType,
            startDate,
            streamName,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulk.class,
                "fileMostRecent", fileMostRecent,
                "filePattern", filePattern,
                "fileType", fileType,
                "folderPath", folderPath,
                "host", host,
                "password", password,
                "port", port,
                "privateKey", privateKey,
                "separator", separator,
                "sourceType", sourceType,
                "startDate", startDate,
                "streamName", streamName,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> fileMostRecent;
 
        private Optional<? extends String> filePattern;
 
        private Optional<? extends FileType> fileType;
 
        private Optional<? extends String> folderPath;
 
        private String host;
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private Optional<? extends String> privateKey = Optional.empty();
 
        private Optional<? extends String> separator;
 
        private OffsetDateTime startDate;
 
        private String streamName;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Sync only the most recent file for the configured folder path and file pattern
         */
        public Builder fileMostRecent(boolean fileMostRecent) {
            Utils.checkNotNull(fileMostRecent, "fileMostRecent");
            this.fileMostRecent = Optional.ofNullable(fileMostRecent);
            return this;
        }

        /**
         * Sync only the most recent file for the configured folder path and file pattern
         */
        public Builder fileMostRecent(Optional<? extends Boolean> fileMostRecent) {
            Utils.checkNotNull(fileMostRecent, "fileMostRecent");
            this.fileMostRecent = fileMostRecent;
            return this;
        }

        /**
         * The regular expression to specify files for sync in a chosen Folder Path
         */
        public Builder filePattern(String filePattern) {
            Utils.checkNotNull(filePattern, "filePattern");
            this.filePattern = Optional.ofNullable(filePattern);
            return this;
        }

        /**
         * The regular expression to specify files for sync in a chosen Folder Path
         */
        public Builder filePattern(Optional<? extends String> filePattern) {
            Utils.checkNotNull(filePattern, "filePattern");
            this.filePattern = filePattern;
            return this;
        }

        /**
         * The file type you want to sync. Currently only 'csv' and 'json' files are supported.
         */
        public Builder fileType(FileType fileType) {
            Utils.checkNotNull(fileType, "fileType");
            this.fileType = Optional.ofNullable(fileType);
            return this;
        }

        /**
         * The file type you want to sync. Currently only 'csv' and 'json' files are supported.
         */
        public Builder fileType(Optional<? extends FileType> fileType) {
            Utils.checkNotNull(fileType, "fileType");
            this.fileType = fileType;
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
         * OS-level password for logging into the jump server host
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * OS-level password for logging into the jump server host
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
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
         * The private key
         */
        public Builder privateKey(String privateKey) {
            Utils.checkNotNull(privateKey, "privateKey");
            this.privateKey = Optional.ofNullable(privateKey);
            return this;
        }

        /**
         * The private key
         */
        public Builder privateKey(Optional<? extends String> privateKey) {
            Utils.checkNotNull(privateKey, "privateKey");
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The separator used in the CSV files. Define None if you want to use the Sniffer functionality
         */
        public Builder separator(String separator) {
            Utils.checkNotNull(separator, "separator");
            this.separator = Optional.ofNullable(separator);
            return this;
        }

        /**
         * The separator used in the CSV files. Define None if you want to use the Sniffer functionality
         */
        public Builder separator(Optional<? extends String> separator) {
            Utils.checkNotNull(separator, "separator");
            this.separator = separator;
            return this;
        }

        /**
         * The date from which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The name of the stream or table you want to create
         */
        public Builder streamName(String streamName) {
            Utils.checkNotNull(streamName, "streamName");
            this.streamName = streamName;
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
            if (fileMostRecent == null) {
                fileMostRecent = _SINGLETON_VALUE_FileMostRecent.value();
            }
            if (filePattern == null) {
                filePattern = _SINGLETON_VALUE_FilePattern.value();
            }
            if (fileType == null) {
                fileType = _SINGLETON_VALUE_FileType.value();
            }
            if (folderPath == null) {
                folderPath = _SINGLETON_VALUE_FolderPath.value();
            }
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            if (separator == null) {
                separator = _SINGLETON_VALUE_Separator.value();
            }
            return new SourceSftpBulk(
                fileMostRecent,
                filePattern,
                fileType,
                folderPath,
                host,
                password,
                port,
                privateKey,
                separator,
                startDate,
                streamName,
                username);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_FileMostRecent =
                new LazySingletonValue<>(
                        "file_most_recent",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_FilePattern =
                new LazySingletonValue<>(
                        "file_pattern",
                        "\"\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends FileType>> _SINGLETON_VALUE_FileType =
                new LazySingletonValue<>(
                        "file_type",
                        "\"csv\"",
                        new TypeReference<Optional<? extends FileType>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_FolderPath =
                new LazySingletonValue<>(
                        "folder_path",
                        "\"\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "22",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Separator =
                new LazySingletonValue<>(
                        "separator",
                        "\",\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<SftpBulk> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"sftp-bulk\"",
                        new TypeReference<SftpBulk>() {});
    }
}

