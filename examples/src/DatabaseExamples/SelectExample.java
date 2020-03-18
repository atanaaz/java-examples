package DatabaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) {
		Connection con=null;
		String driverClassName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/studentdatabase";
		String username="root";
		String password="Welcome5!";
		String sqlQuery="INSERT INTO student (studentId, Name, Address)	VALUES (2, 'Lucky' , 'xxx')";
		
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(url, username, password);
			Statement statement=con.createStatement();
			int data= statement.executeUpdate(sqlQuery);
			
	
				System.out.println("these many rows are affected" +data);
			
			
		
			
		} catch (ClassNotFoundException e) {
			System.out.println(".Class file is not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
