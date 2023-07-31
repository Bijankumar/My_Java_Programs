package technoelevate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
		Statement statement = connection.createStatement();
		statement.execute("create table employee(Id integer primary key,Name varchar(25) not null,phone bigint not null unique)");
		System.out.println("Table is Created");
	}
}
