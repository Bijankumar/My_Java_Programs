package technoelevate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data_Updation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoelevate","root","root");
		Statement statement = connection.createStatement();
	    statement.addBatch("update employee set name='Bijan',phone='7978712547' where id=101");
	    statement.addBatch("update employee set name='Chakra',phone='9100463283' where id=102");
	    statement.addBatch("update employee set name='Ram',phone='7339176042' where id=103");
	    int[] batch = statement.executeBatch();
	   
	    System.out.println("Data upadted Successfully..!!");

	    System.out.println(batch.length+" rows upadated.");

	}
}
