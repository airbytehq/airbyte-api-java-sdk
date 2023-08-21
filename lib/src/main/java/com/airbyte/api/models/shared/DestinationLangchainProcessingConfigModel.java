/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DestinationLangchainProcessingConfigModel {
    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("chunk_overlap")
    public Long chunkOverlap;

    public DestinationLangchainProcessingConfigModel withChunkOverlap(Long chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    
    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    @JsonProperty("chunk_size")
    public Long chunkSize;

    public DestinationLangchainProcessingConfigModel withChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    
    /**
     * List of fields in the record that should be used to calculate the embedding. All other fields are passed along as meta fields. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @JsonProperty("text_fields")
    public String[] textFields;

    public DestinationLangchainProcessingConfigModel withTextFields(String[] textFields) {
        this.textFields = textFields;
        return this;
    }
    
    public DestinationLangchainProcessingConfigModel(@JsonProperty("chunk_size") Long chunkSize, @JsonProperty("text_fields") String[] textFields) {
        this.chunkSize = chunkSize;
        this.textFields = textFields;
  }
}
