package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :3:00:09 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class InsertDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			
			con=ConnectionUtil.createConnection();
			stmt=con.createStatement();
			int count = stmt.executeUpdate("Insert into skills(name) Values('Node JS')");
			
			if(count>0)
				System.out.println("Record inserted");
			rs=stmt.executeQuery("select count(id) from skills");
			int cnt=0;
			while(rs.next()) {
				cnt=rs.getInt(1);
				
			}
			System.out.println("Total records are: "+cnt);
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
