package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm36","root","root");
    Statement statement = connection.createStatement();
    statement.executeUpdate("update student set name='DHINESH',phone=6383003950 where id=1");
    statement.execute("update student set name='BIJAN',phone=7978712547 where id=2");
    statement.execute("update student set name='GOWTHAM',phone=9035724265 where id=3");
    statement.execute("update student set name='MEENA',phone=7780303646 where id=4");
    statement.execute("update student set name='PRIYA',phone=7899088329 where id=5");
    statement.execute("update student set name='MONIKA',phone=9148486100 where id=6");
    statement.executeUpdate("update student set name='MAHANTESH',phone=9886552000 where id=7");
    
    System.out.println("The data is updated");
   }
}
