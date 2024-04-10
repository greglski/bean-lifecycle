package com.kodilla.beanlifecycle.rest;

import com.kodilla.beanlifecycle.model.BookCheckPrototype;
import com.kodilla.beanlifecycle.model.BookCheckSingleton;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class BeanCreationController {

    private final ApplicationContext context;

    @GetMapping("/beans")
    public ResponseEntity<Void> createBean() {
        var bookCheckPrototype = context.getBean(BookCheckPrototype.class);
        var isPresentPrototype = bookCheckPrototype.isPresentPrototype();
        System.out.println("bookCheckPrototype bean is present: " + isPresentPrototype);

        var bookCheckSingleton = context.getBean(BookCheckSingleton.class);
        var isPresentSingleton = bookCheckSingleton.isPresentSingleton();
        System.out.println("bookCheckSingleton bean is present: " + isPresentSingleton);

        return ResponseEntity.noContent().build();
    }

}
