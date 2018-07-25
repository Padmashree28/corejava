import java.util.*;
class Car implements Comparable{
	String colour;
	String name;
	double price;
	public Car(String colour, String name, double price) {
		super();
		this.colour = colour;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+ " " +this.colour+" "+this.price;
	}
	public int compareTo(Object o) {
		Car cc=(Car)o;
		int ret_val=0;
		if(this.price==cc.price)
			ret_val=0;
		else if(this.price<cc.price)
			ret_val=-1;
		else if(this.price>cc.price)
			ret_val=1;
		return ret_val;
	}
	
}
public class ArraylistSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		Car c1=new Car("silver","audi",12356.4);
		Car c2=new Car("red","swift0",647489.2);
		Car c3=new Car("black","jaguar",9875.3);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println("before sorting" +al);
		Collections.sort(al);
		System.out.println("after sorting" +al);
		
		

	}

}
