package com.tw.employee;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class EmployeeController {
    private List<Employee> employees;

    public static final List<Employee> employeeList =  Arrays.asList(
            new Employee(1, "小明", 20, "男"),
            new Employee(2, "小红", 19, "女"),
            new Employee(3, "小智", 15, "男"),
            new Employee(4, "小刚", 16, "男"),
            new Employee(5, "小霞", 15, "女")
    );

    public EmployeeController() {
        this.employees = employeeList;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> getEmployees() {
        return employees;
    }
}
