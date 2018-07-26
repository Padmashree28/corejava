class Restaurant{
	public synchronized void takelunch(String name) {
		System.out.println("person to take lunck 1st is:");
		System.out.println(name);
		
	}
}
class person5 extends Thread{
	String name;
	Restaurant rest;
	public person5(String name, Restaurant rest) {
		
		this.name = name;
		this.rest = rest;
	}
	public void run() {
		rest.takelunch(this.name);
	}
	
}
public class SynchronizedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r=new Restaurant();
		person5 d=new person5("hari",r);
		person5 d1=new person5("ravi",r);
		d.start();
		d1.start();
		
		
		

	}

}
