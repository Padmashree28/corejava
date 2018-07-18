
public class Student {
	String name;
	int m1,m2,m3;
	char grade;
	String result;
	public void grade() {
		if(m1>90 && m2>90 &&m3>90) {
			char grade='a';
			System.out.println("grade is:" +grade);
		}
		else if(m1>80 && m1<=89 || m2>80 && m2<=89 || m3>80 && m3<=89) {
		char grade='b';	
		System.out.println("grade is:" +grade);
		
	}
		else {
			char grade='c';
			System.out.println("grade is:" +grade);
			
		}
		
	}
	public void result() {
		if((m1>=35) && (m2>=35) && (m3>=35)){
			System.out.println("Result is pass");
		}
		else {
			System.out.println("Result is fail");
		}
	}
	
	public void total() {
		int total=m1+m2+m3;
		double percentage=total/5*100;
		System.out.println("The percentage is:" +percentage);
		System.out.println("The total is:" +total);
		
	}


}
