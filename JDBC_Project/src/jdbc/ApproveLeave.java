package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApproveLeave {

	public void approveLeave(int leaveId) {
		
		String sql = 
				"UPDATE leave_requests " +
					    "SET status = ? " +
					    "WHERE leave_id = ? AND status = 'PENDING'";
			
		try (
		
			 Connection con = java.getConnection();
			 PreparedStatement ps = con.prepareStatement(sql)
		) {
			
			ps.setString(1, "Approved");
			ps.setInt(2, leaveId );
			
			int rows = ps.executeUpdate();
			
			if (rows > 0) {

			    System.out.println("Leave approved successfully!");

			} else {

			    System.out.println("Leave request ID not found.");

			}
			
		} catch ( Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
