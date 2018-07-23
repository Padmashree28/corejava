
public class Emp1 implements comparison {
String name;
Double salary;
public Emp1(String name,double salary) {
	this.name=name;
	this.salary=salary;
}
public void whichisgreater(Object o1,Object o2) {
	Emp1 e1=(Emp1)o1;
	Emp1 e2=(Emp1)o2;
	if(e1.salary>e2.salary) {
		System.out.println(e1.name +"is greater");
	}
	else {
		System.out.println(e2.name + "is greater");
	}
	
}
}
