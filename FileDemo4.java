import java.io.*;
public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("Enter your name:");
		String name=b.readLine();
		System.out.println("Enter the location: ");
		String loc=b.readLine();
		System.out.println("welcome " +name);
		System.out.println("you are living in: " +loc);
		
		
		

	}

}
