/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum DropboxSign {
    DROPBOX_SIGN("dropbox-sign");

    @JsonValue
    private final String value;

    private DropboxSign(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
