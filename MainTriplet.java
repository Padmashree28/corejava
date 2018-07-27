import java.io.*;
public class MainTriplet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("Enter the values:");
		int val=Integer.parseInt(b.readLine());
		if(val<=2) {
			System.out.println("Values should be more than 2");
		}
		else {
			int arr[]=new int[val];
			System.out.println("Enter the numbers:");
			for(int i=0;i<arr.length;i++) {
				String s1=b.readLine();
				int x=Integer.parseInt(s1);
				arr[i]=x;
			}
			Exam3.checktriplets(arr);
		}

	}

}
