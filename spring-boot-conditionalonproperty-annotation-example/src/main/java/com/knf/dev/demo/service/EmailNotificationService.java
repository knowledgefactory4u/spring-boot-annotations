package com.knf.dev.demo.service;

public class EmailNotificationService implements NotificationService {

    @Override
    public String sendNotification(String message) {
        return "Email Notification: " + message;
    }
}