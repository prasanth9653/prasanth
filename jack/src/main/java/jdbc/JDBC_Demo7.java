package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBC_Demo7 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
		
		DatabaseMetaData dbma=con.getMetaData();
		
		System.out.println(dbma.getDatabaseProductName());
		System.out.println(dbma .getDatabaseProductVersion());
		System.out.println(dbma.getUserName());
	}

}
