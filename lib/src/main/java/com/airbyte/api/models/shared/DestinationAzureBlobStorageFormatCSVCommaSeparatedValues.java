/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorageFormatCSVCommaSeparatedValues - Output data format
 */

public class DestinationAzureBlobStorageFormatCSVCommaSeparatedValues {
    /**
     * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @JsonProperty("flattening")
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlattening flattening;

    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues withFlattening(DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlattening flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatType formatType;

    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues withFormatType(DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatType formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues(@JsonProperty("flattening") DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlattening flattening, @JsonProperty("format_type") DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatType formatType) {
        this.flattening = flattening;
        this.formatType = formatType;
  }
}
