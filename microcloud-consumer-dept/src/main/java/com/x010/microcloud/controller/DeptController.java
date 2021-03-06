package com.x010.microcloud.controller;

import com.x010.vo.Dept;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController {

    public static final String DEPT_GET_URL = "http://localhost:8001/provider/dept/get/";
    public static final String DEPT_ADD_URL = "http://localhost:8001/provider/dept/add/";
    public static final String DEPT_LIST_URL = "http://localhost:8001/provider/dept/list/";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders headers;

    // http://localhost/consumer/dept/get?id=1
    @GetMapping("/get")
    public Dept getDept(long id) {

        return this.restTemplate.exchange(DEPT_GET_URL + id, HttpMethod.GET, new HttpEntity<Object>(this.headers), Dept.class).getBody();
    }

    // http://localhost/consumer/dept/add?deptName=测试
    @GetMapping("/add")
    public boolean addDept(Dept dept) {

        return this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST, new HttpEntity<Object>(dept, this.headers), Boolean.class).getBody();
    }

    // http://localhost/consumer/dept/list
    @GetMapping("/list")
    public List<Dept> listDept() {

        return this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class).getBody();
    }

}
