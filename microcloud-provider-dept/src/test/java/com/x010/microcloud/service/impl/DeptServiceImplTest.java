package com.x010.microcloud.service.impl;

import com.x010.Dept_8001_StartProviderApp;
import com.x010.microcloud.service.DeptService;
import com.x010.vo.Dept;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = Dept_8001_StartProviderApp.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DeptServiceImplTest extends TestCase {

    @Resource
    private DeptService deptService;

    @Test
    public void testGet() throws Exception {
        System.out.println(this.deptService.get(1));
    }

    @Test
    public void testAdd() throws Exception {
        Dept dept = new Dept();
        dept.setDeptName("测试部-" + System.currentTimeMillis());
        System.out.println(this.deptService.add(dept));
    }

    @Test
    public void testList() throws Exception {
        System.out.println(this.deptService.list());
    }

}