package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBC_Demo8 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
		System.out.println(con);

		String sql = "{call proc1(?)}";

		CallableStatement cs = con.prepareCall(sql);
		cs.setString(1, "aadhi");
		cs.registerOutParameter(1, Types.INTEGER);

		cs.execute();
		int flog = cs.getInt(1);
		System.out.println("Flag Status ..." + flog);
	}

}
