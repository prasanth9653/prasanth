package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
	
	@Query("from employee where emp_name=?1 and password=?2")
	public List<Employee> CheckUser(String EmpName,String Password);
	
	@Query("from employee order by emp_id  ASC")
	public List<Employee> checkEmpId(Employee emp);


}
