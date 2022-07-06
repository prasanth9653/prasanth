package anoudtech;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServeletDemo2")
public class Demo2 extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext app=config.getServletContext();
		System.out.println("From Second Servlet...:"+app.getAttribute("myglobal"));
		System.out.println(app.getRealPath("hello "));
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
