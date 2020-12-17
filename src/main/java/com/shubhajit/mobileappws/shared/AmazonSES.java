package com.shubhajit.mobileappws.shared;

public class AmazonSES {
    // This address must be verified with Amazon SES
    final String FROM = "shubhajit.sahoo@developerblog.com";

    // The subject line for the email
    final String SUBJECT = "One last step to complete your registration with PhotoApp";

    // The HTML body for the email
    final String HTML_BODY = "<h1>Please verify your email address</h1>"
            + "<p>Thank you for registering with our mobile app. To complete registration process and be able to log in</p>"
            + " click on the following link: "
            + "<a href=''>"
            + "Final step to complete your registration"
            + "</a><br/><br/>"
            + "Thank you! And we are waiting for you inside!";
}
