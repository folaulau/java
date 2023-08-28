package com.kaveinga.regex;

import java.util.regex.Pattern;

public class RegexBasics {

    static Pattern pattern = null;

    public static void main(String[] args) {
        String chars = "x";
        boolean matches = matchAnySingleCharacter(chars);

        System.out.println("matchAnyCharacter: "+chars+", matches:"+matches);

        chars = "9";
        matches = matchAnySingleDigit(chars);

        System.out.println("matchAnyDigit: "+chars+", matches:"+matches);

        chars = "l";
        matches = matchAnySingleNonDigit(chars);

        System.out.println("matchAnySingleNonDigit: "+chars+", matches:"+matches);

        chars = "a";
        matches = matchZeroOrMore(chars);

        System.out.println("matchZeroOrMore: "+chars+", matches:"+matches);

        chars = "aaa";
        matches = matchOneOrMore(chars);

        System.out.println("matchOneOrMore: "+chars+", matches:"+matches);

        chars = "a";
        matches = matchZeroOrOne(chars);

        System.out.println("matchZeroOrOne: "+chars+", matches:"+matches);

        chars = "aa";
        matches = matchZeroOrOne(chars);

        System.out.println("matchZeroOrOne: "+chars+", matches:"+matches);

        chars = "aaa";
        matches = matchExactNTimes(chars);

        System.out.println("matchExactNTimes: "+chars+", matches:"+matches);

        chars = "aaaa";
        matches = matchExactNTimes(chars);

        System.out.println("matchExactNTimes: "+chars+", matches:"+matches);
    }

    static boolean matchAnySingleCharacter(String chars){
        String regex = ".";
        return Pattern.compile(regex).matcher(chars).matches();
    }

    /**
     * matches any one digit
     */
    static boolean matchAnySingleDigit(String chars){
        String regex = "\\d";
        return Pattern.compile(regex).matcher(chars).matches();
    }

    static boolean matchAnySingleNonDigit(String chars){
        String regex = "\\D";
        return Pattern.compile(regex).matcher(chars).matches();
    }

    /**
     * matches zero or more of the same character
     */
    static boolean matchZeroOrMore(String chars){
        String regex = "a*";
        return Pattern.compile(regex).matcher(chars).matches();
    }

    /**
     * matches 1 or more of the same character
     */
    static boolean matchOneOrMore(String chars){
        String regex = "a+";
        return Pattern.compile(regex).matcher(chars).matches();
    }

    /**
     * matches zero or 1 of the same character
     */
    static boolean matchZeroOrOne(String chars){
        String regex = "a?";
        return Pattern.compile(regex).matcher(chars).matches();
    }

    /**
     * matches exactly n times of the same character
     */
    static boolean matchExactNTimes(String chars){
        String regex = "a{3}";
        return Pattern.compile(regex).matcher(chars).matches();
    }
}
