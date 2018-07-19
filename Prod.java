
public class Prod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int prod1=50;
		 int prod2=500;
		 int prod3=200;
		 if (prod1 > prod2 && prod1 > prod3)
				System.out.println("costliest price of product is:" +prod1);
			else
				if (prod2 > prod1 && prod2 > prod3)	
					System.out.println("costliest price of product is:" +prod2);
			else
				if (prod3 > prod2 && prod3 > prod1)
					System.out.println("costliest price of product is:" +prod3);

	}

}
