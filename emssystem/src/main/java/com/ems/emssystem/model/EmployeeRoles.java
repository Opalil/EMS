package com.ems.emssystem.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class EmployeeRoles {

    @OneToOne(mappedBy = "employee_id")
    private Employee employee;

    @OneToOne(mappedBy = "role_id")
    private Role role;
}
