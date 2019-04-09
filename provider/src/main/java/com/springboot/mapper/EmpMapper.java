package com.springboot.mapper;

import com.springboot.Entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    public Emp findEmp(int id);

    public void delEmp(int id);

    public void modEmp(Emp emp);

    public void addEmp(Emp emp);

    public List<Emp> findEmps();

}
