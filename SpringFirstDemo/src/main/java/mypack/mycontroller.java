package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Employee;
import com.example.demo.EmployeeService;


@Controller
@RequestMapping("/myc")
public class mycontroller {
	
	@Autowired
	
	
	private EmployeeService service;
	
	

	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}
	@RequestMapping(method = RequestMethod.GET,value = "/create")
	public void create()
	{
		Employee emp=new Employee();
		
		
		System.out.println("saving employee details");
		
		emp.setEmpId(1);
		emp.setEmpName("prasanth");
		emp.setPassword("jack1234");
		emp.setEmpCity("nagercoil");
		emp.setAddress("KanniyaKumari");
		emp.setContactNum(1234567899);
		emp.setFlag(0);
//		emp.setImg("prasa");
		
		service.saveEmployee(emp);
	}
	
	

}
