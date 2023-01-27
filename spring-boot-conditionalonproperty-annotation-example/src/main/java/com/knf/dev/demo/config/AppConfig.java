package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailNotificationService;
import com.knf.dev.demo.service.NotificationService;
import com.knf.dev.demo.service.TwitterNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @ConditionalOnProperty
            (prefix = "notification",
                    name = "service")
    @Bean(name = "emailNotification")
    public NotificationService emailNotificationService()
    {
        return new EmailNotificationService();
    }

    @ConditionalOnProperty
            (prefix = "notification",
                    name = "service",
                    havingValue = "twitter")
    @Bean(name = "twitterNotification")
    public NotificationService twitterNotificationService()
    {
        return new TwitterNotificationService();
    }

}
