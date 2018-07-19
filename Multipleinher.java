

	class A{
		int a=10;
	}
class B extends A{
	int b=25;
	int a=50;
}
class C extends B{
	int c=75;
}
public class Multipleinher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c1=new C();
System.out.println(c1.a);
System.out.println(((A)c1).a);

	}

}
