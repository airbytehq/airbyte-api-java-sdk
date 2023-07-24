/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StreamProperties - The stream properties associated with a connection.
 */

public class StreamProperties {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultCursorField")
    public String[] defaultCursorField;

    public StreamProperties withDefaultCursorField(String[] defaultCursorField) {
        this.defaultCursorField = defaultCursorField;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("propertyFields")
    public String[][] propertyFields;

    public StreamProperties withPropertyFields(String[][] propertyFields) {
        this.propertyFields = propertyFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceDefinedCursorField")
    public Boolean sourceDefinedCursorField;

    public StreamProperties withSourceDefinedCursorField(Boolean sourceDefinedCursorField) {
        this.sourceDefinedCursorField = sourceDefinedCursorField;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceDefinedPrimaryKey")
    public String[][] sourceDefinedPrimaryKey;

    public StreamProperties withSourceDefinedPrimaryKey(String[][] sourceDefinedPrimaryKey) {
        this.sourceDefinedPrimaryKey = sourceDefinedPrimaryKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streamName")
    public String streamName;

    public StreamProperties withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncModes")
    public ConnectionSyncModeEnum[] syncModes;

    public StreamProperties withSyncModes(ConnectionSyncModeEnum[] syncModes) {
        this.syncModes = syncModes;
        return this;
    }
    
    public StreamProperties(){}
}
