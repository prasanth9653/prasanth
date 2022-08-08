package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JEDC_Demo2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud", "root", "root");
		
		String sql="update users set flog=? where u1name=? ";
	
		
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,11);
		stmt.setString(2, "ajith");
		//stmt.setInt(3, 13);
		
		int noofrowschanged=stmt.executeUpdate();
		
		System.out.println("No Of Rows Updated"+noofrowschanged);
		
	}

}
