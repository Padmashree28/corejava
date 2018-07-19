
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//int a,b,c;
		//s=a+b+c;
		for(int i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("sum is:" +sum);

	}

}
