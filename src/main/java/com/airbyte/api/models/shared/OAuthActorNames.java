/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

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
    INTERCOM("intercom"),
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
    RETENTLY("retently"),
    SALESFORCE("salesforce"),
    SLACK("slack"),
    SMARTSHEETS("smartsheets"),
    SNOWFLAKE("snowflake"),
    SURVEYMONKEY("surveymonkey"),
    TIKTOK_MARKETING("tiktok-marketing"),
    TRELLO("trello"),
    TYPEFORM("typeform"),
    YOUTUBE_ANALYTICS("youtube-analytics"),
    ZENDESK_CHAT("zendesk-chat"),
    ZENDESK_SUNSHINE("zendesk-sunshine"),
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
}
