import java.util.*;
public class CollectionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList source=new ArrayList();
		source.add(1);
		source.add(2);
		source.add(3);
		source.add(5);
		//source.add(7);
		ArrayList dest=new ArrayList();
		dest.add(4);
		dest.add(5);
		dest.add(6);
		dest.add(23);
		Collections.copy(dest, source);
		System.out.println("Copy:" +dest);
		Collections.fill(dest,'@');
System.out.println("Fill:" +dest);
System.out.println("Binary Search:" +Collections.binarySearch(source, 3));
Collections.rotate(source, 3);
System.out.println(source);

	}

}
