package technoelevate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingDataToBlobandClob {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, FileNotFoundException {
		// Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Getting the connection
		String mysqlUrl = "jdbc:mysql://localhost:3306/elevate";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
		System.out.println("Connection established......");
		// Inserting values
		String query = "INSERT INTO data(id, name, logo) VALUES (?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, "JavaFX");
		FileReader fileReader = new FileReader("C:\\Users\\kumar\\OneDrive\\Desktop\\MAP.txt");
		pstmt.setClob(2, fileReader);
		InputStream inputStream = new FileInputStream("C:\\Users\\kumar\\Downloads\\Balaji.jpg");
		pstmt.setBlob(3, inputStream);
		pstmt.execute();
		pstmt.setString(1, "CoffeeScript");
		fileReader = new FileReader("E:\\images\\coffeescript_contents.txt");
		pstmt.setClob(2, fileReader);
		inputStream = new FileInputStream("E:\\images\\coffeescript_logo.jpg");
		pstmt.setBlob(3, inputStream);
		pstmt.execute();
		pstmt.setString(1, "JavaFX");
		fileReader = new FileReader("E:\\images\\cassandra_contents.txt");
		pstmt.setClob(2, fileReader);
		inputStream = new FileInputStream("E:\\images\\cassandra_logo.jpg");
		pstmt.setBlob(3, inputStream);
		pstmt.execute();
		System.out.println("Records inserted......");
	}
}
