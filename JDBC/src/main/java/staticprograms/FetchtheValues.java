package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchtheValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm36","root","root");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from student");
		while(resultset.next()) {
		System.out.println("Id: "+resultset.getInt(1)+" "+"Name "+resultset.getString(2)+" "+"Phone "+resultset.getLong(3));
		}
	}
}
