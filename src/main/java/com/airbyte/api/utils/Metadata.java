/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class Metadata {

    private Metadata() {
        // prevent instantiation
    }

    static <T> T parse(String name, T metadata, Field field)
            throws IllegalArgumentException, IllegalAccessException {
        SpeakeasyMetadata md = field.getAnnotation(SpeakeasyMetadata.class);
        if (md == null) {
            return null;
        }

        String mdValue = md.value();

        if (mdValue == null || mdValue.isBlank()) {
            return null;
        }

        String[] groups = mdValue.split(" ");

        boolean handled = false;

        for (String group : groups) {
            String[] parts = group.split(":");
            if (parts.length != 2) {
                return null;
            }

            if (!parts[0].equals(name)) {
                continue;
            }

            Map<String, String> values = new HashMap<>();

            String[] pairs = parts[1].split(",");
            for (String pair : pairs) {
                String[] keyVal = pair.split("=");
                String key = keyVal[0];

                String val = "";
                if (keyVal.length > 1) {
                    val = keyVal[1];
                }

                values.put(key, val);
            }

            Field[] fields = metadata.getClass().getDeclaredFields();

            for (Field f : fields) {
                f.setAccessible(true);
                if (values.containsKey(f.getName())) {
                    String val = values.get(f.getName());

                    if (f.getType().equals(boolean.class) || f.getType().equals(Boolean.class)) {
                        f.set(metadata, val.equals("true") || val.isBlank());
                    } else {
                        f.set(metadata, val);
                    }
                }
            }

            handled = true;
        }

        if (!handled) {
            return null;
        }

        return (T) metadata;
    }
}