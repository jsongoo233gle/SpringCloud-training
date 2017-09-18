package com.x010.microcloud.dao;

import com.x010.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDAO {

    boolean create(Dept vo);

    Dept findById(Long id);

    List<Dept> findAll();

}
