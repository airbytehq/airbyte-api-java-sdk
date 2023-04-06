/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLinkedinPages - The values required to configure the source.
 */
public class SourceLinkedinPages {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceLinkedinPages withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Specify the Organization ID
     */
    @JsonProperty("org_id")
    public String orgId;
    public SourceLinkedinPages withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceLinkedinPagesLinkedinPagesEnum sourceType;
    public SourceLinkedinPages withSourceType(SourceLinkedinPagesLinkedinPagesEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
