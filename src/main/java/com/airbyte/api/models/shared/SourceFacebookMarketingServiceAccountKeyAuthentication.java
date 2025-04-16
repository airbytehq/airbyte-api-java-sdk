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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class SourceFacebookMarketingServiceAccountKeyAuthentication {

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceFacebookMarketingSchemasAuthType> authType;

    @JsonCreator
    public SourceFacebookMarketingServiceAccountKeyAuthentication(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceFacebookMarketingSchemasAuthType> authType() {
        return (Optional<SourceFacebookMarketingSchemasAuthType>) authType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    public SourceFacebookMarketingServiceAccountKeyAuthentication withAccessToken(String accessToken) {
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
        SourceFacebookMarketingServiceAccountKeyAuthentication other = (SourceFacebookMarketingServiceAccountKeyAuthentication) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFacebookMarketingServiceAccountKeyAuthentication.class,
                "accessToken", accessToken,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String accessToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public SourceFacebookMarketingServiceAccountKeyAuthentication build() {
            return new SourceFacebookMarketingServiceAccountKeyAuthentication(
                accessToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceFacebookMarketingSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Service\"",
                        new TypeReference<Optional<? extends SourceFacebookMarketingSchemasAuthType>>() {});
    }
}
