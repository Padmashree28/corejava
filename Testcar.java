
public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		car c2=new car();
		car c3=new car();
		car c4=new car();
		car c5=new car();
		c1.setcardetails("Benz", 50.2, 10.1, true);
		c2.setcardetails("audi", 51.1, 20.0, true);
		c3.setcardetails("xuv", 48.6, 50.2, true);
		c4.setcardetails("scorpio", 43.5, 30.3,false);
		c5.setcardetails("jaguar", 50.5, 130.0,true);
		c1.printcardetails();
		c2.printcardetails();
		c3.printcardetails();
		c4.printcardetails();
		c5.printcardetails();
		double arr[]= {c1.price,c2.price,c3.price,c4.price,c5.price};
		double temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
			System.out.println("Costliest car is:" +temp);
		}

	}


