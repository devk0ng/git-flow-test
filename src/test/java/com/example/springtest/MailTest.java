package com.example.springtest;

import org.junit.jupiter.api.Test;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Base64;

public class MailTest {
    @Test
    void parseTest() throws Exception {
        String ct="attachment; filename=\"%ED%8A%B9%EC%88%98%E4%BD%A0%E5%A5%BDabcABC%C3%A6%C3%B8%C3%A5%C3%86%C3%98%C3%85%C3%A4%C3%B6%C3%BC%C3%AF%C3%AB%C3%AA%C3%AE%C3%A2%C3%A9%C3%AD%C3%A1%C3%B3%C3%BA%C3%BD%C3%B1%C2%BD%C2%A7!%23%C2%A4%25&()=`@%C2%A3$%E2%82%AC{[]}__%2B%C2%B4%C2%A8^~'-_,; .txt\"; filename*=UTF-8''%ED%8A%B9%EC%88%98%E4%BD%A0%E5%A5%BDabcABC%C3%A6%C3%B8%C3%A5%C3%86%C3%98%C3%85%C3%A4%C3%B6%C3%BC%C3%AF%C3%AB%C3%AA%C3%AE%C3%A2%C3%A9%C3%AD%C3%A1%C3%B3%C3%BA%C3%BD%C3%B1%C2%BD%C2%A7%21%23%C2%A4%25%26%28%29%3D%60%40%C2%A3%24%E2%82%AC%7B%5B%5D%7D__%2B%C2%B4%C2%A8%5E%7E%27-_%2C%3B%20.txt";
        ContentDisposition cd = new ContentDisposition(ct);

        String filename = cd.getParameter("filename");

        System.out.println("filename = " + filename);
        String s = MimeUtility.decodeText(filename);
        System.out.println("s = " + s);

      //  System.out.println(URLDecoder.decode(filename, "utf-8"));


    }

    @Test
    void baseTest() {
        String fn = "==?KSC5601?B?YSkgwPzA2sbHuMUgvK23+b7nvcQucGRm?=;";

        byte[] decode = Base64.getDecoder().decode(fn);

        System.out.println("decode = " + decode);
    }
}
