package com.x010.microcloud.service;

import com.x010.vo.Dept;

import java.util.List;

public interface DeptService {

    Dept get(long id);

    boolean add(Dept dept);

    List<Dept> list();

}
