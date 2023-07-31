package DynamicPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_the_value_by_Using_preparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aazama","root","root");
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from royalchallengers  where Player_Id=?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the player_id");
		int id = scanner.nextInt();
		preparedStatement.setInt(1,id);
		preparedStatement.execute();
		System.out.println("Data is Deleted");
	
	}

}
