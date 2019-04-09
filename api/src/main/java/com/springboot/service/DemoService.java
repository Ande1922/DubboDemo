package com.springboot.service;

import com.springboot.Entity.Emp;

import java.util.List;

public interface DemoService {

    public Emp findEmp(int id);

    public void delEmp(int id);

    public void modEmp(Emp emp);

    public void addEmp(Emp emp);

    public List<Emp> findEmps();

}
