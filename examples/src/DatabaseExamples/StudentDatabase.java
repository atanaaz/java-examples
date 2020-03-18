package DatabaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDatabase {

	public static void main(String[] args) {
		Connection con=null;
		String driverClassName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/studentdatabase";
		String username="root";
		String password="Welcome5!";
		String sqlQuery="CREATE TABLE Student" + "(studentId INTEGER not NULL," + 
				" Name VARCHAR(255),"+ "Address VARCHAR(300)," + "PRIMARY KEY (studentId))";
		
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(url, username, password);
			Statement statement=con.createStatement();
			Boolean data= statement.execute(sqlQuery);
			System.out.println("Student table created successfully.");
			
		} catch (ClassNotFoundException e) {
			System.out.println(".Class file is not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
