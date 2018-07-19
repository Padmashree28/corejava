class cot{
	double price;
}
class chair{
	double price;
}
class diningtable{
	double price;
}



public class Furniture {

	
	public double calculatediscount(cot c) {
		System.out.println("cot discount calculated");
		return c.price*0.1;
	}


	
	public double calculatediscount(chair cc) {
		System.out.println("chair discount calculated");
		return cc.price*0.2;
	}


public double calculatediscount(diningtable dt) {
	System.out.println("dining table discount calculated");
	return dt.price*0.3;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture f=new Furniture();
		cot c=new cot();
		c.price=24567.7;
		chair cc=new chair();
		cc.price=5000.1;
		diningtable dt=new diningtable();
		dt.price=6000.0;
		double cotdiscount=f.calculatediscount(c);
		System.out.println("the discount is:" +cotdiscount);

	}

}


