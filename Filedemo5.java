import java.io.*;
public class Filedemo5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		int temp=0;
		//System.out.println("Enter the values:");
		for(int i=1;i<5;i++) {
			System.out.println("Enter the values: ");
			int val=Integer.parseInt(b.readLine());
			temp=temp+i;
			
			
			
		}
		System.out.println(temp);
		System.out.println("average:" +temp/5);

	}

}
