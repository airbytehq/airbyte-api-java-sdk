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
/**
 * ConnectionResponse - Provides details of a single connection.
 */

public class ConnectionResponse {

    /**
     * A list of configured stream options for a connection.
     */
    @JsonProperty("configurations")
    private StreamConfigurations configurations;

    @JsonProperty("connectionId")
    private String connectionId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataResidency")
    private Optional<? extends GeographyEnum> dataResidency;

    @JsonProperty("destinationId")
    private String destinationId;

    @JsonProperty("name")
    private String name;

    /**
     * Define the location where the data will be stored in the destination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceDefinition")
    private Optional<? extends NamespaceDefinitionEnum> namespaceDefinition;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceFormat")
    private Optional<? extends String> namespaceFormat;

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nonBreakingSchemaUpdatesBehavior")
    private Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    private Optional<? extends String> prefix;

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonProperty("schedule")
    private ConnectionScheduleResponse schedule;

    @JsonProperty("sourceId")
    private String sourceId;

    @JsonProperty("status")
    private ConnectionStatusEnum status;

    @JsonProperty("workspaceId")
    private String workspaceId;

    @JsonCreator
    public ConnectionResponse(
            @JsonProperty("configurations") StreamConfigurations configurations,
            @JsonProperty("connectionId") String connectionId,
            @JsonProperty("dataResidency") Optional<? extends GeographyEnum> dataResidency,
            @JsonProperty("destinationId") String destinationId,
            @JsonProperty("name") String name,
            @JsonProperty("namespaceDefinition") Optional<? extends NamespaceDefinitionEnum> namespaceDefinition,
            @JsonProperty("namespaceFormat") Optional<? extends String> namespaceFormat,
            @JsonProperty("nonBreakingSchemaUpdatesBehavior") Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior,
            @JsonProperty("prefix") Optional<? extends String> prefix,
            @JsonProperty("schedule") ConnectionScheduleResponse schedule,
            @JsonProperty("sourceId") String sourceId,
            @JsonProperty("status") ConnectionStatusEnum status,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(configurations, "configurations");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(dataResidency, "dataResidency");
        Utils.checkNotNull(destinationId, "destinationId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
        Utils.checkNotNull(namespaceFormat, "namespaceFormat");
        Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
        Utils.checkNotNull(prefix, "prefix");
        Utils.checkNotNull(schedule, "schedule");
        Utils.checkNotNull(sourceId, "sourceId");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.configurations = configurations;
        this.connectionId = connectionId;
        this.dataResidency = dataResidency;
        this.destinationId = destinationId;
        this.name = name;
        this.namespaceDefinition = namespaceDefinition;
        this.namespaceFormat = namespaceFormat;
        this.nonBreakingSchemaUpdatesBehavior = nonBreakingSchemaUpdatesBehavior;
        this.prefix = prefix;
        this.schedule = schedule;
        this.sourceId = sourceId;
        this.status = status;
        this.workspaceId = workspaceId;
    }
    
    public ConnectionResponse(
            StreamConfigurations configurations,
            String connectionId,
            String destinationId,
            String name,
            ConnectionScheduleResponse schedule,
            String sourceId,
            ConnectionStatusEnum status,
            String workspaceId) {
        this(configurations, connectionId, Optional.empty(), destinationId, name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), schedule, sourceId, status, workspaceId);
    }

    /**
     * A list of configured stream options for a connection.
     */
    @JsonIgnore
    public StreamConfigurations configurations() {
        return configurations;
    }

    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GeographyEnum> dataResidency() {
        return (Optional<GeographyEnum>) dataResidency;
    }

    @JsonIgnore
    public String destinationId() {
        return destinationId;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * Define the location where the data will be stored in the destination
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NamespaceDefinitionEnum> namespaceDefinition() {
        return (Optional<NamespaceDefinitionEnum>) namespaceDefinition;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> namespaceFormat() {
        return (Optional<String>) namespaceFormat;
    }

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior() {
        return (Optional<NonBreakingSchemaUpdatesBehaviorEnum>) nonBreakingSchemaUpdatesBehavior;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> prefix() {
        return (Optional<String>) prefix;
    }

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonIgnore
    public ConnectionScheduleResponse schedule() {
        return schedule;
    }

    @JsonIgnore
    public String sourceId() {
        return sourceId;
    }

    @JsonIgnore
    public ConnectionStatusEnum status() {
        return status;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of configured stream options for a connection.
     */
    public ConnectionResponse withConfigurations(StreamConfigurations configurations) {
        Utils.checkNotNull(configurations, "configurations");
        this.configurations = configurations;
        return this;
    }

    public ConnectionResponse withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public ConnectionResponse withDataResidency(GeographyEnum dataResidency) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        this.dataResidency = Optional.ofNullable(dataResidency);
        return this;
    }

    public ConnectionResponse withDataResidency(Optional<? extends GeographyEnum> dataResidency) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        this.dataResidency = dataResidency;
        return this;
    }

    public ConnectionResponse withDestinationId(String destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = destinationId;
        return this;
    }

    public ConnectionResponse withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Define the location where the data will be stored in the destination
     */
    public ConnectionResponse withNamespaceDefinition(NamespaceDefinitionEnum namespaceDefinition) {
        Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
        this.namespaceDefinition = Optional.ofNullable(namespaceDefinition);
        return this;
    }

    /**
     * Define the location where the data will be stored in the destination
     */
    public ConnectionResponse withNamespaceDefinition(Optional<? extends NamespaceDefinitionEnum> namespaceDefinition) {
        Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }

    public ConnectionResponse withNamespaceFormat(String namespaceFormat) {
        Utils.checkNotNull(namespaceFormat, "namespaceFormat");
        this.namespaceFormat = Optional.ofNullable(namespaceFormat);
        return this;
    }

    public ConnectionResponse withNamespaceFormat(Optional<? extends String> namespaceFormat) {
        Utils.checkNotNull(namespaceFormat, "namespaceFormat");
        this.namespaceFormat = namespaceFormat;
        return this;
    }

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    public ConnectionResponse withNonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnum nonBreakingSchemaUpdatesBehavior) {
        Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
        this.nonBreakingSchemaUpdatesBehavior = Optional.ofNullable(nonBreakingSchemaUpdatesBehavior);
        return this;
    }

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    public ConnectionResponse withNonBreakingSchemaUpdatesBehavior(Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior) {
        Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
        this.nonBreakingSchemaUpdatesBehavior = nonBreakingSchemaUpdatesBehavior;
        return this;
    }

    public ConnectionResponse withPrefix(String prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = Optional.ofNullable(prefix);
        return this;
    }

    public ConnectionResponse withPrefix(Optional<? extends String> prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = prefix;
        return this;
    }

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    public ConnectionResponse withSchedule(ConnectionScheduleResponse schedule) {
        Utils.checkNotNull(schedule, "schedule");
        this.schedule = schedule;
        return this;
    }

    public ConnectionResponse withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
        return this;
    }

    public ConnectionResponse withStatus(ConnectionStatusEnum status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public ConnectionResponse withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        ConnectionResponse other = (ConnectionResponse) o;
        return 
            java.util.Objects.deepEquals(this.configurations, other.configurations) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.dataResidency, other.dataResidency) &&
            java.util.Objects.deepEquals(this.destinationId, other.destinationId) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.namespaceDefinition, other.namespaceDefinition) &&
            java.util.Objects.deepEquals(this.namespaceFormat, other.namespaceFormat) &&
            java.util.Objects.deepEquals(this.nonBreakingSchemaUpdatesBehavior, other.nonBreakingSchemaUpdatesBehavior) &&
            java.util.Objects.deepEquals(this.prefix, other.prefix) &&
            java.util.Objects.deepEquals(this.schedule, other.schedule) &&
            java.util.Objects.deepEquals(this.sourceId, other.sourceId) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            configurations,
            connectionId,
            dataResidency,
            destinationId,
            name,
            namespaceDefinition,
            namespaceFormat,
            nonBreakingSchemaUpdatesBehavior,
            prefix,
            schedule,
            sourceId,
            status,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionResponse.class,
                "configurations", configurations,
                "connectionId", connectionId,
                "dataResidency", dataResidency,
                "destinationId", destinationId,
                "name", name,
                "namespaceDefinition", namespaceDefinition,
                "namespaceFormat", namespaceFormat,
                "nonBreakingSchemaUpdatesBehavior", nonBreakingSchemaUpdatesBehavior,
                "prefix", prefix,
                "schedule", schedule,
                "sourceId", sourceId,
                "status", status,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private StreamConfigurations configurations;
 
        private String connectionId;
 
        private Optional<? extends GeographyEnum> dataResidency;
 
        private String destinationId;
 
        private String name;
 
        private Optional<? extends NamespaceDefinitionEnum> namespaceDefinition;
 
        private Optional<? extends String> namespaceFormat = Optional.empty();
 
        private Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior;
 
        private Optional<? extends String> prefix = Optional.empty();
 
        private ConnectionScheduleResponse schedule;
 
        private String sourceId;
 
        private ConnectionStatusEnum status;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of configured stream options for a connection.
         */
        public Builder configurations(StreamConfigurations configurations) {
            Utils.checkNotNull(configurations, "configurations");
            this.configurations = configurations;
            return this;
        }

        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        public Builder dataResidency(GeographyEnum dataResidency) {
            Utils.checkNotNull(dataResidency, "dataResidency");
            this.dataResidency = Optional.ofNullable(dataResidency);
            return this;
        }

        public Builder dataResidency(Optional<? extends GeographyEnum> dataResidency) {
            Utils.checkNotNull(dataResidency, "dataResidency");
            this.dataResidency = dataResidency;
            return this;
        }

        public Builder destinationId(String destinationId) {
            Utils.checkNotNull(destinationId, "destinationId");
            this.destinationId = destinationId;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Define the location where the data will be stored in the destination
         */
        public Builder namespaceDefinition(NamespaceDefinitionEnum namespaceDefinition) {
            Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
            this.namespaceDefinition = Optional.ofNullable(namespaceDefinition);
            return this;
        }

        /**
         * Define the location where the data will be stored in the destination
         */
        public Builder namespaceDefinition(Optional<? extends NamespaceDefinitionEnum> namespaceDefinition) {
            Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
            this.namespaceDefinition = namespaceDefinition;
            return this;
        }

        public Builder namespaceFormat(String namespaceFormat) {
            Utils.checkNotNull(namespaceFormat, "namespaceFormat");
            this.namespaceFormat = Optional.ofNullable(namespaceFormat);
            return this;
        }

        public Builder namespaceFormat(Optional<? extends String> namespaceFormat) {
            Utils.checkNotNull(namespaceFormat, "namespaceFormat");
            this.namespaceFormat = namespaceFormat;
            return this;
        }

        /**
         * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
         */
        public Builder nonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnum nonBreakingSchemaUpdatesBehavior) {
            Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
            this.nonBreakingSchemaUpdatesBehavior = Optional.ofNullable(nonBreakingSchemaUpdatesBehavior);
            return this;
        }

        /**
         * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
         */
        public Builder nonBreakingSchemaUpdatesBehavior(Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior) {
            Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
            this.nonBreakingSchemaUpdatesBehavior = nonBreakingSchemaUpdatesBehavior;
            return this;
        }

        public Builder prefix(String prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = Optional.ofNullable(prefix);
            return this;
        }

        public Builder prefix(Optional<? extends String> prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = prefix;
            return this;
        }

        /**
         * schedule for when the the connection should run, per the schedule type
         */
        public Builder schedule(ConnectionScheduleResponse schedule) {
            Utils.checkNotNull(schedule, "schedule");
            this.schedule = schedule;
            return this;
        }

        public Builder sourceId(String sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = sourceId;
            return this;
        }

        public Builder status(ConnectionStatusEnum status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public ConnectionResponse build() {
            if (dataResidency == null) {
                dataResidency = _SINGLETON_VALUE_DataResidency.value();
            }
            if (namespaceDefinition == null) {
                namespaceDefinition = _SINGLETON_VALUE_NamespaceDefinition.value();
            }
            if (nonBreakingSchemaUpdatesBehavior == null) {
                nonBreakingSchemaUpdatesBehavior = _SINGLETON_VALUE_NonBreakingSchemaUpdatesBehavior.value();
            }
            return new ConnectionResponse(
                configurations,
                connectionId,
                dataResidency,
                destinationId,
                name,
                namespaceDefinition,
                namespaceFormat,
                nonBreakingSchemaUpdatesBehavior,
                prefix,
                schedule,
                sourceId,
                status,
                workspaceId);
        }

        private static final LazySingletonValue<Optional<? extends GeographyEnum>> _SINGLETON_VALUE_DataResidency =
                new LazySingletonValue<>(
                        "dataResidency",
                        "\"auto\"",
                        new TypeReference<Optional<? extends GeographyEnum>>() {});

        private static final LazySingletonValue<Optional<? extends NamespaceDefinitionEnum>> _SINGLETON_VALUE_NamespaceDefinition =
                new LazySingletonValue<>(
                        "namespaceDefinition",
                        "\"destination\"",
                        new TypeReference<Optional<? extends NamespaceDefinitionEnum>>() {});

        private static final LazySingletonValue<Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum>> _SINGLETON_VALUE_NonBreakingSchemaUpdatesBehavior =
                new LazySingletonValue<>(
                        "nonBreakingSchemaUpdatesBehavior",
                        "\"ignore\"",
                        new TypeReference<Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum>>() {});
    }
}

