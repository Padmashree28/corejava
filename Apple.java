
public class Apple implements comparison {
String src;
double price;
public Apple(String src,double price) {
	this.src=src;
	this.price=price;
}
public void whichisgreater(Object o1,Object o2) {
	Apple a1=(Apple)o1;
	Apple a2=(Apple)o2;
	if(a1.price>a2.price) {
		System.out.println(a1.src +"is greater");
	}
	else {
		System.out.println(a2.src +"is greater");
	}
}

}
