package mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form1")

public class FormController1 {
	
	@RequestMapping(method=RequestMethod.GET,value = "register")
	public ModelAndView Loadform()
	{
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("myobj", new User());
		mandv.setViewName("userform");
		return mandv;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "register")
	public ModelAndView Prcessform(@ModelAttribute User user)
	{
		System.out.println("username"+user.getUname());
		user.setUname(user.getUname()+"anoud technology");
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("myobj1", user);
		mandv.setViewName("welcome");
		return mandv;
	}
	

}
