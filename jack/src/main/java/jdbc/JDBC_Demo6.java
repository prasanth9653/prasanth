package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JDBC_Demo6 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud", "root", "root");
		
		String sql="select * from users where u1name=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setString(1, "prasanth");
		ResultSet rs=stmt.executeQuery();
		
		java.sql.ResultSetMetaData rsmt=rs.getMetaData();
		int colcount=rsmt.getColumnCount();
		
		for(int i=1;i<=colcount;i++)
		{
			System.out.println(rsmt.getColumnName(i)+"/t");
			
		}
		System.out.println("\n======================\n");
		if(rs.next())
		{
			for(int i=1;i<=colcount;i++)
			{
				System.out.println(rs.getString(i)+"\t");
			}
		}
		
		
	}

}
