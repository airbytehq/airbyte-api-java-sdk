/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.utils;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Security {
    
    private Security() {
        // prevent instantiation
    }
    
    public static HTTPRequest configureSecurity(HTTPRequest request, Object security) throws Exception {
        if (security != null) {
            Field[] fields = security.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = Utils.resolveOptionals(field.get(security));
                if (value == null) {
                    continue;
                }

                SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
                if (securityMetadata == null) {
                    continue;
                }

                if (securityMetadata.option) {
                    parseSecurityOption(request, value);
                } else if (securityMetadata.scheme) {
                    if ((securityMetadata.subtype != null && securityMetadata.subtype.equals("basic"))
                            && Types.getType(value.getClass()) != Types.OBJECT) {
                        parseSecurityScheme(request, securityMetadata, security);
                    } else {
                        parseSecurityScheme(request, securityMetadata, value);
                    }
                }
            }
        }
        return request;
    }

    private static void parseSecurityOption(HTTPRequest request, Object option)
            throws Exception {
        Field[] fields = option.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = Utils.resolveOptionals(field.get(option));
            
            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || !securityMetadata.scheme) {
                continue;
            }

            parseSecurityScheme(request, securityMetadata, value);
        }
    }

    private static void parseSecurityScheme(HTTPRequest requestBuilder, SecurityMetadata schemeMetadata,
            Object scheme) throws Exception {

        if (Types.getType(scheme.getClass()) == Types.OBJECT) {
            if (schemeMetadata.type.equals("http") && schemeMetadata.subtype.equals("basic")) {
                parseBasicAuthScheme(requestBuilder, scheme);
                return;
            }

            Field[] fields = scheme.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = Utils.resolveOptionals(field.get(scheme));

                if (value == null) {
                    continue;
                }

                SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
                if (securityMetadata == null || securityMetadata.name.isEmpty()) {
                    continue;
                }

                parseSecuritySchemeValue(requestBuilder, schemeMetadata, securityMetadata, value);
            }
        } else {
            parseSecuritySchemeValue(requestBuilder, schemeMetadata, schemeMetadata, scheme);
        }
    }

    private static void parseSecuritySchemeValue(HTTPRequest request, SecurityMetadata schemeMetadata,
            SecurityMetadata securityMetadata,
            Object value) throws Exception {
        switch (schemeMetadata.type) {
            case "apiKey":
                switch (schemeMetadata.subtype) {
                    case "header":
                        request.addHeader(securityMetadata.name, Utils.valToString(value));
                        break;
                    case "query":
                        request.addQueryParam(
                                securityMetadata.name, Utils.valToString(value), false);
                        break;
                    case "cookie":
                        request.addHeader("Cookie",
                                String.format("%s=%s", securityMetadata.name, Utils.valToString(value)));
                        break;
                    default:
                        throw new RuntimeException(
                                "Unsupported apiKey security scheme subtype: " + securityMetadata.subtype);
                }
                break;
            case "openIdConnect":
                request.addHeader(securityMetadata.name, Utils.prefixBearer(Utils.valToString(value)));
                break;
            case "oauth2":
                if (!"client_credentials".equals(schemeMetadata.subtype)) {
                    request.addHeader(securityMetadata.name, Utils.prefixBearer(Utils.valToString(value)));
                } 
                break;
            case "http":
                switch (schemeMetadata.subtype) {
                    case "bearer":
                        request.addHeader(securityMetadata.name, Utils.prefixBearer(Utils.valToString(value)));
                        break;
                    case "custom":
                        // customers are expected to consume the security object and transform requests 
                        // in their own BeforeRequest hook.
                        break;
                    default:
                        throw new RuntimeException("Unsupported http security scheme subtype: " + schemeMetadata.subtype);
                }
                break;
            default:
                throw new RuntimeException("Unsupported security scheme type: " + schemeMetadata.subtype);
        }
    }

    private static void parseBasicAuthScheme(HTTPRequest requestBuilder, Object scheme)
            throws IllegalAccessException {
        Field[] fields = scheme.getClass().getDeclaredFields();

        String username = "";
        String password = "";

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = Utils.resolveOptionals(field.get(scheme));

            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || securityMetadata.name.isEmpty()) {
                continue;
            }

            switch (securityMetadata.name) {
                case "username":
                    username = Utils.valToString(value);
                    break;
                case "password":
                    password = Utils.valToString(value);
                    break;
                default:
                    throw new RuntimeException("Unsupported security scheme field for basic auth: " + securityMetadata.name);
            }
        }

        requestBuilder.addHeader("Authorization",
                "Basic " 
                + Base64.getEncoder()
                     .encodeToString(String.format("%s:%s", username, password)
                     .getBytes(StandardCharsets.UTF_8)));
    }
    
    public static Optional<Object> findComplexObjectWithNonEmptyAnnotatedField(Object object, String... regexes) {
        if (object == null || object instanceof String) {
            return Optional.empty();
        }
        Deque<Object> stack = new LinkedList<>();
        // be defensive about circular references (not expected)
        Set<Object> processed = new HashSet<>();
        stack.push(object);
        processed.add(object);
        while (!stack.isEmpty()) {
            Object o = stack.pop();
            Field[] fields = o.getClass().getDeclaredFields();
            List<Field> annotatedFields = Arrays.stream(fields) //
                    .filter(f -> {
                        SpeakeasyMetadata[] anns = f.getDeclaredAnnotationsByType(SpeakeasyMetadata.class);
                        return anns != null && anns.length > 0;
                    }) //
                    .collect(Collectors.toList());
            for (Field f : annotatedFields) {
                SpeakeasyMetadata[] anns = f.getDeclaredAnnotationsByType(SpeakeasyMetadata.class);
                Object value = getUnwrappedFieldValue(o, f);
                if (value != null && !(value instanceof String)) {
                    // we are looking for a complex object (so can't be a String)
                    boolean regexMatches = Arrays //
                            .stream(regexes) //
                            .allMatch(regex -> matches(anns, regex));
                    if (regexMatches) {
                        return Optional.of(value);
                    } else if (!processed.contains(value)) {
                        stack.push(value);
                        processed.add(value);
                    }
                }
            }
        }
        return Optional.empty();
    }

    private static Object getUnwrappedFieldValue(Object o, Field f) {
        try {
            f.setAccessible(true);
            Object value = f.get(o);
            if (value != null && value instanceof Optional) {
                return ((Optional<?>) value).orElse(null);
            } else {
                return value;
            }
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static Stream<Field> findFieldsWhereMetadataContainsRegexes(Object o, String... regexes) {
        Field[] fields = o.getClass().getDeclaredFields();
        return Arrays.stream(fields) //
                .filter(f -> {
                    SpeakeasyMetadata[] anns = f.getDeclaredAnnotationsByType(SpeakeasyMetadata.class);
                    if (anns == null) {
                        return false;
                    }
                    return Arrays //
                        .stream(regexes) //
                        .allMatch(regex -> matches(anns, regex));
                });
    }
    
    public static Optional<String> findStringValueWhereMetadataContainsRegexes(Object o, String... regexes) {
        return findValueWhereMetadataContainsRegexes(o, regexes).map(x -> (String) x);
    }
    
    public static Optional<String> findStringValueWhereMetadataNameIs(Object o, String name) {
        return Security.findStringValueWhereMetadataContainsRegexes(o, "\\bname=" + name + "\\b");
    }
    
    public static Optional<Object> findValueWhereMetadataContainsRegexes(Object o, String... regexes) {
        return findFieldsWhereMetadataContainsRegexes(o, regexes)
                   .flatMap(f -> {
                        f.setAccessible(true);
                        Object result;
                        try {
                            result = f.get(o);
                        } catch (IllegalArgumentException | IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                        if (result instanceof Optional) {
                            @SuppressWarnings("unchecked")
                            Optional<Object> r = (Optional<Object>) result;
                            if (r.isEmpty()) {
                                return Stream.empty();
                            } else {
                               return Stream.of(r.get());
                            }
                        } else {
                            return Stream.of(result);
                        }
                    }).findAny();
    }

    private static boolean matches(SpeakeasyMetadata[] anns, String regex) {
        Pattern pattern = Pattern.compile(regex);
        for (SpeakeasyMetadata ann : anns) {
            if (pattern.matcher(ann.value()).find()) {
                return true;
            }
        }
        return false;
    }
}
