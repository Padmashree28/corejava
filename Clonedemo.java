class places implements Cloneable{
	String name;
	String country;
	long population;
	public places(String name, String country, long population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class Clonedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
places p1=new places("mumbai","india",123456L);
System.out.println(p1);
places p2=null;
try {
	p2=(places)p1.clone();
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
p1.country="USA";
System.out.println(p1.country);
System.out.println(p2.country);
	}

}
