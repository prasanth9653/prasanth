package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
		
		int a=emp.getEmpid()+1;
		
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("myobj", emp);
		mandv.setViewName("Register");
		return mandv;
	}
	@RequestMapping(method=RequestMethod.POST,value = "/register")
	public ModelAndView Prcessform(@ModelAttribute("myobj")Employee emp,HttpServletRequest request)
	{
		System.out.println("Employee Name:"+emp.getEmpname());
		System.out.println("");
		
		
		ModelAndView mandv=new ModelAndView();
		
		
		String pass=request.getParameter("pass");
		
		String pass1=request.getParameter("pass1");
		
		if(pass.equals(pass1)) {
		
		List<Employee> e=empser.checkempid(emp);
		
		Iterator<Employee> itr=e.iterator();
		
		int b=0;
		
		while(itr.hasNext()) {
			
			b=itr.next().getEmpid();
			
		}
		
		System.out.println(b);
		
		emp.setEmpid(b+1);
		
		
		mandv.addObject("myobj",emp);
		
		empser.saveEmployee(emp);
		
		mandv.setViewName("welcome");
		
		return mandv;
		
		}else {
			
			mandv.setViewName("error");
			
			return mandv;
			
		}
		
	}

	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch1() {

		ModelAndView mandv=new ModelAndView();
		
		mandv.setViewName("login");
		
		return mandv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/forms")
	public ModelAndView welcome1(HttpServletRequest request) {
		
		ModelAndView mandv=new ModelAndView();
		
		String empname=request.getParameter("empname");
		
		String pass=request.getParameter("pass");
		
		System.out.println(empname+":"+pass);
		
		List<Employee> e=empser.checkUser(empname, pass);
		
		Iterator<Employee> itr=e.iterator();
		
		while(itr.hasNext()) {
			
			mandv.setViewName("welcome");
			
			return mandv;
			
		}
		
		mandv.setViewName("error");
		
		return mandv;
		
	}
}
	
	

