/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DestinationCobra {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends AuthType> authType;

    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client ID&lt;/a&gt;
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client secret&lt;/a&gt;
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("destinationType")
    private Cobra destinationType;

    /**
     * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    private Optional<Boolean> isSandbox;

    /**
     * If enabled, the records content will be printed as part of the log in case of failure which allows for easier debugging.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("print_record_content_on_error")
    private Optional<Boolean> printRecordContentOnError;

    /**
     * Enter your application's &lt;a href="https://developer.salesforce.com/docs/atlas.en-us.mobile_sdk.meta/mobile_sdk/oauth_refresh_token_flow.htm"&gt;Salesforce Refresh Token&lt;/a&gt; used for Airbyte to access your Salesforce account.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("stream_mappings")
    private List<StreamMapping> streamMappings;

    /**
     * The order in which the streams should be synced. Streams are synced in the order they are listed. Only those streams will be synced so make sure all the input streams are configured here.
     */
    @JsonProperty("stream_order")
    private List<String> streamOrder;

    @JsonCreator
    public DestinationCobra(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("is_sandbox") Optional<Boolean> isSandbox,
            @JsonProperty("print_record_content_on_error") Optional<Boolean> printRecordContentOnError,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("stream_mappings") List<StreamMapping> streamMappings,
            @JsonProperty("stream_order") List<String> streamOrder) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(isSandbox, "isSandbox");
        Utils.checkNotNull(printRecordContentOnError, "printRecordContentOnError");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(streamMappings, "streamMappings");
        Utils.checkNotNull(streamOrder, "streamOrder");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.isSandbox = isSandbox;
        this.printRecordContentOnError = printRecordContentOnError;
        this.refreshToken = refreshToken;
        this.streamMappings = streamMappings;
        this.streamOrder = streamOrder;
    }
    
    public DestinationCobra(
            String clientId,
            String clientSecret,
            String refreshToken,
            List<StreamMapping> streamMappings,
            List<String> streamOrder) {
        this(clientId, clientSecret, Optional.empty(), Optional.empty(), refreshToken, streamMappings, streamOrder);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthType> authType() {
        return (Optional<AuthType>) authType;
    }

    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client ID&lt;/a&gt;
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client secret&lt;/a&gt;
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public Cobra destinationType() {
        return destinationType;
    }

    /**
     * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
     */
    @JsonIgnore
    public Optional<Boolean> isSandbox() {
        return isSandbox;
    }

    /**
     * If enabled, the records content will be printed as part of the log in case of failure which allows for easier debugging.
     */
    @JsonIgnore
    public Optional<Boolean> printRecordContentOnError() {
        return printRecordContentOnError;
    }

    /**
     * Enter your application's &lt;a href="https://developer.salesforce.com/docs/atlas.en-us.mobile_sdk.meta/mobile_sdk/oauth_refresh_token_flow.htm"&gt;Salesforce Refresh Token&lt;/a&gt; used for Airbyte to access your Salesforce account.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    @JsonIgnore
    public List<StreamMapping> streamMappings() {
        return streamMappings;
    }

    /**
     * The order in which the streams should be synced. Streams are synced in the order they are listed. Only those streams will be synced so make sure all the input streams are configured here.
     */
    @JsonIgnore
    public List<String> streamOrder() {
        return streamOrder;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client ID&lt;/a&gt;
     */
    public DestinationCobra withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client secret&lt;/a&gt;
     */
    public DestinationCobra withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
     */
    public DestinationCobra withIsSandbox(boolean isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = Optional.ofNullable(isSandbox);
        return this;
    }

    /**
     * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
     */
    public DestinationCobra withIsSandbox(Optional<Boolean> isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = isSandbox;
        return this;
    }

    /**
     * If enabled, the records content will be printed as part of the log in case of failure which allows for easier debugging.
     */
    public DestinationCobra withPrintRecordContentOnError(boolean printRecordContentOnError) {
        Utils.checkNotNull(printRecordContentOnError, "printRecordContentOnError");
        this.printRecordContentOnError = Optional.ofNullable(printRecordContentOnError);
        return this;
    }

    /**
     * If enabled, the records content will be printed as part of the log in case of failure which allows for easier debugging.
     */
    public DestinationCobra withPrintRecordContentOnError(Optional<Boolean> printRecordContentOnError) {
        Utils.checkNotNull(printRecordContentOnError, "printRecordContentOnError");
        this.printRecordContentOnError = printRecordContentOnError;
        return this;
    }

    /**
     * Enter your application's &lt;a href="https://developer.salesforce.com/docs/atlas.en-us.mobile_sdk.meta/mobile_sdk/oauth_refresh_token_flow.htm"&gt;Salesforce Refresh Token&lt;/a&gt; used for Airbyte to access your Salesforce account.
     */
    public DestinationCobra withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    public DestinationCobra withStreamMappings(List<StreamMapping> streamMappings) {
        Utils.checkNotNull(streamMappings, "streamMappings");
        this.streamMappings = streamMappings;
        return this;
    }

    /**
     * The order in which the streams should be synced. Streams are synced in the order they are listed. Only those streams will be synced so make sure all the input streams are configured here.
     */
    public DestinationCobra withStreamOrder(List<String> streamOrder) {
        Utils.checkNotNull(streamOrder, "streamOrder");
        this.streamOrder = streamOrder;
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
        DestinationCobra other = (DestinationCobra) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.isSandbox, other.isSandbox) &&
            Objects.deepEquals(this.printRecordContentOnError, other.printRecordContentOnError) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            Objects.deepEquals(this.streamMappings, other.streamMappings) &&
            Objects.deepEquals(this.streamOrder, other.streamOrder);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            clientId,
            clientSecret,
            destinationType,
            isSandbox,
            printRecordContentOnError,
            refreshToken,
            streamMappings,
            streamOrder);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationCobra.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "destinationType", destinationType,
                "isSandbox", isSandbox,
                "printRecordContentOnError", printRecordContentOnError,
                "refreshToken", refreshToken,
                "streamMappings", streamMappings,
                "streamOrder", streamOrder);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private Optional<Boolean> isSandbox;
 
        private Optional<Boolean> printRecordContentOnError;
 
        private String refreshToken;
 
        private List<StreamMapping> streamMappings;
 
        private List<String> streamOrder;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client ID&lt;/a&gt;
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client secret&lt;/a&gt;
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
         */
        public Builder isSandbox(boolean isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = Optional.ofNullable(isSandbox);
            return this;
        }

        /**
         * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
         */
        public Builder isSandbox(Optional<Boolean> isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = isSandbox;
            return this;
        }

        /**
         * If enabled, the records content will be printed as part of the log in case of failure which allows for easier debugging.
         */
        public Builder printRecordContentOnError(boolean printRecordContentOnError) {
            Utils.checkNotNull(printRecordContentOnError, "printRecordContentOnError");
            this.printRecordContentOnError = Optional.ofNullable(printRecordContentOnError);
            return this;
        }

        /**
         * If enabled, the records content will be printed as part of the log in case of failure which allows for easier debugging.
         */
        public Builder printRecordContentOnError(Optional<Boolean> printRecordContentOnError) {
            Utils.checkNotNull(printRecordContentOnError, "printRecordContentOnError");
            this.printRecordContentOnError = printRecordContentOnError;
            return this;
        }

        /**
         * Enter your application's &lt;a href="https://developer.salesforce.com/docs/atlas.en-us.mobile_sdk.meta/mobile_sdk/oauth_refresh_token_flow.htm"&gt;Salesforce Refresh Token&lt;/a&gt; used for Airbyte to access your Salesforce account.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder streamMappings(List<StreamMapping> streamMappings) {
            Utils.checkNotNull(streamMappings, "streamMappings");
            this.streamMappings = streamMappings;
            return this;
        }

        /**
         * The order in which the streams should be synced. Streams are synced in the order they are listed. Only those streams will be synced so make sure all the input streams are configured here.
         */
        public Builder streamOrder(List<String> streamOrder) {
            Utils.checkNotNull(streamOrder, "streamOrder");
            this.streamOrder = streamOrder;
            return this;
        }
        
        public DestinationCobra build() {
            if (isSandbox == null) {
                isSandbox = _SINGLETON_VALUE_IsSandbox.value();
            }
            if (printRecordContentOnError == null) {
                printRecordContentOnError = _SINGLETON_VALUE_PrintRecordContentOnError.value();
            }
            return new DestinationCobra(
                clientId,
                clientSecret,
                isSandbox,
                printRecordContentOnError,
                refreshToken,
                streamMappings,
                streamOrder);
        }

        private static final LazySingletonValue<Optional<? extends AuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends AuthType>>() {});

        private static final LazySingletonValue<Cobra> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"cobra\"",
                        new TypeReference<Cobra>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IsSandbox =
                new LazySingletonValue<>(
                        "is_sandbox",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_PrintRecordContentOnError =
                new LazySingletonValue<>(
                        "print_record_content_on_error",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
