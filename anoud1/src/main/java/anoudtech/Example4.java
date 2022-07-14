package anoudtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello12")
public class Example4 extends HttpServlet {
	
     Connection con;
     
     PreparedStatement ps;
     
     @Override
    public void init(ServletConfig config) throws ServletException 
     {
    	 try
    	 {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 
    		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
    		 
    		 String qu="Insert Into emp values(?,?)";
    		 
    		 ps=con.prepareStatement(qu);
    		 
    		 
    	 }
    	 catch (ClassNotFoundException|SQLException e)
    	 {
			e.printStackTrace();
		}
    	
    }
    
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String s1=request.getParameter("uname");
		String s2=request.getParameter("phone");
		
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		pw.println("<H1>Inserting Records:</H1>");
		
		long x=Long.parseLong(s2);
		
		try
		{
			ps.setString(1, s1);
			ps.setLong(2, x);
			ps.executeUpdate();
			pw.println("<h2> Success</h2>");
		}
		catch (Exception e) 
		
		{
			System.out.println(e);
			pw.println("<h2> BYE</h2>");
			
		}
		
		
		System.out.println("Service Method Called......");
		
		}
	
		
	}


