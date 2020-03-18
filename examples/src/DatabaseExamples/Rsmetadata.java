package DatabaseExamples;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Rsmetadata {

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
			DatabaseMetaData dmd=con.getMetaData();
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs=st.executeQuery(sql);
			ResultSetMetaData rsmd=rs.getMetaData();
			int rows=rsmd.getColumnCount();
			int i=1;
			
			System.out.println("The Database product name is- "+dmd.getDatabaseProductName());
			System.out.println("The driver name is- "+dmd.getDriverName());
			System.out.println("The maximum number of columns in table is- "+dmd.getMaxColumnsInTable());
			System.out.println("The total number of columns in table: "+rows);
			
			while(i<=rows) {
				
				System.out.println("Column-"+i+" is "+rsmd.getColumnName(i));
				System.out.println("Column "+i+ " is of type- "+rsmd.getColumnTypeName(i));
				i++;
				
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
