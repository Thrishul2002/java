package jdbcdemo;

import java.sql.*;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :3:33:41 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Candidates {
	
	Connection con=null;
	PreparedStatement stmt;
	ResultSet rs;
	
	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String lastname;
	
	public void getConnection() throws Exception {
		con=ConnectionUtil.createConnection();
	}
	
	public void UpdateCandidate() throws Exception {
		
		sqlUpdate="update candidates set last_name=? where id=?";
		
		stmt=con.prepareStatement(sqlUpdate);
		
		// prepare data for update
				s=new Scanner(System.in);
				System.out.println("enter Employee id:");
				eid=s.nextInt();
				System.out.println("enter employee's new last name :");
				lastname=s.next();
						
				 // passing values to prepared statement using setter methods
				stmt.setString(1, lastname);
				stmt.setInt(2, eid);
				
				cnt=stmt.executeUpdate();
				System.out.println(String.format("Row affected : %d", cnt));
				
				// reuse the prepared statement
		        lastname = "Clinton";
		        eid = 101;
		        stmt.setString(1, lastname);
		        stmt.setInt(2, eid);

		        cnt = stmt.executeUpdate();
		        System.out.println(String.format("Row affected %d", cnt));
		        con.close();
	}
	
}
