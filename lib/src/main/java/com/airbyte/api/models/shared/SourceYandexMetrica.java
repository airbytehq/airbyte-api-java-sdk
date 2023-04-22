/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceYandexMetrica - The values required to configure the source.
 */
public class SourceYandexMetrica {
    /**
     * Your Yandex Metrica API access token
     */
    @JsonProperty("auth_token")
    public String authToken;
    public SourceYandexMetrica withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
    /**
     * Counter ID
     */
    @JsonProperty("counter_id")
    public String counterId;
    public SourceYandexMetrica withCounterId(String counterId) {
        this.counterId = counterId;
        return this;
    }
    
    /**
     * Starting point for your data replication, in format of "YYYY-MM-DD". If not provided will sync till most recent date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceYandexMetrica withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceYandexMetricaYandexMetricaEnum sourceType;
    public SourceYandexMetrica withSourceType(SourceYandexMetricaYandexMetricaEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Starting point for your data replication, in format of "YYYY-MM-DD".
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceYandexMetrica withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    

    public SourceYandexMetrica(@JsonProperty("auth_token") String authToken, @JsonProperty("counter_id") String counterId, @JsonProperty("sourceType") SourceYandexMetricaYandexMetricaEnum sourceType, @JsonProperty("start_date") LocalDate startDate) {
    this.authToken = authToken;
this.counterId = counterId;
this.sourceType = sourceType;
this.startDate = startDate;
  }
}
