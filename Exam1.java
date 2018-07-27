abstract class Arithmetic{
	int num1,num2,num3;
	abstract int calculate();
	public Arithmetic(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
}
	class Addition extends Arithmetic{

		public Addition(int num1, int num2) {
			super(num1, num2);
			// TODO Auto-generated constructor stub
		}

		@Override
		int calculate() {
			// TODO Auto-generated method stub
			num3=num1+num2;
			
			return num3;
		}
		
	}
	class Subtraction extends Arithmetic{

		public Subtraction(int num1, int num2) {
			super(num1, num2);
			// TODO Auto-generated constructor stub
		}

		@Override
		int calculate() {
			// TODO Auto-generated method stub
			num3=num1-num2;
			return num3;
		}
		
	}
	class Multiplication extends Arithmetic{

		public Multiplication(int num1, int num2) {
			super(num1, num2);
			// TODO Auto-generated constructor stub
		}

		@Override
		int calculate() {
			// TODO Auto-generated method stub
			num3=num1*num2;
			return num3;
		}
		
	}
	class Division extends Arithmetic{

		public Division(int num1, int num2) {
			super(num1, num2);
			// TODO Auto-generated constructor stub
		}

		@Override
		int calculate() {
			// TODO Auto-generated method stub
			num3=num1/num2;
			return num3;
		}
		
	}

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=50;
		int y=5;
		int choice=1;
		Arithmetic[] arr= {new Addition(x,y), new Subtraction(x,y),new Multiplication(x,y),new Division(x,y)};
		arr[choice-1].calculate();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].calculate());
		}
		

	}

}
