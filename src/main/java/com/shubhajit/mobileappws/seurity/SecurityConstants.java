package com.shubhajit.mobileappws.seurity;

import com.shubhajit.mobileappws.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 1000 * 60 * 60 * 2; // 2 hrs
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    public static final String EMAIL_VERIFICATION_URL = "/users/email-verification";
    // public static final String TOKEN_SECRET = "secret";

    public static String getTokenSecret() {
        ApplicationProperties properties = (ApplicationProperties) SpringApplicationContext.getBean("applicationProperties");
        return properties.getTokenSecret();
    }
}
