package Java;

import java.sql.*;

public class DatabaseTestMultiColumn {

    public static void main(String[] args) throws Exception, ClassNotFoundException, SQLException

    {
        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:postgresql://localhost:5433/TicketManagement";

        //Database Username
        String username = "postgres";

        //Database Password
        String password = "root";

        //Query to Execute
        String query = "select *  from stpl_user;";

        //Load mysql jdbc driver

        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
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

        for (int dwcolumn = 1; dwcolumn <= columnsNumber; dwcolumn++) {
            System.out.println("================================");
            System.out.println("================================");

            System.out.println(rsmd.getColumnName(dwcolumn) + " "); //Print column Name
            System.out.println("================================");
            // System.out.println(rs.next());

            while (rs.next()) {
                for (int dbRow = 1; dbRow <= dwcolumn; dbRow++) {
                    System.out.println(rs.getString(dbRow) + " ");
                }
            }
        }


        con.close();


    }
}
