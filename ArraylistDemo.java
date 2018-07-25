import java.util.*;
public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("saranya");
		al.add("padma");
		al.add("shree");
		al.add("raaja");
		al.add(2);
		for(int i=0;i<al.size();i++) {
			if(al.get(i).equals("shree")) {
				al.remove(i);
				System.out.println(al);
				
				
			}
		}
		al.remove("padma");
		for(int i=0;i<al.size();i++) {
			System.out.println(al);
		}
		
				
					
				}
			
	}

		

	


