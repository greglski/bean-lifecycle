package com.kodilla.beanlifecycle.configuration;

import com.kodilla.beanlifecycle.model.BookCheckPrototype;
import com.kodilla.beanlifecycle.model.BookCheckSingleton;
import com.kodilla.beanlifecycle.model.LibraryManager;
import com.kodilla.beanlifecycle.monitors.BeanCreationLogger;
import com.kodilla.beanlifecycle.monitors.BeanMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    @Scope("prototype")
    public BookCheckPrototype bookCheckPrototype() {
        return new BookCheckPrototype();
    }

    @Bean
    @Scope("singleton")
    public BookCheckSingleton bookCheckSingleton() {
        return new BookCheckSingleton();
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
