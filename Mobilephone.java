 
class mob{
	public void switchoff() {
		System.out.println("mobile switched off");
	}
	public void sendmsg() {
		System.out.println("message sent");
	}
}
	class smartphone extends mob{
	public void playgame() {
		System.out.println("play a game");
	}
	}
	public class Mobilephone {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
smartphone sp=new smartphone();
sp.switchoff();
sp.sendmsg();
sp.playgame();
	}

}

