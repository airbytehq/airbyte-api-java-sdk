/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.OneOfDeserializer;
import com.airbyte.api.utils.TypedObject;
import com.airbyte.api.utils.Utils.JsonShape;
import com.airbyte.api.utils.Utils.TypeReferenceWithShape;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * SourcePostgresSSLModes - SSL connection modes. 
 *   Read more &lt;a href="https://jdbc.postgresql.org/documentation/head/ssl-client.html"&gt; in the docs&lt;/a&gt;.
 */

@JsonDeserialize(using = SourcePostgresSSLModes._Deserializer.class)
public class SourcePostgresSSLModes {

    @JsonValue
    private TypedObject value;
    
    private SourcePostgresSSLModes(TypedObject value) {
        this.value = value;
    }

    public static SourcePostgresSSLModes of(SourcePostgresDisable value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresDisable>(){}));
    }

    public static SourcePostgresSSLModes of(SourcePostgresAllow value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresAllow>(){}));
    }

    public static SourcePostgresSSLModes of(SourcePostgresPrefer value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresPrefer>(){}));
    }

    public static SourcePostgresSSLModes of(SourcePostgresRequire value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresRequire>(){}));
    }

    public static SourcePostgresSSLModes of(SourcePostgresVerifyCa value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresVerifyCa>(){}));
    }

    public static SourcePostgresSSLModes of(SourcePostgresVerifyFull value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresVerifyFull>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresDisable}</li>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresAllow}</li>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresPrefer}</li>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresRequire}</li>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresVerifyCa}</li>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresVerifyFull}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourcePostgresSSLModes other = (SourcePostgresSSLModes) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourcePostgresSSLModes> {

        public _Deserializer() {
            super(SourcePostgresSSLModes.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresVerifyFull>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresVerifyCa>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresRequire>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresPrefer>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresAllow>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresDisable>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostgresSSLModes.class,
                "value", value);
    }
 
}
