package services;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class InsertImage {

	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
					
			
			System.out.println(con);
			
			
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			
			ps.setString(1, "Light");
			
			FileInputStream fis=new FileInputStream("C://Users//prasanth.muthunadan//Downloads/apple.jpg");
			
			ps.setBinaryStream(2, fis, fis.available());
			
			int a=ps.executeUpdate();
			
			System.out.println(a);
			
		} catch (ClassNotFoundException  | SQLException | IOException e) {
			
			e.printStackTrace();
			
		}
		

	}

}
