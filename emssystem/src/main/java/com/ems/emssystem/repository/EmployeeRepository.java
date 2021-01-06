package com.ems.emssystem.repository;

import com.ems.emssystem.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByEmail(String email_address);
}
