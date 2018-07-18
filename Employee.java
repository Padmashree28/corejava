
public class Employee {
private int emp_id;
private String emp_name;
private double emp_sal;
static String companyname="Deloitte";
static String getcompanyname() {
	return companyname;
}

public Employee(int emp_id, String emp_name, double emp_sal) {

	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_sal = emp_sal;
}

public Employee() {
	System.out.println("default constructor");
	this.emp_id = 1;
	this.emp_name = "james";
	this.emp_sal = 11111.1;
	
}

public double calculatebonus() {
	double bonus=0.0;
	if(this.emp_sal <=5000)
		bonus=this.emp_sal*.2;
	else
		bonus=this.emp_sal*.1;
	return bonus;
}
}
