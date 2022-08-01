package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

@RequestMapping("/cont")

public class controller {
	@Autowired
	
	private EmployeeService empser;
	
	
	public EmployeeService getEmpser() {
		return empser;
	}
	public void setEmpser(EmployeeService empser) {
		this.empser = empser;
	}
	@RequestMapping(method=RequestMethod.GET,value = "/register")
	public ModelAndView Websearch()
	{
		
		
		Employee emp=new Employee();
		
		emp.setFlag(0);
		
		int a=emp.getEmpId()+1;
		
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("myobj", emp);
		mandv.setViewName("Register");
		return mandv;
	}
	@RequestMapping(method=RequestMethod.POST,value = "/register")
	public ModelAndView Prcessform(@ModelAttribute Employee emp,HttpServletRequest request)
	{
		System.out.println("Employee Name:"+emp.getEmpName());
		
		
		ModelAndView mandv=new ModelAndView();
		
		
		String password=request.getParameter("Password");
		
		String password1=request.getParameter("Password1");
		
		if(password.equals(password1)) {
		
		List<Employee> a=empser.checkEmpId(emp);
		
		Iterator<Employee> itr=a.iterator();
		
		int b=0;
		
		while(itr.hasNext()) {
			
			b=itr.next().getEmpId();
			
		}
		
		System.out.println(b);
		
		emp.setEmpId(b+1);
		
		mandv.addObject("myobj",emp);
		
		empser.saveEmployee(emp);
		
		mandv.setViewName("welcome");
		
		return mandv;
		
		}else {
			
			mandv.setViewName("error");
			
			return mandv;
			
		}
		
	}
}
//	@RequestMapping(method = RequestMethod.GET, value = "/forms1")
//	public ModelAndView websearch1() {
//		
//		ModelAndView mv=new ModelAndView();
//		
//		mv.setViewName("login");
//		
//		return mv;
//		
//	}
//	
//	@RequestMapping(method = RequestMethod.POST,value = "/forms1")
//	public ModelAndView welcome1(HttpServletRequest request) {
//		
//		ModelAndView mv=new ModelAndView();
//		
//		String name=request.getParameter("name");
//		
//		String pass=request.getParameter("pass");
//		
//		System.out.println(name+":"+pass);
//		
//		List<Employee> c=empser.checkUser(, pass);
//		
//		Iterator<Customers> itr=c.iterator();
//		
//		while(itr.hasNext()) {
//			
//			mv.setViewName("welcome");
//			
//			return mv;
//			
//		}
//		
//		mv.setViewName("error");
//		
//		return mv;
//		
//	}
//}
//	}
//	

