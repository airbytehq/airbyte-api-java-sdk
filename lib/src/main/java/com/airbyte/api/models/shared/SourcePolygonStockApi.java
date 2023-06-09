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
 * SourcePolygonStockApi - The values required to configure the source.
 */

public class SourcePolygonStockApi {
    /**
     * Determines whether or not the results are adjusted for splits. By default, results are adjusted and set to true. Set this to false to get results that are NOT adjusted for splits.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("adjusted")
    public String adjusted;

    public SourcePolygonStockApi withAdjusted(String adjusted) {
        this.adjusted = adjusted;
        return this;
    }
    
    /**
     * Your API ACCESS Key
     */
    @JsonProperty("apiKey")
    public String apiKey;

    public SourcePolygonStockApi withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The target date for the aggregate window.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;

    public SourcePolygonStockApi withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * The target date for the aggregate window.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;

    public SourcePolygonStockApi withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * The size of the timespan multiplier.
     */
    @JsonProperty("multiplier")
    public Long multiplier;

    public SourcePolygonStockApi withMultiplier(Long multiplier) {
        this.multiplier = multiplier;
        return this;
    }
    
    /**
     * Sort the results by timestamp. asc will return results in ascending order (oldest at the top), desc will return results in descending order (newest at the top).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;

    public SourcePolygonStockApi withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourcePolygonStockApiPolygonStockApi sourceType;

    public SourcePolygonStockApi withSourceType(SourcePolygonStockApiPolygonStockApi sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The beginning date for the aggregate window.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public SourcePolygonStockApi withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * The exchange symbol that this item is traded under.
     */
    @JsonProperty("stocksTicker")
    public String stocksTicker;

    public SourcePolygonStockApi withStocksTicker(String stocksTicker) {
        this.stocksTicker = stocksTicker;
        return this;
    }
    
    /**
     * The size of the time window.
     */
    @JsonProperty("timespan")
    public String timespan;

    public SourcePolygonStockApi withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }
    
    public SourcePolygonStockApi(@JsonProperty("apiKey") String apiKey, @JsonProperty("end_date") LocalDate endDate, @JsonProperty("multiplier") Long multiplier, @JsonProperty("sourceType") SourcePolygonStockApiPolygonStockApi sourceType, @JsonProperty("start_date") LocalDate startDate, @JsonProperty("stocksTicker") String stocksTicker, @JsonProperty("timespan") String timespan) {
        this.apiKey = apiKey;
        this.endDate = endDate;
        this.multiplier = multiplier;
        this.sourceType = sourceType;
        this.startDate = startDate;
        this.stocksTicker = stocksTicker;
        this.timespan = timespan;
  }
}
