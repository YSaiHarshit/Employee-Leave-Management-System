package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewLeaveRequests {

	public void viewLeaveRequests() {
		// TODO Auto-generated method stub
		
		
		String sql = 
				"SELECT lr.leave_id,e.name, " +
		        "lr.leave_type,lr.start_date, " +
			    "lr.end_date,lr.reason,lr.status " +
		        "FROM leave_requests lr " +
			    "JOIN employees e " +
		        "ON lr.employee_id = e.employee_id ";
		
		try(Connection con = java.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				
				System.out.println("Leave ID: " + rs.getInt("leave_id"));

				System.out.println("Employee : " + rs.getString("name"));

				System.out.println("Leave Type : " + rs.getString("leave_type"));

				System.out.println("Start Date : " + rs.getDate("start_date"));

				System.out.println("End Date : " + rs.getDate("end_date"));
				
				System.out.println("Reason : " + rs.getString("reason"));
				
				System.out.println("Status : " + rs.getString("status"));

				System.out.println("--------------------------------");
				
			}

			} catch ( Exception e ) {
				
				e.printStackTrace();
		}
		
		
	}

}
