package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailNotificationService;
import com.knf.dev.demo.service.TwitterNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("emailNotification")
    @ConditionalOnBean(name = "emailNotificationProvider")
    public EmailNotificationService emailNotificationService()
    {
        return new EmailNotificationService();
    }

    @Bean("twitterNotification")
    public TwitterNotificationService twitterNotificationService()
    {
        return new TwitterNotificationService();
    }
}
