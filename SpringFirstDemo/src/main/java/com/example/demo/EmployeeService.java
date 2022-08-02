package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeDAO empdao;
	


	public EmployeeDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmployeeDAO empdao) {
		this.empdao = empdao;
	}
	public void saveEmployee(Employee emp)
	
	{
		getEmpdao().save(emp);
	}
	
	public List<Employee> checkUser(String empname,String pass){
		
		return getEmpdao().CheckUser(empname, pass);
		
	}
	
	
	public List<Employee> checkempid(Employee emp) {
		
		return getEmpdao().checkempid(emp);
	}


}