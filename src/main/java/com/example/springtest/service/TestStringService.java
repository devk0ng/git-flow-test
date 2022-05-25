package com.example.springtest.service;

import com.example.springtest.dto.testDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class TestStringService implements TestService{
    @Override
    public String data() {
        testDto test = new testDto();

        return test.getData();
    }
}
