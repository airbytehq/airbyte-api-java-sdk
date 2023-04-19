/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderHTTPSPublicWeb - The storage Provider or Location of the file(s) which should be replicated.
 */
public class SourceFileSecureProviderHTTPSPublicWeb {
    @JsonProperty("storage")
    public SourceFileSecureProviderHTTPSPublicWebStorageEnum storage;
    public SourceFileSecureProviderHTTPSPublicWeb withStorage(SourceFileSecureProviderHTTPSPublicWebStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
    /**
     * Add User-Agent to request
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_agent")
    public Boolean userAgent;
    public SourceFileSecureProviderHTTPSPublicWeb withUserAgent(Boolean userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    
}
