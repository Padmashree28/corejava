import java.io.*;

public class Exam3 {

public static boolean checktriplets(int arr[]) {
	
	int flag=0;
	for(int i=0;i<arr.length-2;i++) {
		if(arr[i]==arr[i+1]) {
			if(arr[i+1]==arr[i+2]) {
				flag=1;
			}
		}
		else
		flag=0;
	}
	if(flag==1) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	return true;
	
}
}
