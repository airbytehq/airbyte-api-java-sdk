/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollectionDeletionsEnabled - &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
 * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
 * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
 * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
 */
public class SourceFaunaCollectionDeletionsEnabled {
    /**
     * Name of the "deleted at" column.
     */
    @JsonProperty("column")
    public String column;
    public SourceFaunaCollectionDeletionsEnabled withColumn(String column) {
        this.column = column;
        return this;
    }
    
    @JsonProperty("deletion_mode")
    public SourceFaunaCollectionDeletionsEnabledDeletionModeEnum deletionMode;
    public SourceFaunaCollectionDeletionsEnabled withDeletionMode(SourceFaunaCollectionDeletionsEnabledDeletionModeEnum deletionMode) {
        this.deletionMode = deletionMode;
        return this;
    }
    

    public SourceFaunaCollectionDeletionsEnabled(@JsonProperty("column") String column, @JsonProperty("deletion_mode") SourceFaunaCollectionDeletionsEnabledDeletionModeEnum deletionMode) {
    this.column = column;
this.deletionMode = deletionMode;
  }
}
