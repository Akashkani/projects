package javaDB;

import java.sql.*;
import java.util.Scanner;

public class ATMprojectDAO {
	
	public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Akash@007");
		
		return con;
	}

	public static ATMprojectPOJO getData(int accNum1,int pin1) throws Exception {
		
		ATMprojectPOJO a= null;
		Connection con = getConnection();
		Statement ps = con.createStatement();
		String query = "select * from userdetail where accNum="+accNum1;
		ResultSet rs = ps.executeQuery(query);
		
		if(rs.next()) {
			int int1 = rs.getInt(1);
			int int2 = rs.getInt(2);
			int int3 = rs.getInt(3);
			String str = rs.getString(4);	
			a = new ATMprojectPOJO(int1,int2,int3,str);
		}
		return a;
	}
	
	public static int updateData(int accNum1, int balance1) throws Exception {
		
		int update=0;
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("update userdetail set balance=? where accNum=?");
		ps.setInt(1,balance1); ps.setInt(2, accNum1);
		update = ps.executeUpdate();
		return update;
		
	}

}
