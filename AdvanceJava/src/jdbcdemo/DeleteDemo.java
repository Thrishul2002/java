package jdbcdemo;

import java.sql.*;



/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :4:17:54 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		int count=0;
try {
			
			con=ConnectionUtil.createConnection();
			stmt=con.createStatement();
			count = stmt.executeUpdate("Delete from candidates where rtrim(last_name) like\'k%g\';");//k%g --> starts with 'k' and ends with 'g'
			//String sql1="deleted from candidates where id=101";
			if(count>0)
				System.out.println(count+" Record deleted");
			else
				System.out.println("record not found");
				
			con.close();
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
