/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollectionDeletionsDisabled - &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
 * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
 * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
 * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
 */

public class SourceFaunaCollectionDeletionsDisabled {
    @JsonProperty("deletion_mode")
    public SourceFaunaCollectionDeletionsDisabledDeletionMode deletionMode;

    public SourceFaunaCollectionDeletionsDisabled withDeletionMode(SourceFaunaCollectionDeletionsDisabledDeletionMode deletionMode) {
        this.deletionMode = deletionMode;
        return this;
    }
    
    public SourceFaunaCollectionDeletionsDisabled(@JsonProperty("deletion_mode") SourceFaunaCollectionDeletionsDisabledDeletionMode deletionMode) {
        this.deletionMode = deletionMode;
  }
}
