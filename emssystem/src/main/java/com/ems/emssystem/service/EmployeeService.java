package com.ems.emssystem.service;

import com.ems.emssystem.dto.model.EmployeeDto;

import java.util.Set;

public interface EmployeeService {

    Set<EmployeeDto> getAllEmployees();

    EmployeeDto addEmployee(EmployeeDto employeeDto);

}
