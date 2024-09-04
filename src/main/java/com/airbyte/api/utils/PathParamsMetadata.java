/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.utils;

import java.lang.reflect.Field;

class PathParamsMetadata {

    String style = "simple";
    boolean explode;
    String name;
    String serialization;

    private PathParamsMetadata() {
    }

    // pathParam:style=simple,explode=false,name=apiID
    static PathParamsMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("pathParam", new PathParamsMetadata(), field);
    }
}
