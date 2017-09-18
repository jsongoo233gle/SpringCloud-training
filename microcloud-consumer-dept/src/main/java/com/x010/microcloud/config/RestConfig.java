package com.x010.microcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

@Configuration
public class RestConfig {

    @Bean
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

    @Bean
    public HttpHeaders getHeaders() {

        String auth = "Cloud:Security";// 认证的原始信息
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);// 在进行授权的头信息内容配置时,加密的信息与"Basic"一定要用空格隔开

        // Http头信息设置
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authHeader);

        return headers;

    }

}
