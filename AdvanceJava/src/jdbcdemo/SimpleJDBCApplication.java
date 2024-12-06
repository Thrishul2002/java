package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :10:50:08 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SimpleJDBCApplication {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels";
			String username="root";
			String password="cfg@1234";
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement staement=connection.createStatement();
			String sql="select * from offices";
			ResultSet rs=staement.executeQuery(sql);
			System.out.println("employeeId\tCity\t\tpincode\n");
			while(rs.next()) {
				int id=rs.getInt("officeCode");
				String name=rs.getString("city");
				
				System.out.println(id+"\t\t"+name+"\t\t"+rs.getString("postalCode"));
			}
			rs.close();
			staement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
