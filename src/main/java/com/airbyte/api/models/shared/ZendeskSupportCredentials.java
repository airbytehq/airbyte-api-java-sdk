/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ZendeskSupportCredentials {

    /**
     * The OAuth client's ID. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<? extends String> clientId;

    /**
     * The OAuth client secret. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<? extends String> clientSecret;

    @JsonCreator
    public ZendeskSupportCredentials(
            @JsonProperty("client_id") Optional<? extends String> clientId,
            @JsonProperty("client_secret") Optional<? extends String> clientSecret) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
    
    public ZendeskSupportCredentials() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The OAuth client's ID. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientId() {
        return (Optional<String>) clientId;
    }

    /**
     * The OAuth client secret. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientSecret() {
        return (Optional<String>) clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The OAuth client's ID. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    public ZendeskSupportCredentials withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * The OAuth client's ID. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    public ZendeskSupportCredentials withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The OAuth client secret. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    public ZendeskSupportCredentials withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * The OAuth client secret. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
     */
    public ZendeskSupportCredentials withClientSecret(Optional<? extends String> clientSecret) {
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
        ZendeskSupportCredentials other = (ZendeskSupportCredentials) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            clientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ZendeskSupportCredentials.class,
                "clientId", clientId,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The OAuth client's ID. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * The OAuth client's ID. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
         */
        public Builder clientId(Optional<? extends String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The OAuth client secret. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * The OAuth client secret. See &lt;a href="https://docs.searchunify.com/Content/Content-Sources/Zendesk-Authentication-OAuth-Client-ID-Secret.htm#:~:text=Get%20Client%20ID%20and%20Client%20Secret&amp;text=Go%20to%20OAuth%20Clients%20and,will%20be%20displayed%20only%20once."&gt;this guide&lt;/a&gt; for more information.
         */
        public Builder clientSecret(Optional<? extends String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public ZendeskSupportCredentials build() {
            return new ZendeskSupportCredentials(
                clientId,
                clientSecret);
        }
    }
}

