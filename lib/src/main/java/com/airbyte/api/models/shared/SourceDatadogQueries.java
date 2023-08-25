/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceDatadogQueries {
    /**
     * A data source that is powered by the platform.
     */
    @JsonProperty("data_source")
    public SourceDatadogQueriesDataSource dataSource;

    public SourceDatadogQueries withDataSource(SourceDatadogQueriesDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    /**
     * The variable name for use in queries.
     */
    @JsonProperty("name")
    public String name;

    public SourceDatadogQueries withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * A classic query string.
     */
    @JsonProperty("query")
    public String query;

    public SourceDatadogQueries withQuery(String query) {
        this.query = query;
        return this;
    }
    
    public SourceDatadogQueries(@JsonProperty("data_source") SourceDatadogQueriesDataSource dataSource, @JsonProperty("name") String name, @JsonProperty("query") String query) {
        this.dataSource = dataSource;
        this.name = name;
        this.query = query;
  }
}