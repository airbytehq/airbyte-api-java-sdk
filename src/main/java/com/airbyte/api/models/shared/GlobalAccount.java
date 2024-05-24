/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class GlobalAccount {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url_base")
    private Optional<? extends SourceSurveySparrowUrlBase> urlBase;

    @JsonCreator
    public GlobalAccount() {
        
        this.urlBase = Builder._SINGLETON_VALUE_UrlBase.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSurveySparrowUrlBase> urlBase() {
        return (Optional<SourceSurveySparrowUrlBase>) urlBase;
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAccount other = (GlobalAccount) o;
        return 
            java.util.Objects.deepEquals(this.urlBase, other.urlBase);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            urlBase);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GlobalAccount.class,
                "urlBase", urlBase);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public GlobalAccount build() {
            return new GlobalAccount(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceSurveySparrowUrlBase>> _SINGLETON_VALUE_UrlBase =
                new LazySingletonValue<>(
                        "url_base",
                        "\"https://api.surveysparrow.com/v3\"",
                        new TypeReference<Optional<? extends SourceSurveySparrowUrlBase>>() {});
    }
}

