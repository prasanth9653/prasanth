package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dtopack.UserDTO;


public class DBConnection {
	public DBConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Boolean checkUser(String ename,String epass)
	{
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
			String query="select *from employee where ename=? and epass=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, ename);
			ps.setString(2, epass);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Boolean checkFlag(String ename )
	{
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
			String query="select flag from employee where ename=? ";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, ename);
			ResultSet rs=ps.executeQuery();
			
			
			
			if(rs.next())
			{
				int flag=rs.getInt(1);
				if(flag==0)
				{
				return true;
				}
				else
				{
				return false;
				}
			}
			else
			{
				return false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	

	
public Boolean updateFlag(String ename, int flag) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
			
			String query="Update employee set flag=? where ename=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, flag);
			
			ps.setString(2, ename);
			
			int i=ps.executeUpdate();
			if(i!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
			
			
		}
		
	}
public Boolean registerUser(UserDTO user)

{
	try
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
		String query="insert into employee values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, user.getEname());
		ps.setString(2, user.getEpass());
		ps.setInt(3,user.getFlag());
		int i=ps.executeUpdate() ;
		
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		return false;
	}
	
}


	public static void main(String[] args) {
		DBConnection conn=new DBConnection();
		
		System.out.println(conn.checkUser("prasanth","trainee"));
		conn.updateFlag("prasanth", 0);
		System.out.println(conn.checkFlag("prasanth"));
		
	}

}
