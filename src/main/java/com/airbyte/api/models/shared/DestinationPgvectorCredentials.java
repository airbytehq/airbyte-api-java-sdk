/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DestinationPgvectorCredentials {

    /**
     * Enter the password you want to use to access the database
     */
    @JsonProperty("password")
    private String password;

    @JsonCreator
    public DestinationPgvectorCredentials(
            @JsonProperty("password") String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
    }

    /**
     * Enter the password you want to use to access the database
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Enter the password you want to use to access the database
     */
    public DestinationPgvectorCredentials withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
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
        DestinationPgvectorCredentials other = (DestinationPgvectorCredentials) o;
        return 
            Objects.deepEquals(this.password, other.password);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            password);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPgvectorCredentials.class,
                "password", password);
    }
    
    public final static class Builder {
 
        private String password;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Enter the password you want to use to access the database
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }
        
        public DestinationPgvectorCredentials build() {
            return new DestinationPgvectorCredentials(
                password);
        }
    }
}

