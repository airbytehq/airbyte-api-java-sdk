/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.airbyte.api.utils.TypedObject;
import com.airbyte.api.utils.Utils.JsonShape;

/**
 * DestinationYellowbrickSSLModes - SSL connection modes. 
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

    @com.fasterxml.jackson.annotation.JsonValue
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
     * <li>{@code DestinationYellowbrickDisable}</li>
     * <li>{@code DestinationYellowbrickAllow}</li>
     * <li>{@code DestinationYellowbrickPrefer}</li>
     * <li>{@code DestinationYellowbrickRequire}</li>
     * <li>{@code DestinationYellowbrickVerifyCa}</li>
     * <li>{@code DestinationYellowbrickVerifyFull}</li>
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
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationYellowbrickSSLModes> {

        public _Deserializer() {
            super(DestinationYellowbrickSSLModes.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickDisable>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickAllow>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickPrefer>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickRequire>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickVerifyCa>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickVerifyFull>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationYellowbrickSSLModes.class,
                "value", value);
    }
 
}