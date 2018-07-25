import java.util.*;
public class Collectionmthdsdemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		Collections.shuffle(al);
		System.out.println("shuffled value is:" +al);
		System.out.println("Maximum value is:" +Collections.max(al));
		System.out.println("Minimum value is:" +Collections.min(al));
		Collections.replaceAll(al, "2", "10");
		System.out.println("Replaced value is:" +al);
		Collections.reverse(al);
		System.out.println("Reversed value is:" +al);
		

	}

}
