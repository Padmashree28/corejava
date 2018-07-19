package pack1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySchool s=new MySchool();
		Trainer t=new Trainer();
		//LabTrainer l=new LabTrainer();
		s.schoolname="gkd";
		s.no_of_stud=1000;
		s.city="coimbatore";
		System.out.println("school name is:" +s.schoolname);
		System.out.println("No.of Students: is:" + s.no_of_stud);
		System.out.println("city:" +s.city);
		t.age=25;
		t.name="ram";
		t.salary=20000;
		System.out.println("trainer name:" +t.name);
		
		
	}

}
