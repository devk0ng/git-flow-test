package com.example.springtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.util.UriUtils;

@SpringBootTest
class SpringtestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        String encode = UriUtils.encode("adfadf;aag;adsg", "UTF-8");
        System.out.println(encode);
    }

}
