package com.ems.emssystem.service;

import com.ems.emssystem.dto.model.EmployeeDto;
import com.ems.emssystem.model.Employee;

import java.util.List;
import java.util.Set;

public interface EmployeeService {

    List<Employee> findAllEmployeesAndRoles();
    List<Employee> findAllEmployeesByRoles(String role_name);

    Set<EmployeeDto> getAllEmployees();

    EmployeeDto addEmployee(EmployeeDto employeeDto);

}
