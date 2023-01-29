package com.knf.dev.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@ConditionalOnExpression("${notification.enabled:false} " +
        "&& ${notification.twitter.enabled:false}")
@Service
public class TwitterNotificationService implements NotificationService{

    public TwitterNotificationService() {
        System.out.println("Inside TwitterNotificationService Constructor");
    }
}
