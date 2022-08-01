package mycontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bs3")
@SessionAttributes({"myobj"})
public class BasicController3 {
	
	@RequestMapping(method = RequestMethod.GET,value = "hello")
	public String Hello()
	{
		System.out.println("hello method called");
		return"home";
	}

	@RequestMapping(method = RequestMethod.GET,value = "hello1")
	public String Hello1(Model model)
	{
		System.out.println("hello1 method called");
		model.addAttribute("myobj","This your Web Page Second Layer");
		return"home";
	}
	@RequestMapping(method = RequestMethod.GET,value = "hello2")
	public ModelAndView Hello2()
	{
		System.out.println("hello2 method called");
		ModelAndView mandv=new ModelAndView();
		mandv.setViewName("home");
		return mandv;
	}
	@RequestMapping(method = RequestMethod.GET,value = "hello3")
	public ModelAndView Hello3()
	{
		System.out.println("hello3 method called");
		ModelAndView mandv=new ModelAndView();
		mandv.addObject("myobj","This you your web page");
		mandv.setViewName("home");
		return mandv;
	}

	@RequestMapping(method = RequestMethod.GET,value = "hello4")
	public String Hello4(HttpServletRequest request)
	{
		System.out.println("hello4 method called");
		request.setAttribute("myobj", "This your Web Page Portal");
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET,value = "hello5")
	public String Hello5(Model model)
	{
		System.out.println("hello5 method called");
		model.addAttribute("myobj","there are spring anotation methods");
		return"home";
	}
	
	
		
		

}
