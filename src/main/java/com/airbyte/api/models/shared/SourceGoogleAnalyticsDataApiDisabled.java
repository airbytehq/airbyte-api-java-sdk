/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class SourceGoogleAnalyticsDataApiDisabled {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    private Optional<? extends SourceGoogleAnalyticsDataApiEnabled> enabled;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiDisabled() {
        
        this.enabled = Builder._SINGLETON_VALUE_Enabled.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleAnalyticsDataApiEnabled> enabled() {
        return (Optional<SourceGoogleAnalyticsDataApiEnabled>) enabled;
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
        SourceGoogleAnalyticsDataApiDisabled other = (SourceGoogleAnalyticsDataApiDisabled) o;
        return 
            Objects.deepEquals(this.enabled, other.enabled);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            enabled);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiDisabled.class,
                "enabled", enabled);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceGoogleAnalyticsDataApiDisabled build() {
            return new SourceGoogleAnalyticsDataApiDisabled(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleAnalyticsDataApiEnabled>> _SINGLETON_VALUE_Enabled =
                new LazySingletonValue<>(
                        "enabled",
                        "\"false\"",
                        new TypeReference<Optional<? extends SourceGoogleAnalyticsDataApiEnabled>>() {});
    }
}
