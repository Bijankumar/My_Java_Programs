package staticprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_the_image_By_using_statement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aazama","root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into royalchallengers values('virat',3,'india',?)");
		FileInputStream fileInputStream = new FileInputStream("D:\\Web Technology\\HTML\\Assignments\\images\\thread.png");
		preparedStatement.setBinaryStream(1, fileInputStream);
		preparedStatement.execute();
		System.out.println("image Uploaded");
	}
}
