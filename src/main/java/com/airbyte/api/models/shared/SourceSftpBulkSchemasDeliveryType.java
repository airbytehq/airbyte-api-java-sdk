/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SourceSftpBulkSchemasDeliveryType {
    USE_FILE_TRANSFER("use_file_transfer");

    @JsonValue
    private final String value;

    private SourceSftpBulkSchemasDeliveryType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
