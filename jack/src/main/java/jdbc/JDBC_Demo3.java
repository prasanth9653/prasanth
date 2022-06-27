package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Demo3
{
	public static void main(String[] args)throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud","root","root");
		String sql="update users set flog=? where uid=?";
		
		PreparedStatement stmt=con.prepareStatement(sql);
		int i=0;
		
		while(i<5)
		{
			Scanner sc =new Scanner (System.in);
			
			System.out.println("Enter the uid  value......");
			int uid=sc.nextInt();
			System.out.println("Enter the flog values.....");
			int flog=sc.nextInt();
			stmt.setInt(1, flog);
			stmt.setInt(2, uid );
			  
			int noofrowschanged=stmt.executeUpdate();
			
			System.out.println("No of Rows Updated........"+noofrowschanged);
			
			i++;
		}
	}
}
