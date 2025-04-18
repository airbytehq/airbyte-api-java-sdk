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
 * DestinationYellowbrickSSLModes
 * 
 * <p>SSL connection modes. 
 *  &lt;b&gt;disable&lt;/b&gt; - Chose this mode to disable encryption of communication between Airbyte and destination database
 *  &lt;b&gt;allow&lt;/b&gt; - Chose this mode to enable encryption only when required by the source database
 *  &lt;b&gt;prefer&lt;/b&gt; - Chose this mode to allow unencrypted connection only if the source database does not support encryption
 *  &lt;b&gt;require&lt;/b&gt; - Chose this mode to always require encryption. If the source database server does not support encryption, connection will fail
 *   &lt;b&gt;verify-ca&lt;/b&gt; - Chose this mode to always require encryption and to verify that the source database server has a valid SSL certificate
 *   &lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Chose this mode to always require encryption and to verify the identity of the source database server
 *  See more information - &lt;a href="https://jdbc.postgresql.org/documentation/head/ssl-client.html"&gt; in the docs&lt;/a&gt;.
 */
@JsonDeserialize(using = DestinationYellowbrickSSLModes._Deserializer.class)
public class DestinationYellowbrickSSLModes {

    @JsonValue
    private TypedObject value;
    
    private DestinationYellowbrickSSLModes(TypedObject value) {
        this.value = value;
    }

    public static DestinationYellowbrickSSLModes of(DestinationYellowbrickDisable value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickDisable>(){}));
    }

    public static DestinationYellowbrickSSLModes of(DestinationYellowbrickAllow value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickAllow>(){}));
    }

    public static DestinationYellowbrickSSLModes of(DestinationYellowbrickPrefer value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickPrefer>(){}));
    }

    public static DestinationYellowbrickSSLModes of(DestinationYellowbrickRequire value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickRequire>(){}));
    }

    public static DestinationYellowbrickSSLModes of(DestinationYellowbrickVerifyCa value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickVerifyCa>(){}));
    }

    public static DestinationYellowbrickSSLModes of(DestinationYellowbrickVerifyFull value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickVerifyFull>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickDisable}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickAllow}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickPrefer}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickRequire}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickVerifyCa}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickVerifyFull}</li>
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
        DestinationYellowbrickSSLModes other = (DestinationYellowbrickSSLModes) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationYellowbrickSSLModes> {

        public _Deserializer() {
            super(DestinationYellowbrickSSLModes.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickVerifyFull>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickVerifyCa>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickRequire>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickPrefer>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickAllow>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickDisable>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationYellowbrickSSLModes.class,
                "value", value);
    }
 
}

