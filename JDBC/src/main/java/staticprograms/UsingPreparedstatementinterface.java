package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsingPreparedstatementinterface {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("create database Meta");
		System.out.println("Database is created");
		connection.close();
		
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Meta","root","root");
		PreparedStatement preparedStatement1 = connection1.prepareStatement("create table Snapshot(Name varchar(25)not null,phone bigint not null unique,Email varchar(25) not null unique primary key)");
		preparedStatement1.execute();
		System.out.println("Table is created");
		
		preparedStatement1.execute("insert into Snapshot values('dhinesh',64654686,'dhineshmr611@gmail.com')");
		preparedStatement1.execute("insert into Snapshot values('bijan',646552486,'bijankumar9999@gmail.com')");
		preparedStatement1.execute("insert into Snapshot values('Gowtham',64653186,'mggowthamgowda@gmail.com')");
		System.out.println("value is inserted");
		
		

		preparedStatement1.executeUpdate("update Snapshot set name='Dhinesh' ,phone=6383003 where email='dhineshmr611@gmail.com'");
		preparedStatement1.executeUpdate("update Snapshot set name='Bijan'   ,phone=1464654 where email='bijankumar9999@gmail.com'");
		preparedStatement1.executeUpdate("update Snapshot set name='Gowtham' ,phone=6446456 where email='mggowthamgowda@gmail.com'");
		System.out.println("value is updated");

		ResultSet resultSet = preparedStatement1.executeQuery("select * from Snapshot");
		while(resultSet.next())
		{
			System.out.println("Name :"+resultSet.getString(1)+" "+"phone :"+resultSet.getInt(2)+" "+"Email"+resultSet.getString(3));
		}
		System.out.println("data fetched");
		
		preparedStatement1.execute("drop table Snapshot");
		System.out.println("Table is droped");
		

	}
	

}
