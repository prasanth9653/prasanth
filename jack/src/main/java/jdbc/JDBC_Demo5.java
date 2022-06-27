package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBC_Demo5
{
	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
		
		String sql="select * from Users where uid=?";
		
		PreparedStatement smst=con.prepareStatement(sql);
		
		smst.setInt(1, 12);
		ResultSet rs=smst.executeQuery();
		
		if(rs.next())
		{
			System.out.println(rs.getInt("uid")+":"+rs.getString("u1name"));
		}
		
		
	}
}
