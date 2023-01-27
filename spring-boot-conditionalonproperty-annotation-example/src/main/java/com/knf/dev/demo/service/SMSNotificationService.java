package com.knf.dev.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("smsNotification")
@ConditionalOnProperty
        (prefix = "notification",
                name = "service")
public class SMSNotificationService implements NotificationService{
    @Override
    public String sendNotification(String message) {
        return "SMS Notification: " + message;
    }
}
