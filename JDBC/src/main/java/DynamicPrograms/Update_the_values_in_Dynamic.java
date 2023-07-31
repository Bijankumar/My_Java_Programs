package DynamicPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_the_values_in_Dynamic {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
      
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aazama","root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("update royalchallengers value set Player_Name=?,"
				+ "  Player_country=? where Player_Id=?");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the playername");
		String name = scanner.next();
		preparedStatement.setString(1, name);
		
		System.out.println("Enter the country");
		String country = scanner.next();
		preparedStatement.setString(2, country);
		
		System.out.println("Enter the playerId");
		int id = scanner.nextInt();
		preparedStatement.setInt(3, id);
		
		preparedStatement.execute();
		System.out.println("Data Updaate");
		
	}  

}
