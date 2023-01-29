package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailNotificationService;
import com.knf.dev.demo.service.NotificationService;
import com.knf.dev.demo.service.SMSNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnExpression("${notification.enabled:false} " +
            "&& ${notification.sms.enabled:false}")
    public NotificationService smsNotificationService()
    {
        return new SMSNotificationService();
    }

    @Bean
    @ConditionalOnExpression("${notification.enabled:false} " +
            "&& ${notification.email.enabled:false}")
    public NotificationService emailNotificationService()
    {
        return new EmailNotificationService();
    }

}
