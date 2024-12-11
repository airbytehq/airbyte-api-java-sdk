/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DestinationGoogleSheets {

    /**
     * Google API Credentials for connecting to Google Sheets and Google Drive APIs
     */
    @JsonProperty("credentials")
    private AuthenticationViaGoogleOAuth credentials;

    @JsonProperty("destinationType")
    private DestinationGoogleSheetsGoogleSheets destinationType;

    /**
     * The link to your spreadsheet. See &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#sheetlink'&gt;this guide&lt;/a&gt; for more details.
     */
    @JsonProperty("spreadsheet_id")
    private String spreadsheetId;

    @JsonCreator
    public DestinationGoogleSheets(
            @JsonProperty("credentials") AuthenticationViaGoogleOAuth credentials,
            @JsonProperty("spreadsheet_id") String spreadsheetId) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(spreadsheetId, "spreadsheetId");
        this.credentials = credentials;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.spreadsheetId = spreadsheetId;
    }

    /**
     * Google API Credentials for connecting to Google Sheets and Google Drive APIs
     */
    @JsonIgnore
    public AuthenticationViaGoogleOAuth credentials() {
        return credentials;
    }

    @JsonIgnore
    public DestinationGoogleSheetsGoogleSheets destinationType() {
        return destinationType;
    }

    /**
     * The link to your spreadsheet. See &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#sheetlink'&gt;this guide&lt;/a&gt; for more details.
     */
    @JsonIgnore
    public String spreadsheetId() {
        return spreadsheetId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Google API Credentials for connecting to Google Sheets and Google Drive APIs
     */
    public DestinationGoogleSheets withCredentials(AuthenticationViaGoogleOAuth credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * The link to your spreadsheet. See &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#sheetlink'&gt;this guide&lt;/a&gt; for more details.
     */
    public DestinationGoogleSheets withSpreadsheetId(String spreadsheetId) {
        Utils.checkNotNull(spreadsheetId, "spreadsheetId");
        this.spreadsheetId = spreadsheetId;
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
        DestinationGoogleSheets other = (DestinationGoogleSheets) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.spreadsheetId, other.spreadsheetId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            destinationType,
            spreadsheetId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationGoogleSheets.class,
                "credentials", credentials,
                "destinationType", destinationType,
                "spreadsheetId", spreadsheetId);
    }
    
    public final static class Builder {
 
        private AuthenticationViaGoogleOAuth credentials;
 
        private String spreadsheetId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Google API Credentials for connecting to Google Sheets and Google Drive APIs
         */
        public Builder credentials(AuthenticationViaGoogleOAuth credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * The link to your spreadsheet. See &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#sheetlink'&gt;this guide&lt;/a&gt; for more details.
         */
        public Builder spreadsheetId(String spreadsheetId) {
            Utils.checkNotNull(spreadsheetId, "spreadsheetId");
            this.spreadsheetId = spreadsheetId;
            return this;
        }
        
        public DestinationGoogleSheets build() {
            return new DestinationGoogleSheets(
                credentials,
                spreadsheetId);
        }

        private static final LazySingletonValue<DestinationGoogleSheetsGoogleSheets> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"google-sheets\"",
                        new TypeReference<DestinationGoogleSheetsGoogleSheets>() {});
    }
}

