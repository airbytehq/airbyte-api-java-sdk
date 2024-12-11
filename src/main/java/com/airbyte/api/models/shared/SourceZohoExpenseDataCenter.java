/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourceZohoExpenseDataCenter - The domain suffix for the Zoho Expense API based on your data center location (e.g., 'com', 'eu', 'in', etc.)
 */
public enum SourceZohoExpenseDataCenter {
    COM("com"),
    IN("in"),
    JP("jp"),
    CA("ca"),
    COM_CN("com.cn"),
    SA("sa"),
    COM_AU("com.au"),
    EU("eu");

    @JsonValue
    private final String value;

    private SourceZohoExpenseDataCenter(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
