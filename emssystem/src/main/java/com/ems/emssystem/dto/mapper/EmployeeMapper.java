package com.ems.emssystem.dto.mapper;

import com.ems.emssystem.dto.model.EmployeeDto;
import com.ems.emssystem.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public static EmployeeDto toEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFirstname(employee.getFirstname());
        employeeDto.setLastname(employee.getLastname());
        employeeDto.setEmail_address(employee.getEmail_address());
        employeeDto.setCreationtime(employee.getCreationtime());
        employeeDto.setHome_address(employee.getHome_address());
        employeeDto.setZipcode(employee.getZipcode());
        employeeDto.setCity(employee.getCity());
        employeeDto.setCountry(employee.getCountry());
        return employeeDto;
    }
}
