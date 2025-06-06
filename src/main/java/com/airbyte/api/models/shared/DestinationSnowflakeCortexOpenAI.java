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

/**
 * DestinationSnowflakeCortexOpenAI
 * 
 * <p>Use the OpenAI API to embed text. This option is using the text-embedding-ada-002 model with 1536 embedding dimensions.
 */
public class DestinationSnowflakeCortexOpenAI {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationSnowflakeCortexMode> mode;

    @JsonProperty("openai_key")
    private String openaiKey;

    @JsonCreator
    public DestinationSnowflakeCortexOpenAI(
            @JsonProperty("openai_key") String openaiKey) {
        Utils.checkNotNull(openaiKey, "openaiKey");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.openaiKey = openaiKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationSnowflakeCortexMode> mode() {
        return (Optional<DestinationSnowflakeCortexMode>) mode;
    }

    @JsonIgnore
    public String openaiKey() {
        return openaiKey;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DestinationSnowflakeCortexOpenAI withOpenaiKey(String openaiKey) {
        Utils.checkNotNull(openaiKey, "openaiKey");
        this.openaiKey = openaiKey;
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
        DestinationSnowflakeCortexOpenAI other = (DestinationSnowflakeCortexOpenAI) o;
        return 
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.openaiKey, other.openaiKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            mode,
            openaiKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationSnowflakeCortexOpenAI.class,
                "mode", mode,
                "openaiKey", openaiKey);
    }
    
    public final static class Builder {
 
        private String openaiKey;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder openaiKey(String openaiKey) {
            Utils.checkNotNull(openaiKey, "openaiKey");
            this.openaiKey = openaiKey;
            return this;
        }
        
        public DestinationSnowflakeCortexOpenAI build() {
            return new DestinationSnowflakeCortexOpenAI(
                openaiKey);
        }

        private static final LazySingletonValue<Optional<? extends DestinationSnowflakeCortexMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"openai\"",
                        new TypeReference<Optional<? extends DestinationSnowflakeCortexMode>>() {});
    }
}
