package com.springboot.service.impl;

import com.springboot.Entity.Emp;
import com.springboot.mapper.EmpMapper;
import com.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp findEmp(int id) {
        Emp emp = empMapper.findEmp(id);
        System.out.println(emp.getName());
        return emp;
    }

    @Override
    public void delEmp(int id) {
        empMapper.delEmp(id);
        System.out.println("删除");
    }

    @Override
    public void modEmp(Emp emp) {
        empMapper.modEmp(emp);
        System.out.println("修改");
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
        System.out.println("添加");
    }

    @Override
    public List<Emp> findEmps() {
        List<Emp> emps = empMapper.findEmps();
        System.out.println("全查");
        return emps;
    }
}
