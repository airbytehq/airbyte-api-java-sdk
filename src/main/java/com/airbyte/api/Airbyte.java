/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.models.operations.SDKMethodInterfaces.*;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.RetryConfig;
import com.airbyte.api.utils.SpeakeasyHTTPClient;
import com.airbyte.api.utils.Utils;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * airbyte-api: Programmatically control Airbyte Cloud, OSS &amp; Enterprise.
 */
public class Airbyte {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        /**
         * Airbyte API v1
         */
        "https://api.airbyte.com/v1",
    };

    private final Connections connections;

    private final Destinations destinations;

    private final Health health;

    private final Jobs jobs;

    private final Organizations organizations;

    private final Permissions permissions;

    private final Sources sources;

    private final Streams streams;

    private final Users users;

    private final Workspaces workspaces;

    public Connections connections() {
        return connections;
    }

    public Destinations destinations() {
        return destinations;
    }

    public Health health() {
        return health;
    }

    public Jobs jobs() {
        return jobs;
    }

    public Organizations organizations() {
        return organizations;
    }

    public Permissions permissions() {
        return permissions;
    }

    public Sources sources() {
        return sources;
    }

    public Streams streams() {
        return streams;
    }

    public Users users() {
        return users;
    }

    public Workspaces workspaces() {
        return workspaces;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(com.airbyte.api.models.shared.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        // Visible for testing, may be accessed via reflection in tests
        Builder _hooks(com.airbyte.api.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);  
            return this;  
        }
        
        // Visible for testing, may be accessed via reflection in tests
        Builder _hooks(Consumer<? super com.airbyte.api.utils.Hooks> consumer) {
            consumer.accept(sdkConfiguration.hooks());
            return this;    
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public Airbyte build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new Airbyte(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private Airbyte(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.connections = new Connections(sdkConfiguration);
        this.destinations = new Destinations(sdkConfiguration);
        this.health = new Health(sdkConfiguration);
        this.jobs = new Jobs(sdkConfiguration);
        this.organizations = new Organizations(sdkConfiguration);
        this.permissions = new Permissions(sdkConfiguration);
        this.sources = new Sources(sdkConfiguration);
        this.streams = new Streams(sdkConfiguration);
        this.users = new Users(sdkConfiguration);
        this.workspaces = new Workspaces(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
