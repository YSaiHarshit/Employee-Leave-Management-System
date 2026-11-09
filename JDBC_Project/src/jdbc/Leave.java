package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class Leave {

public void applyLeave(
		
		int employeeId,
		String leaveType,
		String startDate,
		String endDate,
		String reason
		
		) throws Exception  {
	
	String sql = "INSERT INTO leave_requests" + "(employee_id , leave_type , start_date , end_date , reason )" +
	"VALUES (?,?,?,?,?)";
	
	try (
		  Connection con = java.getConnection();
		  PreparedStatement ps = con.prepareStatement(sql)
				  
		) {
		
		ps.setInt(1, employeeId );
		ps.setString(2, leaveType );
		ps.setDate( 3 , Date.valueOf(startDate));
		ps.setDate( 4 , Date.valueOf(endDate));
		ps.setString( 5 , reason );
		
		ps.executeUpdate();
		
        System.out.println("Leave request submitted successfully!");

	} catch ( Exception e ) {
		
		e.printStackTrace();
		
	}
	
	
	
}

}
