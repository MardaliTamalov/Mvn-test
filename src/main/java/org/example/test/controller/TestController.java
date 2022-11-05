package org.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "/hello")
@RestController
public class TestController {

    @PostMapping("/qwe")
    private void qwe() {
        System.out.println("hello");
    }

    @GetMapping("/test")
    private void test() {
        System.out.println("world");
    }

}

