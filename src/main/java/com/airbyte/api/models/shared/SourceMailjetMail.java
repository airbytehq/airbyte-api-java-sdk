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


public class SourceMailjetMail {

    /**
     * Your API Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Your API Secret Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key_secret")
    private String apiKeySecret;

    @JsonProperty("sourceType")
    private MailjetMail sourceType;

    @JsonCreator
    public SourceMailjetMail(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("api_key_secret") String apiKeySecret) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(apiKeySecret, "apiKeySecret");
        this.apiKey = apiKey;
        this.apiKeySecret = apiKeySecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Your API Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Your API Secret Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiKeySecret() {
        return apiKeySecret;
    }

    @JsonIgnore
    public MailjetMail sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your API Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
     */
    public SourceMailjetMail withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Your API Secret Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
     */
    public SourceMailjetMail withApiKeySecret(String apiKeySecret) {
        Utils.checkNotNull(apiKeySecret, "apiKeySecret");
        this.apiKeySecret = apiKeySecret;
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
        SourceMailjetMail other = (SourceMailjetMail) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.apiKeySecret, other.apiKeySecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            apiKeySecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMailjetMail.class,
                "apiKey", apiKey,
                "apiKeySecret", apiKeySecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String apiKeySecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Your API Secret Key. See &lt;a href="https://dev.mailjet.com/email/guides/#authentication"&gt;here&lt;/a&gt;.
         */
        public Builder apiKeySecret(String apiKeySecret) {
            Utils.checkNotNull(apiKeySecret, "apiKeySecret");
            this.apiKeySecret = apiKeySecret;
            return this;
        }
        
        public SourceMailjetMail build() {
            return new SourceMailjetMail(
                apiKey,
                apiKeySecret);
        }

        private static final LazySingletonValue<MailjetMail> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mailjet-mail\"",
                        new TypeReference<MailjetMail>() {});
    }
}
