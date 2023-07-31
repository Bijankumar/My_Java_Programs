package technoelevate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Data_Insertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
		Statement statement = connection.createStatement();
//		statement.addBatch("insert into employee value (107,'Pani C','9100463283')");
//		statement.addBatch("insert into employee value (108,'P..Ji','8970290781')");
//		statement.addBatch("insert into employee value (109,'Rajnish k','7978712547')");
//		statement.executeBatch();
		System.out.println("Data inserted Successfully");
		
		// create a ResultSet object
		ResultSet rs = statement.executeQuery("select * from employee");
		// get the ResultSetMetaData object
		ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		// get the number of columns
		int columnCount = rsmd.getColumnCount();
		// print the column names and types
		for (int i = 1; i <= columnCount; i++) {
		  String columnName = rsmd.getColumnName(i);
		  String columnType = rsmd.getColumnTypeName(i);
		  System.out.println(columnName + " : " + columnType);
		}
		
		
		
		
		
		
		
		
		
	}
}
