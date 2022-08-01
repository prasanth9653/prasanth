package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Checkuser {


		
	
	
	public static void main(String[] args) {
		Checkuser ps=new Checkuser();
		System.out.println(ps.check("ajith", "chenni school"));
		
	}
	
public boolean check(String Stud_name,String School_name) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud1", "root", "root");
		
		String sql="select * from student where Stud_name=? and School_name=?";
		PreparedStatement pre=con.prepareStatement(sql);
		pre.setString(1, Stud_name);
		pre.setString(2,School_name);
		ResultSet re=pre.executeQuery();
		
		if(re.next()) {
			return true;
		}
		else {
			return false;
		}

	} catch (Exception  e) {
		
		e.printStackTrace();
	}
	return false;
	
}

}
