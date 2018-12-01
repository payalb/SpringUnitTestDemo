/*package com.example.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

//Need to bring up app context
@RunWith(SpringRunner.class)
public class EmployeeControllerIT {

	@Mock
	EmployeeService service;
	MockMvc mvc;
	@InjectMocks
	EmployeeController controller = new EmployeeController();

	@Before
	public void setup() {
		//does not use spring application context
		mvc = MockMvcBuilders.webAppContextSetup().build();
	}

	@Test
	public void test1() throws Exception {
		Employee emp = new Employee();
		emp.setId(1l);
		emp.setName("Payal");
		when(service.findByName("Payal")).thenReturn(emp);
		mvc.perform(get("/employees/search?name=Payal").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
		// .andExpect(jsonPath("$",hasSize(1)))
		// .andExpect( jsonPath("$[0].name",emp.getName()));
	}
}
*/