package com.x010.microcloud.service.impl;

import com.x010.microcloud.dao.DeptDAO;
import com.x010.microcloud.service.DeptService;
import com.x010.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDAO deptDAO;

    @Override
    public Dept get(long id) {

        return this.deptDAO.findById(id);
    }

    @Override
    public boolean add(Dept dept) {

        return this.deptDAO.create(dept);
    }

    @Override
    public List<Dept> list() {

        return this.deptDAO.findAll();
    }
}
