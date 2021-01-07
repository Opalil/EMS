package com.ems.emssystem.controller;

import com.ems.emssystem.dto.model.EmployeeDto;
import com.ems.emssystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     *
     * @return
     */
    @GetMapping("/employees")
    public Set<EmployeeDto> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    /**
     *
     * @param employeeDto
     * @return
     */
    @PostMapping("/add/employee")
    public EmployeeDto addEmployee(EmployeeDto employeeDto){



        return employeeService.addEmployee(employeeDto);
    }
}
