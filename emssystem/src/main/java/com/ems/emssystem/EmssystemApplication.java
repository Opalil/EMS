package com.ems.emssystem;

import com.ems.emssystem.model.Employee;
import com.ems.emssystem.repository.EmployeeRepository;
import com.ems.emssystem.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmssystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmssystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository employeeRepository) throws Exception {
		return (String[] args) -> {
			/*Employee employee = new Employee();

			employee.setFirstname(employeeDto.getFirstname());
			employee.setLastname(employeeDto.getLastname());
			employee.setEmail_address(employeeDto.getEmail_address());
			employee.setCreationtime(employeeDto.getCreationtime()); // HOMMAA JOSTAIN AIKA TÄHÄN
			employee.setHome_address(employeeDto.getHome_address());
			employee.setZipcode(employeeDto.getZipcode());
			employee.setCity(employeeDto.getCity());
			employee.setCountry(employeeDto.getCountry());
			*/
			employeeRepository.findAll().forEach(employee -> System.out.println(employee));
		};
	}

}
