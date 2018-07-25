import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("saranya");
		al.add("padma");
		al.add("shree");
		al.add("raaja");
		System.out.println("before sorting" +al);
		Collections.sort(al);
		System.out.println("After sorting" +al);
		

	}

}
