package com.springboot.controller;

import com.springboot.Entity.Emp;
import com.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private DemoService demoService;

    Map<String, String> map = new HashMap<>();

    @RequestMapping("/getEmp.do")
    public Emp getEmp(int id) {
        Emp emp = demoService.findEmp(id);
        return emp;
    }


    @RequestMapping("/findEmps.do")
    public List<Emp> findEmpss() {
        List<Emp> emps = demoService.findEmps();
        System.out.println("全查");
        return emps;
    }

    @RequestMapping("/delById.do")
    public String delEmpById() {
        demoService.delEmp(3);
        return "success";
    }

    @RequestMapping("/modById.do")
    public String modById(Emp emp) {
	/*	emp.setId(2);
		emp.setName("dfjjk");
		emp.setGender(3);
		emp.setDeptId(5);*/
        demoService.modEmp(emp);
        return "success";
    }

    @RequestMapping("/addById.do")
    public Map<String, String> addById(Emp emp) {
	/*	emp.setName("大家风范");
		emp.setGender(2);
		emp.setDeptId(5);*/
        System.out.println(emp);
        demoService.addEmp(emp);
        map.put("fanhui", "success");
        return map;
    }

}
