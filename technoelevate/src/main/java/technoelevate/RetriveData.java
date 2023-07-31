package technoelevate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
		Statement statement = connection.createStatement();
		ResultSet query = statement.executeQuery("select * from employee");
		ResultSetMetaData metaData = query.getMetaData();
		System.out.println(metaData.getColumnCount());
		System.out.println(metaData.getTableName(1));
		System.out.println(metaData.getColumnName(1));
		System.out.println(metaData.getColumnTypeName(2));
	}
}
