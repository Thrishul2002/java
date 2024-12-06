package jdbcdemo;

import java.sql.*;


/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :4:44:12 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Skills {
	
	Connection con=null;
	CallableStatement cstmt;
	ResultSet rs;
	int id;
	
	public Skills() throws Exception{
		con=ConnectionUtil.createConnection();
	}
	
	public void getSkills(int candidateId) throws Exception {
		cstmt=con.prepareCall("{call get_candidate_skill(?)}");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		if (!rs.next()) {
			System.out.println("no records");
		}
		else {
					do {
            System.out.println(String.format("%s - %s",
                    rs.getString("first_name") + " "
                    + rs.getString("last_name"),
                    rs.getString("skill")));
				}while (rs.next());
		}

		con.close();
	}
}
