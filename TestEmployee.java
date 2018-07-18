
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(12,"guru",1000);
		
		double bonus=e.calculatebonus();
		System.out.println(bonus);
		Employee e1=new Employee();
		System.out.println(Employee.getcompanyname());
		e1.companyname="ibm";
		e.getcompanyname();
	}

}
