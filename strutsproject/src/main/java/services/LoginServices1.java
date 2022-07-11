package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBConnection;
import dtopack.UserDTO;

public class LoginServices1 extends ServiceRequest {
	
public LoginServices1() {
		
	}
	
	private UserDTO user;
	
	private DBConnection con;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public DBConnection getCon() {
		return con;
	}

	public void setCon(DBConnection con) {
		this.con = con;
	}
	@Override
	public String executeService(HttpServletRequest request, HttpServletResponse response) {
		user=new UserDTO();
		
		con=new DBConnection();
		
		user.setEname(request.getParameter("ename"));
		
		user.setEpass(request.getParameter("epass"));
		
		boolean a=con.checkUser(user.getEname(), user.getEpass());
		
		if(a) {
			
			boolean b=con.checkFlag(user.getEname());
			
			if(b) {
				
				con.updateFlag(user.getEname(), 1);
				
				request.getSession().setAttribute("ename", user.getEname());
				
				return "Welcome-Page";
				
			}else {
				
				return "Already-Login";
				
			}
			
		}else {
		
		return "Invalid-User";
		
		}
		
	}
	
}


