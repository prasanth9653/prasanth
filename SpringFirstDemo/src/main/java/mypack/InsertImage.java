package mypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud1","root","root");
			
			System.out.println(con);
			
			String qury="insert into watchshop values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setString(1, "OMEGA");
			
			FileInputStream fis=new FileInputStream("C://Users/prasanth.muthunadan/Downloads/omega.jpg");
			
			ps.setBinaryStream(3, fis, fis.available());
			
			ps.setString(2, "4000");
			
			int a=ps.executeUpdate();
			
			System.out.println(a);
			
			System.out.println("image insert successfully");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}