class Emp{
	double sal;
	String name;
	int eid;
	String dept;
	Address add;

Emp(double sal,String name,int eid,String dept,Address add){
	this.sal=sal;
	this.name=name;
	this.eid=eid;
	this.dept=dept;
	this.add=add;
}
public void printempdetails() {
	System.out.println(this.name);
	System.out.println(this.sal);
	System.out.println(this.eid);
	System.out.println(this.dept);
	add.printadddetails();
}
}
class Address{
	int flatno;
	String apartname;
	String main;
	String cross;
	String city;
	long pin;
	

	Address(int flatno,String apartname,String main,String cross,String city,long pin){
		this.flatno=flatno;
		this.apartname=apartname;
		this.cross=cross;
		this.main=main;
		this.city=city;
		this.pin=pin;
	}
	public void printadddetails() {
		System.out.println(this.flatno);
		System.out.println(this.apartname);
		System.out.println(this.cross);
		System.out.println(this.main);
		System.out.println(this.city);
		System.out.println(this.pin);
	}
}
public class Hasa {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address(12,"shanthi nagar","7th main","8th cross","mumbai",590007l);
		Emp e=new Emp(12345.4,"peter",123,"finance",a);
		e.printempdetails();
		

	}

}

