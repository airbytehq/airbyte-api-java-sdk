/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * StreamProperties
 * 
 * <p>The stream properties associated with a connection.
 */
public class StreamProperties {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultCursorField")
    private Optional<? extends List<String>> defaultCursorField;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("propertyFields")
    private Optional<? extends List<List<String>>> propertyFields;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceDefinedCursorField")
    private Optional<Boolean> sourceDefinedCursorField;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceDefinedPrimaryKey")
    private Optional<? extends List<List<String>>> sourceDefinedPrimaryKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streamName")
    private Optional<String> streamName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncModes")
    private Optional<? extends List<ConnectionSyncModeEnum>> syncModes;

    @JsonCreator
    public StreamProperties(
            @JsonProperty("defaultCursorField") Optional<? extends List<String>> defaultCursorField,
            @JsonProperty("propertyFields") Optional<? extends List<List<String>>> propertyFields,
            @JsonProperty("sourceDefinedCursorField") Optional<Boolean> sourceDefinedCursorField,
            @JsonProperty("sourceDefinedPrimaryKey") Optional<? extends List<List<String>>> sourceDefinedPrimaryKey,
            @JsonProperty("streamName") Optional<String> streamName,
            @JsonProperty("syncModes") Optional<? extends List<ConnectionSyncModeEnum>> syncModes) {
        Utils.checkNotNull(defaultCursorField, "defaultCursorField");
        Utils.checkNotNull(propertyFields, "propertyFields");
        Utils.checkNotNull(sourceDefinedCursorField, "sourceDefinedCursorField");
        Utils.checkNotNull(sourceDefinedPrimaryKey, "sourceDefinedPrimaryKey");
        Utils.checkNotNull(streamName, "streamName");
        Utils.checkNotNull(syncModes, "syncModes");
        this.defaultCursorField = defaultCursorField;
        this.propertyFields = propertyFields;
        this.sourceDefinedCursorField = sourceDefinedCursorField;
        this.sourceDefinedPrimaryKey = sourceDefinedPrimaryKey;
        this.streamName = streamName;
        this.syncModes = syncModes;
    }
    
    public StreamProperties() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> defaultCursorField() {
        return (Optional<List<String>>) defaultCursorField;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<List<String>>> propertyFields() {
        return (Optional<List<List<String>>>) propertyFields;
    }

    @JsonIgnore
    public Optional<Boolean> sourceDefinedCursorField() {
        return sourceDefinedCursorField;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<List<String>>> sourceDefinedPrimaryKey() {
        return (Optional<List<List<String>>>) sourceDefinedPrimaryKey;
    }

    @JsonIgnore
    public Optional<String> streamName() {
        return streamName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ConnectionSyncModeEnum>> syncModes() {
        return (Optional<List<ConnectionSyncModeEnum>>) syncModes;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public StreamProperties withDefaultCursorField(List<String> defaultCursorField) {
        Utils.checkNotNull(defaultCursorField, "defaultCursorField");
        this.defaultCursorField = Optional.ofNullable(defaultCursorField);
        return this;
    }

    public StreamProperties withDefaultCursorField(Optional<? extends List<String>> defaultCursorField) {
        Utils.checkNotNull(defaultCursorField, "defaultCursorField");
        this.defaultCursorField = defaultCursorField;
        return this;
    }

    public StreamProperties withPropertyFields(List<List<String>> propertyFields) {
        Utils.checkNotNull(propertyFields, "propertyFields");
        this.propertyFields = Optional.ofNullable(propertyFields);
        return this;
    }

    public StreamProperties withPropertyFields(Optional<? extends List<List<String>>> propertyFields) {
        Utils.checkNotNull(propertyFields, "propertyFields");
        this.propertyFields = propertyFields;
        return this;
    }

    public StreamProperties withSourceDefinedCursorField(boolean sourceDefinedCursorField) {
        Utils.checkNotNull(sourceDefinedCursorField, "sourceDefinedCursorField");
        this.sourceDefinedCursorField = Optional.ofNullable(sourceDefinedCursorField);
        return this;
    }

    public StreamProperties withSourceDefinedCursorField(Optional<Boolean> sourceDefinedCursorField) {
        Utils.checkNotNull(sourceDefinedCursorField, "sourceDefinedCursorField");
        this.sourceDefinedCursorField = sourceDefinedCursorField;
        return this;
    }

    public StreamProperties withSourceDefinedPrimaryKey(List<List<String>> sourceDefinedPrimaryKey) {
        Utils.checkNotNull(sourceDefinedPrimaryKey, "sourceDefinedPrimaryKey");
        this.sourceDefinedPrimaryKey = Optional.ofNullable(sourceDefinedPrimaryKey);
        return this;
    }

    public StreamProperties withSourceDefinedPrimaryKey(Optional<? extends List<List<String>>> sourceDefinedPrimaryKey) {
        Utils.checkNotNull(sourceDefinedPrimaryKey, "sourceDefinedPrimaryKey");
        this.sourceDefinedPrimaryKey = sourceDefinedPrimaryKey;
        return this;
    }

    public StreamProperties withStreamName(String streamName) {
        Utils.checkNotNull(streamName, "streamName");
        this.streamName = Optional.ofNullable(streamName);
        return this;
    }

    public StreamProperties withStreamName(Optional<String> streamName) {
        Utils.checkNotNull(streamName, "streamName");
        this.streamName = streamName;
        return this;
    }

    public StreamProperties withSyncModes(List<ConnectionSyncModeEnum> syncModes) {
        Utils.checkNotNull(syncModes, "syncModes");
        this.syncModes = Optional.ofNullable(syncModes);
        return this;
    }

    public StreamProperties withSyncModes(Optional<? extends List<ConnectionSyncModeEnum>> syncModes) {
        Utils.checkNotNull(syncModes, "syncModes");
        this.syncModes = syncModes;
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
        StreamProperties other = (StreamProperties) o;
        return 
            Objects.deepEquals(this.defaultCursorField, other.defaultCursorField) &&
            Objects.deepEquals(this.propertyFields, other.propertyFields) &&
            Objects.deepEquals(this.sourceDefinedCursorField, other.sourceDefinedCursorField) &&
            Objects.deepEquals(this.sourceDefinedPrimaryKey, other.sourceDefinedPrimaryKey) &&
            Objects.deepEquals(this.streamName, other.streamName) &&
            Objects.deepEquals(this.syncModes, other.syncModes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            defaultCursorField,
            propertyFields,
            sourceDefinedCursorField,
            sourceDefinedPrimaryKey,
            streamName,
            syncModes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StreamProperties.class,
                "defaultCursorField", defaultCursorField,
                "propertyFields", propertyFields,
                "sourceDefinedCursorField", sourceDefinedCursorField,
                "sourceDefinedPrimaryKey", sourceDefinedPrimaryKey,
                "streamName", streamName,
                "syncModes", syncModes);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<String>> defaultCursorField = Optional.empty();
 
        private Optional<? extends List<List<String>>> propertyFields = Optional.empty();
 
        private Optional<Boolean> sourceDefinedCursorField = Optional.empty();
 
        private Optional<? extends List<List<String>>> sourceDefinedPrimaryKey = Optional.empty();
 
        private Optional<String> streamName = Optional.empty();
 
        private Optional<? extends List<ConnectionSyncModeEnum>> syncModes = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder defaultCursorField(List<String> defaultCursorField) {
            Utils.checkNotNull(defaultCursorField, "defaultCursorField");
            this.defaultCursorField = Optional.ofNullable(defaultCursorField);
            return this;
        }

        public Builder defaultCursorField(Optional<? extends List<String>> defaultCursorField) {
            Utils.checkNotNull(defaultCursorField, "defaultCursorField");
            this.defaultCursorField = defaultCursorField;
            return this;
        }

        public Builder propertyFields(List<List<String>> propertyFields) {
            Utils.checkNotNull(propertyFields, "propertyFields");
            this.propertyFields = Optional.ofNullable(propertyFields);
            return this;
        }

        public Builder propertyFields(Optional<? extends List<List<String>>> propertyFields) {
            Utils.checkNotNull(propertyFields, "propertyFields");
            this.propertyFields = propertyFields;
            return this;
        }

        public Builder sourceDefinedCursorField(boolean sourceDefinedCursorField) {
            Utils.checkNotNull(sourceDefinedCursorField, "sourceDefinedCursorField");
            this.sourceDefinedCursorField = Optional.ofNullable(sourceDefinedCursorField);
            return this;
        }

        public Builder sourceDefinedCursorField(Optional<Boolean> sourceDefinedCursorField) {
            Utils.checkNotNull(sourceDefinedCursorField, "sourceDefinedCursorField");
            this.sourceDefinedCursorField = sourceDefinedCursorField;
            return this;
        }

        public Builder sourceDefinedPrimaryKey(List<List<String>> sourceDefinedPrimaryKey) {
            Utils.checkNotNull(sourceDefinedPrimaryKey, "sourceDefinedPrimaryKey");
            this.sourceDefinedPrimaryKey = Optional.ofNullable(sourceDefinedPrimaryKey);
            return this;
        }

        public Builder sourceDefinedPrimaryKey(Optional<? extends List<List<String>>> sourceDefinedPrimaryKey) {
            Utils.checkNotNull(sourceDefinedPrimaryKey, "sourceDefinedPrimaryKey");
            this.sourceDefinedPrimaryKey = sourceDefinedPrimaryKey;
            return this;
        }

        public Builder streamName(String streamName) {
            Utils.checkNotNull(streamName, "streamName");
            this.streamName = Optional.ofNullable(streamName);
            return this;
        }

        public Builder streamName(Optional<String> streamName) {
            Utils.checkNotNull(streamName, "streamName");
            this.streamName = streamName;
            return this;
        }

        public Builder syncModes(List<ConnectionSyncModeEnum> syncModes) {
            Utils.checkNotNull(syncModes, "syncModes");
            this.syncModes = Optional.ofNullable(syncModes);
            return this;
        }

        public Builder syncModes(Optional<? extends List<ConnectionSyncModeEnum>> syncModes) {
            Utils.checkNotNull(syncModes, "syncModes");
            this.syncModes = syncModes;
            return this;
        }
        
        public StreamProperties build() {
            return new StreamProperties(
                defaultCursorField,
                propertyFields,
                sourceDefinedCursorField,
                sourceDefinedPrimaryKey,
                streamName,
                syncModes);
        }
    }
}
