package Varios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DB_Test1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:bd/dbTest1.db");
        Statement statement = connection.createStatement();
        statement.executeUpdate("insert into Persona values('Maria',2)");
        ResultSet resultSet = statement.executeQuery("select * from Persona");
        while(resultSet.next())
            System.out.println(resultSet.getString("nombre"));
    }
}
