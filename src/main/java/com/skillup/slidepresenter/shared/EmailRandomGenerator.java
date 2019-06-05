package com.skillup.slidepresenter.shared;

public class EmailRandomGenerator {

    public static String generateEmailMailanator() {
        return generateStringwithPattern("myyuliia", "ooo") + "@mailinator.com";
    }

    private static String generateStringwithPattern(String pattern1, String pattern2) {
        return pattern1 + Math.round(Math.random() * 1000) + pattern2;
    }
}
