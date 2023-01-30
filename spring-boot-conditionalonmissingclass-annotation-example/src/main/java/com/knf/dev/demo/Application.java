package com.knf.dev.demo;


import com.knf.dev.demo.service.SMSNotificationService;
import com.knf.dev.demo.service.TwitterNotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application  {


   public static void main(String[] args) {
           ConfigurableApplicationContext context =
                   SpringApplication.run(Application.class, args);

       SMSNotificationService smsNotificationService =
               context.getBean(SMSNotificationService.class);
       smsNotificationService.sendSmsNotification();

       TwitterNotificationService twitterNotificationService =
               context.getBean(TwitterNotificationService.class);
       twitterNotificationService.sendTwitterNotification();

       context.close();
   }
}
