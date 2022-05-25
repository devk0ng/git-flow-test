package com.example.springtest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class cookieRequest {
    private String name;
    private String sessionCheck;

    @Override
    public String toString() {
        return "cookieRequest{" +
                "name='" + name + '\'' +
                ", sessionCheck='" + sessionCheck + '\'' +
                '}';
    }
}
