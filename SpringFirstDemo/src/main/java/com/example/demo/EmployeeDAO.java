package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
	
	@Query("from Employee where empname=?1 and pass=?2")
	public List<Employee> CheckUser(String empname,String pass);
	
	@Query("from Employee order by empid  ASC")
	public List<Employee> checkempid(Employee emp);


}
