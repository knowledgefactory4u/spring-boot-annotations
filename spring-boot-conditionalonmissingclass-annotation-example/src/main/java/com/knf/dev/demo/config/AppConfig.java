package com.knf.dev.demo.config;

import com.knf.dev.demo.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnMissingClass(value =
            "com.knf.dev.demo.provider.NotificationProvider")
    public SMSNotificationService smsNotificationService()
    {
        return new SMSNotificationService();
    }

}
