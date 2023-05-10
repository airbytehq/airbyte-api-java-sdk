/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlSslMethodEncryptedTrustServerCertificate - Use the certificate provided by the server without verification. (For testing purposes only!)
 */
public class SourceMssqlSslMethodEncryptedTrustServerCertificate {
    @JsonProperty("ssl_method")
    public SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum sslMethod;

    public SourceMssqlSslMethodEncryptedTrustServerCertificate withSslMethod(SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
    public SourceMssqlSslMethodEncryptedTrustServerCertificate(@JsonProperty("ssl_method") SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum sslMethod) {
        this.sslMethod = sslMethod;
  }
}
