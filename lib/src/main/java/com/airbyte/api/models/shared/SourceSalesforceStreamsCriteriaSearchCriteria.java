/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceSalesforceStreamsCriteriaSearchCriteria {
    STARTS_WITH("starts with"),
    ENDS_WITH("ends with"),
    CONTAINS("contains"),
    EXACTS("exacts"),
    STARTS_NOT_WITH("starts not with"),
    ENDS_NOT_WITH("ends not with"),
    NOT_CONTAINS("not contains"),
    NOT_EXACTS("not exacts");

    @JsonValue
    public final String value;

    private SourceSalesforceStreamsCriteriaSearchCriteria(String value) {
        this.value = value;
    }
}
