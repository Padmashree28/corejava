class FirstThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class SecondThread extends FirstThread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=15;i<=20;i++) {
			System.out.println(i);
		}
	}
}
public class ThraedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread f=new FirstThread();
		f.setName("MyThread1");
		f.setPriority(Thread.MIN_PRIORITY);
		f.start();
		
		SecondThread s=new SecondThread();
		s.setName("MyThread2");
		s.setPriority(Thread.MAX_PRIORITY);
		s.start();
		
		

	}

}
