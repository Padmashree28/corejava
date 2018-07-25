import java.util.ArrayList;
import java.util.Collections;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList source=new ArrayList();
		source.add(1);
		source.add(2);
		source.add(3);
		source.add(5);
		Collections.swap(source, 2, 3);
		System.out.println(source);
	}

}
