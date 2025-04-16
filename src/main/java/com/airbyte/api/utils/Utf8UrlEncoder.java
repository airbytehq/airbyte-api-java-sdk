/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.utils;

import java.io.CharArrayWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Objects;

// Internal use only
// TODO move to an internal package
public final class Utf8UrlEncoder {

    private static final BitSet DO_NOT_ENCODE_CHARS = createDoNotEncodeChars();
    private static final int CASE_DIFF = ('a' - 'A');

    private final BitSet safeChars;

    public static final Utf8UrlEncoder ALLOW_RESERVED = new Utf8UrlEncoder(":/?#[]@!$&'()*+,;=");
    public static final Utf8UrlEncoder DEFAULT = new Utf8UrlEncoder("");

    public static Utf8UrlEncoder allowReserved(boolean allowReserved) {
        return allowReserved ? ALLOW_RESERVED : DEFAULT;
    }

    private Utf8UrlEncoder(String safeCharacters) {
        Objects.requireNonNull(safeCharacters, "safeCharacters");
        int max = -1;
        for (int i = 0; i < safeCharacters.length(); i++) {
            char ch = safeCharacters.charAt(i);
            max = Math.max(ch, max);
        }
        BitSet safeChars = new BitSet(max + 1);
        for (int i = 0; i < safeCharacters.length(); i++) {
            char ch = safeCharacters.charAt(i);
            safeChars.set(ch);
        }
        this.safeChars = safeChars;
    }

    public String encode(String s) {
        return encode(s, StandardCharsets.UTF_8);
    }
    
    private String encode(String s, Charset charset) {
        boolean changed = false;
        StringBuilder out = new StringBuilder(s.length());
        CharArrayWriter writer = new CharArrayWriter();

        for (int i = 0; i < s.length();) {
            int c = (int) s.charAt(i);
            if (DO_NOT_ENCODE_CHARS.get(c) || safeChars.get(c)) {
                out.append((char) c);
                i++;
            } else {
                // convert to external encoding before hex conversion
                do {
                    writer.write(c);
                    if (c >= 0xD800 && c <= 0xDBFF) {
                        if ((i + 1) < s.length()) {
                            int d = (int) s.charAt(i + 1);
                            if (d >= 0xDC00 && d <= 0xDFFF) {
                                writer.write(d);
                                i++;
                            }
                        }
                    }
                    i++;
                } while (i < s.length() && !DO_NOT_ENCODE_CHARS.get((c = (int) s.charAt(i))));

                writer.flush();
                String str = new String(writer.toCharArray());
                byte[] ba = str.getBytes(charset);
                for (int j = 0; j < ba.length; j++) {
                    out.append('%');
                    char ch = Character.forDigit((ba[j] >> 4) & 0xF, 16);
                    // converting to use uppercase letter as part of
                    // the hex value if ch is a letter.
                    if (Character.isLetter(ch)) {
                        ch -= CASE_DIFF;
                    }
                    out.append(ch);
                    ch = Character.forDigit(ba[j] & 0xF, 16);
                    if (Character.isLetter(ch)) {
                        ch -= CASE_DIFF;
                    }
                    out.append(ch);
                }
                writer.reset();
                changed = true;
            }
        }

        return (changed ? out.toString() : s);
    }

    private static BitSet createDoNotEncodeChars() {
        BitSet b = new BitSet(256);
        for (int i = 'a'; i <= 'z'; i++) {
            b.set(i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            b.set(i);
        }
        for (int i = '0'; i <= '9'; i++) {
            b.set(i);
        }
        b.set('-');
        b.set('_');
        b.set('.');
        b.set('*');
        return b;
    }
}
