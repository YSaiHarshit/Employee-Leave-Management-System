package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RejectLeave {
	
	public void rejectLeave(int leaveId ) {
		
		String sql = 
				
				"UPDATE leave_requests" + "SET status = 'REJECTED' " +
				"WHERE leave_id = ? ";
		
		try(Connection con = java.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
			
			ps.setInt(1 , leaveId );
			
			int rows = ps.executeUpdate();
			
			if (rows > 0) {
				
				System.out.println("Leave Rejected Successfully");
				
			} else {
				
				System.out.println("Leave request not found");
				
			}
			
		} catch ( Exception e ) {
			
			e.printStackTrace();
			
		}
	}

}
