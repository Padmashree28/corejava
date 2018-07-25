import java.util.*;
import java.util.Iterator;

public class HasmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap h=new HashMap();
h.put("1", "ram");
h.put("2","ravi");
h.put("3","ragu");
System.out.println(h);
System.out.println(h.get("2"));
Set keys=h.keySet();
Iterator it=keys.iterator();
while(it.hasNext()) {
String key=(String)it.next();
System.out.println(h.get(key));
	}
	}

}
