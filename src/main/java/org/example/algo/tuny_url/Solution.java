package org.example.algo.tuny_url;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {

    private static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    // key-original url; value-encoded url
    private static Map<String, String> urlDB = new HashMap<>();
    // key-encoded url; value-original url
    private static Map<String, String> encodedDB = new HashMap<>();
    private static Random random = new Random();

    static String encode(String originalUrl) {
        if(urlDB.containsKey(originalUrl)){
            return urlDB.get(originalUrl);
        }
        String encodedUrl = getShortUrl();
        while (encodedDB.containsKey(encodedUrl)){
            encodedUrl = getShortUrl();
        }
        urlDB.put(originalUrl, encodedUrl);
        encodedDB.put(encodedUrl, originalUrl);

        return encodedUrl;
    }

    private static String getShortUrl() {
        char[] charsArray = new char[6];
        for (int i=0; i<charsArray.length; i++) {
            charsArray[i] = chars.charAt(Math.abs(random.nextInt() % 62)); // 62 - length of chars array
        }
        return "https://tinyurl.com/" + new String(charsArray);
    }

    static String decode(String encodedUrl) {
        return encodedDB.get(encodedUrl);
    }
}
