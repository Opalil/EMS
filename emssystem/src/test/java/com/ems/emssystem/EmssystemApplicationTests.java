package com.ems.emssystem;

import com.ems.emssystem.dto.model.EmployeeDto;
import com.ems.emssystem.model.Employee;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmssystemApplicationTests {

	private ModelMapper modelMapper;

	@Test
	public void testEmployeeDtos(){
		Employee employee = new Employee();

		employee.setFirstname("Olli-Pekka");
		employee.setLastname("Tani");
		employee.setEmail_address("olli.tani@gmail.com");
		employee.setCreationtime(Instant.now());
		employee.setHome_address("Pahkakuja 2");
		employee.setZipcode("70150");
		employee.setCity("Kuopio");
		employee.setCountry("Suomi");

		EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);
		assertEquals(employee.getEmail_address(), employeeDto.getEmail_address());
	}

}
