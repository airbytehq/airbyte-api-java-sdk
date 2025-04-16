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

public class SourcePrimetric {

    /**
     * The Client ID of your Primetric developer application. The Client ID is visible &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your Primetric developer application. You can manage your client's credentials &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("sourceType")
    private Primetric sourceType;

    @JsonCreator
    public SourcePrimetric(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * The Client ID of your Primetric developer application. The Client ID is visible &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Primetric developer application. You can manage your client's credentials &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public Primetric sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The Client ID of your Primetric developer application. The Client ID is visible &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
     */
    public SourcePrimetric withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Primetric developer application. You can manage your client's credentials &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
     */
    public SourcePrimetric withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        SourcePrimetric other = (SourcePrimetric) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePrimetric.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your Primetric developer application. The Client ID is visible &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Primetric developer application. You can manage your client's credentials &lt;a href=\"https://app.primetric.com/administrator/integrations"&gt;here&lt;/a&gt;.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SourcePrimetric build() {
            return new SourcePrimetric(
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<Primetric> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"primetric\"",
                        new TypeReference<Primetric>() {});
    }
}
