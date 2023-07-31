package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DateAndTime {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement = connection.createStatement();
		statement.execute("cretae database DateAndTime");
		System.out.println("Database Created successfully..!!");
		
		statement.execute("create table Student(Id integer primary key,Name varchar(25)not null,Dob datetime not null)");
		System.out.println("Table is Created..!");
		
		

	}
}
