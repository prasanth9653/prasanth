package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_CIUD {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud1",
					"root", "root");
			Statement smt=con.createStatement();
			PreparedStatement ps=null;
			
			
			//DATABASE Creation Command 
//			String query="CREATE DATABASE anoud1";
//			
//					smt.executeUpdate(query);
//					System.out.println("Database created Successfully");
//					
			
			
			//Table Cretaion Command
//					String query1="create table student"+"(Stud_id integer ,"+"Stud_name varchar(20),"
//					+"School_name varchar(255))";
//					smt.executeUpdate(query1);
//					System.out.println("table creted Successfully");
//					
					
					//value Insert Comand
					String query2="insert into student values(101,'ajith','chenni school')";
					String query3="insert into student values(101,'ajith','chenni school')";
					String query4="insert into student values(101,'ajith','chenni school')";	
					String query5="insert into student values(101,'ajith','chenni school')";
					
					
					ps=con.prepareStatement(query2,query3,query4,);
					ps.execute();
					System.out.println("value inserted successfully");
					
		}
		catch (Exception e)
		{
			e.printStackTrace(
		}
	}
}


