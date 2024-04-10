package com.kodilla.beanlifecycle.rest;

import com.kodilla.beanlifecycle.model.BookCheck;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class BeanCreationController {

    private final BookCheck bookCheck;

    @PostMapping("/beans")
    public ResponseEntity<Boolean> createBean() {
        Boolean isNew = bookCheck.isNew();
        return ResponseEntity.ok(isNew);
    }
}
