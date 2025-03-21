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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class ConnectionCreateRequest {

    /**
     * A list of configured stream options for a connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("configurations")
    private Optional<? extends StreamConfigurations> configurations;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataResidency")
    private Optional<? extends GeographyEnum> dataResidency;

    @JsonProperty("destinationId")
    private String destinationId;

    /**
     * Optional name of the connection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Define the location where the data will be stored in the destination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceDefinition")
    private Optional<? extends NamespaceDefinitionEnum> namespaceDefinition;

    /**
     * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceFormat")
    private Optional<String> namespaceFormat;

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nonBreakingSchemaUpdatesBehavior")
    private Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior;

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    private Optional<String> prefix;

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schedule")
    private Optional<? extends AirbyteApiConnectionSchedule> schedule;

    @JsonProperty("sourceId")
    private String sourceId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends ConnectionStatusEnum> status;

    @JsonCreator
    public ConnectionCreateRequest(
            @JsonProperty("configurations") Optional<? extends StreamConfigurations> configurations,
            @JsonProperty("dataResidency") Optional<? extends GeographyEnum> dataResidency,
            @JsonProperty("destinationId") String destinationId,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("namespaceDefinition") Optional<? extends NamespaceDefinitionEnum> namespaceDefinition,
            @JsonProperty("namespaceFormat") Optional<String> namespaceFormat,
            @JsonProperty("nonBreakingSchemaUpdatesBehavior") Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior,
            @JsonProperty("prefix") Optional<String> prefix,
            @JsonProperty("schedule") Optional<? extends AirbyteApiConnectionSchedule> schedule,
            @JsonProperty("sourceId") String sourceId,
            @JsonProperty("status") Optional<? extends ConnectionStatusEnum> status) {
        Utils.checkNotNull(configurations, "configurations");
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
        this.configurations = configurations;
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
    }
    
    public ConnectionCreateRequest(
            String destinationId,
            String sourceId) {
        this(Optional.empty(), Optional.empty(), destinationId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), sourceId, Optional.empty());
    }

    /**
     * A list of configured stream options for a connection.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StreamConfigurations> configurations() {
        return (Optional<StreamConfigurations>) configurations;
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

    /**
     * Optional name of the connection
     */
    @JsonIgnore
    public Optional<String> name() {
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

    /**
     * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
     */
    @JsonIgnore
    public Optional<String> namespaceFormat() {
        return namespaceFormat;
    }

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior() {
        return (Optional<NonBreakingSchemaUpdatesBehaviorEnum>) nonBreakingSchemaUpdatesBehavior;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
     */
    @JsonIgnore
    public Optional<String> prefix() {
        return prefix;
    }

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AirbyteApiConnectionSchedule> schedule() {
        return (Optional<AirbyteApiConnectionSchedule>) schedule;
    }

    @JsonIgnore
    public String sourceId() {
        return sourceId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectionStatusEnum> status() {
        return (Optional<ConnectionStatusEnum>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of configured stream options for a connection.
     */
    public ConnectionCreateRequest withConfigurations(StreamConfigurations configurations) {
        Utils.checkNotNull(configurations, "configurations");
        this.configurations = Optional.ofNullable(configurations);
        return this;
    }

    /**
     * A list of configured stream options for a connection.
     */
    public ConnectionCreateRequest withConfigurations(Optional<? extends StreamConfigurations> configurations) {
        Utils.checkNotNull(configurations, "configurations");
        this.configurations = configurations;
        return this;
    }

    public ConnectionCreateRequest withDataResidency(GeographyEnum dataResidency) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        this.dataResidency = Optional.ofNullable(dataResidency);
        return this;
    }

    public ConnectionCreateRequest withDataResidency(Optional<? extends GeographyEnum> dataResidency) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        this.dataResidency = dataResidency;
        return this;
    }

    public ConnectionCreateRequest withDestinationId(String destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = destinationId;
        return this;
    }

    /**
     * Optional name of the connection
     */
    public ConnectionCreateRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Optional name of the connection
     */
    public ConnectionCreateRequest withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Define the location where the data will be stored in the destination
     */
    public ConnectionCreateRequest withNamespaceDefinition(NamespaceDefinitionEnum namespaceDefinition) {
        Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
        this.namespaceDefinition = Optional.ofNullable(namespaceDefinition);
        return this;
    }

    /**
     * Define the location where the data will be stored in the destination
     */
    public ConnectionCreateRequest withNamespaceDefinition(Optional<? extends NamespaceDefinitionEnum> namespaceDefinition) {
        Utils.checkNotNull(namespaceDefinition, "namespaceDefinition");
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }

    /**
     * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
     */
    public ConnectionCreateRequest withNamespaceFormat(String namespaceFormat) {
        Utils.checkNotNull(namespaceFormat, "namespaceFormat");
        this.namespaceFormat = Optional.ofNullable(namespaceFormat);
        return this;
    }

    /**
     * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
     */
    public ConnectionCreateRequest withNamespaceFormat(Optional<String> namespaceFormat) {
        Utils.checkNotNull(namespaceFormat, "namespaceFormat");
        this.namespaceFormat = namespaceFormat;
        return this;
    }

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    public ConnectionCreateRequest withNonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnum nonBreakingSchemaUpdatesBehavior) {
        Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
        this.nonBreakingSchemaUpdatesBehavior = Optional.ofNullable(nonBreakingSchemaUpdatesBehavior);
        return this;
    }

    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    public ConnectionCreateRequest withNonBreakingSchemaUpdatesBehavior(Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior) {
        Utils.checkNotNull(nonBreakingSchemaUpdatesBehavior, "nonBreakingSchemaUpdatesBehavior");
        this.nonBreakingSchemaUpdatesBehavior = nonBreakingSchemaUpdatesBehavior;
        return this;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
     */
    public ConnectionCreateRequest withPrefix(String prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = Optional.ofNullable(prefix);
        return this;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
     */
    public ConnectionCreateRequest withPrefix(Optional<String> prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = prefix;
        return this;
    }

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    public ConnectionCreateRequest withSchedule(AirbyteApiConnectionSchedule schedule) {
        Utils.checkNotNull(schedule, "schedule");
        this.schedule = Optional.ofNullable(schedule);
        return this;
    }

    /**
     * schedule for when the the connection should run, per the schedule type
     */
    public ConnectionCreateRequest withSchedule(Optional<? extends AirbyteApiConnectionSchedule> schedule) {
        Utils.checkNotNull(schedule, "schedule");
        this.schedule = schedule;
        return this;
    }

    public ConnectionCreateRequest withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
        return this;
    }

    public ConnectionCreateRequest withStatus(ConnectionStatusEnum status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public ConnectionCreateRequest withStatus(Optional<? extends ConnectionStatusEnum> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        ConnectionCreateRequest other = (ConnectionCreateRequest) o;
        return 
            Objects.deepEquals(this.configurations, other.configurations) &&
            Objects.deepEquals(this.dataResidency, other.dataResidency) &&
            Objects.deepEquals(this.destinationId, other.destinationId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.namespaceDefinition, other.namespaceDefinition) &&
            Objects.deepEquals(this.namespaceFormat, other.namespaceFormat) &&
            Objects.deepEquals(this.nonBreakingSchemaUpdatesBehavior, other.nonBreakingSchemaUpdatesBehavior) &&
            Objects.deepEquals(this.prefix, other.prefix) &&
            Objects.deepEquals(this.schedule, other.schedule) &&
            Objects.deepEquals(this.sourceId, other.sourceId) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            configurations,
            dataResidency,
            destinationId,
            name,
            namespaceDefinition,
            namespaceFormat,
            nonBreakingSchemaUpdatesBehavior,
            prefix,
            schedule,
            sourceId,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionCreateRequest.class,
                "configurations", configurations,
                "dataResidency", dataResidency,
                "destinationId", destinationId,
                "name", name,
                "namespaceDefinition", namespaceDefinition,
                "namespaceFormat", namespaceFormat,
                "nonBreakingSchemaUpdatesBehavior", nonBreakingSchemaUpdatesBehavior,
                "prefix", prefix,
                "schedule", schedule,
                "sourceId", sourceId,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends StreamConfigurations> configurations = Optional.empty();
 
        private Optional<? extends GeographyEnum> dataResidency;
 
        private String destinationId;
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends NamespaceDefinitionEnum> namespaceDefinition;
 
        private Optional<String> namespaceFormat;
 
        private Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum> nonBreakingSchemaUpdatesBehavior;
 
        private Optional<String> prefix = Optional.empty();
 
        private Optional<? extends AirbyteApiConnectionSchedule> schedule = Optional.empty();
 
        private String sourceId;
 
        private Optional<? extends ConnectionStatusEnum> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of configured stream options for a connection.
         */
        public Builder configurations(StreamConfigurations configurations) {
            Utils.checkNotNull(configurations, "configurations");
            this.configurations = Optional.ofNullable(configurations);
            return this;
        }

        /**
         * A list of configured stream options for a connection.
         */
        public Builder configurations(Optional<? extends StreamConfigurations> configurations) {
            Utils.checkNotNull(configurations, "configurations");
            this.configurations = configurations;
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

        /**
         * Optional name of the connection
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Optional name of the connection
         */
        public Builder name(Optional<String> name) {
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

        /**
         * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
         */
        public Builder namespaceFormat(String namespaceFormat) {
            Utils.checkNotNull(namespaceFormat, "namespaceFormat");
            this.namespaceFormat = Optional.ofNullable(namespaceFormat);
            return this;
        }

        /**
         * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
         */
        public Builder namespaceFormat(Optional<String> namespaceFormat) {
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

        /**
         * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
         */
        public Builder prefix(String prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = Optional.ofNullable(prefix);
            return this;
        }

        /**
         * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
         */
        public Builder prefix(Optional<String> prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = prefix;
            return this;
        }

        /**
         * schedule for when the the connection should run, per the schedule type
         */
        public Builder schedule(AirbyteApiConnectionSchedule schedule) {
            Utils.checkNotNull(schedule, "schedule");
            this.schedule = Optional.ofNullable(schedule);
            return this;
        }

        /**
         * schedule for when the the connection should run, per the schedule type
         */
        public Builder schedule(Optional<? extends AirbyteApiConnectionSchedule> schedule) {
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
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends ConnectionStatusEnum> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public ConnectionCreateRequest build() {
            if (dataResidency == null) {
                dataResidency = _SINGLETON_VALUE_DataResidency.value();
            }
            if (namespaceDefinition == null) {
                namespaceDefinition = _SINGLETON_VALUE_NamespaceDefinition.value();
            }
            if (namespaceFormat == null) {
                namespaceFormat = _SINGLETON_VALUE_NamespaceFormat.value();
            }
            if (nonBreakingSchemaUpdatesBehavior == null) {
                nonBreakingSchemaUpdatesBehavior = _SINGLETON_VALUE_NonBreakingSchemaUpdatesBehavior.value();
            }            return new ConnectionCreateRequest(
                configurations,
                dataResidency,
                destinationId,
                name,
                namespaceDefinition,
                namespaceFormat,
                nonBreakingSchemaUpdatesBehavior,
                prefix,
                schedule,
                sourceId,
                status);
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

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_NamespaceFormat =
                new LazySingletonValue<>(
                        "namespaceFormat",
                        "null",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum>> _SINGLETON_VALUE_NonBreakingSchemaUpdatesBehavior =
                new LazySingletonValue<>(
                        "nonBreakingSchemaUpdatesBehavior",
                        "\"ignore\"",
                        new TypeReference<Optional<? extends NonBreakingSchemaUpdatesBehaviorEnum>>() {});
    }
}

