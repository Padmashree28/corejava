import java.io.*;
import java.sql.*;
public class jdbcStepsdemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("Enter the name1 :");
		String name1=b.readLine();
		System.out.println("Enter the date:");
		String date1=b.readLine();
		System.out.println("Enter the steps :");
		int steps=Integer.parseInt(b.readLine());
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
		con.setAutoCommit(false);
		
		
		
		PreparedStatement psmt=con.prepareStatement("INSERT INTO DAILYSTEPS VALUES(?,?,?)");
		psmt.setString(1, name1);
		psmt.setDate(2, Date.valueOf(date1));
		psmt.setInt(3, steps);
		int i=psmt.executeUpdate();
		PreparedStatement psmt1=con.prepareStatement("UPDATE TOTAL_STEPS SET STEPS=STEPS+? WHERE NAME=?");
		psmt1.setInt(1, steps);
		psmt1.setString(2, name1);
		
		
		int j=psmt1.executeUpdate();
		System.out.println(i);
		System.out.println(j);
		if(i>0 && j>0) {  
			System.out.println("Successfully committed!!!");
			con.commit();
		}
		else {
			System.out.println("Not committed!!!");
			con.rollback();
		}
		psmt1.close();
		psmt.close();
		con.close();
		
//		if(rowsaffected>0)			
//			System.out.println("Successfully inserted");
//		else
//			System.out.println("Not inserted");
		
	}
		catch(ClassNotFoundException s) {
			System.out.println("Driver class not found" +s.getMessage());
			}
		catch(SQLException se) {
			System.out.println("SQL exception found:" +se.getMessage());
			
		}
		}

}
