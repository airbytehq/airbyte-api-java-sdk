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


public class SourceMailerlite {

    /**
     * Your API Token. See &lt;a href="https://developers.mailerlite.com/docs/#authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("sourceType")
    private Mailerlite sourceType;

    @JsonCreator
    public SourceMailerlite(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Your API Token. See &lt;a href="https://developers.mailerlite.com/docs/#authentication"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public Mailerlite sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your API Token. See &lt;a href="https://developers.mailerlite.com/docs/#authentication"&gt;here&lt;/a&gt;.
     */
    public SourceMailerlite withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
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
        SourceMailerlite other = (SourceMailerlite) o;
        return 
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMailerlite.class,
                "apiToken", apiToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Token. See &lt;a href="https://developers.mailerlite.com/docs/#authentication"&gt;here&lt;/a&gt;.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public SourceMailerlite build() {
            return new SourceMailerlite(
                apiToken);
        }

        private static final LazySingletonValue<Mailerlite> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mailerlite\"",
                        new TypeReference<Mailerlite>() {});
    }
}
