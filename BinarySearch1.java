import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList source=new ArrayList();
		source.add(1);
		source.add(2);
		source.add(3);
		source.add(5);
		System.out.println("Binary Search:" +Collections.binarySearch(source, 3));
	}

}
