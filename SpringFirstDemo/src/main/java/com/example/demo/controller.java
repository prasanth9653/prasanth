package com.example.demo;

import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public ModelAndView Websearch() {

		Employee emp = new Employee();

		emp.setFlag(0);

		int a = emp.getEmpid() + 1;

		ModelAndView mandv = new ModelAndView();
		mandv.addObject("myobj", emp);
		mandv.setViewName("Register");
		return mandv;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ModelAndView Prcessform(@ModelAttribute("myobj") Employee emp, HttpServletRequest request)
	{
		System.out.println("Employee Name:" + emp.getEmpname());
		System.out.println("");

		ModelAndView mandv = new ModelAndView();

		String pass = request.getParameter("pass");

		String pass1 = request.getParameter("pass1");

		if (pass.equals(pass1)) {

			List<Employee> e = empser.checkempid(emp);

			Iterator<Employee> itr = e.iterator();

			int b = 0;

			while (itr.hasNext()) {

				b = itr.next().getEmpid();

			}

			System.out.println(b);

			emp.setEmpid(b + 1);

			mandv.addObject("myobj", emp);

			empser.saveEmployee(emp);

			mandv.setViewName("login");

			return mandv;

		} else {

			mandv.setViewName("Register");

			return mandv;

		}

	}

	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch1(Employee emp, HttpServletRequest request) {

		ModelAndView mandv = new ModelAndView();

		mandv.addObject("myobj", emp);

		mandv.setViewName("login");

		return mandv;

	}

	@RequestMapping(method = RequestMethod.POST,value = "/forms")
	public ModelAndView welcome1(@ModelAttribute("myobj") Employee emp,HttpServletRequest request) 
	{
		
		ModelAndView mandv=new ModelAndView();
		
		mandv.addObject("names",emp.getEmpname());
		
		mandv.addObject("passs",emp.getPass());
		
		String empname=emp.getEmpname(),pass=emp.getPass();
		
		List<Employee> c=empser.checkUser(empname, pass);
		
		Iterator<Employee> itr=c.iterator();
		
		while(itr.hasNext()) {
			
			if(itr.next().getFlag()==0) {
			
				mandv.setViewName("welcome"); 
				getEmpser().updateFlag(1, empname,pass);  
				return mandv;	
				}
			else {
					
					mandv.setViewName("logout"); 
					return mandv;
					
				}
			
		}
		
		mandv.setViewName("Register");	
		return mandv;
		
	}
	@RequestMapping(method = RequestMethod.GET,value = "/log")
	public ModelAndView logout(Employee emp,HttpServletRequest request) {
		
		
		
		empser.updateFlag(0, request.getParameter("name"), request.getParameter("pass"));
		
	     return websearch1(emp,request);
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/shop")
	public String shop(Employee emp,HttpServletRequest request) {
		
		Enumeration<String> em=request.getParameterNames();
		
		HttpSession hs=request.getSession();
		
		while(em.hasMoreElements()) {
			
			String a=em.nextElement().toString();
			
			String b=request.getParameter(a);
			
			hs.setAttribute(a, b);
			
		}
		
		System.out.println(request.getParameter("shop"));
		
	     return request.getParameter("shop");
		
	}
	@RequestMapping(method = RequestMethod.GET,value = "/shopimg")
	public void met(HttpServletRequest request,HttpServletResponse response) {
		
		  response.setContentType("image/jpg");
		  String name =request.getParameter("name");
		  String shopname =request.getParameter("shopname");
		  try {
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud1","root","root");
		  String sql = "SELECT * FROM "+shopname+" WHERE name =?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  
		  ps.setString(1, name);
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
		    byte [] imageData = rs.getBytes("img");
		    OutputStream os = response.getOutputStream();
		             os.write(imageData);
		             os.flush();
		             os.close();
		   }
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
	}
}
