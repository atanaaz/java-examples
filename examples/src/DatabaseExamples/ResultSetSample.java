package DatabaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetSample {

	public static void main(String[] args) {
		Connection con=null;
		String driverClassName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/studentdatabase";
		String username="root";
		String password="Welcome5!";
		String sql="SELECT * FROM STUDENT";
		
		
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String adr=rs.getString(3);
				System.out.println("id "+ id+"name "+name+"adr "+adr);
			}
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
