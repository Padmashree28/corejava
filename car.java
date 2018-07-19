
public class car {
	String carName;
	double mileage;
	double price;
	boolean luxurytype;
	public void setcardetails(String carName,double mileage,double price,boolean luxurytype){
		this.carName=carName;
		this.mileage=mileage;
		this.price=price;
		this.luxurytype=luxurytype;
		
	}
	public void printcardetails() {
		System.out.println("the car name is:" +carName);
		System.out.println("the car mileage is:" +mileage);
		System.out.println("the car price is:" +price);
		System.out.println("the car luxurytype is:" +luxurytype);
		

	}

	

}
