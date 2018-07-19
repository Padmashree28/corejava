
public class Array2big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,50,2,5,55,25};


		int big=arr[0]; // assume that big holds the biggest number

		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] > big)
				big=arr[i];

		}
System.out.println("The biggest element is:" +big);

	}

}
