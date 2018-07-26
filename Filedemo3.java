import java.io.*;
public class Filedemo3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("enter a value:");
		int val=Integer.parseInt(b.readLine());
		if(val%3==0) 
			System.out.println("The value " +val+ "is divisible by 3");
			else
				System.out.println("The value " +val+ "is not divisible by 3");
		}
		

	}


