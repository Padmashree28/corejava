import java.sql.*;
public class Jdbcreaddata {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("unable to locate the driver");
		}
		String jdbcurl="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="scott";
		String password="tiger";
		Connection con=null;
try {
	 con=DriverManager.getConnection(jdbcurl,username,password);
	System.out.println("connection is successfull,prg is connected");
} catch (SQLException e) {
	System.out.println("could not connect to the server");
}


Statement smt=con.createStatement();
ResultSet r=smt.executeQuery("SELECT * FROM EMPLOYEE");
 
while(r.next()) {
	String name=r.getString(1);
	String salary=r.getString(2);
	String department=r.getString(3);
	System.out.println( name+" "+salary+" "+department);
}
r.close();
smt.close();
con.close();



	}

}
