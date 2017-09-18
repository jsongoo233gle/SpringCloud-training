package com.x010;


import java.nio.charset.Charset;
import java.util.Base64;

public class HeaderTest {

    public static void main(String[] args) {
        String auth = "Cloud:Security";// 原始认证信息
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));// 加密处理
        String authHeader = "Basic " + new String(encodedAuth);
        System.out.println(new String(authHeader));
    }

}
