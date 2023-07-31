package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm36","root","root");
		Statement statement = connection.createStatement();
//	    statement.execute("insert into student value(1,'Dhinesh',638300)");
//		statement.execute("insert into student value(2,'Bijan',797871)");
//		statement.execute("insert into student value(3,'Gowtham',35544)");
//		statement.execute("insert into student value(4,'Priya',354354)");
//		statement.execute("insert into student value(5,'Meena',3543)");
//     	statement.execute("insert into student value(6,'MONIKA',35443)");
//     	statement.execute("insert into student value(7,'MAHANTESH',35435)");
//		statement.execute("insert into student value(8,'MAHANH',35646435)");
		
		statement.execute("insert into library value (1,'oh my god','Bijan')");
		statement.execute("insert into library value (2,'Leave me alone','Dhinesh')");
		statement.execute("insert into library value (3,'Road walker','GOwtham')");
		
		System.out.println("Data inserted");
	}

}
