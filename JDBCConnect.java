import java.sql.*;
public class JDBCConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("unable to locate the driver");
		}
		String jdbcurl="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="scott";
		String password="tiger";
try {
	Connection con=DriverManager.getConnection(jdbcurl,username,password);
	System.out.println("connection is successfull,prg is connected");
} catch (SQLException e) {
	System.out.println("could not connect to the server");
}
	}

}
