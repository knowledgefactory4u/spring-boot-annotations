package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailNotificationService;
import com.knf.dev.demo.service.TwitterNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnResource(resources = {"notification.properties"})
public class AppConfig {


    @Bean("emailNotification")
    public EmailNotificationService emailNotificationService()
    {
        return new EmailNotificationService();
    }

    @ConditionalOnResource(resources = {"message.properties"})
    @Bean("twitterNotification")
    public TwitterNotificationService twitterNotificationService()
    {
        return new TwitterNotificationService();
    }
}
