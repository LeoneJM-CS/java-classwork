package ClassWork;

import java.util.*;
import java.sql.*;

public class Databases {
	public static void main(String [] args) throws Exception{
		Scanner scnr = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/Test/";
		String username = "root";
		String password = "";
		String query = "select * from test";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		String name = rs.getString("name");
		String dept = rs.getString("dept");
		int id = rs.getInt("id");
		int age = rs.getInt("age");
		System.out.println(name);
		System.out.println(dept);
		System.out.println(id);
		System.out.println(age);
		
//		INSERT INTO `test` (`name`, `dept`, `id`, `age`) VALUES ('Joel Leone', 'Computer Science', '100', '18');
		scnr.close();
	}
}
