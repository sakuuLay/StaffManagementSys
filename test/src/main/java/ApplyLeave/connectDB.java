package ApplyLeave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	
	private static String url = "jdbc:mysql://localhost:3306/flow_manager";
	private static String un = "saku";
	private static String pw = "s96sSQL.";
	private static Connection con;
	
	
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, un, pw);
            
            if (con == null) {
                throw new SQLException("Failed to connect to database.");
            }
        } catch (Exception e) {
        	System.out.println("conection issue :" + e.getMessage());
        }
        return con;
    }
}

