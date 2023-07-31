package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CretaeDataBase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//		Statement statement = connection.createStatement();
//		statement.execute("create database chakrapani");
//		System.out.println("Database is created Successfully..!");
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url ="jdbc:mysql://localhost:3306?user=root&password=root";
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		statement.execute("create database panichakra");
		System.out.println("DataBase created Successfully");
	}
}