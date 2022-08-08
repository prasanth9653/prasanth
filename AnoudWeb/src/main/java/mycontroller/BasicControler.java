package mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bs")

public class BasicControler {
	
	@RequestMapping(method = RequestMethod.GET,value = "/hello")
	public void hello()
	{
		System.out.println("hi ganesh");
	}
	@RequestMapping(method = RequestMethod.GET,value = "/hello2")
	public void hello2(@RequestParam("name")String uname,@RequestParam("pass")String upass)
	
	{
		System.out.println("hi ganesh:......"+uname+upass);
	}
}
