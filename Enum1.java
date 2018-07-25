import java.util.*;


public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");
		v.add("fff");
		ArrayList al=new ArrayList();
		Enumeration e=v.elements();
		al=Collections.list(e);
		System.out.println(al);
		
		
	}

}
