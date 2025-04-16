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

public class SourceGoldcast {

    /**
     * Your API Access Key. See &lt;a href="https://help.goldcast.io/hc/en-us/articles/22931655725723-How-To-Create-an-API-Token-in-Goldcast"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("access_key")
    private String accessKey;

    @JsonProperty("sourceType")
    private Goldcast sourceType;

    @JsonCreator
    public SourceGoldcast(
            @JsonProperty("access_key") String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Your API Access Key. See &lt;a href="https://help.goldcast.io/hc/en-us/articles/22931655725723-How-To-Create-an-API-Token-in-Goldcast"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    @JsonIgnore
    public Goldcast sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your API Access Key. See &lt;a href="https://help.goldcast.io/hc/en-us/articles/22931655725723-How-To-Create-an-API-Token-in-Goldcast"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    public SourceGoldcast withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
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
        SourceGoldcast other = (SourceGoldcast) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoldcast.class,
                "accessKey", accessKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accessKey;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Access Key. See &lt;a href="https://help.goldcast.io/hc/en-us/articles/22931655725723-How-To-Create-an-API-Token-in-Goldcast"&gt;here&lt;/a&gt;. The key is case sensitive.
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }
        
        public SourceGoldcast build() {
            return new SourceGoldcast(
                accessKey);
        }

        private static final LazySingletonValue<Goldcast> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"goldcast\"",
                        new TypeReference<Goldcast>() {});
    }
}
