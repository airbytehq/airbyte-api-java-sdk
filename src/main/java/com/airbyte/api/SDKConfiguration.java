/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.utils.Hook.SdkInitData;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.RetryConfig;
import com.airbyte.api.models.shared.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "1.0.0";
    public String sdkVersion = "1.4.1";
    public String genVersion = "2.338.1";
    public String userAgent = "speakeasy-sdk/java 1.4.1 2.338.1 1.0.0 com.airbyte.api";

    private com.airbyte.api.utils.Hooks _hooks = new com.airbyte.api.utils.Hooks();

    public com.airbyte.api.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(com.airbyte.api.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        com.airbyte.api.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
