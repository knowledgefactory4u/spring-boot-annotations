package com.knf.dev.demo.config;

import com.knf.dev.demo.provider.NotificationProvider;
import com.knf.dev.demo.service.EmailNotificationService;
import com.knf.dev.demo.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnClass(name =
            "com.knf.dev.demo.provider.NotificationProvider")
    public SMSNotificationService smsNotificationService()
    {
        return new SMSNotificationService();
    }

    @Bean
    @ConditionalOnClass(NotificationProvider.class)
    public EmailNotificationService emailNotificationService()
    {
        return new EmailNotificationService();
    }
}
