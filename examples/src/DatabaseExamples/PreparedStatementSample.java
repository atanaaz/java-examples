package DatabaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementSample {

		public static void main(String[] args) {
			Connection con=null;
			String driverClassName="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/studentdatabase";
			String username="root";
			String password="Welcome5!";
			String sqlQuery="INSERT INTO student VALUES (?, ? , ?)";
			Scanner sc=new Scanner(System.in);
			int i=0;
			int r = 0;
			PreparedStatement ps=null;
			try {
				Class.forName(driverClassName);
				con=DriverManager.getConnection(url, username, password);
				//Statement statement=con.createStatement();
				con.setAutoCommit(false);
				ps=con.prepareStatement(sqlQuery);
				
				while(i<1) {
					System.out.println("Please enter StudentId:");
					int id=sc.nextInt();
					ps.setInt(1, id);
					
					System.out.println("Please enter Student Name:");
					String n=sc.next();
					ps.setString(2, n);
					
					System.out.println("Please enter Student Address:");
					String adr=sc.next();
					ps.setString(3, adr);
				
					r=ps.executeUpdate();
					i++;
					r++;
					
				}
				
				con.commit();
				int a=9/0;
					System.out.println(r+ " entries are updated in Student table.");
				
					
					
				
			} catch (ClassNotFoundException e) {
				System.out.println(".Class file is not found");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}catch(Exception e) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
			finally {
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			
			
			

	}

}
