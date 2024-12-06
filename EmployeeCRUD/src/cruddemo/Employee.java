package cruddemo;

import java.sql.*;


/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :5:11:22 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

//employee class to implement CRUD operations
public class Employee {

	// Employee class implement CRUD operations

		Connection con;
		PreparedStatement ps;
		Statement st;
		ResultSet res;
		int cnt;
		
		public  Connection getConnection() throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","cfg@1234");
			return con;
	
		}
		
		public void insertEmployee(String name, String city, String contactno) throws Exception 
		{
			System.out.println("**************** Insert new Employees*****************");
			String sql="Insert into employee (name,city,contact)Values(?,?,?);";
			con=getConnection();
			ps=con.prepareStatement(sql);
			//ps.setInt(1, 0);
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, contactno);
			
			cnt=ps.executeUpdate();
			if(cnt>0)
				System.out.println("Record inserted");
			con.close();
		}
		
		public void getEmployee() throws Exception 
		{
		con=getConnection();
		 System.out.println("**************** Display Employees*****************");
		 st=con.createStatement();
		 res=st.executeQuery("Select * from employee");
		 while(res.next()) {
			 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(3));
		 }
		 st.close();res.close();con.close();
		}
		
		public void updateEmployee(int id,String city) throws Exception 
		{	
			con=getConnection();
			System.out.println("**************** Update Employees*****************");
			String sqlUpdate="update employee set city=? where eid=?";
			
			ps=con.prepareStatement(sqlUpdate);
			
			// prepare data for update
					
							
					 // passing values to prepared statement using setter methods
					ps.setString(1, city);
					ps.setInt(2, id);
					
					cnt=ps.executeUpdate();
					System.out.println(String.format("Row affected : %d", cnt));
					con.close();
		}
		
		public void deleteEmployee(int id) throws Exception 
		{	
			con=getConnection();
			System.out.println("**************** Delete Employees*****************");
			String sqldelete="delete from employee where eid=?";
			
			ps=con.prepareStatement(sqldelete);
			
			// prepare data for update
					
							
					 // passing values to prepared statement using setter methods
					//ps.setString(1, city);
					ps.setInt(1, id);
					cnt=ps.executeUpdate();
					if(cnt>0)
						System.out.println(cnt+" Record deleted");
					else
						System.out.println("record not found");
					
					con.close();
		}

		public void updateMail(int id,String email) throws Exception 
		{	
			con=getConnection();
			System.out.println("**************** Update Employees*****************");
			String sqlUpdate="update employee set email=? where eid=?";
			
			ps=con.prepareStatement(sqlUpdate);
			
			// prepare data for update
					
							
					 // passing values to prepared statement using setter methods
					ps.setString(1, email);
					ps.setInt(2, id);
					
					cnt=ps.executeUpdate();
					System.out.println(String.format("Row affected : %d", cnt));
					con.close();
		}
		
}
