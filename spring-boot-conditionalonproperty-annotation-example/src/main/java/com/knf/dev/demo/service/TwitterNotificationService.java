package com.knf.dev.demo.service;

public class TwitterNotificationService implements NotificationService{
    @Override
    public String sendNotification(String message) {
        return "Twitter Notification: " + message;
    }
}
