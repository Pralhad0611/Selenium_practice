package Java;

import java.sql.*;
import java.sql.*;
import org.testng.annotations.Test;

public class DatabaseTest {


    public static void main(String[] args) throws  ClassNotFoundException, SQLException
    {

    String dbUrl = "jdbc:postgresql://localhost:5433/TicketManagement";


    String username = "postgres";
    String password = "root";

    //Query to Execute
    String query = "select *  from stpl_user;";

    //Load mysql jdbc driver
        Class.forName("org.postgresql.Driver");

    //Create Connection to DB
    Connection con = DriverManager.getConnection(dbUrl, username, password);

    //Create Statement Object
    Statement stmt = con.createStatement();

    // Execute the SQL Query. Store results in ResultSet
    ResultSet rs = stmt.executeQuery(query);
    ResultSetMetaData rsmd = rs.getMetaData();

    int columnsNumber = rsmd.getColumnCount();
    String firstColumnName = rsmd.getColumnName(1);


        while (rs.next()){
            String myName = rs.getString(1);
            String myAge = rs.getString(2);
            System. out.println(myName+"  "+myAge);
        }

        con.close();

}
}
