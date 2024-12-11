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
 * SourceMysqlSSLModes - SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
 */

@JsonDeserialize(using = SourceMysqlSSLModes._Deserializer.class)
public class SourceMysqlSSLModes {

    @JsonValue
    private TypedObject value;
    
    private SourceMysqlSSLModes(TypedObject value) {
        this.value = value;
    }

    public static SourceMysqlSSLModes of(Preferred value) {
        Utils.checkNotNull(value, "value");
        return new SourceMysqlSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Preferred>(){}));
    }

    public static SourceMysqlSSLModes of(Required value) {
        Utils.checkNotNull(value, "value");
        return new SourceMysqlSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Required>(){}));
    }

    public static SourceMysqlSSLModes of(SourceMysqlVerifyCA value) {
        Utils.checkNotNull(value, "value");
        return new SourceMysqlSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMysqlVerifyCA>(){}));
    }

    public static SourceMysqlSSLModes of(VerifyIdentity value) {
        Utils.checkNotNull(value, "value");
        return new SourceMysqlSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<VerifyIdentity>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.Preferred}</li>
     * <li>{@code com.airbyte.api.models.shared.Required}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMysqlVerifyCA}</li>
     * <li>{@code com.airbyte.api.models.shared.VerifyIdentity}</li>
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
        SourceMysqlSSLModes other = (SourceMysqlSSLModes) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceMysqlSSLModes> {

        public _Deserializer() {
            super(SourceMysqlSSLModes.class, false,
                  TypeReferenceWithShape.of(new TypeReference<VerifyIdentity>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMysqlVerifyCA>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Required>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Preferred>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMysqlSSLModes.class,
                "value", value);
    }
 
}
