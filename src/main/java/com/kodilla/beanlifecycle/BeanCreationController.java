package com.kodilla.beanlifecycle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BeanCreationController {

    @PostMapping("/beans")
    public ResponseEntity<Void> createBean() {
        LibraryManager manager = new LibraryManager();
        return ResponseEntity.noContent().build();
    }
}
