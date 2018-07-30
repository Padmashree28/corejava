import java.sql.*;
import java.io.*;

public class JdbcExecute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("Enter the name :");
		String name=b.readLine();
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
//Statement smt=con.createStatement();
String sql="Delete from employee where name=?";
		PreparedStatement psmt=con.prepareStatement(sql);
		psmt.setString(1, name);
		
		int rowsaffected=psmt.executeUpdate();
		if(rowsaffected>0)
			System.out.println("SAuccessfully DELETED");
		else
			System.out.println("Not inserted");
			
	}
	
	catch(ClassNotFoundException s) {
		System.out.println("Driver class not found" +s.getMessage());
	}
		catch(SQLException se) {
			System.out.println("SQL exception found:" +se.getMessage());
		}

}

	
}
