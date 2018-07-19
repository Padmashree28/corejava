
public class Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,45,26,78};
		int found=0; // 0 means not found

		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==26)
			{
				found=1; // changing the value of found
				break;
			}
				
		}

		if (found==1)
			System.out.println("26 is there");
		else
			System.out.println("26 is not there");


	}

}
