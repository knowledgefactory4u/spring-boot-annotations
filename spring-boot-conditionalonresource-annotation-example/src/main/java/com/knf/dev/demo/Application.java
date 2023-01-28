package com.knf.dev.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application  {


   public static void main(String[] args) {
           ConfigurableApplicationContext context =
                   SpringApplication.run(Application.class, args);

       String[] beans = context.getBeanDefinitionNames();

       boolean containsEmailNotification = Arrays.stream(beans)
               .anyMatch("emailNotification"::equalsIgnoreCase);
       boolean containsSMSNotification = Arrays.stream(beans)
               .anyMatch("smsNotification"::equalsIgnoreCase);
       boolean containsTwitterNotification = Arrays.stream(beans)
               .anyMatch("twitterNotification"::equalsIgnoreCase);

       if (containsTwitterNotification) {
           System.out.println("Twitter Notification loaded");
       } else {
           System.out.println("Twitter Notification not loaded");
       }

       if (containsEmailNotification) {
           System.out.println("Email Notification loaded");
       } else {
           System.out.println("Email Notification not loaded");
       }

       if (containsSMSNotification) {
           System.out.println("SMS Notification loaded");
       } else {
           System.out.println("SMS Notification not loaded");
       }
       context.close();
   }
}
