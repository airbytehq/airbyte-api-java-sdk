/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SourceSftpBulkDeliveryType {
    USE_RECORDS_TRANSFER("use_records_transfer");

    @JsonValue
    private final String value;

    private SourceSftpBulkDeliveryType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
