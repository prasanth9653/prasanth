package services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Blob;

public class ExtractImage {
public static void main(String[] args) {
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
		
		System.out.println(con);
		
		
		
		PreparedStatement ps=con.prepareStatement("select * from employee");
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			
			System.out.println(rs.getString(1));
			
			Blob img= rs.getBlob(2);
			
			byte[] b=img.getBytes(1, (int) img.length());
			
			System.out.println();
			
			FileOutputStream fos=new FileOutputStream("C://Users//prasanth.muthunadan//Downloads/apple.jpg");
			
			fos.write(b);
			
			fos.close();
			
		}
		
		System.out.println(rs);
		
	} catch (ClassNotFoundException | SQLException | IOException e) {
		
		e.printStackTrace();
		
	}
	
}
}
