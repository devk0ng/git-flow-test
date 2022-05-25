package com.example.springtest.controller;

import com.example.springtest.dto.cookieRequest;
import com.example.springtest.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test/{cmailId}/hi")
    public String test(@PathVariable("cmailId") String cmailId) {
        System.out.println("path info : " + cmailId);

        return cmailId;
    }

    @PostMapping("/test")
    public String test2(cookieRequest c) {

        System.out.println(c);
        return null;
    }
}
