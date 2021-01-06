package com.ems.emssystem.service;

import com.ems.emssystem.dto.mapper.EmployeeMapper;
import com.ems.emssystem.dto.model.EmployeeDto;
import com.ems.emssystem.model.Employee;
import com.ems.emssystem.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    private EmployeeMapper employeeMapper;

    private ModelMapper modelMapper;


    /**
     *
     * @param email_address
     * @return
     */
    public Employee findByEmail(String email_address){
        return employeeRepository.findByEmail(email_address);
    }

    /**
     *
     * @return
     */
    public Set<EmployeeDto> getAllEmployees(){
        return StreamSupport
                .stream(employeeRepository.findAll().spliterator(), false)
                .map(employee -> modelMapper.map(employee, EmployeeDto.class))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     *
     * @param employeeDto
     * @return
     */
    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();

        employee.setFirstname(employeeDto.getFirstname());
        employee.setLastname(employeeDto.getLastname());
        employee.setEmail_address(employeeDto.getEmail_address());
        employee.setCreationtime(employeeDto.getCreationtime()); // HOMMAA JOSTAIN AIKA TÄHÄN
        employee.setHome_address(employeeDto.getHome_address());
        employee.setZipcode(employeeDto.getZipcode());
        employee.setCity(employeeDto.getCity());
        employee.setCountry(employeeDto.getCountry());

        employeeRepository.save(employee);
        return employeeMapper.toEmployeeDto(employee);
    }


}


