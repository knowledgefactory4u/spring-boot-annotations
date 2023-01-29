package com.knf.dev.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service("smsNotification")
@ConditionalOnBean(name = "smsNotificationProvider")
public class SMSNotificationService {

    public SMSNotificationService() {
        System.out.println("SMSNotificationService Constructor");
    }
}
