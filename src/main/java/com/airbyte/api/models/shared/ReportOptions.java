/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ReportOptions {

    /**
     * List of options
     */
    @JsonProperty("options_list")
    private java.util.List<OptionsList> optionsList;

    @JsonProperty("stream_name")
    private StreamName streamName;

    @JsonCreator
    public ReportOptions(
            @JsonProperty("options_list") java.util.List<OptionsList> optionsList,
            @JsonProperty("stream_name") StreamName streamName) {
        Utils.checkNotNull(optionsList, "optionsList");
        Utils.checkNotNull(streamName, "streamName");
        this.optionsList = optionsList;
        this.streamName = streamName;
    }

    /**
     * List of options
     */
    @JsonIgnore
    public java.util.List<OptionsList> optionsList() {
        return optionsList;
    }

    @JsonIgnore
    public StreamName streamName() {
        return streamName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * List of options
     */
    public ReportOptions withOptionsList(java.util.List<OptionsList> optionsList) {
        Utils.checkNotNull(optionsList, "optionsList");
        this.optionsList = optionsList;
        return this;
    }

    public ReportOptions withStreamName(StreamName streamName) {
        Utils.checkNotNull(streamName, "streamName");
        this.streamName = streamName;
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
        ReportOptions other = (ReportOptions) o;
        return 
            java.util.Objects.deepEquals(this.optionsList, other.optionsList) &&
            java.util.Objects.deepEquals(this.streamName, other.streamName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            optionsList,
            streamName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReportOptions.class,
                "optionsList", optionsList,
                "streamName", streamName);
    }
    
    public final static class Builder {
 
        private java.util.List<OptionsList> optionsList;
 
        private StreamName streamName;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of options
         */
        public Builder optionsList(java.util.List<OptionsList> optionsList) {
            Utils.checkNotNull(optionsList, "optionsList");
            this.optionsList = optionsList;
            return this;
        }

        public Builder streamName(StreamName streamName) {
            Utils.checkNotNull(streamName, "streamName");
            this.streamName = streamName;
            return this;
        }
        
        public ReportOptions build() {
            return new ReportOptions(
                optionsList,
                streamName);
        }
    }
}

