package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckLeaveBalance {
	
public void CheckLeaveBalance() {
	
	String sql =
			
			"SELECT e.name,lb.total_leave, " + "lb.used_leave , lb.remaining_leave " +
		    "FROM employees e " + "JOIN leave_balance lb " + "ON e.employee_id = lb.employee_id ";
	
	try (Connection con = java.getConnection();
	     PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet rs = ps.executeQuery()) {
				
		
		while (rs.next()) {
			
			System.out.println("Employee: " + rs.getString("name"));
			
			System.out.println("Total Leave: " + rs.getString("total_leave"));

			System.out.println("Used Leave: " + rs.getString("used_leave"));

			System.out.println("Remaining Leave: " + rs.getString("remaining_leave"));
			
			System.out.println("---------------------------------------");

		}
		
	} catch ( Exception e ) {
		
		e.printStackTrace();
	}
}


    public static void main(String[] args) {

        CheckLeaveBalance balance = new CheckLeaveBalance();

        balance.CheckLeaveBalance();
}

}
