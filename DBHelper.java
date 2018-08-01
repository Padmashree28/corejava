package com.deloitte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBHelper {
public ArrayList getallpassenger(String des) {
	ArrayList al=new ArrayList();
	
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	PreparedStatement ps=con.prepareStatement("SELECT * FROM PASSENGERS WHERE DES=?");
	ps.setString(1,des);
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		String firstname=rs.getString(1);
		String lastname=rs.getString(2);
		String source=rs.getString(3);
		String dest=rs.getString(4);
		String gender=rs.getString(5);
		PassengerVO pvo=new PassengerVO();
		pvo.setFirstname(firstname);
		pvo.setLastname(lastname);
		pvo.setSource(source);
		pvo.setDes(dest);
		pvo.setGender(gender);
		al.add(pvo);
	}
	rs.close();
	ps.close();
	con.close();
	
}
	catch(ClassNotFoundException ce) {
		System.out.println("class not found Exception");
	}
	catch(SQLException s) {
		System.out.println("SQL Exception");
	}
	return al;
}

}
