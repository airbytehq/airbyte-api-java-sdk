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

public class SourceRss {

    @JsonProperty("sourceType")
    private Rss sourceType;

    /**
     * RSS Feed URL
     */
    @JsonProperty("url")
    private String url;

    @JsonCreator
    public SourceRss(
            @JsonProperty("url") String url) {
        Utils.checkNotNull(url, "url");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.url = url;
    }

    @JsonIgnore
    public Rss sourceType() {
        return sourceType;
    }

    /**
     * RSS Feed URL
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * RSS Feed URL
     */
    public SourceRss withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        SourceRss other = (SourceRss) o;
        return 
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceType,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRss.class,
                "sourceType", sourceType,
                "url", url);
    }
    
    public final static class Builder {
 
        private String url;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * RSS Feed URL
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public SourceRss build() {
            return new SourceRss(
                url);
        }

        private static final LazySingletonValue<Rss> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"rss\"",
                        new TypeReference<Rss>() {});
    }
}
