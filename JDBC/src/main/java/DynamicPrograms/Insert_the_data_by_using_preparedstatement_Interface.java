package DynamicPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_the_data_by_using_preparedstatement_Interface {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aazama","root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into royalchallengers values(?,?,?)");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scanner.next();
		preparedStatement.setString(1, name);
		
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		preparedStatement.setInt(2, id);
		
		System.out.println("Enter the country");
		String country = scanner.next();
		preparedStatement.setString(3, country);
		
		preparedStatement.execute();
		System.out.println("Data Inserted");
		
		
		
	}

}
