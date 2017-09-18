package com.x010.microcloud.rest;


import com.x010.microcloud.service.DeptService;
import com.x010.vo.Dept;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/provider/dept")
public class DeptRest {

    @Resource
    private DeptService deptService;

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable long id) {

        return this.deptService.get(id);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {

        return this.deptService.add(dept);
    }

    @GetMapping("/list")
    public List<Dept> list() {

        return this.deptService.list();
    }

}
