package technoelevate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
		Statement statement = connection.createStatement();
		statement.addBatch("delete from employee where id = 103");
		statement.executeBatch();
		System.out.println("Data deleted successfully..!!");
	}
}
