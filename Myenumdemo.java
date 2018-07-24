
public class Myenumdemo {
	enum weekday{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weekday[] w=weekday.values();
		for(weekday w1:w)
			System.out.println(w1);
		System.out.println(weekday.Tuesday);

	}

}
