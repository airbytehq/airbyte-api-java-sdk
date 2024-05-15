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

/**
 * DestinationWeaviateByProgrammingLanguage - Split the text by suitable delimiters based on the programming language. This is useful for splitting code into chunks.
 */

public class DestinationWeaviateByProgrammingLanguage {

    /**
     * Split code in suitable places based on the programming language
     */
    @JsonProperty("language")
    private DestinationWeaviateLanguage language;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode> mode;

    @JsonCreator
    public DestinationWeaviateByProgrammingLanguage(
            @JsonProperty("language") DestinationWeaviateLanguage language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    /**
     * Split code in suitable places based on the programming language
     */
    @JsonIgnore
    public DestinationWeaviateLanguage language() {
        return language;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode> mode() {
        return (Optional<DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode>) mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Split code in suitable places based on the programming language
     */
    public DestinationWeaviateByProgrammingLanguage withLanguage(DestinationWeaviateLanguage language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
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
        DestinationWeaviateByProgrammingLanguage other = (DestinationWeaviateByProgrammingLanguage) o;
        return 
            java.util.Objects.deepEquals(this.language, other.language) &&
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            language,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationWeaviateByProgrammingLanguage.class,
                "language", language,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private DestinationWeaviateLanguage language;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Split code in suitable places based on the programming language
         */
        public Builder language(DestinationWeaviateLanguage language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }
        
        public DestinationWeaviateByProgrammingLanguage build() {
            return new DestinationWeaviateByProgrammingLanguage(
                language);
        }

        private static final LazySingletonValue<Optional<? extends DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"code\"",
                        new TypeReference<Optional<? extends DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode>>() {});
    }
}

