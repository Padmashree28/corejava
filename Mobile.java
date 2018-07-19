
public class Mobile {
	String brandName;
	double price;
	String color;
	int resolution;

	
	
	public void makeACall()
	{
		System.out.println("Please wait....connecting the call");
	}

	public void receiveACall()
	{
		System.out.println("call received");
	}

	public void sendAText()
	{
		System.out.println("text msg sent");
	}

	public void switchOn()
	{
		System.out.println("phone switched on");
	}
	
	public void switchOff()
	{
		System.out.println("Phone switched off");
	}

	public double getDiscount()
	{
		double discount=0.0;
		if (this.brandName.equals("Samsung"))
			discount=this.price*0.1;
		return discount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.brandName="samsung";
		m.color="black";
		m.price=12345.67;
		m.switchOn();
		m.makeACall();
		m.receiveACall();
		m.sendAText();
		m.switchOff();
		System.out.println("The discount is:" +m.getDiscount());

	}

}
