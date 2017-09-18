package com.x010.vo;

import lombok.Data;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
public class Dept implements Serializable {

    private Long deptNo;

    private String deptName;

    private String loc;

}
