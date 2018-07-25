import java.util.*;
public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
ll.add("java");
ll.add("c++");
ll.add("c");
ll.add("python");
System.out.println(ll);
Iterator it=ll.iterator();
while(it.hasNext()) {
	System.out.println("Reading the elements:" +it.next());
}
ListIterator lt=ll.listIterator();
while(lt.hasNext()) {
	System.out.println("Reading the elements using list iterator in forward:" +lt.next());
}
while(lt.hasPrevious()) {
	System.out.println("Reading elements using list iterator:" +lt.previous());
}

	}

}
