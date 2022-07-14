package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud","root","root");
		
		String s1="update users set flog=0";
		Statement sta=con.createStatement();
		int noofrowschanged=sta.executeUpdate(s1);
		
		
		System.out.println("No Of Rows Updated="+noofrowschanged);
	}

}
