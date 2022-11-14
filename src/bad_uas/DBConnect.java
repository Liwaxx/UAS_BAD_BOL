package bad_uas;

// Import Java.sql
import java.sql.*;
        
public class DBConnect {
   // Create a connection variable and set it to null
   private static Connection conn;
    public static Connection DBConnect(){
        if(conn == null) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // jdbc:mysql://hostname:port/databasename, server username, server password
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/variasi1","root","root");
                }catch(Exception ex) {
                    // If connection fail
                    System.out.println("Erro: " + ex);
                    return null;
                }
        }
        return conn;
    }
    
}
