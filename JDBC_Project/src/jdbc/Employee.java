package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee {

		
           public void registerEmployee(
				
				String name,
				String email,
				String department,
				String phone
				
				) {
			
			String sql =
					"Insert INTO employees " +
			        "(name,email,department,phone) " +
					"VALUES (?,?,?,?)";
			
			try ( Connection con = java.getConnection();
				  PreparedStatement ps = con.prepareStatement(sql);
				  ) {
				
				ps.setString(1 , name );
				ps.setString(2 , email );
				ps.setString(3 , department );
				ps.setString(4 , phone );
				
				int rows = ps.executeUpdate();
				
				if ( rows > 0 ) {
					
					System.out.println("Employee registered successfully!");
					
				} 
				
			}   catch (Exception e) {
					 e.printStackTrace();
				}

			}
           
           public void displayEmployees() {

        	    String sql = "SELECT * FROM employees";

        	    try (Connection con = java.getConnection();
        	         PreparedStatement ps = con.prepareStatement(sql);
        	         ResultSet rs = ps.executeQuery()) {

        	        while (rs.next()) {

        	            System.out.println("Employee ID: "
        	                    + rs.getInt("employee_id"));

        	            System.out.println("Name: "
        	                    + rs.getString("name"));

        	            System.out.println("Email: "
        	                    + rs.getString("email"));

        	            System.out.println("Department: "
        	                    + rs.getString("department"));

        	            System.out.println("Phone: "
        	                    + rs.getString("phone"));

        	            System.out.println("-------------------");
        	        }

        	    } catch (Exception e) {
        	        e.printStackTrace();
        	    }
        	}
           public static void main(String[] args) {

               Employee emp = new Employee();

               emp.registerEmployee(
                       "Rishi","rishi@gmail.com","IT","9415263896"
                   );
               
           }
			
		}
