/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceYoutubeAnalyticsYoutubeAnalytics {
    YOUTUBE_ANALYTICS("youtube-analytics");

    @JsonValue
    public final String value;

    private SourceYoutubeAnalyticsYoutubeAnalytics(String value) {
        this.value = value;
    }
}