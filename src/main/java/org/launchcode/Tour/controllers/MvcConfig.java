package org.launchcode.Tour.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");    //landing page
        registry.addViewController("/").setViewName("home");        //landing page
        registry.addViewController("/hello").setViewName("hello");  //home page when logged in
        registry.addViewController("/login").setViewName("login");  //login page
        registry.addViewController("/user").setViewName("user");    //user accessible page
        registry.addViewController("/admin").setViewName("admin");  //admin only accessible page
        registry.addViewController("/error").setViewName("error");  //admin only accessible page
    }
}
