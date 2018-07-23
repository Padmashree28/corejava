interface Tvremote{
	public void switchoff();
	public void switchon();
	
}
class sony implements Tvremote{

	@Override
	public void switchoff() {
		// TODO Auto-generated method stub
		System.out.println("tv switch off");
		
	}

	@Override
	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("switch on");
		
	}

}
class samsung implements Tvremote{

	@Override
	public void switchoff() {
		// TODO Auto-generated method stub'
		System.out.println("samsung:tv switch off");
		
	}

	@Override
	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("samsung:switch on");
		
	}
	
}

public interface Interfacedemo1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	sony s=new sony();
	s.switchoff();
	s.switchon();
	samsung s1=new samsung();
	s1.switchoff();
	s1.switchon();

	}
}




