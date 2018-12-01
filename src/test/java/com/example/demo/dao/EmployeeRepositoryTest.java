package com.example.demo.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dto.Employee;
/*@DataJpaTest provides some standard setup needed for testing
 *  the persistence layer:
configuring H2, an in-memory database
setting Hibernate, Spring Data, and the DataSource
performing an @EntityScan
turning on SQL logging*/
@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {

	@Autowired TestEntityManager em;
	
	@Autowired EmployeeRepository rep;
	
	@Test
	public void test1() {
		Employee e= new Employee();
		e.setName("Payal");
		em.persist(e);
		em.flush();
		Employee emp=rep.findByName("Payal");
		assertNotNull(emp);
		assertThat(emp.getId()).isGreaterThan(0);
	}
	@Test
	public void test2() {
		Employee emp=rep.findByName("Payal");
		assertNull(emp);
	}
}
