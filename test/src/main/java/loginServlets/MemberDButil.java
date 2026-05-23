package loginServlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//controller class interact with DB

public class MemberDButil {
	
	public static List<Member> validateM(String usernamedb, String passworddb){
		
		ArrayList<Member> SM = new ArrayList<>();
		
		//database connection
		String url = "jdbc:mysql://localhost:3306/flow_manager";
		String un = "saku";
		String pw = "s96sSQL.";

		String sql = "SELECT * FROM employee WHERE username = ? AND password = ?";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(url, un, pw);
				 PreparedStatement ps = con.prepareStatement(sql)) {

				if (con == null) throw new SQLException("Failed to connect to database.");

				ps.setString(1, usernamedb);
				ps.setString(2, passworddb);

				try (ResultSet rs = ps.executeQuery()) {
					if (rs.next()) {
						int EID = rs.getInt(1);
						String eName = rs.getString(2);
						String email = rs.getString(3);
						double eBasicSalary = rs.getDouble(4);
						String userName = rs.getString(5);
						String pass = rs.getString(6);
						String gender = rs.getString(7);
						String departmentID = rs.getString(8);
						String contactNb = rs.getString(9);

						Member mb = new Member(EID, eName, email, eBasicSalary, userName, pass, gender, departmentID, contactNb);
						SM.add(mb);
					} else {
						throw new Exception("nothing retrieved : maybe invalid username or password");
					}
				}

			}

		} catch (Exception e) {
			System.out.println("conection issue :" + e.getMessage());
		}

		return SM;
		}
}
