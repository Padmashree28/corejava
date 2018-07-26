import java.io.*;

public class Filedemo6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		int max=0,num=0;
		//System.out.println("Enter the values:");
		for(int i=1;i<5;i++) {
			System.out.println("Enter the values: ");
			num=Integer.parseInt(b.readLine());
			if(num>max)
				max=num;
			}
		System.out.println(max);
		//System.out.println("average:" +temp/5);


	}

}
