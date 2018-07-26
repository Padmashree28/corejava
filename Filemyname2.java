import java.io.*;
public class Filemyname2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("enter your name please!!!");
		String myname=b.readLine();
		System.out.println("enter your age:");
		int age=Integer.parseInt(b.readLine());
		System.out.println("you are "+age+ "age");
		System.out.println("welcome "+myname);
		

	}

}
