/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.hooks.ClientCredentialsHook;
import com.airbyte.api.hooks.SDKHooks;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.Hook.SdkInitData;
import com.airbyte.api.utils.Hooks;
import com.airbyte.api.utils.RetryConfig;
import java.lang.String;
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
    public String sdkVersion = "1.6.0";
    public String genVersion = "2.409.0";
    public String userAgent = "speakeasy-sdk/java 1.6.0 2.409.0 1.0.0 com.airbyte.api";

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        // register client credentials hooks
        ClientCredentialsHook h = new ClientCredentialsHook();
        hooks.registerSdkInit(h);
        hooks.registerBeforeRequest(h);
        hooks.registerAfterError(h);
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
