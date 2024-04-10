package com.kodilla.beanlifecycle.configuration;

import com.kodilla.beanlifecycle.model.BookCheck;
import com.kodilla.beanlifecycle.model.LibraryManager;
import com.kodilla.beanlifecycle.monitors.BeanCreationLogger;
import com.kodilla.beanlifecycle.monitors.BeanMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public BookCheck bookCheck() {
        return new BookCheck();
    }

    @Bean
    public BeanMonitor beanMonitor() {
        return new BeanMonitor();
    }

    @Bean
    public BeanCreationLogger beanCreationLogger() {
        return new BeanCreationLogger();
    }
}
