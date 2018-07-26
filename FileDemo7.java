import java.io.*;
public class FileDemo7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		int count=0;
		System.out.println("Enter the location: ");
		String loc=b.readLine();
		
		while(!loc.equals("stop")) {
			count++;
			System.out.println("Enter the location: ");
			 loc=b.readLine();
		}
		System.out.println("No.of cities:" +count);
	
}
}
