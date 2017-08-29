package com.fintonic.fintonictestchallenge.utils;

/**
 * Created by Kiketurry on 29/08/2017.
 */

public class StringUtils {
    
    public static String nickAndName(String nick, String name) {
        return String.format("%1s (%2s)", nick, name);
    }
}
