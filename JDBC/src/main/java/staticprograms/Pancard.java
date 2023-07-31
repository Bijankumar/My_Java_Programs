package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pancard {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// This connection is created because of create the database
		// This connection is established till the port itself
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement = connection.createStatement();
		statement.execute("create database PancardOfIndia");
		//we have to close the previous connection of creating the database
		//because to create table inside the database new 
		connection.close();
		System.out.println("Database is created");
		
		// New connection is established till database
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/PancardOfIndia","root","root");
		Statement statement1 = connection1.createStatement();
		statement1.execute("create table Pancard(Name varchar(25)not null,phone bigint not null unique,pan_id varchar(20) not null unique primary key)");
		System.out.println("Table is created");
		// table is created
		
		statement1.execute("insert into Pancard values('dhinesh',74185296,'gdf852325')");
		statement1.execute("insert into Pancard values('bijan',15296255,'748569kjd')");
		statement1.execute("insert into Pancard values('gowtham',845565985,'gbhb32557')");
		System.out.println("Value is inserted");
		// value is inserted
		
		statement1.executeUpdate("update Pancard set name='Dhinesh' ,phone=6383003 where pan_id='gdf852325'");
		statement1.executeUpdate("update Pancard set name='Bijan'   ,phone=1464654 where pan_id='748569kjd'");
		statement1.executeUpdate("update Pancard set name='Gowtham' ,phone=6446456 where pan_id='gbhb32557'");
		System.out.println("value is updated");
		//value is updated
		
		ResultSet resultSet = statement1.executeQuery("select * from Pancard");
		while(resultSet.next())
		{
			System.out.println("Name :"+resultSet.getString(1)+" "+"phone :"+resultSet.getInt(2)+" "+"Pan_id"+resultSet.getString(3));
		}
		System.out.println("data fetched");
		// Data fetched
		
		statement1.execute("drop table Pancard");
		System.out.println("Table is droped");
		// Table droped
		
		
		
		
		
        
		
	}

}
