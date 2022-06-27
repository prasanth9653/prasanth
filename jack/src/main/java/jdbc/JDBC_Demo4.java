package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;



public class JDBC_Demo4 
{
	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud", "root", "root");
		
		String sql="Select * from Users";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while (rs.next())
		{
			System.out.println(rs.getInt("uid")+":"+rs.getString("u1name")+":"+rs.getInt("flog"));
			
			
					
		}
		
		
	}

}
