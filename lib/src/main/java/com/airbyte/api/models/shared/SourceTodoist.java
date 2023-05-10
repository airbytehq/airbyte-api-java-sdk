/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTodoist - The values required to configure the source.
 */
public class SourceTodoist {
    @JsonProperty("sourceType")
    public SourceTodoistTodoistEnum sourceType;

    public SourceTodoist withSourceType(SourceTodoistTodoistEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Your API Token. See &lt;a href="https://todoist.com/app/settings/integrations/"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    @JsonProperty("token")
    public String token;

    public SourceTodoist withToken(String token) {
        this.token = token;
        return this;
    }
    
    public SourceTodoist(@JsonProperty("sourceType") SourceTodoistTodoistEnum sourceType, @JsonProperty("token") String token) {
        this.sourceType = sourceType;
        this.token = token;
  }
}
