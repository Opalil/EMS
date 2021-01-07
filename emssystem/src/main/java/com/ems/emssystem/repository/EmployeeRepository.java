package com.ems.emssystem.repository;

import com.ems.emssystem.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value = "")
    List<Employee> findAllEmployeesAndRoles();

    @Query
    List<Employee> findAllEmployeesByRoles(String role_name);
}
