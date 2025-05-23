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

public class SourceVantage {

    /**
     * Your API Access token. See &lt;a href="https://vantage.readme.io/reference/authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("sourceType")
    private Vantage sourceType;

    @JsonCreator
    public SourceVantage(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Your API Access token. See &lt;a href="https://vantage.readme.io/reference/authentication"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Vantage sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your API Access token. See &lt;a href="https://vantage.readme.io/reference/authentication"&gt;here&lt;/a&gt;.
     */
    public SourceVantage withAccessToken(String accessToken) {
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
        SourceVantage other = (SourceVantage) o;
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
        return Utils.toString(SourceVantage.class,
                "accessToken", accessToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accessToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Access token. See &lt;a href="https://vantage.readme.io/reference/authentication"&gt;here&lt;/a&gt;.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public SourceVantage build() {
            return new SourceVantage(
                accessToken);
        }

        private static final LazySingletonValue<Vantage> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"vantage\"",
                        new TypeReference<Vantage>() {});
    }
}
