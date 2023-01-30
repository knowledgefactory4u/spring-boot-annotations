package com.knf.dev.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnMissingClass(value=
        "com.knf.dev.demo.provider.NotificationProvider")
public class TwitterNotificationService {

    public TwitterNotificationService() {
        System.out.println("Inside TwitterNotificationService Constructor");
    }

    public void sendTwitterNotification()
    {
        System.out.println("Sending Twitter Notification");
    }
}
