import java.io.*;
public class Fileex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		FileWriter fw=new FileWriter("hello.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter the content");
		String con=b.readLine();
		while(!con.equals("stop")) {
			 bw.write(con);
			 bw.newLine();

			System.out.println("Enter the content");
			 con=b.readLine();
		}
		
		bw.close();
		System.out.println("Done");
		
		

	}

}
