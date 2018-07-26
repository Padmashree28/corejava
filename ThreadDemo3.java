class FirstThread1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class SecondThread1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=15;i<=20;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread f=new Thread(new FirstThread1());
		Thread s=new Thread(new SecondThread1());
		f.start();
		//f.start();
		//f.start();
		s.start();
		

	}

}
