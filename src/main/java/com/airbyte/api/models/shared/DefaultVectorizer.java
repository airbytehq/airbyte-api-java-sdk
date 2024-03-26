/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * DefaultVectorizer - The vectorizer to use if new classes need to be created
 */
public enum DefaultVectorizer {
    NONE("none"),
    TEXT2VEC_COHERE("text2vec-cohere"),
    TEXT2VEC_HUGGINGFACE("text2vec-huggingface"),
    TEXT2VEC_OPENAI("text2vec-openai"),
    TEXT2VEC_PALM("text2vec-palm"),
    TEXT2VEC_CONTEXTIONARY("text2vec-contextionary"),
    TEXT2VEC_TRANSFORMERS("text2vec-transformers"),
    TEXT2VEC_GPT4ALL("text2vec-gpt4all");

    @JsonValue
    private final String value;

    private DefaultVectorizer(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
