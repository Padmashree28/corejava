
public class Stringdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=args[0];
		int ctr=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='c')
				ctr++;
		}
		System.out.println("Frequency of c is:" +ctr);

}
}
