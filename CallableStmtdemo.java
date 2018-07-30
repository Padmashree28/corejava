import java.sql.*;
public class CallableStmtdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
String sql="{?=call BIG1(?,?)}";
CallableStatement cc=con.prepareCall(sql);
cc.registerOutParameter(1, Types.INTEGER);
cc.setInt(2, 25);
cc.setInt(3, 125);
cc.execute();

	System.out.println("sql function executed successfully!!!");
System.out.println("Biggest number is:" +cc.getInt(1));
cc.close();
con.close();

}
		
		
		catch(ClassNotFoundException ce) {
			System.out.println("Driver class not found" +ce.getMessage());
		}
		catch(SQLException se) {
			System.out.println("SQL exception found:" +se.getMessage());
		}

}
}
