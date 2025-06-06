/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class SourceLaunchdarkly {

    /**
     * Your Access token. See &lt;a href="https://apidocs.launchdarkly.com/#section/Overview/Authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("sourceType")
    private Launchdarkly sourceType;

    @JsonCreator
    public SourceLaunchdarkly(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Your Access token. See &lt;a href="https://apidocs.launchdarkly.com/#section/Overview/Authentication"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Launchdarkly sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your Access token. See &lt;a href="https://apidocs.launchdarkly.com/#section/Overview/Authentication"&gt;here&lt;/a&gt;.
     */
    public SourceLaunchdarkly withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceLaunchdarkly other = (SourceLaunchdarkly) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLaunchdarkly.class,
                "accessToken", accessToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accessToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your Access token. See &lt;a href="https://apidocs.launchdarkly.com/#section/Overview/Authentication"&gt;here&lt;/a&gt;.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public SourceLaunchdarkly build() {
            return new SourceLaunchdarkly(
                accessToken);
        }

        private static final LazySingletonValue<Launchdarkly> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"launchdarkly\"",
                        new TypeReference<Launchdarkly>() {});
    }
}
