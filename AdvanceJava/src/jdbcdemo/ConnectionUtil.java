package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :12:08:30 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/
// utility class to connect my sql server
public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","cfg@1234");
		return con;
	}
	
}
