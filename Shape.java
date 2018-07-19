
class circle{
	double pi=3.14;
	double r=2;
	double area;
	
	public static double calcarea(circle c) {
		c.area=c.pi*c.r*c.r;
		return c.area;
}
}
class triangle{
	int area;
	int l=5;
	int b=10;
	int h=7;
	
	public double calcarea(triangle t) {
		t.area=t.l*t.b*t.h;
		return t.area;
	}
}
class square{
	int area;
	int a=3;
	
	public double calcarea(square s) {
		s.area=s.a*s.a*s.a;
		return s.area;
	}

	

}


public  class Shape {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		circle c=new circle();
		System.out.println(c.calcarea(c));
		

	}
}


