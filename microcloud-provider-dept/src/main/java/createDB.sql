DROP DATABASE IF EXISTS springcloud;
CREATE DATABASE springcloud CHARACTER SET UTF8;
USE springcloud;
CREATE TABLE dept (
  deptno INT AUTO_INCREMENT,
  deptname VARCHAR(50),
  loc VARCHAR(50),
  CONSTRAINT pk_deptno PRIMARY KEY(deptno)
);
INSERT INTO dept(deptname, loc) VALUES('开发部', database());
INSERT INTO dept(deptname, loc) VALUES('运维部', database());
INSERT INTO dept(deptname, loc) VALUES('产品部', database());
