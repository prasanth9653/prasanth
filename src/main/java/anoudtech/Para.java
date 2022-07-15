package anoudtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Para")
public class Para extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		        
		          response.setContentType("text/html");
		          PrintWriter pw = response.getWriter();
		          // Get enumeration of parameter names
		          Enumeration<String> e = request.getParameterNames();
		          //display parameter names and values
		          while(e.hasMoreElements()){
		             String name = (String) e.nextElement();
		             String pvalue = request.getParameter(name);
		             pw.println(name+" : "+pvalue);
		          }          pw.close();
		      }  

}
