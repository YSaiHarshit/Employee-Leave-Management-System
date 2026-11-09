package jdbc;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Leave leave = new Leave();
		
		leave.applyLeave(
				1,"Sick Leave","2026-11-01","2026-11-05","Not Feeling well"
				);
		
		leave.applyLeave(
				2,"Casual Leave","2026-11-15","2026-11-20","Not Feeling well"
				);
		
		
		leave.applyLeave(
				3,"Annual Leave","2026-11-18","2026-11-25","Not Feeling well"
				);
		
		leave.applyLeave(
				4,"Sick Leave","2026-11-12","2026-11-18","Not Feeling well"
				);
		
		leave.applyLeave(
				5,"Paternity Leave","2026-11-14","2026-11-20","Not Feeling well"
				);
		
		ViewLeaveRequests view = new ViewLeaveRequests();
		
		view.viewLeaveRequests();
		
		ApproveLeave approve = new ApproveLeave();
		approve.approveLeave(4);
		
		System.out.println("After Approval:");

        view.viewLeaveRequests();

	}

}
