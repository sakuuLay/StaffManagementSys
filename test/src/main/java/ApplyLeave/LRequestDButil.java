package ApplyLeave;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LRequestDButil {
	
	private static int Rid = 0;
	
	
	
	public static int getReqID() {
		return Rid;
	}

	
	
    public static boolean sendRequest(int eID, String eName, String dID, String type, String date, String des) {
		boolean isSuccess = false;
		String insertSql = "INSERT INTO lrequest(empID,ename,depID,type,date,des) VALUES (?,?,?,?,?,?)";
		String lastIdSql = "SELECT ReqID FROM lrequest ORDER BY ReqID DESC LIMIT 1";

		try (Connection con = connectDB.getConnection();
			 java.sql.PreparedStatement ps = con.prepareStatement(insertSql)) {

			if (con == null) throw new SQLException("No DB connection");

			ps.setInt(1, eID);
			ps.setString(2, eName);
			ps.setString(3, dID);
			ps.setString(4, type);
			ps.setString(5, date);
			ps.setString(6, des);

			int rw = ps.executeUpdate();
			if (rw > 0) {
				isSuccess = true;
				try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(lastIdSql)) {
					if (rs.next()) {
						Rid = rs.getInt(1);
					}
				}
			} else {
				throw new Exception("no row affected");
			}

		} catch (Exception e) {
			System.out.println("Connection error : " + e.getMessage());
		}

		return isSuccess;
    }
    
    
    
   public static boolean dltRequest(int rid) {
		boolean isSuccess = false;
		String sql = "DELETE FROM lrequest WHERE ReqID = ?";

		try (Connection con = connectDB.getConnection();
			 java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

			if (con == null) throw new SQLException("No DB connection");

			ps.setInt(1, rid);
			int rw = ps.executeUpdate();

			if (rw > 0) {
				isSuccess = true;
				Rid = rid;
			} else {
				throw new Exception("no row affected");
			}

		} catch (Exception e) {
			System.out.println("Connection error : " + e.getMessage());
		}

		return isSuccess;
    }
    
    
    
	public static List<fRequest> ViewReq(int nb){
		ArrayList<fRequest> FR = new ArrayList<>();
		String sql = "SELECT * FROM lrequest WHERE ReqID = ?";

		try (Connection con = connectDB.getConnection();
			 java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

			if (con == null) throw new SQLException("Failed to connect to database.");

			ps.setInt(1, nb);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					int Reqid = rs.getInt(1);
					int eid = rs.getInt(2);
					String ename = rs.getString(3);
					String depId = rs.getString(4);
					String type = rs.getString(5);
					String date = rs.getString(6);
					String des = rs.getString(7);
					String approval = rs.getString(8);
					String email = rs.getString(9);
					String sub = rs.getString(10);

					fRequest fr = new fRequest(Reqid, eid, ename, depId, type, date, des, approval, email, sub);
					FR.add(fr);
				} else {
					throw new Exception("nothing retrieved : maybe invalid ReqID");
				}
			}

		} catch (Exception e) {
			System.out.println("conection issue :" + e.getMessage());
		}

		return FR;
		}
    
    
    
	
    public static boolean updateRequest(int rID, int eID, String eName, String dID, String type, String date, String des) {
		boolean isSuccess = false;
		String sql = "UPDATE lrequest SET empID = ?, ename = ?, depID = ?, type = ?, date = ?, des = ? WHERE ReqID = ?";
		String lastIdSql = "SELECT ReqID FROM lrequest ORDER BY ReqID DESC LIMIT 1";

		try (Connection con = connectDB.getConnection();
			 java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

			if (con == null) throw new SQLException("No DB connection");

			ps.setInt(1, eID);
			ps.setString(2, eName);
			ps.setString(3, dID);
			ps.setString(4, type);
			ps.setString(5, date);
			ps.setString(6, des);
			ps.setInt(7, rID);

			int rw = ps.executeUpdate();
			if (rw > 0) {
				isSuccess = true;
				try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(lastIdSql)) {
					if (rs.next()) {
						Rid = rs.getInt(1);
					}
				}
			} else {
				throw new Exception("no row affected");
			}

		} catch (Exception e) {
			System.out.println("Connection error : " + e.getMessage());
		}

		return isSuccess;
   }
	
    
    
}
