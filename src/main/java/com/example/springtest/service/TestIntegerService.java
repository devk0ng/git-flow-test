package com.example.springtest.service;

import org.springframework.stereotype.Service;

@Service
public class TestIntegerService implements TestService{
    @Override
    public String data() {
        return "1";
    }
}
