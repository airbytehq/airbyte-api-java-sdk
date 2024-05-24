/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
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

public class SourceClickupApi {

    /**
     * Every ClickUp API call required authentication. This field is your personal API token. See &lt;a href="https://clickup.com/api/developer-portal/authentication/#personal-token"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_token")
    private String apiToken;

    /**
     * The ID of your folder in your space. Retrieve it from the `/space/{space_id}/folder` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetFolders/"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_id")
    private Optional<? extends String> folderId;

    /**
     * Include or exclude closed tasks. By default, they are excluded. See &lt;a https://clickup.com/api/clickupreference/operation/GetTasks/#!in=query&amp;path=include_closed&amp;t=request"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_closed_tasks")
    private Optional<? extends Boolean> includeClosedTasks;

    /**
     * The ID of your list in your folder. Retrieve it from the `/folder/{folder_id}/list` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetLists/"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_id")
    private Optional<? extends String> listId;

    @JsonProperty("sourceType")
    private ClickupApi sourceType;

    /**
     * The ID of your space in your workspace. Retrieve it from the `/team/{team_id}/space` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetSpaces/"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("space_id")
    private Optional<? extends String> spaceId;

    /**
     * The ID of your team in ClickUp. Retrieve it from the `/team` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetAuthorizedTeams/"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("team_id")
    private Optional<? extends String> teamId;

    @JsonCreator
    public SourceClickupApi(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("folder_id") Optional<? extends String> folderId,
            @JsonProperty("include_closed_tasks") Optional<? extends Boolean> includeClosedTasks,
            @JsonProperty("list_id") Optional<? extends String> listId,
            @JsonProperty("space_id") Optional<? extends String> spaceId,
            @JsonProperty("team_id") Optional<? extends String> teamId) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(folderId, "folderId");
        Utils.checkNotNull(includeClosedTasks, "includeClosedTasks");
        Utils.checkNotNull(listId, "listId");
        Utils.checkNotNull(spaceId, "spaceId");
        Utils.checkNotNull(teamId, "teamId");
        this.apiToken = apiToken;
        this.folderId = folderId;
        this.includeClosedTasks = includeClosedTasks;
        this.listId = listId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.spaceId = spaceId;
        this.teamId = teamId;
    }
    
    public SourceClickupApi(
            String apiToken) {
        this(apiToken, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Every ClickUp API call required authentication. This field is your personal API token. See &lt;a href="https://clickup.com/api/developer-portal/authentication/#personal-token"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    /**
     * The ID of your folder in your space. Retrieve it from the `/space/{space_id}/folder` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetFolders/"&gt;here&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> folderId() {
        return (Optional<String>) folderId;
    }

    /**
     * Include or exclude closed tasks. By default, they are excluded. See &lt;a https://clickup.com/api/clickupreference/operation/GetTasks/#!in=query&amp;path=include_closed&amp;t=request"&gt;here&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> includeClosedTasks() {
        return (Optional<Boolean>) includeClosedTasks;
    }

    /**
     * The ID of your list in your folder. Retrieve it from the `/folder/{folder_id}/list` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetLists/"&gt;here&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> listId() {
        return (Optional<String>) listId;
    }

    @JsonIgnore
    public ClickupApi sourceType() {
        return sourceType;
    }

    /**
     * The ID of your space in your workspace. Retrieve it from the `/team/{team_id}/space` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetSpaces/"&gt;here&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> spaceId() {
        return (Optional<String>) spaceId;
    }

    /**
     * The ID of your team in ClickUp. Retrieve it from the `/team` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetAuthorizedTeams/"&gt;here&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> teamId() {
        return (Optional<String>) teamId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Every ClickUp API call required authentication. This field is your personal API token. See &lt;a href="https://clickup.com/api/developer-portal/authentication/#personal-token"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * The ID of your folder in your space. Retrieve it from the `/space/{space_id}/folder` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetFolders/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withFolderId(String folderId) {
        Utils.checkNotNull(folderId, "folderId");
        this.folderId = Optional.ofNullable(folderId);
        return this;
    }

    /**
     * The ID of your folder in your space. Retrieve it from the `/space/{space_id}/folder` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetFolders/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withFolderId(Optional<? extends String> folderId) {
        Utils.checkNotNull(folderId, "folderId");
        this.folderId = folderId;
        return this;
    }

    /**
     * Include or exclude closed tasks. By default, they are excluded. See &lt;a https://clickup.com/api/clickupreference/operation/GetTasks/#!in=query&amp;path=include_closed&amp;t=request"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withIncludeClosedTasks(boolean includeClosedTasks) {
        Utils.checkNotNull(includeClosedTasks, "includeClosedTasks");
        this.includeClosedTasks = Optional.ofNullable(includeClosedTasks);
        return this;
    }

    /**
     * Include or exclude closed tasks. By default, they are excluded. See &lt;a https://clickup.com/api/clickupreference/operation/GetTasks/#!in=query&amp;path=include_closed&amp;t=request"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withIncludeClosedTasks(Optional<? extends Boolean> includeClosedTasks) {
        Utils.checkNotNull(includeClosedTasks, "includeClosedTasks");
        this.includeClosedTasks = includeClosedTasks;
        return this;
    }

    /**
     * The ID of your list in your folder. Retrieve it from the `/folder/{folder_id}/list` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetLists/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withListId(String listId) {
        Utils.checkNotNull(listId, "listId");
        this.listId = Optional.ofNullable(listId);
        return this;
    }

    /**
     * The ID of your list in your folder. Retrieve it from the `/folder/{folder_id}/list` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetLists/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withListId(Optional<? extends String> listId) {
        Utils.checkNotNull(listId, "listId");
        this.listId = listId;
        return this;
    }

    /**
     * The ID of your space in your workspace. Retrieve it from the `/team/{team_id}/space` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetSpaces/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withSpaceId(String spaceId) {
        Utils.checkNotNull(spaceId, "spaceId");
        this.spaceId = Optional.ofNullable(spaceId);
        return this;
    }

    /**
     * The ID of your space in your workspace. Retrieve it from the `/team/{team_id}/space` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetSpaces/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withSpaceId(Optional<? extends String> spaceId) {
        Utils.checkNotNull(spaceId, "spaceId");
        this.spaceId = spaceId;
        return this;
    }

    /**
     * The ID of your team in ClickUp. Retrieve it from the `/team` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetAuthorizedTeams/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withTeamId(String teamId) {
        Utils.checkNotNull(teamId, "teamId");
        this.teamId = Optional.ofNullable(teamId);
        return this;
    }

    /**
     * The ID of your team in ClickUp. Retrieve it from the `/team` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetAuthorizedTeams/"&gt;here&lt;/a&gt;.
     */
    public SourceClickupApi withTeamId(Optional<? extends String> teamId) {
        Utils.checkNotNull(teamId, "teamId");
        this.teamId = teamId;
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
        SourceClickupApi other = (SourceClickupApi) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.folderId, other.folderId) &&
            java.util.Objects.deepEquals(this.includeClosedTasks, other.includeClosedTasks) &&
            java.util.Objects.deepEquals(this.listId, other.listId) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.spaceId, other.spaceId) &&
            java.util.Objects.deepEquals(this.teamId, other.teamId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            folderId,
            includeClosedTasks,
            listId,
            sourceType,
            spaceId,
            teamId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceClickupApi.class,
                "apiToken", apiToken,
                "folderId", folderId,
                "includeClosedTasks", includeClosedTasks,
                "listId", listId,
                "sourceType", sourceType,
                "spaceId", spaceId,
                "teamId", teamId);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private Optional<? extends String> folderId = Optional.empty();
 
        private Optional<? extends Boolean> includeClosedTasks;
 
        private Optional<? extends String> listId = Optional.empty();
 
        private Optional<? extends String> spaceId = Optional.empty();
 
        private Optional<? extends String> teamId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Every ClickUp API call required authentication. This field is your personal API token. See &lt;a href="https://clickup.com/api/developer-portal/authentication/#personal-token"&gt;here&lt;/a&gt;.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * The ID of your folder in your space. Retrieve it from the `/space/{space_id}/folder` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetFolders/"&gt;here&lt;/a&gt;.
         */
        public Builder folderId(String folderId) {
            Utils.checkNotNull(folderId, "folderId");
            this.folderId = Optional.ofNullable(folderId);
            return this;
        }

        /**
         * The ID of your folder in your space. Retrieve it from the `/space/{space_id}/folder` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetFolders/"&gt;here&lt;/a&gt;.
         */
        public Builder folderId(Optional<? extends String> folderId) {
            Utils.checkNotNull(folderId, "folderId");
            this.folderId = folderId;
            return this;
        }

        /**
         * Include or exclude closed tasks. By default, they are excluded. See &lt;a https://clickup.com/api/clickupreference/operation/GetTasks/#!in=query&amp;path=include_closed&amp;t=request"&gt;here&lt;/a&gt;.
         */
        public Builder includeClosedTasks(boolean includeClosedTasks) {
            Utils.checkNotNull(includeClosedTasks, "includeClosedTasks");
            this.includeClosedTasks = Optional.ofNullable(includeClosedTasks);
            return this;
        }

        /**
         * Include or exclude closed tasks. By default, they are excluded. See &lt;a https://clickup.com/api/clickupreference/operation/GetTasks/#!in=query&amp;path=include_closed&amp;t=request"&gt;here&lt;/a&gt;.
         */
        public Builder includeClosedTasks(Optional<? extends Boolean> includeClosedTasks) {
            Utils.checkNotNull(includeClosedTasks, "includeClosedTasks");
            this.includeClosedTasks = includeClosedTasks;
            return this;
        }

        /**
         * The ID of your list in your folder. Retrieve it from the `/folder/{folder_id}/list` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetLists/"&gt;here&lt;/a&gt;.
         */
        public Builder listId(String listId) {
            Utils.checkNotNull(listId, "listId");
            this.listId = Optional.ofNullable(listId);
            return this;
        }

        /**
         * The ID of your list in your folder. Retrieve it from the `/folder/{folder_id}/list` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetLists/"&gt;here&lt;/a&gt;.
         */
        public Builder listId(Optional<? extends String> listId) {
            Utils.checkNotNull(listId, "listId");
            this.listId = listId;
            return this;
        }

        /**
         * The ID of your space in your workspace. Retrieve it from the `/team/{team_id}/space` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetSpaces/"&gt;here&lt;/a&gt;.
         */
        public Builder spaceId(String spaceId) {
            Utils.checkNotNull(spaceId, "spaceId");
            this.spaceId = Optional.ofNullable(spaceId);
            return this;
        }

        /**
         * The ID of your space in your workspace. Retrieve it from the `/team/{team_id}/space` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetSpaces/"&gt;here&lt;/a&gt;.
         */
        public Builder spaceId(Optional<? extends String> spaceId) {
            Utils.checkNotNull(spaceId, "spaceId");
            this.spaceId = spaceId;
            return this;
        }

        /**
         * The ID of your team in ClickUp. Retrieve it from the `/team` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetAuthorizedTeams/"&gt;here&lt;/a&gt;.
         */
        public Builder teamId(String teamId) {
            Utils.checkNotNull(teamId, "teamId");
            this.teamId = Optional.ofNullable(teamId);
            return this;
        }

        /**
         * The ID of your team in ClickUp. Retrieve it from the `/team` of the ClickUp API. See &lt;a href="https://clickup.com/api/clickupreference/operation/GetAuthorizedTeams/"&gt;here&lt;/a&gt;.
         */
        public Builder teamId(Optional<? extends String> teamId) {
            Utils.checkNotNull(teamId, "teamId");
            this.teamId = teamId;
            return this;
        }
        
        public SourceClickupApi build() {
            if (includeClosedTasks == null) {
                includeClosedTasks = _SINGLETON_VALUE_IncludeClosedTasks.value();
            }
            return new SourceClickupApi(
                apiToken,
                folderId,
                includeClosedTasks,
                listId,
                spaceId,
                teamId);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IncludeClosedTasks =
                new LazySingletonValue<>(
                        "include_closed_tasks",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<ClickupApi> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"clickup-api\"",
                        new TypeReference<ClickupApi>() {});
    }
}

