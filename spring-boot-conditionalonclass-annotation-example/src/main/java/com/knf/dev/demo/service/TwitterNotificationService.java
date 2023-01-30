package com.knf.dev.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnClass(name=
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
