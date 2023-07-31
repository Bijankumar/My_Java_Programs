package Basic_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Using_switchcase_perform_crud_Operation {
	
	static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/google","root","root");
		boolean b = true;
		while(b) 
		{
			System.out.println("Select any one of the option below shown");
			System.out.println("1.Insert 2.Update 3.Fetch or Retrive 4.Delete 5.Thanks 6.Default");
			System.out.println("Enter here");
			int a =  scanner.nextInt();
			switch (a) {
			case 1:{
				 PreparedStatement preparedStatement = connection.prepareStatement("insert into gmail values(?,?,?,?,?)");
				 
				 System.out.println("Enter user phone number");
				 int phone = scanner.nextInt();
				 preparedStatement.setInt(1,phone);
					
			     System.out.println("Enter user First name");
			     String firstname = scanner.next();
			     preparedStatement.setString(2,firstname);
			     
			     System.out.println("Enter user Last name");
			     String lastname = scanner.next();
			     preparedStatement.setString(3,lastname);
			     
			     System.out.println("Enter user User name");
			     String Username = scanner.next();
			     preparedStatement.setString(4,Username);
			     
			     System.out.println("Enter user password");
			     String password = scanner.next();
			     preparedStatement.setString(5,password);
			     
			     preparedStatement.execute();
			     System.out.println("Data is inserted");
					
			     break;
			}
			case 2:{
				 PreparedStatement preparedStatement = connection.prepareStatement("update gmail value set phone=?,First_name=?,"
				 		+ "Last_name=?,Password=? where User_name =?");
				 
				 System.out.println("Enter user phone number");
				 int phone = scanner.nextInt();
				 preparedStatement.setLong(1,phone);
					
			     System.out.println("Enter user First name");
			     String firstname = scanner.next();
			     preparedStatement.setString(2,firstname);
			     
			     System.out.println("Enter user Last name");
			     String lastname = scanner.next();
			     preparedStatement.setString(3,lastname);
			     
			     System.out.println("Enter user User name");
			     String Username = scanner.next();
			     preparedStatement.setString(5,Username);
			     
			     System.out.println("Enter user password");
			     String password = scanner.next();
			     preparedStatement.setString(4,password);
			     
			     preparedStatement.execute();
			     System.out.println("Data is Updated");
					
			     break;
			}
			case 3:{
				 PreparedStatement preparedStatement = connection.prepareStatement("slect * from gmail where User_name=?");
			     System.out.println("Enter user User name");
			     String Username = scanner.next();
			     preparedStatement.setString(1,Username);
				 ResultSet resultSet = preparedStatement.executeQuery();
			     resultSet.next();
			     System.out.println("Phone: "+resultSet.getInt(1)+" "+"Firstname: "+resultSet.getString(2)+" "+"Lastname: "+" "+resultSet.getString(3));
			     System.out.println("Data is fetched");
			     break;
			}
			case 4:{
				 PreparedStatement preparedStatement = connection.prepareStatement("delete from gmail where User_name=?");
			     System.out.println("Enter user User name");
			     String Username = scanner.next();
			     preparedStatement.setString(1,Username);
			     preparedStatement.execute();
				 System.out.println("Data is Deleted");
			     break;
			}
			case 5:{
				System.out.println("Successfully did CRUD operation Thank you");
				b=false;
				break;
			}
			
			default:
				System.out.println("Invalid choice select proper options");
				break;
			}
		}
		connection.close();
			
	}

}
