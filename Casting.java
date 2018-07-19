class Employee28{
	String a="employee";
	
}
class Hr extends Employee28{
	String b="hr";
}
class Recruiter extends Hr{
	String c="recruiter";
}
class Financier extends Hr{
	String d="financier";
}
class Technical extends Employee28{
	String e="technical";
}
class Javapm extends Technical{
	String f="javapm";
}
class Mainframepm extends Technical{
	String g="mainframepm";
}


public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technical t=new Javapm();
		System.out.println(t.e);
Employee28 e=new Hr();
System.out.println(e.a);
Employee28 e1=new Mainframepm();
Hr h=new Recruiter();

	}

}
