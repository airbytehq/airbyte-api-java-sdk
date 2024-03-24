/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceGoogleSearchConsoleCustomReportConfig {

    /**
     * A list of available dimensions. Please note, that for technical reasons `date` is the default dimension which will be included in your query whether you specify it or not. Primary key will consist of your custom dimensions and the default dimension along with `site_url` and `search_type`.
     */
    @JsonProperty("dimensions")
    private java.util.List<SourceGoogleSearchConsoleValidEnums> dimensions;

    /**
     * The name of the custom report, this name would be used as stream name
     */
    @JsonProperty("name")
    private String name;

    public SourceGoogleSearchConsoleCustomReportConfig(
            @JsonProperty("dimensions") java.util.List<SourceGoogleSearchConsoleValidEnums> dimensions,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(dimensions, "dimensions");
        Utils.checkNotNull(name, "name");
        this.dimensions = dimensions;
        this.name = name;
    }

    /**
     * A list of available dimensions. Please note, that for technical reasons `date` is the default dimension which will be included in your query whether you specify it or not. Primary key will consist of your custom dimensions and the default dimension along with `site_url` and `search_type`.
     */
    public java.util.List<SourceGoogleSearchConsoleValidEnums> dimensions() {
        return dimensions;
    }

    /**
     * The name of the custom report, this name would be used as stream name
     */
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of available dimensions. Please note, that for technical reasons `date` is the default dimension which will be included in your query whether you specify it or not. Primary key will consist of your custom dimensions and the default dimension along with `site_url` and `search_type`.
     */
    public SourceGoogleSearchConsoleCustomReportConfig withDimensions(java.util.List<SourceGoogleSearchConsoleValidEnums> dimensions) {
        Utils.checkNotNull(dimensions, "dimensions");
        this.dimensions = dimensions;
        return this;
    }

    /**
     * The name of the custom report, this name would be used as stream name
     */
    public SourceGoogleSearchConsoleCustomReportConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        SourceGoogleSearchConsoleCustomReportConfig other = (SourceGoogleSearchConsoleCustomReportConfig) o;
        return 
            java.util.Objects.deepEquals(this.dimensions, other.dimensions) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dimensions,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleSearchConsoleCustomReportConfig.class,
                "dimensions", dimensions,
                "name", name);
    }
    
    public final static class Builder {
 
        private java.util.List<SourceGoogleSearchConsoleValidEnums> dimensions;
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of available dimensions. Please note, that for technical reasons `date` is the default dimension which will be included in your query whether you specify it or not. Primary key will consist of your custom dimensions and the default dimension along with `site_url` and `search_type`.
         */
        public Builder dimensions(java.util.List<SourceGoogleSearchConsoleValidEnums> dimensions) {
            Utils.checkNotNull(dimensions, "dimensions");
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The name of the custom report, this name would be used as stream name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public SourceGoogleSearchConsoleCustomReportConfig build() {
            return new SourceGoogleSearchConsoleCustomReportConfig(
                dimensions,
                name);
        }
    }
}

