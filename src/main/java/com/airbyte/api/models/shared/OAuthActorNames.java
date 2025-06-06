/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum OAuthActorNames {
    AIRTABLE("airtable"),
    AMAZON_ADS("amazon-ads"),
    AMAZON_SELLER_PARTNER("amazon-seller-partner"),
    ASANA("asana"),
    AZURE_BLOB_STORAGE("azure-blob-storage"),
    BING_ADS("bing-ads"),
    DRIFT("drift"),
    FACEBOOK_MARKETING("facebook-marketing"),
    GCS("gcs"),
    GITHUB("github"),
    GITLAB("gitlab"),
    GOOGLE_ADS("google-ads"),
    GOOGLE_ANALYTICS_DATA_API("google-analytics-data-api"),
    GOOGLE_DRIVE("google-drive"),
    GOOGLE_SEARCH_CONSOLE("google-search-console"),
    GOOGLE_SHEETS("google-sheets"),
    HUBSPOT("hubspot"),
    INSTAGRAM("instagram"),
    LEVER_HIRING("lever-hiring"),
    LINKEDIN_ADS("linkedin-ads"),
    MAILCHIMP("mailchimp"),
    MICROSOFT_ONEDRIVE("microsoft-onedrive"),
    MICROSOFT_SHAREPOINT("microsoft-sharepoint"),
    MICROSOFT_TEAMS("microsoft-teams"),
    MONDAY("monday"),
    NOTION("notion"),
    PINTEREST("pinterest"),
    RD_STATION_MARKETING("rd-station-marketing"),
    SALESFORCE("salesforce"),
    SLACK("slack"),
    SMARTSHEETS("smartsheets"),
    SNAPCHAT_MARKETING("snapchat-marketing"),
    SNOWFLAKE("snowflake"),
    SURVEYMONKEY("surveymonkey"),
    TIKTOK_MARKETING("tiktok-marketing"),
    TRELLO("trello"),
    TYPEFORM("typeform"),
    YOUTUBE_ANALYTICS("youtube-analytics"),
    ZENDESK_SUPPORT("zendesk-support"),
    ZENDESK_TALK("zendesk-talk");

    @JsonValue
    private final String value;

    private OAuthActorNames(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<OAuthActorNames> fromValue(String value) {
        for (OAuthActorNames o: OAuthActorNames.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

