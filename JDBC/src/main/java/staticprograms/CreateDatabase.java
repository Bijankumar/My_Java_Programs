package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
   public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	System.out.println("connection is established");
	Statement statement = connection.createStatement();
	statement.execute("create database elevate");
	System.out.println("Database is created inside the port");
	
}
}
