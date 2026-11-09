package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_leave_management", "root", "Harshith@123");
			System.out.println("Connected...");
			con.close();
 
 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 

	}

	public static Connection getConnection() throws Exception  {
		// TODO Auto-generated method stub
		
		 Class.forName("com.mysql.cj.jdbc.Driver");

	        return DriverManager.getConnection(
	        		
	        		"jdbc:mysql://localhost:3306/employee_leave_management","root","Harshith@123"
	        		
	        );
	}

}
