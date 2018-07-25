import java.util.*;
class MobilePhone1{
	String mob_name;
	int price;
	public MobilePhone1(String mob_name, int price) {
		super();
		this.mob_name = mob_name;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
return this.mob_name+ " " +this.price;
	}
	@Override
	public boolean equals(Object obj) {
		MobilePhone1 p=(MobilePhone1)obj;
		if(this.mob_name.equals(p.mob_name) && this.price==price)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.price*5;
	}
	
	
	
}
public class SetuserdefinedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone1 mp1=new MobilePhone1("samsung",123);
		MobilePhone1 mp2=new MobilePhone1("samsung",123);
		MobilePhone1 mp3=new MobilePhone1("samsung",1235);
		HashSet h=new HashSet();
		h.add(mp1);
		h.add(mp2);
		h.add(mp3);
		System.out.println(h);
		

	}

}
