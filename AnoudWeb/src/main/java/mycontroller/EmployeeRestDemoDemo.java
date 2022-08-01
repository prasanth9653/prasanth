package mycontroller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@XmlRootElement
class EmployeeRestDemo {

	
	
	
	
		private int empid;
		private String empname;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
	}
	@Repository
	class EmployeeRepo{
		public EmployeeRestDemo retrieve(int eid) {
			EmployeeRestDemo emp=new EmployeeRestDemo();
			emp.setEmpid(eid);
			emp.setEmpname("rahim");
			return emp;
		}
		
		public List<EmployeeRestDemo> getAll(){
			EmployeeRestDemo emp=new EmployeeRestDemo();
			emp.setEmpid(100);
			emp.setEmpname("rahim");
			
			EmployeeRestDemo emp2=new EmployeeRestDemo();
			emp2.setEmpid(200);
			emp2.setEmpname("ram");
			
			List<EmployeeRestDemo> list=new ArrayList<>();
			list.add(emp2);
			list.add(emp);
			
			return list;
		}
		public void store(EmployeeRestDemo e) {
			System.out.println("employee stored...");
		}
		public EmployeeRestDemo search(String name) {
			EmployeeRestDemo emp=new EmployeeRestDemo();
			emp.setEmpid(100);
			emp.setEmpname("rahim");
			return emp;
		}
		public EmployeeRestDemo delete(int eid) {
			System.out.println("deleted...");
			return new EmployeeRestDemo();
		}
		
	}
	@RestController
	public class EmployeeRestDemoDemo {
		@Autowired
		EmployeeRepo repository;
		
		@GetMapping("/rest/employee/get/{id}")
		public EmployeeRestDemo getEmployeeByID(@PathVariable("id") int id) {
			return repository.retrieve(id);
		}
		
		@GetMapping("/rest/employee/getAll")
		//Returning is List is supported with JSON response only
		//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
		public List<EmployeeRestDemo> getAllEmployees() {
			return repository.getAll();
		}
		@PostMapping("/rest/employee/create")
		public EmployeeRestDemo createEmployee(@RequestBody EmployeeRestDemo emp) {
			repository.store(emp);
			return emp;
		}
		
		@GetMapping("/rest/employee/search/{name}")
		public EmployeeRestDemo getEmployeeByName(@PathVariable("name") String name) {
			return repository.search(name);
		}
		
		@DeleteMapping("/rest/employee/delete/{id}")
		public EmployeeRestDemo deleteEmployeeByID(@PathVariable("id") int id) {
			return repository.delete(id);
		}
	}

