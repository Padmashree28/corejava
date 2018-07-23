abstract class person6{
	public boolean doeshebreathe() {
		System.out.println("every person breathes:");
		return true;
	}
	public boolean doeshesleep() {
		System.out.println("every person sleeps:");
		return true;
	}
	public abstract boolean doeshedrivecar();
}
abstract class employee6 extends person6{
	public abstract boolean doeshedrivecar();
	}
class driver1 extends employee6{
	@Override
	public  boolean doeshedrivecar() {
		System.out.println("every driver drives a car");
		return true;
		
	}
	
}







public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver1 d=new driver1();
		System.out.println("breathing?"+d.doeshebreathe());
		System.out.println("driving?"+d.doeshedrivecar());
		System.out.println("sleeping?"+d.doeshesleep());
		

	}

}
