/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceMicrosoftTeamsMicrosoftTeams {
    MICROSOFT_TEAMS("microsoft-teams");

    @JsonValue
    public final String value;

    private SourceMicrosoftTeamsMicrosoftTeams(String value) {
        this.value = value;
    }
}