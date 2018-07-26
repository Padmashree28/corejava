class Greeting{
	public synchronized void sayhello(String name){
		System.out.println("!");
		System.out.println(name);
		System.out.println("!");
	}
}
class GreetingThread extends Thread{
	String name;
	Greeting greeting;
	public GreetingThread(String name, Greeting greeting) {
		
		this.name = name;
		this.greeting = greeting;
	}
	public void run() {
		greeting .sayhello(this.name);
	}
	
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting g=new Greeting();
		
		GreetingThread g1=new GreetingThread("shree",g);
		GreetingThread g2=new GreetingThread("sara",g);
		g1.start();
		g2.start();

	}

}
