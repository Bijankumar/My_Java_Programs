package DynamicPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fetch_The_Values_By_Using_Preparedstatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aazama","root","root");
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from royalchallengers  where Player_Id=?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the player_id");
		int id = scanner.nextInt();
		preparedStatement.setInt(1,id);
		ResultSet resultSet = preparedStatement.executeQuery();
		resultSet.next();
		System.out.println("Player_name: "+resultSet.getString(1)+" "+"Player_Id1: "+resultSet.getInt(2)+" "+"Player_Coutry: "+resultSet.getString(3));
        
		
	    


	}

}
