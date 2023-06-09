/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing - This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
 */
public enum DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing {
    DELETE_ALL_TMP_FILES_FROM_GCS("Delete all tmp files from GCS"),
    KEEP_ALL_TMP_FILES_IN_GCS("Keep all tmp files in GCS");

    @JsonValue
    public final String value;

    private DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing(String value) {
        this.value = value;
    }
}
