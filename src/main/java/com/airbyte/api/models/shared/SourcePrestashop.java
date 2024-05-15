/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
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
import java.time.LocalDate;


public class SourcePrestashop {

    /**
     * Your PrestaShop access key. See &lt;a href="https://devdocs.prestashop.com/1.7/webservice/tutorials/creating-access/#create-an-access-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    @JsonProperty("access_key")
    private String accessKey;

    @JsonProperty("sourceType")
    private Prestashop sourceType;

    /**
     * The Start date in the format YYYY-MM-DD.
     */
    @JsonProperty("start_date")
    private LocalDate startDate;

    /**
     * Shop URL without trailing slash.
     */
    @JsonProperty("url")
    private String url;

    @JsonCreator
    public SourcePrestashop(
            @JsonProperty("access_key") String accessKey,
            @JsonProperty("start_date") LocalDate startDate,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(url, "url");
        this.accessKey = accessKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.url = url;
    }

    /**
     * Your PrestaShop access key. See &lt;a href="https://devdocs.prestashop.com/1.7/webservice/tutorials/creating-access/#create-an-access-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    @JsonIgnore
    public Prestashop sourceType() {
        return sourceType;
    }

    /**
     * The Start date in the format YYYY-MM-DD.
     */
    @JsonIgnore
    public LocalDate startDate() {
        return startDate;
    }

    /**
     * Shop URL without trailing slash.
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your PrestaShop access key. See &lt;a href="https://devdocs.prestashop.com/1.7/webservice/tutorials/creating-access/#create-an-access-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    public SourcePrestashop withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    /**
     * The Start date in the format YYYY-MM-DD.
     */
    public SourcePrestashop withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Shop URL without trailing slash.
     */
    public SourcePrestashop withUrl(String url) {
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
        SourcePrestashop other = (SourcePrestashop) o;
        return 
            java.util.Objects.deepEquals(this.accessKey, other.accessKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessKey,
            sourceType,
            startDate,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePrestashop.class,
                "accessKey", accessKey,
                "sourceType", sourceType,
                "startDate", startDate,
                "url", url);
    }
    
    public final static class Builder {
 
        private String accessKey;
 
        private LocalDate startDate;
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your PrestaShop access key. See &lt;a href="https://devdocs.prestashop.com/1.7/webservice/tutorials/creating-access/#create-an-access-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        /**
         * The Start date in the format YYYY-MM-DD.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Shop URL without trailing slash.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public SourcePrestashop build() {
            return new SourcePrestashop(
                accessKey,
                startDate,
                url);
        }

        private static final LazySingletonValue<Prestashop> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"prestashop\"",
                        new TypeReference<Prestashop>() {});
    }
}

