package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elevate","root","root");
	Statement statement = connection.createStatement();
	statement.execute("create table Student(Id integer primary key,Name varchar(25)not null,phone bigint not null unique)");
//	statement.execute("create table Library(Bookno integer primary key,BookName varchar(25)not null unique,Author varchar(25) not null)");
	System.out.println("Table is created");
   }

}
