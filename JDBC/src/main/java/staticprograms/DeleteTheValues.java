package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTheValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm36","root","root");
		Statement statement = connection.createStatement();
		// statement.execute("delete from student");
		 statement.execute("delete from student where id = 8");
        System.out.println("Data Deleted");
	}

}
